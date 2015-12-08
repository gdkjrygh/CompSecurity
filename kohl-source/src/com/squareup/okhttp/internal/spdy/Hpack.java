// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

final class Hpack
{
    static class HeaderEntry
    {

        private final String name;
        private final String value;

        int length()
        {
            return name.length() + 32 + value.length();
        }



        HeaderEntry(String s, String s1)
        {
            name = s;
            value = s1;
        }
    }

    static class Reader
    {

        private long bufferSize;
        private long bytesLeft;
        private final List emittedHeaders = new ArrayList();
        private final List headerTable;
        private final DataInputStream in;
        private final long maxBufferSize = 4096L;
        private final BitSet referenceSet = new BitSet();

        private String getName(int i)
        {
            return ((HeaderEntry)headerTable.get(i)).name;
        }

        private String getValue(int i)
        {
            return ((HeaderEntry)headerTable.get(i)).value;
        }

        private void insertIntoHeaderTable(int i, HeaderEntry headerentry)
        {
            int k = headerentry.length();
            int j = k;
            if (i != headerTable.size())
            {
                j = k - ((HeaderEntry)headerTable.get(i)).length();
            }
            if ((long)j > 4096L)
            {
                headerTable.clear();
                bufferSize = 0L;
                emittedHeaders.add(headerentry.name);
                emittedHeaders.add(headerentry.value);
                return;
            }
            while (bufferSize + (long)j > 4096L) 
            {
                remove(0);
                i--;
            }
            if (i < 0)
            {
                i = 0;
                headerTable.add(0, headerentry);
            } else
            if (i == headerTable.size())
            {
                headerTable.add(i, headerentry);
            } else
            {
                headerTable.set(i, headerentry);
            }
            bufferSize = bufferSize + (long)j;
            referenceSet.set(i);
        }

        private int readByte()
            throws IOException
        {
            bytesLeft = bytesLeft - 1L;
            return in.readByte() & 0xff;
        }

        private void readIndexedHeader(int i)
        {
            if (referenceSet.get(i))
            {
                referenceSet.clear(i);
                return;
            } else
            {
                referenceSet.set(i);
                return;
            }
        }

        private void readLiteralHeaderWithIncrementalIndexingIndexedName(int i)
            throws IOException
        {
            String s = getName(i);
            String s1 = readString();
            insertIntoHeaderTable(headerTable.size(), new HeaderEntry(s, s1));
        }

        private void readLiteralHeaderWithIncrementalIndexingNewName()
            throws IOException
        {
            String s = readString();
            String s1 = readString();
            insertIntoHeaderTable(headerTable.size(), new HeaderEntry(s, s1));
        }

        private void readLiteralHeaderWithSubstitutionIndexingIndexedName(int i)
            throws IOException
        {
            insertIntoHeaderTable(readInt(readByte(), 255), new HeaderEntry(getName(i), readString()));
        }

        private void readLiteralHeaderWithSubstitutionIndexingNewName()
            throws IOException
        {
            String s = readString();
            insertIntoHeaderTable(readInt(readByte(), 255), new HeaderEntry(s, readString()));
        }

        private void readLiteralHeaderWithoutIndexingIndexedName(int i)
            throws IOException
        {
            String s = getName(i);
            String s1 = readString();
            emittedHeaders.add(s);
            emittedHeaders.add(s1);
        }

        private void readLiteralHeaderWithoutIndexingNewName()
            throws IOException
        {
            String s = readString();
            String s1 = readString();
            emittedHeaders.add(s);
            emittedHeaders.add(s1);
        }

        private void remove(int i)
        {
            bufferSize = bufferSize - (long)((HeaderEntry)headerTable.remove(i)).length();
        }

        public void emitReferenceSet()
        {
            for (int i = referenceSet.nextSetBit(0); i != -1; i = referenceSet.nextSetBit(i + 1))
            {
                emittedHeaders.add(getName(i));
                emittedHeaders.add(getValue(i));
            }

        }

        public List getAndReset()
        {
            ArrayList arraylist = new ArrayList(emittedHeaders);
            emittedHeaders.clear();
            return arraylist;
        }

        public void readHeaders(int i)
            throws IOException
        {
            for (bytesLeft = bytesLeft + (long)i; bytesLeft > 0L;)
            {
                i = readByte();
                if ((i & 0x80) != 0)
                {
                    readIndexedHeader(readInt(i, 127));
                } else
                if (i == 96)
                {
                    readLiteralHeaderWithoutIndexingNewName();
                } else
                if ((i & 0xe0) == 96)
                {
                    readLiteralHeaderWithoutIndexingIndexedName(readInt(i, 31) - 1);
                } else
                if (i == 64)
                {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else
                if ((i & 0xe0) == 64)
                {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(i, 31) - 1);
                } else
                if (i == 0)
                {
                    readLiteralHeaderWithSubstitutionIndexingNewName();
                } else
                if ((i & 0xc0) == 0)
                {
                    readLiteralHeaderWithSubstitutionIndexingIndexedName(readInt(i, 63) - 1);
                } else
                {
                    throw new AssertionError();
                }
            }

        }

        int readInt(int i, int j)
            throws IOException
        {
            i &= j;
            if (i < j)
            {
                return i;
            }
            i = 0;
            do
            {
                int k = readByte();
                if ((k & 0x80) != 0)
                {
                    j += (k & 0x7f) << i;
                    i += 7;
                } else
                {
                    return j + (k << i);
                }
            } while (true);
        }

        public String readString()
            throws IOException
        {
            int i = readInt(readByte(), 255);
            byte abyte0[] = new byte[i];
            bytesLeft = bytesLeft - (long)i;
            in.readFully(abyte0);
            return new String(abyte0, "UTF-8");
        }

        Reader(DataInputStream datainputstream, boolean flag)
        {
            bufferSize = 0L;
            bytesLeft = 0L;
            in = datainputstream;
            if (flag)
            {
                headerTable = new ArrayList(Hpack.INITIAL_SERVER_TO_CLIENT_HEADER_TABLE);
                bufferSize = 1304L;
                return;
            } else
            {
                headerTable = new ArrayList(Hpack.INITIAL_CLIENT_TO_SERVER_HEADER_TABLE);
                bufferSize = 1262L;
                return;
            }
        }
    }

    static class Writer
    {

        private final OutputStream out;

        public void writeHeaders(List list)
            throws IOException
        {
            int i = 0;
            for (int j = list.size(); i < j; i += 2)
            {
                out.write(96);
                writeString((String)list.get(i));
                writeString((String)list.get(i + 1));
            }

        }

        public void writeInt(int i, int j, int k)
            throws IOException
        {
            if (i < j)
            {
                out.write(k | i);
                return;
            }
            out.write(k | j);
            for (i -= j; i >= 128; i >>>= 7)
            {
                out.write(i & 0x7f | 0x80);
            }

            out.write(i);
        }

        public void writeString(String s)
            throws IOException
        {
            s = s.getBytes("UTF-8");
            writeInt(s.length, 255, 0);
            out.write(s);
        }

        Writer(OutputStream outputstream)
        {
            out = outputstream;
        }
    }


    static final List INITIAL_CLIENT_TO_SERVER_HEADER_TABLE = Arrays.asList(new HeaderEntry[] {
        new HeaderEntry(":scheme", "http"), new HeaderEntry(":scheme", "https"), new HeaderEntry(":host", ""), new HeaderEntry(":path", "/"), new HeaderEntry(":method", "GET"), new HeaderEntry("accept", ""), new HeaderEntry("accept-charset", ""), new HeaderEntry("accept-encoding", ""), new HeaderEntry("accept-language", ""), new HeaderEntry("cookie", ""), 
        new HeaderEntry("if-modified-since", ""), new HeaderEntry("user-agent", ""), new HeaderEntry("referer", ""), new HeaderEntry("authorization", ""), new HeaderEntry("allow", ""), new HeaderEntry("cache-control", ""), new HeaderEntry("connection", ""), new HeaderEntry("content-length", ""), new HeaderEntry("content-type", ""), new HeaderEntry("date", ""), 
        new HeaderEntry("expect", ""), new HeaderEntry("from", ""), new HeaderEntry("if-match", ""), new HeaderEntry("if-none-match", ""), new HeaderEntry("if-range", ""), new HeaderEntry("if-unmodified-since", ""), new HeaderEntry("max-forwards", ""), new HeaderEntry("proxy-authorization", ""), new HeaderEntry("range", ""), new HeaderEntry("via", "")
    });
    static final int INITIAL_CLIENT_TO_SERVER_HEADER_TABLE_LENGTH = 1262;
    static final List INITIAL_SERVER_TO_CLIENT_HEADER_TABLE = Arrays.asList(new HeaderEntry[] {
        new HeaderEntry(":status", "200"), new HeaderEntry("age", ""), new HeaderEntry("cache-control", ""), new HeaderEntry("content-length", ""), new HeaderEntry("content-type", ""), new HeaderEntry("date", ""), new HeaderEntry("etag", ""), new HeaderEntry("expires", ""), new HeaderEntry("last-modified", ""), new HeaderEntry("server", ""), 
        new HeaderEntry("set-cookie", ""), new HeaderEntry("vary", ""), new HeaderEntry("via", ""), new HeaderEntry("access-control-allow-origin", ""), new HeaderEntry("accept-ranges", ""), new HeaderEntry("allow", ""), new HeaderEntry("connection", ""), new HeaderEntry("content-disposition", ""), new HeaderEntry("content-encoding", ""), new HeaderEntry("content-language", ""), 
        new HeaderEntry("content-location", ""), new HeaderEntry("content-range", ""), new HeaderEntry("link", ""), new HeaderEntry("location", ""), new HeaderEntry("proxy-authenticate", ""), new HeaderEntry("refresh", ""), new HeaderEntry("retry-after", ""), new HeaderEntry("strict-transport-security", ""), new HeaderEntry("transfer-encoding", ""), new HeaderEntry("www-authenticate", "")
    });
    static final int INITIAL_SERVER_TO_CLIENT_HEADER_TABLE_LENGTH = 1304;
    static final int PREFIX_5_BITS = 31;
    static final int PREFIX_6_BITS = 63;
    static final int PREFIX_7_BITS = 127;
    static final int PREFIX_8_BITS = 255;

    private Hpack()
    {
    }

}

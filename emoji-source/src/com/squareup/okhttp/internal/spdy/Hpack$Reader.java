// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            Hpack

static class bufferSize
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
        return ntry.access._mth000((ntry)headerTable.get(i));
    }

    private String getValue(int i)
    {
        return ntry.access._mth100((ntry)headerTable.get(i));
    }

    private void insertIntoHeaderTable(int i, ntry ntry)
    {
        int k = ntry.length();
        int j = k;
        if (i != headerTable.size())
        {
            j = k - ((ntry)headerTable.get(i)).length();
        }
        if ((long)j > 4096L)
        {
            headerTable.clear();
            bufferSize = 0L;
            emittedHeaders.add(ntry.access._mth000(ntry));
            emittedHeaders.add(ntry.access._mth100(ntry));
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
            headerTable.add(0, ntry);
        } else
        if (i == headerTable.size())
        {
            headerTable.add(i, ntry);
        } else
        {
            headerTable.set(i, ntry);
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
        insertIntoHeaderTable(headerTable.size(), new ntry(s, s1));
    }

    private void readLiteralHeaderWithIncrementalIndexingNewName()
        throws IOException
    {
        String s = readString();
        String s1 = readString();
        insertIntoHeaderTable(headerTable.size(), new ntry(s, s1));
    }

    private void readLiteralHeaderWithSubstitutionIndexingIndexedName(int i)
        throws IOException
    {
        insertIntoHeaderTable(readInt(readByte(), 255), new ntry(getName(i), readString()));
    }

    private void readLiteralHeaderWithSubstitutionIndexingNewName()
        throws IOException
    {
        String s = readString();
        insertIntoHeaderTable(readInt(readByte(), 255), new ntry(s, readString()));
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
        bufferSize = bufferSize - (long)((ntry)headerTable.remove(i)).length();
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

    ntry(DataInputStream datainputstream, boolean flag)
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

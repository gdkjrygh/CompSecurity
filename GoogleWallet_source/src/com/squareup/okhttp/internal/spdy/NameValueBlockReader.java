// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.ForwardingSource;
import okio.InflaterSource;
import okio.Okio;
import okio.Source;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            Header, Spdy3

final class NameValueBlockReader
{

    private int compressedLimit;
    private final InflaterSource inflaterSource;
    private final BufferedSource source;

    public NameValueBlockReader(BufferedSource bufferedsource)
    {
        inflaterSource = new InflaterSource(new ForwardingSource(bufferedsource) , new Inflater() {

            final NameValueBlockReader this$0;

            public final int inflate(byte abyte0[], int i, int j)
                throws DataFormatException
            {
                int l = inflate(abyte0, i, j);
                int k = l;
                if (l == 0)
                {
                    k = l;
                    if (needsDictionary())
                    {
                        setDictionary(Spdy3.DICTIONARY);
                        k = inflate(abyte0, i, j);
                    }
                }
                return k;
            }

            
            {
                this$0 = NameValueBlockReader.this;
                super();
            }
        });
        source = Okio.buffer(inflaterSource);
    }

    private void doneReading()
        throws IOException
    {
        if (compressedLimit > 0)
        {
            inflaterSource.refill();
            if (compressedLimit != 0)
            {
                throw new IOException((new StringBuilder("compressedLimit > 0: ")).append(compressedLimit).toString());
            }
        }
    }

    private ByteString readByteString()
        throws IOException
    {
        int i = source.readInt();
        return source.readByteString(i);
    }

    public final void close()
        throws IOException
    {
        source.close();
    }

    public final List readNameValueBlock(int i)
        throws IOException
    {
        compressedLimit = compressedLimit + i;
        int j = source.readInt();
        if (j < 0)
        {
            throw new IOException((new StringBuilder("numberOfPairs < 0: ")).append(j).toString());
        }
        if (j > 1024)
        {
            throw new IOException((new StringBuilder("numberOfPairs > 1024: ")).append(j).toString());
        }
        ArrayList arraylist = new ArrayList(j);
        for (i = 0; i < j; i++)
        {
            ByteString bytestring = readByteString().toAsciiLowercase();
            ByteString bytestring1 = readByteString();
            if (bytestring.size() == 0)
            {
                throw new IOException("name.size == 0");
            }
            arraylist.add(new Header(bytestring, bytestring1));
        }

        doneReading();
        return arraylist;
    }



/*
    static int access$022(NameValueBlockReader namevalueblockreader, long l)
    {
        int i = (int)((long)namevalueblockreader.compressedLimit - l);
        namevalueblockreader.compressedLimit = i;
        return i;
    }

*/
}

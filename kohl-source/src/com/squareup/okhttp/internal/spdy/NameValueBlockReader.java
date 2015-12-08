// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.internal.Util;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            Spdy3

class NameValueBlockReader
    implements Closeable
{
    static class FillableInflaterInputStream extends InflaterInputStream
    {

        public void fill()
            throws IOException
        {
            super.fill();
        }

        public FillableInflaterInputStream(InputStream inputstream, Inflater inflater)
        {
            super(inputstream, inflater);
        }
    }


    private int compressedLimit;
    private final FillableInflaterInputStream fillableInflaterInputStream;
    private final DataInputStream nameValueBlockIn;

    NameValueBlockReader(final InputStream in)
    {
        fillableInflaterInputStream = new FillableInflaterInputStream(new InputStream() {

            final NameValueBlockReader this$0;
            final InputStream val$in;

            public void close()
                throws IOException
            {
                in.close();
            }

            public int read()
                throws IOException
            {
                return Util.readSingleByte(this);
            }

            public int read(byte abyte0[], int i, int j)
                throws IOException
            {
                j = Math.min(j, compressedLimit);
                i = in.read(abyte0, i, j);
                abyte0 = ((min) (this)).min - abyte0;
                return i;
            }

            
            {
                this$0 = NameValueBlockReader.this;
                in = inputstream;
                super();
            }
        }, new Inflater() {

            final NameValueBlockReader this$0;

            public int inflate(byte abyte0[], int i, int j)
                throws DataFormatException
            {
                int l = super.inflate(abyte0, i, j);
                int k = l;
                if (l == 0)
                {
                    k = l;
                    if (needsDictionary())
                    {
                        setDictionary(Spdy3.DICTIONARY);
                        k = super.inflate(abyte0, i, j);
                    }
                }
                return k;
            }

            
            {
                this$0 = NameValueBlockReader.this;
                super();
            }
        });
        nameValueBlockIn = new DataInputStream(fillableInflaterInputStream);
    }

    private void doneReading()
        throws IOException
    {
        if (compressedLimit != 0)
        {
            fillableInflaterInputStream.fill();
            if (compressedLimit != 0)
            {
                throw new IOException((new StringBuilder()).append("compressedLimit > 0: ").append(compressedLimit).toString());
            }
        }
    }

    private String readString()
        throws DataFormatException, IOException
    {
        int i = nameValueBlockIn.readInt();
        byte abyte0[] = new byte[i];
        Util.readFully(nameValueBlockIn, abyte0);
        return new String(abyte0, 0, i, "UTF-8");
    }

    public void close()
        throws IOException
    {
        nameValueBlockIn.close();
    }

    public List readNameValueBlock(int i)
        throws IOException
    {
        int j;
        compressedLimit = compressedLimit + i;
        try
        {
            j = nameValueBlockIn.readInt();
        }
        catch (DataFormatException dataformatexception)
        {
            throw new IOException(dataformatexception.getMessage());
        }
        if (j >= 0)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        throw new IOException((new StringBuilder()).append("numberOfPairs < 0: ").append(j).toString());
        if (j <= 1024)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        throw new IOException((new StringBuilder()).append("numberOfPairs > 1024: ").append(j).toString());
        ArrayList arraylist = new ArrayList(j * 2);
        i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        String s = readString();
        String s1 = readString();
        if (s.length() == 0)
        {
            throw new IOException("name.length == 0");
        }
        arraylist.add(s);
        arraylist.add(s1);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        doneReading();
        return arraylist;
    }



/*
    static int access$020(NameValueBlockReader namevalueblockreader, int i)
    {
        i = namevalueblockreader.compressedLimit - i;
        namevalueblockreader.compressedLimit = i;
        return i;
    }

*/
}

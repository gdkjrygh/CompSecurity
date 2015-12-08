// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

final class MarkableInputStream extends InputStream
{

    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private long defaultMark;
    private final InputStream in;
    private long limit;
    private long offset;
    private long reset;

    public MarkableInputStream(InputStream inputstream)
    {
        this(inputstream, 4096);
    }

    public MarkableInputStream(InputStream inputstream, int i)
    {
        defaultMark = -1L;
        Object obj = inputstream;
        if (!inputstream.markSupported())
        {
            obj = new BufferedInputStream(inputstream, i);
        }
        in = ((InputStream) (obj));
    }

    private void setLimit(long l)
    {
        if (reset >= offset || offset > limit)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        in.reset();
        in.mark((int)(l - reset));
        skip(reset, offset);
_L1:
        limit = l;
        return;
        try
        {
            reset = offset;
            in.mark((int)(l - offset));
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException((new StringBuilder()).append("Unable to mark: ").append(ioexception).toString());
        }
          goto _L1
    }

    private void skip(long l, long l1)
    {
        do
        {
            long l2;
label0:
            {
label1:
                {
                    if (l < l1)
                    {
                        long l3 = in.skip(l1 - l);
                        l2 = l3;
                        if (l3 != 0L)
                        {
                            break label0;
                        }
                        if (read() != -1)
                        {
                            break label1;
                        }
                    }
                    return;
                }
                l2 = 1L;
            }
            l += l2;
        } while (true);
    }

    public int available()
    {
        return in.available();
    }

    public void close()
    {
        in.close();
    }

    public void mark(int i)
    {
        defaultMark = savePosition(i);
    }

    public boolean markSupported()
    {
        return in.markSupported();
    }

    public int read()
    {
        int i = in.read();
        if (i != -1)
        {
            offset = offset + 1L;
        }
        return i;
    }

    public int read(byte abyte0[])
    {
        int i = in.read(abyte0);
        if (i != -1)
        {
            offset = offset + (long)i;
        }
        return i;
    }

    public int read(byte abyte0[], int i, int j)
    {
        i = in.read(abyte0, i, j);
        if (i != -1)
        {
            offset = offset + (long)i;
        }
        return i;
    }

    public void reset()
    {
        reset(defaultMark);
    }

    public void reset(long l)
    {
        if (offset > limit || l < reset)
        {
            throw new IOException("Cannot reset");
        } else
        {
            in.reset();
            skip(reset, l);
            offset = l;
            return;
        }
    }

    public long savePosition(int i)
    {
        long l = offset + (long)i;
        if (limit < l)
        {
            setLimit(l);
        }
        return offset;
    }

    public long skip(long l)
    {
        l = in.skip(l);
        offset = offset + l;
        return l;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.facebook.internal:
//            FileLruCache

private static final class output extends InputStream
{

    final InputStream input;
    final OutputStream output;

    public int available()
        throws IOException
    {
        return input.available();
    }

    public void close()
        throws IOException
    {
        input.close();
        output.close();
        return;
        Exception exception;
        exception;
        output.close();
        throw exception;
    }

    public void mark(int i)
    {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported()
    {
        return false;
    }

    public int read()
        throws IOException
    {
        int i = input.read();
        if (i >= 0)
        {
            output.write(i);
        }
        return i;
    }

    public int read(byte abyte0[])
        throws IOException
    {
        int i = input.read(abyte0);
        if (i > 0)
        {
            output.write(abyte0, 0, i);
        }
        return i;
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        j = input.read(abyte0, i, j);
        if (j > 0)
        {
            output.write(abyte0, i, j);
        }
        return j;
    }

    public void reset()
    {
        this;
        JVM INSTR monitorenter ;
        throw new UnsupportedOperationException();
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public long skip(long l)
        throws IOException
    {
        byte abyte0[] = new byte[1024];
        long l1 = 0L;
        do
        {
            int i;
label0:
            {
                if (l1 < l)
                {
                    i = read(abyte0, 0, (int)Math.min(l - l1, abyte0.length));
                    if (i >= 0)
                    {
                        break label0;
                    }
                }
                return l1;
            }
            l1 += i;
        } while (true);
    }

    (InputStream inputstream, OutputStream outputstream)
    {
        input = inputstream;
        output = outputstream;
    }
}

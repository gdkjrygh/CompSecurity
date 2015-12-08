// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar.internal;

import java.io.InputStream;
import java.io.OutputStream;

final class h extends InputStream
{

    final InputStream a;
    final OutputStream b;

    h(InputStream inputstream, OutputStream outputstream)
    {
        a = inputstream;
        b = outputstream;
    }

    public final int available()
    {
        return a.available();
    }

    public final void close()
    {
        a.close();
        b.close();
        return;
        Exception exception;
        exception;
        b.close();
        throw exception;
    }

    public final void mark(int i)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean markSupported()
    {
        return false;
    }

    public final int read()
    {
        int i = a.read();
        if (i >= 0)
        {
            b.write(i);
        }
        return i;
    }

    public final int read(byte abyte0[])
    {
        int i = a.read(abyte0);
        if (i > 0)
        {
            b.write(abyte0, 0, i);
        }
        return i;
    }

    public final int read(byte abyte0[], int i, int j)
    {
        j = a.read(abyte0, i, j);
        if (j > 0)
        {
            b.write(abyte0, i, j);
        }
        return j;
    }

    public final void reset()
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

    public final long skip(long l)
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
                    i = read(abyte0, 0, (int)Math.min(l - l1, 1024L));
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
}

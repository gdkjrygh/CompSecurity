// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley.toolbox;

import java.io.ByteArrayOutputStream;

// Referenced classes of package com.mopub.volley.toolbox:
//            ByteArrayPool

public class PoolingByteArrayOutputStream extends ByteArrayOutputStream
{

    private final ByteArrayPool a;

    public PoolingByteArrayOutputStream(ByteArrayPool bytearraypool)
    {
        this(bytearraypool, 256);
    }

    public PoolingByteArrayOutputStream(ByteArrayPool bytearraypool, int i)
    {
        a = bytearraypool;
        buf = a.getBuf(Math.max(i, 256));
    }

    private void a(int i)
    {
        if (count + i <= buf.length)
        {
            return;
        } else
        {
            byte abyte0[] = a.getBuf((count + i) * 2);
            System.arraycopy(buf, 0, abyte0, 0, count);
            a.returnBuf(buf);
            buf = abyte0;
            return;
        }
    }

    public void close()
    {
        a.returnBuf(buf);
        buf = null;
        super.close();
    }

    public void finalize()
    {
        a.returnBuf(buf);
    }

    public void write(int i)
    {
        this;
        JVM INSTR monitorenter ;
        a(1);
        super.write(i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void write(byte abyte0[], int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        a(j);
        super.write(abyte0, i, j);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }
}

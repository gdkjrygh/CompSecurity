// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package com.android.volley.toolbox:
//            ByteArrayPool

public class PoolingByteArrayOutputStream extends ByteArrayOutputStream
{

    private static final int DEFAULT_SIZE = 256;
    private final ByteArrayPool mPool;

    public PoolingByteArrayOutputStream(ByteArrayPool bytearraypool)
    {
        this(bytearraypool, 256);
    }

    public PoolingByteArrayOutputStream(ByteArrayPool bytearraypool, int i)
    {
        mPool = bytearraypool;
        buf = mPool.getBuf(Math.max(i, 256));
    }

    private void expand(int i)
    {
        if (count + i <= buf.length)
        {
            return;
        } else
        {
            byte abyte0[] = mPool.getBuf((count + i) * 2);
            System.arraycopy(buf, 0, abyte0, 0, count);
            mPool.returnBuf(buf);
            buf = abyte0;
            return;
        }
    }

    public void close()
        throws IOException
    {
        mPool.returnBuf(buf);
        buf = null;
        super.close();
    }

    public void finalize()
    {
        mPool.returnBuf(buf);
    }

    public void write(int i)
    {
        this;
        JVM INSTR monitorenter ;
        expand(1);
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
        expand(j);
        super.write(abyte0, i, j);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }
}

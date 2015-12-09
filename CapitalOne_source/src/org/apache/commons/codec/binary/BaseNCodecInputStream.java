// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.binary;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package org.apache.commons.codec.binary:
//            BaseNCodec

public class BaseNCodecInputStream extends FilterInputStream
{

    private final BaseNCodec baseNCodec;
    private final BaseNCodec.Context context = new BaseNCodec.Context();
    private final boolean doEncode;
    private final byte singleByte[] = new byte[1];

    protected BaseNCodecInputStream(InputStream inputstream, BaseNCodec basencodec, boolean flag)
    {
        super(inputstream);
        doEncode = flag;
        baseNCodec = basencodec;
    }

    public int available()
        throws IOException
    {
        return !context.eof ? 1 : 0;
    }

    public void mark(int i)
    {
        this;
        JVM INSTR monitorenter ;
    }

    public boolean markSupported()
    {
        return false;
    }

    public int read()
        throws IOException
    {
        int i;
        for (i = read(singleByte, 0, 1); i == 0; i = read(singleByte, 0, 1)) { }
        if (i > 0)
        {
            byte byte0 = singleByte[0];
            int j = byte0;
            if (byte0 < 0)
            {
                j = byte0 + 256;
            }
            return j;
        } else
        {
            return -1;
        }
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        if (abyte0 == null)
        {
            throw new NullPointerException();
        }
        if (i < 0 || j < 0)
        {
            throw new IndexOutOfBoundsException();
        }
        if (i > abyte0.length || i + j > abyte0.length)
        {
            throw new IndexOutOfBoundsException();
        }
        if (j != 0) goto _L2; else goto _L1
_L1:
        int l = 0;
_L4:
        return l;
_L2:
        int k = 0;
        do
        {
            l = k;
            if (k != 0)
            {
                continue;
            }
            if (!baseNCodec.hasData(context))
            {
                byte abyte1[];
                if (doEncode)
                {
                    k = 4096;
                } else
                {
                    k = 8192;
                }
                abyte1 = new byte[k];
                k = in.read(abyte1);
                if (doEncode)
                {
                    baseNCodec.encode(abyte1, 0, k, context);
                } else
                {
                    baseNCodec.decode(abyte1, 0, k, context);
                }
            }
            k = baseNCodec.readResults(abyte0, i, j, context);
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void reset()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        throw new IOException("mark/reset not supported");
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public long skip(long l)
        throws IOException
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Negative skip length: ").append(l).toString());
        }
        byte abyte0[] = new byte[512];
        long l1 = l;
        do
        {
            int i;
label0:
            {
                if (l1 > 0L)
                {
                    i = read(abyte0, 0, (int)Math.min(abyte0.length, l1));
                    if (i != -1)
                    {
                        break label0;
                    }
                }
                return l - l1;
            }
            l1 -= i;
        } while (true);
    }
}

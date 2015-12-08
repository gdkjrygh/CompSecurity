// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.util.org.apache.commons.codec.binary;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package ezvcard.util.org.apache.commons.codec.binary:
//            BaseNCodec

public class BaseNCodecInputStream extends FilterInputStream
{

    private final BaseNCodec baseNCodec;
    private final boolean doEncode;
    private final byte singleByte[] = new byte[1];

    protected BaseNCodecInputStream(InputStream inputstream, BaseNCodec basencodec, boolean flag)
    {
        super(inputstream);
        doEncode = flag;
        baseNCodec = basencodec;
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
            if (singleByte[0] < 0)
            {
                return singleByte[0] + 256;
            } else
            {
                return singleByte[0];
            }
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
            if (!baseNCodec.hasData())
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
                    baseNCodec.encode(abyte1, 0, k);
                } else
                {
                    baseNCodec.decode(abyte1, 0, k);
                }
            }
            k = baseNCodec.readResults(abyte0, i, j);
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}

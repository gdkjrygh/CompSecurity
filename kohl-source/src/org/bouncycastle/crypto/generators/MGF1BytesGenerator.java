// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.MGFParameters;

public class MGF1BytesGenerator
    implements DerivationFunction
{

    private Digest digest;
    private int hLen;
    private byte seed[];

    public MGF1BytesGenerator(Digest digest1)
    {
        digest = digest1;
        hLen = digest1.getDigestSize();
    }

    private void ItoOSP(int i, byte abyte0[])
    {
        abyte0[0] = (byte)(i >>> 24);
        abyte0[1] = (byte)(i >>> 16);
        abyte0[2] = (byte)(i >>> 8);
        abyte0[3] = (byte)(i >>> 0);
    }

    public int generateBytes(byte abyte0[], int i, int j)
        throws DataLengthException, IllegalArgumentException
    {
        if (abyte0.length - j < i)
        {
            throw new DataLengthException("output buffer too small");
        }
        byte abyte1[] = new byte[hLen];
        byte abyte2[] = new byte[4];
        digest.reset();
        int l;
        if (j > hLen)
        {
            int k = 0;
            do
            {
                ItoOSP(k, abyte2);
                digest.update(seed, 0, seed.length);
                digest.update(abyte2, 0, abyte2.length);
                digest.doFinal(abyte1, 0);
                System.arraycopy(abyte1, 0, abyte0, hLen * k + i, hLen);
                l = k + 1;
                k = l;
            } while (l < j / hLen);
        } else
        {
            l = 0;
        }
        if (hLen * l < j)
        {
            ItoOSP(l, abyte2);
            digest.update(seed, 0, seed.length);
            digest.update(abyte2, 0, abyte2.length);
            digest.doFinal(abyte1, 0);
            System.arraycopy(abyte1, 0, abyte0, hLen * l + i, j - l * hLen);
        }
        return j;
    }

    public Digest getDigest()
    {
        return digest;
    }

    public void init(DerivationParameters derivationparameters)
    {
        if (!(derivationparameters instanceof MGFParameters))
        {
            throw new IllegalArgumentException("MGF parameters required for MGF1Generator");
        } else
        {
            seed = ((MGFParameters)derivationparameters).getSeed();
            return;
        }
    }
}

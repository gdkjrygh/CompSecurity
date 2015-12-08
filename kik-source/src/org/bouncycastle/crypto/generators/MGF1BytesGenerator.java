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

    private Digest a;
    private byte b[];
    private int c;

    public MGF1BytesGenerator(Digest digest)
    {
        a = digest;
        c = digest.getDigestSize();
    }

    private void ItoOSP(int i, byte abyte0[])
    {
        abyte0[0] = (byte)(i >>> 24);
        abyte0[1] = (byte)(i >>> 16);
        abyte0[2] = (byte)(i >>> 8);
        abyte0[3] = (byte)(i >>> 0);
    }

    public int generateBytes(byte abyte0[], int i, int j)
    {
        if (abyte0.length - j < i)
        {
            throw new DataLengthException("output buffer too small");
        }
        byte abyte1[] = new byte[c];
        byte abyte2[] = new byte[4];
        a.reset();
        int l;
        if (j > c)
        {
            int k = 0;
            do
            {
                ItoOSP(k, abyte2);
                a.update(b, 0, b.length);
                a.update(abyte2, 0, 4);
                a.doFinal(abyte1, 0);
                System.arraycopy(abyte1, 0, abyte0, c * k + i, c);
                l = k + 1;
                k = l;
            } while (l < j / c);
        } else
        {
            l = 0;
        }
        if (c * l < j)
        {
            ItoOSP(l, abyte2);
            a.update(b, 0, b.length);
            a.update(abyte2, 0, 4);
            a.doFinal(abyte1, 0);
            System.arraycopy(abyte1, 0, abyte0, c * l + i, j - l * c);
        }
        return j;
    }

    public Digest getDigest()
    {
        return a;
    }

    public void init(DerivationParameters derivationparameters)
    {
        if (!(derivationparameters instanceof MGFParameters))
        {
            throw new IllegalArgumentException("MGF parameters required for MGF1Generator");
        } else
        {
            b = ((MGFParameters)derivationparameters).getSeed();
            return;
        }
    }
}

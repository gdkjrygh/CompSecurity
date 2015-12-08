// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

public class PKCS12ParametersGenerator extends PBEParametersGenerator
{

    private Digest d;
    private int e;
    private int f;

    public PKCS12ParametersGenerator(Digest digest)
    {
        d = digest;
        if (digest instanceof ExtendedDigest)
        {
            e = digest.getDigestSize();
            f = ((ExtendedDigest)digest).getByteLength();
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Digest ")).append(digest.getAlgorithmName()).append(" unsupported").toString());
        }
    }

    private void adjust(byte abyte0[], int i, byte abyte1[])
    {
        int j = (abyte1[abyte1.length - 1] & 0xff) + (abyte0[(abyte1.length + i) - 1] & 0xff) + 1;
        abyte0[(abyte1.length + i) - 1] = (byte)j;
        int l = j >>> 8;
        for (int k = abyte1.length - 2; k >= 0; k--)
        {
            l += (abyte1[k] & 0xff) + (abyte0[i + k] & 0xff);
            abyte0[i + k] = (byte)l;
            l >>>= 8;
        }

    }

    private byte[] generateDerivedKey(int i, int j)
    {
        byte abyte2[] = new byte[f];
        byte abyte3[] = new byte[j];
        for (int k = 0; k != abyte2.length; k++)
        {
            abyte2[k] = (byte)i;
        }

        byte abyte0[];
        byte abyte1[];
        if (b != null && b.length != 0)
        {
            abyte0 = new byte[f * (((b.length + f) - 1) / f)];
            for (i = 0; i != abyte0.length; i++)
            {
                abyte0[i] = b[i % b.length];
            }

        } else
        {
            abyte0 = new byte[0];
        }
        byte abyte4[];
        int k1;
        if (a != null && a.length != 0)
        {
            abyte1 = new byte[f * (((a.length + f) - 1) / f)];
            for (i = 0; i != abyte1.length; i++)
            {
                abyte1[i] = a[i % a.length];
            }

        } else
        {
            abyte1 = new byte[0];
        }
        abyte4 = new byte[abyte0.length + abyte1.length];
        System.arraycopy(abyte0, 0, abyte4, 0, abyte0.length);
        System.arraycopy(abyte1, 0, abyte4, abyte0.length, abyte1.length);
        abyte0 = new byte[f];
        k1 = ((e + j) - 1) / e;
        i = 1;
        while (i <= k1) 
        {
            abyte1 = new byte[e];
            d.update(abyte2, 0, abyte2.length);
            d.update(abyte4, 0, abyte4.length);
            d.doFinal(abyte1, 0);
            for (int l = 1; l != c; l++)
            {
                d.update(abyte1, 0, abyte1.length);
                d.doFinal(abyte1, 0);
            }

            for (int i1 = 0; i1 != abyte0.length; i1++)
            {
                abyte0[i1] = abyte1[i1 % abyte1.length];
            }

            for (int j1 = 0; j1 != abyte4.length / f; j1++)
            {
                adjust(abyte4, f * j1, abyte0);
            }

            if (i == k1)
            {
                System.arraycopy(abyte1, 0, abyte3, (i - 1) * e, j - (i - 1) * e);
            } else
            {
                System.arraycopy(abyte1, 0, abyte3, (i - 1) * e, abyte1.length);
            }
            i++;
        }
        return abyte3;
    }

    public CipherParameters generateDerivedMacParameters(int i)
    {
        i /= 8;
        return new KeyParameter(generateDerivedKey(3, i), 0, i);
    }

    public CipherParameters generateDerivedParameters(int i)
    {
        i /= 8;
        return new KeyParameter(generateDerivedKey(1, i), 0, i);
    }

    public CipherParameters generateDerivedParameters(int i, int j)
    {
        i /= 8;
        j /= 8;
        byte abyte0[] = generateDerivedKey(1, i);
        byte abyte1[] = generateDerivedKey(2, j);
        return new ParametersWithIV(new KeyParameter(abyte0, 0, i), abyte1, 0, j);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.ISO18033KDFParameters;
import org.bouncycastle.crypto.params.KDFParameters;

public class BaseKDFBytesGenerator
    implements DerivationFunction
{

    private int a;
    private Digest b;
    private byte c[];
    private byte d[];

    protected BaseKDFBytesGenerator(int i, Digest digest)
    {
        a = i;
        b = digest;
    }

    public int generateBytes(byte abyte0[], int i, int j)
    {
        if (abyte0.length - j < i)
        {
            throw new DataLengthException("output buffer too small");
        }
        long l1 = j;
        int j1 = b.getDigestSize();
        if (l1 > 0x1ffffffffL)
        {
            throw new IllegalArgumentException("Output length too large");
        }
        int k1 = (int)(((l1 + (long)j1) - 1L) / (long)j1);
        byte abyte1[] = new byte[b.getDigestSize()];
        int i1 = a;
        boolean flag = false;
        int l = i;
        int k = j;
        j = i1;
        i = ((flag) ? 1 : 0);
        while (i < k1) 
        {
            b.update(c, 0, c.length);
            b.update((byte)(j >> 24));
            b.update((byte)(j >> 16));
            b.update((byte)(j >> 8));
            b.update((byte)j);
            if (d != null)
            {
                b.update(d, 0, d.length);
            }
            b.doFinal(abyte1, 0);
            if (k > j1)
            {
                System.arraycopy(abyte1, 0, abyte0, l, j1);
                l += j1;
                k -= j1;
            } else
            {
                System.arraycopy(abyte1, 0, abyte0, l, k);
            }
            j++;
            i++;
        }
        b.reset();
        return k;
    }

    public Digest getDigest()
    {
        return b;
    }

    public void init(DerivationParameters derivationparameters)
    {
        if (derivationparameters instanceof KDFParameters)
        {
            derivationparameters = (KDFParameters)derivationparameters;
            c = derivationparameters.getSharedSecret();
            d = derivationparameters.getIV();
            return;
        }
        if (derivationparameters instanceof ISO18033KDFParameters)
        {
            c = ((ISO18033KDFParameters)derivationparameters).getSeed();
            d = null;
            return;
        } else
        {
            throw new IllegalArgumentException("KDF parameters required for KDF2Generator");
        }
    }
}

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

    private int counterStart;
    private Digest digest;
    private byte iv[];
    private byte shared[];

    protected BaseKDFBytesGenerator(int i, Digest digest1)
    {
        counterStart = i;
        digest = digest1;
    }

    public int generateBytes(byte abyte0[], int i, int j)
        throws DataLengthException, IllegalArgumentException
    {
        if (abyte0.length - j < i)
        {
            throw new DataLengthException("output buffer too small");
        }
        long l1 = j;
        int j1 = digest.getDigestSize();
        if (l1 > 0x1ffffffffL)
        {
            throw new IllegalArgumentException("Output length too large");
        }
        int k1 = (int)(((l1 + (long)j1) - 1L) / (long)j1);
        byte abyte1[] = new byte[digest.getDigestSize()];
        int i1 = counterStart;
        boolean flag = false;
        int l = i;
        int k = j;
        j = i1;
        i = ((flag) ? 1 : 0);
        while (i < k1) 
        {
            digest.update(shared, 0, shared.length);
            digest.update((byte)(j >> 24));
            digest.update((byte)(j >> 16));
            digest.update((byte)(j >> 8));
            digest.update((byte)j);
            if (iv != null)
            {
                digest.update(iv, 0, iv.length);
            }
            digest.doFinal(abyte1, 0);
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
        digest.reset();
        return k;
    }

    public Digest getDigest()
    {
        return digest;
    }

    public void init(DerivationParameters derivationparameters)
    {
        if (derivationparameters instanceof KDFParameters)
        {
            derivationparameters = (KDFParameters)derivationparameters;
            shared = derivationparameters.getSharedSecret();
            iv = derivationparameters.getIV();
            return;
        }
        if (derivationparameters instanceof ISO18033KDFParameters)
        {
            shared = ((ISO18033KDFParameters)derivationparameters).getSeed();
            iv = null;
            return;
        } else
        {
            throw new IllegalArgumentException("KDF parameters required for KDF2Generator");
        }
    }
}

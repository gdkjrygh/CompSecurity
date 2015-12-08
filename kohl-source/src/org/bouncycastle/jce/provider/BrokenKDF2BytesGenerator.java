// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.KDFParameters;

public class BrokenKDF2BytesGenerator
    implements DerivationFunction
{

    private Digest digest;
    private byte iv[];
    private byte shared[];

    public BrokenKDF2BytesGenerator(Digest digest1)
    {
        digest = digest1;
    }

    public int generateBytes(byte abyte0[], int i, int j)
        throws DataLengthException, IllegalArgumentException
    {
        if (abyte0.length - j < i)
        {
            throw new DataLengthException("output buffer too small");
        }
        long l1 = j * 8;
        if (l1 > (long)(digest.getDigestSize() * 8) * 29L)
        {
            new IllegalArgumentException("Output length to large");
        }
        int l = (int)(l1 / (long)digest.getDigestSize());
        byte abyte1[] = new byte[digest.getDigestSize()];
        boolean flag = true;
        int k = i;
        i = ((flag) ? 1 : 0);
        while (i <= l) 
        {
            digest.update(shared, 0, shared.length);
            digest.update((byte)(i & 0xff));
            digest.update((byte)(i >> 8 & 0xff));
            digest.update((byte)(i >> 16 & 0xff));
            digest.update((byte)(i >> 24 & 0xff));
            digest.update(iv, 0, iv.length);
            digest.doFinal(abyte1, 0);
            if (j - k > abyte1.length)
            {
                System.arraycopy(abyte1, 0, abyte0, k, abyte1.length);
                k += abyte1.length;
            } else
            {
                System.arraycopy(abyte1, 0, abyte0, k, j - k);
            }
            i++;
        }
        digest.reset();
        return j;
    }

    public Digest getDigest()
    {
        return digest;
    }

    public void init(DerivationParameters derivationparameters)
    {
        if (!(derivationparameters instanceof KDFParameters))
        {
            throw new IllegalArgumentException("KDF parameters required for KDF2Generator");
        } else
        {
            derivationparameters = (KDFParameters)derivationparameters;
            shared = derivationparameters.getSharedSecret();
            iv = derivationparameters.getIV();
            return;
        }
    }
}

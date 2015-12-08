// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

public class PKCS5S1ParametersGenerator extends PBEParametersGenerator
{

    private Digest d;

    public PKCS5S1ParametersGenerator(Digest digest)
    {
        d = digest;
    }

    private byte[] generateDerivedKey()
    {
        byte abyte0[] = new byte[d.getDigestSize()];
        d.update(a, 0, a.length);
        d.update(b, 0, b.length);
        d.doFinal(abyte0, 0);
        for (int i = 1; i < c; i++)
        {
            d.update(abyte0, 0, abyte0.length);
            d.doFinal(abyte0, 0);
        }

        return abyte0;
    }

    public CipherParameters generateDerivedMacParameters(int i)
    {
        return generateDerivedParameters(i);
    }

    public CipherParameters generateDerivedParameters(int i)
    {
        i /= 8;
        if (i > d.getDigestSize())
        {
            throw new IllegalArgumentException((new StringBuilder("Can't generate a derived key ")).append(i).append(" bytes long.").toString());
        } else
        {
            return new KeyParameter(generateDerivedKey(), 0, i);
        }
    }

    public CipherParameters generateDerivedParameters(int i, int j)
    {
        i /= 8;
        j /= 8;
        if (i + j > d.getDigestSize())
        {
            throw new IllegalArgumentException((new StringBuilder("Can't generate a derived key ")).append(i + j).append(" bytes long.").toString());
        } else
        {
            byte abyte0[] = generateDerivedKey();
            return new ParametersWithIV(new KeyParameter(abyte0, 0, i), abyte0, i, j);
        }
    }
}

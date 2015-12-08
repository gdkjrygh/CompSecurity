// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class RSAKeyGenerationParameters extends KeyGenerationParameters
{

    private int certainty;
    private BigInteger publicExponent;

    public RSAKeyGenerationParameters(BigInteger biginteger, SecureRandom securerandom, int i, int j)
    {
        super(securerandom, i);
        if (i < 12)
        {
            throw new IllegalArgumentException("key strength too small");
        }
        if (!biginteger.testBit(0))
        {
            throw new IllegalArgumentException("public exponent cannot be even");
        } else
        {
            publicExponent = biginteger;
            certainty = j;
            return;
        }
    }

    public int getCertainty()
    {
        return certainty;
    }

    public BigInteger getPublicExponent()
    {
        return publicExponent;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyGenerationParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECPoint;

public class ECKeyPairGenerator
    implements AsymmetricCipherKeyPairGenerator, ECConstants
{

    ECDomainParameters params;
    SecureRandom random;

    public ECKeyPairGenerator()
    {
    }

    public AsymmetricCipherKeyPair generateKeyPair()
    {
        BigInteger biginteger = params.getN();
        int i = biginteger.bitLength();
        BigInteger biginteger1;
        do
        {
            biginteger1 = new BigInteger(i, random);
        } while (biginteger1.equals(ZERO) || biginteger1.compareTo(biginteger) >= 0);
        return new AsymmetricCipherKeyPair(new ECPublicKeyParameters(params.getG().multiply(biginteger1), params), new ECPrivateKeyParameters(biginteger1, params));
    }

    public void init(KeyGenerationParameters keygenerationparameters)
    {
        keygenerationparameters = (ECKeyGenerationParameters)keygenerationparameters;
        random = keygenerationparameters.getRandom();
        params = keygenerationparameters.getDomainParameters();
    }
}

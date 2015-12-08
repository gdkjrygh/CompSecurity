// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.GOST3410KeyGenerationParameters;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.crypto.params.GOST3410PrivateKeyParameters;
import org.bouncycastle.crypto.params.GOST3410PublicKeyParameters;

public class GOST3410KeyPairGenerator
    implements AsymmetricCipherKeyPairGenerator
{

    private static final BigInteger ZERO = BigInteger.valueOf(0L);
    private GOST3410KeyGenerationParameters param;

    public GOST3410KeyPairGenerator()
    {
    }

    public AsymmetricCipherKeyPair generateKeyPair()
    {
        GOST3410Parameters gost3410parameters = param.getParameters();
        java.security.SecureRandom securerandom = param.getRandom();
        BigInteger biginteger = gost3410parameters.getQ();
        BigInteger biginteger1 = gost3410parameters.getP();
        BigInteger biginteger2 = gost3410parameters.getA();
        BigInteger biginteger3;
        do
        {
            biginteger3 = new BigInteger(256, securerandom);
        } while (biginteger3.equals(ZERO) || biginteger3.compareTo(biginteger) >= 0);
        return new AsymmetricCipherKeyPair(new GOST3410PublicKeyParameters(biginteger2.modPow(biginteger3, biginteger1), gost3410parameters), new GOST3410PrivateKeyParameters(biginteger3, gost3410parameters));
    }

    public void init(KeyGenerationParameters keygenerationparameters)
    {
        param = (GOST3410KeyGenerationParameters)keygenerationparameters;
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.generators;

import java.math.BigInteger;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.GOST3410KeyGenerationParameters;
import org.spongycastle.crypto.params.GOST3410Parameters;
import org.spongycastle.crypto.params.GOST3410PrivateKeyParameters;
import org.spongycastle.crypto.params.GOST3410PublicKeyParameters;

public class GOST3410KeyPairGenerator
    implements AsymmetricCipherKeyPairGenerator
{

    private static final BigInteger a = BigInteger.valueOf(0L);
    private GOST3410KeyGenerationParameters b;

    public GOST3410KeyPairGenerator()
    {
    }

    public final AsymmetricCipherKeyPair a()
    {
        GOST3410Parameters gost3410parameters = b.c();
        java.security.SecureRandom securerandom = b.a();
        BigInteger biginteger = gost3410parameters.b();
        BigInteger biginteger1 = gost3410parameters.a();
        BigInteger biginteger2 = gost3410parameters.c();
        BigInteger biginteger3;
        do
        {
            biginteger3 = new BigInteger(256, securerandom);
        } while (biginteger3.equals(a) || biginteger3.compareTo(biginteger) >= 0);
        return new AsymmetricCipherKeyPair(new GOST3410PublicKeyParameters(biginteger2.modPow(biginteger3, biginteger1), gost3410parameters), new GOST3410PrivateKeyParameters(biginteger3, gost3410parameters));
    }

    public final void a(KeyGenerationParameters keygenerationparameters)
    {
        b = (GOST3410KeyGenerationParameters)keygenerationparameters;
    }

}

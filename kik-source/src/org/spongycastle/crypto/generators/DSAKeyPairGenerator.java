// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.generators;

import java.math.BigInteger;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.DSAKeyGenerationParameters;
import org.spongycastle.crypto.params.DSAParameters;
import org.spongycastle.crypto.params.DSAPrivateKeyParameters;
import org.spongycastle.crypto.params.DSAPublicKeyParameters;
import org.spongycastle.util.BigIntegers;

public class DSAKeyPairGenerator
    implements AsymmetricCipherKeyPairGenerator
{

    private static final BigInteger a = BigInteger.valueOf(1L);
    private DSAKeyGenerationParameters b;

    public DSAKeyPairGenerator()
    {
    }

    public final AsymmetricCipherKeyPair a()
    {
        DSAParameters dsaparameters = b.c();
        BigInteger biginteger = dsaparameters.b();
        Object obj = b.a();
        biginteger = BigIntegers.a(a, biginteger.subtract(a), ((java.security.SecureRandom) (obj)));
        obj = dsaparameters.a();
        return new AsymmetricCipherKeyPair(new DSAPublicKeyParameters(dsaparameters.c().modPow(biginteger, ((BigInteger) (obj))), dsaparameters), new DSAPrivateKeyParameters(biginteger, dsaparameters));
    }

    public final void a(KeyGenerationParameters keygenerationparameters)
    {
        b = (DSAKeyGenerationParameters)keygenerationparameters;
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECKeyGenerationParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.math.ec.ECConstants;
import org.spongycastle.math.ec.ECPoint;

public class ECKeyPairGenerator
    implements AsymmetricCipherKeyPairGenerator, ECConstants
{

    ECDomainParameters a;
    SecureRandom b;

    public ECKeyPairGenerator()
    {
    }

    public final AsymmetricCipherKeyPair a()
    {
        BigInteger biginteger = a.c();
        int i = biginteger.bitLength();
        BigInteger biginteger1;
        do
        {
            biginteger1 = new BigInteger(i, b);
        } while (biginteger1.equals(f) || biginteger1.compareTo(biginteger) >= 0);
        return new AsymmetricCipherKeyPair(new ECPublicKeyParameters(a.b().a(biginteger1), a), new ECPrivateKeyParameters(biginteger1, a));
    }

    public final void a(KeyGenerationParameters keygenerationparameters)
    {
        keygenerationparameters = (ECKeyGenerationParameters)keygenerationparameters;
        b = keygenerationparameters.a();
        a = keygenerationparameters.c();
    }
}

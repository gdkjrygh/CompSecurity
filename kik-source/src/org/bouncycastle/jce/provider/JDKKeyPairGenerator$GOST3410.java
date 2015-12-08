// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.generators.GOST3410KeyPairGenerator;
import org.bouncycastle.crypto.params.GOST3410KeyGenerationParameters;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.crypto.params.GOST3410PrivateKeyParameters;
import org.bouncycastle.crypto.params.GOST3410PublicKeyParameters;
import org.bouncycastle.jce.spec.GOST3410ParameterSpec;
import org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JDKKeyPairGenerator, JDKGOST3410PublicKey, JDKGOST3410PrivateKey

public static class f extends JDKKeyPairGenerator
{

    GOST3410KeyGenerationParameters a;
    GOST3410KeyPairGenerator b;
    GOST3410ParameterSpec c;
    int d;
    SecureRandom e;
    boolean f;

    private void a(GOST3410ParameterSpec gost3410parameterspec, SecureRandom securerandom)
    {
        GOST3410PublicKeyParameterSetSpec gost3410publickeyparametersetspec = gost3410parameterspec.d();
        a = new GOST3410KeyGenerationParameters(securerandom, new GOST3410Parameters(gost3410publickeyparametersetspec.a(), gost3410publickeyparametersetspec.b(), gost3410publickeyparametersetspec.c()));
        b.init(a);
        f = true;
        c = gost3410parameterspec;
    }

    public KeyPair generateKeyPair()
    {
        if (!f)
        {
            a(new GOST3410ParameterSpec(CryptoProObjectIdentifiers.h.e()), new SecureRandom());
        }
        Object obj = b.generateKeyPair();
        GOST3410PublicKeyParameters gost3410publickeyparameters = (GOST3410PublicKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPublic();
        obj = (GOST3410PrivateKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPrivate();
        return new KeyPair(new JDKGOST3410PublicKey(gost3410publickeyparameters, c), new JDKGOST3410PrivateKey(((GOST3410PrivateKeyParameters) (obj)), c));
    }

    public void initialize(int i, SecureRandom securerandom)
    {
        d = i;
        e = securerandom;
    }

    public void initialize(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        if (!(algorithmparameterspec instanceof GOST3410ParameterSpec))
        {
            throw new InvalidAlgorithmParameterException("parameter object not a GOST3410ParameterSpec");
        } else
        {
            a((GOST3410ParameterSpec)algorithmparameterspec, securerandom);
            return;
        }
    }

    public ()
    {
        super("GOST3410");
        b = new GOST3410KeyPairGenerator();
        d = 1024;
        e = null;
        f = false;
    }
}

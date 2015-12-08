// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.gost;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.generators.GOST3410KeyPairGenerator;
import org.spongycastle.crypto.params.GOST3410KeyGenerationParameters;
import org.spongycastle.crypto.params.GOST3410Parameters;
import org.spongycastle.crypto.params.GOST3410PrivateKeyParameters;
import org.spongycastle.crypto.params.GOST3410PublicKeyParameters;
import org.spongycastle.jce.spec.GOST3410ParameterSpec;
import org.spongycastle.jce.spec.GOST3410PublicKeyParameterSetSpec;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.gost:
//            BCGOST3410PublicKey, BCGOST3410PrivateKey

public class KeyPairGeneratorSpi extends KeyPairGenerator
{

    GOST3410KeyGenerationParameters a;
    GOST3410KeyPairGenerator b;
    GOST3410ParameterSpec c;
    int d;
    SecureRandom e;
    boolean f;

    public KeyPairGeneratorSpi()
    {
        super("GOST3410");
        b = new GOST3410KeyPairGenerator();
        d = 1024;
        e = null;
        f = false;
    }

    private void a(GOST3410ParameterSpec gost3410parameterspec, SecureRandom securerandom)
    {
        GOST3410PublicKeyParameterSetSpec gost3410publickeyparametersetspec = gost3410parameterspec.d();
        a = new GOST3410KeyGenerationParameters(securerandom, new GOST3410Parameters(gost3410publickeyparametersetspec.a(), gost3410publickeyparametersetspec.b(), gost3410publickeyparametersetspec.c()));
        b.a(a);
        f = true;
        c = gost3410parameterspec;
    }

    public KeyPair generateKeyPair()
    {
        if (!f)
        {
            a(new GOST3410ParameterSpec(CryptoProObjectIdentifiers.h.c()), new SecureRandom());
        }
        Object obj = b.a();
        GOST3410PublicKeyParameters gost3410publickeyparameters = (GOST3410PublicKeyParameters)((AsymmetricCipherKeyPair) (obj)).a();
        obj = (GOST3410PrivateKeyParameters)((AsymmetricCipherKeyPair) (obj)).b();
        return new KeyPair(new BCGOST3410PublicKey(gost3410publickeyparameters, c), new BCGOST3410PrivateKey(((GOST3410PrivateKeyParameters) (obj)), c));
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
}

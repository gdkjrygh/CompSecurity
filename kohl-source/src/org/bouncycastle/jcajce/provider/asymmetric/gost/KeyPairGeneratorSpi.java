// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.generators.GOST3410KeyPairGenerator;
import org.bouncycastle.crypto.params.GOST3410KeyGenerationParameters;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.crypto.params.GOST3410PrivateKeyParameters;
import org.bouncycastle.crypto.params.GOST3410PublicKeyParameters;
import org.bouncycastle.jce.spec.GOST3410ParameterSpec;
import org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.gost:
//            BCGOST3410PublicKey, BCGOST3410PrivateKey

public class KeyPairGeneratorSpi extends KeyPairGenerator
{

    GOST3410KeyPairGenerator engine;
    GOST3410ParameterSpec gost3410Params;
    boolean initialised;
    GOST3410KeyGenerationParameters param;
    SecureRandom random;
    int strength;

    public KeyPairGeneratorSpi()
    {
        super("GOST3410");
        engine = new GOST3410KeyPairGenerator();
        strength = 1024;
        random = null;
        initialised = false;
    }

    private void init(GOST3410ParameterSpec gost3410parameterspec, SecureRandom securerandom)
    {
        GOST3410PublicKeyParameterSetSpec gost3410publickeyparametersetspec = gost3410parameterspec.getPublicKeyParameters();
        param = new GOST3410KeyGenerationParameters(securerandom, new GOST3410Parameters(gost3410publickeyparametersetspec.getP(), gost3410publickeyparametersetspec.getQ(), gost3410publickeyparametersetspec.getA()));
        engine.init(param);
        initialised = true;
        gost3410Params = gost3410parameterspec;
    }

    public KeyPair generateKeyPair()
    {
        if (!initialised)
        {
            init(new GOST3410ParameterSpec(CryptoProObjectIdentifiers.gostR3410_94_CryptoPro_A.getId()), new SecureRandom());
        }
        Object obj = engine.generateKeyPair();
        GOST3410PublicKeyParameters gost3410publickeyparameters = (GOST3410PublicKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPublic();
        obj = (GOST3410PrivateKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPrivate();
        return new KeyPair(new BCGOST3410PublicKey(gost3410publickeyparameters, gost3410Params), new BCGOST3410PrivateKey(((GOST3410PrivateKeyParameters) (obj)), gost3410Params));
    }

    public void initialize(int i, SecureRandom securerandom)
    {
        strength = i;
        random = securerandom;
    }

    public void initialize(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
        throws InvalidAlgorithmParameterException
    {
        if (!(algorithmparameterspec instanceof GOST3410ParameterSpec))
        {
            throw new InvalidAlgorithmParameterException("parameter object not a GOST3410ParameterSpec");
        } else
        {
            init((GOST3410ParameterSpec)algorithmparameterspec, securerandom);
            return;
        }
    }
}

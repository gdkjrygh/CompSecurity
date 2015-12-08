// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.generators.ECKeyPairGenerator;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyGenerationParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.ec.EC5Util;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveGenParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.jce.spec.ECParameterSpec;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.ecgost:
//            BCECGOST3410PublicKey, BCECGOST3410PrivateKey

public class KeyPairGeneratorSpi extends KeyPairGenerator
{

    String algorithm;
    Object ecParams;
    ECKeyPairGenerator engine;
    boolean initialised;
    ECKeyGenerationParameters param;
    SecureRandom random;
    int strength;

    public KeyPairGeneratorSpi()
    {
        super("ECGOST3410");
        ecParams = null;
        engine = new ECKeyPairGenerator();
        algorithm = "ECGOST3410";
        strength = 239;
        random = null;
        initialised = false;
    }

    public KeyPair generateKeyPair()
    {
        if (!initialised)
        {
            throw new IllegalStateException("EC Key Pair Generator not initialised");
        }
        Object obj = engine.generateKeyPair();
        Object obj1 = (ECPublicKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPublic();
        obj = (ECPrivateKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPrivate();
        if (ecParams instanceof ECParameterSpec)
        {
            ECParameterSpec ecparameterspec = (ECParameterSpec)ecParams;
            obj1 = new BCECGOST3410PublicKey(algorithm, ((ECPublicKeyParameters) (obj1)), ecparameterspec);
            return new KeyPair(((java.security.PublicKey) (obj1)), new BCECGOST3410PrivateKey(algorithm, ((ECPrivateKeyParameters) (obj)), ((BCECGOST3410PublicKey) (obj1)), ecparameterspec));
        }
        if (ecParams == null)
        {
            return new KeyPair(new BCECGOST3410PublicKey(algorithm, ((ECPublicKeyParameters) (obj1))), new BCECGOST3410PrivateKey(algorithm, ((ECPrivateKeyParameters) (obj))));
        } else
        {
            java.security.spec.ECParameterSpec ecparameterspec1 = (java.security.spec.ECParameterSpec)ecParams;
            obj1 = new BCECGOST3410PublicKey(algorithm, ((ECPublicKeyParameters) (obj1)), ecparameterspec1);
            return new KeyPair(((java.security.PublicKey) (obj1)), new BCECGOST3410PrivateKey(algorithm, ((ECPrivateKeyParameters) (obj)), ((BCECGOST3410PublicKey) (obj1)), ecparameterspec1));
        }
    }

    public void initialize(int i, SecureRandom securerandom)
    {
        strength = i;
        random = securerandom;
        if (ecParams != null)
        {
            try
            {
                initialize(((AlgorithmParameterSpec) ((ECGenParameterSpec)ecParams)), securerandom);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (SecureRandom securerandom)
            {
                throw new InvalidParameterException("key size not configurable.");
            }
        } else
        {
            throw new InvalidParameterException("unknown key size.");
        }
    }

    public void initialize(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
        throws InvalidAlgorithmParameterException
    {
        if (algorithmparameterspec instanceof ECParameterSpec)
        {
            ECParameterSpec ecparameterspec = (ECParameterSpec)algorithmparameterspec;
            ecParams = algorithmparameterspec;
            param = new ECKeyGenerationParameters(new ECDomainParameters(ecparameterspec.getCurve(), ecparameterspec.getG(), ecparameterspec.getN()), securerandom);
            engine.init(param);
            initialised = true;
            return;
        }
        if (algorithmparameterspec instanceof java.security.spec.ECParameterSpec)
        {
            java.security.spec.ECParameterSpec ecparameterspec1 = (java.security.spec.ECParameterSpec)algorithmparameterspec;
            ecParams = algorithmparameterspec;
            algorithmparameterspec = EC5Util.convertCurve(ecparameterspec1.getCurve());
            param = new ECKeyGenerationParameters(new ECDomainParameters(algorithmparameterspec, EC5Util.convertPoint(algorithmparameterspec, ecparameterspec1.getGenerator(), false), ecparameterspec1.getOrder(), BigInteger.valueOf(ecparameterspec1.getCofactor())), securerandom);
            engine.init(param);
            initialised = true;
            return;
        }
        if ((algorithmparameterspec instanceof ECGenParameterSpec) || (algorithmparameterspec instanceof ECNamedCurveGenParameterSpec))
        {
            Object obj;
            if (algorithmparameterspec instanceof ECGenParameterSpec)
            {
                algorithmparameterspec = ((ECGenParameterSpec)algorithmparameterspec).getName();
            } else
            {
                algorithmparameterspec = ((ECNamedCurveGenParameterSpec)algorithmparameterspec).getName();
            }
            obj = ECGOST3410NamedCurves.getByName(algorithmparameterspec);
            if (obj == null)
            {
                throw new InvalidAlgorithmParameterException((new StringBuilder()).append("unknown curve name: ").append(algorithmparameterspec).toString());
            } else
            {
                ecParams = new ECNamedCurveSpec(algorithmparameterspec, ((ECDomainParameters) (obj)).getCurve(), ((ECDomainParameters) (obj)).getG(), ((ECDomainParameters) (obj)).getN(), ((ECDomainParameters) (obj)).getH(), ((ECDomainParameters) (obj)).getSeed());
                algorithmparameterspec = (java.security.spec.ECParameterSpec)ecParams;
                obj = EC5Util.convertCurve(algorithmparameterspec.getCurve());
                param = new ECKeyGenerationParameters(new ECDomainParameters(((org.bouncycastle.math.ec.ECCurve) (obj)), EC5Util.convertPoint(((org.bouncycastle.math.ec.ECCurve) (obj)), algorithmparameterspec.getGenerator(), false), algorithmparameterspec.getOrder(), BigInteger.valueOf(algorithmparameterspec.getCofactor())), securerandom);
                engine.init(param);
                initialised = true;
                return;
            }
        }
        if (algorithmparameterspec == null && BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa() != null)
        {
            ECParameterSpec ecparameterspec2 = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            ecParams = algorithmparameterspec;
            param = new ECKeyGenerationParameters(new ECDomainParameters(ecparameterspec2.getCurve(), ecparameterspec2.getG(), ecparameterspec2.getN()), securerandom);
            engine.init(param);
            initialised = true;
            return;
        }
        if (algorithmparameterspec == null && BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa() == null)
        {
            throw new InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
        } else
        {
            throw new InvalidAlgorithmParameterException((new StringBuilder()).append("parameter object not a ECParameterSpec: ").append(algorithmparameterspec.getClass().getName()).toString());
        }
    }
}

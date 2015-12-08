// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTNamedCurves;
import org.bouncycastle.asn1.sec.SECNamedCurves;
import org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves;
import org.bouncycastle.asn1.x9.X962NamedCurves;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.generators.ECKeyPairGenerator;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyGenerationParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveGenParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.jce.spec.ECParameterSpec;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.ec:
//            BCECPublicKey, BCECPrivateKey, EC5Util

public abstract class KeyPairGeneratorSpi extends KeyPairGenerator
{
    public static class EC extends KeyPairGeneratorSpi
    {

        private static Hashtable ecParameters;
        String algorithm;
        int certainty;
        ProviderConfiguration configuration;
        Object ecParams;
        ECKeyPairGenerator engine;
        boolean initialised;
        ECKeyGenerationParameters param;
        SecureRandom random;
        int strength;

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
                obj1 = new BCECPublicKey(algorithm, ((ECPublicKeyParameters) (obj1)), ecparameterspec, configuration);
                return new KeyPair(((java.security.PublicKey) (obj1)), new BCECPrivateKey(algorithm, ((ECPrivateKeyParameters) (obj)), ((BCECPublicKey) (obj1)), ecparameterspec, configuration));
            }
            if (ecParams == null)
            {
                return new KeyPair(new BCECPublicKey(algorithm, ((ECPublicKeyParameters) (obj1)), configuration), new BCECPrivateKey(algorithm, ((ECPrivateKeyParameters) (obj)), configuration));
            } else
            {
                java.security.spec.ECParameterSpec ecparameterspec1 = (java.security.spec.ECParameterSpec)ecParams;
                obj1 = new BCECPublicKey(algorithm, ((ECPublicKeyParameters) (obj1)), ecparameterspec1, configuration);
                return new KeyPair(((java.security.PublicKey) (obj1)), new BCECPrivateKey(algorithm, ((ECPrivateKeyParameters) (obj)), ((BCECPublicKey) (obj1)), ecparameterspec1, configuration));
            }
        }

        public void initialize(int i, SecureRandom securerandom)
        {
            strength = i;
            random = securerandom;
            ECGenParameterSpec ecgenparameterspec = (ECGenParameterSpec)ecParameters.get(new Integer(i));
            if (ecgenparameterspec != null)
            {
                try
                {
                    initialize(((AlgorithmParameterSpec) (ecgenparameterspec)), securerandom);
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
            String s;
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
            if (!(algorithmparameterspec instanceof ECGenParameterSpec) && !(algorithmparameterspec instanceof ECNamedCurveGenParameterSpec))
            {
                break MISSING_BLOCK_LABEL_458;
            }
            Object obj;
            ASN1ObjectIdentifier asn1objectidentifier;
            if (algorithmparameterspec instanceof ECGenParameterSpec)
            {
                s = ((ECGenParameterSpec)algorithmparameterspec).getName();
            } else
            {
                s = ((ECNamedCurveGenParameterSpec)algorithmparameterspec).getName();
            }
            obj = X962NamedCurves.getByName(s);
            algorithmparameterspec = ((AlgorithmParameterSpec) (obj));
            if (obj != null)
            {
                break MISSING_BLOCK_LABEL_354;
            }
            obj = SECNamedCurves.getByName(s);
            algorithmparameterspec = ((AlgorithmParameterSpec) (obj));
            if (obj == null)
            {
                algorithmparameterspec = NISTNamedCurves.getByName(s);
            }
            obj = algorithmparameterspec;
            if (algorithmparameterspec == null)
            {
                obj = TeleTrusTNamedCurves.getByName(s);
            }
            algorithmparameterspec = ((AlgorithmParameterSpec) (obj));
            if (obj != null)
            {
                break MISSING_BLOCK_LABEL_354;
            }
            try
            {
                asn1objectidentifier = new ASN1ObjectIdentifier(s);
                obj = X962NamedCurves.getByOID(asn1objectidentifier);
            }
            // Misplaced declaration of an exception variable
            catch (AlgorithmParameterSpec algorithmparameterspec)
            {
                throw new InvalidAlgorithmParameterException((new StringBuilder()).append("unknown curve name: ").append(s).toString());
            }
            algorithmparameterspec = ((AlgorithmParameterSpec) (obj));
            if (obj != null)
            {
                break MISSING_BLOCK_LABEL_255;
            }
            algorithmparameterspec = SECNamedCurves.getByOID(asn1objectidentifier);
            obj = algorithmparameterspec;
            if (algorithmparameterspec != null)
            {
                break MISSING_BLOCK_LABEL_267;
            }
            obj = NISTNamedCurves.getByOID(asn1objectidentifier);
            algorithmparameterspec = ((AlgorithmParameterSpec) (obj));
            if (obj != null)
            {
                break MISSING_BLOCK_LABEL_279;
            }
            algorithmparameterspec = TeleTrusTNamedCurves.getByOID(asn1objectidentifier);
            if (algorithmparameterspec != null)
            {
                break MISSING_BLOCK_LABEL_354;
            }
            throw new InvalidAlgorithmParameterException((new StringBuilder()).append("unknown curve OID: ").append(s).toString());
            ecParams = new ECNamedCurveSpec(s, algorithmparameterspec.getCurve(), algorithmparameterspec.getG(), algorithmparameterspec.getN(), algorithmparameterspec.getH(), null);
            algorithmparameterspec = (java.security.spec.ECParameterSpec)ecParams;
            org.bouncycastle.math.ec.ECCurve eccurve = EC5Util.convertCurve(algorithmparameterspec.getCurve());
            param = new ECKeyGenerationParameters(new ECDomainParameters(eccurve, EC5Util.convertPoint(eccurve, algorithmparameterspec.getGenerator(), false), algorithmparameterspec.getOrder(), BigInteger.valueOf(algorithmparameterspec.getCofactor())), securerandom);
            engine.init(param);
            initialised = true;
            return;
            if (algorithmparameterspec == null && configuration.getEcImplicitlyCa() != null)
            {
                ECParameterSpec ecparameterspec2 = configuration.getEcImplicitlyCa();
                ecParams = algorithmparameterspec;
                param = new ECKeyGenerationParameters(new ECDomainParameters(ecparameterspec2.getCurve(), ecparameterspec2.getG(), ecparameterspec2.getN()), securerandom);
                engine.init(param);
                initialised = true;
                return;
            }
            if (algorithmparameterspec == null && configuration.getEcImplicitlyCa() == null)
            {
                throw new InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
            } else
            {
                throw new InvalidAlgorithmParameterException("parameter object not a ECParameterSpec");
            }
        }

        static 
        {
            ecParameters = new Hashtable();
            ecParameters.put(new Integer(192), new ECGenParameterSpec("prime192v1"));
            ecParameters.put(new Integer(239), new ECGenParameterSpec("prime239v1"));
            ecParameters.put(new Integer(256), new ECGenParameterSpec("prime256v1"));
            ecParameters.put(new Integer(224), new ECGenParameterSpec("P-224"));
            ecParameters.put(new Integer(384), new ECGenParameterSpec("P-384"));
            ecParameters.put(new Integer(521), new ECGenParameterSpec("P-521"));
        }

        public EC()
        {
            super("EC");
            engine = new ECKeyPairGenerator();
            ecParams = null;
            strength = 239;
            certainty = 50;
            random = new SecureRandom();
            initialised = false;
            algorithm = "EC";
            configuration = BouncyCastleProvider.CONFIGURATION;
        }

        public EC(String s, ProviderConfiguration providerconfiguration)
        {
            super(s);
            engine = new ECKeyPairGenerator();
            ecParams = null;
            strength = 239;
            certainty = 50;
            random = new SecureRandom();
            initialised = false;
            algorithm = s;
            configuration = providerconfiguration;
        }
    }

    public static class ECDH extends EC
    {

        public ECDH()
        {
            super("ECDH", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECDHC extends EC
    {

        public ECDHC()
        {
            super("ECDHC", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECDSA extends EC
    {

        public ECDSA()
        {
            super("ECDSA", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECMQV extends EC
    {

        public ECMQV()
        {
            super("ECMQV", BouncyCastleProvider.CONFIGURATION);
        }
    }


    public KeyPairGeneratorSpi(String s)
    {
        super(s);
    }
}

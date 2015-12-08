// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.ec;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.util.Hashtable;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.nist.NISTNamedCurves;
import org.spongycastle.asn1.sec.SECNamedCurves;
import org.spongycastle.asn1.teletrust.TeleTrusTNamedCurves;
import org.spongycastle.asn1.x9.X962NamedCurves;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.generators.ECKeyPairGenerator;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECKeyGenerationParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.jcajce.provider.config.ProviderConfiguration;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.jce.spec.ECNamedCurveGenParameterSpec;
import org.spongycastle.jce.spec.ECNamedCurveSpec;
import org.spongycastle.jce.spec.ECParameterSpec;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.ec:
//            BCECPublicKey, BCECPrivateKey, EC5Util

public abstract class KeyPairGeneratorSpi extends KeyPairGenerator
{
    public static class EC extends KeyPairGeneratorSpi
    {

        private static Hashtable j;
        ECKeyGenerationParameters a;
        ECKeyPairGenerator b;
        Object c;
        int d;
        int e;
        SecureRandom f;
        boolean g;
        String h;
        ProviderConfiguration i;

        public KeyPair generateKeyPair()
        {
            if (!g)
            {
                throw new IllegalStateException("EC Key Pair Generator not initialised");
            }
            Object obj = b.a();
            Object obj1 = (ECPublicKeyParameters)((AsymmetricCipherKeyPair) (obj)).a();
            obj = (ECPrivateKeyParameters)((AsymmetricCipherKeyPair) (obj)).b();
            if (c instanceof ECParameterSpec)
            {
                ECParameterSpec ecparameterspec = (ECParameterSpec)c;
                obj1 = new BCECPublicKey(h, ((ECPublicKeyParameters) (obj1)), ecparameterspec, i);
                return new KeyPair(((java.security.PublicKey) (obj1)), new BCECPrivateKey(h, ((ECPrivateKeyParameters) (obj)), ((BCECPublicKey) (obj1)), ecparameterspec, i));
            }
            if (c == null)
            {
                return new KeyPair(new BCECPublicKey(h, ((ECPublicKeyParameters) (obj1)), i), new BCECPrivateKey(h, ((ECPrivateKeyParameters) (obj)), i));
            } else
            {
                java.security.spec.ECParameterSpec ecparameterspec1 = (java.security.spec.ECParameterSpec)c;
                obj1 = new BCECPublicKey(h, ((ECPublicKeyParameters) (obj1)), ecparameterspec1, i);
                return new KeyPair(((java.security.PublicKey) (obj1)), new BCECPrivateKey(h, ((ECPrivateKeyParameters) (obj)), ((BCECPublicKey) (obj1)), ecparameterspec1, i));
            }
        }

        public void initialize(int k, SecureRandom securerandom)
        {
            d = k;
            f = securerandom;
            ECGenParameterSpec ecgenparameterspec = (ECGenParameterSpec)j.get(new Integer(k));
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
        {
            String s;
            if (algorithmparameterspec instanceof ECParameterSpec)
            {
                ECParameterSpec ecparameterspec = (ECParameterSpec)algorithmparameterspec;
                c = algorithmparameterspec;
                a = new ECKeyGenerationParameters(new ECDomainParameters(ecparameterspec.b(), ecparameterspec.c(), ecparameterspec.d()), securerandom);
                b.a(a);
                g = true;
                return;
            }
            if (algorithmparameterspec instanceof java.security.spec.ECParameterSpec)
            {
                java.security.spec.ECParameterSpec ecparameterspec1 = (java.security.spec.ECParameterSpec)algorithmparameterspec;
                c = algorithmparameterspec;
                algorithmparameterspec = EC5Util.a(ecparameterspec1.getCurve());
                a = new ECKeyGenerationParameters(new ECDomainParameters(algorithmparameterspec, EC5Util.a(algorithmparameterspec, ecparameterspec1.getGenerator(), false), ecparameterspec1.getOrder(), BigInteger.valueOf(ecparameterspec1.getCofactor())), securerandom);
                b.a(a);
                g = true;
                return;
            }
            if (!(algorithmparameterspec instanceof ECGenParameterSpec) && !(algorithmparameterspec instanceof ECNamedCurveGenParameterSpec))
            {
                break MISSING_BLOCK_LABEL_451;
            }
            Object obj;
            ASN1ObjectIdentifier asn1objectidentifier;
            if (algorithmparameterspec instanceof ECGenParameterSpec)
            {
                s = ((ECGenParameterSpec)algorithmparameterspec).getName();
            } else
            {
                s = ((ECNamedCurveGenParameterSpec)algorithmparameterspec).a();
            }
            obj = X962NamedCurves.a(s);
            algorithmparameterspec = ((AlgorithmParameterSpec) (obj));
            if (obj != null)
            {
                break MISSING_BLOCK_LABEL_347;
            }
            obj = SECNamedCurves.a(s);
            algorithmparameterspec = ((AlgorithmParameterSpec) (obj));
            if (obj == null)
            {
                algorithmparameterspec = NISTNamedCurves.a(s);
            }
            obj = algorithmparameterspec;
            if (algorithmparameterspec == null)
            {
                obj = TeleTrusTNamedCurves.a(s);
            }
            algorithmparameterspec = ((AlgorithmParameterSpec) (obj));
            if (obj != null)
            {
                break MISSING_BLOCK_LABEL_347;
            }
            try
            {
                asn1objectidentifier = new ASN1ObjectIdentifier(s);
                obj = X962NamedCurves.a(asn1objectidentifier);
            }
            // Misplaced declaration of an exception variable
            catch (AlgorithmParameterSpec algorithmparameterspec)
            {
                throw new InvalidAlgorithmParameterException((new StringBuilder("unknown curve name: ")).append(s).toString());
            }
            algorithmparameterspec = ((AlgorithmParameterSpec) (obj));
            if (obj != null)
            {
                break MISSING_BLOCK_LABEL_255;
            }
            algorithmparameterspec = SECNamedCurves.a(asn1objectidentifier);
            obj = algorithmparameterspec;
            if (algorithmparameterspec != null)
            {
                break MISSING_BLOCK_LABEL_267;
            }
            obj = NISTNamedCurves.a(asn1objectidentifier);
            algorithmparameterspec = ((AlgorithmParameterSpec) (obj));
            if (obj != null)
            {
                break MISSING_BLOCK_LABEL_279;
            }
            algorithmparameterspec = TeleTrusTNamedCurves.a(asn1objectidentifier);
            if (algorithmparameterspec != null)
            {
                break MISSING_BLOCK_LABEL_347;
            }
            throw new InvalidAlgorithmParameterException((new StringBuilder("unknown curve OID: ")).append(s).toString());
            c = new ECNamedCurveSpec(s, algorithmparameterspec.c(), algorithmparameterspec.d(), algorithmparameterspec.e(), algorithmparameterspec.f(), null);
            algorithmparameterspec = (java.security.spec.ECParameterSpec)c;
            org.spongycastle.math.ec.ECCurve eccurve = EC5Util.a(algorithmparameterspec.getCurve());
            a = new ECKeyGenerationParameters(new ECDomainParameters(eccurve, EC5Util.a(eccurve, algorithmparameterspec.getGenerator(), false), algorithmparameterspec.getOrder(), BigInteger.valueOf(algorithmparameterspec.getCofactor())), securerandom);
            b.a(a);
            g = true;
            return;
            if (algorithmparameterspec == null && i.a() != null)
            {
                ECParameterSpec ecparameterspec2 = i.a();
                c = algorithmparameterspec;
                a = new ECKeyGenerationParameters(new ECDomainParameters(ecparameterspec2.b(), ecparameterspec2.c(), ecparameterspec2.d()), securerandom);
                b.a(a);
                g = true;
                return;
            }
            if (algorithmparameterspec == null && i.a() == null)
            {
                throw new InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
            } else
            {
                throw new InvalidAlgorithmParameterException("parameter object not a ECParameterSpec");
            }
        }

        static 
        {
            Hashtable hashtable = new Hashtable();
            j = hashtable;
            hashtable.put(new Integer(192), new ECGenParameterSpec("prime192v1"));
            j.put(new Integer(239), new ECGenParameterSpec("prime239v1"));
            j.put(new Integer(256), new ECGenParameterSpec("prime256v1"));
            j.put(new Integer(224), new ECGenParameterSpec("P-224"));
            j.put(new Integer(384), new ECGenParameterSpec("P-384"));
            j.put(new Integer(521), new ECGenParameterSpec("P-521"));
        }

        public EC()
        {
            super("EC");
            b = new ECKeyPairGenerator();
            c = null;
            d = 239;
            e = 50;
            f = new SecureRandom();
            g = false;
            h = "EC";
            i = BouncyCastleProvider.b;
        }

        public EC(String s, ProviderConfiguration providerconfiguration)
        {
            super(s);
            b = new ECKeyPairGenerator();
            c = null;
            d = 239;
            e = 50;
            f = new SecureRandom();
            g = false;
            h = s;
            i = providerconfiguration;
        }
    }

    public static class ECDH extends EC
    {

        public ECDH()
        {
            super("ECDH", BouncyCastleProvider.b);
        }
    }

    public static class ECDHC extends EC
    {

        public ECDHC()
        {
            super("ECDHC", BouncyCastleProvider.b);
        }
    }

    public static class ECDSA extends EC
    {

        public ECDSA()
        {
            super("ECDSA", BouncyCastleProvider.b);
        }
    }

    public static class ECMQV extends EC
    {

        public ECMQV()
        {
            super("ECMQV", BouncyCastleProvider.b);
        }
    }


    public KeyPairGeneratorSpi(String s)
    {
        super(s);
    }
}

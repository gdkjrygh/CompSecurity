// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.asymmetric.ec;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.util.Hashtable;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
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
import org.bouncycastle.jce.provider.JCEECPrivateKey;
import org.bouncycastle.jce.provider.JCEECPublicKey;
import org.bouncycastle.jce.provider.JDKKeyPairGenerator;
import org.bouncycastle.jce.provider.ProviderUtil;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.jce.spec.ECParameterSpec;

// Referenced classes of package org.bouncycastle.jce.provider.asymmetric.ec:
//            EC5Util

public abstract class KeyPairGenerator extends JDKKeyPairGenerator
{
    public static class EC extends KeyPairGenerator
    {

        private static Hashtable i;
        ECKeyGenerationParameters a;
        ECKeyPairGenerator b;
        Object c;
        int d;
        int e;
        SecureRandom f;
        boolean g;
        String h;

        public KeyPair generateKeyPair()
        {
            if (!g)
            {
                throw new IllegalStateException("EC Key Pair Generator not initialised");
            }
            Object obj = b.generateKeyPair();
            Object obj1 = (ECPublicKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPublic();
            obj = (ECPrivateKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPrivate();
            if (c instanceof ECParameterSpec)
            {
                ECParameterSpec ecparameterspec = (ECParameterSpec)c;
                obj1 = new JCEECPublicKey(h, ((ECPublicKeyParameters) (obj1)), ecparameterspec);
                return new KeyPair(((java.security.PublicKey) (obj1)), new JCEECPrivateKey(h, ((ECPrivateKeyParameters) (obj)), ((JCEECPublicKey) (obj1)), ecparameterspec));
            }
            if (c == null)
            {
                return new KeyPair(new JCEECPublicKey(h, ((ECPublicKeyParameters) (obj1))), new JCEECPrivateKey(h, ((ECPrivateKeyParameters) (obj))));
            } else
            {
                java.security.spec.ECParameterSpec ecparameterspec1 = (java.security.spec.ECParameterSpec)c;
                obj1 = new JCEECPublicKey(h, ((ECPublicKeyParameters) (obj1)), ecparameterspec1);
                return new KeyPair(((java.security.PublicKey) (obj1)), new JCEECPrivateKey(h, ((ECPrivateKeyParameters) (obj)), ((JCEECPublicKey) (obj1)), ecparameterspec1));
            }
        }

        public void initialize(int j, SecureRandom securerandom)
        {
            d = j;
            f = securerandom;
            c = i.get(new Integer(j));
            if (c != null)
            {
                try
                {
                    initialize(((AlgorithmParameterSpec) ((ECGenParameterSpec)c)), securerandom);
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
            if (algorithmparameterspec instanceof ECParameterSpec)
            {
                ECParameterSpec ecparameterspec = (ECParameterSpec)algorithmparameterspec;
                c = algorithmparameterspec;
                a = new ECKeyGenerationParameters(new ECDomainParameters(ecparameterspec.b(), ecparameterspec.c(), ecparameterspec.d()), securerandom);
                b.init(a);
                g = true;
                return;
            }
            if (algorithmparameterspec instanceof java.security.spec.ECParameterSpec)
            {
                java.security.spec.ECParameterSpec ecparameterspec1 = (java.security.spec.ECParameterSpec)algorithmparameterspec;
                c = algorithmparameterspec;
                algorithmparameterspec = EC5Util.a(ecparameterspec1.getCurve());
                a = new ECKeyGenerationParameters(new ECDomainParameters(algorithmparameterspec, EC5Util.a(algorithmparameterspec, ecparameterspec1.getGenerator(), false), ecparameterspec1.getOrder(), BigInteger.valueOf(ecparameterspec1.getCofactor())), securerandom);
                b.init(a);
                g = true;
                return;
            }
            if (!(algorithmparameterspec instanceof ECGenParameterSpec)) goto _L2; else goto _L1
_L1:
            String s = ((ECGenParameterSpec)algorithmparameterspec).getName();
            if (!h.equals("ECGOST3410")) goto _L4; else goto _L3
_L3:
            algorithmparameterspec = ECGOST3410NamedCurves.a(s);
            if (algorithmparameterspec == null)
            {
                throw new InvalidAlgorithmParameterException((new StringBuilder("unknown curve name: ")).append(s).toString());
            }
            c = new ECNamedCurveSpec(s, algorithmparameterspec.getCurve(), algorithmparameterspec.getG(), algorithmparameterspec.getN(), algorithmparameterspec.getH(), algorithmparameterspec.getSeed());
_L5:
            algorithmparameterspec = (java.security.spec.ECParameterSpec)c;
            org.bouncycastle.math.ec.ECCurve eccurve = EC5Util.a(algorithmparameterspec.getCurve());
            a = new ECKeyGenerationParameters(new ECDomainParameters(eccurve, EC5Util.a(eccurve, algorithmparameterspec.getGenerator(), false), algorithmparameterspec.getOrder(), BigInteger.valueOf(algorithmparameterspec.getCofactor())), securerandom);
            b.init(a);
            g = true;
            return;
_L4:
            Object obj = X962NamedCurves.a(s);
            algorithmparameterspec = ((AlgorithmParameterSpec) (obj));
            if (obj != null)
            {
                break MISSING_BLOCK_LABEL_475;
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
                break MISSING_BLOCK_LABEL_475;
            }
            DERObjectIdentifier derobjectidentifier;
            try
            {
                derobjectidentifier = new DERObjectIdentifier(s);
                obj = X962NamedCurves.a(derobjectidentifier);
            }
            // Misplaced declaration of an exception variable
            catch (AlgorithmParameterSpec algorithmparameterspec)
            {
                throw new InvalidAlgorithmParameterException((new StringBuilder("unknown curve name: ")).append(s).toString());
            }
            algorithmparameterspec = ((AlgorithmParameterSpec) (obj));
            if (obj != null)
            {
                break MISSING_BLOCK_LABEL_395;
            }
            algorithmparameterspec = SECNamedCurves.a(derobjectidentifier);
            obj = algorithmparameterspec;
            if (algorithmparameterspec != null)
            {
                break MISSING_BLOCK_LABEL_407;
            }
            obj = NISTNamedCurves.a(derobjectidentifier);
            algorithmparameterspec = ((AlgorithmParameterSpec) (obj));
            if (obj != null)
            {
                break MISSING_BLOCK_LABEL_419;
            }
            algorithmparameterspec = TeleTrusTNamedCurves.a(derobjectidentifier);
            if (algorithmparameterspec != null)
            {
                break MISSING_BLOCK_LABEL_475;
            }
            throw new InvalidAlgorithmParameterException((new StringBuilder("unknown curve OID: ")).append(s).toString());
            c = new ECNamedCurveSpec(s, algorithmparameterspec.e(), algorithmparameterspec.f(), algorithmparameterspec.g(), algorithmparameterspec.h(), null);
            if (true) goto _L5; else goto _L2
_L2:
            if (algorithmparameterspec == null && ProviderUtil.a() != null)
            {
                ECParameterSpec ecparameterspec2 = ProviderUtil.a();
                c = algorithmparameterspec;
                a = new ECKeyGenerationParameters(new ECDomainParameters(ecparameterspec2.b(), ecparameterspec2.c(), ecparameterspec2.d()), securerandom);
                b.init(a);
                g = true;
                return;
            }
            if (algorithmparameterspec == null && ProviderUtil.a() == null)
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
            i = hashtable;
            hashtable.put(new Integer(192), new ECGenParameterSpec("prime192v1"));
            i.put(new Integer(239), new ECGenParameterSpec("prime239v1"));
            i.put(new Integer(256), new ECGenParameterSpec("prime256v1"));
            i.put(new Integer(224), new ECGenParameterSpec("P-224"));
            i.put(new Integer(384), new ECGenParameterSpec("P-384"));
            i.put(new Integer(521), new ECGenParameterSpec("P-521"));
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
        }

        public EC(String s)
        {
            super(s);
            b = new ECKeyPairGenerator();
            c = null;
            d = 239;
            e = 50;
            f = new SecureRandom();
            g = false;
            h = s;
        }
    }

    public static class ECDH extends EC
    {

        public ECDH()
        {
            super("ECDH");
        }
    }

    public static class ECDHC extends EC
    {

        public ECDHC()
        {
            super("ECDHC");
        }
    }

    public static class ECDSA extends EC
    {

        public ECDSA()
        {
            super("ECDSA");
        }
    }

    public static class ECGOST3410 extends EC
    {

        public ECGOST3410()
        {
            super("ECGOST3410");
        }
    }

    public static class ECMQV extends EC
    {

        public ECMQV()
        {
            super("ECMQV");
        }
    }


    public KeyPairGenerator(String s)
    {
        super(s);
    }
}

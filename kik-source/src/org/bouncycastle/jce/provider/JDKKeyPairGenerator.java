// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.Hashtable;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.generators.DHBasicKeyPairGenerator;
import org.bouncycastle.crypto.generators.DHParametersGenerator;
import org.bouncycastle.crypto.generators.DSAKeyPairGenerator;
import org.bouncycastle.crypto.generators.DSAParametersGenerator;
import org.bouncycastle.crypto.generators.ElGamalKeyPairGenerator;
import org.bouncycastle.crypto.generators.ElGamalParametersGenerator;
import org.bouncycastle.crypto.generators.GOST3410KeyPairGenerator;
import org.bouncycastle.crypto.generators.RSAKeyPairGenerator;
import org.bouncycastle.crypto.params.DHKeyGenerationParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.params.DSAKeyGenerationParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.params.ElGamalKeyGenerationParameters;
import org.bouncycastle.crypto.params.ElGamalParameters;
import org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.bouncycastle.crypto.params.ElGamalPublicKeyParameters;
import org.bouncycastle.crypto.params.GOST3410KeyGenerationParameters;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.crypto.params.GOST3410PrivateKeyParameters;
import org.bouncycastle.crypto.params.GOST3410PublicKeyParameters;
import org.bouncycastle.crypto.params.RSAKeyGenerationParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.jce.spec.ElGamalParameterSpec;
import org.bouncycastle.jce.spec.GOST3410ParameterSpec;
import org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JCEDHPublicKey, JCEDHPrivateKey, JDKDSAPublicKey, JDKDSAPrivateKey, 
//            JCEElGamalPublicKey, JCEElGamalPrivateKey, JDKGOST3410PublicKey, JDKGOST3410PrivateKey, 
//            JCERSAPublicKey, JCERSAPrivateCrtKey

public abstract class JDKKeyPairGenerator extends KeyPairGenerator
{
    public static class DH extends JDKKeyPairGenerator
    {

        private static Hashtable g = new Hashtable();
        DHKeyGenerationParameters a;
        DHBasicKeyPairGenerator b;
        int c;
        int d;
        SecureRandom e;
        boolean f;

        public KeyPair generateKeyPair()
        {
            if (!f)
            {
                Object obj = new Integer(c);
                Object obj1;
                if (g.containsKey(obj))
                {
                    a = (DHKeyGenerationParameters)g.get(obj);
                } else
                {
                    DHParametersGenerator dhparametersgenerator = new DHParametersGenerator();
                    dhparametersgenerator.init(c, d, e);
                    a = new DHKeyGenerationParameters(e, dhparametersgenerator.generateParameters());
                    g.put(obj, a);
                }
                b.init(a);
                f = true;
            }
            obj1 = b.generateKeyPair();
            obj = (DHPublicKeyParameters)((AsymmetricCipherKeyPair) (obj1)).getPublic();
            obj1 = (DHPrivateKeyParameters)((AsymmetricCipherKeyPair) (obj1)).getPrivate();
            return new KeyPair(new JCEDHPublicKey(((DHPublicKeyParameters) (obj))), new JCEDHPrivateKey(((DHPrivateKeyParameters) (obj1))));
        }

        public void initialize(int i, SecureRandom securerandom)
        {
            c = i;
            e = securerandom;
        }

        public void initialize(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
        {
            if (!(algorithmparameterspec instanceof DHParameterSpec))
            {
                throw new InvalidAlgorithmParameterException("parameter object not a DHParameterSpec");
            } else
            {
                algorithmparameterspec = (DHParameterSpec)algorithmparameterspec;
                a = new DHKeyGenerationParameters(securerandom, new DHParameters(algorithmparameterspec.getP(), algorithmparameterspec.getG(), null, algorithmparameterspec.getL()));
                b.init(a);
                f = true;
                return;
            }
        }


        public DH()
        {
            super("DH");
            b = new DHBasicKeyPairGenerator();
            c = 1024;
            d = 20;
            e = new SecureRandom();
            f = false;
        }
    }

    public static class DSA extends JDKKeyPairGenerator
    {

        DSAKeyGenerationParameters a;
        DSAKeyPairGenerator b;
        int c;
        int d;
        SecureRandom e;
        boolean f;

        public KeyPair generateKeyPair()
        {
            if (!f)
            {
                DSAParametersGenerator dsaparametersgenerator = new DSAParametersGenerator();
                dsaparametersgenerator.init(c, d, e);
                a = new DSAKeyGenerationParameters(e, dsaparametersgenerator.generateParameters());
                b.init(a);
                f = true;
            }
            Object obj = b.generateKeyPair();
            DSAPublicKeyParameters dsapublickeyparameters = (DSAPublicKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPublic();
            obj = (DSAPrivateKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPrivate();
            return new KeyPair(new JDKDSAPublicKey(dsapublickeyparameters), new JDKDSAPrivateKey(((DSAPrivateKeyParameters) (obj))));
        }

        public void initialize(int i, SecureRandom securerandom)
        {
            if (i < 512 || i > 1024 || i % 64 != 0)
            {
                throw new InvalidParameterException("strength must be from 512 - 1024 and a multiple of 64");
            } else
            {
                c = i;
                e = securerandom;
                return;
            }
        }

        public void initialize(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
        {
            if (!(algorithmparameterspec instanceof DSAParameterSpec))
            {
                throw new InvalidAlgorithmParameterException("parameter object not a DSAParameterSpec");
            } else
            {
                algorithmparameterspec = (DSAParameterSpec)algorithmparameterspec;
                a = new DSAKeyGenerationParameters(securerandom, new DSAParameters(algorithmparameterspec.getP(), algorithmparameterspec.getQ(), algorithmparameterspec.getG()));
                b.init(a);
                f = true;
                return;
            }
        }

        public DSA()
        {
            super("DSA");
            b = new DSAKeyPairGenerator();
            c = 1024;
            d = 20;
            e = new SecureRandom();
            f = false;
        }
    }

    public static class ElGamal extends JDKKeyPairGenerator
    {

        ElGamalKeyGenerationParameters a;
        ElGamalKeyPairGenerator b;
        int c;
        int d;
        SecureRandom e;
        boolean f;

        public KeyPair generateKeyPair()
        {
            if (!f)
            {
                ElGamalParametersGenerator elgamalparametersgenerator = new ElGamalParametersGenerator();
                elgamalparametersgenerator.init(c, d, e);
                a = new ElGamalKeyGenerationParameters(e, elgamalparametersgenerator.generateParameters());
                b.init(a);
                f = true;
            }
            Object obj = b.generateKeyPair();
            ElGamalPublicKeyParameters elgamalpublickeyparameters = (ElGamalPublicKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPublic();
            obj = (ElGamalPrivateKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPrivate();
            return new KeyPair(new JCEElGamalPublicKey(elgamalpublickeyparameters), new JCEElGamalPrivateKey(((ElGamalPrivateKeyParameters) (obj))));
        }

        public void initialize(int i, SecureRandom securerandom)
        {
            c = i;
            e = securerandom;
        }

        public void initialize(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
        {
            if (!(algorithmparameterspec instanceof ElGamalParameterSpec) && !(algorithmparameterspec instanceof DHParameterSpec))
            {
                throw new InvalidAlgorithmParameterException("parameter object not a DHParameterSpec or an ElGamalParameterSpec");
            }
            if (algorithmparameterspec instanceof ElGamalParameterSpec)
            {
                algorithmparameterspec = (ElGamalParameterSpec)algorithmparameterspec;
                a = new ElGamalKeyGenerationParameters(securerandom, new ElGamalParameters(algorithmparameterspec.a(), algorithmparameterspec.b()));
            } else
            {
                algorithmparameterspec = (DHParameterSpec)algorithmparameterspec;
                a = new ElGamalKeyGenerationParameters(securerandom, new ElGamalParameters(algorithmparameterspec.getP(), algorithmparameterspec.getG(), algorithmparameterspec.getL()));
            }
            b.init(a);
            f = true;
        }

        public ElGamal()
        {
            super("ElGamal");
            b = new ElGamalKeyPairGenerator();
            c = 1024;
            d = 20;
            e = new SecureRandom();
            f = false;
        }
    }

    public static class GOST3410 extends JDKKeyPairGenerator
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

        public GOST3410()
        {
            super("GOST3410");
            b = new GOST3410KeyPairGenerator();
            d = 1024;
            e = null;
            f = false;
        }
    }

    public static class RSA extends JDKKeyPairGenerator
    {

        static final BigInteger a = BigInteger.valueOf(0x10001L);
        RSAKeyGenerationParameters b;
        RSAKeyPairGenerator c;

        public KeyPair generateKeyPair()
        {
            Object obj = c.generateKeyPair();
            RSAKeyParameters rsakeyparameters = (RSAKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPublic();
            obj = (RSAPrivateCrtKeyParameters)((AsymmetricCipherKeyPair) (obj)).getPrivate();
            return new KeyPair(new JCERSAPublicKey(rsakeyparameters), new JCERSAPrivateCrtKey(((RSAPrivateCrtKeyParameters) (obj))));
        }

        public void initialize(int i, SecureRandom securerandom)
        {
            b = new RSAKeyGenerationParameters(a, securerandom, i, 12);
            c.init(b);
        }

        public void initialize(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
        {
            if (!(algorithmparameterspec instanceof RSAKeyGenParameterSpec))
            {
                throw new InvalidAlgorithmParameterException("parameter object not a RSAKeyGenParameterSpec");
            } else
            {
                algorithmparameterspec = (RSAKeyGenParameterSpec)algorithmparameterspec;
                b = new RSAKeyGenerationParameters(algorithmparameterspec.getPublicExponent(), securerandom, algorithmparameterspec.getKeysize(), 12);
                c.init(b);
                return;
            }
        }


        public RSA()
        {
            super("RSA");
            c = new RSAKeyPairGenerator();
            b = new RSAKeyGenerationParameters(a, new SecureRandom(), 2048, 12);
            c.init(b);
        }
    }


    public JDKKeyPairGenerator(String s)
    {
        super(s);
    }
}

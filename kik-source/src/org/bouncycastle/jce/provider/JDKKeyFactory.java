// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.RSAPrivateKeyStructure;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.jce.interfaces.ElGamalPrivateKey;
import org.bouncycastle.jce.interfaces.ElGamalPublicKey;
import org.bouncycastle.jce.spec.ElGamalPrivateKeySpec;
import org.bouncycastle.jce.spec.ElGamalPublicKeySpec;
import org.bouncycastle.jce.spec.GOST3410PrivateKeySpec;
import org.bouncycastle.jce.spec.GOST3410PublicKeySpec;

// Referenced classes of package org.bouncycastle.jce.provider:
//            g, JCERSAPrivateCrtKey, JCEDHPrivateKey, JCEElGamalPrivateKey, 
//            JDKDSAPrivateKey, JCEECPrivateKey, JDKGOST3410PrivateKey, JCERSAPublicKey, 
//            JCEDHPublicKey, JCEElGamalPublicKey, JDKDSAPublicKey, JCEECPublicKey, 
//            JDKGOST3410PublicKey, JCERSAPrivateKey

public abstract class JDKKeyFactory extends KeyFactorySpi
{
    public static class DH extends JDKKeyFactory
    {

        protected PrivateKey engineGeneratePrivate(KeySpec keyspec)
        {
            if (keyspec instanceof DHPrivateKeySpec)
            {
                return new JCEDHPrivateKey((DHPrivateKeySpec)keyspec);
            } else
            {
                return engineGeneratePrivate(keyspec);
            }
        }

        protected PublicKey engineGeneratePublic(KeySpec keyspec)
        {
            if (keyspec instanceof DHPublicKeySpec)
            {
                return new JCEDHPublicKey((DHPublicKeySpec)keyspec);
            } else
            {
                return engineGeneratePublic(keyspec);
            }
        }

        public DH()
        {
        }
    }

    public static class DSA extends JDKKeyFactory
    {

        protected PrivateKey engineGeneratePrivate(KeySpec keyspec)
        {
            if (keyspec instanceof DSAPrivateKeySpec)
            {
                return new JDKDSAPrivateKey((DSAPrivateKeySpec)keyspec);
            } else
            {
                return engineGeneratePrivate(keyspec);
            }
        }

        protected PublicKey engineGeneratePublic(KeySpec keyspec)
        {
            if (keyspec instanceof DSAPublicKeySpec)
            {
                return new JDKDSAPublicKey((DSAPublicKeySpec)keyspec);
            } else
            {
                return engineGeneratePublic(keyspec);
            }
        }

        public DSA()
        {
        }
    }

    public static class ElGamal extends JDKKeyFactory
    {

        protected PrivateKey engineGeneratePrivate(KeySpec keyspec)
        {
            if (keyspec instanceof ElGamalPrivateKeySpec)
            {
                return new JCEElGamalPrivateKey((ElGamalPrivateKeySpec)keyspec);
            }
            if (keyspec instanceof DHPrivateKeySpec)
            {
                return new JCEElGamalPrivateKey((DHPrivateKeySpec)keyspec);
            } else
            {
                return engineGeneratePrivate(keyspec);
            }
        }

        protected PublicKey engineGeneratePublic(KeySpec keyspec)
        {
            if (keyspec instanceof ElGamalPublicKeySpec)
            {
                return new JCEElGamalPublicKey((ElGamalPublicKeySpec)keyspec);
            }
            if (keyspec instanceof DHPublicKeySpec)
            {
                return new JCEElGamalPublicKey((DHPublicKeySpec)keyspec);
            } else
            {
                return engineGeneratePublic(keyspec);
            }
        }

        public ElGamal()
        {
            a = true;
        }
    }

    public static class GOST3410 extends JDKKeyFactory
    {

        protected PrivateKey engineGeneratePrivate(KeySpec keyspec)
        {
            if (keyspec instanceof GOST3410PrivateKeySpec)
            {
                return new JDKGOST3410PrivateKey((GOST3410PrivateKeySpec)keyspec);
            } else
            {
                return engineGeneratePrivate(keyspec);
            }
        }

        protected PublicKey engineGeneratePublic(KeySpec keyspec)
        {
            if (keyspec instanceof GOST3410PublicKeySpec)
            {
                return new JDKGOST3410PublicKey((GOST3410PublicKeySpec)keyspec);
            } else
            {
                return engineGeneratePublic(keyspec);
            }
        }

        public GOST3410()
        {
        }
    }

    public static class RSA extends JDKKeyFactory
    {

        protected PrivateKey engineGeneratePrivate(KeySpec keyspec)
        {
            if (keyspec instanceof PKCS8EncodedKeySpec)
            {
                PrivateKey privatekey;
                try
                {
                    privatekey = JDKKeyFactory.b(((PKCS8EncodedKeySpec)keyspec).getEncoded());
                }
                catch (Exception exception)
                {
                    try
                    {
                        keyspec = new JCERSAPrivateCrtKey(new RSAPrivateKeyStructure((ASN1Sequence)ASN1Object.a(((PKCS8EncodedKeySpec)keyspec).getEncoded())));
                    }
                    // Misplaced declaration of an exception variable
                    catch (KeySpec keyspec)
                    {
                        throw new InvalidKeySpecException(keyspec.toString());
                    }
                    return keyspec;
                }
                return privatekey;
            }
            if (keyspec instanceof RSAPrivateCrtKeySpec)
            {
                return new JCERSAPrivateCrtKey((RSAPrivateCrtKeySpec)keyspec);
            }
            if (keyspec instanceof RSAPrivateKeySpec)
            {
                return new JCERSAPrivateKey((RSAPrivateKeySpec)keyspec);
            } else
            {
                throw new InvalidKeySpecException((new StringBuilder("Unknown KeySpec type: ")).append(keyspec.getClass().getName()).toString());
            }
        }

        protected PublicKey engineGeneratePublic(KeySpec keyspec)
        {
            if (keyspec instanceof RSAPublicKeySpec)
            {
                return new JCERSAPublicKey((RSAPublicKeySpec)keyspec);
            } else
            {
                return engineGeneratePublic(keyspec);
            }
        }

        public RSA()
        {
        }
    }

    public static class X509 extends JDKKeyFactory
    {

        public X509()
        {
        }
    }


    protected boolean a;

    public JDKKeyFactory()
    {
        a = false;
    }

    static PrivateKey a(PrivateKeyInfo privatekeyinfo)
    {
        DERObjectIdentifier derobjectidentifier = privatekeyinfo.e().e();
        if (g.a(derobjectidentifier))
        {
            return new JCERSAPrivateCrtKey(privatekeyinfo);
        }
        if (derobjectidentifier.equals(PKCSObjectIdentifiers.q))
        {
            return new JCEDHPrivateKey(privatekeyinfo);
        }
        if (derobjectidentifier.equals(X9ObjectIdentifiers.ab))
        {
            return new JCEDHPrivateKey(privatekeyinfo);
        }
        if (derobjectidentifier.equals(OIWObjectIdentifiers.l))
        {
            return new JCEElGamalPrivateKey(privatekeyinfo);
        }
        if (derobjectidentifier.equals(X9ObjectIdentifiers.U))
        {
            return new JDKDSAPrivateKey(privatekeyinfo);
        }
        if (derobjectidentifier.equals(X9ObjectIdentifiers.k))
        {
            return new JCEECPrivateKey(privatekeyinfo);
        }
        if (derobjectidentifier.equals(CryptoProObjectIdentifiers.c))
        {
            return new JDKGOST3410PrivateKey(privatekeyinfo);
        }
        if (derobjectidentifier.equals(CryptoProObjectIdentifiers.d))
        {
            return new JCEECPrivateKey(privatekeyinfo);
        } else
        {
            throw new RuntimeException((new StringBuilder("algorithm identifier ")).append(derobjectidentifier).append(" in key not recognised").toString());
        }
    }

    static PublicKey a(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        DERObjectIdentifier derobjectidentifier = subjectpublickeyinfo.e().e();
        if (g.a(derobjectidentifier))
        {
            return new JCERSAPublicKey(subjectpublickeyinfo);
        }
        if (derobjectidentifier.equals(PKCSObjectIdentifiers.q))
        {
            return new JCEDHPublicKey(subjectpublickeyinfo);
        }
        if (derobjectidentifier.equals(X9ObjectIdentifiers.ab))
        {
            return new JCEDHPublicKey(subjectpublickeyinfo);
        }
        if (derobjectidentifier.equals(OIWObjectIdentifiers.l))
        {
            return new JCEElGamalPublicKey(subjectpublickeyinfo);
        }
        if (derobjectidentifier.equals(X9ObjectIdentifiers.U))
        {
            return new JDKDSAPublicKey(subjectpublickeyinfo);
        }
        if (derobjectidentifier.equals(OIWObjectIdentifiers.j))
        {
            return new JDKDSAPublicKey(subjectpublickeyinfo);
        }
        if (derobjectidentifier.equals(X9ObjectIdentifiers.k))
        {
            return new JCEECPublicKey(subjectpublickeyinfo);
        }
        if (derobjectidentifier.equals(CryptoProObjectIdentifiers.c))
        {
            return new JDKGOST3410PublicKey(subjectpublickeyinfo);
        }
        if (derobjectidentifier.equals(CryptoProObjectIdentifiers.d))
        {
            return new JCEECPublicKey(subjectpublickeyinfo);
        } else
        {
            throw new RuntimeException((new StringBuilder("algorithm identifier ")).append(derobjectidentifier).append(" in key not recognised").toString());
        }
    }

    public static PublicKey a(byte abyte0[])
    {
        return a(new SubjectPublicKeyInfo((ASN1Sequence)ASN1Object.a(abyte0)));
    }

    protected static PrivateKey b(byte abyte0[])
    {
        return a(new PrivateKeyInfo((ASN1Sequence)ASN1Object.a(abyte0)));
    }

    protected PrivateKey engineGeneratePrivate(KeySpec keyspec)
    {
        if (keyspec instanceof PKCS8EncodedKeySpec)
        {
            try
            {
                keyspec = b(((PKCS8EncodedKeySpec)keyspec).getEncoded());
            }
            // Misplaced declaration of an exception variable
            catch (KeySpec keyspec)
            {
                throw new InvalidKeySpecException(keyspec.toString());
            }
            return keyspec;
        } else
        {
            throw new InvalidKeySpecException((new StringBuilder("Unknown KeySpec type: ")).append(keyspec.getClass().getName()).toString());
        }
    }

    protected PublicKey engineGeneratePublic(KeySpec keyspec)
    {
        if (keyspec instanceof X509EncodedKeySpec)
        {
            try
            {
                keyspec = a(((X509EncodedKeySpec)keyspec).getEncoded());
            }
            // Misplaced declaration of an exception variable
            catch (KeySpec keyspec)
            {
                throw new InvalidKeySpecException(keyspec.toString());
            }
            return keyspec;
        } else
        {
            throw new InvalidKeySpecException((new StringBuilder("Unknown KeySpec type: ")).append(keyspec.getClass().getName()).toString());
        }
    }

    protected KeySpec engineGetKeySpec(Key key, Class class1)
    {
        if (class1.isAssignableFrom(java/security/spec/PKCS8EncodedKeySpec) && key.getFormat().equals("PKCS#8"))
        {
            return new PKCS8EncodedKeySpec(key.getEncoded());
        }
        if (class1.isAssignableFrom(java/security/spec/X509EncodedKeySpec) && key.getFormat().equals("X.509"))
        {
            return new X509EncodedKeySpec(key.getEncoded());
        }
        if (class1.isAssignableFrom(java/security/spec/RSAPublicKeySpec) && (key instanceof RSAPublicKey))
        {
            key = (RSAPublicKey)key;
            return new RSAPublicKeySpec(key.getModulus(), key.getPublicExponent());
        }
        if (class1.isAssignableFrom(java/security/spec/RSAPrivateKeySpec) && (key instanceof RSAPrivateKey))
        {
            key = (RSAPrivateKey)key;
            return new RSAPrivateKeySpec(key.getModulus(), key.getPrivateExponent());
        }
        if (class1.isAssignableFrom(java/security/spec/RSAPrivateCrtKeySpec) && (key instanceof RSAPrivateCrtKey))
        {
            key = (RSAPrivateCrtKey)key;
            return new RSAPrivateCrtKeySpec(key.getModulus(), key.getPublicExponent(), key.getPrivateExponent(), key.getPrimeP(), key.getPrimeQ(), key.getPrimeExponentP(), key.getPrimeExponentQ(), key.getCrtCoefficient());
        }
        if (class1.isAssignableFrom(javax/crypto/spec/DHPrivateKeySpec) && (key instanceof DHPrivateKey))
        {
            key = (DHPrivateKey)key;
            return new DHPrivateKeySpec(key.getX(), key.getParams().getP(), key.getParams().getG());
        }
        if (class1.isAssignableFrom(javax/crypto/spec/DHPublicKeySpec) && (key instanceof DHPublicKey))
        {
            key = (DHPublicKey)key;
            return new DHPublicKeySpec(key.getY(), key.getParams().getP(), key.getParams().getG());
        } else
        {
            throw new RuntimeException((new StringBuilder("not implemented yet ")).append(key).append(" ").append(class1).toString());
        }
    }

    protected Key engineTranslateKey(Key key)
    {
        if (key instanceof RSAPublicKey)
        {
            return new JCERSAPublicKey((RSAPublicKey)key);
        }
        if (key instanceof RSAPrivateCrtKey)
        {
            return new JCERSAPrivateCrtKey((RSAPrivateCrtKey)key);
        }
        if (key instanceof RSAPrivateKey)
        {
            return new JCERSAPrivateKey((RSAPrivateKey)key);
        }
        if (key instanceof DHPublicKey)
        {
            if (a)
            {
                return new JCEElGamalPublicKey((DHPublicKey)key);
            } else
            {
                return new JCEDHPublicKey((DHPublicKey)key);
            }
        }
        if (key instanceof DHPrivateKey)
        {
            if (a)
            {
                return new JCEElGamalPrivateKey((DHPrivateKey)key);
            } else
            {
                return new JCEDHPrivateKey((DHPrivateKey)key);
            }
        }
        if (key instanceof DSAPublicKey)
        {
            return new JDKDSAPublicKey((DSAPublicKey)key);
        }
        if (key instanceof DSAPrivateKey)
        {
            return new JDKDSAPrivateKey((DSAPrivateKey)key);
        }
        if (key instanceof ElGamalPublicKey)
        {
            return new JCEElGamalPublicKey((ElGamalPublicKey)key);
        }
        if (key instanceof ElGamalPrivateKey)
        {
            return new JCEElGamalPrivateKey((ElGamalPrivateKey)key);
        } else
        {
            throw new InvalidKeyException("key type unknown");
        }
    }
}

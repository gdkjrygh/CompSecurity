// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.provider.asymmetric.ec.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.bouncycastle.jce.spec.ECPrivateKeySpec;
import org.bouncycastle.jce.spec.ECPublicKeySpec;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.ecgost:
//            BCECGOST3410PrivateKey, BCECGOST3410PublicKey

public class KeyFactorySpi extends BaseKeyFactorySpi
{

    public KeyFactorySpi()
    {
    }

    protected PrivateKey engineGeneratePrivate(KeySpec keyspec)
        throws InvalidKeySpecException
    {
        if (keyspec instanceof ECPrivateKeySpec)
        {
            return new BCECGOST3410PrivateKey((ECPrivateKeySpec)keyspec);
        }
        if (keyspec instanceof java.security.spec.ECPrivateKeySpec)
        {
            return new BCECGOST3410PrivateKey((java.security.spec.ECPrivateKeySpec)keyspec);
        } else
        {
            return super.engineGeneratePrivate(keyspec);
        }
    }

    protected PublicKey engineGeneratePublic(KeySpec keyspec)
        throws InvalidKeySpecException
    {
        if (keyspec instanceof ECPublicKeySpec)
        {
            return new BCECGOST3410PublicKey((ECPublicKeySpec)keyspec);
        }
        if (keyspec instanceof java.security.spec.ECPublicKeySpec)
        {
            return new BCECGOST3410PublicKey((java.security.spec.ECPublicKeySpec)keyspec);
        } else
        {
            return super.engineGeneratePublic(keyspec);
        }
    }

    protected KeySpec engineGetKeySpec(Key key, Class class1)
        throws InvalidKeySpecException
    {
        if (class1.isAssignableFrom(java/security/spec/ECPublicKeySpec) && (key instanceof ECPublicKey))
        {
            key = (ECPublicKey)key;
            if (key.getParams() != null)
            {
                return new java.security.spec.ECPublicKeySpec(key.getW(), key.getParams());
            } else
            {
                class1 = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
                return new java.security.spec.ECPublicKeySpec(key.getW(), EC5Util.convertSpec(EC5Util.convertCurve(class1.getCurve(), class1.getSeed()), class1));
            }
        }
        if (class1.isAssignableFrom(java/security/spec/ECPrivateKeySpec) && (key instanceof ECPrivateKey))
        {
            key = (ECPrivateKey)key;
            if (key.getParams() != null)
            {
                return new java.security.spec.ECPrivateKeySpec(key.getS(), key.getParams());
            } else
            {
                class1 = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
                return new java.security.spec.ECPrivateKeySpec(key.getS(), EC5Util.convertSpec(EC5Util.convertCurve(class1.getCurve(), class1.getSeed()), class1));
            }
        }
        if (class1.isAssignableFrom(org/bouncycastle/jce/spec/ECPublicKeySpec) && (key instanceof ECPublicKey))
        {
            key = (ECPublicKey)key;
            if (key.getParams() != null)
            {
                return new ECPublicKeySpec(EC5Util.convertPoint(key.getParams(), key.getW(), false), EC5Util.convertSpec(key.getParams(), false));
            } else
            {
                class1 = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
                return new ECPublicKeySpec(EC5Util.convertPoint(key.getParams(), key.getW(), false), class1);
            }
        }
        if (class1.isAssignableFrom(org/bouncycastle/jce/spec/ECPrivateKeySpec) && (key instanceof ECPrivateKey))
        {
            key = (ECPrivateKey)key;
            if (key.getParams() != null)
            {
                return new ECPrivateKeySpec(key.getS(), EC5Util.convertSpec(key.getParams(), false));
            } else
            {
                class1 = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
                return new ECPrivateKeySpec(key.getS(), class1);
            }
        } else
        {
            return super.engineGetKeySpec(key, class1);
        }
    }

    protected Key engineTranslateKey(Key key)
        throws InvalidKeyException
    {
        throw new InvalidKeyException("key type unknown");
    }

    public PrivateKey generatePrivate(PrivateKeyInfo privatekeyinfo)
        throws IOException
    {
        ASN1ObjectIdentifier asn1objectidentifier = privatekeyinfo.getPrivateKeyAlgorithm().getAlgorithm();
        if (asn1objectidentifier.equals(CryptoProObjectIdentifiers.gostR3410_2001))
        {
            return new BCECGOST3410PrivateKey(privatekeyinfo);
        } else
        {
            throw new IOException((new StringBuilder()).append("algorithm identifier ").append(asn1objectidentifier).append(" in key not recognised").toString());
        }
    }

    public PublicKey generatePublic(SubjectPublicKeyInfo subjectpublickeyinfo)
        throws IOException
    {
        ASN1ObjectIdentifier asn1objectidentifier = subjectpublickeyinfo.getAlgorithm().getAlgorithm();
        if (asn1objectidentifier.equals(CryptoProObjectIdentifiers.gostR3410_2001))
        {
            return new BCECGOST3410PublicKey(subjectpublickeyinfo);
        } else
        {
            throw new IOException((new StringBuilder()).append("algorithm identifier ").append(asn1objectidentifier).append(" in key not recognised").toString());
        }
    }
}

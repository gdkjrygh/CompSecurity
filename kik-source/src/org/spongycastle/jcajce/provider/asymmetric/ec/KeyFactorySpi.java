// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.ec;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.KeySpec;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;
import org.spongycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.spongycastle.jcajce.provider.config.ProviderConfiguration;
import org.spongycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.jce.spec.ECParameterSpec;
import org.spongycastle.jce.spec.ECPrivateKeySpec;
import org.spongycastle.jce.spec.ECPublicKeySpec;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.ec:
//            BCECPrivateKey, BCECPublicKey, EC5Util

public class KeyFactorySpi extends BaseKeyFactorySpi
    implements AsymmetricKeyInfoConverter
{
    public static class EC extends KeyFactorySpi
    {

        public EC()
        {
            super("EC", BouncyCastleProvider.b);
        }
    }

    public static class ECDH extends KeyFactorySpi
    {

        public ECDH()
        {
            super("ECDH", BouncyCastleProvider.b);
        }
    }

    public static class ECDHC extends KeyFactorySpi
    {

        public ECDHC()
        {
            super("ECDHC", BouncyCastleProvider.b);
        }
    }

    public static class ECDSA extends KeyFactorySpi
    {

        public ECDSA()
        {
            super("ECDSA", BouncyCastleProvider.b);
        }
    }

    public static class ECGOST3410 extends KeyFactorySpi
    {

        public ECGOST3410()
        {
            super("ECGOST3410", BouncyCastleProvider.b);
        }
    }

    public static class ECMQV extends KeyFactorySpi
    {

        public ECMQV()
        {
            super("ECMQV", BouncyCastleProvider.b);
        }
    }


    String a;
    ProviderConfiguration b;

    KeyFactorySpi(String s, ProviderConfiguration providerconfiguration)
    {
        a = s;
        b = providerconfiguration;
    }

    public final PrivateKey a(PrivateKeyInfo privatekeyinfo)
    {
        ASN1ObjectIdentifier asn1objectidentifier = privatekeyinfo.c().d();
        if (asn1objectidentifier.equals(X9ObjectIdentifiers.k))
        {
            return new BCECPrivateKey(a, privatekeyinfo, b);
        } else
        {
            throw new IOException((new StringBuilder("algorithm identifier ")).append(asn1objectidentifier).append(" in key not recognised").toString());
        }
    }

    public final PublicKey a(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        ASN1ObjectIdentifier asn1objectidentifier = subjectpublickeyinfo.c().d();
        if (asn1objectidentifier.equals(X9ObjectIdentifiers.k))
        {
            return new BCECPublicKey(a, subjectpublickeyinfo, b);
        } else
        {
            throw new IOException((new StringBuilder("algorithm identifier ")).append(asn1objectidentifier).append(" in key not recognised").toString());
        }
    }

    protected PrivateKey engineGeneratePrivate(KeySpec keyspec)
    {
        if (keyspec instanceof ECPrivateKeySpec)
        {
            return new BCECPrivateKey(a, (ECPrivateKeySpec)keyspec, b);
        }
        if (keyspec instanceof java.security.spec.ECPrivateKeySpec)
        {
            return new BCECPrivateKey(a, (java.security.spec.ECPrivateKeySpec)keyspec, b);
        } else
        {
            return super.engineGeneratePrivate(keyspec);
        }
    }

    protected PublicKey engineGeneratePublic(KeySpec keyspec)
    {
        if (keyspec instanceof ECPublicKeySpec)
        {
            return new BCECPublicKey(a, (ECPublicKeySpec)keyspec, b);
        }
        if (keyspec instanceof java.security.spec.ECPublicKeySpec)
        {
            return new BCECPublicKey(a, (java.security.spec.ECPublicKeySpec)keyspec, b);
        } else
        {
            return super.engineGeneratePublic(keyspec);
        }
    }

    protected KeySpec engineGetKeySpec(Key key, Class class1)
    {
        if (class1.isAssignableFrom(java/security/spec/ECPublicKeySpec) && (key instanceof ECPublicKey))
        {
            key = (ECPublicKey)key;
            if (key.getParams() != null)
            {
                return new java.security.spec.ECPublicKeySpec(key.getW(), key.getParams());
            } else
            {
                class1 = BouncyCastleProvider.b.a();
                return new java.security.spec.ECPublicKeySpec(key.getW(), EC5Util.a(EC5Util.a(class1.b()), class1));
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
                class1 = BouncyCastleProvider.b.a();
                return new java.security.spec.ECPrivateKeySpec(key.getS(), EC5Util.a(EC5Util.a(class1.b()), class1));
            }
        }
        if (class1.isAssignableFrom(org/spongycastle/jce/spec/ECPublicKeySpec) && (key instanceof ECPublicKey))
        {
            key = (ECPublicKey)key;
            if (key.getParams() != null)
            {
                return new ECPublicKeySpec(EC5Util.a(key.getParams(), key.getW()), EC5Util.a(key.getParams(), false));
            } else
            {
                class1 = BouncyCastleProvider.b.a();
                return new ECPublicKeySpec(EC5Util.a(key.getParams(), key.getW()), class1);
            }
        }
        if (class1.isAssignableFrom(org/spongycastle/jce/spec/ECPrivateKeySpec) && (key instanceof ECPrivateKey))
        {
            key = (ECPrivateKey)key;
            if (key.getParams() != null)
            {
                return new ECPrivateKeySpec(key.getS(), EC5Util.a(key.getParams(), false));
            } else
            {
                class1 = BouncyCastleProvider.b.a();
                return new ECPrivateKeySpec(key.getS(), class1);
            }
        } else
        {
            return super.engineGetKeySpec(key, class1);
        }
    }

    protected Key engineTranslateKey(Key key)
    {
        if (key instanceof ECPublicKey)
        {
            return new BCECPublicKey((ECPublicKey)key);
        }
        if (key instanceof ECPrivateKey)
        {
            return new BCECPrivateKey((ECPrivateKey)key, b);
        } else
        {
            throw new InvalidKeyException("key type unknown");
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.elgamal;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.KeySpec;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;
import org.spongycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.spongycastle.jce.interfaces.ElGamalPrivateKey;
import org.spongycastle.jce.interfaces.ElGamalPublicKey;
import org.spongycastle.jce.spec.ElGamalPrivateKeySpec;
import org.spongycastle.jce.spec.ElGamalPublicKeySpec;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.elgamal:
//            BCElGamalPrivateKey, BCElGamalPublicKey

public class KeyFactorySpi extends BaseKeyFactorySpi
{

    public KeyFactorySpi()
    {
    }

    public final PrivateKey a(PrivateKeyInfo privatekeyinfo)
    {
        ASN1ObjectIdentifier asn1objectidentifier = privatekeyinfo.c().d();
        if (asn1objectidentifier.equals(PKCSObjectIdentifiers.q))
        {
            return new BCElGamalPrivateKey(privatekeyinfo);
        }
        if (asn1objectidentifier.equals(X9ObjectIdentifiers.ab))
        {
            return new BCElGamalPrivateKey(privatekeyinfo);
        }
        if (asn1objectidentifier.equals(OIWObjectIdentifiers.l))
        {
            return new BCElGamalPrivateKey(privatekeyinfo);
        } else
        {
            throw new IOException((new StringBuilder("algorithm identifier ")).append(asn1objectidentifier).append(" in key not recognised").toString());
        }
    }

    public final PublicKey a(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        ASN1ObjectIdentifier asn1objectidentifier = subjectpublickeyinfo.c().d();
        if (asn1objectidentifier.equals(PKCSObjectIdentifiers.q))
        {
            return new BCElGamalPublicKey(subjectpublickeyinfo);
        }
        if (asn1objectidentifier.equals(X9ObjectIdentifiers.ab))
        {
            return new BCElGamalPublicKey(subjectpublickeyinfo);
        }
        if (asn1objectidentifier.equals(OIWObjectIdentifiers.l))
        {
            return new BCElGamalPublicKey(subjectpublickeyinfo);
        } else
        {
            throw new IOException((new StringBuilder("algorithm identifier ")).append(asn1objectidentifier).append(" in key not recognised").toString());
        }
    }

    protected PrivateKey engineGeneratePrivate(KeySpec keyspec)
    {
        if (keyspec instanceof ElGamalPrivateKeySpec)
        {
            return new BCElGamalPrivateKey((ElGamalPrivateKeySpec)keyspec);
        }
        if (keyspec instanceof DHPrivateKeySpec)
        {
            return new BCElGamalPrivateKey((DHPrivateKeySpec)keyspec);
        } else
        {
            return super.engineGeneratePrivate(keyspec);
        }
    }

    protected PublicKey engineGeneratePublic(KeySpec keyspec)
    {
        if (keyspec instanceof ElGamalPublicKeySpec)
        {
            return new BCElGamalPublicKey((ElGamalPublicKeySpec)keyspec);
        }
        if (keyspec instanceof DHPublicKeySpec)
        {
            return new BCElGamalPublicKey((DHPublicKeySpec)keyspec);
        } else
        {
            return super.engineGeneratePublic(keyspec);
        }
    }

    protected KeySpec engineGetKeySpec(Key key, Class class1)
    {
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
            return super.engineGetKeySpec(key, class1);
        }
    }

    protected Key engineTranslateKey(Key key)
    {
        if (key instanceof DHPublicKey)
        {
            return new BCElGamalPublicKey((DHPublicKey)key);
        }
        if (key instanceof DHPrivateKey)
        {
            return new BCElGamalPrivateKey((DHPrivateKey)key);
        }
        if (key instanceof ElGamalPublicKey)
        {
            return new BCElGamalPublicKey((ElGamalPublicKey)key);
        }
        if (key instanceof ElGamalPrivateKey)
        {
            return new BCElGamalPrivateKey((ElGamalPrivateKey)key);
        } else
        {
            throw new InvalidKeyException("key type unknown");
        }
    }
}

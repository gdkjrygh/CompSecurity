// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.dh;

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
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;
import org.spongycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.dh:
//            BCDHPrivateKey, BCDHPublicKey

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
            return new BCDHPrivateKey(privatekeyinfo);
        }
        if (asn1objectidentifier.equals(X9ObjectIdentifiers.ab))
        {
            return new BCDHPrivateKey(privatekeyinfo);
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
            return new BCDHPublicKey(subjectpublickeyinfo);
        }
        if (asn1objectidentifier.equals(X9ObjectIdentifiers.ab))
        {
            return new BCDHPublicKey(subjectpublickeyinfo);
        } else
        {
            throw new IOException((new StringBuilder("algorithm identifier ")).append(asn1objectidentifier).append(" in key not recognised").toString());
        }
    }

    protected PrivateKey engineGeneratePrivate(KeySpec keyspec)
    {
        if (keyspec instanceof DHPrivateKeySpec)
        {
            return new BCDHPrivateKey((DHPrivateKeySpec)keyspec);
        } else
        {
            return super.engineGeneratePrivate(keyspec);
        }
    }

    protected PublicKey engineGeneratePublic(KeySpec keyspec)
    {
        if (keyspec instanceof DHPublicKeySpec)
        {
            return new BCDHPublicKey((DHPublicKeySpec)keyspec);
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
            return new BCDHPublicKey((DHPublicKey)key);
        }
        if (key instanceof DHPrivateKey)
        {
            return new BCDHPrivateKey((DHPrivateKey)key);
        } else
        {
            throw new InvalidKeyException("key type unknown");
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.pkcs.RSAPrivateKeyStructure;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JDKKeyFactory, JCERSAPrivateCrtKey, JCERSAPrivateKey, JCERSAPublicKey

public static class e extends JDKKeyFactory
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
            return super.engineGeneratePublic(keyspec);
        }
    }

    public e()
    {
    }
}

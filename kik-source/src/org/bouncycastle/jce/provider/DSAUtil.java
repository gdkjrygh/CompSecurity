// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;

public class DSAUtil
{

    public DSAUtil()
    {
    }

    public static AsymmetricKeyParameter a(PrivateKey privatekey)
    {
        if (privatekey instanceof DSAPrivateKey)
        {
            privatekey = (DSAPrivateKey)privatekey;
            return new DSAPrivateKeyParameters(privatekey.getX(), new DSAParameters(privatekey.getParams().getP(), privatekey.getParams().getQ(), privatekey.getParams().getG()));
        } else
        {
            throw new InvalidKeyException("can't identify DSA private key.");
        }
    }

    public static AsymmetricKeyParameter a(PublicKey publickey)
    {
        if (publickey instanceof DSAPublicKey)
        {
            publickey = (DSAPublicKey)publickey;
            return new DSAPublicKeyParameters(publickey.getY(), new DSAParameters(publickey.getParams().getP(), publickey.getParams().getQ(), publickey.getParams().getG()));
        } else
        {
            throw new InvalidKeyException((new StringBuilder("can't identify DSA public key: ")).append(publickey.getClass().getName()).toString());
        }
    }
}

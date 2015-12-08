// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ElGamalParameters;
import org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.bouncycastle.crypto.params.ElGamalPublicKeyParameters;
import org.bouncycastle.jce.interfaces.ElGamalPrivateKey;
import org.bouncycastle.jce.interfaces.ElGamalPublicKey;
import org.bouncycastle.jce.spec.ElGamalParameterSpec;

public class ElGamalUtil
{

    public ElGamalUtil()
    {
    }

    public static AsymmetricKeyParameter generatePrivateKeyParameter(PrivateKey privatekey)
        throws InvalidKeyException
    {
        if (privatekey instanceof ElGamalPrivateKey)
        {
            privatekey = (ElGamalPrivateKey)privatekey;
            return new ElGamalPrivateKeyParameters(privatekey.getX(), new ElGamalParameters(privatekey.getParameters().getP(), privatekey.getParameters().getG()));
        }
        if (privatekey instanceof DHPrivateKey)
        {
            privatekey = (DHPrivateKey)privatekey;
            return new ElGamalPrivateKeyParameters(privatekey.getX(), new ElGamalParameters(privatekey.getParams().getP(), privatekey.getParams().getG()));
        } else
        {
            throw new InvalidKeyException("can't identify private key for El Gamal.");
        }
    }

    public static AsymmetricKeyParameter generatePublicKeyParameter(PublicKey publickey)
        throws InvalidKeyException
    {
        if (publickey instanceof ElGamalPublicKey)
        {
            publickey = (ElGamalPublicKey)publickey;
            return new ElGamalPublicKeyParameters(publickey.getY(), new ElGamalParameters(publickey.getParameters().getP(), publickey.getParameters().getG()));
        }
        if (publickey instanceof DHPublicKey)
        {
            publickey = (DHPublicKey)publickey;
            return new ElGamalPublicKeyParameters(publickey.getY(), new ElGamalParameters(publickey.getParams().getP(), publickey.getParams().getG()));
        } else
        {
            throw new InvalidKeyException("can't identify public key for El Gamal.");
        }
    }
}

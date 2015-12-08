// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.ElGamalParameters;
import org.spongycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.spongycastle.crypto.params.ElGamalPublicKeyParameters;
import org.spongycastle.jce.interfaces.ElGamalPrivateKey;
import org.spongycastle.jce.interfaces.ElGamalPublicKey;
import org.spongycastle.jce.spec.ElGamalParameterSpec;

public class ElGamalUtil
{

    public ElGamalUtil()
    {
    }

    public static AsymmetricKeyParameter a(PrivateKey privatekey)
    {
        if (privatekey instanceof ElGamalPrivateKey)
        {
            privatekey = (ElGamalPrivateKey)privatekey;
            return new ElGamalPrivateKeyParameters(privatekey.getX(), new ElGamalParameters(privatekey.b().a(), privatekey.b().b()));
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

    public static AsymmetricKeyParameter a(PublicKey publickey)
    {
        if (publickey instanceof ElGamalPublicKey)
        {
            publickey = (ElGamalPublicKey)publickey;
            return new ElGamalPublicKeyParameters(publickey.getY(), new ElGamalParameters(publickey.b().a(), publickey.b().b()));
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

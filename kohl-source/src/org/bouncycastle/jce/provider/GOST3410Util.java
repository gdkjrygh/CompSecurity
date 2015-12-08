// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.crypto.params.GOST3410PrivateKeyParameters;
import org.bouncycastle.crypto.params.GOST3410PublicKeyParameters;
import org.bouncycastle.jce.interfaces.GOST3410Params;
import org.bouncycastle.jce.interfaces.GOST3410PrivateKey;
import org.bouncycastle.jce.interfaces.GOST3410PublicKey;
import org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec;

public class GOST3410Util
{

    public GOST3410Util()
    {
    }

    public static AsymmetricKeyParameter generatePrivateKeyParameter(PrivateKey privatekey)
        throws InvalidKeyException
    {
        if (privatekey instanceof GOST3410PrivateKey)
        {
            privatekey = (GOST3410PrivateKey)privatekey;
            GOST3410PublicKeyParameterSetSpec gost3410publickeyparametersetspec = privatekey.getParameters().getPublicKeyParameters();
            return new GOST3410PrivateKeyParameters(privatekey.getX(), new GOST3410Parameters(gost3410publickeyparametersetspec.getP(), gost3410publickeyparametersetspec.getQ(), gost3410publickeyparametersetspec.getA()));
        } else
        {
            throw new InvalidKeyException("can't identify GOST3410 private key.");
        }
    }

    public static AsymmetricKeyParameter generatePublicKeyParameter(PublicKey publickey)
        throws InvalidKeyException
    {
        if (publickey instanceof GOST3410PublicKey)
        {
            publickey = (GOST3410PublicKey)publickey;
            GOST3410PublicKeyParameterSetSpec gost3410publickeyparametersetspec = publickey.getParameters().getPublicKeyParameters();
            return new GOST3410PublicKeyParameters(publickey.getY(), new GOST3410Parameters(gost3410publickeyparametersetspec.getP(), gost3410publickeyparametersetspec.getQ(), gost3410publickeyparametersetspec.getA()));
        } else
        {
            throw new InvalidKeyException((new StringBuilder()).append("can't identify GOST3410 public key: ").append(publickey.getClass().getName()).toString());
        }
    }
}

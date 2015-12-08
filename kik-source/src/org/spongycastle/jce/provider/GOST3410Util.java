// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.GOST3410Parameters;
import org.spongycastle.crypto.params.GOST3410PrivateKeyParameters;
import org.spongycastle.crypto.params.GOST3410PublicKeyParameters;
import org.spongycastle.jce.interfaces.GOST3410Params;
import org.spongycastle.jce.interfaces.GOST3410PrivateKey;
import org.spongycastle.jce.interfaces.GOST3410PublicKey;
import org.spongycastle.jce.spec.GOST3410PublicKeyParameterSetSpec;

public class GOST3410Util
{

    public GOST3410Util()
    {
    }

    public static AsymmetricKeyParameter a(PrivateKey privatekey)
    {
        if (privatekey instanceof GOST3410PrivateKey)
        {
            privatekey = (GOST3410PrivateKey)privatekey;
            GOST3410PublicKeyParameterSetSpec gost3410publickeyparametersetspec = privatekey.b().d();
            return new GOST3410PrivateKeyParameters(privatekey.c(), new GOST3410Parameters(gost3410publickeyparametersetspec.a(), gost3410publickeyparametersetspec.b(), gost3410publickeyparametersetspec.c()));
        } else
        {
            throw new InvalidKeyException("can't identify GOST3410 private key.");
        }
    }

    public static AsymmetricKeyParameter a(PublicKey publickey)
    {
        if (publickey instanceof GOST3410PublicKey)
        {
            publickey = (GOST3410PublicKey)publickey;
            GOST3410PublicKeyParameterSetSpec gost3410publickeyparametersetspec = publickey.b().d();
            return new GOST3410PublicKeyParameters(publickey.a(), new GOST3410Parameters(gost3410publickeyparametersetspec.a(), gost3410publickeyparametersetspec.b(), gost3410publickeyparametersetspec.c()));
        } else
        {
            throw new InvalidKeyException((new StringBuilder("can't identify GOST3410 public key: ")).append(publickey.getClass().getName()).toString());
        }
    }
}

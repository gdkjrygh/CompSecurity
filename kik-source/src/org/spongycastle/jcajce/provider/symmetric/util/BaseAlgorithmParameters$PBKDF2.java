// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric.util;

import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.PBEParameterSpec;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.pkcs.PBKDF2Params;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric.util:
//            BaseAlgorithmParameters

public static class  extends BaseAlgorithmParameters
{

    PBKDF2Params a;

    protected final AlgorithmParameterSpec a(Class class1)
    {
        if (class1 == javax/crypto/spec/PBEParameterSpec)
        {
            return new PBEParameterSpec(a.c(), a.d().intValue());
        } else
        {
            throw new InvalidParameterSpecException("unknown parameter spec passed to PKCS12 PBE parameters object.");
        }
    }

    protected byte[] engineGetEncoded()
    {
        byte abyte0[];
        try
        {
            abyte0 = a.a("DER");
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException((new StringBuilder("Oooops! ")).append(ioexception.toString()).toString());
        }
        return abyte0;
    }

    protected byte[] engineGetEncoded(String s)
    {
        if (a(s))
        {
            return engineGetEncoded();
        } else
        {
            return null;
        }
    }

    protected void engineInit(AlgorithmParameterSpec algorithmparameterspec)
    {
        if (!(algorithmparameterspec instanceof PBEParameterSpec))
        {
            throw new InvalidParameterSpecException("PBEParameterSpec required to initialise a PKCS12 PBE parameters algorithm parameters object");
        } else
        {
            algorithmparameterspec = (PBEParameterSpec)algorithmparameterspec;
            a = new PBKDF2Params(algorithmparameterspec.getSalt(), algorithmparameterspec.getIterationCount());
            return;
        }
    }

    protected void engineInit(byte abyte0[])
    {
        a = PBKDF2Params.a(ASN1Primitive.a(abyte0));
    }

    protected void engineInit(byte abyte0[], String s)
    {
        if (a(s))
        {
            engineInit(abyte0);
            return;
        } else
        {
            throw new IOException("Unknown parameters format in PWRIKEK parameters object");
        }
    }

    protected String engineToString()
    {
        return "PBKDF2 Parameters";
    }

    public ()
    {
    }
}

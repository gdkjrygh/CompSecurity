// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric.util;

import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.pkcs.PKCS12PBEParams;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric.util:
//            BaseAlgorithmParameters

public static class  extends BaseAlgorithmParameters
{

    PKCS12PBEParams params;

    protected byte[] engineGetEncoded()
    {
        byte abyte0[];
        try
        {
            abyte0 = params.getEncoded("DER");
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException((new StringBuilder()).append("Oooops! ").append(ioexception.toString()).toString());
        }
        return abyte0;
    }

    protected byte[] engineGetEncoded(String s)
    {
        if (isASN1FormatString(s))
        {
            return engineGetEncoded();
        } else
        {
            return null;
        }
    }

    protected void engineInit(AlgorithmParameterSpec algorithmparameterspec)
        throws InvalidParameterSpecException
    {
        if (!(algorithmparameterspec instanceof PBEParameterSpec))
        {
            throw new InvalidParameterSpecException("PBEParameterSpec required to initialise a PKCS12 PBE parameters algorithm parameters object");
        } else
        {
            algorithmparameterspec = (PBEParameterSpec)algorithmparameterspec;
            params = new PKCS12PBEParams(algorithmparameterspec.getSalt(), algorithmparameterspec.getIterationCount());
            return;
        }
    }

    protected void engineInit(byte abyte0[])
        throws IOException
    {
        params = PKCS12PBEParams.getInstance(ASN1Primitive.fromByteArray(abyte0));
    }

    protected void engineInit(byte abyte0[], String s)
        throws IOException
    {
        if (isASN1FormatString(s))
        {
            engineInit(abyte0);
            return;
        } else
        {
            throw new IOException("Unknown parameters format in PKCS12 PBE parameters object");
        }
    }

    protected String engineToString()
    {
        return "PKCS12 PBE Parameters";
    }

    protected AlgorithmParameterSpec localEngineGetParameterSpec(Class class1)
        throws InvalidParameterSpecException
    {
        if (class1 == javax/crypto/spec/PBEParameterSpec)
        {
            return new PBEParameterSpec(params.getIV(), params.getIterations().intValue());
        } else
        {
            throw new InvalidParameterSpecException("unknown parameter spec passed to PKCS12 PBE parameters object.");
        }
    }

    public ()
    {
    }
}

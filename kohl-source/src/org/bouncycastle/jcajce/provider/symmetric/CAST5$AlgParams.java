// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.misc.CAST5CBCParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric:
//            CAST5

public static class keyLength extends BaseAlgorithmParameters
{

    private byte iv[];
    private int keyLength;

    protected byte[] engineGetEncoded()
    {
        byte abyte0[] = new byte[iv.length];
        System.arraycopy(iv, 0, abyte0, 0, iv.length);
        return abyte0;
    }

    protected byte[] engineGetEncoded(String s)
        throws IOException
    {
        if (isASN1FormatString(s))
        {
            return (new CAST5CBCParameters(engineGetEncoded(), keyLength)).getEncoded();
        }
        if (s.equals("RAW"))
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
        if (algorithmparameterspec instanceof IvParameterSpec)
        {
            iv = ((IvParameterSpec)algorithmparameterspec).getIV();
            return;
        } else
        {
            throw new InvalidParameterSpecException("IvParameterSpec required to initialise a CAST5 parameters algorithm parameters object");
        }
    }

    protected void engineInit(byte abyte0[])
        throws IOException
    {
        iv = new byte[abyte0.length];
        System.arraycopy(abyte0, 0, iv, 0, iv.length);
    }

    protected void engineInit(byte abyte0[], String s)
        throws IOException
    {
        if (isASN1FormatString(s))
        {
            abyte0 = CAST5CBCParameters.getInstance((new ASN1InputStream(abyte0)).readObject());
            keyLength = abyte0.getKeyLength();
            iv = abyte0.getIV();
            return;
        }
        if (s.equals("RAW"))
        {
            engineInit(abyte0);
            return;
        } else
        {
            throw new IOException("Unknown parameters format in IV parameters object");
        }
    }

    protected String engineToString()
    {
        return "CAST5 Parameters";
    }

    protected AlgorithmParameterSpec localEngineGetParameterSpec(Class class1)
        throws InvalidParameterSpecException
    {
        if (class1 == javax/crypto/spec/IvParameterSpec)
        {
            return new IvParameterSpec(iv);
        } else
        {
            throw new InvalidParameterSpecException("unknown parameter spec passed to CAST5 parameters object.");
        }
    }

    public hmParameters()
    {
        keyLength = 128;
    }
}

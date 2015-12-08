// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.symmetric;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.misc.CAST5CBCParameters;
import org.bouncycastle.jce.provider.JDKAlgorithmParameters;

// Referenced classes of package org.bouncycastle.jce.provider.symmetric:
//            CAST5

public static class b extends JDKAlgorithmParameters
{

    private byte a[];
    private int b;

    protected final AlgorithmParameterSpec a(Class class1)
    {
        if (class1 == javax/crypto/spec/IvParameterSpec)
        {
            return new IvParameterSpec(a);
        } else
        {
            throw new InvalidParameterSpecException("unknown parameter spec passed to CAST5 parameters object.");
        }
    }

    protected byte[] engineGetEncoded()
    {
        byte abyte0[] = new byte[a.length];
        System.arraycopy(a, 0, abyte0, 0, a.length);
        return abyte0;
    }

    protected byte[] engineGetEncoded(String s)
    {
        if (a(s))
        {
            return (new CAST5CBCParameters(engineGetEncoded(), b)).a();
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
    {
        if (algorithmparameterspec instanceof IvParameterSpec)
        {
            a = ((IvParameterSpec)algorithmparameterspec).getIV();
            return;
        } else
        {
            throw new InvalidParameterSpecException("IvParameterSpec required to initialise a CAST5 parameters algorithm parameters object");
        }
    }

    protected void engineInit(byte abyte0[])
    {
        a = new byte[abyte0.length];
        System.arraycopy(abyte0, 0, a, 0, a.length);
    }

    protected void engineInit(byte abyte0[], String s)
    {
        if (a(s))
        {
            abyte0 = CAST5CBCParameters.a((new ASN1InputStream(abyte0)).a());
            b = abyte0.f();
            a = abyte0.e();
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

    public ()
    {
        b = 128;
    }
}

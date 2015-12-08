// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.pkcs.DHParameter;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JDKAlgorithmParameters

public static class  extends JDKAlgorithmParameters
{

    DHParameterSpec a;

    protected final AlgorithmParameterSpec a(Class class1)
    {
        if (class1 == javax/crypto/spec/DHParameterSpec)
        {
            return a;
        } else
        {
            throw new InvalidParameterSpecException("unknown parameter spec passed to DH parameters object.");
        }
    }

    protected byte[] engineGetEncoded()
    {
        DHParameter dhparameter = new DHParameter(a.getP(), a.getG(), a.getL());
        byte abyte0[];
        try
        {
            abyte0 = dhparameter.a("DER");
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException("Error encoding DHParameters");
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
        if (!(algorithmparameterspec instanceof DHParameterSpec))
        {
            throw new InvalidParameterSpecException("DHParameterSpec required to initialise a Diffie-Hellman algorithm parameters object");
        } else
        {
            a = (DHParameterSpec)algorithmparameterspec;
            return;
        }
    }

    protected void engineInit(byte abyte0[])
    {
        try
        {
            abyte0 = new DHParameter((ASN1Sequence)ASN1Object.a(abyte0));
            if (abyte0.g() != null)
            {
                a = new DHParameterSpec(abyte0.e(), abyte0.f(), abyte0.g().intValue());
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IOException("Not a valid DH Parameter encoding.");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IOException("Not a valid DH Parameter encoding.");
        }
        a = new DHParameterSpec(abyte0.e(), abyte0.f());
        return;
    }

    protected void engineInit(byte abyte0[], String s)
    {
        if (a(s))
        {
            engineInit(abyte0);
            return;
        } else
        {
            throw new IOException((new StringBuilder("Unknown parameter format ")).append(s).toString());
        }
    }

    protected String engineToString()
    {
        return "Diffie-Hellman Parameters";
    }

    public ()
    {
    }
}

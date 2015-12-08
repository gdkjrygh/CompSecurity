// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.dh;

import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.DHParameterSpec;
import org.spongycastle.asn1.pkcs.DHParameter;

public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi
{

    DHParameterSpec a;

    public AlgorithmParametersSpi()
    {
    }

    private static boolean a(String s)
    {
        return s == null || s.equals("ASN.1");
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

    protected AlgorithmParameterSpec engineGetParameterSpec(Class class1)
    {
        if (class1 == null)
        {
            throw new NullPointerException("argument to getParameterSpec must not be null");
        }
        if (class1 == javax/crypto/spec/DHParameterSpec)
        {
            return a;
        } else
        {
            throw new InvalidParameterSpecException("unknown parameter spec passed to DH parameters object.");
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
            abyte0 = DHParameter.a(abyte0);
            if (abyte0.e() != null)
            {
                a = new DHParameterSpec(abyte0.c(), abyte0.d(), abyte0.e().intValue());
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
        a = new DHParameterSpec(abyte0.c(), abyte0.d());
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
}

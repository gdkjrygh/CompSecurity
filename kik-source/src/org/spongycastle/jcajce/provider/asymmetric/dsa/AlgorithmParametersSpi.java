// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.dsa;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.x509.DSAParameter;

public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi
{

    DSAParameterSpec a;

    public AlgorithmParametersSpi()
    {
    }

    private static boolean a(String s)
    {
        return s == null || s.equals("ASN.1");
    }

    protected byte[] engineGetEncoded()
    {
        DSAParameter dsaparameter = new DSAParameter(a.getP(), a.getQ(), a.getG());
        byte abyte0[];
        try
        {
            abyte0 = dsaparameter.a("DER");
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException("Error encoding DSAParameters");
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
        if (class1 == java/security/spec/DSAParameterSpec)
        {
            return a;
        } else
        {
            throw new InvalidParameterSpecException("unknown parameter spec passed to DSA parameters object.");
        }
    }

    protected void engineInit(AlgorithmParameterSpec algorithmparameterspec)
    {
        if (!(algorithmparameterspec instanceof DSAParameterSpec))
        {
            throw new InvalidParameterSpecException("DSAParameterSpec required to initialise a DSA algorithm parameters object");
        } else
        {
            a = (DSAParameterSpec)algorithmparameterspec;
            return;
        }
    }

    protected void engineInit(byte abyte0[])
    {
        try
        {
            abyte0 = new DSAParameter((ASN1Sequence)ASN1Primitive.a(abyte0));
            a = new DSAParameterSpec(abyte0.c(), abyte0.d(), abyte0.e());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IOException("Not a valid DSA Parameter encoding.");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IOException("Not a valid DSA Parameter encoding.");
        }
    }

    protected void engineInit(byte abyte0[], String s)
    {
        if (a(s) || s.equalsIgnoreCase("X.509"))
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
        return "DSA Parameters";
    }
}

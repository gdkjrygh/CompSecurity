// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.elgamal;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.DHParameterSpec;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.oiw.ElGamalParameter;
import org.spongycastle.jce.provider.JDKAlgorithmParameters;
import org.spongycastle.jce.spec.ElGamalParameterSpec;

public class AlgorithmParametersSpi extends JDKAlgorithmParameters
{

    ElGamalParameterSpec a;

    public AlgorithmParametersSpi()
    {
    }

    protected final AlgorithmParameterSpec a(Class class1)
    {
        if (class1 == org/spongycastle/jce/spec/ElGamalParameterSpec)
        {
            return a;
        }
        if (class1 == javax/crypto/spec/DHParameterSpec)
        {
            return new DHParameterSpec(a.a(), a.b());
        } else
        {
            throw new InvalidParameterSpecException("unknown parameter spec passed to ElGamal parameters object.");
        }
    }

    protected byte[] engineGetEncoded()
    {
        ElGamalParameter elgamalparameter = new ElGamalParameter(a.a(), a.b());
        byte abyte0[];
        try
        {
            abyte0 = elgamalparameter.a("DER");
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException("Error encoding ElGamalParameters");
        }
        return abyte0;
    }

    protected byte[] engineGetEncoded(String s)
    {
        if (a(s) || s.equalsIgnoreCase("X.509"))
        {
            return engineGetEncoded();
        } else
        {
            return null;
        }
    }

    protected void engineInit(AlgorithmParameterSpec algorithmparameterspec)
    {
        if (!(algorithmparameterspec instanceof ElGamalParameterSpec) && !(algorithmparameterspec instanceof DHParameterSpec))
        {
            throw new InvalidParameterSpecException("DHParameterSpec required to initialise a ElGamal algorithm parameters object");
        }
        if (algorithmparameterspec instanceof ElGamalParameterSpec)
        {
            a = (ElGamalParameterSpec)algorithmparameterspec;
            return;
        } else
        {
            algorithmparameterspec = (DHParameterSpec)algorithmparameterspec;
            a = new ElGamalParameterSpec(algorithmparameterspec.getP(), algorithmparameterspec.getG());
            return;
        }
    }

    protected void engineInit(byte abyte0[])
    {
        try
        {
            abyte0 = new ElGamalParameter((ASN1Sequence)ASN1Primitive.a(abyte0));
            a = new ElGamalParameterSpec(abyte0.c(), abyte0.d());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IOException("Not a valid ElGamal Parameter encoding.");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IOException("Not a valid ElGamal Parameter encoding.");
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
        return "ElGamal Parameters";
    }
}

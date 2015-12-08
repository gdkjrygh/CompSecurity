// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JDKAlgorithmParameters, d

public static class  extends JDKAlgorithmParameters
{

    PSSParameterSpec a;

    protected final AlgorithmParameterSpec a(Class class1)
    {
        if (class1 == java/security/spec/PSSParameterSpec && a != null)
        {
            return a;
        } else
        {
            throw new InvalidParameterSpecException("unknown parameter spec passed to PSS parameters object.");
        }
    }

    protected byte[] engineGetEncoded()
    {
        PSSParameterSpec pssparameterspec = a;
        AlgorithmIdentifier algorithmidentifier = new AlgorithmIdentifier(d.b(pssparameterspec.getDigestAlgorithm()), new DERNull());
        MGF1ParameterSpec mgf1parameterspec = (MGF1ParameterSpec)pssparameterspec.getMGFParameters();
        return (new RSASSAPSSparams(algorithmidentifier, new AlgorithmIdentifier(PKCSObjectIdentifiers.l_, new AlgorithmIdentifier(d.b(mgf1parameterspec.getDigestAlgorithm()), new DERNull())), new DERInteger(pssparameterspec.getSaltLength()), new DERInteger(pssparameterspec.getTrailerField()))).a("DER");
    }

    protected byte[] engineGetEncoded(String s)
    {
        if (s.equalsIgnoreCase("X.509") || s.equalsIgnoreCase("ASN.1"))
        {
            return engineGetEncoded();
        } else
        {
            return null;
        }
    }

    protected void engineInit(AlgorithmParameterSpec algorithmparameterspec)
    {
        if (!(algorithmparameterspec instanceof PSSParameterSpec))
        {
            throw new InvalidParameterSpecException("PSSParameterSpec required to initialise an PSS algorithm parameters object");
        } else
        {
            a = (PSSParameterSpec)algorithmparameterspec;
            return;
        }
    }

    protected void engineInit(byte abyte0[])
    {
        try
        {
            abyte0 = new RSASSAPSSparams((ASN1Sequence)ASN1Object.a(abyte0));
            a = new PSSParameterSpec(abyte0.e().e().e(), abyte0.f().e().e(), new MGF1ParameterSpec(AlgorithmIdentifier.b(abyte0.f().g()).e().e()), abyte0.g().e().intValue(), abyte0.h().e().intValue());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IOException("Not a valid PSS Parameter encoding.");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IOException("Not a valid PSS Parameter encoding.");
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
        return "PSS Parameters";
    }

    public ()
    {
    }
}

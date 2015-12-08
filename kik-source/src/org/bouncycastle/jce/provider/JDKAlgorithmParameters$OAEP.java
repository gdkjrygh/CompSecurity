// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSAESOAEPparams;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JDKAlgorithmParameters, d

public static class  extends JDKAlgorithmParameters
{

    OAEPParameterSpec a;

    protected final AlgorithmParameterSpec a(Class class1)
    {
        if (class1 == javax/crypto/spec/OAEPParameterSpec && a != null)
        {
            return a;
        } else
        {
            throw new InvalidParameterSpecException("unknown parameter spec passed to OAEP parameters object.");
        }
    }

    protected byte[] engineGetEncoded()
    {
        Object obj = new AlgorithmIdentifier(d.b(a.getDigestAlgorithm()), new DERNull());
        Object obj1 = (MGF1ParameterSpec)a.getMGFParameters();
        obj1 = new AlgorithmIdentifier(PKCSObjectIdentifiers.l_, new AlgorithmIdentifier(d.b(((MGF1ParameterSpec) (obj1)).getDigestAlgorithm()), new DERNull()));
        javax.crypto.spec.  = (javax.crypto.spec.Algorithm)a.getPSource();
        obj = new RSAESOAEPparams(((AlgorithmIdentifier) (obj)), ((AlgorithmIdentifier) (obj1)), new AlgorithmIdentifier(PKCSObjectIdentifiers.j, new DEROctetString(.j())));
        byte abyte0[];
        try
        {
            abyte0 = ((RSAESOAEPparams) (obj)).a("DER");
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException("Error encoding OAEPParameters");
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
        if (!(algorithmparameterspec instanceof OAEPParameterSpec))
        {
            throw new InvalidParameterSpecException("OAEPParameterSpec required to initialise an OAEP algorithm parameters object");
        } else
        {
            a = (OAEPParameterSpec)algorithmparameterspec;
            return;
        }
    }

    protected void engineInit(byte abyte0[])
    {
        try
        {
            abyte0 = new RSAESOAEPparams((ASN1Sequence)ASN1Object.a(abyte0));
            a = new OAEPParameterSpec(abyte0.e().e().e(), abyte0.f().e().e(), new MGF1ParameterSpec(AlgorithmIdentifier.b(abyte0.f().g()).e().e()), new javax.crypto.spec..e(ASN1OctetString.a(abyte0.g().g()).f()));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IOException("Not a valid OAEP Parameter encoding.");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IOException("Not a valid OAEP Parameter encoding.");
        }
    }

    protected void engineInit(byte abyte0[], String s)
    {
        if (s.equalsIgnoreCase("X.509") || s.equalsIgnoreCase("ASN.1"))
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
        return "OAEP Parameters";
    }

    public ()
    {
    }
}

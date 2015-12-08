// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.RSAPublicKeyStructure;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.RSAKeyParameters;

public class JCERSAPublicKey
    implements RSAPublicKey
{

    private BigInteger a;
    private BigInteger b;

    JCERSAPublicKey(RSAPublicKey rsapublickey)
    {
        a = rsapublickey.getModulus();
        b = rsapublickey.getPublicExponent();
    }

    JCERSAPublicKey(RSAPublicKeySpec rsapublickeyspec)
    {
        a = rsapublickeyspec.getModulus();
        b = rsapublickeyspec.getPublicExponent();
    }

    JCERSAPublicKey(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        try
        {
            subjectpublickeyinfo = new RSAPublicKeyStructure((ASN1Sequence)subjectpublickeyinfo.f());
            a = subjectpublickeyinfo.e();
            b = subjectpublickeyinfo.f();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SubjectPublicKeyInfo subjectpublickeyinfo)
        {
            throw new IllegalArgumentException("invalid info structure in RSA public key");
        }
    }

    JCERSAPublicKey(RSAKeyParameters rsakeyparameters)
    {
        a = rsakeyparameters.getModulus();
        b = rsakeyparameters.getExponent();
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof RSAPublicKey))
            {
                return false;
            }
            obj = (RSAPublicKey)obj;
            if (!getModulus().equals(((RSAPublicKey) (obj)).getModulus()) || !getPublicExponent().equals(((RSAPublicKey) (obj)).getPublicExponent()))
            {
                return false;
            }
        }
        return true;
    }

    public String getAlgorithm()
    {
        return "RSA";
    }

    public byte[] getEncoded()
    {
        return (new SubjectPublicKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.h_, new DERNull()), (new RSAPublicKeyStructure(getModulus(), getPublicExponent())).c())).b();
    }

    public String getFormat()
    {
        return "X.509";
    }

    public BigInteger getModulus()
    {
        return a;
    }

    public BigInteger getPublicExponent()
    {
        return b;
    }

    public int hashCode()
    {
        return getModulus().hashCode() ^ getPublicExponent().hashCode();
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        String s = System.getProperty("line.separator");
        stringbuffer.append("RSA Public Key").append(s);
        stringbuffer.append("            modulus: ").append(getModulus().toString(16)).append(s);
        stringbuffer.append("    public exponent: ").append(getPublicExponent().toString(16)).append(s);
        return stringbuffer.toString();
    }
}

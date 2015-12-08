// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import org.spongycastle.asn1.DERInteger;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.DSAParameter;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;

public class JDKDSAPublicKey
    implements DSAPublicKey
{

    private BigInteger a;
    private DSAParams b;

    public boolean equals(Object obj)
    {
        if (obj instanceof DSAPublicKey)
        {
            if (getY().equals(((DSAPublicKey) (obj = (DSAPublicKey)obj)).getY()) && getParams().getG().equals(((DSAPublicKey) (obj)).getParams().getG()) && getParams().getP().equals(((DSAPublicKey) (obj)).getParams().getP()) && getParams().getQ().equals(((DSAPublicKey) (obj)).getParams().getQ()))
            {
                return true;
            }
        }
        return false;
    }

    public String getAlgorithm()
    {
        return "DSA";
    }

    public byte[] getEncoded()
    {
        byte abyte0[];
        try
        {
            if (b == null)
            {
                return (new SubjectPublicKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.U), new DERInteger(a))).a("DER");
            }
            abyte0 = (new SubjectPublicKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.U, new DSAParameter(b.getP(), b.getQ(), b.getG())), new DERInteger(a))).a("DER");
        }
        catch (IOException ioexception)
        {
            return null;
        }
        return abyte0;
    }

    public String getFormat()
    {
        return "X.509";
    }

    public DSAParams getParams()
    {
        return b;
    }

    public BigInteger getY()
    {
        return a;
    }

    public int hashCode()
    {
        return getY().hashCode() ^ getParams().getG().hashCode() ^ getParams().getP().hashCode() ^ getParams().getQ().hashCode();
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        String s = System.getProperty("line.separator");
        stringbuffer.append("DSA Public Key").append(s);
        stringbuffer.append("            y: ").append(getY().toString(16)).append(s);
        return stringbuffer.toString();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DERInteger;
import org.spongycastle.asn1.DERObjectIdentifier;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.DSAParameter;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;
import org.spongycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.spongycastle.jce.interfaces.PKCS12BagAttributeCarrier;

public class JDKDSAPrivateKey
    implements DSAPrivateKey, PKCS12BagAttributeCarrier
{

    BigInteger a;
    DSAParams b;
    private PKCS12BagAttributeCarrierImpl c;

    protected JDKDSAPrivateKey()
    {
        c = new PKCS12BagAttributeCarrierImpl();
    }

    public final Enumeration a()
    {
        return c.a();
    }

    public final ASN1Encodable a(DERObjectIdentifier derobjectidentifier)
    {
        return c.a(derobjectidentifier);
    }

    public final void a(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        c.a(asn1objectidentifier, asn1encodable);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DSAPrivateKey)
        {
            if (getX().equals(((DSAPrivateKey) (obj = (DSAPrivateKey)obj)).getX()) && getParams().getG().equals(((DSAPrivateKey) (obj)).getParams().getG()) && getParams().getP().equals(((DSAPrivateKey) (obj)).getParams().getP()) && getParams().getQ().equals(((DSAPrivateKey) (obj)).getParams().getQ()))
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
            abyte0 = (new PrivateKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.U, new DSAParameter(b.getP(), b.getQ(), b.getG())), new DERInteger(getX()))).a("DER");
        }
        catch (IOException ioexception)
        {
            return null;
        }
        return abyte0;
    }

    public String getFormat()
    {
        return "PKCS#8";
    }

    public DSAParams getParams()
    {
        return b;
    }

    public BigInteger getX()
    {
        return a;
    }

    public int hashCode()
    {
        return getX().hashCode() ^ getParams().getG().hashCode() ^ getParams().getP().hashCode() ^ getParams().getQ().hashCode();
    }
}

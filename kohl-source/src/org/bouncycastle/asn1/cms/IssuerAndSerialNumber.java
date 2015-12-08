// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.X509CertificateStructure;
import org.bouncycastle.asn1.x509.X509Name;

public class IssuerAndSerialNumber extends ASN1Object
{

    private X500Name name;
    private ASN1Integer serialNumber;

    public IssuerAndSerialNumber(ASN1Sequence asn1sequence)
    {
        name = X500Name.getInstance(asn1sequence.getObjectAt(0));
        serialNumber = (ASN1Integer)asn1sequence.getObjectAt(1);
    }

    public IssuerAndSerialNumber(X500Name x500name, BigInteger biginteger)
    {
        name = x500name;
        serialNumber = new ASN1Integer(biginteger);
    }

    public IssuerAndSerialNumber(Certificate certificate)
    {
        name = certificate.getIssuer();
        serialNumber = certificate.getSerialNumber();
    }

    public IssuerAndSerialNumber(X509CertificateStructure x509certificatestructure)
    {
        name = x509certificatestructure.getIssuer();
        serialNumber = x509certificatestructure.getSerialNumber();
    }

    public IssuerAndSerialNumber(X509Name x509name, BigInteger biginteger)
    {
        name = X500Name.getInstance(x509name);
        serialNumber = new ASN1Integer(biginteger);
    }

    public IssuerAndSerialNumber(X509Name x509name, ASN1Integer asn1integer)
    {
        name = X500Name.getInstance(x509name);
        serialNumber = asn1integer;
    }

    public static IssuerAndSerialNumber getInstance(Object obj)
    {
        if (obj instanceof IssuerAndSerialNumber)
        {
            return (IssuerAndSerialNumber)obj;
        }
        if (obj != null)
        {
            return new IssuerAndSerialNumber(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public X500Name getName()
    {
        return name;
    }

    public ASN1Integer getSerialNumber()
    {
        return serialNumber;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(name);
        asn1encodablevector.add(serialNumber);
        return new DERSequence(asn1encodablevector);
    }
}

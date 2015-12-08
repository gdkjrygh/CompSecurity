// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.X509Name;

public class IssuerAndSerialNumber extends ASN1Object
{

    ASN1Integer certSerialNumber;
    X500Name name;

    public IssuerAndSerialNumber(ASN1Sequence asn1sequence)
    {
        name = X500Name.getInstance(asn1sequence.getObjectAt(0));
        certSerialNumber = (ASN1Integer)asn1sequence.getObjectAt(1);
    }

    public IssuerAndSerialNumber(X500Name x500name, BigInteger biginteger)
    {
        name = x500name;
        certSerialNumber = new ASN1Integer(biginteger);
    }

    public IssuerAndSerialNumber(X509Name x509name, BigInteger biginteger)
    {
        name = X500Name.getInstance(x509name.toASN1Primitive());
        certSerialNumber = new ASN1Integer(biginteger);
    }

    public IssuerAndSerialNumber(X509Name x509name, ASN1Integer asn1integer)
    {
        name = X500Name.getInstance(x509name.toASN1Primitive());
        certSerialNumber = asn1integer;
    }

    public static IssuerAndSerialNumber getInstance(Object obj)
    {
        if (obj instanceof IssuerAndSerialNumber)
        {
            return (IssuerAndSerialNumber)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new IssuerAndSerialNumber((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unknown object in factory: ").append(obj.getClass().getName()).toString());
        }
    }

    public ASN1Integer getCertificateSerialNumber()
    {
        return certSerialNumber;
    }

    public X500Name getName()
    {
        return name;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(name);
        asn1encodablevector.add(certSerialNumber);
        return new DERSequence(asn1encodablevector);
    }
}

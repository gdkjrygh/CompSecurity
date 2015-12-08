// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.crmf;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.GeneralName;

public class CertId extends ASN1Object
{

    private GeneralName issuer;
    private ASN1Integer serialNumber;

    private CertId(ASN1Sequence asn1sequence)
    {
        issuer = GeneralName.getInstance(asn1sequence.getObjectAt(0));
        serialNumber = ASN1Integer.getInstance(asn1sequence.getObjectAt(1));
    }

    public CertId(GeneralName generalname, BigInteger biginteger)
    {
        this(generalname, new ASN1Integer(biginteger));
    }

    public CertId(GeneralName generalname, ASN1Integer asn1integer)
    {
        issuer = generalname;
        serialNumber = asn1integer;
    }

    public static CertId getInstance(Object obj)
    {
        if (obj instanceof CertId)
        {
            return (CertId)obj;
        }
        if (obj != null)
        {
            return new CertId(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static CertId getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public GeneralName getIssuer()
    {
        return issuer;
    }

    public ASN1Integer getSerialNumber()
    {
        return serialNumber;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(issuer);
        asn1encodablevector.add(serialNumber);
        return new DERSequence(asn1encodablevector);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.ess;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.IssuerSerial;

public class ESSCertID extends ASN1Object
{

    private ASN1OctetString certHash;
    private IssuerSerial issuerSerial;

    private ESSCertID(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() < 1 || asn1sequence.size() > 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        }
        certHash = ASN1OctetString.getInstance(asn1sequence.getObjectAt(0));
        if (asn1sequence.size() > 1)
        {
            issuerSerial = IssuerSerial.getInstance(asn1sequence.getObjectAt(1));
        }
    }

    public ESSCertID(byte abyte0[])
    {
        certHash = new DEROctetString(abyte0);
    }

    public ESSCertID(byte abyte0[], IssuerSerial issuerserial)
    {
        certHash = new DEROctetString(abyte0);
        issuerSerial = issuerserial;
    }

    public static ESSCertID getInstance(Object obj)
    {
        if (obj instanceof ESSCertID)
        {
            return (ESSCertID)obj;
        }
        if (obj != null)
        {
            return new ESSCertID(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public byte[] getCertHash()
    {
        return certHash.getOctets();
    }

    public IssuerSerial getIssuerSerial()
    {
        return issuerSerial;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(certHash);
        if (issuerSerial != null)
        {
            asn1encodablevector.add(issuerSerial);
        }
        return new DERSequence(asn1encodablevector);
    }
}

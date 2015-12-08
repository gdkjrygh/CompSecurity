// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            AttributeCertificateInfo, AlgorithmIdentifier

public class AttributeCertificate extends ASN1Object
{

    AttributeCertificateInfo acinfo;
    AlgorithmIdentifier signatureAlgorithm;
    DERBitString signatureValue;

    public AttributeCertificate(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() != 3)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        } else
        {
            acinfo = AttributeCertificateInfo.getInstance(asn1sequence.getObjectAt(0));
            signatureAlgorithm = AlgorithmIdentifier.getInstance(asn1sequence.getObjectAt(1));
            signatureValue = DERBitString.getInstance(asn1sequence.getObjectAt(2));
            return;
        }
    }

    public AttributeCertificate(AttributeCertificateInfo attributecertificateinfo, AlgorithmIdentifier algorithmidentifier, DERBitString derbitstring)
    {
        acinfo = attributecertificateinfo;
        signatureAlgorithm = algorithmidentifier;
        signatureValue = derbitstring;
    }

    public static AttributeCertificate getInstance(Object obj)
    {
        if (obj instanceof AttributeCertificate)
        {
            return (AttributeCertificate)obj;
        }
        if (obj != null)
        {
            return new AttributeCertificate(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public AttributeCertificateInfo getAcinfo()
    {
        return acinfo;
    }

    public AlgorithmIdentifier getSignatureAlgorithm()
    {
        return signatureAlgorithm;
    }

    public DERBitString getSignatureValue()
    {
        return signatureValue;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(acinfo);
        asn1encodablevector.add(signatureAlgorithm);
        asn1encodablevector.add(signatureValue);
        return new DERSequence(asn1encodablevector);
    }
}

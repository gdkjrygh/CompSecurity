// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            X509CertificateStructure

public class CertificatePair extends ASN1Object
{

    private X509CertificateStructure forward;
    private X509CertificateStructure reverse;

    private CertificatePair(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() != 1 && asn1sequence.size() != 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        }
        for (asn1sequence = asn1sequence.getObjects(); asn1sequence.hasMoreElements();)
        {
            ASN1TaggedObject asn1taggedobject = ASN1TaggedObject.getInstance(asn1sequence.nextElement());
            if (asn1taggedobject.getTagNo() == 0)
            {
                forward = X509CertificateStructure.getInstance(asn1taggedobject, true);
            } else
            if (asn1taggedobject.getTagNo() == 1)
            {
                reverse = X509CertificateStructure.getInstance(asn1taggedobject, true);
            } else
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Bad tag number: ").append(asn1taggedobject.getTagNo()).toString());
            }
        }

    }

    public CertificatePair(X509CertificateStructure x509certificatestructure, X509CertificateStructure x509certificatestructure1)
    {
        forward = x509certificatestructure;
        reverse = x509certificatestructure1;
    }

    public static CertificatePair getInstance(Object obj)
    {
        if (obj == null || (obj instanceof CertificatePair))
        {
            return (CertificatePair)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new CertificatePair((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    public X509CertificateStructure getForward()
    {
        return forward;
    }

    public X509CertificateStructure getReverse()
    {
        return reverse;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (forward != null)
        {
            asn1encodablevector.add(new DERTaggedObject(0, forward));
        }
        if (reverse != null)
        {
            asn1encodablevector.add(new DERTaggedObject(1, reverse));
        }
        return new DERSequence(asn1encodablevector);
    }
}

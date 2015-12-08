// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.CertificateList;

// Referenced classes of package org.bouncycastle.asn1.cms:
//            ContentInfo

public class TimeStampAndCRL extends ASN1Object
{

    private CertificateList crl;
    private ContentInfo timeStamp;

    private TimeStampAndCRL(ASN1Sequence asn1sequence)
    {
        timeStamp = ContentInfo.getInstance(asn1sequence.getObjectAt(0));
        if (asn1sequence.size() == 2)
        {
            crl = CertificateList.getInstance(asn1sequence.getObjectAt(1));
        }
    }

    public TimeStampAndCRL(ContentInfo contentinfo)
    {
        timeStamp = contentinfo;
    }

    public static TimeStampAndCRL getInstance(Object obj)
    {
        if (obj instanceof TimeStampAndCRL)
        {
            return (TimeStampAndCRL)obj;
        }
        if (obj != null)
        {
            return new TimeStampAndCRL(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public CertificateList getCRL()
    {
        return crl;
    }

    public CertificateList getCertificateList()
    {
        return crl;
    }

    public ContentInfo getTimeStampToken()
    {
        return timeStamp;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(timeStamp);
        if (crl != null)
        {
            asn1encodablevector.add(crl);
        }
        return new DERSequence(asn1encodablevector);
    }
}

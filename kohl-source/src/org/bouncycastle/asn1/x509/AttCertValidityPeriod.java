// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERSequence;

public class AttCertValidityPeriod extends ASN1Object
{

    DERGeneralizedTime notAfterTime;
    DERGeneralizedTime notBeforeTime;

    private AttCertValidityPeriod(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() != 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        } else
        {
            notBeforeTime = DERGeneralizedTime.getInstance(asn1sequence.getObjectAt(0));
            notAfterTime = DERGeneralizedTime.getInstance(asn1sequence.getObjectAt(1));
            return;
        }
    }

    public AttCertValidityPeriod(DERGeneralizedTime dergeneralizedtime, DERGeneralizedTime dergeneralizedtime1)
    {
        notBeforeTime = dergeneralizedtime;
        notAfterTime = dergeneralizedtime1;
    }

    public static AttCertValidityPeriod getInstance(Object obj)
    {
        if (obj instanceof AttCertValidityPeriod)
        {
            return (AttCertValidityPeriod)obj;
        }
        if (obj != null)
        {
            return new AttCertValidityPeriod(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public DERGeneralizedTime getNotAfterTime()
    {
        return notAfterTime;
    }

    public DERGeneralizedTime getNotBeforeTime()
    {
        return notBeforeTime;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(notBeforeTime);
        asn1encodablevector.add(notAfterTime);
        return new DERSequence(asn1encodablevector);
    }
}

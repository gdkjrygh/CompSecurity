// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERGeneralizedTime;
import org.spongycastle.asn1.DERSequence;

public class AttCertValidityPeriod extends ASN1Object
{

    DERGeneralizedTime a;
    DERGeneralizedTime b;

    private AttCertValidityPeriod(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.e() != 2)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.e()).toString());
        } else
        {
            a = DERGeneralizedTime.a(asn1sequence.a(0));
            b = DERGeneralizedTime.a(asn1sequence.a(1));
            return;
        }
    }

    public static AttCertValidityPeriod a(Object obj)
    {
        if (obj instanceof AttCertValidityPeriod)
        {
            return (AttCertValidityPeriod)obj;
        }
        if (obj != null)
        {
            return new AttCertValidityPeriod(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(b);
        return new DERSequence(asn1encodablevector);
    }

    public final DERGeneralizedTime c()
    {
        return a;
    }

    public final DERGeneralizedTime d()
    {
        return b;
    }
}

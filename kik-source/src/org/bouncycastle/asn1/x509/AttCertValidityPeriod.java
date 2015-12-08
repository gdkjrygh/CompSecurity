// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;

public class AttCertValidityPeriod extends ASN1Encodable
{

    DERGeneralizedTime a;
    DERGeneralizedTime b;

    private AttCertValidityPeriod(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.f() != 2)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.f()).toString());
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
        if (obj instanceof ASN1Sequence)
        {
            return new AttCertValidityPeriod((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown object in factory: ")).append(obj.getClass().getName()).toString());
        }
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(b);
        return new DERSequence(asn1encodablevector);
    }

    public final DERGeneralizedTime e()
    {
        return a;
    }

    public final DERGeneralizedTime f()
    {
        return b;
    }
}

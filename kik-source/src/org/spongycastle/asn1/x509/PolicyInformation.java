// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;

public class PolicyInformation extends ASN1Object
{

    private ASN1ObjectIdentifier a;
    private ASN1Sequence b;

    private PolicyInformation(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.e() <= 0 || asn1sequence.e() > 2)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.e()).toString());
        }
        a = ASN1ObjectIdentifier.a(asn1sequence.a(0));
        if (asn1sequence.e() > 1)
        {
            b = ASN1Sequence.a(asn1sequence.a(1));
        }
    }

    public static PolicyInformation a(Object obj)
    {
        if (obj == null || (obj instanceof PolicyInformation))
        {
            return (PolicyInformation)obj;
        } else
        {
            return new PolicyInformation(ASN1Sequence.a(obj));
        }
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        if (b != null)
        {
            asn1encodablevector.a(b);
        }
        return new DERSequence(asn1encodablevector);
    }

    public final ASN1ObjectIdentifier c()
    {
        return a;
    }

    public final ASN1Sequence d()
    {
        return b;
    }
}

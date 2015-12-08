// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;

public class PolicyInformation extends ASN1Encodable
{

    private DERObjectIdentifier a;
    private ASN1Sequence b;

    private PolicyInformation(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.f() <= 0 || asn1sequence.f() > 2)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.f()).toString());
        }
        a = DERObjectIdentifier.a(asn1sequence.a(0));
        if (asn1sequence.f() > 1)
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

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        if (b != null)
        {
            asn1encodablevector.a(b);
        }
        return new DERSequence(asn1encodablevector);
    }

    public final DERObjectIdentifier e()
    {
        return a;
    }

    public final ASN1Sequence f()
    {
        return b;
    }
}

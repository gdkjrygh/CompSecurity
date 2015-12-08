// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

public class SafeBag extends ASN1Encodable
{

    DERObjectIdentifier a;
    DERObject b;
    ASN1Set c;

    public SafeBag(ASN1Sequence asn1sequence)
    {
        a = (DERObjectIdentifier)asn1sequence.a(0);
        b = ((DERTaggedObject)asn1sequence.a(1)).i();
        if (asn1sequence.f() == 3)
        {
            c = (ASN1Set)asn1sequence.a(2);
        }
    }

    public SafeBag(DERObjectIdentifier derobjectidentifier, DERObject derobject, ASN1Set asn1set)
    {
        a = derobjectidentifier;
        b = derobject;
        c = asn1set;
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(new DERTaggedObject(0, b));
        if (c != null)
        {
            asn1encodablevector.a(c);
        }
        return new DERSequence(asn1encodablevector);
    }

    public final DERObjectIdentifier e()
    {
        return a;
    }

    public final DERObject f()
    {
        return b;
    }

    public final ASN1Set g()
    {
        return c;
    }
}

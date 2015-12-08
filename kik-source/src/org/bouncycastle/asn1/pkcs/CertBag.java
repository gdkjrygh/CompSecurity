// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

public class CertBag extends ASN1Encodable
{

    ASN1Sequence a;
    DERObjectIdentifier b;
    DERObject c;

    public CertBag(ASN1Sequence asn1sequence)
    {
        a = asn1sequence;
        b = (DERObjectIdentifier)asn1sequence.a(0);
        c = ((DERTaggedObject)asn1sequence.a(1)).i();
    }

    public CertBag(DERObjectIdentifier derobjectidentifier, DERObject derobject)
    {
        b = derobjectidentifier;
        c = derobject;
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(b);
        asn1encodablevector.a(new DERTaggedObject(0, c));
        return new DERSequence(asn1encodablevector);
    }

    public final DERObjectIdentifier e()
    {
        return b;
    }

    public final DERObject f()
    {
        return c;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DEREnumerated;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            AlgorithmIdentifier

public class ObjectDigestInfo extends ASN1Encodable
{

    DEREnumerated a;
    DERObjectIdentifier b;
    AlgorithmIdentifier c;
    DERBitString d;

    private ObjectDigestInfo(ASN1Sequence asn1sequence)
    {
        int i = 1;
        super();
        if (asn1sequence.f() > 4 || asn1sequence.f() < 3)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.f()).toString());
        }
        a = DEREnumerated.a(asn1sequence.a(0));
        if (asn1sequence.f() == 4)
        {
            b = DERObjectIdentifier.a(asn1sequence.a(1));
        } else
        {
            i = 0;
        }
        c = AlgorithmIdentifier.b(asn1sequence.a(i + 1));
        d = DERBitString.a(asn1sequence.a(i + 2));
    }

    public static ObjectDigestInfo a(ASN1TaggedObject asn1taggedobject)
    {
        asn1taggedobject = ASN1Sequence.a(asn1taggedobject, false);
        if (asn1taggedobject == null || (asn1taggedobject instanceof ObjectDigestInfo))
        {
            return (ObjectDigestInfo)asn1taggedobject;
        }
        if (asn1taggedobject instanceof ASN1Sequence)
        {
            return new ObjectDigestInfo((ASN1Sequence)asn1taggedobject);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("illegal object in getInstance: ")).append(asn1taggedobject.getClass().getName()).toString());
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
        asn1encodablevector.a(c);
        asn1encodablevector.a(d);
        return new DERSequence(asn1encodablevector);
    }

    public final DEREnumerated e()
    {
        return a;
    }

    public final AlgorithmIdentifier f()
    {
        return c;
    }

    public final DERBitString g()
    {
        return d;
    }
}

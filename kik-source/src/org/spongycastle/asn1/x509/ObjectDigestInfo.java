// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Enumerated;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.DEREnumerated;
import org.spongycastle.asn1.DERSequence;

// Referenced classes of package org.spongycastle.asn1.x509:
//            AlgorithmIdentifier

public class ObjectDigestInfo extends ASN1Object
{

    ASN1Enumerated a;
    ASN1ObjectIdentifier b;
    AlgorithmIdentifier c;
    DERBitString d;

    private ObjectDigestInfo(ASN1Sequence asn1sequence)
    {
        int i = 1;
        super();
        if (asn1sequence.e() > 4 || asn1sequence.e() < 3)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.e()).toString());
        }
        a = DEREnumerated.a(asn1sequence.a(0));
        if (asn1sequence.e() == 4)
        {
            b = ASN1ObjectIdentifier.a(asn1sequence.a(1));
        } else
        {
            i = 0;
        }
        c = AlgorithmIdentifier.a(asn1sequence.a(i + 1));
        d = DERBitString.a(asn1sequence.a(i + 2));
    }

    public static ObjectDigestInfo a(ASN1TaggedObject asn1taggedobject)
    {
        asn1taggedobject = ASN1Sequence.a(asn1taggedobject, false);
        if (asn1taggedobject instanceof ObjectDigestInfo)
        {
            return (ObjectDigestInfo)asn1taggedobject;
        }
        if (asn1taggedobject != null)
        {
            return new ObjectDigestInfo(ASN1Sequence.a(asn1taggedobject));
        } else
        {
            return null;
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
        asn1encodablevector.a(c);
        asn1encodablevector.a(d);
        return new DERSequence(asn1encodablevector);
    }

    public final DEREnumerated c()
    {
        return a;
    }

    public final AlgorithmIdentifier d()
    {
        return c;
    }

    public final DERBitString e()
    {
        return d;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1Set;
import org.spongycastle.asn1.DERSequence;

public class Attribute extends ASN1Object
{

    private ASN1ObjectIdentifier a;
    private ASN1Set b;

    private Attribute(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.e() != 2)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.e()).toString());
        } else
        {
            a = ASN1ObjectIdentifier.a(asn1sequence.a(0));
            b = ASN1Set.a(asn1sequence.a(1));
            return;
        }
    }

    public static Attribute a(Object obj)
    {
        if (obj instanceof Attribute)
        {
            return (Attribute)obj;
        }
        if (obj != null)
        {
            return new Attribute(ASN1Sequence.a(obj));
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

    public final ASN1ObjectIdentifier c()
    {
        return new ASN1ObjectIdentifier(a.c());
    }
}

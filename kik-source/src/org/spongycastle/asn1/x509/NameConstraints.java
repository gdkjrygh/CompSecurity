// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;

public class NameConstraints extends ASN1Object
{

    private ASN1Sequence a;
    private ASN1Sequence b;

    private NameConstraints(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.d();
        do
        {
            if (!asn1sequence.hasMoreElements())
            {
                break;
            }
            ASN1TaggedObject asn1taggedobject = ASN1TaggedObject.a(asn1sequence.nextElement());
            switch (asn1taggedobject.c())
            {
            case 0: // '\0'
                a = ASN1Sequence.a(asn1taggedobject, false);
                break;

            case 1: // '\001'
                b = ASN1Sequence.a(asn1taggedobject, false);
                break;
            }
        } while (true);
    }

    public static NameConstraints a(Object obj)
    {
        if (obj instanceof NameConstraints)
        {
            return (NameConstraints)obj;
        }
        if (obj != null)
        {
            return new NameConstraints(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (a != null)
        {
            asn1encodablevector.a(new DERTaggedObject(false, 0, a));
        }
        if (b != null)
        {
            asn1encodablevector.a(new DERTaggedObject(false, 1, b));
        }
        return new DERSequence(asn1encodablevector);
    }

    public final ASN1Sequence c()
    {
        return a;
    }

    public final ASN1Sequence d()
    {
        return b;
    }
}

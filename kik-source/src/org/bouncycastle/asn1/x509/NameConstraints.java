// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

public class NameConstraints extends ASN1Encodable
{

    private ASN1Sequence a;
    private ASN1Sequence b;

    public NameConstraints(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.e();
        do
        {
            if (!asn1sequence.hasMoreElements())
            {
                break;
            }
            ASN1TaggedObject asn1taggedobject = ASN1TaggedObject.a(asn1sequence.nextElement());
            switch (asn1taggedobject.e())
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

    public final DERObject d()
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

    public final ASN1Sequence e()
    {
        return a;
    }

    public final ASN1Sequence f()
    {
        return b;
    }
}

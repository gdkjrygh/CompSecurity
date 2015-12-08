// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x9;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;

// Referenced classes of package org.spongycastle.asn1.x9:
//            X9ObjectIdentifiers

public class X9FieldID extends ASN1Object
    implements X9ObjectIdentifiers
{

    private ASN1ObjectIdentifier al;
    private ASN1Primitive am;

    public X9FieldID(int i, int j, int k, int l)
    {
        al = d;
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(new ASN1Integer(i));
        if (k == 0)
        {
            asn1encodablevector.a(f);
            asn1encodablevector.a(new ASN1Integer(j));
        } else
        {
            asn1encodablevector.a(g);
            ASN1EncodableVector asn1encodablevector1 = new ASN1EncodableVector();
            asn1encodablevector1.a(new ASN1Integer(j));
            asn1encodablevector1.a(new ASN1Integer(k));
            asn1encodablevector1.a(new ASN1Integer(l));
            asn1encodablevector.a(new DERSequence(asn1encodablevector1));
        }
        am = new DERSequence(asn1encodablevector);
    }

    public X9FieldID(BigInteger biginteger)
    {
        al = c;
        am = new ASN1Integer(biginteger);
    }

    public X9FieldID(ASN1Sequence asn1sequence)
    {
        al = (ASN1ObjectIdentifier)asn1sequence.a(0);
        am = (ASN1Primitive)asn1sequence.a(1);
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(al);
        asn1encodablevector.a(am);
        return new DERSequence(asn1encodablevector);
    }

    public final ASN1ObjectIdentifier c()
    {
        return al;
    }

    public final ASN1Primitive d()
    {
        return am;
    }
}

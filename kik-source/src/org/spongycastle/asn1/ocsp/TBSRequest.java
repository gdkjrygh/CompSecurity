// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.ocsp;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x509.Extensions;
import org.spongycastle.asn1.x509.GeneralName;

public class TBSRequest extends ASN1Object
{

    private static final ASN1Integer f = new ASN1Integer(0);
    ASN1Integer a;
    GeneralName b;
    ASN1Sequence c;
    Extensions d;
    boolean e;

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (!a.equals(f) || e)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 0, a));
        }
        if (b != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 1, b));
        }
        asn1encodablevector.a(c);
        if (d != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 2, d));
        }
        return new DERSequence(asn1encodablevector);
    }

    public final Extensions c()
    {
        return d;
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.ocsp;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERGeneralizedTime;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x509.Extensions;

// Referenced classes of package org.spongycastle.asn1.ocsp:
//            ResponderID

public class ResponseData extends ASN1Object
{

    private static final ASN1Integer a = new ASN1Integer(0);
    private boolean b;
    private ASN1Integer c;
    private ResponderID d;
    private DERGeneralizedTime e;
    private ASN1Sequence f;
    private Extensions g;

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (b || !c.equals(a))
        {
            asn1encodablevector.a(new DERTaggedObject(true, 0, c));
        }
        asn1encodablevector.a(d);
        asn1encodablevector.a(e);
        asn1encodablevector.a(f);
        if (g != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 1, g));
        }
        return new DERSequence(asn1encodablevector);
    }

    public final Extensions c()
    {
        return g;
    }

}

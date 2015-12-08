// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.tsp;

import org.spongycastle.asn1.ASN1Boolean;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x509.Extensions;

// Referenced classes of package org.spongycastle.asn1.tsp:
//            MessageImprint

public class TimeStampReq extends ASN1Object
{

    ASN1Integer a;
    MessageImprint b;
    ASN1ObjectIdentifier c;
    ASN1Integer d;
    ASN1Boolean e;
    Extensions f;

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(b);
        if (c != null)
        {
            asn1encodablevector.a(c);
        }
        if (d != null)
        {
            asn1encodablevector.a(d);
        }
        if (e != null && e.d())
        {
            asn1encodablevector.a(e);
        }
        if (f != null)
        {
            asn1encodablevector.a(new DERTaggedObject(false, 0, f));
        }
        return new DERSequence(asn1encodablevector);
    }
}

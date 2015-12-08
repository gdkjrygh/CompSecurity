// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.ocsp;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERGeneralizedTime;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x509.Extensions;

// Referenced classes of package org.spongycastle.asn1.ocsp:
//            CertID, CertStatus

public class SingleResponse extends ASN1Object
{

    private CertID a;
    private CertStatus b;
    private DERGeneralizedTime c;
    private DERGeneralizedTime d;
    private Extensions e;

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(b);
        asn1encodablevector.a(c);
        if (d != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 0, d));
        }
        if (e != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 1, e));
        }
        return new DERSequence(asn1encodablevector);
    }

    public final Extensions c()
    {
        return e;
    }
}

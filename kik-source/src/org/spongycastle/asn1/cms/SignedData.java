// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.cms;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Set;
import org.spongycastle.asn1.BERSequence;
import org.spongycastle.asn1.BERTaggedObject;
import org.spongycastle.asn1.DERTaggedObject;

// Referenced classes of package org.spongycastle.asn1.cms:
//            ContentInfo

public class SignedData extends ASN1Object
{

    private ASN1Integer a;
    private ASN1Set b;
    private ContentInfo c;
    private ASN1Set d;
    private ASN1Set e;
    private ASN1Set f;
    private boolean g;
    private boolean h;

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(b);
        asn1encodablevector.a(c);
        if (d != null)
        {
            if (g)
            {
                asn1encodablevector.a(new BERTaggedObject(false, 0, d));
            } else
            {
                asn1encodablevector.a(new DERTaggedObject(false, 0, d));
            }
        }
        if (e != null)
        {
            if (h)
            {
                asn1encodablevector.a(new BERTaggedObject(false, 1, e));
            } else
            {
                asn1encodablevector.a(new DERTaggedObject(false, 1, e));
            }
        }
        asn1encodablevector.a(f);
        return new BERSequence(asn1encodablevector);
    }
}

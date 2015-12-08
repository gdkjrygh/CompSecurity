// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.cms:
//            ContentInfo

public class SignedData extends ASN1Encodable
{

    private DERInteger a;
    private ASN1Set b;
    private ContentInfo c;
    private ASN1Set d;
    private ASN1Set e;
    private ASN1Set f;
    private boolean g;
    private boolean h;

    public final DERObject d()
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

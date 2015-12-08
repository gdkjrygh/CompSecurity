// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.cms;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Set;
import org.spongycastle.asn1.BERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.spongycastle.asn1.cms:
//            OriginatorInfo, ContentInfo

public class AuthenticatedData extends ASN1Object
{

    private ASN1Integer a;
    private OriginatorInfo b;
    private ASN1Set c;
    private AlgorithmIdentifier d;
    private AlgorithmIdentifier e;
    private ContentInfo f;
    private ASN1Set g;
    private ASN1OctetString h;
    private ASN1Set i;

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        if (b != null)
        {
            asn1encodablevector.a(new DERTaggedObject(false, 0, b));
        }
        asn1encodablevector.a(c);
        asn1encodablevector.a(d);
        if (e != null)
        {
            asn1encodablevector.a(new DERTaggedObject(false, 1, e));
        }
        asn1encodablevector.a(f);
        if (g != null)
        {
            asn1encodablevector.a(new DERTaggedObject(false, 2, g));
        }
        asn1encodablevector.a(h);
        if (i != null)
        {
            asn1encodablevector.a(new DERTaggedObject(false, 3, i));
        }
        return new BERSequence(asn1encodablevector);
    }
}

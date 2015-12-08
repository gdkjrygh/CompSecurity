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

// Referenced classes of package org.spongycastle.asn1.cms:
//            OriginatorInfo, EncryptedContentInfo

public class AuthEnvelopedData extends ASN1Object
{

    private ASN1Integer a;
    private OriginatorInfo b;
    private ASN1Set c;
    private EncryptedContentInfo d;
    private ASN1Set e;
    private ASN1OctetString f;
    private ASN1Set g;

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
        return new BERSequence(asn1encodablevector);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.bouncycastle.asn1.cms:
//            OriginatorInfo, ContentInfo

public class AuthenticatedData extends ASN1Encodable
{

    private DERInteger a;
    private OriginatorInfo b;
    private ASN1Set c;
    private AlgorithmIdentifier d;
    private AlgorithmIdentifier e;
    private ContentInfo f;
    private ASN1Set g;
    private ASN1OctetString h;
    private ASN1Set i;

    public final DERObject d()
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

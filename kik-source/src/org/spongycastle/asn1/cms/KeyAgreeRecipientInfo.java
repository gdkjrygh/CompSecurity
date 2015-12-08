// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.cms;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.spongycastle.asn1.cms:
//            OriginatorIdentifierOrKey

public class KeyAgreeRecipientInfo extends ASN1Object
{

    private ASN1Integer a;
    private OriginatorIdentifierOrKey b;
    private ASN1OctetString c;
    private AlgorithmIdentifier d;
    private ASN1Sequence e;

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(new DERTaggedObject(true, 0, b));
        if (c != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 1, c));
        }
        asn1encodablevector.a(d);
        asn1encodablevector.a(e);
        return new DERSequence(asn1encodablevector);
    }
}

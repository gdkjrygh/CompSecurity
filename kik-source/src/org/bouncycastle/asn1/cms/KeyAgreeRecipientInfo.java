// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.bouncycastle.asn1.cms:
//            OriginatorIdentifierOrKey

public class KeyAgreeRecipientInfo extends ASN1Encodable
{

    private DERInteger a;
    private OriginatorIdentifierOrKey b;
    private ASN1OctetString c;
    private AlgorithmIdentifier d;
    private ASN1Sequence e;

    public final DERObject d()
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

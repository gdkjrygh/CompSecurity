// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;

// Referenced classes of package org.bouncycastle.asn1.cms:
//            CMSObjectIdentifiers

public class ContentInfo extends ASN1Encodable
    implements CMSObjectIdentifiers
{

    private ASN1ObjectIdentifier k;
    private DEREncodable l;

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(k);
        if (l != null)
        {
            asn1encodablevector.a(new BERTaggedObject(l));
        }
        return new BERSequence(asn1encodablevector);
    }
}

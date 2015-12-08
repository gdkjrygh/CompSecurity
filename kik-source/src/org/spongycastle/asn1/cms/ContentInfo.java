// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.cms;

import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.BERSequence;
import org.spongycastle.asn1.BERTaggedObject;

// Referenced classes of package org.spongycastle.asn1.cms:
//            CMSObjectIdentifiers

public class ContentInfo extends ASN1Object
    implements CMSObjectIdentifiers
{

    private ASN1ObjectIdentifier k;
    private ASN1Encodable l;

    public final ASN1Primitive a()
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

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.pkcs:
//            PKCSObjectIdentifiers

public class ContentInfo extends ASN1Encodable
    implements PKCSObjectIdentifiers
{

    private DERObjectIdentifier by;
    private DEREncodable bz;

    private ContentInfo(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.e();
        by = (DERObjectIdentifier)asn1sequence.nextElement();
        if (asn1sequence.hasMoreElements())
        {
            bz = ((DERTaggedObject)asn1sequence.nextElement()).i();
        }
    }

    public ContentInfo(DERObjectIdentifier derobjectidentifier, DEREncodable derencodable)
    {
        by = derobjectidentifier;
        bz = derencodable;
    }

    public static ContentInfo a(Object obj)
    {
        if (obj instanceof ContentInfo)
        {
            return (ContentInfo)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new ContentInfo((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown object in factory: ")).append(obj.getClass().getName()).toString());
        }
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(by);
        if (bz != null)
        {
            asn1encodablevector.a(new BERTaggedObject(bz));
        }
        return new BERSequence(asn1encodablevector);
    }

    public final DERObjectIdentifier e()
    {
        return by;
    }

    public final DEREncodable f()
    {
        return bz;
    }
}

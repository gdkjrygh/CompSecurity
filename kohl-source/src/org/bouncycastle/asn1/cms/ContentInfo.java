// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.cms:
//            CMSObjectIdentifiers

public class ContentInfo extends ASN1Object
    implements CMSObjectIdentifiers
{

    private ASN1Encodable content;
    private ASN1ObjectIdentifier contentType;

    public ContentInfo(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        contentType = asn1objectidentifier;
        content = asn1encodable;
    }

    public ContentInfo(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() < 1 || asn1sequence.size() > 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        }
        contentType = (ASN1ObjectIdentifier)asn1sequence.getObjectAt(0);
        if (asn1sequence.size() > 1)
        {
            asn1sequence = (ASN1TaggedObject)asn1sequence.getObjectAt(1);
            if (!asn1sequence.isExplicit() || asn1sequence.getTagNo() != 0)
            {
                throw new IllegalArgumentException("Bad tag for 'content'");
            }
            content = asn1sequence.getObject();
        }
    }

    public static ContentInfo getInstance(Object obj)
    {
        if (obj instanceof ContentInfo)
        {
            return (ContentInfo)obj;
        }
        if (obj != null)
        {
            return new ContentInfo(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1Encodable getContent()
    {
        return content;
    }

    public ASN1ObjectIdentifier getContentType()
    {
        return contentType;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(contentType);
        if (content != null)
        {
            asn1encodablevector.add(new BERTaggedObject(0, content));
        }
        return new BERSequence(asn1encodablevector);
    }
}

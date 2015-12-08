// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DLSequence;

// Referenced classes of package org.bouncycastle.asn1.pkcs:
//            PKCSObjectIdentifiers

public class ContentInfo extends ASN1Object
    implements PKCSObjectIdentifiers
{

    private ASN1Encodable content;
    private ASN1ObjectIdentifier contentType;
    private boolean isBer;

    public ContentInfo(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        isBer = true;
        contentType = asn1objectidentifier;
        content = asn1encodable;
    }

    private ContentInfo(ASN1Sequence asn1sequence)
    {
        isBer = true;
        Enumeration enumeration = asn1sequence.getObjects();
        contentType = (ASN1ObjectIdentifier)enumeration.nextElement();
        if (enumeration.hasMoreElements())
        {
            content = ((ASN1TaggedObject)enumeration.nextElement()).getObject();
        }
        isBer = asn1sequence instanceof BERSequence;
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
            asn1encodablevector.add(new BERTaggedObject(true, 0, content));
        }
        if (isBer)
        {
            return new BERSequence(asn1encodablevector);
        } else
        {
            return new DLSequence(asn1encodablevector);
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.ess;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERUTF8String;

public class ContentHints extends ASN1Object
{

    private DERUTF8String contentDescription;
    private ASN1ObjectIdentifier contentType;

    public ContentHints(ASN1ObjectIdentifier asn1objectidentifier)
    {
        contentType = asn1objectidentifier;
        contentDescription = null;
    }

    public ContentHints(ASN1ObjectIdentifier asn1objectidentifier, DERUTF8String derutf8string)
    {
        contentType = asn1objectidentifier;
        contentDescription = derutf8string;
    }

    private ContentHints(ASN1Sequence asn1sequence)
    {
        ASN1Encodable asn1encodable = asn1sequence.getObjectAt(0);
        if (asn1encodable.toASN1Primitive() instanceof DERUTF8String)
        {
            contentDescription = DERUTF8String.getInstance(asn1encodable);
            contentType = ASN1ObjectIdentifier.getInstance(asn1sequence.getObjectAt(1));
            return;
        } else
        {
            contentType = ASN1ObjectIdentifier.getInstance(asn1sequence.getObjectAt(0));
            return;
        }
    }

    public ContentHints(DERObjectIdentifier derobjectidentifier)
    {
        this(new ASN1ObjectIdentifier(derobjectidentifier.getId()));
    }

    public ContentHints(DERObjectIdentifier derobjectidentifier, DERUTF8String derutf8string)
    {
        this(new ASN1ObjectIdentifier(derobjectidentifier.getId()), derutf8string);
    }

    public static ContentHints getInstance(Object obj)
    {
        if (obj instanceof ContentHints)
        {
            return (ContentHints)obj;
        }
        if (obj != null)
        {
            return new ContentHints(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public DERUTF8String getContentDescription()
    {
        return contentDescription;
    }

    public ASN1ObjectIdentifier getContentType()
    {
        return contentType;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (contentDescription != null)
        {
            asn1encodablevector.add(contentDescription);
        }
        asn1encodablevector.add(contentType);
        return new DERSequence(asn1encodablevector);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.SubjectKeyIdentifier;

// Referenced classes of package org.bouncycastle.asn1.cms:
//            IssuerAndSerialNumber, OriginatorPublicKey

public class OriginatorIdentifierOrKey extends ASN1Object
    implements ASN1Choice
{

    private ASN1Encodable id;

    public OriginatorIdentifierOrKey(ASN1OctetString asn1octetstring)
    {
        this(new SubjectKeyIdentifier(asn1octetstring.getOctets()));
    }

    public OriginatorIdentifierOrKey(ASN1Primitive asn1primitive)
    {
        id = asn1primitive;
    }

    public OriginatorIdentifierOrKey(IssuerAndSerialNumber issuerandserialnumber)
    {
        id = issuerandserialnumber;
    }

    public OriginatorIdentifierOrKey(OriginatorPublicKey originatorpublickey)
    {
        id = new DERTaggedObject(false, 1, originatorpublickey);
    }

    public OriginatorIdentifierOrKey(SubjectKeyIdentifier subjectkeyidentifier)
    {
        id = new DERTaggedObject(false, 0, subjectkeyidentifier);
    }

    public static OriginatorIdentifierOrKey getInstance(Object obj)
    {
        if (obj == null || (obj instanceof OriginatorIdentifierOrKey))
        {
            return (OriginatorIdentifierOrKey)obj;
        }
        if (obj instanceof IssuerAndSerialNumber)
        {
            return new OriginatorIdentifierOrKey((IssuerAndSerialNumber)obj);
        }
        if (obj instanceof SubjectKeyIdentifier)
        {
            return new OriginatorIdentifierOrKey((SubjectKeyIdentifier)obj);
        }
        if (obj instanceof OriginatorPublicKey)
        {
            return new OriginatorIdentifierOrKey((OriginatorPublicKey)obj);
        }
        if (obj instanceof ASN1TaggedObject)
        {
            return new OriginatorIdentifierOrKey((ASN1TaggedObject)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid OriginatorIdentifierOrKey: ").append(obj.getClass().getName()).toString());
        }
    }

    public static OriginatorIdentifierOrKey getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        if (!flag)
        {
            throw new IllegalArgumentException("Can't implicitly tag OriginatorIdentifierOrKey");
        } else
        {
            return getInstance(asn1taggedobject.getObject());
        }
    }

    public ASN1Encodable getId()
    {
        return id;
    }

    public IssuerAndSerialNumber getIssuerAndSerialNumber()
    {
        if (id instanceof IssuerAndSerialNumber)
        {
            return (IssuerAndSerialNumber)id;
        } else
        {
            return null;
        }
    }

    public OriginatorPublicKey getOriginatorKey()
    {
        if ((id instanceof ASN1TaggedObject) && ((ASN1TaggedObject)id).getTagNo() == 1)
        {
            return OriginatorPublicKey.getInstance((ASN1TaggedObject)id, false);
        } else
        {
            return null;
        }
    }

    public SubjectKeyIdentifier getSubjectKeyIdentifier()
    {
        if ((id instanceof ASN1TaggedObject) && ((ASN1TaggedObject)id).getTagNo() == 0)
        {
            return SubjectKeyIdentifier.getInstance((ASN1TaggedObject)id, false);
        } else
        {
            return null;
        }
    }

    public ASN1Primitive toASN1Primitive()
    {
        return id.toASN1Primitive();
    }
}

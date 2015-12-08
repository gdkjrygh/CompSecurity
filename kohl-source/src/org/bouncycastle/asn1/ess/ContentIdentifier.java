// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.ess;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;

public class ContentIdentifier extends ASN1Object
{

    ASN1OctetString value;

    private ContentIdentifier(ASN1OctetString asn1octetstring)
    {
        value = asn1octetstring;
    }

    public ContentIdentifier(byte abyte0[])
    {
        this(((ASN1OctetString) (new DEROctetString(abyte0))));
    }

    public static ContentIdentifier getInstance(Object obj)
    {
        if (obj instanceof ContentIdentifier)
        {
            return (ContentIdentifier)obj;
        }
        if (obj != null)
        {
            return new ContentIdentifier(ASN1OctetString.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1OctetString getValue()
    {
        return value;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return value;
    }
}

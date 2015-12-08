// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.BERSet;

public class Attributes extends ASN1Object
{

    private ASN1Set attributes;

    public Attributes(ASN1EncodableVector asn1encodablevector)
    {
        attributes = new BERSet(asn1encodablevector);
    }

    private Attributes(ASN1Set asn1set)
    {
        attributes = asn1set;
    }

    public static Attributes getInstance(Object obj)
    {
        if (obj instanceof Attributes)
        {
            return (Attributes)obj;
        }
        if (obj != null)
        {
            return new Attributes(ASN1Set.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1Primitive toASN1Primitive()
    {
        return attributes;
    }
}

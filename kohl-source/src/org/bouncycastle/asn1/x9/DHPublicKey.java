// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x9;

import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;

public class DHPublicKey extends ASN1Object
{

    private ASN1Integer y;

    public DHPublicKey(ASN1Integer asn1integer)
    {
        if (asn1integer == null)
        {
            throw new IllegalArgumentException("'y' cannot be null");
        } else
        {
            y = asn1integer;
            return;
        }
    }

    public static DHPublicKey getInstance(Object obj)
    {
        if (obj == null || (obj instanceof DHPublicKey))
        {
            return (DHPublicKey)obj;
        }
        if (obj instanceof ASN1Integer)
        {
            return new DHPublicKey((ASN1Integer)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid DHPublicKey: ").append(obj.getClass().getName()).toString());
        }
    }

    public static DHPublicKey getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Integer.getInstance(asn1taggedobject, flag));
    }

    public ASN1Integer getY()
    {
        return y;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return y;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x500;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERObject;

// Referenced classes of package org.bouncycastle.asn1.x500:
//            AttributeTypeAndValue

public class RDN extends ASN1Encodable
{

    private ASN1Set a;

    private RDN(ASN1Set asn1set)
    {
        a = asn1set;
    }

    public static RDN a(Object obj)
    {
        if (obj instanceof RDN)
        {
            return (RDN)obj;
        }
        if (obj != null)
        {
            return new RDN(ASN1Set.a(obj));
        } else
        {
            return null;
        }
    }

    public final DERObject d()
    {
        return a;
    }

    public final boolean e()
    {
        return a.f() > 1;
    }

    public final AttributeTypeAndValue f()
    {
        if (a.f() == 0)
        {
            return null;
        } else
        {
            return AttributeTypeAndValue.a(a.a(0));
        }
    }

    public final AttributeTypeAndValue[] g()
    {
        AttributeTypeAndValue aattributetypeandvalue[] = new AttributeTypeAndValue[a.f()];
        for (int i = 0; i != aattributetypeandvalue.length; i++)
        {
            aattributetypeandvalue[i] = AttributeTypeAndValue.a(a.a(i));
        }

        return aattributetypeandvalue;
    }
}

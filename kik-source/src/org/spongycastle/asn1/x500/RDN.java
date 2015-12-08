// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x500;

import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Set;

// Referenced classes of package org.spongycastle.asn1.x500:
//            AttributeTypeAndValue

public class RDN extends ASN1Object
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

    public final ASN1Primitive a()
    {
        return a;
    }

    public final boolean c()
    {
        return a.d() > 1;
    }

    public final AttributeTypeAndValue d()
    {
        if (a.d() == 0)
        {
            return null;
        } else
        {
            return AttributeTypeAndValue.a(a.a(0));
        }
    }

    public final AttributeTypeAndValue[] e()
    {
        AttributeTypeAndValue aattributetypeandvalue[] = new AttributeTypeAndValue[a.d()];
        for (int i = 0; i != aattributetypeandvalue.length; i++)
        {
            aattributetypeandvalue[i] = AttributeTypeAndValue.a(a.a(i));
        }

        return aattributetypeandvalue;
    }
}

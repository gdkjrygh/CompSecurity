// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            GeneralName

public class Target extends ASN1Encodable
    implements ASN1Choice
{

    private GeneralName a;
    private GeneralName b;

    private Target(ASN1TaggedObject asn1taggedobject)
    {
        switch (asn1taggedobject.e())
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("unknown tag: ")).append(asn1taggedobject.e()).toString());

        case 0: // '\0'
            a = GeneralName.a(asn1taggedobject);
            return;

        case 1: // '\001'
            b = GeneralName.a(asn1taggedobject);
            break;
        }
    }

    public static Target a(Object obj)
    {
        if (obj instanceof Target)
        {
            return (Target)obj;
        }
        if (obj instanceof ASN1TaggedObject)
        {
            return new Target((ASN1TaggedObject)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown object in factory: ")).append(obj.getClass()).toString());
        }
    }

    public final DERObject d()
    {
        if (a != null)
        {
            return new DERTaggedObject(true, 0, a);
        } else
        {
            return new DERTaggedObject(true, 1, b);
        }
    }

    public final GeneralName e()
    {
        return b;
    }

    public final GeneralName f()
    {
        return a;
    }
}

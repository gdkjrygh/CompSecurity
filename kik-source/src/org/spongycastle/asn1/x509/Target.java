// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERTaggedObject;

// Referenced classes of package org.spongycastle.asn1.x509:
//            GeneralName

public class Target extends ASN1Object
    implements ASN1Choice
{

    private GeneralName a;
    private GeneralName b;

    private Target(ASN1TaggedObject asn1taggedobject)
    {
        switch (asn1taggedobject.c())
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("unknown tag: ")).append(asn1taggedobject.c()).toString());

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
        if (obj == null || (obj instanceof Target))
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

    public final ASN1Primitive a()
    {
        if (a != null)
        {
            return new DERTaggedObject(true, 0, a);
        } else
        {
            return new DERTaggedObject(true, 1, b);
        }
    }

    public final GeneralName c()
    {
        return b;
    }

    public final GeneralName d()
    {
        return a;
    }
}

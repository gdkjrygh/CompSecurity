// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            Targets

public class TargetInformation extends ASN1Encodable
{

    private ASN1Sequence a;

    private TargetInformation(ASN1Sequence asn1sequence)
    {
        a = asn1sequence;
    }

    public static TargetInformation a(Object obj)
    {
        if (obj instanceof TargetInformation)
        {
            return (TargetInformation)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new TargetInformation((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown object in factory: ")).append(obj.getClass()).toString());
        }
    }

    public final DERObject d()
    {
        return a;
    }

    public final Targets[] e()
    {
        Targets atargets[] = new Targets[a.f()];
        int i = 0;
        for (Enumeration enumeration = a.e(); enumeration.hasMoreElements();)
        {
            atargets[i] = Targets.a(enumeration.nextElement());
            i++;
        }

        return atargets;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;

// Referenced classes of package org.spongycastle.asn1.x509:
//            Targets

public class TargetInformation extends ASN1Object
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
        if (obj != null)
        {
            return new TargetInformation(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
    {
        return a;
    }

    public final Targets[] c()
    {
        Targets atargets[] = new Targets[a.e()];
        int i = 0;
        for (Enumeration enumeration = a.d(); enumeration.hasMoreElements();)
        {
            atargets[i] = Targets.a(enumeration.nextElement());
            i++;
        }

        return atargets;
    }
}

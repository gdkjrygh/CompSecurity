// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;

// Referenced classes of package org.spongycastle.asn1.x509:
//            Target

public class Targets extends ASN1Object
{

    private ASN1Sequence a;

    private Targets(ASN1Sequence asn1sequence)
    {
        a = asn1sequence;
    }

    public static Targets a(Object obj)
    {
        if (obj instanceof Targets)
        {
            return (Targets)obj;
        }
        if (obj != null)
        {
            return new Targets(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
    {
        return a;
    }

    public final Target[] c()
    {
        Target atarget[] = new Target[a.e()];
        int i = 0;
        for (Enumeration enumeration = a.d(); enumeration.hasMoreElements();)
        {
            atarget[i] = Target.a(enumeration.nextElement());
            i++;
        }

        return atarget;
    }
}

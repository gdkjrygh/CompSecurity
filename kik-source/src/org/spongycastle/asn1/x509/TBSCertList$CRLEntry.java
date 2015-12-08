// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;

// Referenced classes of package org.spongycastle.asn1.x509:
//            TBSCertList, Time, Extensions

public static class a extends ASN1Object
{

    ASN1Sequence a;
    Extensions b;

    public static a a(Object obj)
    {
        if (obj instanceof a)
        {
            return (a)obj;
        }
        if (obj != null)
        {
            return new <init>(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
    {
        return a;
    }

    public final ASN1Integer c()
    {
        return ASN1Integer.a(a.a(0));
    }

    public final Time d()
    {
        return Time.a(a.a(1));
    }

    public final Extensions e()
    {
        if (b == null && a.e() == 3)
        {
            b = Extensions.a(a.a(2));
        }
        return b;
    }

    public final boolean f()
    {
        return a.e() == 3;
    }

    private (ASN1Sequence asn1sequence)
    {
        if (asn1sequence.e() < 2 || asn1sequence.e() > 3)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.e()).toString());
        } else
        {
            a = asn1sequence;
            return;
        }
    }
}

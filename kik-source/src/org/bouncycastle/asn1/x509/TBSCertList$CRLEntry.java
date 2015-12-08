// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            TBSCertList, Time, X509Extensions

public static class c extends ASN1Encodable
{

    ASN1Sequence a;
    DERInteger b;
    Time c;
    X509Extensions d;

    public final DERObject d()
    {
        return a;
    }

    public final DERInteger e()
    {
        return b;
    }

    public final Time f()
    {
        return c;
    }

    public final X509Extensions g()
    {
        if (d == null && a.f() == 3)
        {
            d = X509Extensions.a(a.a(2));
        }
        return d;
    }

    public (ASN1Sequence asn1sequence)
    {
        if (asn1sequence.f() < 2 || asn1sequence.f() > 3)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.f()).toString());
        } else
        {
            a = asn1sequence;
            b = DERInteger.a(asn1sequence.a(0));
            c = Time.a(asn1sequence.a(1));
            return;
        }
    }
}

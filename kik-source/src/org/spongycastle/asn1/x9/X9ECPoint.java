// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x9;

import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.ec.ECPoint;

public class X9ECPoint extends ASN1Object
{

    ECPoint a;

    public X9ECPoint(ECCurve eccurve, ASN1OctetString asn1octetstring)
    {
        a = eccurve.a(asn1octetstring.d());
    }

    public X9ECPoint(ECPoint ecpoint)
    {
        a = ecpoint;
    }

    public final ASN1Primitive a()
    {
        return new DEROctetString(a.f());
    }

    public final ECPoint c()
    {
        return a;
    }
}

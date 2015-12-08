// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x9;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

public class X9ECPoint extends ASN1Encodable
{

    ECPoint a;

    public X9ECPoint(ECCurve eccurve, ASN1OctetString asn1octetstring)
    {
        a = eccurve.a(asn1octetstring.f());
    }

    public X9ECPoint(ECPoint ecpoint)
    {
        a = ecpoint;
    }

    public final DERObject d()
    {
        return new DEROctetString(a.f());
    }

    public final ECPoint e()
    {
        return a;
    }
}

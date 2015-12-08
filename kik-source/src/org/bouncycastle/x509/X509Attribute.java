// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.Attribute;

public class X509Attribute extends ASN1Encodable
{

    Attribute a;

    X509Attribute(ASN1Encodable asn1encodable)
    {
        a = Attribute.a(asn1encodable);
    }

    public final DERObject d()
    {
        return a.d();
    }
}

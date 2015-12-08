// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERTaggedObject;

public class CertStatus extends ASN1Encodable
    implements ASN1Choice
{

    private int a;
    private DEREncodable b;

    public CertStatus()
    {
        a = 0;
        b = new DERNull();
    }

    public final DERObject d()
    {
        return new DERTaggedObject(false, a, b);
    }
}

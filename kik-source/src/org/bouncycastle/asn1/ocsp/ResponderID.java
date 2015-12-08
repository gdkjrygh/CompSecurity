// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERTaggedObject;

public class ResponderID extends ASN1Encodable
    implements ASN1Choice
{

    private DEREncodable a;

    public final DERObject d()
    {
        if (a instanceof ASN1OctetString)
        {
            return new DERTaggedObject(true, 2, a);
        } else
        {
            return new DERTaggedObject(true, 1, a);
        }
    }
}

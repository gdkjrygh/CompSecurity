// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.ocsp;

import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERTaggedObject;

public class ResponderID extends ASN1Object
    implements ASN1Choice
{

    private ASN1Encodable a;

    public final ASN1Primitive a()
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

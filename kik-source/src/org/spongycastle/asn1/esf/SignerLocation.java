// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.esf;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.DERUTF8String;

public class SignerLocation extends ASN1Object
{

    private DERUTF8String a;
    private DERUTF8String b;
    private ASN1Sequence c;

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (a != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 0, a));
        }
        if (b != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 1, b));
        }
        if (c != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 2, c));
        }
        return new DERSequence(asn1encodablevector);
    }
}

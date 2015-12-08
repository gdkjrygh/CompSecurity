// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cryptopro;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;

public class ECGOST3410ParamSetParameters extends ASN1Encodable
{

    DERInteger a;
    DERInteger b;
    DERInteger c;
    DERInteger d;
    DERInteger e;
    DERInteger f;

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(c);
        asn1encodablevector.a(d);
        asn1encodablevector.a(a);
        asn1encodablevector.a(b);
        asn1encodablevector.a(e);
        asn1encodablevector.a(f);
        return new DERSequence(asn1encodablevector);
    }
}

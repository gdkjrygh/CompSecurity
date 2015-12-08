// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.pkcs;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;

public class RSAPrivateKeyStructure extends ASN1Object
{

    private int a;
    private BigInteger b;
    private BigInteger c;
    private BigInteger d;
    private BigInteger e;
    private BigInteger f;
    private BigInteger g;
    private BigInteger h;
    private BigInteger i;
    private ASN1Sequence j;

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(new ASN1Integer(a));
        asn1encodablevector.a(new ASN1Integer(b));
        asn1encodablevector.a(new ASN1Integer(c));
        asn1encodablevector.a(new ASN1Integer(d));
        asn1encodablevector.a(new ASN1Integer(e));
        asn1encodablevector.a(new ASN1Integer(f));
        asn1encodablevector.a(new ASN1Integer(g));
        asn1encodablevector.a(new ASN1Integer(h));
        asn1encodablevector.a(new ASN1Integer(i));
        if (j != null)
        {
            asn1encodablevector.a(j);
        }
        return new DERSequence(asn1encodablevector);
    }
}

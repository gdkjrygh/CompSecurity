// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.esf;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERUTCTime;
import org.spongycastle.asn1.x500.X500Name;

public class CrlIdentifier extends ASN1Object
{

    private X500Name a;
    private DERUTCTime b;
    private ASN1Integer c;

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a.a());
        asn1encodablevector.a(b);
        if (c != null)
        {
            asn1encodablevector.a(c);
        }
        return new DERSequence(asn1encodablevector);
    }
}

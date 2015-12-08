// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.cmp;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;

public class Challenge extends ASN1Object
{

    private AlgorithmIdentifier a;
    private ASN1OctetString b;
    private ASN1OctetString c;

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        AlgorithmIdentifier algorithmidentifier = a;
        if (algorithmidentifier != null)
        {
            asn1encodablevector.a(algorithmidentifier);
        }
        asn1encodablevector.a(b);
        asn1encodablevector.a(c);
        return new DERSequence(asn1encodablevector);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.cryptopro;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;

public class GOST3410PublicKeyAlgParameters extends ASN1Object
{

    private ASN1ObjectIdentifier a;
    private ASN1ObjectIdentifier b;
    private ASN1ObjectIdentifier c;

    public GOST3410PublicKeyAlgParameters(ASN1ObjectIdentifier asn1objectidentifier, ASN1ObjectIdentifier asn1objectidentifier1)
    {
        a = asn1objectidentifier;
        b = asn1objectidentifier1;
        c = null;
    }

    public GOST3410PublicKeyAlgParameters(ASN1ObjectIdentifier asn1objectidentifier, ASN1ObjectIdentifier asn1objectidentifier1, ASN1ObjectIdentifier asn1objectidentifier2)
    {
        a = asn1objectidentifier;
        b = asn1objectidentifier1;
        c = asn1objectidentifier2;
    }

    public GOST3410PublicKeyAlgParameters(ASN1Sequence asn1sequence)
    {
        a = (ASN1ObjectIdentifier)asn1sequence.a(0);
        b = (ASN1ObjectIdentifier)asn1sequence.a(1);
        if (asn1sequence.e() > 2)
        {
            c = (ASN1ObjectIdentifier)asn1sequence.a(2);
        }
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(b);
        if (c != null)
        {
            asn1encodablevector.a(c);
        }
        return new DERSequence(asn1encodablevector);
    }

    public final ASN1ObjectIdentifier c()
    {
        return a;
    }

    public final ASN1ObjectIdentifier d()
    {
        return b;
    }

    public final ASN1ObjectIdentifier e()
    {
        return c;
    }
}

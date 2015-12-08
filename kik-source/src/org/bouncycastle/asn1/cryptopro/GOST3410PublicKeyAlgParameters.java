// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cryptopro;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;

public class GOST3410PublicKeyAlgParameters extends ASN1Encodable
{

    private DERObjectIdentifier a;
    private DERObjectIdentifier b;
    private DERObjectIdentifier c;

    public GOST3410PublicKeyAlgParameters(ASN1Sequence asn1sequence)
    {
        a = (DERObjectIdentifier)asn1sequence.a(0);
        b = (DERObjectIdentifier)asn1sequence.a(1);
        if (asn1sequence.f() > 2)
        {
            c = (DERObjectIdentifier)asn1sequence.a(2);
        }
    }

    public GOST3410PublicKeyAlgParameters(DERObjectIdentifier derobjectidentifier, DERObjectIdentifier derobjectidentifier1)
    {
        a = derobjectidentifier;
        b = derobjectidentifier1;
        c = null;
    }

    public GOST3410PublicKeyAlgParameters(DERObjectIdentifier derobjectidentifier, DERObjectIdentifier derobjectidentifier1, DERObjectIdentifier derobjectidentifier2)
    {
        a = derobjectidentifier;
        b = derobjectidentifier1;
        c = derobjectidentifier2;
    }

    public final DERObject d()
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

    public final DERObjectIdentifier e()
    {
        return a;
    }

    public final DERObjectIdentifier f()
    {
        return b;
    }

    public final DERObjectIdentifier g()
    {
        return c;
    }
}

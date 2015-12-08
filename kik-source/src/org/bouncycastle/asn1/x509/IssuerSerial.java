// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            GeneralNames

public class IssuerSerial extends ASN1Encodable
{

    GeneralNames a;
    DERInteger b;
    DERBitString c;

    private IssuerSerial(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.f() != 2 && asn1sequence.f() != 3)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.f()).toString());
        }
        a = GeneralNames.a(asn1sequence.a(0));
        b = DERInteger.a(asn1sequence.a(1));
        if (asn1sequence.f() == 3)
        {
            c = DERBitString.a(asn1sequence.a(2));
        }
    }

    public static IssuerSerial a(ASN1TaggedObject asn1taggedobject)
    {
        asn1taggedobject = ASN1Sequence.a(asn1taggedobject, false);
        if (asn1taggedobject == null || (asn1taggedobject instanceof IssuerSerial))
        {
            return (IssuerSerial)asn1taggedobject;
        }
        if (asn1taggedobject instanceof ASN1Sequence)
        {
            return new IssuerSerial((ASN1Sequence)asn1taggedobject);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("illegal object in getInstance: ")).append(asn1taggedobject.getClass().getName()).toString());
        }
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

    public final GeneralNames e()
    {
        return a;
    }

    public final DERInteger f()
    {
        return b;
    }
}

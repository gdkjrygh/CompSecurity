// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.DERSequence;

// Referenced classes of package org.spongycastle.asn1.x509:
//            GeneralNames

public class IssuerSerial extends ASN1Object
{

    GeneralNames a;
    ASN1Integer b;
    DERBitString c;

    private IssuerSerial(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.e() != 2 && asn1sequence.e() != 3)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.e()).toString());
        }
        a = GeneralNames.a(asn1sequence.a(0));
        b = ASN1Integer.a(asn1sequence.a(1));
        if (asn1sequence.e() == 3)
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

    public final GeneralNames c()
    {
        return a;
    }

    public final ASN1Integer d()
    {
        return b;
    }
}

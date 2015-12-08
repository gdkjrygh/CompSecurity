// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x9;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x9:
//            DHDomainParameters

public class DHValidationParms extends ASN1Encodable
{

    private DERBitString a;
    private DERInteger b;

    private DHValidationParms(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.f() != 2)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.f()).toString());
        } else
        {
            a = DERBitString.a(asn1sequence.a(0));
            b = DERInteger.a(asn1sequence.a(1));
            return;
        }
    }

    public static DHValidationParms a(Object obj)
    {
        if (obj == null || (obj instanceof DHDomainParameters))
        {
            return (DHValidationParms)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new DHValidationParms((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid DHValidationParms: ")).append(obj.getClass().getName()).toString());
        }
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(b);
        return new DERSequence(asn1encodablevector);
    }

    public final DERBitString e()
    {
        return a;
    }

    public final DERInteger f()
    {
        return b;
    }
}

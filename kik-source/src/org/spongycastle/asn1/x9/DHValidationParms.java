// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x9;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.DERSequence;

// Referenced classes of package org.spongycastle.asn1.x9:
//            DHDomainParameters

public class DHValidationParms extends ASN1Object
{

    private DERBitString a;
    private ASN1Integer b;

    private DHValidationParms(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.e() != 2)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.e()).toString());
        } else
        {
            a = DERBitString.a(asn1sequence.a(0));
            b = ASN1Integer.a(asn1sequence.a(1));
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

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(b);
        return new DERSequence(asn1encodablevector);
    }
}

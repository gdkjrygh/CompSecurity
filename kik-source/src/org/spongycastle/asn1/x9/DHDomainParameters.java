// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x9;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;

// Referenced classes of package org.spongycastle.asn1.x9:
//            DHValidationParms

public class DHDomainParameters extends ASN1Object
{

    private ASN1Integer a;
    private ASN1Integer b;
    private ASN1Integer c;
    private ASN1Integer d;
    private DHValidationParms e;

    private DHDomainParameters(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.e() < 3 || asn1sequence.e() > 5)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.e()).toString());
        }
        Enumeration enumeration = asn1sequence.d();
        a = ASN1Integer.a(enumeration.nextElement());
        b = ASN1Integer.a(enumeration.nextElement());
        c = ASN1Integer.a(enumeration.nextElement());
        ASN1Encodable asn1encodable = a(enumeration);
        asn1sequence = asn1encodable;
        if (asn1encodable != null)
        {
            asn1sequence = asn1encodable;
            if (asn1encodable instanceof ASN1Integer)
            {
                d = ASN1Integer.a(asn1encodable);
                asn1sequence = a(enumeration);
            }
        }
        if (asn1sequence != null)
        {
            e = DHValidationParms.a(asn1sequence.a());
        }
    }

    private static ASN1Encodable a(Enumeration enumeration)
    {
        if (enumeration.hasMoreElements())
        {
            return (ASN1Encodable)enumeration.nextElement();
        } else
        {
            return null;
        }
    }

    public static DHDomainParameters a(Object obj)
    {
        if (obj == null || (obj instanceof DHDomainParameters))
        {
            return (DHDomainParameters)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new DHDomainParameters((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid DHDomainParameters: ")).append(obj.getClass().getName()).toString());
        }
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(b);
        asn1encodablevector.a(c);
        if (d != null)
        {
            asn1encodablevector.a(d);
        }
        if (e != null)
        {
            asn1encodablevector.a(e);
        }
        return new DERSequence(asn1encodablevector);
    }

    public final ASN1Integer c()
    {
        return a;
    }

    public final ASN1Integer d()
    {
        return b;
    }
}

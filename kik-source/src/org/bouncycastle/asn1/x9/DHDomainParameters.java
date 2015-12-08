// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x9;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x9:
//            DHValidationParms

public class DHDomainParameters extends ASN1Encodable
{

    private DERInteger a;
    private DERInteger b;
    private DERInteger c;
    private DERInteger d;
    private DHValidationParms e;

    private DHDomainParameters(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.f() < 3 || asn1sequence.f() > 5)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.f()).toString());
        }
        Enumeration enumeration = asn1sequence.e();
        a = DERInteger.a(enumeration.nextElement());
        b = DERInteger.a(enumeration.nextElement());
        c = DERInteger.a(enumeration.nextElement());
        DEREncodable derencodable = a(enumeration);
        asn1sequence = derencodable;
        if (derencodable != null)
        {
            asn1sequence = derencodable;
            if (derencodable instanceof DERInteger)
            {
                d = DERInteger.a(derencodable);
                asn1sequence = a(enumeration);
            }
        }
        if (asn1sequence != null)
        {
            e = DHValidationParms.a(asn1sequence.c());
        }
    }

    private static DEREncodable a(Enumeration enumeration)
    {
        if (enumeration.hasMoreElements())
        {
            return (DEREncodable)enumeration.nextElement();
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

    public final DERObject d()
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

    public final DERInteger e()
    {
        return a;
    }

    public final DERInteger f()
    {
        return b;
    }

    public final DERInteger g()
    {
        return c;
    }

    public final DERInteger h()
    {
        return d;
    }

    public final DHValidationParms i()
    {
        return e;
    }
}

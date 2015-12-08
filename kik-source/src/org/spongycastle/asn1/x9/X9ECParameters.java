// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x9;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.ec.ECPoint;

// Referenced classes of package org.spongycastle.asn1.x9:
//            X9ObjectIdentifiers, X9Curve, X9FieldID, X9ECPoint

public class X9ECParameters extends ASN1Object
    implements X9ObjectIdentifiers
{

    private static final BigInteger al = BigInteger.valueOf(1L);
    private X9FieldID am;
    private ECCurve an;
    private ECPoint ao;
    private BigInteger ap;
    private BigInteger aq;
    private byte ar[];

    private X9ECParameters(ASN1Sequence asn1sequence)
    {
        if (!(asn1sequence.a(0) instanceof ASN1Integer) || !((ASN1Integer)asn1sequence.a(0)).c().equals(al))
        {
            throw new IllegalArgumentException("bad version in X9ECParameters");
        }
        X9Curve x9curve = new X9Curve(new X9FieldID((ASN1Sequence)asn1sequence.a(1)), (ASN1Sequence)asn1sequence.a(2));
        an = x9curve.c();
        ao = (new X9ECPoint(an, (ASN1OctetString)asn1sequence.a(3))).a;
        ap = ((ASN1Integer)asn1sequence.a(4)).c();
        ar = x9curve.d();
        if (asn1sequence.e() == 6)
        {
            aq = ((ASN1Integer)asn1sequence.a(5)).c();
        }
    }

    public X9ECParameters(ECCurve eccurve, ECPoint ecpoint, BigInteger biginteger, BigInteger biginteger1)
    {
        this(eccurve, ecpoint, biginteger, biginteger1, null);
    }

    public X9ECParameters(ECCurve eccurve, ECPoint ecpoint, BigInteger biginteger, BigInteger biginteger1, byte abyte0[])
    {
        an = eccurve;
        ao = ecpoint;
        ap = biginteger;
        aq = biginteger1;
        ar = abyte0;
        if (eccurve instanceof org.spongycastle.math.ec.ECCurve.Fp)
        {
            am = new X9FieldID(((org.spongycastle.math.ec.ECCurve.Fp)eccurve).e());
        } else
        if (eccurve instanceof org.spongycastle.math.ec.ECCurve.F2m)
        {
            eccurve = (org.spongycastle.math.ec.ECCurve.F2m)eccurve;
            am = new X9FieldID(eccurve.h(), eccurve.j(), eccurve.k(), eccurve.l());
            return;
        }
    }

    public static X9ECParameters a(Object obj)
    {
        if (obj instanceof X9ECParameters)
        {
            return (X9ECParameters)obj;
        }
        if (obj != null)
        {
            return new X9ECParameters(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(new ASN1Integer(1));
        asn1encodablevector.a(am);
        asn1encodablevector.a(new X9Curve(an, ar));
        asn1encodablevector.a(new X9ECPoint(ao));
        asn1encodablevector.a(new ASN1Integer(ap));
        if (aq != null)
        {
            asn1encodablevector.a(new ASN1Integer(aq));
        }
        return new DERSequence(asn1encodablevector);
    }

    public final ECCurve c()
    {
        return an;
    }

    public final ECPoint d()
    {
        return ao;
    }

    public final BigInteger e()
    {
        return ap;
    }

    public final BigInteger f()
    {
        if (aq == null)
        {
            return al;
        } else
        {
            return aq;
        }
    }

    public final byte[] g()
    {
        return ar;
    }

}

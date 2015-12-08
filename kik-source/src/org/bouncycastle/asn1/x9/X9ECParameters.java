// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

// Referenced classes of package org.bouncycastle.asn1.x9:
//            X9ObjectIdentifiers, X9Curve, X9FieldID, X9ECPoint

public class X9ECParameters extends ASN1Encodable
    implements X9ObjectIdentifiers
{

    private static final BigInteger al = BigInteger.valueOf(1L);
    private X9FieldID am;
    private ECCurve an;
    private ECPoint ao;
    private BigInteger ap;
    private BigInteger aq;
    private byte ar[];

    public X9ECParameters(ASN1Sequence asn1sequence)
    {
        if (!(asn1sequence.a(0) instanceof DERInteger) || !((DERInteger)asn1sequence.a(0)).e().equals(al))
        {
            throw new IllegalArgumentException("bad version in X9ECParameters");
        }
        X9Curve x9curve = new X9Curve(new X9FieldID((ASN1Sequence)asn1sequence.a(1)), (ASN1Sequence)asn1sequence.a(2));
        an = x9curve.e();
        ao = (new X9ECPoint(an, (ASN1OctetString)asn1sequence.a(3))).a;
        ap = ((DERInteger)asn1sequence.a(4)).e();
        ar = x9curve.f();
        if (asn1sequence.f() == 6)
        {
            aq = ((DERInteger)asn1sequence.a(5)).e();
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
        if (eccurve instanceof org.bouncycastle.math.ec.ECCurve.Fp)
        {
            am = new X9FieldID(((org.bouncycastle.math.ec.ECCurve.Fp)eccurve).e());
        } else
        if (eccurve instanceof org.bouncycastle.math.ec.ECCurve.F2m)
        {
            eccurve = (org.bouncycastle.math.ec.ECCurve.F2m)eccurve;
            am = new X9FieldID(eccurve.h(), eccurve.j(), eccurve.k(), eccurve.l());
            return;
        }
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(new DERInteger(1));
        asn1encodablevector.a(am);
        asn1encodablevector.a(new X9Curve(an, ar));
        asn1encodablevector.a(new X9ECPoint(ao));
        asn1encodablevector.a(new DERInteger(ap));
        if (aq != null)
        {
            asn1encodablevector.a(new DERInteger(aq));
        }
        return new DERSequence(asn1encodablevector);
    }

    public final ECCurve e()
    {
        return an;
    }

    public final ECPoint f()
    {
        return ao;
    }

    public final BigInteger g()
    {
        return ap;
    }

    public final BigInteger h()
    {
        if (aq == null)
        {
            return al;
        } else
        {
            return aq;
        }
    }

    public final byte[] i()
    {
        return ar;
    }

}

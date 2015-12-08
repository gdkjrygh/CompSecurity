// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;

// Referenced classes of package org.bouncycastle.asn1.x9:
//            X9ObjectIdentifiers, X9FieldID, X9FieldElement

public class X9Curve extends ASN1Encodable
    implements X9ObjectIdentifiers
{

    private ECCurve al;
    private byte am[];
    private DERObjectIdentifier an;

    public X9Curve(X9FieldID x9fieldid, ASN1Sequence asn1sequence)
    {
        an = null;
        an = x9fieldid.e();
        if (!an.equals(c)) goto _L2; else goto _L1
_L1:
        x9fieldid = ((DERInteger)x9fieldid.f()).e();
        X9FieldElement x9fieldelement = new X9FieldElement(x9fieldid, (ASN1OctetString)asn1sequence.a(0));
        X9FieldElement x9fieldelement2 = new X9FieldElement(x9fieldid, (ASN1OctetString)asn1sequence.a(1));
        al = new org.bouncycastle.math.ec.ECCurve.Fp(x9fieldid, x9fieldelement.e().a(), x9fieldelement2.e().a());
_L4:
        if (asn1sequence.f() == 3)
        {
            am = ((DERBitString)asn1sequence.a(2)).e();
        }
        return;
_L2:
        if (an.equals(d))
        {
            x9fieldid = (DERSequence)x9fieldid.f();
            int l = ((DERInteger)x9fieldid.a(0)).e().intValue();
            X9FieldElement x9fieldelement1;
            int i;
            int j;
            int k;
            if (((DERObjectIdentifier)x9fieldid.a(1)).equals(f))
            {
                i = ((DERInteger)x9fieldid.a(2)).e().intValue();
                k = 0;
                j = 0;
            } else
            {
                x9fieldid = (DERSequence)x9fieldid.a(2);
                i = ((DERInteger)x9fieldid.a(0)).e().intValue();
                j = ((DERInteger)x9fieldid.a(1)).e().intValue();
                k = ((DERInteger)x9fieldid.a(2)).e().intValue();
            }
            x9fieldid = new X9FieldElement(l, i, j, k, (ASN1OctetString)asn1sequence.a(0));
            x9fieldelement1 = new X9FieldElement(l, i, j, k, (ASN1OctetString)asn1sequence.a(1));
            al = new org.bouncycastle.math.ec.ECCurve.F2m(l, i, j, k, x9fieldid.e().a(), x9fieldelement1.e().a());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public X9Curve(ECCurve eccurve, byte abyte0[])
    {
        an = null;
        al = eccurve;
        am = abyte0;
        if (al instanceof org.bouncycastle.math.ec.ECCurve.Fp)
        {
            an = c;
            return;
        }
        if (al instanceof org.bouncycastle.math.ec.ECCurve.F2m)
        {
            an = d;
            return;
        } else
        {
            throw new IllegalArgumentException("This type of ECCurve is not implemented");
        }
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (!an.equals(c)) goto _L2; else goto _L1
_L1:
        asn1encodablevector.a((new X9FieldElement(al.c())).c());
        asn1encodablevector.a((new X9FieldElement(al.d())).c());
_L4:
        if (am != null)
        {
            asn1encodablevector.a(new DERBitString(am));
        }
        return new DERSequence(asn1encodablevector);
_L2:
        if (an.equals(d))
        {
            asn1encodablevector.a((new X9FieldElement(al.c())).c());
            asn1encodablevector.a((new X9FieldElement(al.d())).c());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final ECCurve e()
    {
        return al;
    }

    public final byte[] f()
    {
        return am;
    }
}

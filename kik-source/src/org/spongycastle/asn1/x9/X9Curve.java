// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x9;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.ec.ECFieldElement;

// Referenced classes of package org.spongycastle.asn1.x9:
//            X9ObjectIdentifiers, X9FieldID, X9FieldElement

public class X9Curve extends ASN1Object
    implements X9ObjectIdentifiers
{

    private ECCurve al;
    private byte am[];
    private ASN1ObjectIdentifier an;

    public X9Curve(X9FieldID x9fieldid, ASN1Sequence asn1sequence)
    {
        an = null;
        an = x9fieldid.c();
        if (!an.equals(c)) goto _L2; else goto _L1
_L1:
        x9fieldid = ((ASN1Integer)x9fieldid.d()).c();
        X9FieldElement x9fieldelement = new X9FieldElement(x9fieldid, (ASN1OctetString)asn1sequence.a(0));
        X9FieldElement x9fieldelement2 = new X9FieldElement(x9fieldid, (ASN1OctetString)asn1sequence.a(1));
        al = new org.spongycastle.math.ec.ECCurve.Fp(x9fieldid, x9fieldelement.c().a(), x9fieldelement2.c().a());
_L4:
        if (asn1sequence.e() == 3)
        {
            am = ((DERBitString)asn1sequence.a(2)).c();
        }
        return;
_L2:
        if (an.equals(d))
        {
            x9fieldid = ASN1Sequence.a(x9fieldid.d());
            int l = ((ASN1Integer)x9fieldid.a(0)).c().intValue();
            X9FieldElement x9fieldelement1;
            int i;
            int j;
            int k;
            if (((ASN1ObjectIdentifier)x9fieldid.a(1)).equals(f))
            {
                i = ((ASN1Integer)x9fieldid.a(2)).c().intValue();
                k = 0;
                j = 0;
            } else
            {
                x9fieldid = (DERSequence)x9fieldid.a(2);
                i = ((ASN1Integer)x9fieldid.a(0)).c().intValue();
                j = ((ASN1Integer)x9fieldid.a(1)).c().intValue();
                k = ((ASN1Integer)x9fieldid.a(2)).c().intValue();
            }
            x9fieldid = new X9FieldElement(l, i, j, k, (ASN1OctetString)asn1sequence.a(0));
            x9fieldelement1 = new X9FieldElement(l, i, j, k, (ASN1OctetString)asn1sequence.a(1));
            al = new org.spongycastle.math.ec.ECCurve.F2m(l, i, j, k, x9fieldid.c().a(), x9fieldelement1.c().a());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public X9Curve(ECCurve eccurve, byte abyte0[])
    {
        an = null;
        al = eccurve;
        am = abyte0;
        if (al instanceof org.spongycastle.math.ec.ECCurve.Fp)
        {
            an = c;
            return;
        }
        if (al instanceof org.spongycastle.math.ec.ECCurve.F2m)
        {
            an = d;
            return;
        } else
        {
            throw new IllegalArgumentException("This type of ECCurve is not implemented");
        }
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (!an.equals(c)) goto _L2; else goto _L1
_L1:
        asn1encodablevector.a((new X9FieldElement(al.c())).a());
        asn1encodablevector.a((new X9FieldElement(al.d())).a());
_L4:
        if (am != null)
        {
            asn1encodablevector.a(new DERBitString(am));
        }
        return new DERSequence(asn1encodablevector);
_L2:
        if (an.equals(d))
        {
            asn1encodablevector.a((new X9FieldElement(al.c())).a());
            asn1encodablevector.a((new X9FieldElement(al.d())).a());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final ECCurve c()
    {
        return al;
    }

    public final byte[] d()
    {
        return am;
    }
}

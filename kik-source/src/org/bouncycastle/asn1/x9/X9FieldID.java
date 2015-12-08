// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x9:
//            X9ObjectIdentifiers

public class X9FieldID extends ASN1Encodable
    implements X9ObjectIdentifiers
{

    private DERObjectIdentifier al;
    private DERObject am;

    public X9FieldID(int i, int j, int k, int l)
    {
        al = d;
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(new DERInteger(i));
        if (k == 0)
        {
            asn1encodablevector.a(f);
            asn1encodablevector.a(new DERInteger(j));
        } else
        {
            asn1encodablevector.a(g);
            ASN1EncodableVector asn1encodablevector1 = new ASN1EncodableVector();
            asn1encodablevector1.a(new DERInteger(j));
            asn1encodablevector1.a(new DERInteger(k));
            asn1encodablevector1.a(new DERInteger(l));
            asn1encodablevector.a(new DERSequence(asn1encodablevector1));
        }
        am = new DERSequence(asn1encodablevector);
    }

    public X9FieldID(BigInteger biginteger)
    {
        al = c;
        am = new DERInteger(biginteger);
    }

    public X9FieldID(ASN1Sequence asn1sequence)
    {
        al = (DERObjectIdentifier)asn1sequence.a(0);
        am = (DERObject)asn1sequence.a(1);
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(al);
        asn1encodablevector.a(am);
        return new DERSequence(asn1encodablevector);
    }

    public final DERObjectIdentifier e()
    {
        return al;
    }

    public final DERObject f()
    {
        return am;
    }
}

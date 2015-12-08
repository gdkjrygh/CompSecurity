// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.math.ec.ECFieldElement;

// Referenced classes of package org.bouncycastle.asn1.x9:
//            X9IntegerConverter

public class X9FieldElement extends ASN1Object
{

    private static X9IntegerConverter converter = new X9IntegerConverter();
    protected ECFieldElement f;

    public X9FieldElement(int i, int j, int k, int l, ASN1OctetString asn1octetstring)
    {
        this(((ECFieldElement) (new org.bouncycastle.math.ec.ECFieldElement.F2m(i, j, k, l, new BigInteger(1, asn1octetstring.getOctets())))));
    }

    public X9FieldElement(BigInteger biginteger, ASN1OctetString asn1octetstring)
    {
        this(((ECFieldElement) (new org.bouncycastle.math.ec.ECFieldElement.Fp(biginteger, new BigInteger(1, asn1octetstring.getOctets())))));
    }

    public X9FieldElement(ECFieldElement ecfieldelement)
    {
        f = ecfieldelement;
    }

    public ECFieldElement getValue()
    {
        return f;
    }

    public ASN1Primitive toASN1Primitive()
    {
        int i = converter.getByteLength(f);
        return new DEROctetString(converter.integerToBytes(f.toBigInteger(), i));
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.isismtt.x509;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.DERSequence;

public class MonetaryLimit extends ASN1Object
{

    ASN1Integer amount;
    DERPrintableString currency;
    ASN1Integer exponent;

    public MonetaryLimit(String s, int i, int j)
    {
        currency = new DERPrintableString(s, true);
        amount = new ASN1Integer(i);
        exponent = new ASN1Integer(j);
    }

    private MonetaryLimit(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() != 3)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        } else
        {
            asn1sequence = asn1sequence.getObjects();
            currency = DERPrintableString.getInstance(asn1sequence.nextElement());
            amount = ASN1Integer.getInstance(asn1sequence.nextElement());
            exponent = ASN1Integer.getInstance(asn1sequence.nextElement());
            return;
        }
    }

    public static MonetaryLimit getInstance(Object obj)
    {
        if (obj == null || (obj instanceof MonetaryLimit))
        {
            return (MonetaryLimit)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new MonetaryLimit(ASN1Sequence.getInstance(obj));
        } else
        {
            throw new IllegalArgumentException("unknown object in getInstance");
        }
    }

    public BigInteger getAmount()
    {
        return amount.getValue();
    }

    public String getCurrency()
    {
        return currency.getString();
    }

    public BigInteger getExponent()
    {
        return exponent.getValue();
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(currency);
        asn1encodablevector.add(amount);
        asn1encodablevector.add(exponent);
        return new DERSequence(asn1encodablevector);
    }
}

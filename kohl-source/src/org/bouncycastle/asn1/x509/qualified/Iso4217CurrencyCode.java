// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509.qualified;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERPrintableString;

public class Iso4217CurrencyCode extends ASN1Object
    implements ASN1Choice
{

    final int ALPHABETIC_MAXSIZE;
    final int NUMERIC_MAXSIZE;
    final int NUMERIC_MINSIZE;
    int numeric;
    ASN1Encodable obj;

    public Iso4217CurrencyCode(int i)
    {
        ALPHABETIC_MAXSIZE = 3;
        NUMERIC_MINSIZE = 1;
        NUMERIC_MAXSIZE = 999;
        if (i > 999 || i < 1)
        {
            throw new IllegalArgumentException("wrong size in numeric code : not in (1..999)");
        } else
        {
            obj = new ASN1Integer(i);
            return;
        }
    }

    public Iso4217CurrencyCode(String s)
    {
        ALPHABETIC_MAXSIZE = 3;
        NUMERIC_MINSIZE = 1;
        NUMERIC_MAXSIZE = 999;
        if (s.length() > 3)
        {
            throw new IllegalArgumentException("wrong size in alphabetic code : max size is 3");
        } else
        {
            obj = new DERPrintableString(s);
            return;
        }
    }

    public static Iso4217CurrencyCode getInstance(Object obj1)
    {
        if (obj1 == null || (obj1 instanceof Iso4217CurrencyCode))
        {
            return (Iso4217CurrencyCode)obj1;
        }
        if (obj1 instanceof ASN1Integer)
        {
            return new Iso4217CurrencyCode(ASN1Integer.getInstance(obj1).getValue().intValue());
        }
        if (obj1 instanceof DERPrintableString)
        {
            return new Iso4217CurrencyCode(DERPrintableString.getInstance(obj1).getString());
        } else
        {
            throw new IllegalArgumentException("unknown object in getInstance");
        }
    }

    public String getAlphabetic()
    {
        return ((DERPrintableString)obj).getString();
    }

    public int getNumeric()
    {
        return ((ASN1Integer)obj).getValue().intValue();
    }

    public boolean isAlphabetic()
    {
        return obj instanceof DERPrintableString;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return obj.toASN1Primitive();
    }
}

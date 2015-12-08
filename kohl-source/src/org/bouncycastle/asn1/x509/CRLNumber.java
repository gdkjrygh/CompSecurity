// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

public class CRLNumber extends ASN1Object
{

    private BigInteger number;

    public CRLNumber(BigInteger biginteger)
    {
        number = biginteger;
    }

    public static CRLNumber getInstance(Object obj)
    {
        if (obj instanceof CRLNumber)
        {
            return (CRLNumber)obj;
        }
        if (obj != null)
        {
            return new CRLNumber(ASN1Integer.getInstance(obj).getValue());
        } else
        {
            return null;
        }
    }

    public BigInteger getCRLNumber()
    {
        return number;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return new ASN1Integer(number);
    }

    public String toString()
    {
        return (new StringBuilder()).append("CRLNumber: ").append(getCRLNumber()).toString();
    }
}

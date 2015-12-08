// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;

public class X9IntegerConverter
{

    public X9IntegerConverter()
    {
    }

    public int getByteLength(ECCurve eccurve)
    {
        return (eccurve.getFieldSize() + 7) / 8;
    }

    public int getByteLength(ECFieldElement ecfieldelement)
    {
        return (ecfieldelement.getFieldSize() + 7) / 8;
    }

    public byte[] integerToBytes(BigInteger biginteger, int i)
    {
        biginteger = biginteger.toByteArray();
        if (i < biginteger.length)
        {
            byte abyte0[] = new byte[i];
            System.arraycopy(biginteger, biginteger.length - abyte0.length, abyte0, 0, abyte0.length);
            return abyte0;
        }
        if (i > biginteger.length)
        {
            byte abyte1[] = new byte[i];
            System.arraycopy(biginteger, 0, abyte1, abyte1.length - biginteger.length, biginteger.length);
            return abyte1;
        } else
        {
            return biginteger;
        }
    }
}

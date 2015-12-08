// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.math.ec;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.math.ec:
//            ECCurve, ECFieldElement, ECPoint

public static class ent extends ECCurve
{

    q infinity;
    BigInteger q;

    public ECPoint createPoint(BigInteger biginteger, BigInteger biginteger1, boolean flag)
    {
        return new <init>(this, fromBigInteger(biginteger), fromBigInteger(biginteger1), flag);
    }

    public ECPoint decodePoint(byte abyte0[])
    {
        int i = 0;
        switch (abyte0[0])
        {
        case 1: // '\001'
        case 5: // '\005'
        default:
            throw new RuntimeException((new StringBuilder()).append("Invalid point encoding 0x").append(Integer.toString(abyte0[0], 16)).toString());

        case 0: // '\0'
            if (abyte0.length > 1)
            {
                throw new RuntimeException("Invalid point encoding");
            } else
            {
                return getInfinity();
            }

        case 2: // '\002'
        case 3: // '\003'
            byte byte0 = abyte0[0];
            byte abyte1[] = new byte[abyte0.length - 1];
            System.arraycopy(abyte0, 1, abyte1, 0, abyte1.length);
            abyte0 = new ent.Fp(q, new BigInteger(1, abyte1));
            ECFieldElement ecfieldelement = abyte0.multiply(abyte0.square().add(a)).add(b).sqrt();
            if (ecfieldelement == null)
            {
                throw new RuntimeException("Invalid point compression");
            }
            if (ecfieldelement.toBigInteger().testBit(0))
            {
                i = 1;
            }
            if (i == (byte0 & 1))
            {
                return new <init>(this, abyte0, ecfieldelement, true);
            } else
            {
                return new <init>(this, abyte0, new ent.Fp(q, q.subtract(ecfieldelement.toBigInteger())), true);
            }

        case 4: // '\004'
        case 6: // '\006'
        case 7: // '\007'
            byte abyte2[] = new byte[(abyte0.length - 1) / 2];
            byte abyte3[] = new byte[(abyte0.length - 1) / 2];
            System.arraycopy(abyte0, 1, abyte2, 0, abyte2.length);
            System.arraycopy(abyte0, abyte2.length + 1, abyte3, 0, abyte3.length);
            return new <init>(this, new ent.Fp(q, new BigInteger(1, abyte2)), new ent.Fp(q, new BigInteger(1, abyte3)));
        }
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof q))
            {
                return false;
            }
            obj = (q)obj;
            if (!q.equals(((q) (obj)).q) || !a.equals(((a) (obj)).a) || !b.equals(((b) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public ECFieldElement fromBigInteger(BigInteger biginteger)
    {
        return new ent.Fp(q, biginteger);
    }

    public int getFieldSize()
    {
        return q.bitLength();
    }

    public ECPoint getInfinity()
    {
        return infinity;
    }

    public BigInteger getQ()
    {
        return q;
    }

    public int hashCode()
    {
        return a.hashCode() ^ b.hashCode() ^ q.hashCode();
    }

    public ent(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2)
    {
        q = biginteger;
        a = fromBigInteger(biginteger1);
        b = fromBigInteger(biginteger2);
        infinity = new <init>(this, null, null);
    }
}

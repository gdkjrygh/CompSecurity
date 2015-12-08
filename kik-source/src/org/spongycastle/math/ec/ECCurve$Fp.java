// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.math.ec;

import java.math.BigInteger;

// Referenced classes of package org.spongycastle.math.ec:
//            ECCurve, ECFieldElement, ECPoint

public static class ent extends ECCurve
{

    BigInteger c;
    c d;

    public final int a()
    {
        return c.bitLength();
    }

    public final ECFieldElement a(BigInteger biginteger)
    {
        return new ent.Fp(c, biginteger);
    }

    public final ECPoint a(BigInteger biginteger, BigInteger biginteger1, boolean flag)
    {
        return new <init>(this, a(biginteger), a(biginteger1), flag);
    }

    public final ECPoint a(byte abyte0[])
    {
        int i = 0;
        switch (abyte0[0])
        {
        case 1: // '\001'
        case 5: // '\005'
        default:
            throw new RuntimeException((new StringBuilder("Invalid point encoding 0x")).append(Integer.toString(abyte0[0], 16)).toString());

        case 0: // '\0'
            if (abyte0.length > 1)
            {
                throw new RuntimeException("Invalid point encoding");
            } else
            {
                return d;
            }

        case 2: // '\002'
        case 3: // '\003'
            byte byte0 = abyte0[0];
            byte abyte1[] = new byte[abyte0.length - 1];
            System.arraycopy(abyte0, 1, abyte1, 0, abyte1.length);
            abyte0 = new ent.Fp(c, new BigInteger(1, abyte1));
            ECFieldElement ecfieldelement = abyte0.c(abyte0.d().a(a)).a(b).f();
            if (ecfieldelement == null)
            {
                throw new RuntimeException("Invalid point compression");
            }
            if (ecfieldelement.a().testBit(0))
            {
                i = 1;
            }
            if (i == (byte0 & 1))
            {
                return new <init>(this, abyte0, ecfieldelement, true);
            } else
            {
                return new <init>(this, abyte0, new ent.Fp(c, c.subtract(ecfieldelement.a())), true);
            }

        case 4: // '\004'
        case 6: // '\006'
        case 7: // '\007'
            byte abyte2[] = new byte[(abyte0.length - 1) / 2];
            byte abyte3[] = new byte[(abyte0.length - 1) / 2];
            System.arraycopy(abyte0, 1, abyte2, 0, abyte2.length);
            System.arraycopy(abyte0, abyte2.length + 1, abyte3, 0, abyte3.length);
            return new <init>(this, new ent.Fp(c, new BigInteger(1, abyte2)), new ent.Fp(c, new BigInteger(1, abyte3)));
        }
    }

    public final ECPoint b()
    {
        return d;
    }

    public final BigInteger e()
    {
        return c;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof c))
            {
                return false;
            }
            obj = (c)obj;
            if (!c.equals(((c) (obj)).c) || !a.equals(((a) (obj)).a) || !b.equals(((b) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return a.hashCode() ^ b.hashCode() ^ c.hashCode();
    }

    public ent(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2)
    {
        c = biginteger;
        a = a(biginteger1);
        b = a(biginteger2);
        d = new <init>(this, null, null);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.math.ec;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.math.ec:
//            ECConstants

class SimpleBigDecimal
{

    private static final long serialVersionUID = 1L;
    private final BigInteger bigInt;
    private final int scale;

    public SimpleBigDecimal(BigInteger biginteger, int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("scale may not be negative");
        } else
        {
            bigInt = biginteger;
            scale = i;
            return;
        }
    }

    private SimpleBigDecimal(SimpleBigDecimal simplebigdecimal)
    {
        bigInt = simplebigdecimal.bigInt;
        scale = simplebigdecimal.scale;
    }

    private void checkScale(SimpleBigDecimal simplebigdecimal)
    {
        if (scale != simplebigdecimal.scale)
        {
            throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
        } else
        {
            return;
        }
    }

    public static SimpleBigDecimal getInstance(BigInteger biginteger, int i)
    {
        return new SimpleBigDecimal(biginteger.shiftLeft(i), i);
    }

    public SimpleBigDecimal add(BigInteger biginteger)
    {
        return new SimpleBigDecimal(bigInt.add(biginteger.shiftLeft(scale)), scale);
    }

    public SimpleBigDecimal add(SimpleBigDecimal simplebigdecimal)
    {
        checkScale(simplebigdecimal);
        return new SimpleBigDecimal(bigInt.add(simplebigdecimal.bigInt), scale);
    }

    public SimpleBigDecimal adjustScale(int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("scale may not be negative");
        }
        if (i == scale)
        {
            return new SimpleBigDecimal(this);
        } else
        {
            return new SimpleBigDecimal(bigInt.shiftLeft(i - scale), i);
        }
    }

    public int compareTo(BigInteger biginteger)
    {
        return bigInt.compareTo(biginteger.shiftLeft(scale));
    }

    public int compareTo(SimpleBigDecimal simplebigdecimal)
    {
        checkScale(simplebigdecimal);
        return bigInt.compareTo(simplebigdecimal.bigInt);
    }

    public SimpleBigDecimal divide(BigInteger biginteger)
    {
        return new SimpleBigDecimal(bigInt.divide(biginteger), scale);
    }

    public SimpleBigDecimal divide(SimpleBigDecimal simplebigdecimal)
    {
        checkScale(simplebigdecimal);
        return new SimpleBigDecimal(bigInt.shiftLeft(scale).divide(simplebigdecimal.bigInt), scale);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof SimpleBigDecimal))
            {
                return false;
            }
            obj = (SimpleBigDecimal)obj;
            if (!bigInt.equals(((SimpleBigDecimal) (obj)).bigInt) || scale != ((SimpleBigDecimal) (obj)).scale)
            {
                return false;
            }
        }
        return true;
    }

    public BigInteger floor()
    {
        return bigInt.shiftRight(scale);
    }

    public int getScale()
    {
        return scale;
    }

    public int hashCode()
    {
        return bigInt.hashCode() ^ scale;
    }

    public int intValue()
    {
        return floor().intValue();
    }

    public long longValue()
    {
        return floor().longValue();
    }

    public SimpleBigDecimal multiply(BigInteger biginteger)
    {
        return new SimpleBigDecimal(bigInt.multiply(biginteger), scale);
    }

    public SimpleBigDecimal multiply(SimpleBigDecimal simplebigdecimal)
    {
        checkScale(simplebigdecimal);
        return new SimpleBigDecimal(bigInt.multiply(simplebigdecimal.bigInt), scale + scale);
    }

    public SimpleBigDecimal negate()
    {
        return new SimpleBigDecimal(bigInt.negate(), scale);
    }

    public BigInteger round()
    {
        return add((new SimpleBigDecimal(ECConstants.ONE, 1)).adjustScale(scale)).floor();
    }

    public SimpleBigDecimal shiftLeft(int i)
    {
        return new SimpleBigDecimal(bigInt.shiftLeft(i), scale);
    }

    public SimpleBigDecimal subtract(BigInteger biginteger)
    {
        return new SimpleBigDecimal(bigInt.subtract(biginteger.shiftLeft(scale)), scale);
    }

    public SimpleBigDecimal subtract(SimpleBigDecimal simplebigdecimal)
    {
        return add(simplebigdecimal.negate());
    }

    public String toString()
    {
        if (scale == 0)
        {
            return bigInt.toString();
        }
        BigInteger biginteger = floor();
        Object obj1 = bigInt.subtract(biginteger.shiftLeft(scale));
        Object obj = obj1;
        if (bigInt.signum() == -1)
        {
            obj = ECConstants.ONE.shiftLeft(scale).subtract(((BigInteger) (obj1)));
        }
        obj1 = biginteger;
        if (biginteger.signum() == -1)
        {
            obj1 = biginteger;
            if (!((BigInteger) (obj)).equals(ECConstants.ZERO))
            {
                obj1 = biginteger.add(ECConstants.ONE);
            }
        }
        obj1 = ((BigInteger) (obj1)).toString();
        char ac[] = new char[scale];
        obj = ((BigInteger) (obj)).toString(2);
        int k = ((String) (obj)).length();
        int l = scale - k;
        for (int i = 0; i < l; i++)
        {
            ac[i] = '0';
        }

        for (int j = 0; j < k; j++)
        {
            ac[l + j] = ((String) (obj)).charAt(j);
        }

        obj = new String(ac);
        obj1 = new StringBuffer(((String) (obj1)));
        ((StringBuffer) (obj1)).append(".");
        ((StringBuffer) (obj1)).append(((String) (obj)));
        return ((StringBuffer) (obj1)).toString();
    }
}

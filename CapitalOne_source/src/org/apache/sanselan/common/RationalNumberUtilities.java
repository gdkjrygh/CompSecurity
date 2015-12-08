// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.common;


// Referenced classes of package org.apache.sanselan.common:
//            RationalNumber

public abstract class RationalNumberUtilities extends Number
{

    public RationalNumberUtilities()
    {
    }

    public static final RationalNumber a(double d)
    {
        if (d >= 2147483647D)
        {
            return new RationalNumber(0x7fffffff, 1);
        }
        if (d <= -2147483647D)
        {
            return new RationalNumber(0x80000001, 1);
        }
        Object obj;
        Object obj1;
        Option option;
        Option option1;
        Object obj2;
        boolean flag;
        int i;
        if (d < 0.0D)
        {
            d = Math.abs(d);
            flag = true;
        } else
        {
            flag = false;
        }
        if (d == 0.0D)
        {
            return new RationalNumber(0, 1);
        }
        if (d >= 1.0D)
        {
            i = (int)d;
            if ((double)i < d)
            {
                obj = new RationalNumber(i, 1);
                obj1 = new RationalNumber(i + 1, 1);
            } else
            {
                obj = new RationalNumber(i - 1, 1);
                obj1 = new RationalNumber(i, 1);
            }
        } else
        {
            i = (int)(1.0D / d);
            if (1.0D / (double)i < d)
            {
                obj = new RationalNumber(1, i);
                obj1 = new RationalNumber(1, i - 1);
            } else
            {
                obj = new RationalNumber(1, i + 1);
                obj1 = new RationalNumber(1, i);
            }
        }
        option = Option.a(((RationalNumber) (obj)), d);
        obj1 = Option.a(((RationalNumber) (obj1)), d);
        if (option.b < ((Option) (obj1)).b)
        {
            obj = option;
        } else
        {
            obj = obj1;
        }
        i = 0;
        option1 = option;
        option = ((Option) (obj1));
        obj1 = obj;
        if (((Option) (obj1)).b > 1E-08D && i < 100) goto _L2; else goto _L1
_L1:
        if (flag)
        {
            return ((Option) (obj1)).a.a();
        } else
        {
            return ((Option) (obj1)).a;
        }
_L2:
        obj2 = RationalNumber.a((long)option1.a.a + (long)option.a.a, (long)option1.a.b + (long)option.a.b);
        obj = Option.a(((RationalNumber) (obj2)), d);
        if (d >= ((RationalNumber) (obj2)).doubleValue())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (option.b <= ((Option) (obj)).b) goto _L1; else goto _L3
_L3:
        option = ((Option) (obj));
_L5:
        obj2 = obj1;
        if (((Option) (obj)).b < ((Option) (obj1)).b)
        {
            obj2 = obj;
        }
        i++;
        obj1 = obj2;
        break MISSING_BLOCK_LABEL_151;
        if (option1.b <= ((Option) (obj)).b) goto _L1; else goto _L4
_L4:
        option1 = ((Option) (obj));
          goto _L5
    }

    private class Option
    {

        public final RationalNumber a;
        public final double b;

        public static final Option a(RationalNumber rationalnumber, double d)
        {
            return new Option(rationalnumber, Math.abs(rationalnumber.doubleValue() - d));
        }

        public String toString()
        {
            return a.toString();
        }

        private Option(RationalNumber rationalnumber, double d)
        {
            a = rationalnumber;
            b = d;
        }
    }

}

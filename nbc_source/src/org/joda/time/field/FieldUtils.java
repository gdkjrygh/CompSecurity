// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.field;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

public class FieldUtils
{

    private FieldUtils()
    {
    }

    public static boolean equals(Object obj, Object obj1)
    {
        if (obj == obj1)
        {
            return true;
        }
        if (obj == null || obj1 == null)
        {
            return false;
        } else
        {
            return obj.equals(obj1);
        }
    }

    public static int getWrappedValue(int i, int j, int k)
    {
        if (j >= k)
        {
            throw new IllegalArgumentException("MIN > MAX");
        }
        k = (k - j) + 1;
        i -= j;
        if (i >= 0)
        {
            return i % k + j;
        }
        i = -i % k;
        if (i == 0)
        {
            return j + 0;
        } else
        {
            return (k - i) + j;
        }
    }

    public static int getWrappedValue(int i, int j, int k, int l)
    {
        return getWrappedValue(i + j, k, l);
    }

    public static int safeAdd(int i, int j)
    {
        int k = i + j;
        if ((i ^ k) < 0 && (i ^ j) >= 0)
        {
            throw new ArithmeticException((new StringBuilder()).append("The calculation caused an overflow: ").append(i).append(" + ").append(j).toString());
        } else
        {
            return k;
        }
    }

    public static long safeAdd(long l, long l1)
    {
        long l2 = l + l1;
        if ((l ^ l2) < 0L && (l ^ l1) >= 0L)
        {
            throw new ArithmeticException((new StringBuilder()).append("The calculation caused an overflow: ").append(l).append(" + ").append(l1).toString());
        } else
        {
            return l2;
        }
    }

    public static long safeDivide(long l, long l1)
    {
        if (l == 0x8000000000000000L && l1 == -1L)
        {
            throw new ArithmeticException((new StringBuilder()).append("Multiplication overflows a long: ").append(l).append(" / ").append(l1).toString());
        } else
        {
            return l / l1;
        }
    }

    public static int safeMultiply(int i, int j)
    {
        long l = (long)i * (long)j;
        if (l < 0xffffffff80000000L || l > 0x7fffffffL)
        {
            throw new ArithmeticException((new StringBuilder()).append("Multiplication overflows an int: ").append(i).append(" * ").append(j).toString());
        } else
        {
            return (int)l;
        }
    }

    public static long safeMultiply(long l, int i)
    {
        long l1 = l;
        switch (i)
        {
        default:
            l1 = (long)i * l;
            if (l1 / (long)i != l)
            {
                throw new ArithmeticException((new StringBuilder()).append("Multiplication overflows a long: ").append(l).append(" * ").append(i).toString());
            } else
            {
                return l1;
            }

        case -1: 
            if (l == 0x8000000000000000L)
            {
                throw new ArithmeticException((new StringBuilder()).append("Multiplication overflows a long: ").append(l).append(" * ").append(i).toString());
            }
            l1 = -l;
            // fall through

        case 1: // '\001'
            return l1;

        case 0: // '\0'
            return 0L;
        }
    }

    public static long safeMultiply(long l, long l1)
    {
        if (l1 == 1L)
        {
            return l;
        }
        if (l == 1L)
        {
            return l1;
        }
        if (l == 0L || l1 == 0L)
        {
            return 0L;
        }
        long l2 = l * l1;
        if (l2 / l1 != l || l == 0x8000000000000000L && l1 == -1L || l1 == 0x8000000000000000L && l == -1L)
        {
            throw new ArithmeticException((new StringBuilder()).append("Multiplication overflows a long: ").append(l).append(" * ").append(l1).toString());
        } else
        {
            return l2;
        }
    }

    public static int safeMultiplyToInt(long l, long l1)
    {
        return safeToInt(safeMultiply(l, l1));
    }

    public static int safeNegate(int i)
    {
        if (i == 0x80000000)
        {
            throw new ArithmeticException("Integer.MIN_VALUE cannot be negated");
        } else
        {
            return -i;
        }
    }

    public static long safeSubtract(long l, long l1)
    {
        long l2 = l - l1;
        if ((l ^ l2) < 0L && (l ^ l1) < 0L)
        {
            throw new ArithmeticException((new StringBuilder()).append("The calculation caused an overflow: ").append(l).append(" - ").append(l1).toString());
        } else
        {
            return l2;
        }
    }

    public static int safeToInt(long l)
    {
        if (0xffffffff80000000L <= l && l <= 0x7fffffffL)
        {
            return (int)l;
        } else
        {
            throw new ArithmeticException((new StringBuilder()).append("Value cannot fit in an int: ").append(l).toString());
        }
    }

    public static void verifyValueBounds(String s, int i, int j, int k)
    {
        if (i < j || i > k)
        {
            throw new IllegalFieldValueException(s, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k));
        } else
        {
            return;
        }
    }

    public static void verifyValueBounds(DateTimeField datetimefield, int i, int j, int k)
    {
        if (i < j || i > k)
        {
            throw new IllegalFieldValueException(datetimefield.getType(), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k));
        } else
        {
            return;
        }
    }

    public static void verifyValueBounds(DateTimeFieldType datetimefieldtype, int i, int j, int k)
    {
        if (i < j || i > k)
        {
            throw new IllegalFieldValueException(datetimefieldtype, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k));
        } else
        {
            return;
        }
    }
}

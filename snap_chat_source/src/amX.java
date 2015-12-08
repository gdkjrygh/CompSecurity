// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class amX
{

    public static int a(long l)
    {
        if (0xffffffff80000000L <= l && l <= 0x7fffffffL)
        {
            return (int)l;
        } else
        {
            throw new ArithmeticException((new StringBuilder("Value cannot fit in an int: ")).append(l).toString());
        }
    }

    public static long a(long l, long l1)
    {
        long l2 = l + l1;
        if ((l ^ l2) < 0L && (l ^ l1) >= 0L)
        {
            throw new ArithmeticException((new StringBuilder("The calculation caused an overflow: ")).append(l).append(" + ").append(l1).toString());
        } else
        {
            return l2;
        }
    }

    public static void a(alt alt1, int i, int j, int k)
    {
        if (i < j || i > k)
        {
            throw new alB(alt1.a(), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k));
        } else
        {
            return;
        }
    }

    public static void a(alu alu, int i, int j, int k)
    {
        if (i < j || i > k)
        {
            throw new alB(alu, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k));
        } else
        {
            return;
        }
    }

    public static boolean a(Object obj, Object obj1)
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

    public static long b(long l, long l1)
    {
        long l2 = l - l1;
        if ((l ^ l2) < 0L && (l ^ l1) < 0L)
        {
            throw new ArithmeticException((new StringBuilder("The calculation caused an overflow: ")).append(l).append(" - ").append(l1).toString());
        } else
        {
            return l2;
        }
    }
}

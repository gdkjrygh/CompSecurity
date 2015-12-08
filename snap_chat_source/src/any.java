// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class any extends alw
{
    static final class a
    {

        public final long a;
        alw b;
        a c;
        String d;
        int e;

        a(alw alw1, long l)
        {
            e = 0x80000000;
            a = l;
            b = alw1;
        }
    }


    private static final int d;
    private final alw e;
    private final a f[];

    private any(alw alw1)
    {
        super(alw1.c);
        f = new a[d + 1];
        e = alw1;
    }

    public static any a(alw alw1)
    {
        if (alw1 instanceof any)
        {
            return (any)alw1;
        } else
        {
            return new any(alw1);
        }
    }

    private a h(long l)
    {
        a a1;
label0:
        {
            int i = (int)(l >> 32);
            a aa[] = f;
            int j = i & d;
            a a2 = aa[j];
            if (a2 != null)
            {
                a1 = a2;
                if ((int)(a2.a >> 32) == i)
                {
                    break label0;
                }
            }
            long l1 = 0xffffffff00000000L & l;
            a1 = new a(e, l1);
            a2 = a1;
            l = l1;
            do
            {
                long l2 = e.f(l);
                if (l2 == l || l2 > (l1 | 0xffffffffL))
                {
                    break;
                }
                a a3 = new a(e, l2);
                a2.c = a3;
                a2 = a3;
                l = l2;
            } while (true);
            aa[j] = a1;
        }
        return a1;
    }

    public final String a(long l)
    {
        a a1 = h(l);
        do
        {
            if (a1.c == null || l < a1.c.a)
            {
                if (a1.d == null)
                {
                    a1.d = a1.b.a(a1.a);
                }
                return a1.d;
            }
            a1 = a1.c;
        } while (true);
    }

    public final int b(long l)
    {
        a a1 = h(l);
        do
        {
            if (a1.c == null || l < a1.c.a)
            {
                if (a1.e == 0x80000000)
                {
                    a1.e = a1.b.b(a1.a);
                }
                return a1.e;
            }
            a1 = a1.c;
        } while (true);
    }

    public final boolean c()
    {
        return e.c();
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj instanceof any)
        {
            return e.equals(((any)obj).e);
        } else
        {
            return false;
        }
    }

    public final long f(long l)
    {
        return e.f(l);
    }

    public final long g(long l)
    {
        return e.g(l);
    }

    public final int hashCode()
    {
        return e.hashCode();
    }

    static 
    {
        Object obj;
        int i;
        try
        {
            obj = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
        }
        if (obj == null)
        {
            i = 512;
        } else
        {
            i = ((Integer) (obj)).intValue() - 1;
            int j = 0;
            for (; i > 0; i >>= 1)
            {
                j++;
            }

            i = 1 << j;
        }
        d = i - 1;
    }
}

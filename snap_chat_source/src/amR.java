// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

public abstract class amR extends alt
{

    final alu g;

    public amR(alu alu1)
    {
        if (alu1 == null)
        {
            throw new IllegalArgumentException("The type must not be null");
        } else
        {
            g = alu1;
            return;
        }
    }

    public abstract int a(long l);

    public int a(String s, Locale locale)
    {
        int i;
        try
        {
            i = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (Locale locale)
        {
            throw new alB(g, s);
        }
        return i;
    }

    public int a(Locale locale)
    {
        int i = h();
        if (i >= 0)
        {
            if (i < 10)
            {
                return 1;
            }
            if (i < 100)
            {
                return 2;
            }
            if (i < 1000)
            {
                return 3;
            }
        }
        return Integer.toString(i).length();
    }

    public long a(long l, int i)
    {
        return d().a(l, i);
    }

    public long a(long l, long l1)
    {
        return d().a(l, l1);
    }

    public long a(long l, String s, Locale locale)
    {
        return b(l, a(s, locale));
    }

    public final alu a()
    {
        return g;
    }

    public String a(int i, Locale locale)
    {
        return Integer.toString(i);
    }

    public String a(long l, Locale locale)
    {
        return a(a(l), locale);
    }

    public final String a(alO alo, Locale locale)
    {
        return a(alo.a(g), locale);
    }

    public int b(long l, long l1)
    {
        return d().b(l, l1);
    }

    public abstract long b(long l, int i);

    public final String b()
    {
        return g.a;
    }

    public String b(int i, Locale locale)
    {
        return a(i, locale);
    }

    public String b(long l, Locale locale)
    {
        return b(a(l), locale);
    }

    public final String b(alO alo, Locale locale)
    {
        return b(alo.a(g), locale);
    }

    public boolean b(long l)
    {
        return false;
    }

    public int c(long l)
    {
        return h();
    }

    public long c(long l, long l1)
    {
        return d().c(l, l1);
    }

    public final boolean c()
    {
        return true;
    }

    public abstract long d(long l);

    public abstract alz d();

    public long e(long l)
    {
        long l2 = d(l);
        long l1 = l;
        if (l2 != l)
        {
            l1 = a(l2, 1);
        }
        return l1;
    }

    public long f(long l)
    {
        return l - d(l);
    }

    public alz f()
    {
        return null;
    }

    public abstract int h();

    public String toString()
    {
        return (new StringBuilder("DateTimeField[")).append(g.a).append(']').toString();
    }
}

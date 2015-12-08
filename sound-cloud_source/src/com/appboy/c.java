// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy;

import bo.app.br;
import bo.app.cb;
import bo.app.ct;
import bo.app.eg;
import bo.app.ei;
import bo.app.el;
import com.appboy.b.d;
import com.appboy.b.e;
import com.appboy.d.b.b;

// Referenced classes of package com.appboy:
//            d

public class c
{

    private static final String d;
    final Object a = new Object();
    public final cb b;
    volatile String c;
    private final ei e;
    private final br f;
    private final eg g;

    c(ei ei1, br br1, String s, cb cb, eg eg1)
    {
        c = s;
        e = ei1;
        f = br1;
        b = cb;
        g = eg1;
    }

    public final String a()
    {
        String s;
        synchronized (a)
        {
            s = c;
        }
        return s;
    }

    public final boolean a(int j, e e1, int k)
    {
        boolean flag;
        try
        {
            flag = e.a(j, e1, k);
        }
        catch (Exception exception)
        {
            String.format("Failed to set date of birth to: %d-%d-%d", new Object[] {
                Integer.valueOf(j), Integer.valueOf(e1.m), Integer.valueOf(k)
            });
            return false;
        }
        return flag;
    }

    public final boolean a(d d1)
    {
        try
        {
            e.a(d1);
        }
        catch (Exception exception)
        {
            (new StringBuilder("Failed to set gender to: ")).append(d1);
            return false;
        }
        return true;
    }

    public final boolean a(b b1)
    {
        try
        {
            e.a(b1);
        }
        // Misplaced declaration of an exception variable
        catch (b b1)
        {
            return false;
        }
        return true;
    }

    public final boolean a(String s)
    {
        try
        {
            e.a(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return true;
    }

    public final boolean a(String s, float f1)
    {
        boolean flag;
        try
        {
            flag = e.a(s, Float.valueOf(f1));
        }
        catch (Exception exception)
        {
            (new StringBuilder("Failed to set custom float attribute ")).append(s).append(".");
            return false;
        }
        return flag;
    }

    public final boolean a(String s, int j)
    {
        boolean flag;
        try
        {
            flag = e.a(s, Integer.valueOf(j));
        }
        catch (Exception exception)
        {
            (new StringBuilder("Failed to set custom integer attribute ")).append(s).append(".");
            return false;
        }
        return flag;
    }

    public final boolean a(String s, long l)
    {
        boolean flag;
        try
        {
            flag = e.a(s, Long.valueOf(l));
        }
        catch (Exception exception)
        {
            (new StringBuilder("Failed to set custom long attribute ")).append(s).append(".");
            return false;
        }
        return flag;
    }

    public final boolean a(String s, String s1)
    {
        boolean flag;
        try
        {
            flag = e.a(s, s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            (new StringBuilder("Failed to set custom string attribute ")).append(s).append(".");
            return false;
        }
        return flag;
    }

    public final boolean a(String s, boolean flag)
    {
        try
        {
            flag = e.a(s, Boolean.valueOf(flag));
        }
        catch (Exception exception)
        {
            (new StringBuilder("Failed to set custom boolean attribute ")).append(s).append(".");
            return false;
        }
        return flag;
    }

    public final boolean a(String s, String as[])
    {
        String s1 = s;
        if (!com.appboy.f.e.c(s))
        {
            return false;
        }
        s1 = s;
        if (com.appboy.f.e.a(s, g.g()))
        {
            break MISSING_BLOCK_LABEL_93;
        }
        s1 = s;
        String s2 = com.appboy.f.e.e(s);
        s = as;
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        s1 = s2;
        s = com.appboy.f.e.a(as);
        s1 = s2;
        s = ct.a(s2, s);
        s1 = s2;
        f.a(s);
        return true;
        s;
        (new StringBuilder("Failed to set custom attribute array with key: '")).append(s1).append("'.");
        return false;
    }

    public final boolean b(String s)
    {
        try
        {
            e.b(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return true;
    }

    public final boolean b(String s, int j)
    {
        if (com.appboy.f.e.a(s, g.g()))
        {
            return false;
        }
        try
        {
            ct ct1 = ct.a(s, j);
            f.a(ct1);
        }
        catch (Exception exception)
        {
            (new StringBuilder("Failed to increment custom attribute ")).append(s).append(" by ").append(j).append(".");
            return false;
        }
        return true;
    }

    public final boolean b(String s, long l)
    {
        boolean flag;
        try
        {
            flag = e.a(s, l);
        }
        catch (Exception exception)
        {
            (new StringBuilder("Failed to set custom attribute ")).append(s).append(" to ").append(l).append(" seconds from epoch.");
            return false;
        }
        return flag;
    }

    public final boolean b(String s, String s1)
    {
        String s2 = s;
        if (!com.appboy.f.e.c(s))
        {
            return false;
        }
        s2 = s;
        if (com.appboy.f.e.a(s, g.g()))
        {
            break MISSING_BLOCK_LABEL_87;
        }
        s2 = s;
        if (!com.appboy.f.e.d(s1))
        {
            break MISSING_BLOCK_LABEL_87;
        }
        s2 = s;
        s = com.appboy.f.e.e(s);
        s2 = s;
        s1 = ct.e(s, com.appboy.f.e.e(s1));
        s2 = s;
        f.a(s1);
        return true;
        s;
        (new StringBuilder("Failed to add custom attribute with key '")).append(s2).append("'.");
        return false;
    }

    public final boolean c(String s)
    {
        boolean flag;
        try
        {
            flag = e.c(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return flag;
    }

    public final boolean d(String s)
    {
        try
        {
            e.d(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return true;
    }

    public final boolean e(String s)
    {
        try
        {
            e.e(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return true;
    }

    public final boolean f(String s)
    {
        boolean flag;
        try
        {
            flag = e.f(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return flag;
    }

    public final boolean g(String s)
    {
        boolean flag;
        try
        {
            flag = e.a(s, el.a());
        }
        catch (Exception exception)
        {
            (new StringBuilder("Failed to set custom attribute ")).append(s).append(" to now.");
            return false;
        }
        return flag;
    }

    public final boolean h(String s)
    {
        if (com.appboy.f.e.a(s, g.g()))
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = e.h(s);
        }
        catch (Exception exception)
        {
            (new StringBuilder("Failed to unset custom attribute ")).append(s).append(".");
            return false;
        }
        return flag;
    }

    public final boolean i(String s)
    {
        try
        {
            e.g(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return true;
    }

    static 
    {
        d = String.format("%s.%s", new Object[] {
            d.a, com/appboy/c.getName()
        });
    }
}

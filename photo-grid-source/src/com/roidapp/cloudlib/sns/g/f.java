// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.g;

import com.roidapp.cloudlib.sns.b.c;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.roidapp.cloudlib.sns.g:
//            d, a

public final class f extends d
{

    c a;
    String b;
    String c;
    String d;
    String e;
    int f;
    int g;
    int h;
    final Map i = new HashMap();

    public f()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = 0x80000000;
        g = 0x80000000;
        h = 0x80000000;
    }

    public static int a(f f1, int j)
    {
        int k = j;
        if (f1 != null)
        {
            k = com.roidapp.cloudlib.sns.g.d.a(f1.f, j);
        }
        return k;
    }

    public static c a(f f1, c c1)
    {
        if (f1 != null)
        {
            c c2 = f1.a;
            f1 = c2;
            if (c2 == null)
            {
                f1 = c1;
            }
            return (c)f1;
        } else
        {
            return c1;
        }
    }

    public static String a(f f1)
    {
        if (f1 != null && f1.e != null)
        {
            return f1.e;
        } else
        {
            return null;
        }
    }

    public static String a(f f1, String s)
    {
        String s1 = s;
        if (f1 != null)
        {
            s1 = s;
            if (f1.b != null)
            {
                s1 = f1.b;
            }
        }
        return s1;
    }

    public static a b(f f1, int j)
    {
        if (f1 != null)
        {
            return (a)f1.i.get(Integer.valueOf(j));
        } else
        {
            return null;
        }
    }

    public static String b(f f1, String s)
    {
        String s1 = s;
        if (f1 != null)
        {
            s1 = s;
            if (f1.d != null)
            {
                s1 = f1.d;
            }
        }
        return s1;
    }

    public static int c(f f1, int j)
    {
        int k = j;
        if (f1 != null)
        {
            k = com.roidapp.cloudlib.sns.g.d.a(f1.g, j);
        }
        return k;
    }

    public static int d(f f1, int j)
    {
        int k = j;
        if (f1 != null)
        {
            k = com.roidapp.cloudlib.sns.g.d.a(f1.h, j);
        }
        return k;
    }
}

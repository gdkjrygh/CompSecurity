// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import android.util.Log;
import com.google.android.m4b.maps.aa.f;
import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.cg.c;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            g, m, ar

public final class bi
    implements c
{
    public static final class a
    {

        public static final com.google.android.m4b.maps.y.f a = new com.google.android.m4b.maps.y.f() {

            public final Object a(Object obj)
            {
                return ((bi)obj).c.a;
            }

        };

    }


    public final List a;
    public final int b;
    public final com.google.android.m4b.maps.ak.c c;
    private final String d;
    private final String e;
    private final ar f;

    private bi(com.google.android.m4b.maps.ak.a.c c1, List list, String s, String s1, int i, int j, ar ar1)
    {
        a = list;
        d = s;
        e = s1;
        b = i;
        c = new com.google.android.m4b.maps.ak.c(c1, j);
        f = ar1;
    }

    public static bi a(com.google.android.m4b.maps.ac.a a1)
    {
        int j = 0;
        com.google.android.m4b.maps.ak.a.c c2 = com.google.android.m4b.maps.ak.a.c.b(a1.g(1));
        if (c2 == null)
        {
            if (ab.a("INDOOR", 3))
            {
                a1 = String.valueOf(a1.g(1));
                if (a1.length() != 0)
                {
                    a1 = "malformed id: ".concat(a1);
                } else
                {
                    a1 = new String("malformed id: ");
                }
                Log.d("INDOOR", a1);
            }
            return null;
        }
        int k = a1.j(2);
        java.util.ArrayList arraylist = com.google.android.m4b.maps.aa.f.b(k);
        int i = 0;
        while (i < k) 
        {
            com.google.android.m4b.maps.ak.a.c c1 = com.google.android.m4b.maps.ak.a.c.b(a1.d(2, i));
            if (c1 != null)
            {
                arraylist.add(c1);
            } else
            if (ab.a("INDOOR", 3))
            {
                String s = String.valueOf(a1.g(1));
                if (s.length() != 0)
                {
                    s = "warning: malformed building id: ".concat(s);
                } else
                {
                    s = new String("warning: malformed building id: ");
                }
                Log.d("INDOOR", s);
            }
            i++;
        }
        String s2 = a1.g(3);
        Object obj = a1.g(4);
        String s1 = s2;
        if (s2 == null)
        {
            if (obj != null)
            {
                s1 = ((String) (obj));
            } else
            {
                s1 = "";
            }
        }
        s2 = ((String) (obj));
        if (obj == null)
        {
            s2 = s1;
        }
        i = j;
        if (a1.i(5))
        {
            i = a1.d(5);
        }
        j = 0x80000000;
        if (a1.i(8))
        {
            j = a1.d(8);
        }
        obj = null;
        if (a1.i(7))
        {
            obj = a1.f(7);
            a1 = com.google.android.m4b.maps.bo.g.a(((com.google.android.m4b.maps.ac.a) (obj)).f(1));
            obj = com.google.android.m4b.maps.bo.g.a(((com.google.android.m4b.maps.ac.a) (obj)).f(2));
            if (((g) (a1)).a > ((g) (obj)).a)
            {
                obj.a = ((g) (obj)).a + 0x40000000;
            }
            obj = com.google.android.m4b.maps.bo.ar.a(new m(a1, ((g) (obj))));
        }
        return new bi(c2, arraylist, s1, s2, i, j, ((ar) (obj)));
    }

    public final com.google.android.m4b.maps.ak.c a()
    {
        return c;
    }

    public final com.google.android.m4b.maps.ak.a.c b()
    {
        return c.a;
    }

    public final String c()
    {
        return d;
    }

    public final String d()
    {
        return e;
    }

    public final int e()
    {
        return b;
    }

    public final String toString()
    {
        String s = String.valueOf(c);
        return (new StringBuilder(String.valueOf(s).length() + 9)).append("[Level: ").append(s).append("]").toString();
    }
}

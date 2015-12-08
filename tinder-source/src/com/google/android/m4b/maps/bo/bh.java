// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import android.util.Log;
import com.google.android.m4b.maps.aa.f;
import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ak.c;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.cg.cg;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            bi, g

public class bh
    implements cg
{

    public final com.google.android.m4b.maps.ak.a.c a;
    public final List b;
    public final int c;
    public final g d;
    public final long e;
    private boolean f;

    public bh(com.google.android.m4b.maps.ak.a.c c1, List list, int i, boolean flag, g g1, long l)
    {
        a = c1;
        b = list;
        c = i;
        f = flag;
        d = g1;
        e = l;
    }

    public static bh a(a a1, long l)
    {
        com.google.android.m4b.maps.ak.a.c c1;
        java.util.ArrayList arraylist;
        int j;
        int i1;
        boolean flag;
label0:
        {
            c1 = com.google.android.m4b.maps.ak.a.c.b(a1.g(1));
            if (c1 == null)
            {
                if (ab.a("INDOOR", 3))
                {
                    a1 = String.valueOf(a1.g(1));
                    if (a1.length() != 0)
                    {
                        a1 = "malformed building id: ".concat(a1);
                    } else
                    {
                        a1 = new String("malformed building id: ");
                    }
                    Log.d("INDOOR", a1);
                }
                return null;
            }
            i1 = a1.j(2);
            arraylist = com.google.android.m4b.maps.aa.f.b(i1);
            for (int i = 0; i < i1; i++)
            {
                bi bi1 = com.google.android.m4b.maps.bo.bi.a(a1.c(2, i));
                if (bi1 != null)
                {
                    arraylist.add(bi1);
                }
            }

            flag = a1.b(4);
            int k = a1.d(3);
            if (k >= 0)
            {
                j = k;
                if (k < i1)
                {
                    break label0;
                }
            }
            j = 0;
        }
        if (flag || i1 == 0)
        {
            j = -1;
        }
        g g1 = null;
        if (a1.i(5))
        {
            g1 = com.google.android.m4b.maps.bo.g.a(a1.f(5));
        }
        return new bh(c1, arraylist, j, flag, g1, l);
    }

    public final com.google.android.m4b.maps.ak.a.c a()
    {
        return a;
    }

    public final bi a(com.google.android.m4b.maps.ak.a.c c1)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            bi bi1 = (bi)iterator.next();
            if (c1.equals(bi1.c.a))
            {
                return bi1;
            }
        }

        return null;
    }

    public final bi a(c c1)
    {
        return a(c1.a);
    }

    public final int b(c c1)
    {
        c1 = a(c1.a);
        if (c1 == null)
        {
            return -1;
        } else
        {
            c1 = a(((bi) (c1)).c.a);
            return b.indexOf(c1);
        }
    }

    public final List b()
    {
        return b;
    }

    public final int c()
    {
        return c;
    }

    public final com.google.android.m4b.maps.cg.c c(c c1)
    {
        return a(c1);
    }

    public final boolean d()
    {
        return f;
    }

    public String toString()
    {
        String s = String.valueOf(a);
        return (new StringBuilder(String.valueOf(s).length() + 12)).append("[Building: ").append(s).append("]").toString();
    }
}

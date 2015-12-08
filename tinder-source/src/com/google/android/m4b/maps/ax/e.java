// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ax;

import com.google.android.m4b.maps.ay.w;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bi.c;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.ag;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bo.aq;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bx.s;
import com.google.android.m4b.maps.bx.t;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.ax:
//            i

public final class e extends i
{

    private boolean d;
    private long e;
    private aq f;
    private aq g;
    private List h;
    private List i;

    public e(ah ah1, ag ag1, com.google.android.m4b.maps.bw.g g1)
    {
        super(ah1, ag1, g1);
        e = 0L;
        double d1 = w.e;
        boolean flag;
        if ((ah1 == ah.j || ah1 == ah.k || ah1 == ah.l) && d1 > 1.0D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
    }

    private static void a(aq aq1, ArrayList arraylist)
    {
        int i1 = arraylist.size();
        int k = 0;
        int j = 0;
        for (; k < i1; k++)
        {
            ac ac1 = (ac)arraylist.get(k);
            if (aq1.b(ac1.d()))
            {
                arraylist.set(j, ac1);
                j++;
            }
        }

        for (int l = i1 - 1; l >= j; l--)
        {
            arraylist.remove(l);
        }

    }

    private int c(b b1)
    {
        float f1 = b1.b.b;
        b1 = c.a(com.google.android.m4b.maps.bo.g.a(b1.d), a);
        if (b1 != null)
        {
            int j = (int)((f1 - (float)((s) (b1)).c) * (float)((s) (b1)).a);
            if (j >= ((s) (b1)).b.length)
            {
                return ((s) (b1)).d;
            }
            if (j < 0)
            {
                return -1;
            } else
            {
                return ((s) (b1)).b[j];
            }
        } else
        {
            return (int)f1;
        }
    }

    public final float a(g g1)
    {
        if (d)
        {
            return super.a(g1) - 1.0F;
        } else
        {
            return super.a(g1);
        }
    }

    public final long a()
    {
        return e;
    }

    public final List a(b b1)
    {
        aq aq1 = b1.h();
        if (f != null && aq1.equals(f))
        {
            boolean flag1;
            if (h.isEmpty())
            {
                flag1 = true;
            } else
            {
                flag1 = ((ac)h.get(0)).d.equals(b.a());
            }
            if (flag1)
            {
                return h;
            }
        }
        e = e + 1L;
        ArrayList arraylist = ac.a(aq1.c, c(b1), b.a());
        boolean flag;
        if (b1.b.c == 0.0F && b1.b.d == 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            a(aq1, arraylist);
        }
        h = arraylist;
        f = aq1;
        return h;
    }

    public final List b(b b1)
    {
        aq aq1 = b1.h();
        if (g != null && aq1.equals(g))
        {
            return i;
        }
        ArrayList arraylist = ac.a(aq1.c, c(b1));
        boolean flag;
        if (b1.b.c == 0.0F && b1.b.d == 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            a(aq1, arraylist);
        }
        g = aq1;
        i = arraylist;
        return i;
    }
}

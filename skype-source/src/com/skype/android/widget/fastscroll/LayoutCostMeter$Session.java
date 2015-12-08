// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.fastscroll;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import java.util.Arrays;
import java.util.EnumSet;

// Referenced classes of package com.skype.android.widget.fastscroll:
//            LayoutCostMeter, Positionable

public static class a
{

    private static final  k;
    private static final  l;
    final View a;
    final Positionable b;
    final  c;
    final int d;
    final EnumSet e;
    final EnumSet f;
    final int g[];
    final long h[];
    int i;
    boolean j;
    private  m[];
    private String n;
    private  o;
    private  p;

    private void b()
    {
        if (m == null)
        {
            throw new IllegalStateException("already detached");
        }
        a aa[] = m;
        int j1 = aa.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            aa[i1].m(a);
        }

        m = null;
        j = true;
    }

    private void c()
    {
        Arrays.fill(g, 0);
        o.o(n);
        j aj[] = ();
        int k1 = aj.length;
        for (int i1 = 0; i1 < k1; i1++)
        {
            j j1 = aj[i1];
            h[j1.l()] = -j1.l();
        }

    }

    private void d()
    {
        if (i < d)
        {
            i = i + 1;
            f.addAll(e);
            float f1 = c.a(i, d);
            b.a(f1);
            return;
        }
        l al[] = ();
        int j1 = al.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            l l1 = al[i1];
            long al1[] = h;
            int k1 = l1.l();
            al1[k1] = al1[k1] + l1.l();
        }

        o.o();
        b();
        p.(n, (), h, .values(), g);
    }

    final void a()
    {
        c();
        d();
    }

    final void a( )
    {
        if ( != k) goto _L2; else goto _L1
_L1:
        c();
_L4:
        int ai[] = g;
        int i1 = .ordinal();
        ai[i1] = ai[i1] + 1;
        if (f.remove() && f.isEmpty())
        {
            d();
        }
        return;
_L2:
        if ( == l)
        {
            o.o();
            b();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final transient void a(b ab[])
    {
        if (m != null)
        {
            throw new IllegalStateException("already attached");
        }
        m = ab;
        int j1 = ab.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            ab[i1].m(a);
        }

    }

    static 
    {
        k = .a;
        l = .b;
    }

    public transient (View view,  ,  a1[])
    {
        this(view, (Positionable)view, , , a1);
    }

    private transient (View view, Positionable positionable,  ,  1,  a1[])
    {
        j = false;
        p = new ();
        a = view;
        b = positionable;
        c = ;
        d = 100;
        o = 1;
        e = EnumSet.of(a1[0], a1);
        f = EnumSet.noneOf(com/skype/android/widget/fastscroll/LayoutCostMeter$Response);
        g = new int[com.skype.android.widget.fastscroll..values().length];
        h = new long[().length];
        n = a.getContext().getResources().getResourceEntryName(a.getId());
    }
}

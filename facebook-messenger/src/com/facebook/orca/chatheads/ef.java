// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.content.Context;
import android.graphics.PointF;
import com.facebook.inject.t;
import com.facebook.n.c;
import com.facebook.n.g;
import com.facebook.n.j;
import com.facebook.orca.chatheads.annotations.ForChatHeads;
import com.facebook.widget.l;
import com.google.common.a.kl;
import com.google.common.base.Preconditions;
import com.google.common.d.a.ab;
import com.google.common.d.a.s;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.orca.chatheads:
//            ei, ej, eh

public class ef
{

    private static g a = com.facebook.n.g.a(40D, 7D);
    private static g b = com.facebook.n.g.a(220D, 15D);
    private static double c = 0.29999999999999999D;
    private static double d = 0.29999999999999999D;
    private final l e;
    private final c f;
    private final c g;
    private final Set h = kl.a();
    private ej i;
    private ef j;
    private ab k;

    public ef(Context context, l l1)
    {
        e = l1;
        context = (j)t.a(context).a(com/facebook/n/j, com/facebook/orca/chatheads/annotations/ForChatHeads);
        l1 = new ei(this, null);
        f = context.b().a(a).d(c).e(d).a(l1);
        g = context.b().a(a).d(c).e(d).a(l1);
    }

    static c a(ef ef1)
    {
        return ef1.f;
    }

    static ab a(ef ef1, ab ab1)
    {
        ef1.k = ab1;
        return ab1;
    }

    private void a(double d1)
    {
        e.setX((float)d1);
        e();
    }

    static void a(ef ef1, double d1)
    {
        ef1.a(d1);
    }

    private void a(ej ej1)
    {
        h.add(ej1);
        ej1.a(f.c(), g.c());
    }

    static c b(ef ef1)
    {
        return ef1.g;
    }

    private void b(double d1)
    {
        e.setY((float)d1);
        e();
    }

    static void b(ef ef1, double d1)
    {
        ef1.b(d1);
    }

    private void b(ej ej1)
    {
        h.remove(ej1);
    }

    static ab c(ef ef1)
    {
        return ef1.k;
    }

    private ab d(PointF pointf)
    {
        d();
        b();
        k = ab.a();
        f.a(a).a(false).b(pointf.x);
        g.a(a).a(false).b(pointf.y);
        return k;
    }

    private void d()
    {
        if (k != null)
        {
            k.cancel(false);
            k = null;
        }
    }

    static boolean d(ef ef1)
    {
        return ef1.f();
    }

    private void e()
    {
        for (Iterator iterator = h.iterator(); iterator.hasNext(); ((ej)iterator.next()).a(f.c(), g.c())) { }
    }

    private boolean f()
    {
        return j != null;
    }

    public s a(PointF pointf)
    {
        d(pointf);
        if (f.h() && g.h())
        {
            k.a_(null);
        }
        return k;
    }

    public s a(PointF pointf, float f1, float f2)
    {
        pointf = d(pointf);
        f.c(f1);
        g.c(f2);
        if (f.h() && g.h())
        {
            k.a_(null);
        }
        return pointf;
    }

    public s a(ef ef1, PointF pointf)
    {
        b();
        d();
        k = ab.a();
        f.a(b);
        g.a(b);
        i = new eh(this, pointf.x, pointf.y);
        j = ef1;
        j.a(i);
        return k;
    }

    public void a()
    {
        d();
        b();
        f.a();
        g.a();
    }

    public s b(PointF pointf, float f1, float f2)
    {
        pointf = a(pointf, f1, f2);
        f.a(true);
        g.a(true);
        return pointf;
    }

    public void b()
    {
        if (j != null)
        {
            j.b(i);
            j = null;
        }
    }

    public void b(PointF pointf)
    {
        d();
        b();
        f.a(pointf.x).i();
        g.a(pointf.y).i();
    }

    public void c()
    {
        d();
        f.i();
        g.i();
    }

    public void c(PointF pointf)
    {
        Preconditions.checkNotNull(pointf);
        pointf.x = (float)f.c();
        pointf.y = (float)g.c();
    }

}

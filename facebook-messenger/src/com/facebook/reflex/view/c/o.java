// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.view.c;

import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.reflex.Color;
import com.facebook.reflex.Container;
import com.facebook.reflex.Widget;
import com.facebook.reflex.animation.Change;
import com.facebook.reflex.animation.PropertyName;
import com.facebook.reflex.animation.System;
import com.facebook.reflex.animation.SystemConfig;
import com.facebook.reflex.animation.Transition;
import com.facebook.reflex.animation.a;
import com.facebook.reflex.animation.b;
import com.facebook.reflex.view.b.r;
import com.facebook.reflex.view.h;
import com.google.common.a.hq;
import java.util.ArrayList;

// Referenced classes of package com.facebook.reflex.view.c:
//            q, r

public class o
{

    private final h a;
    private final ArrayList b = hq.a();
    private final Widget c = new Container();
    private final Widget d = new Container();
    private final System e;
    private final Change f = new Change();
    private final Change g = new Change();
    private final q h = new q(this, null);
    private Color i;
    private Color j;
    private int k;
    private boolean l;
    private boolean m;

    public o(h h1, Container container)
    {
        m = false;
        a = h1;
        container.a(c);
        container.a(d);
        i = new Color(0xff5f90ff);
        j = new Color(0xff3e65b3);
        h1 = new SystemConfig();
        container = new PropertyName("selector.opacity");
        h1.declareVariable(container, 0.0F);
        h1.declareWidget("selector");
        h1.a("selector", b.Opacity, container);
        e = new System(h1);
        e.bindWidget("selector", d);
        f.a(container).a(1.0F).a(Transition.a((double)ViewConfiguration.getLongPressTimeout() * 1000000D));
        g.a(container).a(0.0F);
    }

    static h a(o o1)
    {
        return o1.a;
    }

    private void a(r r1, boolean flag)
    {
        a.setPressed(flag);
        r1.f().setPressed(flag);
    }

    static void a(o o1, r r1, boolean flag)
    {
        o1.a(r1, flag);
    }

    static boolean a(o o1, boolean flag)
    {
        o1.m = flag;
        return flag;
    }

    static boolean b(o o1)
    {
        return o1.l;
    }

    static q c(o o1)
    {
        return o1.h;
    }

    static int d(o o1)
    {
        return o1.k;
    }

    static boolean e(o o1)
    {
        return o1.m;
    }

    public void a()
    {
        c(-1);
        m = false;
    }

    public void a(int i1)
    {
        i = new Color(i1);
    }

    public void a(r r1)
    {
        Widget widget = r1.getBackingWidget();
        if (widget.l() == null)
        {
            com.facebook.reflex.view.c.r r2;
            if (b.isEmpty())
            {
                r2 = new com.facebook.reflex.view.c.r(this, null);
            } else
            {
                r2 = (com.facebook.reflex.view.c.r)b.remove(b.size() - 1);
            }
            com.facebook.reflex.view.c.r.a(r2, r1);
            widget.a(r2);
            if (l)
            {
                widget.a(r2);
            }
            if (r1 instanceof com.facebook.reflex.view.b.h)
            {
                ((com.facebook.reflex.view.b.h)r1).setDispatchAndroidTouchEventsEnabled(true);
            }
        }
    }

    public void a(boolean flag)
    {
        l = flag;
    }

    public void b(int i1)
    {
        j = new Color(i1);
    }

    public void b(r r1)
    {
        com.facebook.reflex.ak ak = r1.getBackingWidget().l();
        if (ak instanceof com.facebook.reflex.view.c.r)
        {
            b.add((com.facebook.reflex.view.c.r)ak);
            r1.getBackingWidget().a(null);
            if (l)
            {
                r1.getBackingWidget().a(null);
            }
        }
    }

    public void c(int i1)
    {
        k = i1;
        if (i1 == -1)
        {
            c.a(null);
            c.a(1, 1);
        } else
        {
            int j1 = a.a(i1);
            int k1 = a.a(i1 + 1);
            c.b(0.0F, j1);
            c.a(a.getWidth(), k1 - j1);
            c.a(i);
        }
        d(i1);
    }

    public void d(int i1)
    {
        if (i1 == -1 || !l)
        {
            d.a(null);
            d.a(1, 1);
            e.applyChange(g);
            return;
        } else
        {
            int j1 = a.a(i1);
            i1 = a.a(i1 + 1);
            d.b(0.0F, j1);
            d.a(a.getWidth(), i1 - j1);
            d.a(j);
            e.applyChange(f);
            return;
        }
    }
}

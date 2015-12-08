// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.appboy.d.a;
import com.appboy.d.b;
import com.appboy.d.h;
import com.appboy.f;
import com.appboy.ui.d.d;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.appboy.ui.inappmessage:
//            an, ab, ac, x, 
//            af, z, y, ad, 
//            ae, s, aa

public class w
{

    private static final String a;
    private final View b;
    private View c;
    private View d;
    private List e;
    private final a f;
    private final s g;
    private final Animation h;
    private final Animation i;
    private Runnable j;
    private boolean k;

    public w(View view, a a1, s s1, Animation animation, Animation animation1, View view1)
    {
        b = view;
        f = a1;
        g = s1;
        k = false;
        if (view1 != null)
        {
            c = view1;
        } else
        {
            c = b;
        }
        if (android.os.Build.VERSION.SDK_INT < 12 || !(f instanceof h)) goto _L2; else goto _L1
_L1:
        view = new an(view, new ab(this));
        view.a(new ac(this));
        c.setOnTouchListener(view);
_L4:
        h = animation;
        i = animation1;
        c.setOnClickListener(new x(this));
        return;
_L2:
        if (f instanceof h)
        {
            c.setOnTouchListener(new af(this, b.getContext()));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public w(View view, a a1, s s1, Animation animation, Animation animation1, View view1, List list, 
            View view2)
    {
        this(view, a1, s1, animation, animation1, view1);
        if (view2 != null)
        {
            d = view2;
            d.setOnClickListener(new z(this));
        }
        if (list != null)
        {
            e = list;
            for (view = e.iterator(); view.hasNext(); ((View)view.next()).setOnClickListener(new y(this))) { }
        }
    }

    static a a(w w1)
    {
        return w1.f;
    }

    private void a(boolean flag)
    {
        Animation animation;
        Object obj;
        if (flag)
        {
            animation = h;
        } else
        {
            animation = i;
        }
        if (flag)
        {
            obj = new ad(this);
        } else
        {
            obj = new ae(this);
        }
        animation.setAnimationListener(((android.view.animation.Animation.AnimationListener) (obj)));
        b.clearAnimation();
        b.setAnimation(animation);
        animation.startNow();
        b.invalidate();
    }

    static View b(w w1)
    {
        return w1.b;
    }

    static s c(w w1)
    {
        return w1.g;
    }

    static List d(w w1)
    {
        return w1.e;
    }

    static Runnable e(w w1)
    {
        return w1.j;
    }

    static void f(w w1)
    {
        w1.j();
    }

    static String g()
    {
        return a;
    }

    static void g(w w1)
    {
        w1.h();
    }

    private void h()
    {
        b.removeCallbacks(j);
        g.b();
    }

    static void h(w w1)
    {
        w1.i();
    }

    private void i()
    {
        if (f.l())
        {
            k = true;
            a(false);
            return;
        } else
        {
            com.appboy.ui.d.d.a(b);
            g.c();
            return;
        }
    }

    private void j()
    {
        if (j == null)
        {
            j = new aa(this);
            b.postDelayed(j, f.d());
        }
    }

    public final void a(FrameLayout framelayout)
    {
        g.a(f);
        com.appboy.f.a.a(a, "Adding In-app message view to root FrameLayout.");
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        if (f instanceof h)
        {
            int l;
            if (((h)f).t() == com.appboy.b.a.d.a)
            {
                l = 48;
            } else
            {
                l = 80;
            }
            layoutparams.gravity = l;
        }
        if (f instanceof b)
        {
            b.setFocusableInTouchMode(true);
            b.requestFocus();
        }
        framelayout.addView(b, layoutparams);
        if (f.k())
        {
            com.appboy.f.a.a(a, "In-app message view will animate into the visible area.");
            a(true);
            return;
        }
        com.appboy.f.a.a(a, "In-app message view will be placed instantly into the visible area.");
        if (f.p() == com.appboy.b.a.b.a)
        {
            j();
        }
        g.a();
    }

    public final boolean a()
    {
        return k;
    }

    public final void b()
    {
        g.c();
    }

    public final void c()
    {
        g.b(f);
    }

    public final void d()
    {
        h();
        i();
    }

    public final View e()
    {
        return b;
    }

    public final a f()
    {
        return f;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, com/appboy/ui/inappmessage/w.getName()
        });
    }
}

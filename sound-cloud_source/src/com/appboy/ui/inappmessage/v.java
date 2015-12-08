// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.view.View;
import android.view.animation.Animation;
import com.appboy.d;
import com.appboy.d.a;
import com.appboy.d.k;
import com.appboy.ui.d.f;
import com.appboy.ui.inappmessage.a.c;
import com.appboy.ui.inappmessage.a.j;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.appboy.ui.inappmessage:
//            A, B, w, E, 
//            y, x, C, D, 
//            z

public class v
{

    private static final String e;
    final View a;
    final a b;
    final c c;
    boolean d;
    private View f;
    private View g;
    private List h;
    private final Animation i;
    private final Animation j;
    private Runnable k;

    public v(View view, a a1, c c1, Animation animation, Animation animation1, View view1)
    {
        a = view;
        b = a1;
        c = c1;
        d = false;
        if (view1 != null)
        {
            f = view1;
        } else
        {
            f = a;
        }
        if (android.os.Build.VERSION.SDK_INT < 12 || !(b instanceof k)) goto _L2; else goto _L1
_L1:
        view = new j(view, new A(this));
        view.c = new B(this);
        f.setOnTouchListener(view);
_L4:
        i = animation;
        j = animation1;
        f.setOnClickListener(new w(this));
        return;
_L2:
        if (b instanceof k)
        {
            f.setOnTouchListener(new E(this, a.getContext()));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public v(View view, a a1, c c1, Animation animation, Animation animation1, View view1, List list, 
            View view2)
    {
        this(view, a1, c1, animation, animation1, view1);
        if (view2 != null)
        {
            g = view2;
            g.setOnClickListener(new y(this));
        }
        if (list != null)
        {
            h = list;
            for (view = h.iterator(); view.hasNext(); ((View)view.next()).setOnClickListener(new x(this))) { }
        }
    }

    static a a(v v1)
    {
        return v1.b;
    }

    static View b(v v1)
    {
        return v1.a;
    }

    static c c(v v1)
    {
        return v1.c;
    }

    static String c()
    {
        return e;
    }

    static List d(v v1)
    {
        return v1.h;
    }

    private void d()
    {
        a.removeCallbacks(k);
        c.b();
    }

    static Runnable e(v v1)
    {
        return v1.k;
    }

    private void e()
    {
        if (b.k())
        {
            d = true;
            a(false);
            return;
        } else
        {
            com.appboy.ui.d.f.a(a);
            c.b(b);
            return;
        }
    }

    static void f(v v1)
    {
        v1.b();
    }

    static void g(v v1)
    {
        v1.d();
    }

    static void h(v v1)
    {
        v1.e();
    }

    public final void a()
    {
        d();
        e();
    }

    final void a(boolean flag)
    {
        Animation animation;
        Object obj;
        if (flag)
        {
            animation = i;
        } else
        {
            animation = j;
        }
        if (flag)
        {
            obj = new C(this);
        } else
        {
            obj = new D(this);
        }
        animation.setAnimationListener(((android.view.animation.Animation.AnimationListener) (obj)));
        a.clearAnimation();
        a.setAnimation(animation);
        animation.startNow();
        a.invalidate();
    }

    final void b()
    {
        if (k == null)
        {
            k = new z(this);
            a.postDelayed(k, b.c());
        }
    }

    static 
    {
        e = String.format("%s.%s", new Object[] {
            d.a, com/appboy/ui/inappmessage/v.getName()
        });
    }
}

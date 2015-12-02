// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.titlebar;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.a.c.a;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.n.b;
import com.facebook.n.c;
import com.facebook.n.g;
import com.facebook.n.j;
import com.facebook.o;
import com.facebook.user.User;
import com.facebook.user.tiles.UserTileView;
import com.facebook.user.tiles.e;
import com.facebook.widget.MaskedFrameLayout;
import com.facebook.widget.d;
import com.google.common.d.a.ab;
import com.google.common.d.a.s;
import com.google.common.d.a.w;

// Referenced classes of package com.facebook.orca.common.ui.titlebar:
//            ao, an, ad, ag, 
//            ah, aj, ak, al, 
//            am, af, ae

public class ac extends d
{

    private static final boolean a;
    private static final g b = com.facebook.n.g.a(200D, 7D);
    private static final g c = com.facebook.n.g.a(40D, 7D);
    private final MaskedFrameLayout d;
    private final UserTileView e;
    private final ImageView f;
    private final TextView g;
    private final Handler h;
    private final c i;
    private final c j;
    private final c k;
    private final b l;
    private final b m;
    private final b n;
    private final Runnable o;
    private int p;
    private boolean q;
    private String r;
    private ab s;
    private ab t;
    private ab u;

    public ac(Context context)
    {
        this(context, null, 0);
    }

    public ac(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        context = com.facebook.inject.t.a(context);
        setContentView(k.orca_titlebar_animated_divebar_button_overlay);
        d = (MaskedFrameLayout)c(i.masked_frame_layout);
        g = (TextView)c(i.divebar_button_badge_count);
        e = (UserTileView)c(i.user_tile_view);
        f = (ImageView)c(i.green_dot);
        h = new Handler();
        context = (j)context.a(com/facebook/n/j);
        l = new ao(this, g);
        m = new ao(this, f);
        n = new an(this, null);
        i = context.b().a(b).e(0.004999999888241291D).d(0.004999999888241291D);
        j = context.b().a(b).e(0.004999999888241291D).d(0.004999999888241291D);
        k = context.b().a(c);
        s = ab.a();
        s.a_(null);
        t = ab.a();
        t.a_(null);
        u = ab.a();
        u.a_(null);
        o = new ad(this);
    }

    static int a(ac ac1)
    {
        return ac1.p;
    }

    private s a(float f1)
    {
        if (i.c() != (double)f1 || i.d() != (double)f1)
        {
            s.cancel(false);
            s = ab.a();
            i.b(f1);
        }
        return s;
    }

    static s a(ac ac1, float f1)
    {
        return ac1.a(f1);
    }

    static String a(ac ac1, int i1)
    {
        return ac1.d(i1);
    }

    static boolean a(ac ac1, boolean flag)
    {
        ac1.q = flag;
        return flag;
    }

    static int b(ac ac1, int i1)
    {
        ac1.p = i1;
        return i1;
    }

    static TextView b(ac ac1)
    {
        return ac1.g;
    }

    private s b(float f1)
    {
        if (j.c() != (double)f1 || j.d() != (double)f1)
        {
            t.cancel(false);
            t = ab.a();
            j.b(f1);
        }
        return t;
    }

    private void b()
    {
        if (g.getVisibility() == 0)
        {
            f();
            return;
        } else
        {
            e();
            return;
        }
    }

    private s c(float f1)
    {
        if (k.c() != (double)f1 || k.d() != (double)f1)
        {
            u.cancel(false);
            u = ab.a();
            k.b(f1);
        }
        return u;
    }

    private void c()
    {
        if (g.getVisibility() == 0)
        {
            g();
        }
    }

    static void c(ac ac1)
    {
        ac1.g();
    }

    private String d(int i1)
    {
        if (i1 > 99)
        {
            return getResources().getString(o.divebar_overlay_ninety_nine_plus);
        } else
        {
            return Integer.toString(i1);
        }
    }

    private void d()
    {
        byte byte0 = 8;
        q = false;
        com.a.c.a.d(this, 0.0F);
        com.a.c.a.g(this, 0.0F);
        d.setVisibility(8);
        e.setVisibility(8);
        f.clearAnimation();
        f.setVisibility(8);
        TextView textview = g;
        if (p > 0)
        {
            byte0 = 0;
        }
        textview.setVisibility(byte0);
        setClickable(false);
        setFocusable(false);
    }

    static void d(ac ac1)
    {
        ac1.i();
    }

    private void e()
    {
        g.setVisibility(0);
        g.setText(r);
        i.a(0.0D);
        a(1.0F);
    }

    static void e(ac ac1)
    {
        ac1.j();
    }

    private void f()
    {
        i.a(1.0D);
        a(1.15F);
        h.postDelayed(o, 1000L);
        h.postDelayed(new ag(this), 2000L);
    }

    static void f(ac ac1)
    {
        ac1.k();
    }

    private void g()
    {
        i.a(1.0D);
        a(1.15F).a(new ah(this), w.a());
    }

    static void g(ac ac1)
    {
        ac1.d();
    }

    private void h()
    {
        k.a(1.0D);
        c(0.0F).a(new aj(this), w.a());
    }

    static void h(ac ac1)
    {
        ac1.o();
    }

    static c i(ac ac1)
    {
        return ac1.i;
    }

    private void i()
    {
        h.postDelayed(new ak(this), 1000L);
    }

    static ab j(ac ac1)
    {
        return ac1.s;
    }

    private void j()
    {
        k.a(true);
        c(-0.05F).a(new al(this), w.a());
    }

    static c k(ac ac1)
    {
        return ac1.j;
    }

    private void k()
    {
        k.a(false);
        c(1.0F).a(new am(this), w.a());
    }

    static ab l(ac ac1)
    {
        return ac1.t;
    }

    private void l()
    {
        f.setVisibility(0);
        j.a(0.0D);
        b(1.0F);
    }

    static boolean m(ac ac1)
    {
        return ac1.q;
    }

    static void n(ac ac1)
    {
        ac1.l();
    }

    static ab o(ac ac1)
    {
        return ac1.u;
    }

    private void o()
    {
        if (i.h() && j.h() && k.h())
        {
            setViewCachingEnabled(false);
        }
    }

    public void a()
    {
        f.setVisibility(0);
        android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)f.getLayoutParams();
        layoutparams.gravity = 83;
        f.setLayoutParams(layoutparams);
    }

    public void a(int i1)
    {
        if (i1 > 0)
        {
            com.a.c.a.e(g, 1.0F);
            com.a.c.a.f(g, 1.0F);
            g.setVisibility(0);
            p = i1;
            g.setText(d(p));
        }
    }

    public void a(int i1, int j1)
    {
        setBadgeCount(i1);
        p = j1;
        if (i1 != j1)
        {
            h.postDelayed(o, 1000L);
        }
        h.postDelayed(new af(this), 2000L);
    }

    public void a(User user)
    {
        setClickable(true);
        setFocusable(true);
        e.setParams(com.facebook.user.tiles.e.a(user));
        d.setVisibility(0);
        e.setVisibility(0);
        user = (android.widget.FrameLayout.LayoutParams)f.getLayoutParams();
        user.gravity = 85;
        f.setLayoutParams(user);
        g.setVisibility(8);
        f.setVisibility(8);
        h();
    }

    public void b(int i1)
    {
        if (i1 > 0)
        {
            a(i1);
            h.postDelayed(new ae(this), 3000L);
        }
    }

    public int getBadgeCount()
    {
        return p;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        i.a(l);
        j.a(m);
        k.a(n);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        i.j();
        j.j();
        k.j();
    }

    public void setBadgeCount(int i1)
    {
        if (p == i1)
        {
            return;
        }
        p = i1;
        if (i1 > 0)
        {
            r = d(i1);
            b();
            return;
        } else
        {
            c();
            return;
        }
    }

    protected void setViewCachingEnabled(boolean flag)
    {
        if (a)
        {
            byte byte0;
            if (flag)
            {
                byte0 = 2;
            } else
            {
                byte0 = 0;
            }
            setLayerType(byte0, null);
            return;
        } else
        {
            setDrawingCacheEnabled(flag);
            return;
        }
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}

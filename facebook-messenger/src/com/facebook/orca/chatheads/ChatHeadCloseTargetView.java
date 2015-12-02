// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.a.c.a;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.n.c;
import com.facebook.n.g;
import com.facebook.n.j;
import com.facebook.orca.chatheads.annotations.ForChatHeads;
import com.facebook.widget.d;
import com.google.common.base.Preconditions;
import com.google.common.d.a.ab;
import com.google.common.d.a.s;

// Referenced classes of package com.facebook.orca.chatheads:
//            k, m, l, j

public class ChatHeadCloseTargetView extends d
{

    private static final g a = com.facebook.n.g.a(40D, 7D);
    private static final g b = com.facebook.n.g.a(150D, 9D);
    private final View c;
    private final View d;
    private final View e;
    private final c f;
    private final c g;
    private final c h;
    private final c i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private boolean q;
    private boolean r;
    private float s;
    private float t;
    private l u;
    private m v;
    private ab w;
    private Rect x;
    private PointF y;

    public ChatHeadCloseTargetView(Context context)
    {
        this(context, null);
    }

    public ChatHeadCloseTargetView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ChatHeadCloseTargetView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        x = new Rect();
        y = new PointF();
        setContentView(k.orca_chat_close_target);
        c = c(i.background);
        d = c(i.close_bauble);
        e = c(i.close_bauble_base);
        context = (j)com.facebook.inject.t.a(context).a(com/facebook/n/j, com/facebook/orca/chatheads/annotations/ForChatHeads);
        attributeset = new com.facebook.orca.chatheads.k(this, null);
        f = context.b().a(a).a(attributeset);
        g = context.b().a(a).a(attributeset);
        h = context.b().a(b).a(0.625D).b(0.625D).e(0.004999999888241291D).e(0.004999999888241291D).a(attributeset);
        i = context.b().a(a).a(true).e(0.004999999888241291D).e(0.004999999888241291D).a(attributeset);
        j = getResources().getDimensionPixelOffset(com.facebook.g.chat_close_unstashed_y);
        k = getResources().getDimensionPixelOffset(com.facebook.g.chat_close_stashed_y);
        l = getResources().getDimensionPixelSize(com.facebook.g.chat_close_area_width);
        m = getResources().getDimensionPixelSize(com.facebook.g.chat_close_area_height);
        n = getResources().getDimensionPixelSize(com.facebook.g.chat_close_fling_area_width);
        o = getResources().getDimensionPixelOffset(com.facebook.g.chat_close_min_distance);
        p = getResources().getDimensionPixelOffset(com.facebook.g.chat_close_max_attract_y);
        b();
        g();
    }

    private float a(float f1)
    {
        int i1 = d.getHeight();
        float f2 = j;
        float f3 = getHeight();
        return Math.max(f2, (float)(i1 / 2) + (f1 - f3));
    }

    static float a(ChatHeadCloseTargetView chatheadclosetargetview)
    {
        return chatheadclosetargetview.s;
    }

    static ab a(ChatHeadCloseTargetView chatheadclosetargetview, ab ab1)
    {
        chatheadclosetargetview.w = ab1;
        return ab1;
    }

    static void a(ChatHeadCloseTargetView chatheadclosetargetview, float f1)
    {
        chatheadclosetargetview.setBaubleX(f1);
    }

    static void a(ChatHeadCloseTargetView chatheadclosetargetview, float f1, float f2)
    {
        chatheadclosetargetview.d(f1, f2);
    }

    private float b(float f1)
    {
        f1 = a(f1);
        int i1 = d.getHeight();
        return (f1 + (float)getHeight()) - (float)(i1 / 2);
    }

    static float b(ChatHeadCloseTargetView chatheadclosetargetview)
    {
        return chatheadclosetargetview.t;
    }

    static void b(ChatHeadCloseTargetView chatheadclosetargetview, float f1)
    {
        chatheadclosetargetview.setBaubleY(f1);
    }

    static c c(ChatHeadCloseTargetView chatheadclosetargetview)
    {
        return chatheadclosetargetview.f;
    }

    static c d(ChatHeadCloseTargetView chatheadclosetargetview)
    {
        return chatheadclosetargetview.g;
    }

    private void d(float f1, float f2)
    {
        f();
        if (!r && v != null)
        {
            v.a();
        }
        q = false;
        r = true;
        float f3 = a(f2);
        float f4 = getCloseBaubleCenterXInScreen();
        float f5 = b(f2);
        f5 = Math.max(-p, Math.min(0.0F, (f2 - f5) * 0.1F));
        f.b((f1 - f4) * 0.1F).a(false);
        g.b(f3 + f5).a(false);
        c c1 = h.a(false);
        double d1;
        if (b(f1, f2))
        {
            d1 = 1.0D;
        } else
        {
            d1 = 0.625D;
        }
        c1.b(d1);
        i.a(false).b(1.0D);
    }

    static c e(ChatHeadCloseTargetView chatheadclosetargetview)
    {
        return chatheadclosetargetview.h;
    }

    static View f(ChatHeadCloseTargetView chatheadclosetargetview)
    {
        return chatheadclosetargetview.e;
    }

    private void f()
    {
        if (w != null)
        {
            w.cancel(false);
            w = null;
        }
    }

    static c g(ChatHeadCloseTargetView chatheadclosetargetview)
    {
        return chatheadclosetargetview.i;
    }

    private void g()
    {
        f.a(f.d());
        g.a(g.d());
        h.a(h.d());
        i.a(i.d());
        f();
    }

    private int getCloseBaubleCenterXInScreen()
    {
        return getWidth() / 2;
    }

    static View h(ChatHeadCloseTargetView chatheadclosetargetview)
    {
        return chatheadclosetargetview.c;
    }

    private boolean h()
    {
        return f.h() && g.h() && h.h() && i.h();
    }

    static ab i(ChatHeadCloseTargetView chatheadclosetargetview)
    {
        return chatheadclosetargetview.w;
    }

    static boolean j(ChatHeadCloseTargetView chatheadclosetargetview)
    {
        return chatheadclosetargetview.h();
    }

    private void setBaubleX(float f1)
    {
        com.a.c.a.g(d, f1);
        if (u != null)
        {
            u.a();
        }
    }

    private void setBaubleY(float f1)
    {
        com.a.c.a.h(d, f1);
        if (u != null)
        {
            u.a();
        }
    }

    public void a()
    {
        f.a();
        g.a();
        h.a();
        i.a();
        if (w != null)
        {
            w.cancel(false);
        }
    }

    public void a(float f1, float f2)
    {
        if (q)
        {
            f();
        }
        q = false;
        if (r || b(f1, f2))
        {
            d(f1, f2);
        }
        if (!r)
        {
            s = f1;
            t = f2;
            if (w == null)
            {
                w = ab.a();
                com.google.common.d.a.i.a(w, new com.facebook.orca.chatheads.j(this));
                i.b(1.0D);
                if (h())
                {
                    w.a_(null);
                }
            }
        }
    }

    public void a(PointF pointf)
    {
        Preconditions.checkNotNull(pointf);
        if (getParent() == null || !d.getGlobalVisibleRect(x))
        {
            DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
            pointf.x = displaymetrics.widthPixels / 2;
            pointf.y = displaymetrics.heightPixels;
            return;
        } else
        {
            pointf.x = x.centerX();
            pointf.y = x.centerY();
            return;
        }
    }

    public boolean a(float f1, float f2, float f3, float f4)
    {
        while (f4 <= 0.0F || Math.abs(((((float)getResources().getDisplayMetrics().heightPixels - f2) / f4) * f3 + f1) - (float)getCloseBaubleCenterXInScreen()) >= (float)(n / 2)) 
        {
            return false;
        }
        return true;
    }

    public s b()
    {
        if (q)
        {
            if (w != null)
            {
                return w;
            } else
            {
                return com.google.common.d.a.i.a(null);
            }
        }
        f();
        if (r && v != null)
        {
            v.b();
        }
        r = false;
        q = true;
        w = ab.a();
        f.b(0.0D).a(true);
        g.b(k).a(true);
        h.a(true).b(0.625D);
        i.a(true).b(0.0D);
        if (h())
        {
            w.a_(null);
        }
        return w;
    }

    public boolean b(float f1, float f2)
    {
        float f3 = getCloseBaubleCenterXInScreen();
        float f4 = getHeight() - m;
        return Math.abs(f1 - f3) < (float)(l / 2) && f2 - f4 >= 0.0F;
    }

    public boolean c()
    {
        return q;
    }

    public boolean c(float f1, float f2)
    {
        if (!q)
        {
            a(y);
            f1 -= y.x;
            f2 -= y.y;
            if (f1 * f1 + f2 * f2 <= (float)(o * o))
            {
                return true;
            }
        }
        return false;
    }

    public void d()
    {
        if (!r)
        {
            f();
        }
        d(getCloseBaubleCenterXInScreen(), 0.0F);
    }

    public void e()
    {
        if (!r)
        {
            f();
        }
        d(getCloseBaubleCenterXInScreen(), b(0.0F));
    }

    public void setOnCloseBaublePositionListener(l l1)
    {
        u = l1;
    }

    public void setOnCloseBaubleStateChangeListener(m m1)
    {
        v = m1;
    }

}

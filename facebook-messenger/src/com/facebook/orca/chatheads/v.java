// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.a.c.a.a;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.messages.model.threads.Message;
import com.facebook.n.c;
import com.facebook.n.g;
import com.facebook.n.j;
import com.facebook.orca.common.ui.a.b;
import com.facebook.orca.common.ui.widgets.text.MultilineEllipsizeTextView;
import com.facebook.widget.MaskedFrameLayout;
import com.facebook.widget.d;
import com.google.common.d.a.ab;
import com.google.common.d.a.s;

// Referenced classes of package com.facebook.orca.chatheads:
//            w, ac, x, aa, 
//            ad, z, y, ab

public class v extends d
{

    private static final Class a = com/facebook/orca/chatheads/v;
    private static final g b = com.facebook.n.g.a(40D, 7D);
    private final b c;
    private final Handler d;
    private final c e;
    private final c f;
    private final MaskedFrameLayout g;
    private final MultilineEllipsizeTextView h;
    private final MaskedFrameLayout i;
    private final MultilineEllipsizeTextView j;
    private final Runnable k;
    private ac l;
    private GestureDetector m;
    private ab n;
    private ab o;
    private com.facebook.orca.chatheads.ab p;
    private android.view.View.OnClickListener q;

    public v(Context context)
    {
        this(context, null);
    }

    public v(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public v(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        k = new w(this);
        attributeset = t.a(context);
        j j1 = (j)attributeset.a(com/facebook/n/j);
        c = (b)attributeset.a(com/facebook/orca/common/ui/a/b);
        d = (Handler)attributeset.a(android/os/Handler);
        setContentView(k.orca_chat_head_text_bubble);
        g = (MaskedFrameLayout)c(i.left_origin_mask);
        h = (MultilineEllipsizeTextView)c(i.left_origin_text_view);
        i = (MaskedFrameLayout)c(i.right_origin_mask);
        j = (MultilineEllipsizeTextView)c(i.right_origin_text_view);
        setOrigin(ac.LEFT);
        if (a.a)
        {
            g.setDrawingCacheEnabled(true);
            i.setDrawingCacheEnabled(true);
        }
        super.setOnClickListener(new x(this));
        m = new GestureDetector(context, new aa(this, null));
        e = j1.b().a(b).e(0.0010000000474974513D).d(0.0010000000474974513D).a(new ad(this, null));
        f = j1.b().a(b).e(0.0010000000474974513D).d(0.0010000000474974513D).a(new z(this, null));
    }

    static ab a(v v1, ab ab1)
    {
        v1.o = ab1;
        return ab1;
    }

    private s a(double d1)
    {
        boolean flag = false;
        if (e.d() == d1)
        {
            if (n != null)
            {
                return n;
            } else
            {
                return com.google.common.d.a.i.a(null);
            }
        }
        if (n != null)
        {
            n.cancel(false);
        }
        n = ab.a();
        c c1 = e;
        if (d1 != 0.0D)
        {
            flag = true;
        }
        c1.a(flag);
        e.b(d1);
        return n;
    }

    static s a(v v1, double d1)
    {
        return v1.b(d1);
    }

    private void a(View view)
    {
        b(0.0D);
        if (q != null)
        {
            q.onClick(view);
        }
    }

    private void a(View view, float f1, float f2)
    {
        f2 = -0.09F * f2 + f1;
        com.a.c.a.e(view, f2);
        com.a.c.a.f(view, f2);
        a(view, Math.max(0.0F, Math.min(f1, 1.0F)));
    }

    static void a(v v1)
    {
        v1.f();
    }

    static void a(v v1, View view)
    {
        v1.a(view);
    }

    static com.facebook.orca.chatheads.ab b(v v1)
    {
        return v1.p;
    }

    static ab b(v v1, ab ab1)
    {
        v1.n = ab1;
        return ab1;
    }

    private s b(double d1)
    {
        if (d1 == f.d())
        {
            if (o != null)
            {
                return o;
            } else
            {
                return com.google.common.d.a.i.a(null);
            }
        }
        o = ab.a();
        c c1 = f;
        boolean flag;
        if (d1 != 0.0D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c1.a(flag);
        f.b(d1);
        return o;
    }

    static Class c()
    {
        return a;
    }

    static void c(v v1)
    {
        v1.e();
    }

    private void d()
    {
        e();
        d.postDelayed(k, 5000L);
    }

    static void d(v v1)
    {
        v1.g();
    }

    static ab e(v v1)
    {
        return v1.o;
    }

    private void e()
    {
        d.removeCallbacks(k);
    }

    static ab f(v v1)
    {
        return v1.n;
    }

    private void f()
    {
        com.google.common.d.a.i.a(b(), new y(this));
    }

    private void g()
    {
        float f1 = (float)e.c();
        float f2 = (float)f.c();
        a(g, f1, f2);
        a(i, f1, f2);
    }

    public s a()
    {
        d();
        return a(1.0D);
    }

    public s b()
    {
        e();
        return a(0.0D);
    }

    public ac getOrigin()
    {
        return l;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        com.a.c.a.b(g, 0.0F);
        com.a.c.a.c(g, j1 / 2);
        com.a.c.a.b(i, i1);
        com.a.c.a.c(i, j1 / 2);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1 || motionevent.getAction() == 3)
        {
            d();
        }
        return m.onTouchEvent(motionevent) || super.onTouchEvent(motionevent);
    }

    public void setMessage(Message message)
    {
        message = c.a(message);
        h.setText(message);
        j.setText(message);
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        q = onclicklistener;
    }

    public void setOnTextBubbleAutoHideListener(com.facebook.orca.chatheads.ab ab1)
    {
        p = ab1;
    }

    public void setOrigin(ac ac1)
    {
label0:
        {
            if (l != ac1)
            {
                l = ac1;
                if (l != ac.LEFT)
                {
                    break label0;
                }
                g.setVisibility(0);
                i.setVisibility(8);
            }
            return;
        }
        g.setVisibility(8);
        i.setVisibility(0);
    }

}

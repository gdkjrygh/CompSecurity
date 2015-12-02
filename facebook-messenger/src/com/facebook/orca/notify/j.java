// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import com.facebook.analytics.av;
import com.facebook.analytics.i.c;
import com.facebook.b.a.b;
import com.facebook.common.v.f;
import com.facebook.config.a.a;
import com.facebook.config.a.d;
import com.facebook.i;
import com.facebook.messages.model.threads.Message;
import com.facebook.orca.emoji.z;
import com.facebook.orca.threadlist.t;
import com.facebook.orca.threads.r;
import com.facebook.orca.threadview.ThreadViewActivity;
import com.facebook.orca.threadview.do;
import com.facebook.widget.OverlayLayout;
import com.facebook.widget.k;
import com.google.common.base.Objects;
import com.google.common.d.a.s;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

// Referenced classes of package com.facebook.orca.notify:
//            a, s, v, p, 
//            m, n, r, o, 
//            k, ap, c, l

public class j extends com.facebook.orca.notify.a
{

    private static final int a;
    private final javax.inject.a b;
    private final a c;
    private final com.facebook.orca.notify.s d = new com.facebook.orca.notify.s(this);
    private final z e;
    private final do f;
    private final r g;
    private final ExecutorService h;
    private final ExecutorService i;
    private final f j;
    private final com.facebook.i.a.a.f k;
    private final ComponentName l;
    private final b m;
    private Activity n;
    private v o;
    private com.facebook.common.a.c p;
    private ap q;
    private boolean r;

    public j(javax.inject.a a1, a a2, z z, do do1, r r1, ExecutorService executorservice, ExecutorService executorservice1, 
            f f1, com.facebook.i.a.a.f f2, ComponentName componentname, b b1)
    {
        b = a1;
        c = a2;
        e = z;
        f = do1;
        g = r1;
        h = executorservice;
        i = executorservice1;
        j = f1;
        k = f2;
        l = componentname;
        m = b1;
    }

    static Activity a(j j1, Activity activity)
    {
        j1.n = activity;
        return activity;
    }

    static v a(j j1, v v1)
    {
        j1.o = v1;
        return v1;
    }

    private v a(OverlayLayout overlaylayout)
    {
        v v1 = new v(n, e, g);
        k k1 = new k(-1, -2);
        k1.b = a;
        k1.a = true;
        k1.c = 68;
        v1.setLayoutParams(k1);
        overlaylayout.addView(v1);
        v1.measure(android.view.View.MeasureSpec.makeMeasureSpec(n.getWindowManager().getDefaultDisplay().getWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        overlaylayout = new TranslateAnimation(0.0F, 0.0F, -v1.getMeasuredHeight(), 0.0F);
        overlaylayout.setDuration(600L);
        overlaylayout.setFillAfter(false);
        overlaylayout.setInterpolator(new AccelerateDecelerateInterpolator());
        overlaylayout.setAnimationListener(new p(this, null));
        v1.startAnimation(overlaylayout);
        v1.setOnDismissListener(new m(this));
        v1.setOnClickListener(new n(this));
        return v1;
    }

    private void a(View view)
    {
        android.view.ViewParent viewparent = view.getParent();
        if (viewparent instanceof ViewGroup)
        {
            ((ViewGroup)viewparent).removeView(view);
        }
    }

    static void a(j j1)
    {
        j1.d();
    }

    static void a(j j1, View view)
    {
        j1.a(view);
    }

    static void a(j j1, com.facebook.orca.notify.r r1)
    {
        j1.a(r1);
    }

    static void a(j j1, String s1)
    {
        j1.c(s1);
    }

    private void a(com.facebook.orca.notify.r r1)
    {
        if (o == null)
        {
            return;
        }
        if (r1 != r.SLIDE_OUT) goto _L2; else goto _L1
_L1:
        r1 = new TranslateAnimation(0.0F, 0.0F, 0.0F, -o.getMeasuredHeight());
        r1.setDuration(600L);
        r1.setFillAfter(false);
        r1.setInterpolator(new AccelerateDecelerateInterpolator());
        r1.setAnimationListener(new p(this, null));
        o.startAnimation(r1);
_L4:
        a(((View) (o)));
        o = null;
        return;
_L2:
        if (r1 == r.FADE_OUT)
        {
            r1 = new AlphaAnimation(1.0F, 0.0F);
            r1.setDuration(400L);
            r1.setFillAfter(false);
            r1.setInterpolator(new AccelerateDecelerateInterpolator());
            r1.setAnimationListener(new p(this, null));
            o.startAnimation(r1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static boolean a(j j1, ap ap1)
    {
        return j1.d(ap1);
    }

    static boolean a(j j1, boolean flag)
    {
        j1.r = flag;
        return flag;
    }

    static ap b(j j1, ap ap1)
    {
        j1.q = ap1;
        return ap1;
    }

    static void b(j j1)
    {
        j1.c();
    }

    private void c()
    {
        if (o == null || n == null)
        {
            return;
        }
        String s1 = o.getMessage().e();
        com.facebook.analytics.i.c.a(n).a("beeper_popup");
        if (n instanceof com.facebook.orca.activity.c)
        {
            ((com.facebook.orca.activity.c)n).a(new o(this, s1));
            return;
        } else
        {
            c(s1);
            return;
        }
    }

    private void c(ap ap1)
    {
        com.facebook.orca.notify.k k1 = new com.facebook.orca.notify.k(this, ap1);
        j.c();
        try
        {
            if (((Boolean)i.submit(k1).get()).booleanValue())
            {
                ap1.e().i();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ap ap1)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ap ap1)
        {
            return;
        }
    }

    static void c(j j1)
    {
        j1.e();
    }

    private void c(String s1)
    {
        if (c.i() == d.MESSENGER)
        {
            Intent intent = new Intent();
            intent.setComponent(l);
            intent.setFlags(0x4000000);
            n.startActivity(intent);
            intent = new Intent(n, com/facebook/orca/threadview/ThreadViewActivity);
            intent.putExtra("thread_id", s1);
            n.startActivity(intent);
        } else
        {
            Intent intent1 = new Intent(n, com/facebook/orca/threadview/ThreadViewActivity);
            intent1.putExtra("thread_id", s1);
            intent1.setFlags(0x4000000);
            n.startActivity(intent1);
        }
        e();
    }

    static v d(j j1)
    {
        return j1.o;
    }

    private void d()
    {
        a(r.FADE_OUT);
        e();
    }

    private boolean d(ap ap1)
    {
        if (r)
        {
            q = ap1;
            return true;
        }
        Object obj1 = (ViewGroup)n.findViewById(0x1020002);
        Object obj = ((ViewGroup) (obj1)).getChildAt(0);
        if (!(obj instanceof OverlayLayout))
        {
            obj1 = ((ViewGroup) (obj1)).findViewById(a);
            if (obj1 == null)
            {
                return false;
            }
            obj1 = (ViewGroup)((View) (obj1)).getParent();
            if (obj1 != null && (obj1 instanceof OverlayLayout))
            {
                obj = obj1;
            }
        }
        if (!(obj instanceof OverlayLayout))
        {
            return false;
        }
        obj = (OverlayLayout)obj;
        if (o == null)
        {
            o = a(((OverlayLayout) (obj)));
            o.setMessage(ap1.b());
        } else
        {
            o.setMessage(ap1.b());
            p.a();
        }
        p = new com.facebook.common.a.c(new l(this));
        o.postDelayed(p, 5000L);
        return true;
    }

    static ap e(j j1)
    {
        return j1.q;
    }

    private void e()
    {
        if (p != null)
        {
            p.a();
            p = null;
        }
        a(r.NONE);
    }

    static ExecutorService f(j j1)
    {
        return j1.h;
    }

    public com.facebook.orca.notify.s b()
    {
        return d;
    }

    protected void b(ap ap1)
    {
        if (((Boolean)b.b()).booleanValue() && !ap1.e().h() && !ap1.e().f() && n != null)
        {
            s s1 = m.d();
            boolean flag;
            try
            {
                flag = ((Boolean)s1.get()).booleanValue();
            }
            catch (InterruptedException interruptedexception)
            {
                flag = false;
            }
            catch (ExecutionException executionexception)
            {
                flag = false;
            }
            if (!flag || Boolean.TRUE.equals(k.a(com.facebook.messages.ipc.peer.d.j)))
            {
                c(ap1);
                return;
            }
        }
    }

    public boolean b(String s1)
    {
        if (!((Boolean)b.b()).booleanValue())
        {
            return false;
        }
        boolean flag = f.b(n);
        if (!flag && (n instanceof com.facebook.orca.threadlist.s) && !((com.facebook.orca.threadlist.s)n).a().x())
        {
            return false;
        }
        return !flag || !Objects.equal(f.a(n), s1);
    }

    static 
    {
        a = i.titlebar;
    }
}

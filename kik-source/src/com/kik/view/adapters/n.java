// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.kik.cache.ad;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import kik.a.d.a.a;
import kik.a.d.a.g;
import kik.a.d.f;
import kik.a.d.k;
import kik.a.d.s;
import kik.a.e.r;
import kik.android.chat.KikApplication;
import kik.android.chat.b.d;
import kik.android.net.a.b;
import kik.android.net.a.c;
import kik.android.net.a.e;
import kik.android.util.ae;
import kik.android.util.cv;
import kik.android.widget.IconImageView;
import kik.android.widget.MaskedFramelayout;
import kik.android.widget.ProgressWheel;
import kik.android.widget.ProgressWidget;

// Referenced classes of package com.kik.view.adapters:
//            ay, aq, q, r, 
//            o, p

public abstract class n extends ay
    implements aq
{
    public static class a extends ay.a
    {

        IconImageView h;
        View i;
        TextView j;
        ImageView k;
        View l;
        MaskedFramelayout m;

        public a()
        {
        }
    }


    private kik.a.f.k a;
    protected HashSet b;
    protected boolean c;
    protected final d d;
    private final android.view.View.OnClickListener r;

    public n(LayoutInflater layoutinflater, Context context, android.view.View.OnClickListener onclicklistener, android.view.View.OnClickListener onclicklistener1, ar.a a1, ad ad, com.kik.android.a a2, 
            kik.a.e.n n1, kik.a.f.k k1, d d1, com.kik.e.a a3)
    {
        super(layoutinflater, context, onclicklistener, a1, a2, ad, n1, a3);
        b = new HashSet();
        r = onclicklistener1;
        a = k1;
        d = d1;
    }

    public void a(ar.b b1, s s1, boolean flag, Context context, au.b b2)
    {
        super.a(b1, s1, flag, context, b2);
        b1 = (a)b1;
        ((a) (b1)).m.setOnClickListener(new q(this, b2, b1));
        ((a) (b1)).m.setOnCreateContextMenuListener(new com.kik.view.adapters.r(this));
    }

    public final void a(HashSet hashset)
    {
        b = new HashSet(hashset);
    }

    protected abstract void a(kik.a.d.a.a a1, a a2, boolean flag);

    protected void a(s s1, ar.b b1)
    {
        a a1 = (a)b1;
        kik.a.d.a.a a2;
        boolean flag;
        if (s1.d())
        {
            a1.i.setPadding(0, 0, p, 0);
        } else
        {
            a1.i.setPadding(p, 0, 0, 0);
        }
        a(s1, a1);
        flag = a(s1);
        a1.k.setOnClickListener(r);
        a2 = (kik.a.d.a.a)g.a(s1, kik/a/d/a/a);
        if (a2 == null)
        {
            return;
        }
        a1.k.setTag(s1);
        a(a2, a1, flag);
        int i;
        if ("true".equals(a2.g("allow-forward")))
        {
            a1.k.setVisibility(0);
        } else
        {
            a1.k.setVisibility(8);
        }
        a1.j.setMaxWidth(KikApplication.a(120));
        cv.b(new View[] {
            a1.j
        });
        cv.a(a1.j);
        a1.j.setText(ae.a(a2));
        a1.h.a(a2, n);
        i = a2.v();
        if (s1.d() && a2.w() >= 0 && (i != kik.a.d.a.a.a.e && i != kik.a.d.a.a.a.a || s1.c() == -100))
        {
            b1 = (ViewStub)a1.r.findViewById(0x7f0e015a);
            ProgressWidget progresswidget = (ProgressWidget)a1.r.findViewById(0x7f0e01c8);
            if (progresswidget == null && b1 != null)
            {
                b1.inflate();
                progresswidget = (ProgressWidget)a1.r.findViewById(0x7f0e01c8);
            }
            progresswidget.setVisibility(0);
            ((ProgressWidget)a1.r.findViewById(0x7f0e01c8)).a(a(a1));
            b(a1);
            Object obj;
            if (i == kik.a.d.a.a.a.d)
            {
                progresswidget.b();
                obj = null;
            } else
            {
                obj = e.a().a(a2.o());
                b1 = ((ar.b) (obj));
                if (obj == null)
                {
                    b1 = new c(a2, s1.i(), s1.b(), s1.o(), e, a, n, g, this.i, j);
                    b1.i();
                    b1 = new WeakReference(b1);
                }
                progresswidget.a(b1);
                ProgressWheel progresswheel = d(a1);
                obj = b1;
                if (progresswheel != null)
                {
                    progresswidget.a(progresswheel);
                    obj = b1;
                }
            }
            if (obj != null)
            {
                progresswidget.a(new o(this, (b)((WeakReference) (obj)).get(), progresswidget, a1, s1));
                return;
            } else
            {
                progresswidget.a(new p(this, a2));
                return;
            }
        } else
        {
            s1 = (ProgressWidget)a1.r.findViewById(0x7f0e01c8);
            if (s1 != null)
            {
                s1.a(null);
                s1.a(null, null);
                s1.setVisibility(8);
            }
            cv.b(a(a1));
            c(a1);
            return;
        }
    }

    protected void a(s s1, a a1)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)a1.m.getLayoutParams();
        if (s1.d())
        {
            a1.m.a(0x7f0201fb);
            layoutparams.addRule(11, -1);
            layoutparams.addRule(9, 0);
            layoutparams.setMargins(KikApplication.a(45), layoutparams.topMargin, KikApplication.a(3), layoutparams.bottomMargin);
            return;
        } else
        {
            a1.m.a(0x7f0201ab);
            layoutparams.addRule(11, 0);
            layoutparams.addRule(9, -1);
            layoutparams.setMargins(KikApplication.a(52), layoutparams.topMargin, 0, layoutparams.bottomMargin);
            return;
        }
    }

    protected final void a(b b1, ImageView imageview, ProgressWidget progresswidget, f f1, String s1)
    {
        imageview.setImageResource(0x7f02022f);
        f1.a(s1, -100, g);
        e.a().b(b1);
        progresswidget.b();
    }

    protected void a(b b1, ProgressWidget progresswidget, a a1, s s1)
    {
        e.a().a(b1);
        if (progresswidget != null)
        {
            progresswidget.a();
        }
    }

    public final boolean a(s s1)
    {
        boolean flag;
        if (s1 == null || !c)
        {
            return false;
        }
        Object obj = f.a(s1.i(), false);
        if (obj != null && (obj instanceof kik.a.d.n) && ((kik.a.d.n)obj).I())
        {
            return false;
        }
        if (obj != null && ((k) (obj)).v())
        {
            return false;
        }
        s1 = (kik.a.d.a.a)g.a(s1, kik/a/d/a/a);
        if (s1 == null)
        {
            s1 = null;
        } else
        {
            s1 = s1.o();
        }
        obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (s1 == null) goto _L2; else goto _L1
_L1:
        if (!c || b == null || b.contains(s1)) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        obj;
        JVM INSTR monitorexit ;
        return flag;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected View[] a(a a1)
    {
        return (new View[] {
            a1.i
        });
    }

    public final void b()
    {
        c = true;
    }

    protected abstract void b(a a1);

    public final void b(s s1)
    {
        if (s1 == null)
        {
            return;
        }
        s1 = (kik.a.d.a.a)g.a(s1, kik/a/d/a/a);
        if (s1 == null)
        {
            s1 = null;
        } else
        {
            s1 = s1.o();
        }
        synchronized (b)
        {
            b.add(s1);
        }
        return;
        s1;
        hashset;
        JVM INSTR monitorexit ;
        throw s1;
    }

    protected abstract void c(a a1);

    protected ProgressWheel d(a a1)
    {
        return null;
    }

    protected void d(kik.a.d.a.a a1)
    {
        Toast.makeText(l, 0x7f0902bb, 0).show();
    }
}

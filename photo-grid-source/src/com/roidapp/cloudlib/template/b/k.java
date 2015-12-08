// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.template.b;

import android.content.Context;
import android.view.animation.AlphaAnimation;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.baselib.c.an;
import com.roidapp.cloudlib.aq;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.template.TemplateInfo;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.roidapp.cloudlib.template.b:
//            e, d, j, h, 
//            g

public final class k
{

    private Map a;
    private j b;
    private j c;
    private WeakReference d;
    private WeakReference e;

    public k(WeakReference weakreference, WeakReference weakreference1)
    {
        d = weakreference;
        e = weakreference1;
        a = new HashMap();
    }

    public final void a(int i)
    {
        b = new e(d, e);
        d d1 = new d();
        d1.f = true;
        d1.h = i;
        b.a(d1);
    }

    public final void a(long l)
    {
        if (a != null && a.containsKey(Long.valueOf(l)))
        {
            a.remove(Long.valueOf(l));
        }
    }

    public final void a(TemplateInfo templateinfo)
    {
        Object obj = (Context)d.get();
        if (a != null && a.containsKey(Long.valueOf(templateinfo.e())))
        {
            j j1 = (j)a.get(Long.valueOf(templateinfo.e()));
            if (j1 != null && !j1.isCancelled())
            {
                if (obj != null)
                {
                    an.c(d, ((Context) (obj)).getString(at.aU));
                }
                return;
            }
            a.remove(Long.valueOf(templateinfo.e()));
        }
        c = new h(d, e);
        obj = new g();
        obj.b = true;
        obj.d = templateinfo;
        c.a(((l) (obj)));
    }

    public final boolean a()
    {
        return a != null && !a.isEmpty();
    }

    public final void b()
    {
        b = new e(d, e);
        d d1 = new d();
        d1.a = true;
        b.a(d1);
    }

    public final void b(int i)
    {
        b = new e(d, e);
        d d1 = new d();
        d1.f = true;
        d1.g = true;
        d1.h = i;
        b.a(d1);
    }

    public final void b(TemplateInfo templateinfo)
    {
        if (a == null || !a.containsKey(Long.valueOf(templateinfo.e()))) goto _L2; else goto _L1
_L1:
        j j1 = (j)a.get(Long.valueOf(templateinfo.e()));
        if (j1 == null || j1.isCancelled()) goto _L4; else goto _L3
_L3:
        templateinfo = (Context)d.get();
        if (templateinfo != null)
        {
            an.c(d, templateinfo.getString(at.aU));
        }
_L6:
        return;
_L4:
        a.remove(Long.valueOf(templateinfo.e()));
_L2:
        c = new h(d, e);
        g g1 = new g();
        g1.c = true;
        g1.d = templateinfo;
        ProgressBar progressbar = templateinfo.c();
        if (progressbar != null)
        {
            RelativeLayout relativelayout = (RelativeLayout)progressbar.getParent();
            Object obj = new AlphaAnimation(0.0F, 1.0F);
            ((AlphaAnimation) (obj)).setDuration(200L);
            relativelayout.startAnimation(((android.view.animation.Animation) (obj)));
            obj = (TextView)relativelayout.findViewById(ar.cC);
            ((TextView) (obj)).setCompoundDrawablesWithIntrinsicBounds(aq.r, 0, 0, 0);
            ((TextView) (obj)).setText("");
            progressbar.setProgress(1);
            templateinfo.a(1);
            relativelayout.setVisibility(0);
        }
        c.a(g1);
        if (a != null)
        {
            a.put(Long.valueOf(templateinfo.e()), c);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void c()
    {
        b = new e(d, e);
        d d1 = new d();
        d1.b = true;
        b.a(d1);
    }

    public final void c(TemplateInfo templateinfo)
    {
        c = new h(d, e);
        g g1 = new g();
        g1.a = true;
        g1.d = templateinfo;
        c.a(g1);
    }

    public final void d()
    {
        b = new e(d, e);
        d d1 = new d();
        d1.c = true;
        b.a(d1);
    }

    public final void e()
    {
        b = new e(d, e);
        d d1 = new d();
        d1.e = true;
        d1.b = true;
        b.a(d1);
    }

    public final void f()
    {
        b = new e(d, e);
        d d1 = new d();
        d1.d = true;
        d1.c = true;
        b.a(d1);
    }

    public final void g()
    {
        if (b != null && !b.isCancelled())
        {
            b.a();
            b = null;
        }
    }

    public final void h()
    {
        if (a != null)
        {
            Iterator iterator = a.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                j j1 = (j)((java.util.Map.Entry)iterator.next()).getValue();
                if (j1 != null && !j1.isCancelled())
                {
                    j1.a();
                }
            } while (true);
            a.clear();
            a = null;
        }
    }
}

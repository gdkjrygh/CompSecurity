// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.os.Handler;
import android.view.View;
import com.facebook.widget.OverlayLayout;
import com.facebook.widget.k;

// Referenced classes of package com.facebook.orca.d:
//            ar, as, av

public class aq
{

    private final View a;
    private final Handler b = new Handler();
    private boolean c;
    private as d;
    private final Runnable e = new ar(this);

    public aq(View view)
    {
        a = view;
    }

    private void h()
    {
        if (d != null || c)
        {
            return;
        }
        Object obj = i();
        if (obj == null)
        {
            c = true;
            return;
        } else
        {
            d = new as(a.getContext());
            ((OverlayLayout) (obj)).addView(d);
            obj = (k)d.getLayoutParams();
            obj.width = -2;
            obj.height = -2;
            obj.c = 514;
            obj.a = true;
            obj.b = a.getId();
            ((k) (obj)).setMargins(0, 0, 0, 10);
            d.setVisibility(8);
            d.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            return;
        }
    }

    private OverlayLayout i()
    {
        for (View view = a; view.getParent() instanceof View;)
        {
            View view1 = (View)view.getParent();
            view = view1;
            if (view1 instanceof OverlayLayout)
            {
                return (OverlayLayout)view1;
            }
        }

        return null;
    }

    public void a()
    {
        h();
        d.b();
        e();
    }

    public void a(int j)
    {
        if (d != null)
        {
            d.a(j);
        }
    }

    public void a(av av1)
    {
        if (d != null)
        {
            d.setStyle(av1);
        }
    }

    public void b()
    {
        h();
        d.a();
        e();
        b.postDelayed(e, 1000L);
    }

    public void c()
    {
        h();
        if (d != null)
        {
            d.c();
        }
    }

    public void d()
    {
        f();
        if (d != null)
        {
            d.d();
        }
    }

    public void e()
    {
        b.removeCallbacks(e);
        h();
        if (c)
        {
            return;
        } else
        {
            d.setVisibility(0);
            return;
        }
    }

    public void f()
    {
        if (c || d == null)
        {
            return;
        } else
        {
            d.setVisibility(8);
            return;
        }
    }

    public void g()
    {
        av av1;
        if (d != null)
        {
            if ((av1 = d.getViewStyle()) != null && av1 == av.NUX)
            {
                d.setVisibility(8);
                return;
            }
        }
    }
}

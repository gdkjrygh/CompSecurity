// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.content.Context;
import android.view.ViewParent;
import com.facebook.inject.t;
import com.facebook.n.c;
import com.facebook.n.g;
import com.facebook.n.j;
import com.facebook.orca.chatheads.annotations.ForChatHeads;
import com.facebook.widget.d;
import com.google.common.d.a.ab;
import com.google.common.d.a.i;
import com.google.common.d.a.s;

// Referenced classes of package com.facebook.orca.chatheads:
//            h, g, ef, ea

public class e extends d
{

    private static final boolean a;
    private static final g b = com.facebook.n.g.a(200D, 7D);
    private static final g c = com.facebook.n.g.a(40D, 7D);
    private final ef d;
    private final c e;
    private final c f;
    private ab g;
    private ab h;
    private boolean i;

    public e(Context context)
    {
        super(context);
        j j1 = (j)t.a(context).a(com/facebook/n/j, com/facebook/orca/chatheads/annotations/ForChatHeads);
        h = ab.a();
        h.a_(null);
        g = ab.a();
        g.a_(null);
        e = j1.b().a(b).e(0.004999999888241291D).d(0.004999999888241291D).a(1.0D).i().a(new h(this, null));
        f = j1.b().a(c).e(0.004999999888241291D).d(0.004999999888241291D).a(true).a(1.0D).i().a(new com.facebook.orca.chatheads.g(this, null));
        d = new ef(context, new ea(this));
    }

    static ab a(e e1)
    {
        return e1.g;
    }

    private s a(double d1)
    {
        if (i)
        {
            return com.google.common.d.a.i.a(null);
        }
        if (f.d() == d1)
        {
            if (h != null)
            {
                return h;
            } else
            {
                return com.google.common.d.a.i.a(null);
            }
        }
        if (h != null)
        {
            h.cancel(false);
        }
        h = ab.a();
        f.b(d1);
        return h;
    }

    private s a(float f1)
    {
        if (i)
        {
            return com.google.common.d.a.i.a(null);
        }
        if (e.c() == (double)f1 && e.d() == (double)f1)
        {
            if (g != null)
            {
                return g;
            } else
            {
                return com.google.common.d.a.i.a(null);
            }
        }
        if (g != null)
        {
            g.cancel(false);
        }
        g = ab.a();
        e.b(f1);
        return g;
    }

    private void b(double d1)
    {
        if (i)
        {
            return;
        }
        if (f.d() != d1)
        {
            h.cancel(false);
            h = null;
        } else
        {
            h.a_(null);
        }
        f.a(d1).i();
    }

    static void b(e e1)
    {
        e1.i();
    }

    static ab c(e e1)
    {
        return e1.h;
    }

    private void i()
    {
        if (f.h() && e.h())
        {
            setViewCachingEnabled(false);
        }
    }

    public void a()
    {
        if (g != null)
        {
            g.cancel(false);
        }
        if (h != null)
        {
            h.cancel(false);
        }
        e.a();
        f.a();
        d.a();
        i = true;
    }

    public void b()
    {
        ViewParent viewparent = getParent();
        if (viewparent != null)
        {
            viewparent.bringChildToFront(this);
        }
    }

    public s c()
    {
        return a(1.0F);
    }

    public s d()
    {
        return a(0.91F);
    }

    public s e()
    {
        e.a(0.29999999999999999D);
        return a(1.0F);
    }

    public s f()
    {
        return a(1.0D);
    }

    public s g()
    {
        return a(0.0D);
    }

    public ef getSpringyPositioner()
    {
        return d;
    }

    public void h()
    {
        b(0.0D);
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

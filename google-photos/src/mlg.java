// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.material.butterfly.ButterflyView;
import java.util.ArrayList;
import java.util.Iterator;

public final class mlg
{

    public final View a;
    public final mkq b;
    public final ArrayList c = new ArrayList();
    public mlg d;
    public float e;
    public float f;
    public float g;
    public float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private ButterflyView n;

    public mlg(ButterflyView butterflyview, View view, mkq mkq1)
    {
        n = butterflyview;
        super();
        a = view;
        b = mkq1;
        a();
    }

    private float d()
    {
        return e * (float)ButterflyView.a(n);
    }

    private float e()
    {
        return f * (float)ButterflyView.b(n);
    }

    private float f()
    {
        float f4 = 0.0F;
        float f1;
        float f2;
        float f3;
        float f5;
        float f6;
        if (d == null)
        {
            f2 = 1.0F;
        } else
        {
            f2 = d.h();
        }
        if (d == null)
        {
            f1 = 0.0F;
        } else
        {
            f1 = d.l() % 360F;
        }
        f5 = i;
        f6 = ButterflyView.a(n);
        if (d == null)
        {
            f3 = 0.0F;
        } else
        {
            f3 = d.g * d.d();
        }
        f3 = f2 * (f6 * f5 - f3);
        f2 = f3;
        if (f1 != 0.0F)
        {
            f2 = d.j() * (j * (float)ButterflyView.b(n) - d.h * d.e());
            double d1 = -Math.atan2(-f2, f3);
            double d2 = Math.toRadians(90D);
            double d3 = Math.hypot(f3, f2);
            f2 = (float)(Math.sin(Math.toRadians(f1) + (d1 + d2)) * d3);
        }
        if (d == null)
        {
            f1 = f4;
        } else
        {
            f1 = d.f();
        }
        return f2 + f1;
    }

    private float g()
    {
        float f4 = 0.0F;
        float f1;
        float f2;
        float f3;
        float f5;
        float f6;
        if (d == null)
        {
            f2 = 1.0F;
        } else
        {
            f2 = d.j();
        }
        if (d == null)
        {
            f1 = 0.0F;
        } else
        {
            f1 = d.l() % 360F;
        }
        f5 = j;
        f6 = ButterflyView.b(n);
        if (d == null)
        {
            f3 = 0.0F;
        } else
        {
            f3 = d.h * d.e();
        }
        f3 = f2 * (f6 * f5 - f3);
        f2 = f3;
        if (f1 != 0.0F)
        {
            f2 = d.h() * (i * (float)ButterflyView.a(n) - d.g * d.d());
            double d1 = -Math.atan2(-f3, f2);
            double d2 = Math.toRadians(90D);
            double d3 = Math.hypot(f2, f3);
            f2 = -(float)(Math.cos(Math.toRadians(f1) + (d1 + d2)) * d3);
        }
        if (d == null)
        {
            f1 = f4;
        } else
        {
            f1 = d.g();
        }
        return f2 + f1;
    }

    private float h()
    {
        float f1;
        if (d == null)
        {
            f1 = 1.0F;
        } else
        {
            f1 = d.h();
        }
        return f1 * k;
    }

    private void i()
    {
        a.setScaleX(h());
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((mlg)iterator.next()).i()) { }
    }

    private float j()
    {
        float f1;
        if (d == null)
        {
            f1 = 1.0F;
        } else
        {
            f1 = d.j();
        }
        return f1 * l;
    }

    private void k()
    {
        a.setScaleY(j());
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((mlg)iterator.next()).k()) { }
    }

    private float l()
    {
        float f2 = m;
        float f1;
        if (d == null)
        {
            f1 = 0.0F;
        } else
        {
            f1 = d.l();
        }
        return f1 + f2;
    }

    private void m()
    {
        a.setRotation(l());
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((mlg)iterator.next()).m()) { }
    }

    public final void a()
    {
        mkr mkr1 = b.h;
        a.setBackgroundColor(mkr1.c);
        e = mkr1.a.a;
        f = mkr1.a.b;
        setX(mkr1.e.a);
        setY(mkr1.e.b);
        a(mkr1.b.a);
        b(mkr1.b.b);
        setScaleX(mkr1.f.a);
        setScaleY(mkr1.f.b);
        setRotation(mkr1.g);
        setAlpha(mkr1.d);
        if (a instanceof TextView)
        {
            ((TextView)a).setTextColor(mkr1.i);
            ((TextView)a).setTypeface(mkr1.j);
            ((TextView)a).setTextSize(0, (float)ButterflyView.a(n) * mkr1.h);
            ((TextView)a).setGravity(mkr1.k);
        }
    }

    public final void a(float f1)
    {
        g = f1;
        a.setPivotX(d() * f1);
    }

    public final void b()
    {
        a.setTranslationX(f());
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((mlg)iterator.next()).b()) { }
    }

    public final void b(float f1)
    {
        h = f1;
        a.setPivotY(e() * f1);
    }

    public final void c()
    {
        a.setTranslationY(g());
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((mlg)iterator.next()).c()) { }
    }

    public final void setAlpha(float f1)
    {
        a.setAlpha(f1);
    }

    public final void setRotation(float f1)
    {
        m = f1;
        m();
        b();
        c();
    }

    public final void setScaleX(float f1)
    {
        k = f1;
        i();
        b();
        c();
    }

    public final void setScaleY(float f1)
    {
        l = f1;
        k();
    }

    public final void setX(float f1)
    {
        i = f1;
        b();
    }

    public final void setY(float f1)
    {
        j = f1;
        c();
    }
}

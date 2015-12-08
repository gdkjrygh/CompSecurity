// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ObjectAnimator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class ork
{

    public static final ork a = new ork(1L);
    private static final orp e = new orp();
    public final long b;
    public boolean c;
    public boolean d;
    private orm f;
    private ObjectAnimator g;
    private final List h = new CopyOnWriteArrayList();

    public ork(long l)
    {
        b = l;
        f = new orn(0L, l);
    }

    static double a(double d1, double d2, float f1)
    {
        return (d2 - d1) * (double)f1 + d1;
    }

    static ObjectAnimator a(ork ork1, ObjectAnimator objectanimator)
    {
        ork1.g = null;
        return null;
    }

    static orm a(ork ork1, orm orm1)
    {
        ork1.f = orm1;
        return orm1;
    }

    static void a(ork ork1)
    {
        ork1.b();
    }

    private void a(orn orn1, boolean flag, boolean flag1)
    {
        if (g != null)
        {
            g.cancel();
            g = null;
        }
        p.b(f instanceof orn);
        boolean flag2;
        if (flag1)
        {
            Object obj = (orn)f;
            float f1;
            float f2;
            orn orn2;
            if (flag)
            {
                orn2 = ((orn) (obj));
            } else
            {
                orn2 = orn1;
            }
            if (flag)
            {
                obj = orn1;
            }
            obj = new orl(this, orn2, ((orn) (obj)), orn1);
            if (flag)
            {
                f1 = 0.0F;
            } else
            {
                f1 = 1.0F;
            }
            if (flag)
            {
                f2 = 1.0F;
            } else
            {
                f2 = 0.0F;
            }
            ((orl) (obj)).a(f1);
            g = new ObjectAnimator();
            g.setTarget(obj);
            g.setProperty(e);
            g.setPropertyName(e.getName());
            g.setFloatValues(new float[] {
                f2
            });
            g.addListener(new orq(this, orn1));
            g.setDuration(150L);
            g.start();
            f = ((orm) (obj));
        } else
        {
            f = orn1;
            b();
        }
        if (c != flag)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        c = flag;
        if (flag2)
        {
            c();
        }
    }

    private void b()
    {
        for (Iterator iterator = h.iterator(); iterator.hasNext(); ((oro)iterator.next()).a()) { }
    }

    static boolean b(ork ork1)
    {
        return ork1.d;
    }

    static List c(ork ork1)
    {
        return ork1.h;
    }

    private void c()
    {
        for (Iterator iterator = h.iterator(); iterator.hasNext(); iterator.next()) { }
    }

    public final float a(long l)
    {
        p.b(c);
        float f1;
        orn orn1;
        long l1;
        long l2;
        long l3;
        boolean flag;
        if (!a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        p.b(f instanceof orn);
        orn1 = (orn)f;
        l1 = orn1.a;
        l2 = l1 + l;
        l3 = orn1.b + l;
        if (l2 < 0L)
        {
            l = -l2;
        } else
        if (l3 > b)
        {
            l = b - l3;
        } else
        {
            l = 0L;
        }
        f = new orn(l2 + l, l + l3);
        f1 = f.a(l1);
        b();
        return f1;
    }

    public final long a(float f1)
    {
        return f.c(f1);
    }

    public final void a(long l, long l1, boolean flag)
    {
        boolean flag1 = false;
        if (!c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        if (l1 <= b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        flag = flag1;
        if (l < l1)
        {
            flag = true;
        }
        p.a(flag);
        a(new orn(l, l1), true, true);
    }

    public final void a(oro oro1)
    {
        h.add(oro1);
    }

    public final void a(boolean flag)
    {
        p.b(c);
        a(new orn(0L, b), false, true);
    }

    public final boolean a()
    {
        return g != null && g.isRunning();
    }

    public final float b(long l)
    {
        return f.a(l);
    }

    public final long b(float f1)
    {
        return f.b(f1);
    }

    public final void b(oro oro1)
    {
        h.remove(oro1);
    }

}

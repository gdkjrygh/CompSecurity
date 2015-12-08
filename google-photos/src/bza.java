// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public final class bza
    implements jih, orv
{

    jif a;
    orr b;
    private ImageView c;
    private int d;
    private int e;
    private Context f;
    private Set g;
    private boolean h;
    private final List i = new CopyOnWriteArrayList();

    public bza(Context context)
    {
        d = -1;
        e = -1;
        g = EnumSet.noneOf(oru);
        h = false;
        f = context;
    }

    private boolean h()
    {
        return a != null && a.b();
    }

    private long i()
    {
        if (b != null)
        {
            return b.c();
        } else
        {
            return 0L;
        }
    }

    void a(long l)
    {
        a.a((long)Math.ceil((double)l / 1000D));
    }

    public final void a(ImageView imageview)
    {
        c = imageview;
        d();
    }

    public final void a(jie jie)
    {
    }

    public final void a(jif jif1)
    {
        if (a != null)
        {
            a.b(this);
        }
        a = jif1;
        if (a != null)
        {
            a.a(this);
        }
        d();
        c();
    }

    public final void a(orr orr1)
    {
        if (b != null)
        {
            b.b(this);
        }
        b = orr1;
        if (b != null)
        {
            b.a(this);
        }
        f();
        g();
    }

    public final void a(orr orr1, Set set)
    {
        g.addAll(set);
        if (a != null)
        {
            h = h();
            a.a(false);
        }
        for (set = set.iterator(); set.hasNext(); a(orr1, (oru)set.next())) { }
    }

    public final void a(orr orr1, oru oru1)
    {
        if (a == null)
        {
            return;
        }
        if (oru1 != oru.a) goto _L2; else goto _L1
_L1:
        a(orr1.e);
_L4:
        f();
        return;
_L2:
        if (oru1 == oru.b && !g.contains(oru.a))
        {
            a(orr1.f);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(boolean flag, int j)
    {
        (new Handler(Looper.getMainLooper())).post(new bzb(this));
    }

    public final android.view.View.OnClickListener b()
    {
        return new bzd(this);
    }

    public final void b(orr orr1, Set set)
    {
        long l;
        g.removeAll(set);
        if (a == null)
        {
            return;
        }
        l = a.f() * 1000L;
        if (!set.contains(oru.a)) goto _L2; else goto _L1
_L1:
        l = orr1.e;
_L4:
        a(l);
        a.a(h);
        return;
_L2:
        if (set.contains(oru.b))
        {
            if (h)
            {
                l = 0xf4240L;
            } else
            {
                l = 0L;
            }
            l = Math.max(orr1.f - l, orr1.e);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    void c()
    {
        for (Iterator iterator = i.iterator(); iterator.hasNext(); iterator.next()) { }
    }

    protected final void d()
    {
        int j;
        if (!g.isEmpty())
        {
            j = 1;
        } else
        {
            j = 0;
        }
        while (j || c == null) 
        {
            return;
        }
        int k = b.eA;
        j = c.bf;
        if (h())
        {
            k = b.ez;
            j = c.bd;
        }
        c.setImageResource(k);
        c.setContentDescription(f.getString(j));
    }

    long e()
    {
        if (b != null)
        {
            return b.d();
        } else
        {
            return a.e();
        }
    }

    void f()
    {
        int j;
        if (a != null)
        {
            if ((j = (int)((e() - i()) / 1000L)) != e)
            {
                e = j;
                return;
            }
        }
    }

    void g()
    {
        if (a != null)
        {
            long l = a.f() - i();
            if (!g.isEmpty())
            {
                l = 0L;
            }
            int j = (int)(l / 1000L);
            if (j != d)
            {
                d = j;
                return;
            }
        }
    }

    public final void z_()
    {
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class ott extends RelativeLayout
    implements android.widget.SeekBar.OnSeekBarChangeListener, jih, orv
{

    public TextView a;
    public TextView b;
    public SeekBar c;
    jif d;
    public Set e;
    private final Runnable f = new otu(this);
    private int g;
    private int h;
    private orr i;
    private boolean j;
    private final List k = new CopyOnWriteArrayList();

    public ott(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        g = -1;
        h = -1;
        e = EnumSet.noneOf(oru);
        j = false;
    }

    static void a(ott ott1)
    {
        ott1.h();
    }

    static void b(ott ott1)
    {
        ott1.g();
    }

    static void c(ott ott1)
    {
        ott1.e();
    }

    static long d(ott ott1)
    {
        return ott1.d();
    }

    static jif e(ott ott1)
    {
        return ott1.d;
    }

    private void e()
    {
        for (Iterator iterator = k.iterator(); iterator.hasNext(); iterator.next()) { }
    }

    private long f()
    {
        if (i != null)
        {
            return i.c();
        } else
        {
            return 0L;
        }
    }

    static Runnable f(ott ott1)
    {
        return ott1.f;
    }

    private void g()
    {
        if (d != null)
        {
            long l1 = d() - f();
            if (e.isEmpty())
            {
                c.setMax((int)l1);
            }
            int l = (int)(l1 / 1000L);
            if (l != h)
            {
                h = l;
                b.setText(b.a(getContext(), h * 1000, false));
                b.setContentDescription(b.a(getContext(), b.IS, h * 1000));
                return;
            }
        }
    }

    private void h()
    {
        if (d != null)
        {
            long l1 = d.f() - f();
            int l;
            if (e.isEmpty())
            {
                c.setProgress((int)l1);
            } else
            {
                l1 = 0L;
            }
            l = (int)(l1 / 1000L);
            if (l != g)
            {
                g = l;
                a.setText(b.a(getContext(), g * 1000, false));
                a.setContentDescription(b.a(getContext(), b.IR, g * 1000));
                return;
            }
        }
    }

    void a(long l)
    {
        d.a((long)Math.ceil((double)l / 1000D));
    }

    public final void a(jie jie)
    {
    }

    public final void a(jif jif1)
    {
        if (d != null)
        {
            d.b(this);
        }
        d = jif1;
        if (d != null)
        {
            d.a(this);
        }
        y_();
        e();
    }

    public final void a(orr orr1)
    {
        if (i != null)
        {
            i.b(this);
        }
        i = orr1;
        if (i != null)
        {
            i.a(this);
        }
        g();
        h();
    }

    public final void a(orr orr1, Set set)
    {
        e.addAll(set);
        if (d != null)
        {
            j = b();
            d.a(false);
        }
        for (set = set.iterator(); set.hasNext(); a(orr1, (oru)set.next())) { }
    }

    public final void a(orr orr1, oru oru1)
    {
        if (d == null)
        {
            return;
        }
        if (oru1 != oru.a) goto _L2; else goto _L1
_L1:
        a(orr1.e);
_L4:
        g();
        return;
_L2:
        if (oru1 == oru.b && !e.contains(oru.a))
        {
            a(orr1.f);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(boolean flag, int l)
    {
        post(new otv(this));
    }

    public final void b(orr orr1, Set set)
    {
        long l;
        e.removeAll(set);
        if (d == null)
        {
            return;
        }
        l = d.f() * 1000L;
        if (!set.contains(oru.a)) goto _L2; else goto _L1
_L1:
        l = orr1.e;
_L4:
        a(l);
        d.a(j);
        return;
_L2:
        if (set.contains(oru.b))
        {
            if (j)
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

    public final boolean b()
    {
        return d != null && d.b();
    }

    long c()
    {
        if (i != null)
        {
            return i.e;
        } else
        {
            return 0L;
        }
    }

    long d()
    {
        if (i != null)
        {
            return i.d();
        } else
        {
            return d.e();
        }
    }

    public void onProgressChanged(SeekBar seekbar, int l, boolean flag)
    {
        if (flag)
        {
            a((long)l * 1000L + c());
        }
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
    }

    public abstract void y_();

    public final void z_()
    {
    }
}

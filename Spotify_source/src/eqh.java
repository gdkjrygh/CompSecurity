// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import android.util.Property;
import android.widget.ProgressBar;

public final class eqh
{

    public final ProgressBar a;
    final Property b;
    ggv c;
    gha d;

    public eqh(ProgressBar progressbar, Property property)
    {
        c = ggv.a();
        a = progressbar;
        b = property;
    }

    public final void a()
    {
        if (d != null)
        {
            c.b(d);
            d = null;
        }
    }

    public final void a(long l, long l1, float f)
    {
        long l2 = SystemClock.uptimeMillis();
        a();
        d = c.a(new Runnable(l2, f, l, l1) {

            private long a;
            private float b;
            private long c;
            private long d;
            private eqh e;

            public final void run()
            {
                int i = (int)((float)(SystemClock.uptimeMillis() - a) * b + (float)c);
                e.b.set(e.a, Integer.valueOf(i));
                if ((long)i < d)
                {
                    e.c.c(e.d);
                }
            }

            
            {
                e = eqh.this;
                a = l;
                b = f;
                c = l1;
                d = l2;
                super();
            }
        });
        c.a(d);
    }
}

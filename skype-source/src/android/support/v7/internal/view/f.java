// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.support.v4.view.af;
import android.support.v4.view.aj;
import android.support.v4.view.ak;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public final class f
{

    private final ArrayList a = new ArrayList();
    private long b;
    private Interpolator c;
    private aj d;
    private boolean e;
    private final ak f = new ak() {

        final f a;
        private boolean b;
        private int c;

        public final void a(View view)
        {
            if (!b)
            {
                b = true;
                if (f.a(a) != null)
                {
                    f.a(a).a(null);
                    return;
                }
            }
        }

        public final void b(View view)
        {
            int i = c + 1;
            c = i;
            if (i == f.c(a).size())
            {
                if (f.a(a) != null)
                {
                    f.a(a).b(null);
                }
                c = 0;
                b = false;
                f.b(a);
            }
        }

            
            {
                a = f.this;
                super();
                b = false;
                c = 0;
            }
    };

    public f()
    {
        b = -1L;
    }

    static aj a(f f1)
    {
        return f1.d;
    }

    static void b(f f1)
    {
        f1.e = false;
    }

    static ArrayList c(f f1)
    {
        return f1.a;
    }

    public final f a(af af1)
    {
        if (!e)
        {
            a.add(af1);
        }
        return this;
    }

    public final f a(af af1, af af2)
    {
        a.add(af1);
        af2.b(af1.a());
        a.add(af2);
        return this;
    }

    public final f a(aj aj)
    {
        if (!e)
        {
            d = aj;
        }
        return this;
    }

    public final f a(Interpolator interpolator)
    {
        if (!e)
        {
            c = interpolator;
        }
        return this;
    }

    public final void a()
    {
        if (e)
        {
            return;
        }
        af af1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); af1.e())
        {
            af1 = (af)iterator.next();
            if (b >= 0L)
            {
                af1.a(b);
            }
            if (c != null)
            {
                af1.a(c);
            }
            if (d != null)
            {
                af1.a(f);
            }
        }

        e = true;
    }

    public final void b()
    {
        if (!e)
        {
            return;
        }
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((af)iterator.next()).d()) { }
        e = false;
    }

    public final f c()
    {
        if (!e)
        {
            b = 250L;
        }
        return this;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.support.v4.view.cy;
import android.support.v4.view.do;
import android.support.v4.view.dp;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v7.internal.view:
//            j

public final class i
{

    private final ArrayList a = new ArrayList();
    private long b;
    private Interpolator c;
    private do d;
    private boolean e;
    private final dp f = new j(this);

    public i()
    {
        b = -1L;
    }

    static do a(i k)
    {
        return k.d;
    }

    static void b(i k)
    {
        k.e = false;
    }

    static ArrayList c(i k)
    {
        return k.a;
    }

    public final i a(cy cy1)
    {
        if (!e)
        {
            a.add(cy1);
        }
        return this;
    }

    public final i a(do do1)
    {
        if (!e)
        {
            d = do1;
        }
        return this;
    }

    public final i a(Interpolator interpolator)
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
        cy cy1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); cy1.c())
        {
            cy1 = (cy)iterator.next();
            if (b >= 0L)
            {
                cy1.a(b);
            }
            if (c != null)
            {
                cy1.a(c);
            }
            if (d != null)
            {
                cy1.a(f);
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
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((cy)iterator.next()).b()) { }
        e = false;
    }

    public final i c()
    {
        if (!e)
        {
            b = 250L;
        }
        return this;
    }
}

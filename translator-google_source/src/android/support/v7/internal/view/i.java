// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.support.v4.view.dq;
import android.support.v4.view.eg;
import android.support.v4.view.eh;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v7.internal.view:
//            j

public final class i
{

    public final ArrayList a = new ArrayList();
    eg b;
    boolean c;
    private long d;
    private Interpolator e;
    private final eh f = new j(this);

    public i()
    {
        d = -1L;
    }

    public final i a(dq dq1)
    {
        if (!c)
        {
            a.add(dq1);
        }
        return this;
    }

    public final i a(eg eg)
    {
        if (!c)
        {
            b = eg;
        }
        return this;
    }

    public final i a(Interpolator interpolator)
    {
        if (!c)
        {
            e = interpolator;
        }
        return this;
    }

    public final void a()
    {
        if (c)
        {
            return;
        }
        dq dq1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); dq1.b())
        {
            dq1 = (dq)iterator.next();
            if (d >= 0L)
            {
                dq1.a(d);
            }
            if (e != null)
            {
                dq1.a(e);
            }
            if (b != null)
            {
                dq1.a(f);
            }
        }

        c = true;
    }

    public final void b()
    {
        if (!c)
        {
            return;
        }
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((dq)iterator.next()).a()) { }
        c = false;
    }

    public final i c()
    {
        if (!c)
        {
            d = 250L;
        }
        return this;
    }
}

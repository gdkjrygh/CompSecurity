// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public final class vj
{

    public final ArrayList a = new ArrayList();
    oo b;
    boolean c;
    private long d;
    private Interpolator e;
    private final op f = new vk(this);

    public vj()
    {
        d = -1L;
    }

    public final vj a(long l)
    {
        if (!c)
        {
            d = 250L;
        }
        return this;
    }

    public final vj a(Interpolator interpolator)
    {
        if (!c)
        {
            e = interpolator;
        }
        return this;
    }

    public final vj a(ob ob1)
    {
        if (!c)
        {
            a.add(ob1);
        }
        return this;
    }

    public final vj a(oo oo)
    {
        if (!c)
        {
            b = oo;
        }
        return this;
    }

    public final void a()
    {
        if (c)
        {
            return;
        }
        ob ob1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ob1.b())
        {
            ob1 = (ob)iterator.next();
            if (d >= 0L)
            {
                ob1.a(d);
            }
            if (e != null)
            {
                Interpolator interpolator = e;
                View view = (View)ob1.a.get();
                if (view != null)
                {
                    ob.b.a(view, interpolator);
                }
            }
            if (b != null)
            {
                ob1.a(f);
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
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((ob)iterator.next()).a()) { }
        c = false;
    }
}

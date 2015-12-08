// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bb;

import android.view.animation.Interpolator;

// Referenced classes of package com.google.android.m4b.maps.bb:
//            m

public abstract class j extends m
{

    protected Object a;
    protected Object b;
    protected Object c;
    protected boolean d;

    public j(Interpolator interpolator)
    {
        d = false;
        setInterpolator(interpolator);
    }

    public final Object a()
    {
        return b;
    }

    protected abstract void a(long l);

    protected abstract void a(Object obj);

    public final Object b()
    {
        return c;
    }

    public final void b(long l)
    {
        a(l);
    }

    protected abstract void b(Object obj);

    protected abstract void c(Object obj);

    public final void d(Object obj)
    {
        if (obj != null)
        {
            if (!d)
            {
                if (obj != null && obj != null)
                {
                    a(obj);
                    b(obj);
                    c(obj);
                    d = true;
                    return;
                }
            } else
            {
                a(c);
                b(obj);
                return;
            }
        }
    }

    public boolean isInitialized()
    {
        return d;
    }
}

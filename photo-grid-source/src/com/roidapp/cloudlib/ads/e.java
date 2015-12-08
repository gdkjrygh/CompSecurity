// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.ads;

import android.os.Handler;
import android.os.Looper;
import com.cmcm.a.a.a;

// Referenced classes of package com.roidapp.cloudlib.ads:
//            g

public final class e extends g
    implements Runnable
{

    private g a;
    private Handler b;
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public e(Object obj, g g1)
    {
        super(obj);
        a = g1;
        b = new Handler(Looper.getMainLooper());
        c = 30000;
        d = 0;
    }

    public final void a(Object obj)
    {
        if (f())
        {
            if (a != null)
            {
                a.a(obj);
            }
            e = true;
            if (!f && b != null)
            {
                b.postDelayed(this, c);
            }
            return;
        } else
        {
            e();
            return;
        }
    }

    public final void a(Object obj, a a1)
    {
        if (a != null)
        {
            a.a(obj, a1);
        }
    }

    public final void b()
    {
        f = true;
        if (e && b != null)
        {
            b.removeCallbacks(this);
        }
    }

    public final void b(Object obj)
    {
        if (a != null)
        {
            a.b(obj);
        }
    }

    public final void c()
    {
        f = false;
        if (e && b != null)
        {
            b.removeCallbacks(this);
            b.postDelayed(this, c);
        }
    }

    public final int d()
    {
        return d;
    }

    public final void e()
    {
        if (b != null)
        {
            b.removeCallbacks(this);
        }
        b = null;
        a = null;
    }

    public final void run()
    {
        e = false;
        d = d + 1;
        a();
    }
}

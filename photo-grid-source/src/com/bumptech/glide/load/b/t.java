// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b;

import android.util.Log;
import com.bumptech.glide.load.b.c.h;

// Referenced classes of package com.bumptech.glide.load.b:
//            v, a, x, u

final class t
    implements h, Runnable
{

    private final int a;
    private final u b;
    private final a c;
    private int d;
    private volatile boolean e;

    public t(u u1, a a1, int i)
    {
        b = u1;
        c = a1;
        d = v.a;
        a = i;
    }

    private boolean c()
    {
        return d == v.a;
    }

    private x d()
    {
        x x1;
        x x2;
        try
        {
            x1 = c.a();
        }
        catch (Exception exception)
        {
            if (Log.isLoggable("EngineRunnable", 3))
            {
                (new StringBuilder("Exception decoding result from cache: ")).append(exception);
            }
            exception = null;
        }
        x2 = x1;
        if (x1 == null)
        {
            x2 = c.b();
        }
        return x2;
    }

    public final void a()
    {
        e = true;
        c.d();
    }

    public final int b()
    {
        return a - 1;
    }

    public final void run()
    {
        Exception exception = null;
        if (!e) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!c()) goto _L4; else goto _L3
_L3:
        x x1 = d();
_L5:
        if (e)
        {
            if (x1 != null)
            {
                x1.d();
                return;
            }
        } else
        if (x1 == null)
        {
            if (c())
            {
                d = v.b;
                b.b(this);
                return;
            } else
            {
                b.a(exception);
                return;
            }
        } else
        {
            b.a(x1);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        try
        {
            x1 = c.c();
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            Log.isLoggable("EngineRunnable", 2);
            x1 = null;
        }
          goto _L5
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.e;

import android.util.Log;
import com.nuance.b.e.a.b;

// Referenced classes of package com.nuance.b.e:
//            c, n

final class v
    implements Runnable
{

    final c a;

    private v(c c1)
    {
        a = c1;
        super();
    }

    v(c c1, byte byte0)
    {
        this(c1);
    }

    public final void run()
    {
        Log.d("Nina", "OnConnectedHandler...");
        if (c.f(a) != null)
        {
            c.f(a).run();
        }
        if (c.c(a) != null)
        {
            c.c(a).enable(true);
        } else
        {
            Log.w("Nina", "null persona. Shutting down?");
        }
        c.z().b();
        c.a(true, c.g(a));
        Log.d("Nina", "OnConnectedHandler finished");
    }
}

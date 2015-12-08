// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib;

import android.content.Context;
import android.os.Handler;
import com.roidapp.videolib.a.a;
import com.roidapp.videolib.core.a.c;

// Referenced classes of package com.roidapp.videolib:
//            h, e, k, i, 
//            j

public final class g
{

    private static g a;
    private Context b;
    private k c;
    private boolean d;
    private Handler e;

    private g(Context context)
    {
        e = new h(this);
        b = context;
    }

    static Handler a(g g1)
    {
        return g1.e;
    }

    public static g a(Context context)
    {
        if (a == null)
        {
            a = new g(context);
        }
        return a;
    }

    static void a(g g1, boolean flag, String s)
    {
        if (g1.d)
        {
            g1.d = false;
            if (g1.b != null)
            {
                com.roidapp.videolib.e.a();
                com.roidapp.videolib.e.a(g1.b, flag);
            }
            if (s.indexOf("UnsatisfiedLinkError") > 0)
            {
                com.roidapp.videolib.e.a();
                com.roidapp.videolib.e.b(g1.b, true);
            } else
            {
                com.roidapp.videolib.e.a();
                com.roidapp.videolib.e.b(g1.b, false);
            }
            com.roidapp.videolib.a.a.a();
            if (g1.c != null)
            {
                g1.c.a(flag, s);
            }
        }
    }

    public final void a(k k1)
    {
        c = k1;
    }

    public final boolean a()
    {
        com.roidapp.videolib.e.a();
        return com.roidapp.videolib.e.c(b);
    }

    public final boolean b()
    {
        com.roidapp.videolib.e.a();
        return com.roidapp.videolib.e.d(b);
    }

    public final void c()
    {
        if (d)
        {
            return;
        } else
        {
            d = true;
            e.postDelayed(new i(this), 15000L);
            com.roidapp.videolib.core.a.a a1 = new com.roidapp.videolib.core.a.a("test", null, null, 640, 640, 0L, 0xf4240L, 3, false);
            com.roidapp.videolib.a.a.a(b).a(true, a1, new j(this));
            return;
        }
    }
}

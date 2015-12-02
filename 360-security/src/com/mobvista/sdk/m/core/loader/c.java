// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.loader;

import android.content.Context;
import com.mobvista.sdk.m.a.a.d.a;
import com.mobvista.sdk.m.a.f.d;
import com.mobvista.sdk.m.core.c.b;
import com.mobvista.sdk.m.core.c.f;
import java.util.List;

// Referenced classes of package com.mobvista.sdk.m.core.loader:
//            g, a, d, e, 
//            f

public final class c extends a
{

    private Context a;
    private f b;
    private g c;
    private int d[];
    private boolean e;
    private boolean f;
    private boolean g;
    private String h;

    public c(Context context, f f1, String s)
    {
        c = null;
        d = new int[3];
        e = false;
        f = false;
        g = false;
        a = context;
        b = f1;
        h = s;
    }

    static g a(c c1)
    {
        return c1.c;
    }

    private void a()
    {
        List list = com.mobvista.sdk.m.core.c.b.a(b).a(20, 0, h);
        if (list != null && list.size() > 0 && list.size() > d[0] - 3)
        {
            e = false;
            if (c != null)
            {
                c.b(list);
            }
            return;
        } else
        {
            com.mobvista.sdk.m.core.loader.a a1 = new com.mobvista.sdk.m.core.loader.a();
            a1.a(20, d.a, b, a, h);
            a1.a(0);
            a1.a(1, new com.mobvista.sdk.m.core.loader.d(this));
            return;
        }
    }

    static boolean a(c c1, boolean flag)
    {
        c1.e = false;
        return false;
    }

    static boolean b(c c1, boolean flag)
    {
        c1.f = false;
        return false;
    }

    private void c()
    {
        List list = com.mobvista.sdk.m.core.c.b.a(b).a(20, 1, h);
        if (list != null && list.size() > 0 && list.size() > d[1] - 3)
        {
            f = false;
            if (c != null)
            {
                c.b(list);
            }
            return;
        } else
        {
            com.mobvista.sdk.m.core.loader.a a1 = new com.mobvista.sdk.m.core.loader.a();
            a1.a(20, d.a, b, a, h);
            a1.a(1);
            a1.b(2);
            a1.a(2, new e(this));
            return;
        }
    }

    static boolean c(c c1, boolean flag)
    {
        c1.g = false;
        return false;
    }

    private void d()
    {
        List list = com.mobvista.sdk.m.core.c.b.a(b).a(20, 2, h);
        if (list != null && list.size() > 0 && list.size() > d[2] - 3)
        {
            g = false;
            if (c != null)
            {
                c.b(list);
            }
            return;
        } else
        {
            com.mobvista.sdk.m.core.loader.a a1 = new com.mobvista.sdk.m.core.loader.a();
            a1.a(20, d.a, b, a, h);
            a1.a(2);
            a1.b(2);
            a1.a(3, new com.mobvista.sdk.m.core.loader.f(this));
            return;
        }
    }

    public final void a(int i, g g1)
    {
        c = g1;
        com.mobvista.sdk.m.core.c.b.a(b).b();
        i;
        JVM INSTR tableswitch 0 2: default 44
    //                   0 45
    //                   1 62
    //                   2 79;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        if (!e)
        {
            e = true;
            a();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (!f)
        {
            f = true;
            c();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (!g)
        {
            g = true;
            d();
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }
}

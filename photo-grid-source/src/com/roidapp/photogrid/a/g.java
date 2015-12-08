// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.a;

import android.os.Handler;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.a:
//            c, l, d, h, 
//            k

final class g
    implements Runnable
{

    final boolean a = true;
    final List b = null;
    final Handler c;
    final k d;
    final d e;

    g(d d1, Handler handler, k k)
    {
        e = d1;
        c = handler;
        d = k;
        super();
    }

    public final void run()
    {
        n n;
        l l1;
        l1 = new l(0, "Inventory refresh successful.");
        n = null;
        n n1 = e.a(a, b);
        n = n1;
_L2:
        e.b();
        c.post(new h(this, l1, n));
        return;
        c c1;
        c1;
        c1 = c1.a;
        if (true) goto _L2; else goto _L1
_L1:
    }
}

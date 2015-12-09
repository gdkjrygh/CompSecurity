// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.app.AlertDialog;
import android.os.Handler;

// Referenced classes of package com.miteksystems.misnap:
//            u, MiSnap, MiSnapAPI

final class al
    implements Runnable
{

    final u a;

    al(u u1)
    {
        a = u1;
        super();
    }

    public final void run()
    {
        if (u.n(a).b == null)
        {
            return;
        }
        u u1 = a;
        u.b(u1, u.w(u1) + 1);
        if (u.w(a) > u.n(a).a.l())
        {
            a.j.sendEmptyMessage(9);
            return;
        }
        if ((u.x(a) == null || !u.x(a).isShowing()) && !u.k(a))
        {
            a.j.sendEmptyMessage(6);
            return;
        } else
        {
            u.m(a).postDelayed(u.y(a), u.z(a));
            return;
        }
    }
}

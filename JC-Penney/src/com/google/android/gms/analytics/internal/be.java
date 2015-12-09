// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.os.Looper;
import com.google.android.gms.d.ad;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            bd, ab

class be
    implements Runnable
{

    final bd a;

    be(bd bd1)
    {
        a = bd1;
        super();
    }

    public void run()
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            bd.a(a).h().a(this);
        } else
        {
            boolean flag = a.c();
            bd.a(a, 0L);
            if (flag && !bd.b(a))
            {
                a.a();
                return;
            }
        }
    }
}

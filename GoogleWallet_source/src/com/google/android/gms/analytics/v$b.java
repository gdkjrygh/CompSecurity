// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import com.google.android.gms.common.util.e;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.google.android.gms.analytics:
//            v, ac

final class <init> extends TimerTask
{

    final v zu;

    public final void run()
    {
        if (v.b(zu) == zx && com.google.android.gms.analytics.v.e(zu).isEmpty() && v.f(zu) + v.g(zu) < v.h(zu).elapsedRealtime())
        {
            ac.v("Disconnecting due to inactivity");
            v.i(zu);
            return;
        } else
        {
            v.j(zu).schedule(new <init>(zu), v.g(zu));
            return;
        }
    }

    private (v v1)
    {
        zu = v1;
        super();
    }

    zu(v v1, zu zu1)
    {
        this(v1);
    }
}

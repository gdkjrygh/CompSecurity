// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.google.android.gms.analytics:
//            s, i, aa

private class <init> extends TimerTask
{

    final s ti;

    public void run()
    {
        if (s.b(ti) == tl && s.e(ti).isEmpty() && s.f(ti) + s.g(ti) < s.h(ti).currentTimeMillis())
        {
            aa.y("Disconnecting due to inactivity");
            s.i(ti);
            return;
        } else
        {
            s.j(ti).schedule(new <init>(ti), s.g(ti));
            return;
        }
    }

    private (s s1)
    {
        ti = s1;
        super();
    }

    ti(s s1, ti ti1)
    {
        this(s1);
    }
}

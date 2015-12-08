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

    final s ut;

    public void run()
    {
        if (s.b(ut) == uw && s.e(ut).isEmpty() && s.f(ut) + s.g(ut) < s.h(ut).currentTimeMillis())
        {
            aa.C("Disconnecting due to inactivity");
            s.i(ut);
            return;
        } else
        {
            s.j(ut).schedule(new <init>(ut), s.g(ut));
            return;
        }
    }

    private (s s1)
    {
        ut = s1;
        super();
    }

    ut(s s1, ut ut1)
    {
        this(s1);
    }
}

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

    final s uw;

    public void run()
    {
        if (s.b(uw) == uz && s.e(uw).isEmpty() && s.f(uw) + s.g(uw) < s.h(uw).currentTimeMillis())
        {
            aa.C("Disconnecting due to inactivity");
            s.i(uw);
            return;
        } else
        {
            s.j(uw).schedule(new <init>(uw), s.g(uw));
            return;
        }
    }

    private (s s1)
    {
        uw = s1;
        super();
    }

    uw(s s1, uw uw1)
    {
        this(s1);
    }
}

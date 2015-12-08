// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import com.google.android.gms.internal.ld;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.google.android.gms.analytics:
//            w, ae

private class <init> extends TimerTask
{

    final w zv;

    public void run()
    {
        if (w.b(zv) == zy && w.e(zv).isEmpty() && w.f(zv) + w.g(zv) < w.h(zv).elapsedRealtime())
        {
            ae.V("Disconnecting due to inactivity");
            w.i(zv);
            return;
        } else
        {
            w.j(zv).schedule(new <init>(zv), w.g(zv));
            return;
        }
    }

    private (w w1)
    {
        zv = w1;
        super();
    }

    zv(w w1, zv zv1)
    {
        this(w1);
    }
}

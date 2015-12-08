// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import com.google.android.gms.internal.ju;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.google.android.gms.analytics:
//            r, z

private class <init> extends TimerTask
{

    final r yF;

    public void run()
    {
        if (r.b(yF) == yI && r.e(yF).isEmpty() && r.f(yF) + r.g(yF) < r.h(yF).elapsedRealtime())
        {
            z.V("Disconnecting due to inactivity");
            r.i(yF);
            return;
        } else
        {
            r.j(yF).schedule(new <init>(yF), r.g(yF));
            return;
        }
    }

    private (r r1)
    {
        yF = r1;
        super();
    }

    yF(r r1, yF yf)
    {
        this(r1);
    }
}

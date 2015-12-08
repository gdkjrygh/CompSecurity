// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.os.Handler;
import android.os.Message;
import android.support.design.widget.NavigationView;
import java.lang.ref.WeakReference;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            AbsDrawerActivity

private static class a extends Handler
{

    private final WeakReference a;

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 10000 10000: default 24
    //                   10000 30;
           goto _L1 _L2
_L1:
        super.handleMessage(message);
_L4:
        return;
_L2:
        message = (AbsDrawerActivity)a.get();
        if (message != null)
        {
            ((AbsDrawerActivity) (message)).b.startAnimation(((AbsDrawerActivity) (message)).d);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public (AbsDrawerActivity absdraweractivity)
    {
        a = new WeakReference(absdraweractivity);
    }
}

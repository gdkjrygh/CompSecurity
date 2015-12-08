// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.os.Looper;
import android.util.Log;
import java.util.concurrent.SynchronousQueue;

class a extends Thread
{

    final SynchronousQueue a;
    final b b;

    public void run()
    {
        Looper.prepare();
        try
        {
            a.put(new alyticsMessageHandler(b));
        }
        catch (InterruptedException interruptedexception)
        {
            throw new RuntimeException("Couldn't build worker thread for Analytics Messages", interruptedexception);
        }
        try
        {
            Looper.loop();
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            Log.e("MixpanelAPI", "Mixpanel Thread dying from RuntimeException", runtimeexception);
        }
    }

    alyticsMessageHandler(alyticsMessageHandler alyticsmessagehandler, SynchronousQueue synchronousqueue)
    {
        b = alyticsmessagehandler;
        a = synchronousqueue;
        super();
    }
}

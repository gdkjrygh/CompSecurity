// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.google.analytics.tracking.android:
//            GAServiceProxy, Clock, Log

private class <init> extends TimerTask
{

    final GAServiceProxy this$0;

    public void run()
    {
        if (GAServiceProxy.access$400(GAServiceProxy.this) == ED_SERVICE && GAServiceProxy.access$700(GAServiceProxy.this).isEmpty() && GAServiceProxy.access$800(GAServiceProxy.this) + GAServiceProxy.access$900(GAServiceProxy.this) < GAServiceProxy.access$1000(GAServiceProxy.this).currentTimeMillis())
        {
            Log.iDebug("Disconnecting due to inactivity");
            GAServiceProxy.access$1100(GAServiceProxy.this);
            return;
        } else
        {
            GAServiceProxy.access$1200(GAServiceProxy.this).schedule(new <init>(), GAServiceProxy.access$900(GAServiceProxy.this));
            return;
        }
    }

    private ()
    {
        this$0 = GAServiceProxy.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}

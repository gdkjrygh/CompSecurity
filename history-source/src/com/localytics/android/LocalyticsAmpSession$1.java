// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;


// Referenced classes of package com.localytics.android:
//            LocalyticsAmpSession, AmpSessionHandler

class val.handler
    implements Runnable
{

    final LocalyticsAmpSession this$0;
    final AmpSessionHandler val$handler;

    public void run()
    {
        val$handler.sendMessage(val$handler.obtainMessage(13, ((Object) (new Object[] {
            "AMP Loaded", null
        }))));
    }

    ()
    {
        this$0 = final_localyticsampsession;
        val$handler = AmpSessionHandler.this;
        super();
    }
}

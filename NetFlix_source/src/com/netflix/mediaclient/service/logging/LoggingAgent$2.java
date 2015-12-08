// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.app.UserInputManager;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            LoggingAgent, IntegratedClientLoggingManager, PresentationTrackingManager

class this._cls0
    implements Runnable
{

    final LoggingAgent this$0;

    public void run()
    {
        Log.d("nf_log", "Running state check...");
        LoggingAgent.access$000(LoggingAgent.this).checkState();
        LoggingAgent.access$100(LoggingAgent.this).checkState();
        getApplication().getUserInput().checkState();
        Log.d("nf_log", "Running state check done.");
    }

    ckingManager()
    {
        this$0 = LoggingAgent.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.os.Handler;
import android.os.Message;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.LogEvent;
import com.skype.android.event.EventBus;
import com.skype.android.event.EventBusInstance;
import java.util.Map;
import java.util.concurrent.Future;

// Referenced classes of package com.skype.android.app.signin:
//            UnifiedLandingPageActivity

private static final class analytics extends Handler
{

    private final Analytics analytics;

    public final void handleMessage(Message message)
    {
        if (message.what == 1)
        {
            message = (Map)message.obj;
            if (((Future)message.get("future")).cancel(true))
            {
                analytics.a(LogEvent.E);
                message = new xistsResult((String)message.get("userId"), null);
                EventBusInstance.a().a(message);
            }
        }
    }

    public xistsResult(Analytics analytics1)
    {
        analytics = analytics1;
    }
}

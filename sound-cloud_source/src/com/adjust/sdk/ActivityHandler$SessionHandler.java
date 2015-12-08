// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

// Referenced classes of package com.adjust.sdk:
//            ActivityHandler, AdjustEvent

private static final class sessionHandlerReference extends Handler
{

    private static final int BASE_ADDRESS = 0x11bb6;
    private static final int DEEP_LINK = 0x11bbc;
    private static final int END = 0x11bb9;
    private static final int EVENT = 0x11bba;
    private static final int FINISH_TRACKING = 0x11bbb;
    private static final int INIT = 0x11bb7;
    private static final int SEND_REFERRER = 0x11bbd;
    private static final int START = 0x11bb8;
    private static final int TIMER_FIRED = 0x11bbf;
    private static final int UPDATE_STATUS = 0x11bbe;
    private final WeakReference sessionHandlerReference;

    public final void handleMessage(Message message)
    {
        super.handleMessage(message);
        ActivityHandler activityhandler = (ActivityHandler)sessionHandlerReference.get();
        if (activityhandler == null)
        {
            return;
        }
        switch (message.arg1)
        {
        default:
            return;

        case 72631: 
            ActivityHandler.access$200(activityhandler);
            return;

        case 72632: 
            ActivityHandler.access$300(activityhandler);
            return;

        case 72633: 
            ActivityHandler.access$400(activityhandler);
            return;

        case 72634: 
            ActivityHandler.access$500(activityhandler, (AdjustEvent)message.obj);
            return;

        case 72635: 
            ActivityHandler.access$600(activityhandler, (JSONObject)message.obj);
            return;

        case 72636: 
            message = (sessionHandlerReference)message.obj;
            ActivityHandler.access$700(activityhandler, ((sessionHandlerReference) (message)).l, ((l) (message)).ickTime);
            return;

        case 72637: 
            message = (me)message.obj;
            ActivityHandler.access$800(activityhandler, ((me) (message)).referrer, ((me) (message)).clickTime);
            return;

        case 72638: 
            ActivityHandler.access$900(activityhandler);
            return;

        case 72639: 
            ActivityHandler.access$1000(activityhandler);
            break;
        }
    }

    protected me(Looper looper, ActivityHandler activityhandler)
    {
        super(looper);
        sessionHandlerReference = new WeakReference(activityhandler);
    }
}

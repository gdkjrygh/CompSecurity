// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package com.adjust.sdk:
//            ActivityHandler, PackageBuilder

final class sessionHandlerReference extends Handler
{

    private static final int DEEP_LINK = 0x11be8;
    private static final int END = 0x11bca;
    private static final int EVENT = 0x11bd4;
    private static final int INIT_BUNDLE = 0x11bb6;
    private static final int INIT_PRESET = 0x11bb9;
    private static final int REVENUE = 0x11bde;
    private static final int START = 0x11bc0;
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

        case 72630: 
            ActivityHandler.access$100(activityhandler, true);
            return;

        case 72633: 
            ActivityHandler.access$100(activityhandler, false);
            return;

        case 72640: 
            ActivityHandler.access$200(activityhandler);
            return;

        case 72650: 
            ActivityHandler.access$300(activityhandler);
            return;

        case 72660: 
            ActivityHandler.access$400(activityhandler, (PackageBuilder)message.obj);
            return;

        case 72670: 
            ActivityHandler.access$500(activityhandler, (PackageBuilder)message.obj);
            return;

        case 72680: 
            ActivityHandler.access$600(activityhandler, (Uri)message.obj);
            break;
        }
    }

    protected (Looper looper, ActivityHandler activityhandler)
    {
        super(looper);
        sessionHandlerReference = new WeakReference(activityhandler);
    }
}

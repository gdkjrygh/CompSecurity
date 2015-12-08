// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.directupdate;

import org.apache.cordova.CallbackContext;

// Referenced classes of package com.worklight.androidgap.directupdate:
//            WLDirectUpdateListener, WLDirectUpdatePluginListener, WLDirectUpdateStatus

public class WLDirectUpdatePluginDefaultListener
    implements WLDirectUpdateListener
{

    private CallbackContext ctx;
    private WLDirectUpdatePluginListener listener;

    public WLDirectUpdatePluginDefaultListener(CallbackContext callbackcontext, WLDirectUpdatePluginListener wldirectupdatepluginlistener)
    {
        ctx = callbackcontext;
        listener = wldirectupdatepluginlistener;
    }

    public void onFinish(WLDirectUpdateStatus wldirectupdatestatus)
    {
        listener.onFinish(ctx, wldirectupdatestatus);
    }

    public void onProgress(WLDirectUpdateStatus wldirectupdatestatus, long l, long l1)
    {
        listener.onProgress(ctx, wldirectupdatestatus, l, l1);
    }

    public void onStart(long l)
    {
        listener.onStart(ctx, l);
    }
}

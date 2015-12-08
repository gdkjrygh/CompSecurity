// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.directupdate;

import org.apache.cordova.CallbackContext;

// Referenced classes of package com.worklight.androidgap.directupdate:
//            WLDirectUpdateStatus

public interface WLDirectUpdatePluginListener
{

    public abstract void onFinish(CallbackContext callbackcontext, WLDirectUpdateStatus wldirectupdatestatus);

    public abstract void onProgress(CallbackContext callbackcontext, WLDirectUpdateStatus wldirectupdatestatus, long l, long l1);

    public abstract void onStart(CallbackContext callbackcontext, long l);
}

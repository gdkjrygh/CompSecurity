// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.nativeImpl;

import com.worklight.location.internal.wifi.WifiInternalCallback;
import com.worklight.location.internal.wifi.triggerEvaluators.WifiInternalLocation;

// Referenced classes of package com.worklight.location.internal.nativeImpl:
//            CallbackExecutor

class ernalLocation
    implements Runnable
{

    final CallbackExecutor this$0;
    final WifiInternalCallback val$callback;
    final WifiInternalLocation val$pos;

    public void run()
    {
        val$callback.execute(val$pos);
    }

    ernalLocation()
    {
        this$0 = final_callbackexecutor;
        val$callback = wifiinternalcallback;
        val$pos = WifiInternalLocation.this;
        super();
    }
}

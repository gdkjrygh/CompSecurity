// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.nativeImpl;

import com.worklight.location.api.WLDeviceContext;
import com.worklight.location.api.WLTriggerCallback;

// Referenced classes of package com.worklight.location.internal.nativeImpl:
//            CallbackExecutor

class val.dc
    implements Runnable
{

    final CallbackExecutor this$0;
    final WLTriggerCallback val$callback;
    final WLDeviceContext val$dc;

    public void run()
    {
        val$callback.execute(val$dc);
    }

    ()
    {
        this$0 = final_callbackexecutor;
        val$callback = wltriggercallback;
        val$dc = WLDeviceContext.this;
        super();
    }
}

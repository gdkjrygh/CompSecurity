// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.nativeImpl;

import com.worklight.location.api.geo.WLGeoCallback;
import com.worklight.location.api.geo.WLGeoPosition;

// Referenced classes of package com.worklight.location.internal.nativeImpl:
//            CallbackExecutor

class val.pos
    implements Runnable
{

    final CallbackExecutor this$0;
    final WLGeoCallback val$callback;
    final WLGeoPosition val$pos;

    public void run()
    {
        val$callback.execute(val$pos);
    }

    ()
    {
        this$0 = final_callbackexecutor;
        val$callback = wlgeocallback;
        val$pos = WLGeoPosition.this;
        super();
    }
}

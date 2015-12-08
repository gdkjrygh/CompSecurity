// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.nativeImpl;

import com.worklight.location.internal.AbstractAcquisitionError;
import com.worklight.location.internal.AcquisitionFailureCallback;

// Referenced classes of package com.worklight.location.internal.nativeImpl:
//            CallbackExecutor

class val.error
    implements Runnable
{

    final CallbackExecutor this$0;
    final AcquisitionFailureCallback val$callback;
    final AbstractAcquisitionError val$error;

    public void run()
    {
        val$callback.execute(val$error);
    }

    ()
    {
        this$0 = final_callbackexecutor;
        val$callback = acquisitionfailurecallback;
        val$error = AbstractAcquisitionError.this;
        super();
    }
}

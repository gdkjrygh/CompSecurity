// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

// Referenced classes of package com.urbanairship.actions:
//            Action

class val.result extends ResultReceiver
{

    final Action this$0;
    final tivityResult val$result;

    public void onReceiveResult(int i, Bundle bundle)
    {
        tivityResult.access._mth000(val$result, i, (Intent)bundle.getParcelable("com.urbanairship.actions.actionactivity.RESULT_INTENT_EXTRA"));
        synchronized (val$result)
        {
            val$result.notify();
        }
        return;
        exception;
        bundle;
        JVM INSTR monitorexit ;
        throw exception;
    }

    tivityResult(tivityResult tivityresult)
    {
        this$0 = final_action;
        val$result = tivityresult;
        super(Handler.this);
    }
}

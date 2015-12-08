// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.android.schedulers;

import android.os.Handler;
import rx.functions.Action0;
import rx.internal.schedulers.ScheduledAction;

class val.scheduledAction
    implements Action0
{

    final val.scheduledAction this$0;
    final ScheduledAction val$scheduledAction;

    public void call()
    {
        cess._mth000(this._cls0.this).removeCallbacks(val$scheduledAction);
    }

    ()
    {
        this$0 = final_;
        val$scheduledAction = ScheduledAction.this;
        super();
    }
}

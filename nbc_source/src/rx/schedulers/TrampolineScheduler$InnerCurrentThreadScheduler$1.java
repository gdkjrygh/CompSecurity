// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.schedulers;

import java.util.concurrent.PriorityBlockingQueue;
import rx.functions.Action0;

// Referenced classes of package rx.schedulers:
//            TrampolineScheduler

class val.timedAction
    implements Action0
{

    final val.timedAction this$0;
    final val.timedAction val$timedAction;

    public void call()
    {
        cess._mth200(this._cls0.this).remove(val$timedAction);
    }

    ()
    {
        this$0 = final_;
        val$timedAction = val.timedAction.this;
        super();
    }
}

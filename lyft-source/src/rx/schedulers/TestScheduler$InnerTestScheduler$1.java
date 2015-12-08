// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.schedulers;

import java.util.Queue;
import rx.functions.Action0;

// Referenced classes of package rx.schedulers:
//            TestScheduler

class val.timedAction
    implements Action0
{

    final val.timedAction this$1;
    final val.timedAction val$timedAction;

    public void call()
    {
        TestScheduler.access$900(_fld0).remove(val$timedAction);
    }

    ()
    {
        this$1 = final_;
        val$timedAction = val.timedAction.this;
        super();
    }
}

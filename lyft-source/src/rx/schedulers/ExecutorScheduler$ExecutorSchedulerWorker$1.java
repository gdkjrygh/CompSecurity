// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.schedulers;

import rx.functions.Action0;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.MultipleAssignmentSubscription;

class val.mas
    implements Action0
{

    final val.mas this$0;
    final MultipleAssignmentSubscription val$mas;

    public void call()
    {
        sks.remove(val$mas);
    }

    ()
    {
        this$0 = final_;
        val$mas = MultipleAssignmentSubscription.this;
        super();
    }
}

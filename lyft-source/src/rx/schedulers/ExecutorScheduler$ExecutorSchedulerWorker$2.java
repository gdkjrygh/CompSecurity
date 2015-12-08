// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.schedulers;

import rx.Subscription;
import rx.functions.Action0;
import rx.internal.schedulers.ScheduledAction;
import rx.subscriptions.MultipleAssignmentSubscription;

class val.removeMas
    implements Action0
{

    final val.removeMas this$0;
    final Action0 val$action;
    final MultipleAssignmentSubscription val$mas;
    final Subscription val$removeMas;

    public void call()
    {
        if (!val$mas.isUnsubscribed())
        {
            Subscription subscription = hedule(val$action);
            val$mas.set(subscription);
            if (subscription.getClass() == rx/internal/schedulers/ScheduledAction)
            {
                ((ScheduledAction)subscription).add(val$removeMas);
                return;
            }
        }
    }

    ()
    {
        this$0 = final_;
        val$mas = multipleassignmentsubscription;
        val$action = action0;
        val$removeMas = Subscription.this;
        super();
    }
}

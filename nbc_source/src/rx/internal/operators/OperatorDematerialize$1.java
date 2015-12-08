// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Notification;
import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorDematerialize

class val.child extends Subscriber
{

    boolean terminated;
    final OperatorDematerialize this$0;
    final Subscriber val$child;

    public void onCompleted()
    {
        if (!terminated)
        {
            terminated = true;
            val$child.onCompleted();
        }
    }

    public void onError(Throwable throwable)
    {
        if (!terminated)
        {
            terminated = true;
            val$child.onError(throwable);
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((Notification)obj);
    }

    public void onNext(Notification notification)
    {
        .SwitchMap.rx.Notification.Kind[notification.getKind().l()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 37
    //                   2 56
    //                   3 65;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        if (!terminated)
        {
            val$child.onNext(notification.getValue());
            return;
        }
          goto _L1
_L3:
        onError(notification.getThrowable());
        return;
_L4:
        onCompleted();
        return;
    }

    (Subscriber subscriber1)
    {
        this$0 = final_operatordematerialize;
        val$child = subscriber1;
        super(Subscriber.this);
    }
}

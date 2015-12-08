// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Notification;
import rx.Subscriber;
import rx.plugins.RxJavaErrorHandler;
import rx.plugins.RxJavaPlugins;

// Referenced classes of package rx.internal.operators:
//            OperatorMaterialize

class val.child extends Subscriber
{

    final OperatorMaterialize this$0;
    final Subscriber val$child;

    public void onCompleted()
    {
        val$child.onNext(Notification.createOnCompleted());
        val$child.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        RxJavaPlugins.getInstance().getErrorHandler().handleError(throwable);
        val$child.onNext(Notification.createOnError(throwable));
        val$child.onCompleted();
    }

    public void onNext(Object obj)
    {
        val$child.onNext(Notification.createOnNext(obj));
    }

    (Subscriber subscriber1)
    {
        this$0 = final_operatormaterialize;
        val$child = subscriber1;
        super(Subscriber.this);
    }
}

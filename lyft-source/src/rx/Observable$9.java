// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.functions.Action1;

// Referenced classes of package rx:
//            Observer, Observable, Notification

class 
    implements Observer
{

    final Observable this$0;
    final Action1 val$onNotification;

    public final void onCompleted()
    {
        val$onNotification.call(Notification.createOnCompleted());
    }

    public final void onError(Throwable throwable)
    {
        val$onNotification.call(Notification.createOnError(throwable));
    }

    public final void onNext(Object obj)
    {
        val$onNotification.call(Notification.createOnNext(obj));
    }

    ion1()
    {
        this$0 = final_observable;
        val$onNotification = Action1.this;
        super();
    }
}

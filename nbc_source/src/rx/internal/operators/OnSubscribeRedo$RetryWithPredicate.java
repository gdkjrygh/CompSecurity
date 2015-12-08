// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Notification;
import rx.Observable;
import rx.functions.Func1;
import rx.functions.Func2;

// Referenced classes of package rx.internal.operators:
//            OnSubscribeRedo

public static final class predicate
    implements Func1
{

    private Func2 predicate;

    public volatile Object call(Object obj)
    {
        return call((Observable)obj);
    }

    public Observable call(Observable observable)
    {
        return observable.scan(Notification.createOnNext(Integer.valueOf(0)), new Func2() {

            final OnSubscribeRedo.RetryWithPredicate this$0;

            public volatile Object call(Object obj, Object obj1)
            {
                return call((Notification)obj, (Notification)obj1);
            }

            public Notification call(Notification notification, Notification notification1)
            {
                int i = ((Integer)notification.getValue()).intValue();
                notification = notification1;
                if (((Boolean)predicate.call(Integer.valueOf(i), notification1.getThrowable())).booleanValue())
                {
                    notification = Notification.createOnNext(Integer.valueOf(i + 1));
                }
                return notification;
            }

            
            {
                this$0 = OnSubscribeRedo.RetryWithPredicate.this;
                super();
            }
        });
    }


    public _cls1.this._cls0(Func2 func2)
    {
        predicate = func2;
    }
}

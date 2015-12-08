// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.functions.Func1;

// Referenced classes of package rx:
//            Observable, Notification

class <init>
    implements Func1
{

    final Observable this$0;
    final Func1 val$notificationHandler;

    public volatile Object call(Object obj)
    {
        return call((Observable)obj);
    }

    public Observable call(Observable observable)
    {
        return (Observable)val$notificationHandler.call(observable.map(new Func1() {

            final Observable._cls25 this$1;

            public volatile Object call(Object obj)
            {
                return call((Notification)obj);
            }

            public Throwable call(Notification notification)
            {
                return notification.getThrowable();
            }

            
            {
                this$1 = Observable._cls25.this;
                super();
            }
        }));
    }

    _cls1()
    {
        this$0 = final_observable;
        val$notificationHandler = Func1.this;
        super();
    }
}

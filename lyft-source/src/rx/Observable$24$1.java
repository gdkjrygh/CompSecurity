// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.functions.Func1;

// Referenced classes of package rx:
//            Notification, Observable

class nit>
    implements Func1
{

    final Throwable this$1;

    public volatile Object call(Object obj)
    {
        return call((Notification)obj);
    }

    public Throwable call(Notification notification)
    {
        return notification.getThrowable();
    }

    nit>()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class rx/Observable$24

/* anonymous class */
    class Observable._cls24
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
            return (Observable)notificationHandler.call(observable.map(new Observable._cls24._cls1()));
        }

            
            {
                this$0 = final_observable;
                notificationHandler = Func1.this;
                super();
            }
    }

}

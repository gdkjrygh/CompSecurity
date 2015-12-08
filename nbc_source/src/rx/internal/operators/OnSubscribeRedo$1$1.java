// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Notification;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package rx.internal.operators:
//            OnSubscribeRedo

class this._cls0
    implements Func1
{

    final call this$0;

    public volatile Object call(Object obj)
    {
        return call((Notification)obj);
    }

    public Notification call(Notification notification)
    {
        return Notification.createOnNext(null);
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }

    // Unreferenced inner class rx/internal/operators/OnSubscribeRedo$1

/* anonymous class */
    static final class OnSubscribeRedo._cls1
        implements Func1
    {

        public volatile Object call(Object obj)
        {
            return call((Observable)obj);
        }

        public Observable call(Observable observable)
        {
            return observable.map(new OnSubscribeRedo._cls1._cls1());
        }

    }

}

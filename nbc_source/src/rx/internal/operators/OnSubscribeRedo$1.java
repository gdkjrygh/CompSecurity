// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Notification;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package rx.internal.operators:
//            OnSubscribeRedo

static final class _cls1.this._cls0
    implements Func1
{

    public volatile Object call(Object obj)
    {
        return call((Observable)obj);
    }

    public Observable call(Observable observable)
    {
        return observable.map(new Func1() {

            final OnSubscribeRedo._cls1 this$0;

            public volatile Object call(Object obj)
            {
                return call((Notification)obj);
            }

            public Notification call(Notification notification)
            {
                return Notification.createOnNext(null);
            }

            
            {
                this$0 = OnSubscribeRedo._cls1.this;
                super();
            }
        });
    }

    _cls1.this._cls0()
    {
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Notification;
import rx.Observable;
import rx.functions.Func1;

public final class count
    implements Func1
{

    private final long count;

    public volatile Object call(Object obj)
    {
        return call((Observable)obj);
    }

    public Observable call(Observable observable)
    {
        return observable.map(new Func1() {

            int num;
            final OnSubscribeRedo.RedoFinite this$0;

            public volatile Object call(Object obj)
            {
                return call((Notification)obj);
            }

            public Notification call(Notification notification)
            {
                if (count != 0L)
                {
                    num = num + 1;
                    if ((long)num <= count)
                    {
                        return Notification.createOnNext(Integer.valueOf(num));
                    }
                }
                return notification;
            }

            
            {
                this$0 = OnSubscribeRedo.RedoFinite.this;
                super();
                num = 0;
            }
        }).dematerialize();
    }


    public _cls1.num(long l)
    {
        count = l;
    }
}

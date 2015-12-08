// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Notification;
import rx.Subscriber;

public final class OperatorDematerialize
    implements rx.Observable.Operator
{

    private OperatorDematerialize()
    {
    }


    public static OperatorDematerialize instance()
    {
        return Holder.INSTANCE;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber final_subscriber)
    {
        return new Subscriber(final_subscriber) {

            boolean terminated;
            final OperatorDematerialize this$0;
            final Subscriber val$child;

            public void onCompleted()
            {
                if (!terminated)
                {
                    terminated = true;
                    child.onCompleted();
                }
            }

            public void onError(Throwable throwable)
            {
                if (!terminated)
                {
                    terminated = true;
                    child.onError(throwable);
                }
            }

            public volatile void onNext(Object obj)
            {
                onNext((Notification)obj);
            }

            public void onNext(Notification notification)
            {
                class _cls2
                {

                    static final int $SwitchMap$rx$Notification$Kind[];

                    static 
                    {
                        $SwitchMap$rx$Notification$Kind = new int[rx.Notification.Kind.values().length];
                        try
                        {
                            $SwitchMap$rx$Notification$Kind[rx.Notification.Kind.OnNext.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            $SwitchMap$rx$Notification$Kind[rx.Notification.Kind.OnError.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$rx$Notification$Kind[rx.Notification.Kind.OnCompleted.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                _cls2..SwitchMap.rx.Notification.Kind[notification.getKind().ordinal()];
                JVM INSTR tableswitch 1 3: default 36
            //                           1 37
            //                           2 56
            //                           3 65;
                   goto _L1 _L2 _L3 _L4
_L1:
                return;
_L2:
                if (!terminated)
                {
                    child.onNext(notification.getValue());
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

            
            {
                this$0 = OperatorDematerialize.this;
                child = subscriber1;
                super(final_subscriber);
            }
        };
    }

    private class Holder
    {

        static final OperatorDematerialize INSTANCE = new OperatorDematerialize();


        private Holder()
        {
        }
    }

}

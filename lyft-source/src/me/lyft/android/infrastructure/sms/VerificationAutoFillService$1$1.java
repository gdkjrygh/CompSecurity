// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.sms;

import android.content.Context;
import android.content.IntentFilter;
import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.subscriptions.Subscriptions;

// Referenced classes of package me.lyft.android.infrastructure.sms:
//            VerificationAutoFillService

class val.subscriber
    implements Action1
{

    final val.subscriber this$1;
    final Subscriber val$subscriber;

    public volatile void call(Object obj)
    {
        call((String)obj);
    }

    public void call(String s)
    {
        val$subscriber.onNext(s);
    }

    l.context()
    {
        this$1 = final_context;
        val$subscriber = Subscriber.this;
        super();
    }

    // Unreferenced inner class me/lyft/android/infrastructure/sms/VerificationAutoFillService$1

/* anonymous class */
    class VerificationAutoFillService._cls1
        implements rx.Observable.OnSubscribe
    {

        final VerificationAutoFillService this$0;
        final Context val$context;

        public volatile void call(Object obj)
        {
            call((Subscriber)obj);
        }

        public void call(Subscriber subscriber1)
        {
            final VerificationAutoFillService.SmsBroadcastReceiver receiver = new VerificationAutoFillService.SmsBroadcastReceiver(subscriber1. new VerificationAutoFillService._cls1._cls1());
            subscriber1.add(Subscriptions.create(new VerificationAutoFillService._cls1._cls2()));
            subscriber1 = new IntentFilter();
            subscriber1.addAction("android.provider.Telephony.SMS_RECEIVED");
            context.registerReceiver(receiver, subscriber1);
        }

            
            {
                this$0 = final_verificationautofillservice;
                context = Context.this;
                super();
            }

        // Unreferenced inner class me/lyft/android/infrastructure/sms/VerificationAutoFillService$1$2

/* anonymous class */
        class VerificationAutoFillService._cls1._cls2
            implements Action0
        {

            final VerificationAutoFillService._cls1 this$1;
            final VerificationAutoFillService.SmsBroadcastReceiver val$receiver;

            public void call()
            {
                context.unregisterReceiver(receiver);
            }

                    
                    {
                        this$1 = VerificationAutoFillService._cls1.this;
                        receiver = smsbroadcastreceiver;
                        super();
                    }
        }

    }

}

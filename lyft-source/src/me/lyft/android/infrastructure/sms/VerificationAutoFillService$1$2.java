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

class roadcastReceiver
    implements Action0
{

    final val.receiver this$1;
    final roadcastReceiver val$receiver;

    public void call()
    {
        context.unregisterReceiver(val$receiver);
    }

    roadcastReceiver()
    {
        this$1 = final_roadcastreceiver;
        val$receiver = roadcastReceiver.this;
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

        public void call(final Subscriber subscriber)
        {
            VerificationAutoFillService.SmsBroadcastReceiver smsbroadcastreceiver = new VerificationAutoFillService.SmsBroadcastReceiver(new VerificationAutoFillService._cls1._cls1());
            subscriber.add(Subscriptions.create(smsbroadcastreceiver. new VerificationAutoFillService._cls1._cls2()));
            subscriber = new IntentFilter();
            subscriber.addAction("android.provider.Telephony.SMS_RECEIVED");
            context.registerReceiver(smsbroadcastreceiver, subscriber);
        }

            
            {
                this$0 = final_verificationautofillservice;
                context = Context.this;
                super();
            }

        // Unreferenced inner class me/lyft/android/infrastructure/sms/VerificationAutoFillService$1$1

/* anonymous class */
        class VerificationAutoFillService._cls1._cls1
            implements Action1
        {

            final VerificationAutoFillService._cls1 this$1;
            final Subscriber val$subscriber;

            public volatile void call(Object obj)
            {
                call((String)obj);
            }

            public void call(String s)
            {
                subscriber.onNext(s);
            }

                    
                    {
                        this$1 = VerificationAutoFillService._cls1.this;
                        subscriber = subscriber1;
                        super();
                    }
        }

    }

}

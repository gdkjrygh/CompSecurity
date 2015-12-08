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

class val.context
    implements rx.s.VerificationAutoFillService._cls1
{

    final VerificationAutoFillService this$0;
    final Context val$context;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(final Subscriber subscriber)
    {
        final sBroadcastReceiver receiver = new sBroadcastReceiver(new Action1() {

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
        });
        subscriber.add(Subscriptions.create(new Action0() {

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
        }));
        subscriber = new IntentFilter();
        subscriber.addAction("android.provider.Telephony.SMS_RECEIVED");
        val$context.registerReceiver(receiver, subscriber);
    }

    _cls2.val.receiver()
    {
        this$0 = final_verificationautofillservice;
        val$context = Context.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.sms;

import android.content.Context;
import android.content.IntentFilter;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.subscriptions.Subscriptions;

// Referenced classes of package me.lyft.android.infrastructure.sms:
//            IVerificationAutoFillService

public class VerificationAutoFillService
    implements IVerificationAutoFillService
{

    public static final String SMS_RECEIVED_ACTION = "android.provider.Telephony.SMS_RECEIVED";

    public VerificationAutoFillService()
    {
    }

    public Observable observeCode(final Context context)
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

            final VerificationAutoFillService this$0;
            final Context val$context;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                SmsBroadcastReceiver smsbroadcastreceiver = new SmsBroadcastReceiver(subscriber. new Action1() {

                    final _cls1 this$1;
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
                this$1 = final__pcls1;
                subscriber = Subscriber.this;
                super();
            }
                });
                subscriber.add(Subscriptions.create(smsbroadcastreceiver. new Action0() {

                    final _cls1 this$1;
                    final SmsBroadcastReceiver val$receiver;

                    public void call()
                    {
                        context.unregisterReceiver(receiver);
                    }

            
            {
                this$1 = final__pcls1;
                receiver = SmsBroadcastReceiver.this;
                super();
            }
                }));
                subscriber = new IntentFilter();
                subscriber.addAction("android.provider.Telephony.SMS_RECEIVED");
                context.registerReceiver(smsbroadcastreceiver, subscriber);
            }

            
            {
                this$0 = VerificationAutoFillService.this;
                context = context1;
                super();
            }

            private class SmsBroadcastReceiver extends BroadcastReceiver
            {

                private Action1 smsCallback;
                private final VerificationCodeSmsParser smsParser = new VerificationCodeSmsParser();

                public void onReceive(Context context1, Intent intent)
                {
                    {
                        context1 = intent.getExtras();
                        if (context1 == null)
                        {
                            break MISSING_BLOCK_LABEL_80;
                        }
                        int i;
                        int j;
                        try
                        {
                            context1 = ((Context) ((Object[])(Object[])context1.get("pdus")));
                            j = context1.length;
                        }
                        // Misplaced declaration of an exception variable
                        catch (Context context1)
                        {
                            L.w(context1, "failed to parse verification sms", new Object[0]);
                            return;
                        }
                        i = 0;
                    }
                    if (i >= j)
                    {
                        break MISSING_BLOCK_LABEL_80;
                    }
                    intent = SmsMessage.createFromPdu((byte[])(byte[])context1[i]);
                    intent = smsParser.extractCode(intent.getDisplayMessageBody());
                    if (intent == null)
                    {
                        break MISSING_BLOCK_LABEL_81;
                    }
                    if (smsCallback != null)
                    {
                        smsCallback.call(intent);
                    }
                    return;
                    i++;
                    if (false)
                    {
                    } else
                    {
                        break MISSING_BLOCK_LABEL_28;
                    }
                }

                public SmsBroadcastReceiver(Action1 action1)
                {
                    smsCallback = action1;
                }
            }

        });
    }
}

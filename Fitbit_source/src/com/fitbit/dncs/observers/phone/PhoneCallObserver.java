// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs.observers.phone;

import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.fitbit.FitBitApplication;
import com.fitbit.dncs.Notification;
import com.fitbit.dncs.NotificationManager;
import com.fitbit.dncs.domain.CategoryID;
import com.fitbit.dncs.domain.NotificationAttributeId;
import com.fitbit.dncs.observers.DncsObserver;
import com.fitbit.e.a;
import com.fitbit.util.threading.FitbitHandlerThread;

public class PhoneCallObserver extends DncsObserver
{

    private static final String a = "PhoneCallObserver";
    private static Integer c = null;
    private PhoneStateListener b;

    public PhoneCallObserver()
    {
        b = new PhoneStateListener() {

            final PhoneCallObserver a;

            public void onCallStateChanged(int i, String s)
            {
                FitbitHandlerThread.a(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.e, new Runnable(this, i, s) {

                    final int a;
                    final String b;
                    final _cls1 c;

                    public void run()
                    {
                        switch (a)
                        {
                        default:
                            com.fitbit.e.a.e("PhoneCallObserver", String.format("Unknown Callstate received = %s", new Object[] {
                                Integer.valueOf(a)
                            }), new Object[0]);
                            return;

                        case 1: // '\001'
                            com.fitbit.dncs.observers.phone.PhoneCallObserver.a(c.a, b);
                            return;

                        case 0: // '\0'
                            PhoneCallObserver.b(c.a, b);
                            return;

                        case 2: // '\002'
                            PhoneCallObserver.c(c.a, b);
                            break;
                        }
                    }

            
            {
                c = _pcls1;
                a = i;
                b = s;
                super();
            }
                });
            }

            
            {
                a = PhoneCallObserver.this;
                super();
            }
        };
    }

    static void a(PhoneCallObserver phonecallobserver, String s)
    {
        phonecallobserver.b(s);
    }

    private void a(String s)
    {
        com.fitbit.e.a.a("PhoneCallObserver", "onStateIdle: ", new Object[0]);
        e(s);
        if (s != null && !"".equals(s))
        {
            f(s);
        }
    }

    private void b(Context context, Intent intent)
    {
        int i;
        i = 0;
        context = intent.getStringExtra("state");
        intent = intent.getStringExtra("incoming_number");
        if (!TextUtils.equals(TelephonyManager.EXTRA_STATE_IDLE, context)) goto _L2; else goto _L1
_L1:
        b.onCallStateChanged(i, intent);
        return;
_L2:
        if (TextUtils.equals(TelephonyManager.EXTRA_STATE_OFFHOOK, context))
        {
            i = 2;
        } else
        if (TextUtils.equals(TelephonyManager.EXTRA_STATE_RINGING, context))
        {
            i = 1;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    static void b(PhoneCallObserver phonecallobserver, String s)
    {
        phonecallobserver.a(s);
    }

    private void b(String s)
    {
        com.fitbit.e.a.a("PhoneCallObserver", "onStateRinging: ", new Object[0]);
        d(s);
    }

    static void c(PhoneCallObserver phonecallobserver, String s)
    {
        phonecallobserver.c(s);
    }

    private void c(String s)
    {
        com.fitbit.e.a.a("PhoneCallObserver", "onStateOffhook: ", new Object[0]);
        e(s);
    }

    private void d(String s)
    {
        Notification notification = new Notification();
        notification.a(CategoryID.b);
        notification.a(FitBitApplication.a().getPackageName());
        String s1 = com.fitbit.dncs.observers.a.a(s);
        if (com.fitbit.dncs.observers.a.a(s) == null)
        {
            s1 = "";
        }
        notification.a(new com.fitbit.dncs.domain.a(NotificationAttributeId.b, s1));
        notification.a(new com.fitbit.dncs.domain.a(NotificationAttributeId.d, FitBitApplication.a().getString(0x7f080285)));
        if (NotificationManager.a().a(notification, com.fitbit.dncs.NotificationManager.DncsNotificationDisplayType.a))
        {
            c = (Integer)notification.e();
        }
    }

    private void e(String s)
    {
        if (c != null)
        {
            NotificationManager.a().a(c.intValue());
            c = null;
        }
    }

    private void f(String s)
    {
        Notification notification = new Notification();
        notification.a(CategoryID.c);
        notification.a(FitBitApplication.a().getPackageName());
        notification.a(new com.fitbit.dncs.domain.a(NotificationAttributeId.b, com.fitbit.dncs.observers.a.a(s)));
        notification.a(new com.fitbit.dncs.domain.a(NotificationAttributeId.d, "Missed Call"));
        NotificationManager.a().a(notification, com.fitbit.dncs.NotificationManager.DncsNotificationDisplayType.b);
    }

    public void a(Context context, Intent intent)
    {
        if (TextUtils.equals("android.intent.action.PHONE_STATE", intent.getAction()))
        {
            b(context, intent);
            return;
        } else
        {
            com.fitbit.e.a.d("PhoneCallObserver", "There was a telephony event", new Object[0]);
            b.onCallStateChanged(1, intent.getStringExtra("com.fitbit.example.EXTRA_MESSAGE"));
            return;
        }
    }

}

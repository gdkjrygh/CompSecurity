// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.appboy.a.b;
import com.appboy.e.d;
import com.appboy.f.a;

// Referenced classes of package com.appboy:
//            f, i, a, c

public final class AppboyGcmReceiver extends BroadcastReceiver
{

    private static final String a;

    public AppboyGcmReceiver()
    {
    }

    final boolean a(Context context, Intent intent)
    {
        NotificationManager notificationmanager = (NotificationManager)context.getSystemService("notification");
        if ("deleted_messages".equals(intent.getStringExtra("message_type")))
        {
            int k = intent.getIntExtra("total_deleted", -1);
            if (k == -1)
            {
                Log.e(a, String.format("Unable to parse GCM message. Intent: %s", new Object[] {
                    intent.toString()
                }));
            } else
            {
                com.appboy.f.a.b(a, String.format("GCM deleted %d messages. Fetch them from Appboy.", new Object[] {
                    Integer.valueOf(k)
                }));
            }
            return false;
        }
        Bundle bundle = intent.getExtras();
        Bundle bundle1 = d.a(bundle);
        bundle.putBundle("extra", bundle1);
        if (d.b(intent))
        {
            int l = d.b(bundle);
            bundle.putInt("nid", l);
            intent = new b(context);
            i j = d.a();
            try
            {
                intent = j.a(intent, context, bundle, bundle1);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.e(a, "Failed to create notification.", context);
                return false;
            }
            if (intent == null)
            {
                return false;
            }
            notificationmanager.notify("appboy_notification", l, intent);
            d.a(context, bundle);
            d.b(context, bundle);
            if (bundle != null && bundle.containsKey("nd"))
            {
                int i1 = Integer.parseInt(bundle.getString("nd"));
                d.a(context, getClass(), l, i1);
            }
            return true;
        } else
        {
            d.a(context, bundle);
            return false;
        }
    }

    public final void onReceive(Context context, Intent intent)
    {
        String s;
label0:
        {
            String s1;
label1:
            {
label2:
                {
                    com.appboy.f.a.b(a, String.format("Received broadcast message. Message: %s", new Object[] {
                        intent.toString()
                    }));
                    s = intent.getAction();
                    if (!"com.google.android.c2dm.intent.REGISTRATION".equals(s))
                    {
                        break label0;
                    }
                    if ((new b(context)).c())
                    {
                        s = intent.getStringExtra("error");
                        s1 = intent.getStringExtra("registration_id");
                        if (s == null)
                        {
                            break label1;
                        }
                        if (!"SERVICE_NOT_AVAILABLE".equals(s))
                        {
                            break label2;
                        }
                        Log.e(a, "Unable to connect to the GCM registration server. Try again later.");
                    }
                    return;
                }
                if ("ACCOUNT_MISSING".equals(s))
                {
                    Log.e(a, "No Google account found on the phone. For pre-3.0 devices, a Google account is required on the device.");
                    return;
                }
                if ("AUTHENTICATION_FAILED".equals(s))
                {
                    Log.e(a, "Unable to authenticate Google account. For Android versions <4.0.4, a valid Google Play account is required for Google Cloud Messaging to function. This phone will be unable to receive Google Cloud Messages until the user logs in with a valid Google Play account or upgrades the operating system on this device.");
                    return;
                }
                if ("INVALID_SENDER".equals(s))
                {
                    Log.e(a, "One or multiple of the sender IDs provided are invalid.");
                    return;
                }
                if ("PHONE_REGISTRATION_ERROR".equals(s))
                {
                    Log.e(a, "Device does not support GCM.");
                    return;
                }
                if ("INVALID_PARAMETERS".equals(s))
                {
                    Log.e(a, "The request sent by the device does not contain the expected parameters. This phone does not currently support GCM.");
                    return;
                } else
                {
                    com.appboy.f.a.c(a, String.format("Received an unrecognised GCM registration error type. Ignoring. Error: %s", new Object[] {
                        s
                    }));
                    return;
                }
            }
            if (s1 != null)
            {
                com.appboy.a.a(context).d(s1);
                return;
            }
            if (intent.hasExtra("unregistered"))
            {
                com.appboy.a.a(context).f();
                return;
            } else
            {
                com.appboy.f.a.c(a, "The GCM registration message is missing error information, registration id, and unregistration confirmation. Ignoring.");
                return;
            }
        }
        if ("com.google.android.c2dm.intent.RECEIVE".equals(s) && d.a(intent))
        {
            new c(this, context, intent);
            return;
        }
        if ("com.appboy.action.CANCEL_NOTIFICATION".equals(s) && intent.hasExtra("appboy_cancel_notification"))
        {
            int j = intent.getIntExtra("appboy_cancel_notification", -1);
            ((NotificationManager)context.getSystemService("notification")).cancel("appboy_notification", j);
            return;
        } else
        {
            com.appboy.f.a.c(a, String.format("The GCM receiver received a message not sent from Appboy. Ignoring the message.", new Object[0]));
            return;
        }
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            a, com/appboy/AppboyGcmReceiver.getName()
        });
    }
}

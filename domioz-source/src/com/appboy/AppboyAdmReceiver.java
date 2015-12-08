// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appboy.a.b;
import com.appboy.e.d;
import com.appboy.f.a;

// Referenced classes of package com.appboy:
//            f, i, a, b

public final class AppboyAdmReceiver extends BroadcastReceiver
{

    private static final String a;

    public AppboyAdmReceiver()
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
                com.appboy.f.a.d(a, String.format("Unable to parse ADM message. Intent: %s", new Object[] {
                    intent.toString()
                }));
            } else
            {
                com.appboy.f.a.b(a, String.format("ADM deleted %d messages. Fetch them from Appboy.", new Object[] {
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
                com.appboy.f.a.c(a, "Failed to create notification.", context);
                return false;
            }
            if (intent == null)
            {
                return false;
            }
            notificationmanager.notify("appboy_notification", l, intent);
            d.a(context, bundle);
            d.b(context, bundle);
            if (bundle.containsKey("nd"))
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
        com.appboy.f.a.b(a, String.format("Received broadcast message. Message: %s", new Object[] {
            intent.toString()
        }));
        String s = intent.getAction();
        if ("com.amazon.device.messaging.intent.REGISTRATION".equals(s))
        {
            com.appboy.f.a.b(a, String.format("Received ADM REGISTRATION. Message: %s", new Object[] {
                intent.toString()
            }));
            if ((new b(context)).d())
            {
                com.appboy.f.a.a(a, "ADM enabled in appboy.xml. Continuing to process ADM registration intent.");
                s = intent.getStringExtra("error");
                String s1 = intent.getStringExtra("registration_id");
                intent = intent.getStringExtra("unregistered");
                if (s != null)
                {
                    com.appboy.f.a.d(a, (new StringBuilder("Error during ADM registration: ")).append(s).toString());
                    return;
                }
                if (s1 != null)
                {
                    com.appboy.f.a.b(a, (new StringBuilder("Registering for ADM messages with registrationId: ")).append(s1).toString());
                    com.appboy.a.a(context).d(s1);
                    return;
                }
                if (intent != null)
                {
                    com.appboy.f.a.b(a, (new StringBuilder("Unregistering from ADM: ")).append(intent).toString());
                    com.appboy.a.a(context).f();
                    return;
                } else
                {
                    com.appboy.f.a.c(a, "The ADM registration intent is missing error information, registration id, and unregistration confirmation. Ignoring.");
                    return;
                }
            } else
            {
                com.appboy.f.a.c(a, "ADM not enabled in appboy.xml. Ignoring ADM registration intent. Note: you must set com_appboy_push_adm_messaging_registration_enabled to true in your appboy.xml to enable ADM.");
                return;
            }
        }
        if ("com.amazon.device.messaging.intent.RECEIVE".equals(s) && d.a(intent))
        {
            new com.appboy.b(this, context, intent);
            return;
        }
        if ("com.appboy.action.CANCEL_NOTIFICATION".equals(s) && intent.hasExtra("appboy_cancel_notification"))
        {
            int j = intent.getIntExtra("appboy_cancel_notification", -1);
            ((NotificationManager)context.getSystemService("notification")).cancel("appboy_notification", j);
            return;
        } else
        {
            com.appboy.f.a.c(a, String.format("The ADM receiver received a message not sent from Appboy. Ignoring the message.", new Object[0]));
            return;
        }
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            a, com/appboy/AppboyAdmReceiver.getName()
        });
    }
}

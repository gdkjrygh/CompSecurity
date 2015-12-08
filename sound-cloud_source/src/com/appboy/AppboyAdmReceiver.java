// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import com.appboy.a.b;
import com.appboy.e.a;
import com.appboy.e.e;

// Referenced classes of package com.appboy:
//            d, h, a

public final class AppboyAdmReceiver extends BroadcastReceiver
{
    public final class a extends AsyncTask
    {

        final AppboyAdmReceiver a;
        private final Context b;
        private final Intent c;

        protected final Object doInBackground(Object aobj[])
        {
            a.a(b, c);
            return null;
        }

        public a(Context context, Intent intent)
        {
            a = AppboyAdmReceiver.this;
            super();
            b = context;
            c = intent;
            execute(new Void[0]);
        }
    }


    private static final String a;

    public AppboyAdmReceiver()
    {
    }

    final boolean a(Context context, Intent intent)
    {
        NotificationManager notificationmanager = (NotificationManager)context.getSystemService("notification");
        if ("deleted_messages".equals(intent.getStringExtra("message_type")))
        {
            int i = intent.getIntExtra("total_deleted", -1);
            if (i == -1)
            {
                String.format("Unable to parse ADM message. Intent: %s", new Object[] {
                    intent.toString()
                });
            } else
            {
                String.format("ADM deleted %d messages. Fetch them from Appboy.", new Object[] {
                    Integer.valueOf(i)
                });
            }
            return false;
        }
        Bundle bundle = intent.getExtras();
        Bundle bundle1 = e.a(bundle);
        bundle.putBundle("extra", bundle1);
        if (e.b(intent))
        {
            int j = e.b(bundle);
            bundle.putInt("nid", j);
            intent = new b(context);
            h h1 = e.a();
            try
            {
                intent = h1.a(intent, context, bundle, bundle1);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return false;
            }
            if (intent == null)
            {
                return false;
            }
            notificationmanager.notify("appboy_notification", j, intent);
            e.a(context, bundle);
            e.b(context, bundle);
            if (bundle.containsKey("nd"))
            {
                int k = Integer.parseInt(bundle.getString("nd"));
                e.a(context, getClass(), j, k);
            }
            return true;
        } else
        {
            e.a(context, bundle);
            return false;
        }
    }

    public final void onReceive(Context context, Intent intent)
    {
        Object obj;
        String.format("Received broadcast message. Message: %s", new Object[] {
            intent.toString()
        });
        obj = intent.getAction();
        if (!"com.amazon.device.messaging.intent.REGISTRATION".equals(obj)) goto _L2; else goto _L1
_L1:
        obj = new b(context);
        String.format("Received ADM registration. Message: %s", new Object[] {
            intent.toString()
        });
        if (!((b) (obj)).d()) goto _L4; else goto _L3
_L3:
        String s;
        obj = intent.getStringExtra("error");
        s = intent.getStringExtra("registration_id");
        intent = intent.getStringExtra("unregistered");
        if (obj == null) goto _L5; else goto _L4
_L4:
        return;
_L5:
        if (s != null)
        {
            com.appboy.a.a(context).d(s);
            return;
        }
        if (intent != null)
        {
            com.appboy.a.a(context).f();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if ("com.amazon.device.messaging.intent.RECEIVE".equals(obj))
        {
            if (e.a(intent))
            {
                new a(context, intent);
                return;
            }
        } else
        {
            if ("com.appboy.action.CANCEL_NOTIFICATION".equals(obj))
            {
                e.b(context, intent);
                return;
            }
            if ("com.appboy.action.APPBOY_ACTION_CLICKED".equals(obj))
            {
                com.appboy.e.a.a(context, intent);
                return;
            }
            if ("com.appboy.action.APPBOY_PUSH_CLICKED".equals(obj))
            {
                e.a(context, intent);
                return;
            } else
            {
                String.format("The ADM receiver received a message not sent from Appboy. Ignoring the message.", new Object[0]);
                return;
            }
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            com.appboy.d.a, com/appboy/AppboyAdmReceiver.getName()
        });
    }
}

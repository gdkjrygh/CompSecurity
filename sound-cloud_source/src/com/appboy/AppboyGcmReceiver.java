// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.NotificationManagerCompat;
import com.appboy.a.b;
import com.appboy.e.a;
import com.appboy.e.e;

// Referenced classes of package com.appboy:
//            d, h, a

public final class AppboyGcmReceiver extends BroadcastReceiver
{
    public final class a extends AsyncTask
    {

        final AppboyGcmReceiver a;
        private final Context b;
        private final Intent c;

        protected final Object doInBackground(Object aobj[])
        {
            a.a(b, c);
            return null;
        }

        public a(Context context, Intent intent)
        {
            a = AppboyGcmReceiver.this;
            super();
            b = context;
            c = intent;
            execute(new Void[0]);
        }
    }


    private static final String a;

    public AppboyGcmReceiver()
    {
    }

    final boolean a(Context context, Intent intent)
    {
        NotificationManagerCompat notificationmanagercompat = NotificationManagerCompat.from(context);
        if (!"deleted_messages".equals(intent.getStringExtra("message_type"))) goto _L2; else goto _L1
_L1:
        int i = intent.getIntExtra("total_deleted", -1);
        if (i != -1) goto _L4; else goto _L3
_L3:
        String.format("Unable to parse GCM message. Intent: %s", new Object[] {
            intent.toString()
        });
_L6:
        return false;
_L4:
        String.format("GCM deleted %d messages. Fetch them from Appboy.", new Object[] {
            Integer.valueOf(i)
        });
        return false;
_L2:
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
            if (intent != null)
            {
                notificationmanagercompat.notify("appboy_notification", j, intent);
                e.a(context, bundle);
                e.b(context, bundle);
                if (bundle != null && bundle.containsKey("nd"))
                {
                    int k = Integer.parseInt(bundle.getString("nd"));
                    e.a(context, getClass(), j, k);
                }
                return true;
            }
        } else
        {
            e.a(context, bundle);
            return false;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void onReceive(Context context, Intent intent)
    {
        String s;
        String.format("Received broadcast message. Message: %s", new Object[] {
            intent.toString()
        });
        s = intent.getAction();
        if (!"com.google.android.c2dm.intent.REGISTRATION".equals(s)) goto _L2; else goto _L1
_L1:
        if (!(new b(context)).c()) goto _L4; else goto _L3
_L3:
        String s1;
        s = intent.getStringExtra("error");
        s1 = intent.getStringExtra("registration_id");
        if (s == null) goto _L6; else goto _L5
_L5:
        if (!"SERVICE_NOT_AVAILABLE".equals(s) && !"ACCOUNT_MISSING".equals(s) && !"AUTHENTICATION_FAILED".equals(s) && !"INVALID_SENDER".equals(s) && !"PHONE_REGISTRATION_ERROR".equals(s) && !"INVALID_PARAMETERS".equals(s))
        {
            String.format("Received an unrecognised GCM registration error type. Ignoring. Error: %s", new Object[] {
                s
            });
        }
_L4:
        return;
_L6:
        if (s1 != null)
        {
            com.appboy.a.a(context).d(s1);
            return;
        }
        if (intent.hasExtra("unregistered"))
        {
            com.appboy.a.a(context).f();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if ("com.google.android.c2dm.intent.RECEIVE".equals(s))
        {
            if (e.a(intent))
            {
                new a(context, intent);
                return;
            }
        } else
        {
            if ("com.appboy.action.CANCEL_NOTIFICATION".equals(s))
            {
                e.b(context, intent);
                return;
            }
            if ("com.appboy.action.APPBOY_ACTION_CLICKED".equals(s))
            {
                com.appboy.e.a.a(context, intent);
                return;
            }
            if ("com.appboy.action.APPBOY_PUSH_CLICKED".equals(s))
            {
                e.a(context, intent);
                return;
            } else
            {
                String.format("The GCM receiver received a message not sent from Appboy. Ignoring the message.", new Object[0]);
                return;
            }
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            com.appboy.d.a, com/appboy/AppboyGcmReceiver.getName()
        });
    }
}

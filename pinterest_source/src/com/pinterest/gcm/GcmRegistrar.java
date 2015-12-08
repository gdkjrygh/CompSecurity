// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.gcm;

import android.content.Context;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.pinterest.api.remote.AccountApi;
import com.pinterest.base.ApplicationInfo;
import com.pinterest.base.Events;
import com.pinterest.base.GooglePlayServices;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.kit.log.PLog;

public class GcmRegistrar
{

    public static void a()
    {
        String s = b();
        AccountApi.b(s, new UnRegisterPushTokenResponseHandler((byte)0));
        PLog.warn((new StringBuilder("GCMIntentService.unregister: ")).append(s).toString(), new Object[0]);
        class GcmEvent.Type extends Enum
        {

            public static final GcmEvent.Type a;
            private static final GcmEvent.Type b[];

            public static GcmEvent.Type valueOf(String s1)
            {
                return (GcmEvent.Type)Enum.valueOf(com/pinterest/gcm/GcmRegistrar$GcmEvent$Type, s1);
            }

            public static GcmEvent.Type[] values()
            {
                return (GcmEvent.Type[])b.clone();
            }

            static 
            {
                a = new GcmEvent.Type("UNREGISTER");
                b = (new GcmEvent.Type[] {
                    a
                });
            }

            private GcmEvent.Type(String s)
            {
                super(s, 0);
            }
        }

        Events.post(new GcmEvent(GcmEvent.Type.a));
    }

    public static void a(Context context)
    {
        a(context, 0);
    }

    public static void a(Context context, int i)
    {
        if (GooglePlayServices.isAvailable())
        {
            GoogleCloudMessaging googlecloudmessaging = GoogleCloudMessaging.getInstance(context);
            if (b().isEmpty())
            {
                (new _cls1(googlecloudmessaging, i, context)).execute(new Void[] {
                    null, null, null
                });
                return;
            }
        }
    }

    public static void a(String s)
    {
        boolean flag1 = true;
        String s1 = b();
        boolean flag;
        int i;
        if (!s.equals(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = ApplicationInfo.getVersionCode();
        if (i == Preferences.user().getInt("PREF_GCM_APP_VERSION", 0))
        {
            flag1 = false;
        }
        if (flag)
        {
            if (!s1.isEmpty())
            {
                AccountApi.b(s1, new UnRegisterPushTokenResponseHandler((byte)0));
            }
            AccountApi.a(s, new PushTokenResponseHandler((byte)0));
        }
        if (flag || flag1)
        {
            PLog.info((new StringBuilder("GcmRegistrar: Saving regId on app version ")).append(i).toString(), new Object[0]);
            android.content.SharedPreferences.Editor editor = Preferences.user().edit();
            editor.putString("PREF_GCM_REG_ID", s);
            editor.putInt("PREF_GCM_APP_VERSION", i);
            editor.commit();
        }
    }

    public static String b()
    {
        String s = Preferences.user().getString("PREF_GCM_REG_ID", "");
        if (s.isEmpty())
        {
            PLog.info("GcmRegistrar: Registration not found.", new Object[0]);
            s = "";
        } else
        if (Preferences.user().getInt("PREF_GCM_APP_VERSION", 0x80000000) != ApplicationInfo.getVersionCode())
        {
            PLog.info("GcmRegistrar: App version changed.", new Object[0]);
            return "";
        }
        return s;
    }

    private class UnRegisterPushTokenResponseHandler extends PushTokenResponseHandler
    {
        private class PushTokenResponseHandler extends ApiResponseHandler
        {

            public void onFailure(Throwable throwable, ApiResponse apiresponse)
            {
                CrashReporting.a(throwable);
            }

            private PushTokenResponseHandler()
            {
            }

            PushTokenResponseHandler(byte byte0)
            {
                this();
            }
        }


        private UnRegisterPushTokenResponseHandler()
        {
            super((byte)0);
        }

        UnRegisterPushTokenResponseHandler(byte byte0)
        {
            this();
        }
    }


    private class GcmEvent
    {

        Type a;

        public final Type a()
        {
            return a;
        }

        public GcmEvent(Type type)
        {
            a = type;
        }
    }


    private class _cls1 extends AsyncTask
    {

        final GoogleCloudMessaging a;
        final int b;
        final Context c;

        private transient String a()
        {
            String s2;
            try
            {
                String s = a.register(new String[] {
                    "694505692171"
                });
                s2 = (new StringBuilder("Device registered, registration ID=")).append(s).toString();
                GcmRegistrar.a(s);
            }
            catch (IOException ioexception)
            {
                String s1 = (new StringBuilder("Error :")).append(ioexception.getMessage()).toString();
                int i = b;
                Object obj = new Intent("com.google.android.gcm.intent.RETRY");
                int j = b + 1;
                ((Intent) (obj)).putExtra("com.pinterest.EXTRA_RETRY_NUMBER", j);
                obj = PendingIntent.getBroadcast(c, 0, ((Intent) (obj)), 0x10000000);
                if (j < 3)
                {
                    AlarmManager alarmmanager = (AlarmManager)c.getSystemService("alarm");
                    long l = SystemClock.elapsedRealtime();
                    alarmmanager.set(3, (long)((1 << i) * 1000) + l, ((PendingIntent) (obj)));
                }
                return s1;
            }
            return s2;
        }

        protected final Object doInBackground(Object aobj[])
        {
            return a();
        }

        _cls1(GoogleCloudMessaging googlecloudmessaging, int i, Context context)
        {
            a = googlecloudmessaging;
            b = i;
            c = context;
            super();
        }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.NSLogger.NSLoggerClient;
import com.amplitude.api.a;
import com.cardinalblue.android.b.d;
import com.cardinalblue.android.b.i;
import com.cardinalblue.android.b.k;
import com.crashlytics.android.Crashlytics;
import com.facebook.appevents.AppEventsLogger;
import com.flurry.android.FlurryAgent;
import com.google.android.gms.analytics.c;
import com.google.android.gms.analytics.g;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONObject;

// Referenced classes of package com.cardinalblue.android.piccollage.a:
//            b

public class f
{
    private static class a
    {

        private static NSLoggerClient a = null;

        public static void a(Context context, String s)
        {
            if (a == null)
            {
                a = new NSLoggerClient(context);
                a.a(null, Build.MODEL, false);
            }
            a.a(s);
        }

        public static void a(String s)
        {
            Log.w("PC", s);
        }


        private a()
        {
        }
    }


    private static g a;

    public f()
    {
    }

    public static String a(int j, ActivityInfo activityinfo)
    {
        switch (j)
        {
        case 10: // '\n'
        default:
            return "unknown";

        case 9: // '\t'
            return "piccollage";

        case 6: // '\006'
            return "facebook";

        case 1: // '\001'
            return "twitter";

        case 3: // '\003'
            return "email";

        case 5: // '\005'
            return "other";

        case 4: // '\004'
            return "gallery";

        case 2: // '\002'
            return "kddi";

        case 7: // '\007'
            if (activityinfo != null)
            {
                return activityinfo.packageName;
            }
            // fall through

        case 8: // '\b'
            return "instagram";

        case 11: // '\013'
            return "copy_link";
        }
    }

    private static transient Map a(String as[])
    {
        if (as == null || as.length % 2 == 1)
        {
            return null;
        }
        HashMap hashmap = new HashMap();
        for (int j = 0; j < as.length; j += 2)
        {
            hashmap.put(as[j], as[j + 1]);
        }

        return hashmap;
    }

    public static void a(Activity activity, String s)
    {
        try
        {
            s = com.google.android.gms.analytics.c.a(activity);
            s.a(activity);
            a = s.a(0x7f050000);
            a.c(true);
            a.a(false);
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        a(((Context) (activity)));
        k.i(activity);
    }

    public static void a(Context context)
    {
        FlurryAgent.onStartSession(context, k.q());
    }

    public static void a(Context context, String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putString("fb_content_type", "collage");
            bundle.putString("fb_content_id", s);
            a(context, "fb_mobile_rate", bundle);
            return;
        }
    }

    private static void a(Context context, String s, Bundle bundle)
    {
        if (bundle != null)
        {
            try
            {
                AppEventsLogger.newLogger(context).logEvent(s, bundle);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
        }
        AppEventsLogger.newLogger(context).logEvent(s);
        return;
    }

    private static void a(Context context, String s, Map map)
    {
        if (map != null)
        {
            if (com.cardinalblue.android.b.d.b())
            {
                com.cardinalblue.android.piccollage.a.a.a((new StringBuilder()).append(s).append(" : ").append(map).toString());
                com.cardinalblue.android.piccollage.a.a.a(context, (new StringBuilder()).append(s).append(" : ").append(map).toString());
            }
            FlurryAgent.logEvent(s, map);
        } else
        {
            if (com.cardinalblue.android.b.d.b())
            {
                com.cardinalblue.android.piccollage.a.a.a(s);
                com.cardinalblue.android.piccollage.a.a.a(context, s);
            }
            FlurryAgent.logEvent(s);
        }
        if (k.h())
        {
            if (map != null)
            {
                com.amplitude.api.a.a().a(s, new JSONObject(map));
            } else
            {
                com.amplitude.api.a.a().a(s);
            }
        }
        s = i.a(s, 40);
        if (map != null)
        {
            Bundle bundle = new Bundle();
            map = map.entrySet().iterator();
            do
            {
                if (!map.hasNext())
                {
                    break;
                }
                Object obj = (java.util.Map.Entry)map.next();
                String s1 = (String)((java.util.Map.Entry) (obj)).getKey();
                if (!TextUtils.isEmpty(s1))
                {
                    obj = (String)((java.util.Map.Entry) (obj)).getValue();
                    if (!TextUtils.isEmpty(((CharSequence) (obj))))
                    {
                        bundle.putString(i.a(s1, 40), i.a(((String) (obj)), 100));
                    }
                }
            } while (true);
            a(context, s, bundle);
            return;
        } else
        {
            a(context, s, ((Bundle) (null)));
            return;
        }
    }

    static transient void a(Context context, String s, String as[])
    {
        a(context, s, a(as));
    }

    public static void a(Intent intent)
    {
        if (!intent.hasExtra("key_notification_id")) goto _L2; else goto _L1
_L1:
        String s;
        String s1;
        int j;
        if (intent.hasExtra("key_notification_target_activity"))
        {
            s = intent.getStringExtra("key_notification_target_activity");
        } else
        {
            s = "unknown";
        }
        if (intent.hasExtra("flurry_event"))
        {
            s1 = intent.getStringExtra("flurry_event");
        } else
        {
            s1 = "unknown";
        }
        if (intent.getBooleanExtra("key_is_gcm_notification", true))
        {
            com.cardinalblue.android.piccollage.a.b.h(s1, s);
        } else
        {
            com.cardinalblue.android.piccollage.a.b.aY();
        }
        if (intent.hasExtra("key_notification_payload"))
        {
            com.cardinalblue.android.piccollage.controller.network.f.a(new com.android.volley.m.b() {

                public volatile void a(Object obj)
                {
                    a((String)obj);
                }

                public void a(String s2)
                {
                }

            }, intent.getStringExtra("key_notification_payload"));
        } else
        {
            a(((Throwable) (new IllegalArgumentException("handle notification should be include payload in bundle"))));
        }
        j = intent.getIntExtra("key_notification_id", -1);
        j;
        JVM INSTR tableswitch 30000 30001: default 116
    //                   30000 186
    //                   30001 180;
           goto _L3 _L4 _L5
_L3:
        k.a(j);
        intent.removeExtra("key_notification_id");
        intent.removeExtra("key_notification_target_activity");
        intent.removeExtra("flurry_event");
        intent.removeExtra("key_notification_payload");
_L2:
        return;
_L5:
        com.cardinalblue.android.piccollage.a.b.cd();
        continue; /* Loop/switch isn't completed */
_L4:
        com.cardinalblue.android.piccollage.a.b.aO("edit");
        if (true) goto _L3; else goto _L6
_L6:
    }

    public static void a(String s)
    {
        a(k.a(), s, ((Map) (null)));
    }

    public static void a(String s, String s1, String s2, double d1)
    {
        if (a == null)
        {
            return;
        } else
        {
            com.google.android.gms.analytics.a.a a1 = new com.google.android.gms.analytics.a.a();
            a1.b(s1);
            a1.a(s2);
            a.a(((com.google.android.gms.analytics.d.d)(new com.google.android.gms.analytics.d.d()).b("USD").a(d1).a(s).a(a1)).a());
            return;
        }
    }

    static transient void a(String s, String as[])
    {
        a(k.a(), s, as);
    }

    public static void a(Throwable throwable)
    {
        if (throwable == null)
        {
            return;
        }
        throwable.printStackTrace();
        try
        {
            Crashlytics.logException(throwable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            return;
        }
    }

    public static void b(Activity activity, String s)
    {
        try
        {
            com.google.android.gms.analytics.c.a(activity).c(activity);
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        b(((Context) (activity)));
    }

    public static void b(Context context)
    {
        FlurryAgent.onEndSession(context);
    }

    public static void b(Intent intent)
    {
        if (intent != null && intent.getBooleanExtra("extra_applink_route", false))
        {
            com.cardinalblue.android.piccollage.a.b.bz();
        }
    }

    public static void c(Context context)
    {
        try
        {
            AppEventsLogger.activateApp(context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            a(context);
        }
    }

    public static void d(Context context)
    {
        Bundle bundle = new Bundle();
        bundle.putString("fb_registration_method", "Facebook");
        a(context, "fb_mobile_complete_registration", bundle);
    }

    public static void e(Context context)
    {
        Bundle bundle = new Bundle();
        bundle.putString("fb_registration_method", "Email");
        a(context, "fb_mobile_complete_registration", bundle);
    }

    public static void f(Context context)
    {
        a(context, "pc_mobile_follow_user", ((Bundle) (null)));
    }

    public static void g(Context context)
    {
        try
        {
            Crashlytics.setString("version_code_history", i.a(PreferenceManager.getDefaultSharedPreferences(context).getStringSet("version_code_history", new HashSet()), ","));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }
}

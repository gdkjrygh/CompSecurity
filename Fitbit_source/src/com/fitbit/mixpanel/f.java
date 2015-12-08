// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.mixpanel;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.fitbit.FitBitApplication;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceType;
import com.fitbit.e.a;
import com.fitbit.savedstate.ServerSavedState;
import com.fitbit.savedstate.d;
import com.fitbit.util.al;
import com.fitbit.util.format.e;
import com.fitbit.util.p;
import com.google.android.gcm.b;
import com.mixpanel.android.mpmetrics.h;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.mixpanel:
//            MixPanelPeopleProperty, h

public class f
{
    public static final class a
    {

        public static final String a = "App: Back Off";
        public static final String b = "Back Off Type";
        public static final String c = "General App Back Off";
        public static final String d = "Galileo App Back Off";
        public static final String e = "%d RBBO";
        public static final String f = "Galileo requests for last %d minute(s)";
        public static final String g = "Backed off user";

        public a()
        {
        }
    }

    public static final class b
    {

        public static final String a = "Challenges: Home";
        public static final String b = "Challenges: Create";
        public static final String c = "Challenges: Join";
        public static final String d = "Challenges: Loaded";
        public static final String e = "Challenges: Send Message";
        public static final String f = "Challenges: Send Cheer";
        public static final String g = "Challenges: Turn On Push Notifications";
        public static final String h = "Challenges: Turn Off Push Notifications";
        public static final String i = "!StartTime";
        public static final String j = "Now";
        public static final String k = "Later";
        public static final String l = "!Rematch";
        public static final String m = "!Source";
        public static final String n = "!TriggerType";
        public static final String o = "!ChallengeType";
        public static final String p = "!ChallengeId";
        public static final String q = "UNKNOWN";
        public static final String r = "invite";
        public static final String s = "message";
        public static final String t = "cheer";

        public b()
        {
        }
    }


    public static final String A = "FConnect: Choose %s";
    public static final String B = "Sync Attempts";
    public static final String C = "Successful Syncs";
    public static final String D = "Unfinished Syncs";
    public static final String E = "Unsuccessful Firmware Updates";
    public static final String F = "Launches";
    public static final String G = "Push Notification: Open";
    private static final String H = "MixPanel";
    private static h I = null;
    public static final String a = "82d19845b298fcc8b8713861c9cf67c0";
    public static final String b = "45b3cbfc56ddb35a099bc7f38fc74f4c";
    public static final String c = "01a4d3dc24652dbcb0ab51f755ae680d";
    public static final String d = "e31a715632b1757efef0c96194b0a8c4";
    public static final String e = "Logged Activity";
    public static final String f = "Logged Food";
    public static final String g = "Logged Water";
    public static final String h = "Logged Weight";
    public static final String i = "Logged Sleep";
    public static final String j = "App: App Open";
    public static final String k = "App: Lifetime Application Launches";
    public static final String l = "App: Launch Screen";
    public static final String m = "FoodGoal: Created";
    public static final String n = "Dash: View Dashboard";
    public static final String o = "Auth: Login";
    public static final String p = "Auth: Sign Up";
    public static final String q = "Auth: Sign Up - Create Account";
    public static final String r = "Auth: Sign Up - Complete Profile";
    public static final String s = "Auth: Logout";
    public static final String t = "Social: View Leaderboard";
    public static final String u = "Social: Find Friends";
    public static final String v = "Social: Friend Request - View";
    public static final String w = "Social: Friend Request - Sent";
    public static final String x = "Social: Friend Request - Responded";
    public static final String y = "Social: Friend Message - Sent";
    public static final String z = "Social: View Notifications";

    public f()
    {
    }

    public static String a()
    {
        String s2 = com.fitbit.savedstate.d.n();
        String s1 = s2;
        if (s2 == null)
        {
            s1 = "82d19845b298fcc8b8713861c9cf67c0";
        }
        return s1;
    }

    public static void a(Activity activity)
    {
        if (h())
        {
            I.e().b(activity);
        }
    }

    public static void a(Context context)
    {
        a(context, a());
    }

    public static void a(Context context, String s1)
    {
        if (I != null)
        {
            I.a();
        }
        String s2;
        if (s1.equals("82d19845b298fcc8b8713861c9cf67c0"))
        {
            s2 = null;
        } else
        {
            s2 = s1;
        }
        com.fitbit.savedstate.d.c(s2);
        I = com.mixpanel.android.mpmetrics.h.a(context.getApplicationContext(), s1);
        b();
        e();
    }

    public static void a(MixPanelPeopleProperty mixpanelpeopleproperty, String s1)
    {
        a(mixpanelpeopleproperty.toString(), s1);
    }

    public static void a(com.fitbit.mixpanel.h h1)
    {
        a(h1.a(), h1.b());
    }

    public static void a(String s1)
    {
        while (!h() || s1 == null) 
        {
            return;
        }
        com.mixpanel.android.mpmetrics.h.b b1 = I.e();
        b1.a("Pairing: Lifetime Attempts", 1.0D);
        b1.a("Pairing: Last Attempt", com.fitbit.util.format.e.o(new Date()));
        b1.a("Pairing: Tracker Attempted", s1);
    }

    public static void a(String s1, int i1)
    {
        if (h())
        {
            I.e().a(s1, i1);
        }
    }

    public static void a(String s1, String s2)
    {
        if (h())
        {
            I.e().a(s1, s2);
            return;
        } else
        {
            com.fitbit.e.a.a("MixPanel", "Attempt to set MixPanel People property while MixPanel is not initialized]", new Object[0]);
            return;
        }
    }

    public static void a(String s1, String s2, String s3)
    {
        a(s1, new JSONObject(Collections.singletonMap(s2, s3)));
    }

    public static void a(String s1, JSONObject jsonobject)
    {
        if (jsonobject != null)
        {
            Locale locale = al.a();
            try
            {
                jsonobject.put("Locale", locale.toString());
                jsonobject.put("LocaleLang", locale.getCountry());
                jsonobject.put("LocaleReal", Locale.getDefault().toString());
            }
            catch (JSONException jsonexception)
            {
                com.fitbit.e.a.a("MixPanel", jsonexception.getLocalizedMessage(), new Object[0]);
            }
        }
        if (I != null)
        {
            I.a(s1, jsonobject);
            return;
        } else
        {
            com.fitbit.e.a.a("MixPanel", "Attempt to track MixPanel event while MixPanel is not initialized", new Object[0]);
            return;
        }
    }

    public static String b(String s1)
    {
        com.fitbit.config.a a1 = FitBitApplication.a().f();
        return (new StringBuilder()).append("App Version ").append(a1.b()).append(" (").append(a1.a()).append(") ").append(s1).toString();
    }

    public static void b()
    {
        if (I != null)
        {
            Object obj = I.e();
            Object obj1 = an.a().b();
            if (obj1 != null)
            {
                obj1 = String.valueOf(((Profile) (obj1)).I());
                I.a(((String) (obj1)));
                ((com.mixpanel.android.mpmetrics.h.b) (obj)).a(((String) (obj1)));
                obj = com.google.android.gcm.b.g(FitBitApplication.a());
                if (obj != null && ((String) (obj)).length() > 0)
                {
                    g(((String) (obj)));
                } else
                {
                    g();
                }
            } else
            {
                g();
                I.a("");
                ((com.mixpanel.android.mpmetrics.h.b) (obj)).a("");
            }
            c();
        }
    }

    public static void b(Activity activity)
    {
        if (h())
        {
            I.e().a(activity);
        }
    }

    public static void c()
    {
        JSONObject jsonobject;
        if (I == null)
        {
            return;
        }
        jsonobject = new JSONObject();
        Object obj;
        jsonobject.put("Platform", "Android");
        obj = FitBitApplication.a().f();
        jsonobject.put("Android App Version", (new StringBuilder()).append(((com.fitbit.config.a) (obj)).b()).append(" (").append(((com.fitbit.config.a) (obj)).a()).append(")").toString());
        jsonobject.put("Bluetooth Library", com.fitbit.bluetooth.support.b.a());
        jsonobject.put("Environment", j());
        obj = an.a().b();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        Object obj1 = ((Profile) (obj)).s();
        obj = new JSONArray();
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((JSONArray) (obj)).put(((Device)((Iterator) (obj1)).next()).j().toUpperCase(al.a()))) { }
          goto _L1
        obj;
        com.fitbit.e.a.a("MixPanel", "Failed to create mixpanel super properties", ((Throwable) (obj)), new Object[0]);
_L2:
        I.d();
        I.a(jsonobject);
        return;
_L1:
        jsonobject.put("Paired Devices", obj);
        com.fitbit.e.a.a("MixPanel", "Update fitbit tracking super properties ", new Object[0]);
          goto _L2
    }

    public static void c(String s1)
    {
        a(s1, new JSONObject());
    }

    public static void d()
    {
        JSONObject jsonobject;
        if (I == null)
        {
            return;
        }
        jsonobject = new JSONObject();
        Object obj = an.a().b();
        if (obj == null) goto _L2; else goto _L1
_L1:
        Object obj1 = ((Profile) (obj)).s();
        obj = new JSONArray();
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((JSONArray) (obj)).put(((Device)((Iterator) (obj1)).next()).j().toUpperCase(al.a()))) { }
          goto _L3
_L2:
        I.a(jsonobject);
        return;
_L3:
        try
        {
            jsonobject.put("Paired Devices", obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.fitbit.e.a.a("MixPanel", "Failed to update devices in super properties", ((Throwable) (obj)), new Object[0]);
        }
        if (true) goto _L2; else goto _L4
_L4:
    }

    public static void d(String s1)
    {
        if (h())
        {
            I.e().a(s1, 1.0D);
        }
    }

    public static void e()
    {
        com.mixpanel.android.mpmetrics.h.b b1;
label0:
        {
            Object obj = an.a().b();
            if (h() && obj != null)
            {
                b1 = I.e();
                Object obj1 = com.fitbit.savedstate.d.h();
                if (obj1 != null)
                {
                    b1.a("$email", obj1);
                }
                b1.a("$created", com.fitbit.util.format.e.o(((Profile) (obj)).getTimeCreated()));
                obj = Build.MODEL;
                if (obj != null)
                {
                    b1.a("Android Model", obj);
                }
                obj = Build.MANUFACTURER;
                if (obj != null)
                {
                    b1.a("Android Manufacturer", obj);
                }
                obj1 = com.fitbit.util.p.b(DeviceType.TRACKER);
                if (((List) (obj1)).isEmpty())
                {
                    break label0;
                }
                obj = new JSONArray();
                for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((JSONArray) (obj)).put(((Device)((Iterator) (obj1)).next()).j())) { }
                b1.a("TrackerModel", obj);
            }
            return;
        }
        b1.a("TrackerModel", "");
    }

    public static void e(String s1)
    {
        a(b(s1), 1);
    }

    public static void f()
    {
        if (I != null)
        {
            I.a();
        }
    }

    public static void f(String s1)
    {
        a(b(s1), -1);
    }

    public static void g()
    {
        if (I != null)
        {
            I.e().c();
        }
    }

    public static void g(String s1)
    {
        if (h())
        {
            I.e().d(s1);
        }
    }

    static boolean h()
    {
        return I != null && !TextUtils.isEmpty(I.e().d());
    }

    public static String i()
    {
        return "MixPanel";
    }

    private static String j()
    {
        String s1 = ServerSavedState.h();
        if (s1.equalsIgnoreCase("https://android-api.fitbit.com"))
        {
            return "prod";
        }
        if (s1.contains("qa1"))
        {
            return "qa1";
        }
        if (s1.contains("qa2"))
        {
            return "qa2";
        }
        if (s1.contains("qa3"))
        {
            return "qa3";
        } else
        {
            return "local";
        }
    }

}

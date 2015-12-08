// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            ci, gs, hi, be, 
//            bd

public final class ba
{

    private final Context a;
    private final String b;
    private final String c;
    private final String d;
    private final Integer e;
    private final DisplayMetrics f;
    private HashMap g;

    public ba(Context context)
    {
        Object obj;
        g = null;
        a = context;
        obj = context.getPackageManager();
        Object obj1;
        Object obj2;
        obj2 = ((PackageManager) (obj)).getPackageInfo(context.getPackageName(), 0);
        obj1 = ((PackageManager) (obj)).getApplicationInfo(context.getApplicationInfo().processName, 0);
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        obj = (String)((PackageManager) (obj)).getApplicationLabel(((ApplicationInfo) (obj1)));
        Object obj3;
        int i;
        try
        {
            obj1 = ((ApplicationInfo) (obj1)).processName;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj3)
        {
            obj2 = obj;
            obj1 = null;
            obj = null;
            continue; /* Loop/switch isn't completed */
        }
_L8:
        if (obj2 == null) goto _L4; else goto _L3
_L3:
        try
        {
            obj3 = ((PackageInfo) (obj2)).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj3)
        {
            Object obj5 = null;
            obj2 = obj;
            obj = obj5;
            continue; /* Loop/switch isn't completed */
        }
        i = ((PackageInfo) (obj2)).versionCode;
        obj2 = Integer.valueOf(i);
_L6:
        if (g == null && ci.b().u != null)
        {
            Object obj6 = ci.b().u.getSharedPreferences("TAPLYTICS_PREFS", 0);
            Object obj4;
            if (obj6 == null)
            {
                g = c();
            } else
            {
                String s = ((SharedPreferences) (obj6)).getString("ID", null);
                obj6 = ((SharedPreferences) (obj6)).getString("TYPE", null);
                HashMap hashmap = new HashMap();
                if (s == null || obj6 == null)
                {
                    g = c();
                } else
                {
                    hashmap.put("id", s);
                    hashmap.put("type", obj6);
                    g = hashmap;
                }
            }
        }
        b = ((String) (obj));
        d = ((String) (obj3));
        e = ((Integer) (obj2));
        c = ((String) (obj1));
        f = new DisplayMetrics();
        ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getMetrics(f);
        return;
        obj3;
        obj = null;
        obj2 = null;
        obj1 = null;
_L5:
        gs.b((new StringBuilder("System Context does not exist: ")).append(((android.content.pm.PackageManager.NameNotFoundException) (obj3)).toString()).toString());
        obj4 = obj2;
        obj2 = null;
        obj3 = obj;
        obj = obj4;
        continue; /* Loop/switch isn't completed */
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        obj2 = obj;
        obj = obj3;
        obj3 = namenotfoundexception;
        if (true) goto _L5; else goto _L4
_L4:
        obj2 = null;
        obj3 = null;
        if (true) goto _L6; else goto _L2
_L2:
        obj1 = null;
        obj = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private HashMap c()
    {
        Object obj2;
        HashMap hashmap;
        obj2 = null;
        if (g != null)
        {
            return g;
        }
        hashmap = new HashMap();
        if (!hi.a(a, "android.permission.READ_PHONE_STATE")) goto _L2; else goto _L1
_L1:
        String s1 = ((TelephonyManager)a.getSystemService("phone")).getDeviceId();
        String s = "UUID";
_L13:
        Object obj;
        Object obj1;
        obj = s;
        obj1 = s1;
        if (s1 != null) goto _L4; else goto _L3
_L3:
        obj = s;
        obj1 = s1;
        if (android.os.Build.VERSION.SDK_INT < 9) goto _L4; else goto _L5
_L5:
        s1 = Build.SERIAL;
        s = "anBuildSerial";
        obj = s;
        obj1 = s1;
        if (!s1.equalsIgnoreCase("unknown")) goto _L4; else goto _L6
_L6:
        obj = obj2;
        obj1 = s;
_L11:
        s = ((String) (obj1));
        obj1 = obj;
        if (obj == null)
        {
            try
            {
                obj1 = android.provider.Settings.Secure.getString(a.getContentResolver(), "android_id");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                gs.a("Problem getting unique ID", ((Exception) (obj)));
                return hashmap;
            }
            s = "anAndroidID";
        }
        if (obj1 == null) goto _L8; else goto _L7
_L7:
        hashmap.put("id", obj1);
        hashmap.put("type", s);
        g = hashmap;
_L9:
        if (ci.b().u != null)
        {
            obj = ci.b().u.getSharedPreferences("TAPLYTICS_PREFS", 0);
            ((SharedPreferences) (obj)).edit().putString("ID", ((String) (obj1))).apply();
            ((SharedPreferences) (obj)).edit().putString("TYPE", s).apply();
        }
        break; /* Loop/switch isn't completed */
_L8:
        hashmap.put("id", UUID.randomUUID().toString());
        hashmap.put("type", "UUID");
        g = hashmap;
        if (true) goto _L9; else goto _L4
_L4:
        s = ((String) (obj1));
        obj1 = obj;
        obj = s;
        if (true) goto _L11; else goto _L10
_L10:
        break; /* Loop/switch isn't completed */
_L2:
        s = null;
        s1 = null;
        if (true) goto _L13; else goto _L12
_L12:
        return hashmap;
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        Object obj1 = ci.b();
        Object obj;
        bc bc;
        if (((ci) (obj1)).g)
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        hashmap.put("lv", obj);
        if (((ci) (obj1)).f != null)
        {
            hashmap.put("t", ci.b().f);
        }
        if (b != null)
        {
            hashmap.put("an", b);
        }
        if (d != null)
        {
            hashmap.put("av", d);
        }
        if (e != null)
        {
            hashmap.put("ab", e);
        }
        if (c != null)
        {
            hashmap.put("ai", c);
        }
        hashmap.put("sdk", ci.a.a);
        hashmap.put("os", "Android");
        if (android.os.Build.VERSION.RELEASE != null)
        {
            obj = android.os.Build.VERSION.RELEASE;
        } else
        {
            obj = "unknown";
        }
        hashmap.put("osv", obj);
        if (Build.MANUFACTURER == null)
        {
            obj = "UNKNOWN";
        } else
        {
            obj = Build.MANUFACTURER;
        }
        hashmap.put("ma", obj);
        if (Build.BRAND == null)
        {
            obj = "UNKNOWN";
        } else
        {
            obj = Build.BRAND;
        }
        hashmap.put("br", obj);
        if (Build.MODEL == null)
        {
            obj = "UNKNOWN";
        } else
        {
            obj = Build.MODEL;
        }
        hashmap.put("d", obj);
        hashmap.put("alg", Locale.getDefault().getLanguage());
        hashmap.put("alg3", Locale.getDefault().getISO3Language());
        hashmap.put("con", Locale.getDefault().getCountry());
        hashmap.put("con3", Locale.getDefault().getISO3Country());
        hashmap.put("sdpi", Integer.valueOf(f.densityDpi));
        hashmap.put("sh", Integer.valueOf(f.heightPixels));
        hashmap.put("sw", Integer.valueOf(f.widthPixels));
        hashmap.put("tz", TimeZone.getDefault().getDisplayName(false, 0));
        hashmap.put("tzs", Integer.valueOf(TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000));
        hashmap.put("tzn", TimeZone.getDefault().getID());
        obj = (TelephonyManager)a.getSystemService("phone");
        JSONException jsonexception;
        if (obj != null)
        {
            obj = ((TelephonyManager) (obj)).getNetworkOperatorName();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            hashmap.put("ca", obj);
        }
        obj = (TelephonyManager)a.getSystemService("phone");
        if (obj == null) goto _L2; else goto _L1
_L1:
        ((TelephonyManager) (obj)).getPhoneType();
        JVM INSTR tableswitch 0 3: default 528
    //                   0 795
    //                   1 802
    //                   2 809
    //                   3 816;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        obj = null;
_L17:
        if (obj != null)
        {
            hashmap.put("rd", obj);
        }
        obj = b();
        if (obj != null)
        {
            hashmap.put("ad", ((Map) (obj)).get("id"));
            hashmap.put("adt", ((Map) (obj)).get("type"));
        }
        if (!hi.a(a, "android.permission.ACCESS_NETWORK_STATE")) goto _L9; else goto _L8
_L8:
        obj = ((ConnectivityManager)a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (obj == null || !((NetworkInfo) (obj)).isConnectedOrConnecting()) goto _L11; else goto _L10
_L10:
        if (((NetworkInfo) (obj)).getType() != 1) goto _L13; else goto _L12
_L12:
        obj = "WIFI";
_L15:
        hashmap.put("n", obj);
        obj1 = ((ci) (obj1)).t;
        if (obj1 != null)
        {
            bc = ((bd) (obj1)).c;
            obj = ((bd) (obj1)).k;
            obj1 = ((bd) (obj1)).a;
            if (bc != null && bc.has("_id"))
            {
                try
                {
                    hashmap.put("pid", bc.getString("_id"));
                }
                // Misplaced declaration of an exception variable
                catch (JSONException jsonexception)
                {
                    gs.b("Getting project_id", jsonexception);
                }
            }
            if (obj != null && ((JSONObject) (obj)).has("_id"))
            {
                try
                {
                    hashmap.put("au", ((JSONObject) (obj)).getString("_id"));
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    gs.b("Getting appUser_id", ((Exception) (obj)));
                }
            }
            if (obj1 != null)
            {
                hashmap.put("sid", obj1);
            }
        }
        return hashmap;
_L4:
        obj = "none";
        continue; /* Loop/switch isn't completed */
_L5:
        obj = "gsm";
        continue; /* Loop/switch isn't completed */
_L6:
        obj = "cdma";
        continue; /* Loop/switch isn't completed */
_L7:
        obj = "sip";
        continue; /* Loop/switch isn't completed */
_L13:
        if (((NetworkInfo) (obj)).getType() != 0) goto _L11; else goto _L14
_L14:
        obj = "WWAN";
          goto _L15
_L9:
        gs.c("Error No ACCESS_NETWORK_STATE permissions to get Network type");
_L11:
        obj = "UNKNOWN";
          goto _L15
_L2:
        obj = null;
        if (true) goto _L17; else goto _L16
_L16:
    }

    public final void a(StringBuilder stringbuilder)
    {
        hi.a(a(), stringbuilder);
    }

    public final Map b()
    {
        if (g != null)
        {
            return g;
        } else
        {
            return c();
        }
    }
}

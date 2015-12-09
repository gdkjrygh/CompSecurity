// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.a;

import a.a.bt;
import a.a.dm;
import a.a.kh;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.appboy.f;
import com.appboy.f.a;
import com.appboy.f.c;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.appboy.a:
//            a

public class b extends com.appboy.a.a
{

    private static final String b;
    private final Context c;

    public b(Context context)
    {
        super(context);
        c = context;
    }

    private int a(kh kh1)
    {
        if (kh1.equals(kh.b))
        {
            kh1 = "com_appboy_push_large_notification_icon";
        } else
        {
            kh1 = "com_appboy_push_small_notification_icon";
        }
        if (a.containsKey(kh1))
        {
            return ((Integer)a.get(kh1)).intValue();
        } else
        {
            int i1 = c.getResources().getIdentifier(kh1, "drawable", com.appboy.f.c.a(c));
            a.put(kh1, Integer.valueOf(i1));
            return i1;
        }
    }

    public final String a()
    {
        if ("STAGING".equals(a("com_appboy_server_target", "PROD").toUpperCase(Locale.US)))
        {
            return "https://sondheim.appboy.com/api/v2/";
        } else
        {
            return "https://dev.appboy.com/api/v2/";
        }
    }

    public final bt b()
    {
        Object obj1;
        bt bt1;
        bt1 = (bt)a.get("com_appboy_api_key");
        obj1 = bt1;
        if (bt1 != null) goto _L2; else goto _L1
_L1:
        Object obj = c.getSharedPreferences("com_appboy_override_configuration_cache", 0).getString("com_appboy_api_key", null);
        if (obj == null) goto _L4; else goto _L3
_L3:
        com.appboy.f.a.b(b, "Found an override api key.  Using it to configure Appboy.");
_L7:
        obj1 = bt1;
        if (obj != null)
        {
            obj1 = new bt(((String) (obj)));
            a.put("com_appboy_api_key", obj1);
        }
_L2:
        int i1;
        int j1;
        if (obj1 == null)
        {
            com.appboy.f.a.d(b, "****************************************************");
            com.appboy.f.a.d(b, "**                                                **");
            com.appboy.f.a.d(b, "**                 !! WARNING !!                  **");
            com.appboy.f.a.d(b, "**                                                **");
            com.appboy.f.a.d(b, "**     No API key set in res/values/appboy.xml    **");
            com.appboy.f.a.d(b, "** No cached API Key found from Appboy.configure  **");
            com.appboy.f.a.d(b, "**         Appboy functionality disabled          **");
            com.appboy.f.a.d(b, "**                                                **");
            com.appboy.f.a.d(b, "****************************************************");
            throw new RuntimeException("Unable to read the Appboy API key from the res/values/appboy.xml file. See log for more details.");
        } else
        {
            return ((bt) (obj1));
        }
_L4:
        obj = Locale.getDefault();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_321;
        }
        obj1 = b("com_appboy_locale_api_key_map");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_321;
        }
        j1 = obj1.length;
        i1 = 0;
_L8:
        if (i1 >= j1) goto _L6; else goto _L5
_L5:
        String s = obj1[i1];
        if (dm.a(s, ",") != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        String as[] = s.split(",");
        if (as.length != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        String s1 = as[0].trim().toLowerCase();
        boolean flag = s1.equals(((Locale) (obj)).toString().toLowerCase());
        if (!s1.equals(((Locale) (obj)).getCountry().toLowerCase()) && !flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = as[1].trim();
_L9:
        if (obj != null)
        {
            com.appboy.f.a.b(b, "Found a locale that matches the current locale in appboy.xml.  Using the associated api key");
        } else
        {
            obj = b("com_appboy_api_key", null);
        }
          goto _L7
        i1++;
          goto _L8
_L6:
        obj = null;
          goto _L9
    }

    public final boolean c()
    {
        return a("com_appboy_push_gcm_messaging_registration_enabled");
    }

    public final boolean d()
    {
        return a("com_appboy_push_adm_messaging_registration_enabled");
    }

    public final boolean e()
    {
        return !a("com_appboy_disable_location_collection");
    }

    public final boolean f()
    {
        return a("com_appboy_enable_background_location_collection");
    }

    public final long g()
    {
        return 1000L * (long)a("com_appboy_location_update_time_interval", -1);
    }

    public final float h()
    {
        return (float)a("com_appboy_location_update_distance", -1);
    }

    public final int i()
    {
        return a(kh.a);
    }

    public final int j()
    {
        return a(kh.b);
    }

    public final int k()
    {
        if (a.containsKey("version_code"))
        {
            return ((Integer)a.get("version_code")).intValue();
        }
        int i1;
        try
        {
            String s = com.appboy.f.c.a(c);
            i1 = c.getPackageManager().getPackageInfo(s, 0).versionCode;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            com.appboy.f.a.d(b, "Unable to read the version code.");
            i1 = -1;
        }
        a.put("version_code", Integer.valueOf(i1));
        return i1;
    }

    public final String l()
    {
        return a("com_appboy_push_gcm_sender_id", null);
    }

    public final int m()
    {
        String s;
        int i1;
        i1 = 0;
        if (a.containsKey("application_icon"))
        {
            return ((Integer)a.get("application_icon")).intValue();
        }
        s = c.getPackageName();
        int j1 = c.getPackageManager().getApplicationInfo(s, 0).icon;
        i1 = j1;
_L2:
        a.put("application_icon", Integer.valueOf(i1));
        return i1;
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        com.appboy.f.a.d(b, String.format("Cannot find package named %s", new Object[] {
            s
        }));
        j1 = c.getPackageManager().getApplicationInfo(c.getPackageName(), 0).icon;
        i1 = j1;
        continue; /* Loop/switch isn't completed */
        namenotfoundexception;
        com.appboy.f.a.d(b, String.format("Cannot find package named %s", new Object[] {
            s
        }));
        if (true) goto _L2; else goto _L1
_L1:
    }

    static 
    {
        b = String.format("%s.%s", new Object[] {
            f.a, com/appboy/a/b.getName()
        });
    }
}

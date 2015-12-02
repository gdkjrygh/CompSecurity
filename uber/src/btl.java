// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class btl
{

    private static Map a;

    public btl()
    {
    }

    private static String a(Context context)
    {
        try
        {
            context = context.getPackageManager().getPackageInfo(context.getPackageName(), 128).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return "unknown versionName";
        }
        return context;
    }

    public static JSONObject a()
    {
        Object obj = new JSONObject();
        try
        {
            String s;
            for (Iterator iterator = a.keySet().iterator(); iterator.hasNext(); ((JSONObject) (obj)).put(s, a.get(s)))
            {
                s = (String)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("paypal.sdk", "Error encoding JSON", ((Throwable) (obj)));
            return null;
        }
        return ((JSONObject) (obj));
    }

    public static void a(bsx bsx1)
    {
        if (a == null)
        {
            HashMap hashmap = new HashMap();
            a = hashmap;
            hashmap.put("app_version", a(bsx1.f()));
            a.put("app_category", "1");
            if (bsx1.b() == 1)
            {
                a.put("client_platform", "AndroidGSM");
            } else
            if (bsx1.b() == 2)
            {
                a.put("client_platform", "AndroidCDMA");
            } else
            {
                a.put("client_platform", "AndroidOther");
            }
            a.put("device_app_id", bsx1.c());
        }
    }

    static 
    {
        btl.getSimpleName();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk:
//            dg, cn, gd

public class df
{

    private static final HashMap a = new dg();
    private static Map b;

    public df()
    {
    }

    public static JSONObject a()
    {
        Object obj = new JSONObject();
        try
        {
            String s;
            for (Iterator iterator = b.keySet().iterator(); iterator.hasNext(); ((JSONObject) (obj)).put(s, b.get(s)))
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

    public static void a(cn cn1)
    {
        if (b == null)
        {
            Object obj = new HashMap();
            b = ((Map) (obj));
            ((Map) (obj)).put("device_identifier", gd.a(cn1.e()));
            b.put("device_type", "Android");
            b.put("device_name", gd.a(Build.DEVICE));
            b.put("device_model", gd.a(Build.MODEL));
            obj = b;
            cn1 = (String)a.get(Integer.valueOf(cn1.b()));
            boolean flag;
            if (TextUtils.isEmpty(cn1))
            {
                cn1 = "ANDROIDGSM_UNDEFINED";
            }
            ((Map) (obj)).put("device_key_type", cn1);
            b.put("device_os", "Android");
            b.put("device_os_version", gd.a(android.os.Build.VERSION.RELEASE));
            cn1 = b;
            if (Build.PRODUCT.equals("sdk") || Build.PRODUCT.equals("google_sdk") || Build.FINGERPRINT.contains("generic"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            cn1.put("is_device_simulator", Boolean.toString(flag));
        }
    }

    static 
    {
        com/paypal/android/sdk/df.getSimpleName();
    }
}

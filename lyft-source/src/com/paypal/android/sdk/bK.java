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
//            bL, b, R

public class bK
{

    private static final HashMap a = new bL();
    private static Map b;

    public bK()
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

    public static void a(b b1)
    {
        Object obj = new HashMap();
        b = ((Map) (obj));
        ((Map) (obj)).put("device_identifier", R.a(b1.e()));
        b.put("device_type", "Android");
        b.put("device_name", R.a(Build.DEVICE));
        b.put("device_model", R.a(Build.MODEL));
        obj = b;
        b1 = (String)a.get(Integer.valueOf(b1.b()));
        boolean flag;
        if (TextUtils.isEmpty(b1))
        {
            b1 = "ANDROIDGSM_UNDEFINED";
        }
        ((Map) (obj)).put("device_key_type", b1);
        b.put("device_os", "Android");
        b.put("device_os_version", R.a(android.os.Build.VERSION.RELEASE));
        b1 = b;
        if (Build.PRODUCT.equals("sdk") || Build.PRODUCT.equals("google_sdk") || Build.FINGERPRINT.contains("generic"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b1.put("is_device_simulator", Boolean.toString(flag));
    }

    public static String b(b b1)
    {
        return R.a(b1.e());
    }

    static 
    {
        com/paypal/android/sdk/bK.getSimpleName();
    }
}

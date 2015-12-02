// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class bto
{

    private static final HashMap a = new btp();
    private static Map b;

    public bto()
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

    public static void a(bsx bsx1)
    {
        if (b == null)
        {
            Object obj = new HashMap();
            b = ((Map) (obj));
            ((Map) (obj)).put("device_identifier", bwq.a(bsx1.e()));
            b.put("device_type", "Android");
            b.put("device_name", bwq.a(Build.DEVICE));
            b.put("device_model", bwq.a(Build.MODEL));
            Map map = b;
            obj = (String)a.get(Integer.valueOf(bsx1.b()));
            bsx1 = ((bsx) (obj));
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                bsx1 = "ANDROIDGSM_UNDEFINED";
            }
            map.put("device_key_type", bsx1);
            b.put("device_os", "Android");
            b.put("device_os_version", bwq.a(android.os.Build.VERSION.RELEASE));
            bsx1 = b;
            boolean flag;
            if (Build.PRODUCT.equals("sdk") || Build.PRODUCT.equals("google_sdk") || Build.FINGERPRINT.contains("generic"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            bsx1.put("is_device_simulator", Boolean.toString(flag));
        }
    }

    static 
    {
        bto.getSimpleName();
    }
}

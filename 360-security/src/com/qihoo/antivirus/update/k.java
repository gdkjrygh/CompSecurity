// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.lang.reflect.Method;

// Referenced classes of package com.qihoo.antivirus.update:
//            e, af

public class k
{

    private static String a()
    {
        Object obj = Class.forName("android.os.SystemProperties");
        if (obj == null) goto _L2; else goto _L1
_L1:
        Method method;
        method = ((Class) (obj)).getMethod("get", new Class[] {
            java/lang/String, java/lang/String
        });
        method.setAccessible(true);
        if (method == null) goto _L2; else goto _L3
_L3:
        try
        {
            obj = (String)method.invoke(obj, new Object[] {
                "ro.serialno", ""
            });
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
        }
_L5:
        if (obj != null)
        {
            return ((String) (obj));
        } else
        {
            return "";
        }
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static String a(Context context)
    {
        String s1 = e.a(context, "wid");
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            String s2 = d(context);
            s = s2;
            if (!TextUtils.isEmpty(s2))
            {
                e.a(context, "wid", s2);
                s = s2;
            }
        }
        return s;
    }

    private static String b(Context context)
    {
        context = (TelephonyManager)context.getSystemService("phone");
        if (context != null)
        {
            String s = context.getDeviceId();
            context = s;
            if (TextUtils.isEmpty(s))
            {
                context = "DEFAULT_IMEI";
            }
            return context;
        } else
        {
            return "360_DEFAULT_IMEI";
        }
    }

    private static String c(Context context)
    {
        context = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (context != null)
        {
            return context;
        } else
        {
            return "";
        }
    }

    private static String d(Context context)
    {
        String s = null;
        context = (new StringBuilder(String.valueOf(b(context)))).append(c(context)).append(a()).toString();
        try
        {
            context = af.b(context.getBytes("utf-8"));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = null;
        }
        if (!TextUtils.isEmpty(context))
        {
            s = context.toLowerCase();
        }
        return s;
    }
}

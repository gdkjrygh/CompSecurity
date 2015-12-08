// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api;

import android.text.TextUtils;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.remote.BaseApi;
import com.pinterest.kit.log.PLog;

// Referenced classes of package com.pinterest.api:
//            ApiHttpClient

public class ApiClient extends BaseApi
{

    protected static boolean a = false;
    private static String b = null;
    private static String c = "";

    public static void a(String s)
    {
        b = s;
        PLog.log("setAuthToken %s", s, new Object[0]);
        if (ModelHelper.isValid(s))
        {
            ApiHttpClient.addHeader("Authorization", (new StringBuilder("Bearer ")).append(s).toString());
            return;
        } else
        {
            ApiHttpClient.addHeader("Authorization", null);
            return;
        }
    }

    public static boolean a()
    {
        return a;
    }

    public static void b()
    {
        a = false;
    }

    public static void b(String s)
    {
        c = s;
    }

    public static String c()
    {
        return b;
    }

    public static boolean d()
    {
        return !TextUtils.isEmpty(b);
    }

    public static String e()
    {
        return "1431602";
    }

    public static String f()
    {
        return c;
    }

}

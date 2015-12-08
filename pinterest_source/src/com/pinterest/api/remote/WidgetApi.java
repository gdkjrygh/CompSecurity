// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiHttpClient;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.MyUser;
import com.pinterest.base.ApplicationInfo;
import com.pinterest.kit.log.PLog;
import com.pinterest.reporting.CrashReporting;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

// Referenced classes of package com.pinterest.api.remote:
//            BaseApi

public class WidgetApi extends BaseApi
{

    private static boolean a = false;

    public static void a(int i, int j, ApiResponseHandler apiresponsehandler)
    {
        String s = String.format("android/widget/%d/%d/", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        });
        TreeMap treemap = new TreeMap();
        treemap.put("device_id", ApplicationInfo.getInstallId());
        treemap.put("preinstall", String.valueOf(ApplicationInfo.isPreinstalled()));
        try
        {
            ApiHttpClient.signedCall(s, "GET", treemap, apiresponsehandler, null, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ApiResponseHandler apiresponsehandler)
        {
            PLog.warn(apiresponsehandler.toString(), new Object[0]);
        }
    }

    public static void b(int i, int j, ApiResponseHandler apiresponsehandler)
    {
        boolean flag = true;
        String s;
        TreeMap treemap;
        if (a)
        {
            s = String.format("android/widget/notifications/%d/%d/%s/", new Object[] {
                Integer.valueOf(262), Integer.valueOf(7), String.valueOf((new Random(System.currentTimeMillis())).nextInt(0x186a0))
            });
        } else
        {
            s = String.format("android/widget/notifications/%d/%d/%s/", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j), ApplicationInfo.getInstallId()
            });
        }
        treemap = new TreeMap();
        if (!a)
        {
            flag = ApplicationInfo.isPreinstalled();
        }
        treemap.put("preinstall", String.valueOf(flag));
        if (MyUser.getUid() != null)
        {
            treemap.put("userid", MyUser.getUid());
        }
        treemap.put("add_fields", "androidwidgetnotification.images['80x80']");
        try
        {
            ApiHttpClient.signedCall(s, "GET", treemap, apiresponsehandler, null, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ApiResponseHandler apiresponsehandler)
        {
            CrashReporting.a(apiresponsehandler);
        }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api;

import android.app.Activity;
import android.os.Build;
import com.pinterest.base.ApplicationInfo;
import com.pinterest.base.Device;
import com.pinterest.kit.utils.IOUtils;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.service.PinUploader;

public class ApiClientHelper
{

    public static String a()
    {
        String s = "Pinterest for Android/%s (%s; %s)";
        if (Device.isTablet())
        {
            s = "Pinterest for Android Tablet/%s (%s; %s)";
        }
        String s2 = ApplicationInfo.getVersionName();
        String s1 = s2;
        if (ApplicationInfo.isNonProduction())
        {
            s1 = s2.split("-")[0];
        }
        return String.format(s, new Object[] {
            s1, Build.DEVICE, android.os.Build.VERSION.RELEASE
        });
    }

    public static void a(com.pinterest.api.remote.PinApi.PinSubmitParams pinsubmitparams, Activity activity)
    {
        IOUtils.writeFile(PinUploader.getPendingJsonFile(), pinsubmitparams.a().toString());
        if (activity != null)
        {
            activity.runOnUiThread(new _cls1(activity));
        }
    }

    private class _cls1
        implements Runnable
    {

        final Activity a;

        public final void run()
        {
            AppRater.registerEvent(a);
            Services.startPinUploaderService();
        }

        _cls1(Activity activity)
        {
            a = activity;
            super();
        }
    }

}

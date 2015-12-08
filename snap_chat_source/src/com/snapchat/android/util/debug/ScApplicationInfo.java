// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.debug;

import Bt;
import Lz;
import Pg;
import Pj;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import com.snapchat.android.Timber;

// Referenced classes of package com.snapchat.android.util.debug:
//            FeatureFlagManager

public class ScApplicationInfo extends ApplicationInfo
{

    public static int DEFAULT_VERSION_CODE = 0x7fffffff;
    public static String DEFAULT_VERSION_NAME = "";

    public static String a()
    {
        return "com.snapchat.android";
    }

    public static String a(Context context)
    {
        Object obj = Bt.q();
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("User agent: ").append(Pj.a()).append("\n");
        obj = stringbuilder.append((new StringBuilder("Snapchat Build : ")).append(b(context)).toString()).append("(").append((new StringBuilder()).append(Build.DEVICE).append(";").toString()).append((new StringBuilder()).append(Build.MODEL).append(";").toString()).append((new StringBuilder()).append(Build.MANUFACTURER).append(";").toString()).append((new StringBuilder("Version- ")).append(android.os.Build.VERSION.SDK_INT).append(") - ").append(((String) (obj))).append("\n").toString()).append((new StringBuilder("Connection type: ")).append(Pg.b()).append("\n").toString()).append((new StringBuilder("Using Square sandbox: ")).append(Lz.d()).append("\n").toString()).append((new StringBuilder("Release delay time: ")).append(Bt.bC()).append("\n").toString());
        StringBuilder stringbuilder1 = new StringBuilder("Chat V2 Enabled: ");
        FeatureFlagManager.a();
        if (FeatureFlagManager.b(FeatureFlagManager.FeatureFlag.CHAT_V2))
        {
            context = "YES";
        } else
        {
            context = "NO";
        }
        ((StringBuilder) (obj)).append(stringbuilder1.append(context).toString());
        context = Pg.a();
        if (context != null)
        {
            NetworkInfo networkinfo = Pg.a();
            boolean flag;
            if (networkinfo != null && networkinfo.isConnected() && networkinfo.getType() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                stringbuilder.append((new StringBuilder("Mobile network subtype: ")).append(context.getSubtypeName()).toString()).append("\n");
            }
        }
        if (!TextUtils.isEmpty(""))
        {
            stringbuilder.append("Git Branch: ");
        }
        if (!TextUtils.isEmpty(""))
        {
            stringbuilder.append("Git commit: ");
        }
        return stringbuilder.toString();
    }

    public static String b()
    {
        StringBuilder stringbuilder = (new StringBuilder("username: ")).append(Bt.q()).append("\nemail: ");
        Bt.a();
        return stringbuilder.append(Bt.S()).toString();
    }

    public static String b(Context context)
    {
        try
        {
            context = d(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Timber.c("ScApplicationInfo", "getPackageName failed.", new Object[0]);
            return DEFAULT_VERSION_NAME;
        }
        return ((PackageInfo) (context)).versionName;
    }

    public static int c(Context context)
    {
        try
        {
            context = d(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Timber.c("ScApplicationInfo", "getPackageName failed.", new Object[0]);
            return DEFAULT_VERSION_CODE;
        }
        return ((PackageInfo) (context)).versionCode;
    }

    public static PackageInfo d(Context context)
    {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
    }

}

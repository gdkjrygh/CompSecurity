// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.http.AndroidHttpClient;
import java.io.File;

// Referenced classes of package com.google.android.gms.internal:
//            lv, lp, ip, lr, 
//            ls, lu

public class d
{

    public static ip a(Context context)
    {
        return a(context, null);
    }

    public static ip a(Context context, lu lu)
    {
        Object obj;
        File file;
        file = new File(context.getCacheDir(), "volley");
        obj = "volley/0";
        String s = context.getPackageName();
        context = context.getPackageManager().getPackageInfo(s, 0);
        context = (new StringBuilder()).append(s).append("/").append(((PackageInfo) (context)).versionCode).toString();
        obj = context;
_L2:
        context = lu;
        if (lu == null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 9)
            {
                context = new lv();
            } else
            {
                context = new ls(AndroidHttpClient.newInstance(((String) (obj))));
            }
        }
        context = new lp(context);
        context = new ip(new lr(file), context);
        context.a();
        return context;
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }
}

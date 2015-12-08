// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.http.AndroidHttpClient;
import java.io.File;
import p.k.m;

// Referenced classes of package com.android.volley.toolbox:
//            g, a, c, d, 
//            f

public class k
{

    public static m a(Context context)
    {
        return a(context, null);
    }

    public static m a(Context context, f f)
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
        context = f;
        if (f == null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 9)
            {
                context = new g();
            } else
            {
                context = new d(AndroidHttpClient.newInstance(((String) (obj))));
            }
        }
        context = new a(context);
        context = new m(new c(file), context);
        context.a();
        return context;
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }
}

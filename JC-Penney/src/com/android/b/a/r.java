// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.b.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.http.AndroidHttpClient;
import com.android.b.t;
import java.io.File;

// Referenced classes of package com.android.b.a:
//            l, a, d, h, 
//            k

public class r
{

    public static t a(Context context)
    {
        return a(context, null);
    }

    public static t a(Context context, k k)
    {
        return a(context, k, -1);
    }

    public static t a(Context context, k k, int i)
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
        context = k;
        if (k == null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 9)
            {
                context = new l();
            } else
            {
                context = new h(AndroidHttpClient.newInstance(((String) (obj))));
            }
        }
        context = new a(context);
        if (i <= -1)
        {
            context = new t(new d(file), context);
        } else
        {
            context = new t(new d(file, i), context);
        }
        context.a();
        return context;
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }
}

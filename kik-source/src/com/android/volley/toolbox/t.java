// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.http.AndroidHttpClient;
import com.android.volley.p;
import java.io.File;

// Referenced classes of package com.android.volley.toolbox:
//            h, a, d, e

public final class t
{

    public static p a(Context context)
    {
        File file = new File(context.getCacheDir(), "volley");
        String s = "volley/0";
        try
        {
            String s1 = context.getPackageName();
            context = context.getPackageManager().getPackageInfo(s1, 0);
            context = (new StringBuilder()).append(s1).append("/").append(((PackageInfo) (context)).versionCode).toString();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = s;
        }
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            context = new h();
        } else
        {
            context = new e(AndroidHttpClient.newInstance(context));
        }
        context = new a(context);
        context = new p(new d(file), context);
        context.a();
        return context;
    }
}

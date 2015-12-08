// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley.toolbox;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.http.AndroidHttpClient;
import com.mopub.volley.RequestQueue;
import java.io.File;

// Referenced classes of package com.mopub.volley.toolbox:
//            HurlStack, BasicNetwork, DiskBasedCache, HttpClientStack, 
//            HttpStack

public class Volley
{

    public Volley()
    {
    }

    public static RequestQueue newRequestQueue(Context context)
    {
        return newRequestQueue(context, null);
    }

    public static RequestQueue newRequestQueue(Context context, HttpStack httpstack)
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
        context = httpstack;
        if (httpstack == null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 9)
            {
                context = new HurlStack();
            } else
            {
                context = new HttpClientStack(AndroidHttpClient.newInstance(((String) (obj))));
            }
        }
        context = new BasicNetwork(context);
        context = new RequestQueue(new DiskBasedCache(file), context);
        context.start();
        return context;
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.amobee.pulse3d:
//            Log

class Pulse3DCache
{

    static final String TAG = "Pulse3DCache";
    static String cacheDir = null;
    static boolean cacheDirExists = false;

    Pulse3DCache()
    {
    }

    static void clearAllCachedContent(Context context)
    {
        context = new File(getAmobeeCacheDirPath(context));
        File afile[] = context.listFiles();
        if (afile != null)
        {
            int j = afile.length;
            for (int i = 0; i < j; i++)
            {
                afile[i].delete();
            }

        }
        context.delete();
    }

    static void clearCacheOlderThan(Context context, int i)
    {
        context = (new File(getAmobeeCacheDirPath(context))).listFiles();
        if (context != null)
        {
            long l = TimeUnit.DAYS.toMillis(30L);
            long l1 = System.currentTimeMillis();
            int j = context.length;
            for (i = 0; i < j; i++)
            {
                File file = context[i];
                if (file.lastModified() < l1 - l)
                {
                    file.delete();
                }
            }

        }
    }

    static boolean createAmobeeCacheDir(Context context)
    {
        if (cacheDirExists)
        {
            return true;
        }
        context = new File(getAmobeeCacheDirPath(context));
        if (!context.exists())
        {
            if (!context.mkdir())
            {
                Log.e("Pulse3DCache", "Failed to create cache directory");
                return false;
            }
        } else
        {
            context = context.listFiles();
            for (int i = 0; i < context.length; i++)
            {
                Log.d("", (new StringBuilder()).append("file in cache:").append(context[i].getName()).toString());
            }

        }
        cacheDirExists = true;
        return true;
    }

    static String getAmobeeCacheDirPath(Context context)
    {
        if (cacheDir == null)
        {
            try
            {
                cacheDir = (new StringBuilder()).append(context.getCacheDir().getCanonicalPath()).append("/amobee").toString();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.e("Pulse3DCache", "Failed to get cache directory");
            }
        }
        return cacheDir;
    }

    static File getCachedAd(Context context, URL url)
    {
        context = new File(getAmobeeCacheDirPath(context), getEscapedCacheUrl(url));
        if (context.exists())
        {
            return context;
        } else
        {
            return null;
        }
    }

    static String getEscapedCacheUrl(URL url)
    {
        String s = url.getPath();
        String s1 = url.getQuery();
        url = s;
        if (s1 != null)
        {
            url = (new StringBuilder()).append(s).append("-").append(s1).toString();
        }
        return url.replace("/", "-").replace(".", "-");
    }

    static boolean isAdCached(Context context, URL url)
    {
        return getCachedAd(context, url) != null;
    }

}

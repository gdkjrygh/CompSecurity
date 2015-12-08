// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import java.io.File;

// Referenced classes of package android.support.v4.content:
//            ContextCompatKitKat, ContextCompatFroyo, ContextCompatHoneycomb, ContextCompatJellybean

public class ContextCompat
{

    private static final String DIR_ANDROID = "Android";
    private static final String DIR_CACHE = "cache";
    private static final String DIR_DATA = "data";
    private static final String DIR_FILES = "files";
    private static final String DIR_OBB = "obb";

    public ContextCompat()
    {
    }

    private static transient File buildPath(File file, String as[])
    {
        int j = as.length;
        int i = 0;
        while (i < j) 
        {
            String s = as[i];
            if (file == null)
            {
                file = new File(s);
            } else
            if (s != null)
            {
                file = new File(file, s);
            }
            i++;
        }
        return file;
    }

    public static File[] getExternalCacheDirs(Context context)
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 19)
        {
            return ContextCompatKitKat.getExternalCacheDirs(context);
        }
        if (i >= 8)
        {
            context = ContextCompatFroyo.getExternalCacheDir(context);
        } else
        {
            context = buildPath(Environment.getExternalStorageDirectory(), new String[] {
                "Android", "data", context.getPackageName(), "cache"
            });
        }
        return (new File[] {
            context
        });
    }

    public static File[] getExternalFilesDirs(Context context, String s)
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 19)
        {
            return ContextCompatKitKat.getExternalFilesDirs(context, s);
        }
        if (i >= 8)
        {
            context = ContextCompatFroyo.getExternalFilesDir(context, s);
        } else
        {
            context = buildPath(Environment.getExternalStorageDirectory(), new String[] {
                "Android", "data", context.getPackageName(), "files", s
            });
        }
        return (new File[] {
            context
        });
    }

    public static File[] getObbDirs(Context context)
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 19)
        {
            return ContextCompatKitKat.getObbDirs(context);
        }
        if (i >= 11)
        {
            context = ContextCompatHoneycomb.getObbDir(context);
        } else
        {
            context = buildPath(Environment.getExternalStorageDirectory(), new String[] {
                "Android", "obb", context.getPackageName()
            });
        }
        return (new File[] {
            context
        });
    }

    public static boolean startActivities(Context context, Intent aintent[])
    {
        return startActivities(context, aintent, null);
    }

    public static boolean startActivities(Context context, Intent aintent[], Bundle bundle)
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 16)
        {
            ContextCompatJellybean.startActivities(context, aintent, bundle);
            return true;
        }
        if (i >= 11)
        {
            ContextCompatHoneycomb.startActivities(context, aintent);
            return true;
        } else
        {
            return false;
        }
    }
}

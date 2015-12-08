// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Environment;
import android.os.Process;
import android.util.Log;
import java.io.File;

// Referenced classes of package android.support.v4.content:
//            ContextCompatApi23, ContextCompatApi21, ContextCompatKitKat, ContextCompatFroyo, 
//            ContextCompatHoneycomb, ContextCompatJellybean

public class ContextCompat
{

    private static final String DIR_ANDROID = "Android";
    private static final String DIR_CACHE = "cache";
    private static final String DIR_DATA = "data";
    private static final String DIR_FILES = "files";
    private static final String DIR_OBB = "obb";
    private static final String TAG = "ContextCompat";

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

    public static int checkSelfPermission(Context context, String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("permission is null");
        } else
        {
            return context.checkPermission(s, Process.myPid(), Process.myUid());
        }
    }

    private static File createFilesDir(File file)
    {
        android/support/v4/content/ContextCompat;
        JVM INSTR monitorenter ;
        File file1 = file;
        if (file.exists()) goto _L2; else goto _L1
_L1:
        file1 = file;
        if (file.mkdirs()) goto _L2; else goto _L3
_L3:
        boolean flag = file.exists();
        if (!flag) goto _L5; else goto _L4
_L4:
        file1 = file;
_L2:
        android/support/v4/content/ContextCompat;
        JVM INSTR monitorexit ;
        return file1;
_L5:
        Log.w("ContextCompat", (new StringBuilder("Unable to create files subdir ")).append(file.getPath()).toString());
        file1 = null;
        if (true) goto _L2; else goto _L6
_L6:
        file;
        throw file;
    }

    public static final int getColor(Context context, int i)
    {
        if (android.os.Build.VERSION.SDK_INT >= 23)
        {
            return ContextCompatApi23.getColor(context, i);
        } else
        {
            return context.getResources().getColor(i);
        }
    }

    public static final ColorStateList getColorStateList(Context context, int i)
    {
        if (android.os.Build.VERSION.SDK_INT >= 23)
        {
            return ContextCompatApi23.getColorStateList(context, i);
        } else
        {
            return context.getResources().getColorStateList(i);
        }
    }

    public static final Drawable getDrawable(Context context, int i)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            return ContextCompatApi21.getDrawable(context, i);
        } else
        {
            return context.getResources().getDrawable(i);
        }
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

    public final File getCodeCacheDir(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            return ContextCompatApi21.getCodeCacheDir(context);
        } else
        {
            return createFilesDir(new File(context.getApplicationInfo().dataDir, "code_cache"));
        }
    }

    public final File getNoBackupFilesDir(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            return ContextCompatApi21.getNoBackupFilesDir(context);
        } else
        {
            return createFilesDir(new File(context.getApplicationInfo().dataDir, "no_backup"));
        }
    }
}

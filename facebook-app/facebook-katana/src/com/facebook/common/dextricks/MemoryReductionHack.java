// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.dextricks;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.zip.ZipFile;

public final class MemoryReductionHack
{

    public MemoryReductionHack()
    {
    }

    private static Object a(BaseDexClassLoader basedexclassloader)
    {
        return a(basedexclassloader, dalvik/system/BaseDexClassLoader, "pathList");
    }

    private static Object a(Object obj)
    {
        return a(obj, obj.getClass(), "dexElements");
    }

    private static Object a(Object obj, Class class1, String s)
    {
        class1 = class1.getDeclaredField(s);
        class1.setAccessible(true);
        return class1.get(obj);
    }

    public static void a(Context context)
    {
        Object obj = context.getPackageManager();
        obj = ((PackageManager) (obj)).getApplicationInfo(context.getPackageName(), 0);
        context = context.getClassLoader();
        if (context instanceof PathClassLoader)
        {
            c(((ApplicationInfo) (obj)).sourceDir, (PathClassLoader)context);
            return;
        }
        try
        {
            Log.w("MemoryReductionHack", "system classloader of unexpected type");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("MemoryReductionHack", "Couldn't retrieve the application info", context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("MemoryReductionHack", "Couldn't update the Loader", context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("MemoryReductionHack", "Couldn't update the Loader", context);
        }
        return;
    }

    private static void a(Object obj, Class class1, String s, Object obj1)
    {
        class1 = class1.getDeclaredField(s);
        class1.setAccessible(true);
        class1.set(obj, obj1);
    }

    private static void a(String s, PathClassLoader pathclassloader)
    {
        String as[] = (String[])(String[])a(pathclassloader, dalvik/system/PathClassLoader, "mPaths");
        for (int i = 0; i < as.length; i++)
        {
            if (as[i].equals(s))
            {
                ((ZipFile[])(ZipFile[])a(pathclassloader, dalvik/system/PathClassLoader, "mZips"))[i] = null;
            }
        }

    }

    private static void b(String s, PathClassLoader pathclassloader)
    {
        pathclassloader = ((PathClassLoader) (a(a(pathclassloader))));
        int j = Array.getLength(pathclassloader);
        for (int i = 0; i < j; i++)
        {
            Object obj = Array.get(pathclassloader, i);
            File file = (File)a(obj, obj.getClass(), "file");
            ZipFile zipfile = (ZipFile)a(obj, obj.getClass(), "zipFile");
            if (file != null && s.equals(file.getPath()))
            {
                if (zipfile != null)
                {
                    a(obj, obj.getClass(), "zipFile", null);
                    (new StringBuilder("Zeroed out zipFile entry corresponding to path ")).append(s);
                }
                if (android.os.Build.VERSION.SDK_INT >= 18)
                {
                    a(obj, obj.getClass(), "initialized", Boolean.valueOf(true));
                    (new StringBuilder("Marked as initialized entry corresponding to path ")).append(s);
                }
                return;
            }
        }

        Log.w("MemoryReductionHack", (new StringBuilder("Could not find zipFile entry corresponding to path ")).append(s).toString());
    }

    private static void c(String s, PathClassLoader pathclassloader)
    {
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            a(s, pathclassloader);
            return;
        } else
        {
            b(s, pathclassloader);
            return;
        }
    }
}

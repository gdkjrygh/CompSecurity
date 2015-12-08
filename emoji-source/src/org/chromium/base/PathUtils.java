// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Environment;
import java.io.File;

public abstract class PathUtils
{

    private static String sDataDirectorySuffix;

    private PathUtils()
    {
    }

    public static String getCacheDirectory(Context context)
    {
        return context.getCacheDir().getPath();
    }

    public static String getDataDirectory(Context context)
    {
        if (sDataDirectorySuffix == null)
        {
            throw new IllegalStateException("setDataDirectorySuffix must be called before getDataDirectory");
        } else
        {
            return context.getDir(sDataDirectorySuffix, 0).getPath();
        }
    }

    public static String getDatabaseDirectory(Context context)
    {
        return context.getDatabasePath("foo").getParent();
    }

    private static String getDownloadsDirectory(Context context)
    {
        return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
    }

    public static String getExternalStorageDirectory()
    {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    private static String getNativeLibraryDirectory(Context context)
    {
        context = context.getApplicationInfo();
        if ((((ApplicationInfo) (context)).flags & 0x80) != 0 || (((ApplicationInfo) (context)).flags & 1) == 0)
        {
            return ((ApplicationInfo) (context)).nativeLibraryDir;
        } else
        {
            return "/system/lib/";
        }
    }

    public static void setPrivateDataDirectorySuffix(String s)
    {
        sDataDirectorySuffix = s;
    }
}

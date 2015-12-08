// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;

public class DirectoryManager
{

    private static final String LOG_TAG = "DirectoryManager";

    public DirectoryManager()
    {
    }

    private static File constructFilePaths(String s, String s1)
    {
        if (s1.startsWith(s))
        {
            return new File(s1);
        } else
        {
            return new File((new StringBuilder()).append(s).append("/").append(s1).toString());
        }
    }

    private static long freeSpaceCalculation(String s)
    {
        s = new StatFs(s);
        long l = s.getBlockSize();
        return ((long)s.getAvailableBlocks() * l) / 1024L;
    }

    public static long getFreeDiskSpace(boolean flag)
    {
        long l;
        if (Environment.getExternalStorageState().equals("mounted"))
        {
            l = freeSpaceCalculation(Environment.getExternalStorageDirectory().getPath());
        } else
        if (flag)
        {
            l = freeSpaceCalculation("/");
        } else
        {
            return -1L;
        }
        return l;
    }

    public static String getTempDirectoryPath(Context context)
    {
        if (Environment.getExternalStorageState().equals("mounted"))
        {
            context = new File((new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/Android/data/").append(context.getPackageName()).append("/cache/").toString());
        } else
        {
            context = context.getCacheDir();
        }
        if (!context.exists())
        {
            context.mkdirs();
        }
        return context.getAbsolutePath();
    }

    public static boolean testFileExists(String s)
    {
        if (testSaveLocationExists() && !s.equals(""))
        {
            return constructFilePaths(Environment.getExternalStorageDirectory().toString(), s).exists();
        } else
        {
            return false;
        }
    }

    public static boolean testSaveLocationExists()
    {
        return Environment.getExternalStorageState().equals("mounted");
    }
}

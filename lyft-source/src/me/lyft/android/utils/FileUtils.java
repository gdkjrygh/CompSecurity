// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;

public class FileUtils
{

    public FileUtils()
    {
    }

    public static String getTempDirectoryPath(Context context)
    {
        File file;
label0:
        {
            Object obj = null;
            if (!"mounted".equals(Environment.getExternalStorageState()))
            {
                file = obj;
                if (isExternalStorageRemovable())
                {
                    break label0;
                }
            }
            File file2 = context.getExternalCacheDir();
            file = obj;
            if (file2 != null)
            {
                file = obj;
                if (getUsableSpace(file2.getAbsolutePath()) > 0L)
                {
                    file = file2;
                }
            }
        }
        File file1 = file;
        if (file == null)
        {
            file1 = context.getCacheDir();
        }
        if (!file1.exists())
        {
            file1.mkdirs();
        }
        return file1.getAbsolutePath();
    }

    public static File getTemporaryFile(Context context, String s)
    {
        return new File(getTempDirectoryPath(context), s);
    }

    public static long getUsableSpace(String s)
    {
        int i;
        long l;
        try
        {
            s = new StatFs(s);
            l = s.getBlockSize();
            i = s.getAvailableBlocks();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0L;
        }
        return (long)i * l;
    }

    public static boolean isExternalStorageRemovable()
    {
        return Environment.isExternalStorageRemovable();
    }
}

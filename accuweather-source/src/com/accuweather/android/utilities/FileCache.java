// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import android.content.Context;
import android.os.Environment;
import java.io.File;

// Referenced classes of package com.accuweather.android.utilities:
//            Logger

public class FileCache
{

    private static final String ALTERNATE_SDCARD_MOUNTS[] = {
        "/emmc", "/sdcard/ext_sd", "/sdcard-ext", "/sdcard/sd", "/sdcard/sdcard", "/mnt/media"
    };
    private static final String ARCHOS_PATH = "/sdcard/sdcard";
    private static final String EMMC_PATH = "/emmc";
    private static final String EXT_STORAGE_ROOT_PREFIX = "/Android/data/";
    private static final String EXT_STORAGE_ROOT_SUFFIX = "/files/";
    private static final String HTC_PATH = "/sdcard/ext_sd";
    private static final String MOTOROLA_PATH = "/sdcard-ext";
    private static final String NOOK_COLOR = "/mnt/media";
    private static final String OLDER_SAMSUNG_PATH = "/sdcard/sd";
    private File cacheDir;

    public FileCache(Context context)
    {
        if (!Environment.getExternalStorageState().equals("mounted")) goto _L2; else goto _L1
_L1:
        cacheDir = context.getExternalCacheDir();
        if (cacheDir == null)
        {
            cacheDir = new File(Environment.getExternalStorageDirectory(), "AccuWeatherCache");
        }
_L3:
        if (!cacheDir.exists())
        {
            cacheDir.mkdirs();
            return;
        }
        break MISSING_BLOCK_LABEL_101;
_L2:
label0:
        {
            if (getAlternateExternalStoragePath(context) == null)
            {
                break label0;
            }
            cacheDir = new File(getAlternateExternalStoragePath(context));
        }
          goto _L3
        try
        {
            cacheDir = context.getCacheDir();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
          goto _L3
    }

    private static File buildCacheDirPath(Context context, File file)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("/Android/data/");
        stringbuilder.append(context.getPackageName());
        stringbuilder.append("/files/");
        return new File(file, stringbuilder.toString());
    }

    private static String getAlternateExternalStoragePath(Context context)
    {
        Object obj;
        int i;
        obj = null;
        i = 0;
_L2:
        File file = obj;
        if (i < ALTERNATE_SDCARD_MOUNTS.length)
        {
            file = new File(ALTERNATE_SDCARD_MOUNTS[i]);
            if (!file.exists() || !file.isDirectory() || !file.canRead() || !file.canWrite())
            {
                break MISSING_BLOCK_LABEL_118;
            }
            file = buildCacheDirPath(context, file);
        }
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        if (!file.exists() && !file.mkdirs())
        {
            return null;
        }
        context = file.getAbsolutePath();
        return context;
        context;
        Logger.d(com/accuweather/android/utilities/FileCache.getName(), (new StringBuilder()).append("Error in getAlternateExternalStoragePath(): ").append(context).toString());
        return null;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private String getUniqueFilename(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("The url cannot be null.");
        } else
        {
            return String.valueOf(s.hashCode());
        }
    }

    public void clear()
    {
        File afile[] = cacheDir.listFiles();
        int j = afile.length;
        for (int i = 0; i < j; i++)
        {
            afile[i].delete();
        }

    }

    public File getCacheDir()
    {
        return cacheDir;
    }

    public File getFile(String s)
    {
        return new File(cacheDir, s);
    }

    public File getFileWithUniqueName(String s)
    {
        return new File(cacheDir, getUniqueFilename(s));
    }

}

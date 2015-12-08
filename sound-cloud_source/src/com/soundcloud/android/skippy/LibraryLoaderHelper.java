// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.skippy;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

// Referenced classes of package com.soundcloud.android.skippy:
//            UnzipUtil, SkippyLibrary

public class LibraryLoaderHelper
{

    private static final String MANUAL_LIB_POSTFIX = ".1";
    private static final String SO_FILE_PATH;
    private final UnzipUtil unzipUtil = new UnzipUtil();

    public LibraryLoaderHelper()
    {
    }

    private void extractAndLoadLibFromApkTo(Context context, String s, String s1)
        throws IOException
    {
        File file = new File(s1, (new StringBuilder()).append(s).append(".1").toString());
        String s2 = String.format(Locale.US, SO_FILE_PATH, new Object[] {
            s
        });
        file.delete();
        unzipUtil.extractFile(context.getApplicationInfo().sourceDir, s2, s1, (new StringBuilder()).append(s).append(".1").toString());
        System.load(file.getAbsolutePath());
    }

    void extractAndLoadLibFromApk(Context context, String s)
        throws IOException
    {
        try
        {
            extractAndLoadLibFromApkTo(context, s, context.getFilesDir().toString());
            return;
        }
        catch (IOException ioexception)
        {
            File file = context.getExternalCacheDir();
            if (file != null)
            {
                extractAndLoadLibFromApkTo(context, s, file.toString());
                return;
            } else
            {
                throw ioexception;
            }
        }
    }

    public void load(Context context, SkippyLibrary skippylibrary)
        throws IOException
    {
        try
        {
            System.loadLibrary(skippylibrary.getLibraryName());
            return;
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror) { }
        catch (NoSuchFieldError nosuchfielderror) { }
        catch (NoSuchMethodError nosuchmethoderror) { }
        catch (NoClassDefFoundError noclassdeffounderror) { }
        (new StringBuilder("exception while loading native library ")).append(skippylibrary.getLibraryName()).append(". Extracting from apk.");
        extractAndLoadLibFromApk(context, skippylibrary.getFileName());
    }

    static 
    {
        SO_FILE_PATH = (new StringBuilder("lib/")).append(Build.CPU_ABI).append("/%s").toString();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crittercism.app;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class CrittercismNDK
{

    private static final String LIBNAME = "libcrittercism-ndk.so";
    private static final int LIBRARY_VERSION = 2;

    public CrittercismNDK()
    {
    }

    public static native boolean checkLibraryVersion(int i);

    public static boolean doNdkSharedLibrariesExist(Context context)
    {
        try
        {
            getJarredLibFileStream(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return true;
    }

    public static File getInstalledLibraryFile(Context context)
    {
        context = (new StringBuilder()).append(context.getFilesDir().getAbsolutePath()).append("/com.crittercism/lib/").toString();
        return new File((new StringBuilder()).append(context).append("libcrittercism-ndk.so").toString());
    }

    public static InputStream getJarredLibFileStream(Context context)
    {
        String s = "armeabi";
        if (System.getProperty("os.arch").contains("v7"))
        {
            s = (new StringBuilder()).append("armeabi").append("-v7a").toString();
        }
        return context.getAssets().open((new StringBuilder()).append(s).append("/libcrittercism-ndk.so").toString());
    }

    public static boolean installLib(Context context, File file)
    {
        if (file.exists())
        {
            return true;
        }
        byte abyte0[];
        file.getParentFile().mkdirs();
        file = new FileOutputStream(file);
        context = getJarredLibFileStream(context);
        abyte0 = new byte[8192];
_L1:
        int i = context.read(abyte0);
label0:
        {
            if (i < 0)
            {
                break label0;
            }
            try
            {
                file.write(abyte0, 0, i);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.e("Crittercism", (new StringBuilder("Could not install breakpad library: ")).append(context.toString()).toString());
                return false;
            }
        }
          goto _L1
        context.close();
        file.close();
        return true;
    }

    public static native boolean installNdk(String s);

    public static void installNdkLib(Context context, String s)
    {
        boolean flag;
        s = (new StringBuilder()).append(context.getFilesDir().getAbsolutePath()).append("/").append(s).toString();
        flag = false;
        if (doNdkSharedLibrariesExist(context)) goto _L2; else goto _L1
_L1:
        Log.e("Crittercism", "Trying to install Crittercism ndk on an sdkonly library");
_L4:
        return;
_L2:
        File file = getInstalledLibraryFile(context);
        if (!installLib(context, file)) goto _L4; else goto _L3
_L3:
        boolean flag1;
        System.load(file.getAbsolutePath());
        flag1 = checkLibraryVersion(2);
        flag = flag1;
_L7:
        if (flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!installLib(context, file)) goto _L4; else goto _L5
_L5:
        try
        {
            System.load(file.getAbsolutePath());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("Crittercism", (new StringBuilder("Unable to load breakpad")).append(context.toString()).toString());
            return;
        }
        if (!installNdk(s)) goto _L4; else goto _L6
_L6:
        context = new File(s);
        context.getAbsolutePath();
        context.mkdirs();
        return;
        context;
        return;
        Throwable throwable;
        throwable;
          goto _L7
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crittercism.app;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class CrittercismNDK
{

    public static void a(Context context, String s)
    {
        s = (new StringBuilder()).append(context.getFilesDir().getAbsolutePath()).append("/").append(s).toString();
        if (!b(context)) goto _L2; else goto _L1
_L1:
        boolean flag = a(context);
_L7:
        if (flag) goto _L4; else goto _L3
_L3:
        return;
_L2:
        try
        {
            System.loadLibrary("crittercism-v3");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        flag = true;
        continue; /* Loop/switch isn't completed */
_L4:
        if (!installNdk(s)) goto _L3; else goto _L5
_L5:
        (new File(s)).mkdirs();
        return;
        context;
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static boolean a(Context context)
    {
        File file1 = new File(context.getFilesDir(), "/com.crittercism/lib/");
        File file = new File(file1, "libcrittercism-v3.so");
        file1 = new File(file1, "libcrittercism-ndk.so");
        if (!file.exists())
        {
            if (!a(context, file))
            {
                file.delete();
                return false;
            }
            file1.delete();
        }
        try
        {
            System.load(file.getAbsolutePath());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            file.delete();
            return false;
        }
        return true;
    }

    private static boolean a(Context context, File file)
    {
        byte abyte0[];
        file.getParentFile().mkdirs();
        file = new FileOutputStream(file);
        context = c(context);
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
                (new StringBuilder("Could not install breakpad library: ")).append(context.toString());
                return false;
            }
        }
          goto _L1
        context.close();
        file.close();
        return true;
    }

    private static boolean b(Context context)
    {
        try
        {
            c(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return true;
    }

    private static InputStream c(Context context)
    {
        String s = "armeabi";
        if (System.getProperty("os.arch").contains("v7"))
        {
            s = (new StringBuilder()).append("armeabi").append("-v7a").toString();
        }
        return context.getAssets().open((new StringBuilder()).append(s).append("/libcrittercism-v3.so").toString());
    }

    public static native boolean installNdk(String s);
}

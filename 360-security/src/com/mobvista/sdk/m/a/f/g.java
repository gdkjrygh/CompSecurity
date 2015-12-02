// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.f;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;

public final class g
{

    static boolean a = false;
    static String b = "";

    public static void a(Context context)
    {
        b = (new StringBuilder()).append(context.getFilesDir().getAbsolutePath()).append(File.separator).toString();
        if (context.getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", context.getPackageName()) == 0)
        {
            a = true;
            return;
        }
        try
        {
            a = false;
            return;
        }
        catch (Exception exception)
        {
            b = (new StringBuilder()).append(context.getFilesDir().getAbsolutePath()).append(File.separator).toString();
        }
        return;
    }

    public static boolean a()
    {
        return a;
    }

    public static String b()
    {
        return b;
    }

    public static boolean c()
    {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static boolean d()
    {
        return e() > 0x1e00000L;
    }

    private static long e()
    {
        long l = 0L;
        if (c())
        {
            int i;
            try
            {
                StatFs statfs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                l = statfs.getBlockSize();
                i = statfs.getAvailableBlocks();
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
                return 0L;
            }
            l = (long)i * l;
        }
        return l;
    }

}

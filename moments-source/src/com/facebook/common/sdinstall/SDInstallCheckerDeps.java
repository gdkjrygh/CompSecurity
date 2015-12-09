// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.sdinstall;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;

public class SDInstallCheckerDeps
{

    public SDInstallCheckerDeps()
    {
    }

    static int a(Context context)
    {
        return context.getApplicationInfo().flags;
    }

    static StatFs a(String s)
    {
        return new StatFs(s);
    }

    static String a()
    {
        return Environment.getDataDirectory().getPath();
    }

    static String b()
    {
        return Environment.getExternalStorageDirectory().getPath();
    }
}

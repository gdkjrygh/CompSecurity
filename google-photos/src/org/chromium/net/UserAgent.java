// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Locale;

public final class UserAgent
{

    private static final Object a = new Object();
    private static int b = 0;

    private UserAgent()
    {
    }

    public static String a(Context context)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(context.getPackageName());
        stringbuilder.append('/');
        stringbuilder.append(b(context));
        stringbuilder.append(" (Linux; U; Android ");
        stringbuilder.append(android.os.Build.VERSION.RELEASE);
        stringbuilder.append("; ");
        stringbuilder.append(Locale.getDefault().toString());
        context = Build.MODEL;
        if (context.length() > 0)
        {
            stringbuilder.append("; ");
            stringbuilder.append(context);
        }
        context = Build.ID;
        if (context.length() > 0)
        {
            stringbuilder.append("; Build/");
            stringbuilder.append(context);
        }
        stringbuilder.append("; Cronet/");
        stringbuilder.append("47.0.2526.24");
        stringbuilder.append(')');
        return stringbuilder.toString();
    }

    private static int b(Context context)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        PackageManager packagemanager;
        if (b != 0)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        packagemanager = context.getPackageManager();
        context = context.getPackageName();
        b = packagemanager.getPackageInfo(context, 0).versionCode;
        int i = b;
        return i;
        context;
        throw new IllegalStateException("Cannot determine package version");
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

}

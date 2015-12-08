// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;

// Referenced classes of package com.microsoft.onlineid.internal:
//            e

public final class l
{

    public static int a(Context context)
    {
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            e.a(false);
            return 0;
        }
        return i;
    }

    public static Signature[] a(Context context, String s)
    {
        try
        {
            context = context.getPackageManager().getPackageInfo(s, 64).signatures;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            e.a(false);
            return new Signature[0];
        }
        return context;
    }

    public static String b(Context context)
    {
        try
        {
            context = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            e.a(false);
            return "";
        }
        return context;
    }
}

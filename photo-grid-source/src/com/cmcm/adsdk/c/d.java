// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import java.nio.charset.Charset;

public final class d
{

    public static final Charset a = Charset.forName("US-ASCII");
    public static final Charset b = Charset.forName("UTF-8");

    public static int a()
    {
        int i;
        try
        {
            i = android.os.Build.VERSION.SDK_INT;
        }
        catch (Exception exception)
        {
            return 0;
        }
        return i;
    }

    public static boolean a(Context context)
    {
        if (context == null)
        {
            return false;
        }
        context = (PowerManager)context.getSystemService("power");
        if (context != null)
        {
            return context.isScreenOn();
        } else
        {
            return false;
        }
    }

    public static boolean a(Context context, String s)
    {
        if (context == null || s == null)
        {
            return false;
        }
        try
        {
            context.getPackageManager().getPackageInfo(s, 256);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return true;
    }

}

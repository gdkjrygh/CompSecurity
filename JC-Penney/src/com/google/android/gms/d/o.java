// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.d;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.regex.Pattern;

public final class o
{

    private static Pattern a = null;

    public static int a(int i)
    {
        return i / 1000;
    }

    public static boolean a(Context context)
    {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static int b(int i)
    {
        return (i % 1000) / 100;
    }

    public static boolean c(int i)
    {
        return b(i) == 3;
    }

}

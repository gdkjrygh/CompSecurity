// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.regex.Pattern;

public final class c
{

    private static Pattern XH = null;

    public static boolean M(Context context)
    {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    private static int dA(int i)
    {
        return (i % 1000) / 100;
    }

    public static boolean dB(int i)
    {
        return dA(i) == 3;
    }

    public static int dz(int i)
    {
        return i / 1000;
    }

}

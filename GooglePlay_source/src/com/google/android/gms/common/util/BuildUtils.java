// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.regex.Pattern;

public final class BuildUtils
{

    private static Pattern sBuildNumberPattern = null;

    public static boolean isWearable(Context context)
    {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static int parseBuildVersion(int i)
    {
        return i / 1000;
    }

}

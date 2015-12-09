// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public final class PlayUtils
{

    private static final Pattern COMMA_PATTERN = Pattern.compile(",");
    private static final String EMPTY_ARRAY[] = new String[0];

    public static String getDefaultUserAgentString(Context context)
    {
        StringBuilder stringbuilder = new StringBuilder("Android/");
        try
        {
            context = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            stringbuilder.append(((PackageInfo) (context)).packageName);
            stringbuilder.append("/");
            stringbuilder.append(((PackageInfo) (context)).versionCode);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.wtf("PlayUtils", context.getMessage(), context);
        }
        return stringbuilder.toString();
    }

    public static boolean isTestDevice()
    {
        String s = Build.TAGS;
        Object obj;
        if (s == null || s.length() == 0)
        {
            obj = EMPTY_ARRAY;
        } else
        if (s.indexOf(',') == -1)
        {
            obj = new String[1];
            obj[0] = s;
        } else
        {
            obj = COMMA_PATTERN.split(s);
        }
        obj = Arrays.asList(((Object []) (obj)));
        return ((List) (obj)).contains("dev-keys") || ((List) (obj)).contains("test-keys");
    }

    public static boolean isTv(Context context)
    {
        context = context.getPackageManager();
        return context.hasSystemFeature("com.google.android.tv") || context.hasSystemFeature("android.hardware.type.television");
    }

}

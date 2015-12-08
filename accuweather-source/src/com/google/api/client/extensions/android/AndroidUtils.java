// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.extensions.android;

import com.google.api.client.util.Preconditions;

public class AndroidUtils
{

    private AndroidUtils()
    {
    }

    public static void checkMinimumSdkLevel(int i)
    {
        Preconditions.checkArgument(isMinimumSdkLevel(i), "running on Android SDK level %s but requires minimum %s", new Object[] {
            Integer.valueOf(android.os.Build.VERSION.SDK_INT), Integer.valueOf(i)
        });
    }

    public static boolean isMinimumSdkLevel(int i)
    {
        return android.os.Build.VERSION.SDK_INT >= i;
    }
}

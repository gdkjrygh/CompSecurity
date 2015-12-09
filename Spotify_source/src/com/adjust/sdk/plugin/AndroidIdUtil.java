// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk.plugin;

import android.content.Context;

public class AndroidIdUtil
{

    public AndroidIdUtil()
    {
    }

    public static String getAndroidId(Context context)
    {
        return android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
    }
}

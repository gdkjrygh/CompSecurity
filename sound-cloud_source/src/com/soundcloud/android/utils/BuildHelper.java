// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.os.Build;

public class BuildHelper
{

    public BuildHelper()
    {
    }

    public String getAndroidReleaseVersion()
    {
        return android.os.Build.VERSION.RELEASE;
    }

    public String getManufacturer()
    {
        return Build.MANUFACTURER;
    }

    public String getModel()
    {
        return Build.MODEL;
    }
}

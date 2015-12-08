// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration;

import android.content.SharedPreferences;

public class DeviceManagementStorage
{

    static final String DEVICE_CONFLICT = "device_conflict";
    private final SharedPreferences sharedPreferences;

    public DeviceManagementStorage(SharedPreferences sharedpreferences)
    {
        sharedPreferences = sharedpreferences;
    }

    public void clearDeviceConflict()
    {
        sharedPreferences.edit().putBoolean("device_conflict", false).apply();
    }

    public boolean hadDeviceConflict()
    {
        return sharedPreferences.getBoolean("device_conflict", false);
    }

    public void setDeviceConflict()
    {
        sharedPreferences.edit().putBoolean("device_conflict", true).apply();
    }
}

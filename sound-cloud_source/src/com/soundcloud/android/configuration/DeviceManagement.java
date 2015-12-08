// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration;


public class DeviceManagement
{

    private final boolean authorized;
    private final String conflictingDeviceId;

    public DeviceManagement(boolean flag, String s)
    {
        authorized = flag;
        conflictingDeviceId = s;
    }

    public String getConflictingDeviceId()
    {
        return conflictingDeviceId;
    }

    public boolean isNotAuthorized()
    {
        return !authorized;
    }
}

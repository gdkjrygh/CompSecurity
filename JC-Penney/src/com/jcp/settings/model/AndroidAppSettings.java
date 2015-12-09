// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.settings.model;


public class AndroidAppSettings
{

    private String currentVersion;
    private String minimumVersion;

    public AndroidAppSettings()
    {
        minimumVersion = null;
        currentVersion = null;
    }

    public String getCurrentVersion()
    {
        return currentVersion;
    }

    public String getMinimumVersion()
    {
        return minimumVersion;
    }

    public void setCurrentVersion(String s)
    {
        currentVersion = s;
    }

    public void setMinimumVersion(String s)
    {
        minimumVersion = s;
    }
}

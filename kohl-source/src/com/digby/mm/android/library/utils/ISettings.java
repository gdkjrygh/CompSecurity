// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.utils;


public interface ISettings
{

    public abstract String getAPIVersion();

    public abstract String getAndroidVersion();

    public abstract String getAppID();

    public abstract String getBrandCode();

    public abstract int getSearchRadiusInMeters();

    public abstract String getServer();

    public abstract String getServerPort();

    public abstract boolean phoneHasLocationServicesEnabled();
}

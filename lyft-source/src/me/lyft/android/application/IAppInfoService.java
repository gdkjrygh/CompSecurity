// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import me.lyft.android.infrastructure.lyft.constants.AppInfo;
import rx.Observable;

public interface IAppInfoService
{

    public abstract Observable loadAppInfo(String s);

    public abstract Observable observeAppInfo();

    public abstract void updateAppInfo(AppInfo appinfo);
}

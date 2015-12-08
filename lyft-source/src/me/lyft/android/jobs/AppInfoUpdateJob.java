// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import me.lyft.android.application.IAppInfoService;
import me.lyft.android.infrastructure.lyft.constants.AppInfo;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class AppInfoUpdateJob
    implements Job
{

    private final AppInfo appInfo;
    IAppInfoService appInfoService;

    public AppInfoUpdateJob(AppInfo appinfo)
    {
        appInfo = appinfo;
    }

    public void execute()
    {
        appInfoService.updateAppInfo(appInfo);
    }
}

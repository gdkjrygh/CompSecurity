// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import me.lyft.android.application.IAppInfoService;
import me.lyft.android.rx.SimpleSubscriber;
import rx.Observable;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class LoadAppInfoJob
    implements Job
{

    IAppInfoService appInfoService;
    private String deepLink;

    public LoadAppInfoJob(String s)
    {
        deepLink = s;
    }

    public void execute()
    {
        appInfoService.loadAppInfo(deepLink).subscribe(new SimpleSubscriber());
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import me.lyft.android.ILyftPreferences;
import me.lyft.android.infrastructure.lyft.constants.AppInfo;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.application:
//            AppInfoService

class this._cls0
    implements Action1
{

    final AppInfoService this$0;

    public volatile void call(Object obj)
    {
        call((AppInfo)obj);
    }

    public void call(AppInfo appinfo)
    {
        updateAppInfo(appinfo);
        AppInfoService.access$000(AppInfoService.this).setInstallReferrer(null);
    }

    .AppInfo()
    {
        this$0 = AppInfoService.this;
        super();
    }
}

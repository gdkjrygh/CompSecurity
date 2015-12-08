// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import me.lyft.android.domain.location.Location;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application:
//            AppInfoService

class val.deepLink
    implements Func1
{

    final AppInfoService this$0;
    final String val$deepLink;

    public volatile Object call(Object obj)
    {
        return call((Location)obj);
    }

    public Observable call(Location location)
    {
        return AppInfoService.access$100(AppInfoService.this).getAppInfo(location.getLat().doubleValue(), location.getLng().doubleValue(), val$deepLink);
    }

    ()
    {
        this$0 = final_appinfoservice;
        val$deepLink = String.this;
        super();
    }
}

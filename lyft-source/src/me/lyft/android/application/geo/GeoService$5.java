// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.geo;

import rx.functions.Action1;

// Referenced classes of package me.lyft.android.application.geo:
//            GeoService, IEtaAnalyticService

class this._cls0
    implements Action1
{

    final GeoService this$0;

    public void call(Long long1)
    {
        GeoService.access$000(GeoService.this).record(Boolean.valueOf(true), long1);
    }

    public volatile void call(Object obj)
    {
        call((Long)obj);
    }

    ervice()
    {
        this$0 = GeoService.this;
        super();
    }
}

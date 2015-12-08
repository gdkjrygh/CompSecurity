// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.geo;

import rx.functions.Action1;

// Referenced classes of package me.lyft.android.application.geo:
//            GeoService, CachedEta, IEtaAnalyticService

class val.currentRideId
    implements Action1
{

    final GeoService this$0;
    final String val$currentRideId;

    public void call(Long long1)
    {
        GeoService.access$102(GeoService.this, new CachedEta(Long.valueOf(System.currentTimeMillis()), long1, val$currentRideId));
        GeoService.access$000(GeoService.this).record(Boolean.valueOf(false), long1);
    }

    public volatile void call(Object obj)
    {
        call((Long)obj);
    }

    ervice()
    {
        this$0 = final_geoservice;
        val$currentRideId = String.this;
        super();
    }
}

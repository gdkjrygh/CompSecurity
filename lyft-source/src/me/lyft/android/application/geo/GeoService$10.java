// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.geo;

import java.util.List;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.application.geo:
//            GeoService, CachedDirections

class val.route
    implements Action1
{

    final GeoService this$0;
    final String val$id;
    final List val$route;

    public volatile void call(Object obj)
    {
        call((List)obj);
    }

    public void call(List list)
    {
        GeoService.access$202(GeoService.this, new CachedDirections(System.currentTimeMillis(), val$id, val$route, list));
    }

    ns()
    {
        this$0 = final_geoservice;
        val$id = s;
        val$route = List.this;
        super();
    }
}

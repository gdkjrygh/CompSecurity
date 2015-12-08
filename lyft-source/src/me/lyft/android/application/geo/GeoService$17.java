// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.geo;

import me.lyft.android.domain.geo.Leg;
import me.lyft.android.domain.location.SphericalUtils;
import rx.functions.Func2;

// Referenced classes of package me.lyft.android.application.geo:
//            GeoService

class this._cls0
    implements Func2
{

    final GeoService this$0;

    public volatile Object call(Object obj, Object obj1)
    {
        return call((Leg)obj, (me.lyft.android.infrastructure.googlegeo..Leg.Step)obj1);
    }

    public Leg call(Leg leg, me.lyft.android.infrastructure.googlegeo..Leg.Step step)
    {
        leg.addPositions(SphericalUtils.decodeOverviewPolyLineToLatLngs(step.getPolyline()));
        return leg;
    }

    eRouteDTO.Leg.Step()
    {
        this$0 = GeoService.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.geo;

import java.util.List;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.geo:
//            GeoService

class this._cls0
    implements Func1
{

    final GeoService this$0;

    public volatile Object call(Object obj)
    {
        return call((me.lyft.android.infrastructure.googlegeo..Leg)obj);
    }

    public List call(me.lyft.android.infrastructure.googlegeo..Leg leg)
    {
        return leg.getSteps();
    }

    eRouteDTO.Leg()
    {
        this$0 = GeoService.this;
        super();
    }
}

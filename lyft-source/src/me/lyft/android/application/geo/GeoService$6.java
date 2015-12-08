// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.geo;

import me.lyft.android.domain.location.Location;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.geo:
//            GeoService

class this._cls0
    implements Func1
{

    final GeoService this$0;

    public volatile Object call(Object obj)
    {
        return call((Location)obj);
    }

    public String call(Location location)
    {
        return location.toQueryString();
    }

    ()
    {
        this$0 = GeoService.this;
        super();
    }
}

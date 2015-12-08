// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.location;

import me.lyft.android.domain.location.Location;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.infrastructure.location:
//            LocationService

class this._cls0
    implements Action1
{

    final LocationService this$0;

    public volatile void call(Object obj)
    {
        call((Location)obj);
    }

    public void call(Location location)
    {
        LocationService.access$002(LocationService.this, location);
    }

    ()
    {
        this$0 = LocationService.this;
        super();
    }
}

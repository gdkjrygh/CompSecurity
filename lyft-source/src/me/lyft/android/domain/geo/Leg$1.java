// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.geo;

import me.lyft.android.domain.location.Location;
import rx.functions.Func2;

// Referenced classes of package me.lyft.android.domain.geo:
//            Leg

class this._cls0
    implements Func2
{

    final Leg this$0;

    public Boolean call(Location location, Location location1)
    {
        return Boolean.valueOf(location.hasSameCoordinates(location1));
    }

    public volatile Object call(Object obj, Object obj1)
    {
        return call((Location)obj, (Location)obj1);
    }

    ocation()
    {
        this$0 = Leg.this;
        super();
    }
}

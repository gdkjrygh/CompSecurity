// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ride;

import java.util.List;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.location.Location;
import me.lyft.android.map.lyft.MapOwner;
import me.lyft.android.map.lyft.markers.SelectableMarker;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.ride:
//            RideMap

class this._cls0
    implements Func1
{

    final RideMap this$0;

    public volatile Object call(Object obj)
    {
        return call((Unit)obj);
    }

    public Location call(Unit unit)
    {
        unit = RideMap.access$000(RideMap.this);
        if (unit.isEmpty())
        {
            return getCameraLocationWithoutPadding();
        }
        unit = (SelectableMarker)RideMap.access$100(RideMap.this).findClosestMarker(getCameraLocationWithoutPadding(), unit);
        if (unit != null)
        {
            return unit.getLocation();
        } else
        {
            return getCameraLocationWithoutPadding();
        }
    }

    cation()
    {
        this$0 = RideMap.this;
        super();
    }
}

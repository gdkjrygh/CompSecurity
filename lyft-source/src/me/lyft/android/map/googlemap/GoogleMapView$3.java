// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.googlemap;

import java.util.List;
import me.lyft.android.common.Unit;
import me.lyft.android.map.core.camera.MapBound;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.map.googlemap:
//            GoogleMapView

class val.padding
    implements Func1
{

    final GoogleMapView this$0;
    final List val$locations;
    final int val$padding;

    public volatile Object call(Object obj)
    {
        return call((Unit)obj);
    }

    public MapBound call(Unit unit)
    {
        return new MapBound(val$locations, getMeasuredWidth(), getMeasuredHeight(), val$padding);
    }

    ()
    {
        this$0 = final_googlemapview;
        val$locations = list;
        val$padding = I.this;
        super();
    }
}

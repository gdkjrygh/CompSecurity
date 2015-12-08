// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.googlemap.polyline;

import com.google.android.gms.maps.model.LatLng;
import me.lyft.android.domain.location.Location;
import me.lyft.android.infrastructure.location.GoogleLocationMapper;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.map.googlemap.polyline:
//            GooglePolyline

class this._cls0
    implements Func1
{

    final GooglePolyline this$0;

    public LatLng call(Location location)
    {
        return GoogleLocationMapper.toMapLatLng(location);
    }

    public volatile Object call(Object obj)
    {
        return call((Location)obj);
    }

    pper()
    {
        this$0 = GooglePolyline.this;
        super();
    }
}

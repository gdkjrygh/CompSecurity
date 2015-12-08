// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.googlemap;

import com.google.android.gms.maps.model.LatLng;
import me.lyft.android.domain.location.Location;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.map.googlemap:
//            GooglePlayMap

class this._cls0
    implements Func1
{

    final GooglePlayMap this$0;

    public LatLng call(Location location)
    {
        return new LatLng(location.getLat().doubleValue(), location.getLng().doubleValue());
    }

    public volatile Object call(Object obj)
    {
        return call((Location)obj);
    }

    ()
    {
        this$0 = GooglePlayMap.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.googlemap.polyline;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Polyline;
import java.util.List;
import me.lyft.android.common.Iterables;
import me.lyft.android.domain.location.Location;
import me.lyft.android.infrastructure.location.GoogleLocationMapper;
import me.lyft.android.map.core.polyline.IPolyline;
import rx.functions.Func1;

public class GooglePolyline
    implements IPolyline
{

    private final Polyline googlePolyline;

    public GooglePolyline(Polyline polyline)
    {
        googlePolyline = polyline;
    }

    public boolean isNull()
    {
        return false;
    }

    public void remove()
    {
        googlePolyline.a();
    }

    public void setColor(int i)
    {
        googlePolyline.a(i);
    }

    public void setPoints(List list)
    {
        list = Iterables.select(list, new Func1() {

            final GooglePolyline this$0;

            public LatLng call(Location location)
            {
                return GoogleLocationMapper.toMapLatLng(location);
            }

            public volatile Object call(Object obj)
            {
                return call((Location)obj);
            }

            
            {
                this$0 = GooglePolyline.this;
                super();
            }
        });
        googlePolyline.a(list);
    }
}

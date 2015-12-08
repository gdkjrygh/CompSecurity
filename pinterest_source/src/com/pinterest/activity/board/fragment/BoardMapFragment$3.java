// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.fragment;

import com.google.android.gms.maps.model.Marker;
import com.pinterest.activity.map.MapPin;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.twotoasters.clusterkraf.ClusterPoint;
import com.twotoasters.clusterkraf.InputPoint;
import com.twotoasters.clusterkraf.OnInfoWindowClickDownstreamListener;

// Referenced classes of package com.pinterest.activity.board.fragment:
//            BoardMapFragment

class this._cls0
    implements OnInfoWindowClickDownstreamListener
{

    final BoardMapFragment this$0;

    public boolean onInfoWindowClick(Marker marker, ClusterPoint clusterpoint)
    {
        Pinalytics.a(ElementType.MAP_ANNOTATION, ComponentType.MAP);
        try
        {
            marker = (MapPin)clusterpoint.a(0).d();
        }
        // Misplaced declaration of an exception variable
        catch (Marker marker)
        {
            return false;
        }
        if (marker != null && ((MapPin) (marker)).pin != null && ((MapPin) (marker)).pinId != null)
        {
            Events.post(new Navigation(Location.PIN, ((MapPin) (marker)).pin));
            return true;
        } else
        {
            return false;
        }
    }

    stener()
    {
        this$0 = BoardMapFragment.this;
        super();
    }
}

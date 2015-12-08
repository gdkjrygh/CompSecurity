// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.fragment;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.kit.log.PLog;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.twotoasters.clusterkraf.ClusterPoint;
import com.twotoasters.clusterkraf.InputPoint;
import com.twotoasters.clusterkraf.OnInfoWindowClickDownstreamListener;
import com.twotoasters.clusterkraf.OnMarkerClickDownstreamListener;

// Referenced classes of package com.pinterest.activity.board.fragment:
//            BoardMapFragment

class this._cls0
    implements OnMarkerClickDownstreamListener
{

    final BoardMapFragment this$0;

    public boolean onMarkerClick(Marker marker, ClusterPoint clusterpoint)
    {
        if (marker == null || clusterpoint == null)
        {
            return false;
        }
        Pinalytics.a(ElementType.MAP_PIN_ICON, ComponentType.MAP);
        if (marker.isInfoWindowShown())
        {
            infoClicked.onInfoWindowClick(marker, clusterpoint);
            return true;
        }
        int j = clusterpoint.e();
        if (j < 2)
        {
            return false;
        }
        marker = LatLngBounds.builder();
        for (int i = 0; i < j; i++)
        {
            marker.include(clusterpoint.a(i).a());
        }

        marker = marker.build();
        float af[] = new float[1];
        Location.distanceBetween(((LatLngBounds) (marker)).southwest.latitude, ((LatLngBounds) (marker)).southwest.longitude, ((LatLngBounds) (marker)).northeast.latitude, ((LatLngBounds) (marker)).northeast.longitude, af);
        if (af[0] < (float)MIN_DISTANCE)
        {
            PLog.info((new StringBuilder("Points too close Results: ")).append(af[0]).toString(), new Object[0]);
            BoardMapFragment.access$500(BoardMapFragment.this, clusterpoint);
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

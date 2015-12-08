// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.map;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.maps.model.Marker;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.Place;
import com.pinterest.kit.log.PLog;
import com.pinterest.ui.ViewHelper;
import com.twotoasters.clusterkraf.ClusterPoint;
import com.twotoasters.clusterkraf.InfoWindowDownstreamAdapter;
import com.twotoasters.clusterkraf.InputPoint;

// Referenced classes of package com.pinterest.activity.map:
//            MapPin

public class InfoWindowAdapter
    implements InfoWindowDownstreamAdapter
{

    private TextView _location;
    private TextView _title;
    private final View _window;

    public InfoWindowAdapter(Context context)
    {
        _window = ViewHelper.viewById(context, 0x7f0301e8);
        _title = (TextView)_window.findViewById(0x7f0f0077);
        _location = (TextView)_window.findViewById(0x7f0f0464);
    }

    public View getInfoContents(Marker marker, ClusterPoint clusterpoint)
    {
        return null;
    }

    public View getInfoWindow(Marker marker, ClusterPoint clusterpoint)
    {
        try
        {
            marker = ((MapPin)clusterpoint.a(0).d()).pin.getPlace();
        }
        // Misplaced declaration of an exception variable
        catch (Marker marker)
        {
            PLog.error(marker, "exception occurred", new Object[0]);
            marker = null;
        }
        if (marker == null)
        {
            return null;
        } else
        {
            _title.setText(marker.getName());
            _location.setText(marker.getAddress());
            return _window;
        }
    }
}

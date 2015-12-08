// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.lyft.markeroptions;

import me.lyft.android.map.core.markers.IMarker;
import me.lyft.android.map.lyft.markers.Marker;
import me.lyft.android.map.lyft.markers.ToolTipDriverMarker;

// Referenced classes of package me.lyft.android.map.lyft.markeroptions:
//            DriverMarkerOptions

public class ToolTipDriverMarkerOptions extends DriverMarkerOptions
{

    private static final String DRIVER_MARKER_ID = "driver_marker";

    public ToolTipDriverMarkerOptions()
    {
        super("driver_marker");
    }

    public volatile Marker create(IMarker imarker)
    {
        return create(imarker);
    }

    public ToolTipDriverMarker create(IMarker imarker)
    {
        return new ToolTipDriverMarker(getMarkerId(), imarker);
    }

    public Class getMarkerType()
    {
        return me/lyft/android/map/lyft/markers/ToolTipDriverMarker;
    }
}

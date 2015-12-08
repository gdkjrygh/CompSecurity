// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.core;

import me.lyft.android.map.core.camera.IMapBound;
import me.lyft.android.map.core.camera.IMapPosition;
import me.lyft.android.map.core.camera.MapPosition;
import me.lyft.android.map.core.camera.NullMapPosition;
import me.lyft.android.map.core.markers.IMarker;
import me.lyft.android.map.core.markers.IMarkerOptions;
import me.lyft.android.map.core.markers.NullMarker;
import me.lyft.android.map.core.polyline.IPolyline;
import me.lyft.android.map.core.polyline.IPolylineOptions;
import me.lyft.android.map.core.polyline.NullPolyline;
import me.lyft.android.map.core.projection.IProjection;
import me.lyft.android.map.core.projection.NullProjection;
import me.lyft.android.map.core.tileoverlay.ITileOverlay;
import me.lyft.android.map.core.tileoverlay.ITileOverlayOptions;
import me.lyft.android.map.core.tileoverlay.NullTileOverlay;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.map.core:
//            IMap, MapInfoWindowView

public class NullMap
    implements IMap
{

    private static final IMap INSTANCE = new NullMap();

    public NullMap()
    {
    }

    public static IMap getInstance()
    {
        return INSTANCE;
    }

    public IMarker addMarker(IMarkerOptions imarkeroptions)
    {
        return NullMarker.getInstance();
    }

    public IPolyline addPolyline(IPolylineOptions ipolylineoptions)
    {
        return NullPolyline.getInstance();
    }

    public ITileOverlay addTileOverlay(ITileOverlayOptions itileoverlayoptions)
    {
        return NullTileOverlay.getInstance();
    }

    public Observable animateCamera(IMapBound imapbound)
    {
        return Observable.empty();
    }

    public Observable animateCamera(IMapPosition imapposition)
    {
        return Observable.empty();
    }

    public void clearPadding()
    {
    }

    public void detach()
    {
    }

    public void disableTraffic()
    {
    }

    public void displayLocation()
    {
    }

    public void enableTraffic()
    {
    }

    public IMapPosition getMapPosition()
    {
        return NullMapPosition.getInstance();
    }

    public IProjection getProjection()
    {
        return NullProjection.getInstance();
    }

    public void hideLocation()
    {
    }

    public void initialize()
    {
    }

    public boolean isNull()
    {
        return true;
    }

    public void moveCamera(MapPosition mapposition)
    {
    }

    public void reapplyPadding()
    {
    }

    public void setBottomPadding(int i)
    {
    }

    public void setGesturesEnabled(Boolean boolean1)
    {
    }

    public void setInfoWindowView(MapInfoWindowView mapinfowindowview)
    {
    }

    public void setOnCameraChangeListener(Action1 action1)
    {
    }

    public void setOnMarkerClickListener(Func1 func1)
    {
    }

    public void setTopPadding(int i)
    {
    }

}

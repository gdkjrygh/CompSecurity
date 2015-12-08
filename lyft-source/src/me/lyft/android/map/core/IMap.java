// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.core;

import me.lyft.android.common.INullable;
import me.lyft.android.map.core.camera.IMapBound;
import me.lyft.android.map.core.camera.IMapPosition;
import me.lyft.android.map.core.camera.MapPosition;
import me.lyft.android.map.core.markers.IMarker;
import me.lyft.android.map.core.markers.IMarkerOptions;
import me.lyft.android.map.core.polyline.IPolyline;
import me.lyft.android.map.core.polyline.IPolylineOptions;
import me.lyft.android.map.core.projection.IProjection;
import me.lyft.android.map.core.tileoverlay.ITileOverlay;
import me.lyft.android.map.core.tileoverlay.ITileOverlayOptions;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.map.core:
//            MapInfoWindowView

public interface IMap
    extends INullable
{

    public abstract IMarker addMarker(IMarkerOptions imarkeroptions);

    public abstract IPolyline addPolyline(IPolylineOptions ipolylineoptions);

    public abstract ITileOverlay addTileOverlay(ITileOverlayOptions itileoverlayoptions);

    public abstract Observable animateCamera(IMapBound imapbound);

    public abstract Observable animateCamera(IMapPosition imapposition);

    public abstract void clearPadding();

    public abstract void detach();

    public abstract void disableTraffic();

    public abstract void displayLocation();

    public abstract void enableTraffic();

    public abstract IMapPosition getMapPosition();

    public abstract IProjection getProjection();

    public abstract void hideLocation();

    public abstract void initialize();

    public abstract void moveCamera(MapPosition mapposition);

    public abstract void reapplyPadding();

    public abstract void setBottomPadding(int i);

    public abstract void setGesturesEnabled(Boolean boolean1);

    public abstract void setInfoWindowView(MapInfoWindowView mapinfowindowview);

    public abstract void setOnCameraChangeListener(Action1 action1);

    public abstract void setOnMarkerClickListener(Func1 func1);

    public abstract void setTopPadding(int i);
}

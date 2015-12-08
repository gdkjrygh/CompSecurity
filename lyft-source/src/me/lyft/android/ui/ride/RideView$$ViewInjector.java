// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ride;

import android.view.View;
import android.widget.FrameLayout;
import me.lyft.android.map.core.MapPlaceHolderView;

// Referenced classes of package me.lyft.android.ui.ride:
//            RideView

public class 
    implements butterknife.iewInjector
{

    public volatile void inject(butterknife.iewInjector iewinjector, Object obj, Object obj1)
    {
        inject(iewinjector, (RideView)obj, obj1);
    }

    public void inject(butterknife.iewInjector iewinjector, RideView rideview, Object obj)
    {
        rideview.mapPlaceholder = (MapPlaceHolderView)iewinjector.lderView((View)iewinjector.lderView(obj, 0x7f0d03b3, "field 'mapPlaceholder'"), 0x7f0d03b3, "field 'mapPlaceholder'");
        rideview.rideViewContainer = (FrameLayout)iewinjector.deViewContainer((View)iewinjector.deViewContainer(obj, 0x7f0d03b4, "field 'rideViewContainer'"), 0x7f0d03b4, "field 'rideViewContainer'");
    }

    public volatile void reset(Object obj)
    {
        reset((RideView)obj);
    }

    public void reset(RideView rideview)
    {
        rideview.mapPlaceholder = null;
        rideview.rideViewContainer = null;
    }

    public ()
    {
    }
}

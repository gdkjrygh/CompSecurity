// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.ui.HeightObservableLayout;
import me.lyft.android.ui.UserImageView;
import me.lyft.android.ui.tooltips.TooltipContainerView;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideInProgressView, DriverFollowLocationAndStopButton

public class 
    implements butterknife..ViewInjector
{

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (DriverRideInProgressView)obj, obj1);
    }

    public void inject(butterknife..ViewInjector viewinjector, DriverRideInProgressView driverrideinprogressview, Object obj)
    {
        driverrideinprogressview.driverRideTop = (HeightObservableLayout)viewinjector.driverRideTop((View)viewinjector.driverRideTop(obj, 0x7f0d01a5, "field 'driverRideTop'"), 0x7f0d01a5, "field 'driverRideTop'");
        driverrideinprogressview.driverRideBottom = (HeightObservableLayout)viewinjector.driverRideBottom((View)viewinjector.driverRideBottom(obj, 0x7f0d01aa, "field 'driverRideBottom'"), 0x7f0d01aa, "field 'driverRideBottom'");
        driverrideinprogressview.passengerPhotoImageView = (UserImageView)viewinjector.passengerPhotoImageView((View)viewinjector.passengerPhotoImageView(obj, 0x7f0d01ae, "field 'passengerPhotoImageView'"), 0x7f0d01ae, "field 'passengerPhotoImageView'");
        driverrideinprogressview.addressTextView = (TextView)viewinjector.addressTextView((View)viewinjector.addressTextView(obj, 0x7f0d01d7, "field 'addressTextView'"), 0x7f0d01d7, "field 'addressTextView'");
        driverrideinprogressview.etaTextView = (TextView)viewinjector.etaTextView((View)viewinjector.etaTextView(obj, 0x7f0d01db, "field 'etaTextView'"), 0x7f0d01db, "field 'etaTextView'");
        driverrideinprogressview.addressView = (View)viewinjector.addressView(obj, 0x7f0d01d5, "field 'addressView'");
        driverrideinprogressview.addressIcon = (ImageView)viewinjector.addressIcon((View)viewinjector.addressIcon(obj, 0x7f0d01d6, "field 'addressIcon'"), 0x7f0d01d6, "field 'addressIcon'");
        driverrideinprogressview.tapToEditView = (View)viewinjector.tapToEditView(obj, 0x7f0d01d8, "field 'tapToEditView'");
        driverrideinprogressview.hotspotIndicatorView = (View)viewinjector.hotspotIndicatorView(obj, 0x7f0d01d9, "field 'hotspotIndicatorView'");
        driverrideinprogressview.navigateButton = (View)viewinjector.navigateButton(obj, 0x7f0d01da, "field 'navigateButton'");
        driverrideinprogressview.driverRideButtonTextView = (TextView)viewinjector.driverRideButtonTextView((View)viewinjector.driverRideButtonTextView(obj, 0x7f0d01b2, "field 'driverRideButtonTextView'"), 0x7f0d01b2, "field 'driverRideButtonTextView'");
        driverrideinprogressview.rideOverviewMapButton = (View)viewinjector.rideOverviewMapButton(obj, 0x7f0d01ab, "field 'rideOverviewMapButton'");
        driverrideinprogressview.followCurrentLocationButton = (DriverFollowLocationAndStopButton)viewinjector.opButton((View)viewinjector.opButton(obj, 0x7f0d01ac, "field 'followCurrentLocationButton'"), 0x7f0d01ac, "field 'followCurrentLocationButton'");
        driverrideinprogressview.bottomButtonContainer = (View)viewinjector.bottomButtonContainer(obj, 0x7f0d01ad, "field 'bottomButtonContainer'");
        driverrideinprogressview.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
        driverrideinprogressview.tooltipContainer = (TooltipContainerView)viewinjector.tooltipContainer((View)viewinjector.tooltipContainer(obj, 0x7f0d01b3, "field 'tooltipContainer'"), 0x7f0d01b3, "field 'tooltipContainer'");
    }

    public volatile void reset(Object obj)
    {
        reset((DriverRideInProgressView)obj);
    }

    public void reset(DriverRideInProgressView driverrideinprogressview)
    {
        driverrideinprogressview.driverRideTop = null;
        driverrideinprogressview.driverRideBottom = null;
        driverrideinprogressview.passengerPhotoImageView = null;
        driverrideinprogressview.addressTextView = null;
        driverrideinprogressview.etaTextView = null;
        driverrideinprogressview.addressView = null;
        driverrideinprogressview.addressIcon = null;
        driverrideinprogressview.tapToEditView = null;
        driverrideinprogressview.hotspotIndicatorView = null;
        driverrideinprogressview.navigateButton = null;
        driverrideinprogressview.driverRideButtonTextView = null;
        driverrideinprogressview.rideOverviewMapButton = null;
        driverrideinprogressview.followCurrentLocationButton = null;
        driverrideinprogressview.bottomButtonContainer = null;
        driverrideinprogressview.toolbar = null;
        driverrideinprogressview.tooltipContainer = null;
    }

    public ()
    {
    }
}

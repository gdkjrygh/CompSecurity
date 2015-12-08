// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import android.widget.TextView;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.ui.HeightObservableLayout;
import me.lyft.android.ui.UserImageView;
import me.lyft.android.ui.tooltips.TooltipContainerView;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverCourierPickupView, DriverFollowLocationAndStopButton

public class 
    implements butterknife..ViewInjector
{

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (DriverCourierPickupView)obj, obj1);
    }

    public void inject(butterknife..ViewInjector viewinjector, DriverCourierPickupView drivercourierpickupview, Object obj)
    {
        drivercourierpickupview.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
        drivercourierpickupview.driverRideTop = (HeightObservableLayout)viewinjector.driverRideTop((View)viewinjector.driverRideTop(obj, 0x7f0d01a5, "field 'driverRideTop'"), 0x7f0d01a5, "field 'driverRideTop'");
        drivercourierpickupview.driverRideBottom = (HeightObservableLayout)viewinjector.driverRideBottom((View)viewinjector.driverRideBottom(obj, 0x7f0d01aa, "field 'driverRideBottom'"), 0x7f0d01aa, "field 'driverRideBottom'");
        drivercourierpickupview.driverRideButtonTextView = (TextView)viewinjector.driverRideButtonTextView((View)viewinjector.driverRideButtonTextView(obj, 0x7f0d01b2, "field 'driverRideButtonTextView'"), 0x7f0d01b2, "field 'driverRideButtonTextView'");
        drivercourierpickupview.passengerPhotoImageView = (UserImageView)viewinjector.passengerPhotoImageView((View)viewinjector.passengerPhotoImageView(obj, 0x7f0d01ae, "field 'passengerPhotoImageView'"), 0x7f0d01ae, "field 'passengerPhotoImageView'");
        drivercourierpickupview.confirmPickupButton = (View)viewinjector.confirmPickupButton(obj, 0x7f0d013d, "field 'confirmPickupButton'");
        drivercourierpickupview.confirmPickupOtherButton = (View)viewinjector.confirmPickupOtherButton(obj, 0x7f0d01b1, "field 'confirmPickupOtherButton'");
        drivercourierpickupview.passengerNoShowButton = (View)viewinjector.passengerNoShowButton(obj, 0x7f0d0140, "field 'passengerNoShowButton'");
        drivercourierpickupview.confirmationInfoTextView = (TextView)viewinjector.confirmationInfoTextView((View)viewinjector.confirmationInfoTextView(obj, 0x7f0d01a8, "field 'confirmationInfoTextView'"), 0x7f0d01a8, "field 'confirmationInfoTextView'");
        drivercourierpickupview.confirmationTimer = (TextView)viewinjector.confirmationTimer((View)viewinjector.confirmationTimer(obj, 0x7f0d01a9, "field 'confirmationTimer'"), 0x7f0d01a9, "field 'confirmationTimer'");
        drivercourierpickupview.timeToGoView = (View)viewinjector.timeToGoView(obj, 0x7f0d01a7, "field 'timeToGoView'");
        drivercourierpickupview.followCurrentLocationButton = (DriverFollowLocationAndStopButton)viewinjector.topButton((View)viewinjector.topButton(obj, 0x7f0d01ac, "field 'followCurrentLocationButton'"), 0x7f0d01ac, "field 'followCurrentLocationButton'");
        drivercourierpickupview.bottomButtonContainer = (View)viewinjector.bottomButtonContainer(obj, 0x7f0d01ad, "field 'bottomButtonContainer'");
        drivercourierpickupview.tooltipContainer = (TooltipContainerView)viewinjector.tooltipContainer((View)viewinjector.tooltipContainer(obj, 0x7f0d01b3, "field 'tooltipContainer'"), 0x7f0d01b3, "field 'tooltipContainer'");
        drivercourierpickupview.confirmPartySizeTextView = (TextView)viewinjector.confirmPartySizeTextView((View)viewinjector.confirmPartySizeTextView(obj, 0x7f0d01b0, "field 'confirmPartySizeTextView'"), 0x7f0d01b0, "field 'confirmPartySizeTextView'");
    }

    public volatile void reset(Object obj)
    {
        reset((DriverCourierPickupView)obj);
    }

    public void reset(DriverCourierPickupView drivercourierpickupview)
    {
        drivercourierpickupview.toolbar = null;
        drivercourierpickupview.driverRideTop = null;
        drivercourierpickupview.driverRideBottom = null;
        drivercourierpickupview.driverRideButtonTextView = null;
        drivercourierpickupview.passengerPhotoImageView = null;
        drivercourierpickupview.confirmPickupButton = null;
        drivercourierpickupview.confirmPickupOtherButton = null;
        drivercourierpickupview.passengerNoShowButton = null;
        drivercourierpickupview.confirmationInfoTextView = null;
        drivercourierpickupview.confirmationTimer = null;
        drivercourierpickupview.timeToGoView = null;
        drivercourierpickupview.followCurrentLocationButton = null;
        drivercourierpickupview.bottomButtonContainer = null;
        drivercourierpickupview.tooltipContainer = null;
        drivercourierpickupview.confirmPartySizeTextView = null;
    }

    public ()
    {
    }
}

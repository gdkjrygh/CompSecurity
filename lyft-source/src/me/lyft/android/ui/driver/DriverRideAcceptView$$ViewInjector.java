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
//            DriverRideAcceptView

public class 
    implements butterknife..ViewInjector
{

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (DriverRideAcceptView)obj, obj1);
    }

    public void inject(butterknife..ViewInjector viewinjector, DriverRideAcceptView driverrideacceptview, Object obj)
    {
        driverrideacceptview.driverRideTop = (HeightObservableLayout)viewinjector.driverRideTop((View)viewinjector.driverRideTop(obj, 0x7f0d01a5, "field 'driverRideTop'"), 0x7f0d01a5, "field 'driverRideTop'");
        driverrideacceptview.driverRideBottom = (HeightObservableLayout)viewinjector.driverRideBottom((View)viewinjector.driverRideBottom(obj, 0x7f0d01aa, "field 'driverRideBottom'"), 0x7f0d01aa, "field 'driverRideBottom'");
        driverrideacceptview.passengerNameTextView = (TextView)viewinjector.passengerNameTextView((View)viewinjector.passengerNameTextView(obj, 0x7f0d01d0, "field 'passengerNameTextView'"), 0x7f0d01d0, "field 'passengerNameTextView'");
        driverrideacceptview.passengerRatingTextView = (TextView)viewinjector.passengerRatingTextView((View)viewinjector.passengerRatingTextView(obj, 0x7f0d01d2, "field 'passengerRatingTextView'"), 0x7f0d01d2, "field 'passengerRatingTextView'");
        driverrideacceptview.photoImageView = (UserImageView)viewinjector.photoImageView((View)viewinjector.photoImageView(obj, 0x7f0d01cd, "field 'photoImageView'"), 0x7f0d01cd, "field 'photoImageView'");
        driverrideacceptview.addressTextView = (TextView)viewinjector.addressTextView((View)viewinjector.addressTextView(obj, 0x7f0d01c7, "field 'addressTextView'"), 0x7f0d01c7, "field 'addressTextView'");
        driverrideacceptview.etaTextView = (TextView)viewinjector.etaTextView((View)viewinjector.etaTextView(obj, 0x7f0d01c8, "field 'etaTextView'"), 0x7f0d01c8, "field 'etaTextView'");
        driverrideacceptview.acceptRideView = (View)viewinjector.acceptRideView(obj, 0x7f0d01ce, "field 'acceptRideView'");
        driverrideacceptview.acceptView = (View)viewinjector.acceptView(obj, 0x7f0d01d3, "field 'acceptView'");
        driverrideacceptview.acceptRideCountdownTxt = (TextView)viewinjector.acceptRideCountdownTxt((View)viewinjector.acceptRideCountdownTxt(obj, 0x7f0d01ca, "field 'acceptRideCountdownTxt'"), 0x7f0d01ca, "field 'acceptRideCountdownTxt'");
        driverrideacceptview.primeTimeBannerText = (TextView)viewinjector.primeTimeBannerText((View)viewinjector.primeTimeBannerText(obj, 0x7f0d01cc, "field 'primeTimeBannerText'"), 0x7f0d01cc, "field 'primeTimeBannerText'");
        driverrideacceptview.primeTimeBannerContainer = (View)viewinjector.primeTimeBannerContainer(obj, 0x7f0d01cb, "field 'primeTimeBannerContainer'");
        driverrideacceptview.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
        driverrideacceptview.tooltipView = (TooltipContainerView)viewinjector.w((View)viewinjector.w(obj, 0x7f0d01b3, "field 'tooltipView'"), 0x7f0d01b3, "field 'tooltipView'");
    }

    public volatile void reset(Object obj)
    {
        reset((DriverRideAcceptView)obj);
    }

    public void reset(DriverRideAcceptView driverrideacceptview)
    {
        driverrideacceptview.driverRideTop = null;
        driverrideacceptview.driverRideBottom = null;
        driverrideacceptview.passengerNameTextView = null;
        driverrideacceptview.passengerRatingTextView = null;
        driverrideacceptview.photoImageView = null;
        driverrideacceptview.addressTextView = null;
        driverrideacceptview.etaTextView = null;
        driverrideacceptview.acceptRideView = null;
        driverrideacceptview.acceptView = null;
        driverrideacceptview.acceptRideCountdownTxt = null;
        driverrideacceptview.primeTimeBannerText = null;
        driverrideacceptview.primeTimeBannerContainer = null;
        driverrideacceptview.toolbar = null;
        driverrideacceptview.tooltipView = null;
    }

    public ()
    {
    }
}

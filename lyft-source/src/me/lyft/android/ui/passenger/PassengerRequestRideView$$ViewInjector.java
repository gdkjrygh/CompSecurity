// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import butterknife.internal.DebouncingOnClickListener;
import me.lyft.android.controls.RideTypeSwitcher;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.ui.HeightObservableLayout;
import me.lyft.android.ui.tooltips.TooltipContainerView;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRequestRideView, RequestRideButton, PassengerRideAddressInput, PaymentWidgetContainerView

public class _cls2.val.target
    implements butterknife.ew..ViewInjector
{

    public volatile void inject(butterknife.ew..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (PassengerRequestRideView)obj, obj1);
    }

    public void inject(butterknife.ew..ViewInjector viewinjector, final PassengerRequestRideView target, Object obj)
    {
        target.passengerRideTop = (HeightObservableLayout)viewinjector.passengerRideTop((View)viewinjector.passengerRideTop(obj, 0x7f0d02a1, "field 'passengerRideTop'"), 0x7f0d02a1, "field 'passengerRideTop'");
        target.passengerRideBottom = (HeightObservableLayout)viewinjector.passengerRideBottom((View)viewinjector.passengerRideBottom(obj, 0x7f0d02a4, "field 'passengerRideBottom'"), 0x7f0d02a4, "field 'passengerRideBottom'");
        target.requestRideButton = (RequestRideButton)viewinjector.requestRideButton((View)viewinjector.requestRideButton(obj, 0x7f0d02d8, "field 'requestRideButton'"), 0x7f0d02d8, "field 'requestRideButton'");
        target.passengerRideAddressInput = (PassengerRideAddressInput)viewinjector.put((View)viewinjector.put(obj, 0x7f0d02a5, "field 'passengerRideAddressInput'"), 0x7f0d02a5, "field 'passengerRideAddressInput'");
        target.locationPin = (ImageView)viewinjector.locationPin((View)viewinjector.locationPin(obj, 0x7f0d0182, "field 'locationPin'"), 0x7f0d0182, "field 'locationPin'");
        target.rideTypeSwitcher = (RideTypeSwitcher)viewinjector.rideTypeSwitcher((View)viewinjector.rideTypeSwitcher(obj, 0x7f0d02d2, "field 'rideTypeSwitcher'"), 0x7f0d02d2, "field 'rideTypeSwitcher'");
        target.paymentWidgetContainerView = (PaymentWidgetContainerView)viewinjector.View((View)viewinjector.View(obj, 0x7f0d02d4, "field 'paymentWidgetContainerView'"), 0x7f0d02d4, "field 'paymentWidgetContainerView'");
        target.tooltipContainer = (TooltipContainerView)viewinjector.tooltipContainer((View)viewinjector.tooltipContainer(obj, 0x7f0d01b3, "field 'tooltipContainer'"), 0x7f0d01b3, "field 'tooltipContainer'");
        target.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
        View view = (View)viewinjector.toolbar(obj, 0x7f0d02d7, "field 'pickupTime' and method 'onSelectPickupTime'");
        target.pickupTime = (Button)viewinjector.pickupTime(view, 0x7f0d02d7, "field 'pickupTime'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final PassengerRequestRideView..ViewInjector this$0;
            final PassengerRequestRideView val$target;

            public void doClick(View view1)
            {
                target.onSelectPickupTime();
            }

            
            {
                this$0 = PassengerRequestRideView..ViewInjector.this;
                target = passengerrequestrideview;
                super();
            }
        });
        ((View)viewinjector.ew(obj, 0x7f0d0186, "method 'onCenterToCurrentLocation'")).setOnClickListener(new DebouncingOnClickListener() {

            final PassengerRequestRideView..ViewInjector this$0;
            final PassengerRequestRideView val$target;

            public void doClick(View view1)
            {
                target.onCenterToCurrentLocation();
            }

            
            {
                this$0 = PassengerRequestRideView..ViewInjector.this;
                target = passengerrequestrideview;
                super();
            }
        });
    }

    public volatile void reset(Object obj)
    {
        reset((PassengerRequestRideView)obj);
    }

    public void reset(PassengerRequestRideView passengerrequestrideview)
    {
        passengerrequestrideview.passengerRideTop = null;
        passengerrequestrideview.passengerRideBottom = null;
        passengerrequestrideview.requestRideButton = null;
        passengerrequestrideview.passengerRideAddressInput = null;
        passengerrequestrideview.locationPin = null;
        passengerrequestrideview.rideTypeSwitcher = null;
        passengerrequestrideview.paymentWidgetContainerView = null;
        passengerrequestrideview.tooltipContainer = null;
        passengerrequestrideview.toolbar = null;
        passengerrequestrideview.pickupTime = null;
    }

    public _cls2.val.target()
    {
    }
}

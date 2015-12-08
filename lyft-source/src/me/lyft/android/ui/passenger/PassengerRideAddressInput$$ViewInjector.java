// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRideAddressInput

public class 
    implements butterknife.ut..ViewInjector
{

    public volatile void inject(butterknife.ut..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (PassengerRideAddressInput)obj, obj1);
    }

    public void inject(butterknife.ut..ViewInjector viewinjector, PassengerRideAddressInput passengerrideaddressinput, Object obj)
    {
        passengerrideaddressinput.pickupAddressTextView = (TextView)viewinjector.pickupAddressTextView((View)viewinjector.pickupAddressTextView(obj, 0x7f0d02e9, "field 'pickupAddressTextView'"), 0x7f0d02e9, "field 'pickupAddressTextView'");
        passengerrideaddressinput.dropoffAddressTextView = (TextView)viewinjector.dropoffAddressTextView((View)viewinjector.dropoffAddressTextView(obj, 0x7f0d02eb, "field 'dropoffAddressTextView'"), 0x7f0d02eb, "field 'dropoffAddressTextView'");
        passengerrideaddressinput.spacer = (View)viewinjector.spacer(obj, 0x7f0d02ea, "field 'spacer'");
        passengerrideaddressinput.pickupDropoffView = (View)viewinjector.pickupDropoffView(obj, 0x7f0d02e8, "field 'pickupDropoffView'");
        passengerrideaddressinput.singleAddressView = (View)viewinjector.singleAddressView(obj, 0x7f0d02ec, "field 'singleAddressView'");
        passengerrideaddressinput.singleAddressTextView = (TextView)viewinjector.singleAddressTextView((View)viewinjector.singleAddressTextView(obj, 0x7f0d02ed, "field 'singleAddressTextView'"), 0x7f0d02ed, "field 'singleAddressTextView'");
        passengerrideaddressinput.etaTextView = (TextView)viewinjector.etaTextView((View)viewinjector.etaTextView(obj, 0x7f0d02ee, "field 'etaTextView'"), 0x7f0d02ee, "field 'etaTextView'");
    }

    public volatile void reset(Object obj)
    {
        reset((PassengerRideAddressInput)obj);
    }

    public void reset(PassengerRideAddressInput passengerrideaddressinput)
    {
        passengerrideaddressinput.pickupAddressTextView = null;
        passengerrideaddressinput.dropoffAddressTextView = null;
        passengerrideaddressinput.spacer = null;
        passengerrideaddressinput.pickupDropoffView = null;
        passengerrideaddressinput.singleAddressView = null;
        passengerrideaddressinput.singleAddressTextView = null;
        passengerrideaddressinput.etaTextView = null;
    }

    public ()
    {
    }
}

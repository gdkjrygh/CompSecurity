// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import me.lyft.android.ui.UserImageView;

// Referenced classes of package me.lyft.android.ui.driver:
//            RideOverviewPartyItem

public class 
    implements butterknife..ViewInjector
{

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (RideOverviewPartyItem)obj, obj1);
    }

    public void inject(butterknife..ViewInjector viewinjector, RideOverviewPartyItem rideoverviewpartyitem, Object obj)
    {
        rideoverviewpartyitem.partyPhoto = (UserImageView)viewinjector.partyPhoto((View)viewinjector.partyPhoto(obj, 0x7f0d0393, "field 'partyPhoto'"), 0x7f0d0393, "field 'partyPhoto'");
        rideoverviewpartyitem.firstName = (TextView)viewinjector.firstName((View)viewinjector.firstName(obj, 0x7f0d0394, "field 'firstName'"), 0x7f0d0394, "field 'firstName'");
        rideoverviewpartyitem.callPassengerButton = (Button)viewinjector.callPassengerButton((View)viewinjector.callPassengerButton(obj, 0x7f0d0395, "field 'callPassengerButton'"), 0x7f0d0395, "field 'callPassengerButton'");
    }

    public volatile void reset(Object obj)
    {
        reset((RideOverviewPartyItem)obj);
    }

    public void reset(RideOverviewPartyItem rideoverviewpartyitem)
    {
        rideoverviewpartyitem.partyPhoto = null;
        rideoverviewpartyitem.firstName = null;
        rideoverviewpartyitem.callPassengerButton = null;
    }

    public ()
    {
    }
}

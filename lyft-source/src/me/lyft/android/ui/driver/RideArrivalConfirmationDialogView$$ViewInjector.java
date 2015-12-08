// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import me.lyft.android.ui.UserImageView;
import me.lyft.android.ui.tooltips.TooltipContainerView;

// Referenced classes of package me.lyft.android.ui.driver:
//            RideArrivalConfirmationDialogView

public class 
    implements butterknife..ViewInjector
{

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (RideArrivalConfirmationDialogView)obj, obj1);
    }

    public void inject(butterknife..ViewInjector viewinjector, RideArrivalConfirmationDialogView ridearrivalconfirmationdialogview, Object obj)
    {
        ridearrivalconfirmationdialogview.secondaryMessage = (TextView)viewinjector.secondaryMessage((View)viewinjector.secondaryMessage(obj, 0x7f0d038b, "field 'secondaryMessage'"), 0x7f0d038b, "field 'secondaryMessage'");
        ridearrivalconfirmationdialogview.confirmButton = (Button)viewinjector.confirmButton((View)viewinjector.confirmButton(obj, 0x7f0d007f, "field 'confirmButton'"), 0x7f0d007f, "field 'confirmButton'");
        ridearrivalconfirmationdialogview.primaryMessage = (TextView)viewinjector.primaryMessage((View)viewinjector.primaryMessage(obj, 0x7f0d038a, "field 'primaryMessage'"), 0x7f0d038a, "field 'primaryMessage'");
        ridearrivalconfirmationdialogview.passengerPhoto = (UserImageView)viewinjector.passengerPhoto((View)viewinjector.passengerPhoto(obj, 0x7f0d01bc, "field 'passengerPhoto'"), 0x7f0d01bc, "field 'passengerPhoto'");
        ridearrivalconfirmationdialogview.tooltipContainer = (TooltipContainerView)viewinjector.tooltipContainer((View)viewinjector.tooltipContainer(obj, 0x7f0d01b3, "field 'tooltipContainer'"), 0x7f0d01b3, "field 'tooltipContainer'");
    }

    public volatile void reset(Object obj)
    {
        reset((RideArrivalConfirmationDialogView)obj);
    }

    public void reset(RideArrivalConfirmationDialogView ridearrivalconfirmationdialogview)
    {
        ridearrivalconfirmationdialogview.secondaryMessage = null;
        ridearrivalconfirmationdialogview.confirmButton = null;
        ridearrivalconfirmationdialogview.primaryMessage = null;
        ridearrivalconfirmationdialogview.passengerPhoto = null;
        ridearrivalconfirmationdialogview.tooltipContainer = null;
    }

    public ()
    {
    }
}

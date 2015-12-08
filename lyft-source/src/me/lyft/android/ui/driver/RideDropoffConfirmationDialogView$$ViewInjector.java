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
//            RideDropoffConfirmationDialogView

public class 
    implements butterknife..ViewInjector
{

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (RideDropoffConfirmationDialogView)obj, obj1);
    }

    public void inject(butterknife..ViewInjector viewinjector, RideDropoffConfirmationDialogView ridedropoffconfirmationdialogview, Object obj)
    {
        ridedropoffconfirmationdialogview.confirmDropoffButton = (Button)viewinjector.confirmDropoffButton((View)viewinjector.confirmDropoffButton(obj, 0x7f0d007f, "field 'confirmDropoffButton'"), 0x7f0d007f, "field 'confirmDropoffButton'");
        ridedropoffconfirmationdialogview.primaryMessage = (TextView)viewinjector.primaryMessage((View)viewinjector.primaryMessage(obj, 0x7f0d038a, "field 'primaryMessage'"), 0x7f0d038a, "field 'primaryMessage'");
        ridedropoffconfirmationdialogview.dismissButton = (Button)viewinjector.dismissButton((View)viewinjector.dismissButton(obj, 0x7f0d0141, "field 'dismissButton'"), 0x7f0d0141, "field 'dismissButton'");
        ridedropoffconfirmationdialogview.passengerPhoto = (UserImageView)viewinjector.passengerPhoto((View)viewinjector.passengerPhoto(obj, 0x7f0d01bc, "field 'passengerPhoto'"), 0x7f0d01bc, "field 'passengerPhoto'");
        ridedropoffconfirmationdialogview.tooltipContainer = (TooltipContainerView)viewinjector.tooltipContainer((View)viewinjector.tooltipContainer(obj, 0x7f0d01b3, "field 'tooltipContainer'"), 0x7f0d01b3, "field 'tooltipContainer'");
    }

    public volatile void reset(Object obj)
    {
        reset((RideDropoffConfirmationDialogView)obj);
    }

    public void reset(RideDropoffConfirmationDialogView ridedropoffconfirmationdialogview)
    {
        ridedropoffconfirmationdialogview.confirmDropoffButton = null;
        ridedropoffconfirmationdialogview.primaryMessage = null;
        ridedropoffconfirmationdialogview.dismissButton = null;
        ridedropoffconfirmationdialogview.passengerPhoto = null;
        ridedropoffconfirmationdialogview.tooltipContainer = null;
    }

    public ()
    {
    }
}

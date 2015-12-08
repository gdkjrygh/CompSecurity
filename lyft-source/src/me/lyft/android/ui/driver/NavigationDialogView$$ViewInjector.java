// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import me.lyft.android.ui.UserImageView;
import me.lyft.android.ui.tooltips.TooltipContainerView;

// Referenced classes of package me.lyft.android.ui.driver:
//            NavigationDialogView

public class 
    implements butterknife..ViewInjector
{

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (NavigationDialogView)obj, obj1);
    }

    public void inject(butterknife..ViewInjector viewinjector, NavigationDialogView navigationdialogview, Object obj)
    {
        navigationdialogview.staticMapLayout = (RelativeLayout)viewinjector.staticMapLayout((View)viewinjector.staticMapLayout(obj, 0x7f0d0286, "field 'staticMapLayout'"), 0x7f0d0286, "field 'staticMapLayout'");
        navigationdialogview.addressTextView = (TextView)viewinjector.addressTextView((View)viewinjector.addressTextView(obj, 0x7f0d0289, "field 'addressTextView'"), 0x7f0d0289, "field 'addressTextView'");
        navigationdialogview.closeButton = (Button)viewinjector.closeButton((View)viewinjector.closeButton(obj, 0x7f0d0069, "field 'closeButton'"), 0x7f0d0069, "field 'closeButton'");
        navigationdialogview.navigateButton = (Button)viewinjector.navigateButton((View)viewinjector.navigateButton(obj, 0x7f0d01da, "field 'navigateButton'"), 0x7f0d01da, "field 'navigateButton'");
        navigationdialogview.passengerPhotoImageView = (UserImageView)viewinjector.passengerPhotoImageView((View)viewinjector.passengerPhotoImageView(obj, 0x7f0d01bc, "field 'passengerPhotoImageView'"), 0x7f0d01bc, "field 'passengerPhotoImageView'");
        navigationdialogview.passengerNameTextView = (TextView)viewinjector.passengerNameTextView((View)viewinjector.passengerNameTextView(obj, 0x7f0d013f, "field 'passengerNameTextView'"), 0x7f0d013f, "field 'passengerNameTextView'");
        navigationdialogview.staticMap = (ImageView)viewinjector.staticMap((View)viewinjector.staticMap(obj, 0x7f0d0287, "field 'staticMap'"), 0x7f0d0287, "field 'staticMap'");
        navigationdialogview.mapPinImageView = (ImageView)viewinjector.mapPinImageView((View)viewinjector.mapPinImageView(obj, 0x7f0d0288, "field 'mapPinImageView'"), 0x7f0d0288, "field 'mapPinImageView'");
        navigationdialogview.tooltipContainer = (TooltipContainerView)viewinjector.w((View)viewinjector.w(obj, 0x7f0d01b3, "field 'tooltipContainer'"), 0x7f0d01b3, "field 'tooltipContainer'");
    }

    public volatile void reset(Object obj)
    {
        reset((NavigationDialogView)obj);
    }

    public void reset(NavigationDialogView navigationdialogview)
    {
        navigationdialogview.staticMapLayout = null;
        navigationdialogview.addressTextView = null;
        navigationdialogview.closeButton = null;
        navigationdialogview.navigateButton = null;
        navigationdialogview.passengerPhotoImageView = null;
        navigationdialogview.passengerNameTextView = null;
        navigationdialogview.staticMap = null;
        navigationdialogview.mapPinImageView = null;
        navigationdialogview.tooltipContainer = null;
    }

    public ()
    {
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import me.lyft.android.ui.UserImageView;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverEndRideConfirmationDialogView

public class Q
    implements butterknife..ViewInjector
{

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (DriverEndRideConfirmationDialogView)obj, obj1);
    }

    public void inject(butterknife..ViewInjector viewinjector, DriverEndRideConfirmationDialogView driverendrideconfirmationdialogview, Object obj)
    {
        driverendrideconfirmationdialogview.titleTextView = (TextView)viewinjector.titleTextView((View)viewinjector.titleTextView(obj, 0x7f0d0061, "field 'titleTextView'"), 0x7f0d0061, "field 'titleTextView'");
        driverendrideconfirmationdialogview.userImageView = (UserImageView)viewinjector.userImageView((View)viewinjector.userImageView(obj, 0x7f0d01bc, "field 'userImageView'"), 0x7f0d01bc, "field 'userImageView'");
        driverendrideconfirmationdialogview.pickedUpButton = (Button)viewinjector.pickedUpButton((View)viewinjector.pickedUpButton(obj, 0x7f0d01bd, "field 'pickedUpButton'"), 0x7f0d01bd, "field 'pickedUpButton'");
        driverendrideconfirmationdialogview.notPickedUpButton = (Button)viewinjector.notPickedUpButton((View)viewinjector.notPickedUpButton(obj, 0x7f0d01be, "field 'notPickedUpButton'"), 0x7f0d01be, "field 'notPickedUpButton'");
        driverendrideconfirmationdialogview.closeDialogButton = (Button)viewinjector.closeDialogButton((View)viewinjector.closeDialogButton(obj, 0x7f0d01bf, "field 'closeDialogButton'"), 0x7f0d01bf, "field 'closeDialogButton'");
    }

    public volatile void reset(Object obj)
    {
        reset((DriverEndRideConfirmationDialogView)obj);
    }

    public void reset(DriverEndRideConfirmationDialogView driverendrideconfirmationdialogview)
    {
        driverendrideconfirmationdialogview.titleTextView = null;
        driverendrideconfirmationdialogview.userImageView = null;
        driverendrideconfirmationdialogview.pickedUpButton = null;
        driverendrideconfirmationdialogview.notPickedUpButton = null;
        driverendrideconfirmationdialogview.closeDialogButton = null;
    }

    public Q()
    {
    }
}

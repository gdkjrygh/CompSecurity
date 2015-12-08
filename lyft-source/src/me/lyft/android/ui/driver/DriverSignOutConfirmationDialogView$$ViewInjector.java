// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverSignOutConfirmationDialogView

public class Q
    implements butterknife..ViewInjector
{

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (DriverSignOutConfirmationDialogView)obj, obj1);
    }

    public void inject(butterknife..ViewInjector viewinjector, DriverSignOutConfirmationDialogView driversignoutconfirmationdialogview, Object obj)
    {
        driversignoutconfirmationdialogview.titleTextView = (TextView)viewinjector.titleTextView((View)viewinjector.titleTextView(obj, 0x7f0d0061, "field 'titleTextView'"), 0x7f0d0061, "field 'titleTextView'");
        driversignoutconfirmationdialogview.messageTextView = (TextView)viewinjector.messageTextView((View)viewinjector.messageTextView(obj, 0x7f0d01ec, "field 'messageTextView'"), 0x7f0d01ec, "field 'messageTextView'");
        driversignoutconfirmationdialogview.signOutButton = (Button)viewinjector.signOutButton((View)viewinjector.signOutButton(obj, 0x7f0d01ed, "field 'signOutButton'"), 0x7f0d01ed, "field 'signOutButton'");
        driversignoutconfirmationdialogview.keepDrivingButton = (Button)viewinjector.keepDrivingButton((View)viewinjector.keepDrivingButton(obj, 0x7f0d01ee, "field 'keepDrivingButton'"), 0x7f0d01ee, "field 'keepDrivingButton'");
    }

    public volatile void reset(Object obj)
    {
        reset((DriverSignOutConfirmationDialogView)obj);
    }

    public void reset(DriverSignOutConfirmationDialogView driversignoutconfirmationdialogview)
    {
        driversignoutconfirmationdialogview.titleTextView = null;
        driversignoutconfirmationdialogview.messageTextView = null;
        driversignoutconfirmationdialogview.signOutButton = null;
        driversignoutconfirmationdialogview.keepDrivingButton = null;
    }

    public Q()
    {
    }
}

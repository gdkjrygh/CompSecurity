// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

// Referenced classes of package me.lyft.android.ui.driver:
//            LastRideConfirmationDialogView

public class 
    implements butterknife..ViewInjector
{

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (LastRideConfirmationDialogView)obj, obj1);
    }

    public void inject(butterknife..ViewInjector viewinjector, LastRideConfirmationDialogView lastrideconfirmationdialogview, Object obj)
    {
        lastrideconfirmationdialogview.passengerPhotoListView = (LinearLayout)viewinjector.passengerPhotoListView((View)viewinjector.passengerPhotoListView(obj, 0x7f0d01a1, "field 'passengerPhotoListView'"), 0x7f0d01a1, "field 'passengerPhotoListView'");
        lastrideconfirmationdialogview.confirmLastRideButton = (Button)viewinjector.confirmLastRideButton((View)viewinjector.confirmLastRideButton(obj, 0x7f0d026f, "field 'confirmLastRideButton'"), 0x7f0d026f, "field 'confirmLastRideButton'");
    }

    public volatile void reset(Object obj)
    {
        reset((LastRideConfirmationDialogView)obj);
    }

    public void reset(LastRideConfirmationDialogView lastrideconfirmationdialogview)
    {
        lastrideconfirmationdialogview.passengerPhotoListView = null;
        lastrideconfirmationdialogview.confirmLastRideButton = null;
    }

    public ()
    {
    }
}

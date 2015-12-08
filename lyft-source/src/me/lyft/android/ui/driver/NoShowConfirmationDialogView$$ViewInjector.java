// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.driver:
//            NoShowConfirmationDialogView

public class 
    implements butterknife..ViewInjector
{

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (NoShowConfirmationDialogView)obj, obj1);
    }

    public void inject(butterknife..ViewInjector viewinjector, NoShowConfirmationDialogView noshowconfirmationdialogview, Object obj)
    {
        noshowconfirmationdialogview.passengerNoShowImage = (ImageView)viewinjector.passengerNoShowImage((View)viewinjector.passengerNoShowImage(obj, 0x7f0d013e, "field 'passengerNoShowImage'"), 0x7f0d013e, "field 'passengerNoShowImage'");
        noshowconfirmationdialogview.passengerNameTextView = (TextView)viewinjector.passengerNameTextView((View)viewinjector.passengerNameTextView(obj, 0x7f0d013f, "field 'passengerNameTextView'"), 0x7f0d013f, "field 'passengerNameTextView'");
        noshowconfirmationdialogview.passengerNoShowButton = (Button)viewinjector.passengerNoShowButton((View)viewinjector.passengerNoShowButton(obj, 0x7f0d0140, "field 'passengerNoShowButton'"), 0x7f0d0140, "field 'passengerNoShowButton'");
        noshowconfirmationdialogview.dismissButton = (Button)viewinjector.dismissButton((View)viewinjector.dismissButton(obj, 0x7f0d0141, "field 'dismissButton'"), 0x7f0d0141, "field 'dismissButton'");
    }

    public volatile void reset(Object obj)
    {
        reset((NoShowConfirmationDialogView)obj);
    }

    public void reset(NoShowConfirmationDialogView noshowconfirmationdialogview)
    {
        noshowconfirmationdialogview.passengerNoShowImage = null;
        noshowconfirmationdialogview.passengerNameTextView = null;
        noshowconfirmationdialogview.passengerNoShowButton = null;
        noshowconfirmationdialogview.dismissButton = null;
    }

    public ()
    {
    }
}

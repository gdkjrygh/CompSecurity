// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.passenger:
//            ConfirmPickupLocationDialogView

public class 
    implements butterknife.ew..ViewInjector
{

    public volatile void inject(butterknife.ew..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (ConfirmPickupLocationDialogView)obj, obj1);
    }

    public void inject(butterknife.ew..ViewInjector viewinjector, ConfirmPickupLocationDialogView confirmpickuplocationdialogview, Object obj)
    {
        confirmpickuplocationdialogview.addressNameView = (TextView)viewinjector.addressNameView((View)viewinjector.addressNameView(obj, 0x7f0d013c, "field 'addressNameView'"), 0x7f0d013c, "field 'addressNameView'");
        confirmpickuplocationdialogview.confirmPickupButton = (Button)viewinjector.confirmPickupButton((View)viewinjector.confirmPickupButton(obj, 0x7f0d013d, "field 'confirmPickupButton'"), 0x7f0d013d, "field 'confirmPickupButton'");
        confirmpickuplocationdialogview.cancelButton = (Button)viewinjector.cancelButton((View)viewinjector.cancelButton(obj, 0x7f0d00b2, "field 'cancelButton'"), 0x7f0d00b2, "field 'cancelButton'");
    }

    public volatile void reset(Object obj)
    {
        reset((ConfirmPickupLocationDialogView)obj);
    }

    public void reset(ConfirmPickupLocationDialogView confirmpickuplocationdialogview)
    {
        confirmpickuplocationdialogview.addressNameView = null;
        confirmpickuplocationdialogview.confirmPickupButton = null;
        confirmpickuplocationdialogview.cancelButton = null;
    }

    public ()
    {
    }
}

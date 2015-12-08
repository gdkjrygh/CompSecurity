// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import android.widget.Button;

// Referenced classes of package me.lyft.android.ui.passenger:
//            CourierBeReadyOutsideDialogView

public class 
    implements butterknife.ew..ViewInjector
{

    public volatile void inject(butterknife.ew..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (CourierBeReadyOutsideDialogView)obj, obj1);
    }

    public void inject(butterknife.ew..ViewInjector viewinjector, CourierBeReadyOutsideDialogView courierbereadyoutsidedialogview, Object obj)
    {
        courierbereadyoutsidedialogview.okButton = (Button)viewinjector.okButton((View)viewinjector.okButton(obj, 0x7f0d007f, "field 'okButton'"), 0x7f0d007f, "field 'okButton'");
    }

    public volatile void reset(Object obj)
    {
        reset((CourierBeReadyOutsideDialogView)obj);
    }

    public void reset(CourierBeReadyOutsideDialogView courierbereadyoutsidedialogview)
    {
        courierbereadyoutsidedialogview.okButton = null;
    }

    public ()
    {
    }
}

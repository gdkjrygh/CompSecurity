// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import android.widget.Button;

// Referenced classes of package me.lyft.android.ui.driver:
//            LastRideDescriptionDialogView

public class 
    implements butterknife..ViewInjector
{

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (LastRideDescriptionDialogView)obj, obj1);
    }

    public void inject(butterknife..ViewInjector viewinjector, LastRideDescriptionDialogView lastridedescriptiondialogview, Object obj)
    {
        lastridedescriptiondialogview.okButton = (Button)viewinjector.okButton((View)viewinjector.okButton(obj, 0x7f0d014c, "field 'okButton'"), 0x7f0d014c, "field 'okButton'");
    }

    public volatile void reset(Object obj)
    {
        reset((LastRideDescriptionDialogView)obj);
    }

    public void reset(LastRideDescriptionDialogView lastridedescriptiondialogview)
    {
        lastridedescriptiondialogview.okButton = null;
    }

    public ()
    {
    }
}

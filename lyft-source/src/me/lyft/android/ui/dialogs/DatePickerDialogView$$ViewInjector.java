// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            DatePickerDialogView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (DatePickerDialogView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, DatePickerDialogView datepickerdialogview, Object obj)
    {
        datepickerdialogview.datePicker = (DatePicker)viewinjector.datePicker((View)viewinjector.datePicker(obj, 0x7f0d016d, "field 'datePicker'"), 0x7f0d016d, "field 'datePicker'");
        datepickerdialogview.okButton = (Button)viewinjector.okButton((View)viewinjector.okButton(obj, 0x7f0d014c, "field 'okButton'"), 0x7f0d014c, "field 'okButton'");
    }

    public volatile void reset(Object obj)
    {
        reset((DatePickerDialogView)obj);
    }

    public void reset(DatePickerDialogView datepickerdialogview)
    {
        datepickerdialogview.datePicker = null;
        datepickerdialogview.okButton = null;
    }

    public ()
    {
    }
}

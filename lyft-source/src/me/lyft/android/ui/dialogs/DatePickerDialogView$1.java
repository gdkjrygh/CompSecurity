// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import android.view.View;
import android.widget.DatePicker;
import me.lyft.android.rx.MessageBus;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            DatePickerDialogView

class this._cls0
    implements android.view.rDialogView._cls1
{

    final DatePickerDialogView this$0;

    public void onClick(View view)
    {
        bus.post(me/lyft/android/ui/dialogs/DatePickerDialogView$DateSelectedEvent, new teSelectedEventArgs(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth()));
    }

    teSelectedEventArgs()
    {
        this$0 = DatePickerDialogView.this;
        super();
    }
}

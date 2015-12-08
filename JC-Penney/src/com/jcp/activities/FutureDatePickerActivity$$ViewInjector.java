// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;

// Referenced classes of package com.jcp.activities:
//            FutureDatePickerActivity, o, p

public class 
    implements butterknife.jector
{

    public void inject(butterknife.jector jector, FutureDatePickerActivity futuredatepickeractivity, Object obj)
    {
        futuredatepickeractivity.datePicker = (DatePicker)jector.ker((View)jector.ker(obj, 0x7f0e0146, "field 'datePicker'"), 0x7f0e0146, "field 'datePicker'");
        futuredatepickeractivity.timePicker = (TimePicker)jector.ker((View)jector.ker(obj, 0x7f0e0147, "field 'timePicker'"), 0x7f0e0147, "field 'timePicker'");
        ((View)jector.ker(obj, 0x7f0e0148, "method 'onCancel'")).setOnClickListener(new o(this, futuredatepickeractivity));
        ((View)jector.jector(obj, 0x7f0e0149, "method 'onSet'")).setOnClickListener(new p(this, futuredatepickeractivity));
    }

    public volatile void inject(butterknife.jector jector, Object obj, Object obj1)
    {
        inject(jector, (FutureDatePickerActivity)obj, obj1);
    }

    public void reset(FutureDatePickerActivity futuredatepickeractivity)
    {
        futuredatepickeractivity.datePicker = null;
        futuredatepickeractivity.timePicker = null;
    }

    public volatile void reset(Object obj)
    {
        reset((FutureDatePickerActivity)obj);
    }

    public ()
    {
    }
}

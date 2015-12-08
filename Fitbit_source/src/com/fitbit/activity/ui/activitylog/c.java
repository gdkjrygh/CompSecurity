// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.activitylog;

import android.widget.TimePicker;

// Referenced classes of package com.fitbit.activity.ui.activitylog:
//            ActivityLogFormFragment

class c
    implements android.app.TimePickerDialog.OnTimeSetListener
{

    private final ActivityLogFormFragment a;

    public c(ActivityLogFormFragment activitylogformfragment)
    {
        a = activitylogformfragment;
    }

    public void onTimeSet(TimePicker timepicker, int i, int j)
    {
        a.a(i, j);
    }
}

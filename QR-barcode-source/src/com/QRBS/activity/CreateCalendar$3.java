// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.widget.Button;
import android.widget.TimePicker;

// Referenced classes of package com.QRBS.activity:
//            CreateCalendar

class this._cls0
    implements android.app.OnTimeSetListener
{

    final CreateCalendar this$0;

    public void onTimeSet(TimePicker timepicker, int i, int j)
    {
        String s;
        if (i < 10)
        {
            timepicker = (new StringBuilder("0")).append(i).toString();
        } else
        {
            timepicker = (new StringBuilder()).append(i).toString();
        }
        if (j < 10)
        {
            s = (new StringBuilder("0")).append(j).toString();
        } else
        {
            s = (new StringBuilder()).append(j).toString();
        }
        time.setText((new StringBuilder()).append(timepicker).append(":").append(s).toString());
        flag[1] = true;
    }

    SetListener()
    {
        this$0 = CreateCalendar.this;
        super();
    }
}

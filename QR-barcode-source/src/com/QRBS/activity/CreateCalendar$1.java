// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.widget.Button;
import android.widget.DatePicker;

// Referenced classes of package com.QRBS.activity:
//            CreateCalendar

class this._cls0
    implements android.app.OnDateSetListener
{

    final CreateCalendar this$0;

    public void onDateSet(DatePicker datepicker, int i, int j, int k)
    {
        String s;
        if (j < 9)
        {
            datepicker = (new StringBuilder("0")).append(j + 1).toString();
        } else
        {
            datepicker = (new StringBuilder()).append(j + 1).toString();
        }
        if (k < 10)
        {
            s = (new StringBuilder("0")).append(k).toString();
        } else
        {
            s = (new StringBuilder()).append(k).toString();
        }
        datepicker = (new StringBuilder()).append(i).append("/").append(datepicker).append("/").append(s).toString();
        date.setText(datepicker);
        flag[0] = true;
    }

    SetListener()
    {
        this$0 = CreateCalendar.this;
        super();
    }
}

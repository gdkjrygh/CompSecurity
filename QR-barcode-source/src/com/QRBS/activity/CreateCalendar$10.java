// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.scannerfire.utils.EncodeUtils;
import com.scannerfire.utils.Utils;

// Referenced classes of package com.QRBS.activity:
//            CreateCalendar

class this._cls0
    implements android.view.er
{

    final CreateCalendar this$0;

    public void onClick(View view)
    {
        if (flag[0] && flag[1] && flag[2] && flag[3] && CreateCalendar.access$4(CreateCalendar.this))
        {
            (new EncodeUtils(CreateCalendar.this)).start(EncodeUtils.createCalendarString(CreateCalendar.access$5(CreateCalendar.this, what.getText()), CreateCalendar.access$5(CreateCalendar.this, where.getText()), CreateCalendar.access$5(CreateCalendar.this, des.getText()), CreateCalendar.access$5(CreateCalendar.this, date.getText()), CreateCalendar.access$5(CreateCalendar.this, time.getText()), CreateCalendar.access$5(CreateCalendar.this, date2.getText()), CreateCalendar.access$5(CreateCalendar.this, time2.getText())), (new StringBuilder(String.valueOf(what.getText().toString()))).append("\n").append(date.getText()).append(" ").append(time.getText()).append("\n").append(date2.getText()).append(" ").append(time2.getText()).append("\n").append(where.getText().toString()).append("\n").append(des.getText().toString()).toString());
            return;
        } else
        {
            Utils.showToastNotification(CreateCalendar.this, getString(0x7f0800fc));
            return;
        }
    }

    ()
    {
        this$0 = CreateCalendar.this;
        super();
    }
}

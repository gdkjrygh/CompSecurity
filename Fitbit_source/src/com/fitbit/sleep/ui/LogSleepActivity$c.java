// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.sleep.ui;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.fitbit.util.bq;
import com.fitbit.util.format.e;
import java.util.Date;

// Referenced classes of package com.fitbit.sleep.ui:
//            LogSleepActivity

private class d
{

    final LogSleepActivity a;
    private EditText b;
    private EditText c;
    private TextView d;

    void a(android.view.r r)
    {
        c.setOnClickListener(r);
    }

    void a(Date date)
    {
        c(date);
        b(date);
    }

    void a(boolean flag)
    {
        b.setEnabled(flag);
    }

    void b(android.view.r r)
    {
        b.setOnClickListener(r);
    }

    void b(Date date)
    {
        if (c != null)
        {
            date = e.m(a, date);
            c.setText(date);
        }
    }

    void c(Date date)
    {
        if (b != null)
        {
            date = e.j(a, date);
            b.setText(date);
        }
    }

    (LogSleepActivity logsleepactivity, int i, int j)
    {
        a = logsleepactivity;
        super();
        logsleepactivity = logsleepactivity.findViewById(i);
        c = (EditText)logsleepactivity.findViewById(0x7f11045d);
        c.setId(bq.a());
        b = (EditText)logsleepactivity.findViewById(0x7f11045c);
        b.setId(bq.a());
        d = (TextView)logsleepactivity.findViewById(0x7f11045b);
        d.setId(bq.a());
        d.setText(j);
    }
}

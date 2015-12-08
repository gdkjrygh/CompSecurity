// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.content.Context;
import android.util.SparseIntArray;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

// Referenced classes of package com.fitbit.ui:
//            WeekDaySelectionView

private static class calendar extends DateFormat
{

    private static final SparseIntArray a;
    private static final long serialVersionUID = 0x953a319656cbb4dfL;
    private Calendar calendar;
    private Context context;

    public StringBuffer format(Date date, StringBuffer stringbuffer, FieldPosition fieldposition)
    {
        calendar.setTime(date);
        int i = calendar.get(7);
        i = a.get(i, 0);
        if (i != 0)
        {
            return new StringBuffer(context.getString(i));
        } else
        {
            return new StringBuffer();
        }
    }

    public Date parse(String s, ParsePosition parseposition)
    {
        return null;
    }

    static 
    {
        a = new SparseIntArray();
        a.put(2, 0x7f080407);
        a.put(3, 0x7f08055f);
        a.put(5, 0x7f080520);
        a.put(6, 0x7f08022e);
        a.put(1, 0x7f0804f9);
        a.put(7, 0x7f080498);
        a.put(4, 0x7f08058c);
    }

    public (Context context1)
    {
        context = context1.getApplicationContext();
        calendar = new GregorianCalendar();
    }
}

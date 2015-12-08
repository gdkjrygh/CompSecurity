// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.content.Context;
import com.fitbit.util.format.d;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// Referenced classes of package com.fitbit.util:
//            o, al

public static class ext
{

    private final DateFormat a;
    private final DateFormat b = new SimpleDateFormat("yyyy", al.a());
    private final Context c;

    public String a(Date date)
    {
        Calendar calendar = o.b(date.getTime());
        date = o.c(date.getTime());
        String s = b.format(com.fitbit.util.o.d().getTime());
        String s1 = b.format(date.getTime());
        if (calendar.equals(o.b(o.b().getTime())))
        {
            date = c.getString(0x7f08051e);
        } else
        if (!s1.equals(s))
        {
            date = String.format(c.getString(0x7f080237), new Object[] {
                a.format(calendar.getTime()), a.format(date.getTime()), b.format(date.getTime())
            });
        } else
        {
            date = String.format(c.getString(0x7f080236), new Object[] {
                a.format(calendar.getTime()), a.format(date.getTime())
            });
        }
        date.toUpperCase(al.a());
        return date;
    }

    public ext(Context context)
    {
        c = context;
        a = d.y(context);
    }
}

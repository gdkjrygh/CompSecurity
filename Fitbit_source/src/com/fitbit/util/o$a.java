// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.content.Context;
import android.text.format.DateUtils;
import com.fitbit.runtrack.Duration;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// Referenced classes of package com.fitbit.util:
//            o

public static class ext.getText
{

    private final SimpleDateFormat a = new SimpleDateFormat("EEE", Locale.getDefault());
    private final SimpleDateFormat b = new SimpleDateFormat("MMM d", Locale.getDefault());
    private final CharSequence c;
    private final Date d = new Date();

    public CharSequence a(Date date)
    {
        if (date.after(d))
        {
            return c;
        }
        if (Duration.a(date, d).b() > 168L)
        {
            return b.format(date);
        }
        if (!DateUtils.isToday(date.getTime()))
        {
            return a.format(date);
        } else
        {
            return c;
        }
    }

    public ext(Context context)
    {
        c = context.getText(0x7f080540);
    }
}

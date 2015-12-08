// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.format;

import com.fitbit.FitBitApplication;
import com.fitbit.util.o;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;

// Referenced classes of package com.fitbit.util.format:
//            e

public class StartEndWeekDateFormat extends Format
{

    private static final long serialVersionUID = 0x30ca4e825fadc6a5L;

    public StartEndWeekDateFormat()
    {
    }

    public StringBuffer format(Object obj, StringBuffer stringbuffer, FieldPosition fieldposition)
    {
        stringbuffer = (Date)obj;
        obj = o.b(stringbuffer.getTime()).getTime();
        stringbuffer = o.c(stringbuffer.getTime()).getTime();
        return new StringBuffer(e.b(FitBitApplication.a().getApplicationContext(), ((Date) (obj)), stringbuffer));
    }

    public Object parseObject(String s, ParsePosition parseposition)
    {
        return null;
    }
}

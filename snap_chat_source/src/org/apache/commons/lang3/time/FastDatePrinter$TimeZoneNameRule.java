// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.time;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package org.apache.commons.lang3.time:
//            FastDatePrinter

static class y
    implements y
{

    private final String mDaylight;
    private final Locale mLocale;
    private final String mStandard;
    private final int mStyle;

    public void appendTo(StringBuffer stringbuffer, Calendar calendar)
    {
        TimeZone timezone = calendar.getTimeZone();
        if (timezone.useDaylightTime() && calendar.get(16) != 0)
        {
            stringbuffer.append(FastDatePrinter.getTimeZoneDisplay(timezone, true, mStyle, mLocale));
            return;
        } else
        {
            stringbuffer.append(FastDatePrinter.getTimeZoneDisplay(timezone, false, mStyle, mLocale));
            return;
        }
    }

    public int estimateLength()
    {
        return Math.max(mStandard.length(), mDaylight.length());
    }

    (TimeZone timezone, Locale locale, int i)
    {
        mLocale = locale;
        mStyle = i;
        mStandard = FastDatePrinter.getTimeZoneDisplay(timezone, false, i, locale);
        mDaylight = FastDatePrinter.getTimeZoneDisplay(timezone, true, i, locale);
    }
}

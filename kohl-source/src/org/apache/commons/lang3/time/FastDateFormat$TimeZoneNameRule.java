// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.time;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package org.apache.commons.lang3.time:
//            FastDateFormat

private static class y
    implements y
{

    private final String mDaylight;
    private final String mStandard;
    private final TimeZone mTimeZone;

    public void appendTo(StringBuffer stringbuffer, Calendar calendar)
    {
        if (mTimeZone.useDaylightTime() && calendar.get(16) != 0)
        {
            stringbuffer.append(mDaylight);
            return;
        } else
        {
            stringbuffer.append(mStandard);
            return;
        }
    }

    public int estimateLength()
    {
        return Math.max(mStandard.length(), mDaylight.length());
    }

    (TimeZone timezone, Locale locale, int i)
    {
        mTimeZone = timezone;
        mStandard = FastDateFormat.getTimeZoneDisplay(timezone, false, i, locale);
        mDaylight = FastDateFormat.getTimeZoneDisplay(timezone, true, i, locale);
    }
}

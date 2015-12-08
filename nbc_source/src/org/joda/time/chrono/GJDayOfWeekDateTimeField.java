// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.field.PreciseDurationDateTimeField;

// Referenced classes of package org.joda.time.chrono:
//            BasicChronology, GJLocaleSymbols

final class GJDayOfWeekDateTimeField extends PreciseDurationDateTimeField
{

    private static final long serialVersionUID = 0xca75d17ba970bc64L;
    private final BasicChronology iChronology;

    GJDayOfWeekDateTimeField(BasicChronology basicchronology, DurationField durationfield)
    {
        super(DateTimeFieldType.dayOfWeek(), durationfield);
        iChronology = basicchronology;
    }

    private Object readResolve()
    {
        return iChronology.dayOfWeek();
    }

    protected int convertText(String s, Locale locale)
    {
        return GJLocaleSymbols.forLocale(locale).dayOfWeekTextToValue(s);
    }

    public int get(long l)
    {
        return iChronology.getDayOfWeek(l);
    }

    public String getAsShortText(int i, Locale locale)
    {
        return GJLocaleSymbols.forLocale(locale).dayOfWeekValueToShortText(i);
    }

    public String getAsText(int i, Locale locale)
    {
        return GJLocaleSymbols.forLocale(locale).dayOfWeekValueToText(i);
    }

    public int getMaximumShortTextLength(Locale locale)
    {
        return GJLocaleSymbols.forLocale(locale).getDayOfWeekMaxShortTextLength();
    }

    public int getMaximumTextLength(Locale locale)
    {
        return GJLocaleSymbols.forLocale(locale).getDayOfWeekMaxTextLength();
    }

    public int getMaximumValue()
    {
        return 7;
    }

    public int getMinimumValue()
    {
        return 1;
    }

    public DurationField getRangeDurationField()
    {
        return iChronology.weeks();
    }
}

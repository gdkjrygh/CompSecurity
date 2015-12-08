// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.UnsupportedDurationField;

// Referenced classes of package org.joda.time.chrono:
//            BasicChronology, GJLocaleSymbols

final class GJEraDateTimeField extends BaseDateTimeField
{

    private static final long serialVersionUID = 0x3adb02c66a0dae08L;
    private final BasicChronology iChronology;

    GJEraDateTimeField(BasicChronology basicchronology)
    {
        super(DateTimeFieldType.era());
        iChronology = basicchronology;
    }

    private Object readResolve()
    {
        return iChronology.era();
    }

    public int get(long l)
    {
        return iChronology.getYear(l) > 0 ? 1 : 0;
    }

    public String getAsText(int i, Locale locale)
    {
        return GJLocaleSymbols.forLocale(locale).eraValueToText(i);
    }

    public DurationField getDurationField()
    {
        return UnsupportedDurationField.getInstance(DurationFieldType.eras());
    }

    public int getMaximumTextLength(Locale locale)
    {
        return GJLocaleSymbols.forLocale(locale).getEraMaxTextLength();
    }

    public int getMaximumValue()
    {
        return 1;
    }

    public int getMinimumValue()
    {
        return 0;
    }

    public DurationField getRangeDurationField()
    {
        return null;
    }

    public boolean isLenient()
    {
        return false;
    }

    public long roundCeiling(long l)
    {
        if (get(l) == 0)
        {
            return iChronology.setYear(0L, 1);
        } else
        {
            return 0x7fffffffffffffffL;
        }
    }

    public long roundFloor(long l)
    {
        if (get(l) == 1)
        {
            return iChronology.setYear(0L, 1);
        } else
        {
            return 0x8000000000000000L;
        }
    }

    public long roundHalfCeiling(long l)
    {
        return roundFloor(l);
    }

    public long roundHalfEven(long l)
    {
        return roundFloor(l);
    }

    public long roundHalfFloor(long l)
    {
        return roundFloor(l);
    }

    public long set(long l, int i)
    {
        FieldUtils.verifyValueBounds(this, i, 0, 1);
        long l1 = l;
        if (get(l) != i)
        {
            i = iChronology.getYear(l);
            l1 = iChronology.setYear(l, -i);
        }
        return l1;
    }

    public long set(long l, String s, Locale locale)
    {
        return set(l, GJLocaleSymbols.forLocale(locale).eraTextToValue(s));
    }
}

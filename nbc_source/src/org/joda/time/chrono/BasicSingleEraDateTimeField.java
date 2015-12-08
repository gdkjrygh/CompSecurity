// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.UnsupportedDurationField;

final class BasicSingleEraDateTimeField extends BaseDateTimeField
{

    private static final int ERA_VALUE = 1;
    private final String iEraText;

    BasicSingleEraDateTimeField(String s)
    {
        super(DateTimeFieldType.era());
        iEraText = s;
    }

    public int get(long l)
    {
        return 1;
    }

    public String getAsText(int i, Locale locale)
    {
        return iEraText;
    }

    public DurationField getDurationField()
    {
        return UnsupportedDurationField.getInstance(DurationFieldType.eras());
    }

    public int getMaximumTextLength(Locale locale)
    {
        return iEraText.length();
    }

    public int getMaximumValue()
    {
        return 1;
    }

    public int getMinimumValue()
    {
        return 1;
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
        return 0x7fffffffffffffffL;
    }

    public long roundFloor(long l)
    {
        return 0x8000000000000000L;
    }

    public long roundHalfCeiling(long l)
    {
        return 0x8000000000000000L;
    }

    public long roundHalfEven(long l)
    {
        return 0x8000000000000000L;
    }

    public long roundHalfFloor(long l)
    {
        return 0x8000000000000000L;
    }

    public long set(long l, int i)
    {
        FieldUtils.verifyValueBounds(this, i, 1, 1);
        return l;
    }

    public long set(long l, String s, Locale locale)
    {
        if (!iEraText.equals(s) && !"1".equals(s))
        {
            throw new IllegalFieldValueException(DateTimeFieldType.era(), s);
        } else
        {
            return l;
        }
    }
}

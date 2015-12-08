// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.field;

import java.io.Serializable;
import java.util.Locale;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;

public class DelegatedDateTimeField extends DateTimeField
    implements Serializable
{

    private static final long serialVersionUID = 0xbe5b1480cbd48399L;
    private final DateTimeField iField;
    private final DurationField iRangeDurationField;
    private final DateTimeFieldType iType;

    public DelegatedDateTimeField(DateTimeField datetimefield)
    {
        this(datetimefield, null);
    }

    public DelegatedDateTimeField(DateTimeField datetimefield, DateTimeFieldType datetimefieldtype)
    {
        this(datetimefield, null, datetimefieldtype);
    }

    public DelegatedDateTimeField(DateTimeField datetimefield, DurationField durationfield, DateTimeFieldType datetimefieldtype)
    {
        if (datetimefield == null)
        {
            throw new IllegalArgumentException("The field must not be null");
        }
        iField = datetimefield;
        iRangeDurationField = durationfield;
        durationfield = datetimefieldtype;
        if (datetimefieldtype == null)
        {
            durationfield = datetimefield.getType();
        }
        iType = durationfield;
    }

    public long add(long l, int i)
    {
        return iField.add(l, i);
    }

    public long add(long l, long l1)
    {
        return iField.add(l, l1);
    }

    public int[] add(ReadablePartial readablepartial, int i, int ai[], int j)
    {
        return iField.add(readablepartial, i, ai, j);
    }

    public long addWrapField(long l, int i)
    {
        return iField.addWrapField(l, i);
    }

    public int[] addWrapField(ReadablePartial readablepartial, int i, int ai[], int j)
    {
        return iField.addWrapField(readablepartial, i, ai, j);
    }

    public int[] addWrapPartial(ReadablePartial readablepartial, int i, int ai[], int j)
    {
        return iField.addWrapPartial(readablepartial, i, ai, j);
    }

    public int get(long l)
    {
        return iField.get(l);
    }

    public String getAsShortText(int i, Locale locale)
    {
        return iField.getAsShortText(i, locale);
    }

    public String getAsShortText(long l)
    {
        return iField.getAsShortText(l);
    }

    public String getAsShortText(long l, Locale locale)
    {
        return iField.getAsShortText(l, locale);
    }

    public String getAsShortText(ReadablePartial readablepartial, int i, Locale locale)
    {
        return iField.getAsShortText(readablepartial, i, locale);
    }

    public String getAsShortText(ReadablePartial readablepartial, Locale locale)
    {
        return iField.getAsShortText(readablepartial, locale);
    }

    public String getAsText(int i, Locale locale)
    {
        return iField.getAsText(i, locale);
    }

    public String getAsText(long l)
    {
        return iField.getAsText(l);
    }

    public String getAsText(long l, Locale locale)
    {
        return iField.getAsText(l, locale);
    }

    public String getAsText(ReadablePartial readablepartial, int i, Locale locale)
    {
        return iField.getAsText(readablepartial, i, locale);
    }

    public String getAsText(ReadablePartial readablepartial, Locale locale)
    {
        return iField.getAsText(readablepartial, locale);
    }

    public int getDifference(long l, long l1)
    {
        return iField.getDifference(l, l1);
    }

    public long getDifferenceAsLong(long l, long l1)
    {
        return iField.getDifferenceAsLong(l, l1);
    }

    public DurationField getDurationField()
    {
        return iField.getDurationField();
    }

    public int getLeapAmount(long l)
    {
        return iField.getLeapAmount(l);
    }

    public DurationField getLeapDurationField()
    {
        return iField.getLeapDurationField();
    }

    public int getMaximumShortTextLength(Locale locale)
    {
        return iField.getMaximumShortTextLength(locale);
    }

    public int getMaximumTextLength(Locale locale)
    {
        return iField.getMaximumTextLength(locale);
    }

    public int getMaximumValue()
    {
        return iField.getMaximumValue();
    }

    public int getMaximumValue(long l)
    {
        return iField.getMaximumValue(l);
    }

    public int getMaximumValue(ReadablePartial readablepartial)
    {
        return iField.getMaximumValue(readablepartial);
    }

    public int getMaximumValue(ReadablePartial readablepartial, int ai[])
    {
        return iField.getMaximumValue(readablepartial, ai);
    }

    public int getMinimumValue()
    {
        return iField.getMinimumValue();
    }

    public int getMinimumValue(long l)
    {
        return iField.getMinimumValue(l);
    }

    public int getMinimumValue(ReadablePartial readablepartial)
    {
        return iField.getMinimumValue(readablepartial);
    }

    public int getMinimumValue(ReadablePartial readablepartial, int ai[])
    {
        return iField.getMinimumValue(readablepartial, ai);
    }

    public String getName()
    {
        return iType.getName();
    }

    public DurationField getRangeDurationField()
    {
        if (iRangeDurationField != null)
        {
            return iRangeDurationField;
        } else
        {
            return iField.getRangeDurationField();
        }
    }

    public DateTimeFieldType getType()
    {
        return iType;
    }

    public final DateTimeField getWrappedField()
    {
        return iField;
    }

    public boolean isLeap(long l)
    {
        return iField.isLeap(l);
    }

    public boolean isLenient()
    {
        return iField.isLenient();
    }

    public boolean isSupported()
    {
        return iField.isSupported();
    }

    public long remainder(long l)
    {
        return iField.remainder(l);
    }

    public long roundCeiling(long l)
    {
        return iField.roundCeiling(l);
    }

    public long roundFloor(long l)
    {
        return iField.roundFloor(l);
    }

    public long roundHalfCeiling(long l)
    {
        return iField.roundHalfCeiling(l);
    }

    public long roundHalfEven(long l)
    {
        return iField.roundHalfEven(l);
    }

    public long roundHalfFloor(long l)
    {
        return iField.roundHalfFloor(l);
    }

    public long set(long l, int i)
    {
        return iField.set(l, i);
    }

    public long set(long l, String s)
    {
        return iField.set(l, s);
    }

    public long set(long l, String s, Locale locale)
    {
        return iField.set(l, s, locale);
    }

    public int[] set(ReadablePartial readablepartial, int i, int ai[], int j)
    {
        return iField.set(readablepartial, i, ai, j);
    }

    public int[] set(ReadablePartial readablepartial, int i, int ai[], String s, Locale locale)
    {
        return iField.set(readablepartial, i, ai, s, locale);
    }

    public String toString()
    {
        return (new StringBuilder()).append("DateTimeField[").append(getName()).append(']').toString();
    }
}

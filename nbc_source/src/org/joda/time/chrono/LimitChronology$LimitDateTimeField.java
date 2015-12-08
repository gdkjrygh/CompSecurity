// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.DateTimeField;
import org.joda.time.DurationField;
import org.joda.time.field.DecoratedDateTimeField;

// Referenced classes of package org.joda.time.chrono:
//            LimitChronology

private class iLeapDurationField extends DecoratedDateTimeField
{

    private static final long serialVersionUID = 0xde340d6a9a359190L;
    private final DurationField iDurationField;
    private final DurationField iLeapDurationField;
    private final DurationField iRangeDurationField;
    final LimitChronology this$0;

    public long add(long l, int i)
    {
        checkLimits(l, null);
        l = getWrappedField().add(l, i);
        checkLimits(l, "resulting");
        return l;
    }

    public long add(long l, long l1)
    {
        checkLimits(l, null);
        l = getWrappedField().add(l, l1);
        checkLimits(l, "resulting");
        return l;
    }

    public long addWrapField(long l, int i)
    {
        checkLimits(l, null);
        l = getWrappedField().addWrapField(l, i);
        checkLimits(l, "resulting");
        return l;
    }

    public int get(long l)
    {
        checkLimits(l, null);
        return getWrappedField().get(l);
    }

    public String getAsShortText(long l, Locale locale)
    {
        checkLimits(l, null);
        return getWrappedField().getAsShortText(l, locale);
    }

    public String getAsText(long l, Locale locale)
    {
        checkLimits(l, null);
        return getWrappedField().getAsText(l, locale);
    }

    public int getDifference(long l, long l1)
    {
        checkLimits(l, "minuend");
        checkLimits(l1, "subtrahend");
        return getWrappedField().getDifference(l, l1);
    }

    public long getDifferenceAsLong(long l, long l1)
    {
        checkLimits(l, "minuend");
        checkLimits(l1, "subtrahend");
        return getWrappedField().getDifferenceAsLong(l, l1);
    }

    public final DurationField getDurationField()
    {
        return iDurationField;
    }

    public int getLeapAmount(long l)
    {
        checkLimits(l, null);
        return getWrappedField().getLeapAmount(l);
    }

    public final DurationField getLeapDurationField()
    {
        return iLeapDurationField;
    }

    public int getMaximumShortTextLength(Locale locale)
    {
        return getWrappedField().getMaximumShortTextLength(locale);
    }

    public int getMaximumTextLength(Locale locale)
    {
        return getWrappedField().getMaximumTextLength(locale);
    }

    public int getMaximumValue(long l)
    {
        checkLimits(l, null);
        return getWrappedField().getMaximumValue(l);
    }

    public int getMinimumValue(long l)
    {
        checkLimits(l, null);
        return getWrappedField().getMinimumValue(l);
    }

    public final DurationField getRangeDurationField()
    {
        return iRangeDurationField;
    }

    public boolean isLeap(long l)
    {
        checkLimits(l, null);
        return getWrappedField().isLeap(l);
    }

    public long remainder(long l)
    {
        checkLimits(l, null);
        l = getWrappedField().remainder(l);
        checkLimits(l, "resulting");
        return l;
    }

    public long roundCeiling(long l)
    {
        checkLimits(l, null);
        l = getWrappedField().roundCeiling(l);
        checkLimits(l, "resulting");
        return l;
    }

    public long roundFloor(long l)
    {
        checkLimits(l, null);
        l = getWrappedField().roundFloor(l);
        checkLimits(l, "resulting");
        return l;
    }

    public long roundHalfCeiling(long l)
    {
        checkLimits(l, null);
        l = getWrappedField().roundHalfCeiling(l);
        checkLimits(l, "resulting");
        return l;
    }

    public long roundHalfEven(long l)
    {
        checkLimits(l, null);
        l = getWrappedField().roundHalfEven(l);
        checkLimits(l, "resulting");
        return l;
    }

    public long roundHalfFloor(long l)
    {
        checkLimits(l, null);
        l = getWrappedField().roundHalfFloor(l);
        checkLimits(l, "resulting");
        return l;
    }

    public long set(long l, int i)
    {
        checkLimits(l, null);
        l = getWrappedField().set(l, i);
        checkLimits(l, "resulting");
        return l;
    }

    public long set(long l, String s, Locale locale)
    {
        checkLimits(l, null);
        l = getWrappedField().set(l, s, locale);
        checkLimits(l, "resulting");
        return l;
    }

    (DateTimeField datetimefield, DurationField durationfield, DurationField durationfield1, DurationField durationfield2)
    {
        this$0 = LimitChronology.this;
        super(datetimefield, datetimefield.getType());
        iDurationField = durationfield;
        iRangeDurationField = durationfield1;
        iLeapDurationField = durationfield2;
    }
}

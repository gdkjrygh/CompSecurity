// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.field;

import java.io.Serializable;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationField;
import org.joda.time.Interval;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;

// Referenced classes of package org.joda.time.field:
//            FieldUtils

public abstract class AbstractReadableInstantFieldProperty
    implements Serializable
{

    private static final long serialVersionUID = 0x1b5b33e6c8f3f47dL;

    public AbstractReadableInstantFieldProperty()
    {
    }

    public int compareTo(ReadableInstant readableinstant)
    {
        if (readableinstant == null)
        {
            throw new IllegalArgumentException("The instant must not be null");
        }
        int i = get();
        int j = readableinstant.get(getFieldType());
        if (i < j)
        {
            return -1;
        }
        return i <= j ? 0 : 1;
    }

    public int compareTo(ReadablePartial readablepartial)
    {
        if (readablepartial == null)
        {
            throw new IllegalArgumentException("The partial must not be null");
        }
        int i = get();
        int j = readablepartial.get(getFieldType());
        if (i < j)
        {
            return -1;
        }
        return i <= j ? 0 : 1;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof AbstractReadableInstantFieldProperty))
            {
                return false;
            }
            obj = (AbstractReadableInstantFieldProperty)obj;
            if (get() != ((AbstractReadableInstantFieldProperty) (obj)).get() || !getFieldType().equals(((AbstractReadableInstantFieldProperty) (obj)).getFieldType()) || !FieldUtils.equals(getChronology(), ((AbstractReadableInstantFieldProperty) (obj)).getChronology()))
            {
                return false;
            }
        }
        return true;
    }

    public int get()
    {
        return getField().get(getMillis());
    }

    public String getAsShortText()
    {
        return getAsShortText(null);
    }

    public String getAsShortText(Locale locale)
    {
        return getField().getAsShortText(getMillis(), locale);
    }

    public String getAsString()
    {
        return Integer.toString(get());
    }

    public String getAsText()
    {
        return getAsText(null);
    }

    public String getAsText(Locale locale)
    {
        return getField().getAsText(getMillis(), locale);
    }

    protected Chronology getChronology()
    {
        throw new UnsupportedOperationException("The method getChronology() was added in v1.4 and needs to be implemented by subclasses of AbstractReadableInstantFieldProperty");
    }

    public int getDifference(ReadableInstant readableinstant)
    {
        if (readableinstant == null)
        {
            return getField().getDifference(getMillis(), DateTimeUtils.currentTimeMillis());
        } else
        {
            return getField().getDifference(getMillis(), readableinstant.getMillis());
        }
    }

    public long getDifferenceAsLong(ReadableInstant readableinstant)
    {
        if (readableinstant == null)
        {
            return getField().getDifferenceAsLong(getMillis(), DateTimeUtils.currentTimeMillis());
        } else
        {
            return getField().getDifferenceAsLong(getMillis(), readableinstant.getMillis());
        }
    }

    public DurationField getDurationField()
    {
        return getField().getDurationField();
    }

    public abstract DateTimeField getField();

    public DateTimeFieldType getFieldType()
    {
        return getField().getType();
    }

    public int getLeapAmount()
    {
        return getField().getLeapAmount(getMillis());
    }

    public DurationField getLeapDurationField()
    {
        return getField().getLeapDurationField();
    }

    public int getMaximumShortTextLength(Locale locale)
    {
        return getField().getMaximumShortTextLength(locale);
    }

    public int getMaximumTextLength(Locale locale)
    {
        return getField().getMaximumTextLength(locale);
    }

    public int getMaximumValue()
    {
        return getField().getMaximumValue(getMillis());
    }

    public int getMaximumValueOverall()
    {
        return getField().getMaximumValue();
    }

    protected abstract long getMillis();

    public int getMinimumValue()
    {
        return getField().getMinimumValue(getMillis());
    }

    public int getMinimumValueOverall()
    {
        return getField().getMinimumValue();
    }

    public String getName()
    {
        return getField().getName();
    }

    public DurationField getRangeDurationField()
    {
        return getField().getRangeDurationField();
    }

    public int hashCode()
    {
        return get() * 17 + getFieldType().hashCode() + getChronology().hashCode();
    }

    public boolean isLeap()
    {
        return getField().isLeap(getMillis());
    }

    public long remainder()
    {
        return getField().remainder(getMillis());
    }

    public Interval toInterval()
    {
        DateTimeField datetimefield = getField();
        long l = datetimefield.roundFloor(getMillis());
        return new Interval(l, datetimefield.add(l, 1), getChronology());
    }

    public String toString()
    {
        return (new StringBuilder()).append("Property[").append(getName()).append("]").toString();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.field;

import java.util.Locale;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;

// Referenced classes of package org.joda.time.field:
//            FieldUtils

public abstract class AbstractPartialFieldProperty
{

    protected AbstractPartialFieldProperty()
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
            throw new IllegalArgumentException("The instant must not be null");
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
            if (!(obj instanceof AbstractPartialFieldProperty))
            {
                return false;
            }
            obj = (AbstractPartialFieldProperty)obj;
            if (get() != ((AbstractPartialFieldProperty) (obj)).get() || getFieldType() != ((AbstractPartialFieldProperty) (obj)).getFieldType() || !FieldUtils.equals(getReadablePartial().getChronology(), ((AbstractPartialFieldProperty) (obj)).getReadablePartial().getChronology()))
            {
                return false;
            }
        }
        return true;
    }

    public abstract int get();

    public String getAsShortText()
    {
        return getAsShortText(null);
    }

    public String getAsShortText(Locale locale)
    {
        return getField().getAsShortText(getReadablePartial(), get(), locale);
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
        return getField().getAsText(getReadablePartial(), get(), locale);
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
        return getField().getMaximumValue(getReadablePartial());
    }

    public int getMaximumValueOverall()
    {
        return getField().getMaximumValue();
    }

    public int getMinimumValue()
    {
        return getField().getMinimumValue(getReadablePartial());
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

    protected abstract ReadablePartial getReadablePartial();

    public int hashCode()
    {
        return ((get() + 247) * 13 + getFieldType().hashCode()) * 13 + getReadablePartial().getChronology().hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("Property[").append(getName()).append("]").toString();
    }
}

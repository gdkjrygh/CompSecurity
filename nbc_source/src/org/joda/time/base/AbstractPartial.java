// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.base;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationFieldType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;

public abstract class AbstractPartial
    implements Comparable, ReadablePartial
{

    protected AbstractPartial()
    {
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((ReadablePartial)obj);
    }

    public int compareTo(ReadablePartial readablepartial)
    {
        if (this != readablepartial)
        {
            if (size() != readablepartial.size())
            {
                throw new ClassCastException("ReadablePartial objects must have matching field types");
            }
            int k = size();
            for (int i = 0; i < k; i++)
            {
                if (getFieldType(i) != readablepartial.getFieldType(i))
                {
                    throw new ClassCastException("ReadablePartial objects must have matching field types");
                }
            }

            k = size();
            int j = 0;
            while (j < k) 
            {
                if (getValue(j) > readablepartial.getValue(j))
                {
                    return 1;
                }
                if (getValue(j) < readablepartial.getValue(j))
                {
                    return -1;
                }
                j++;
            }
        }
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (this != obj) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!(obj instanceof ReadablePartial)) goto _L4; else goto _L3
_L3:
        obj = (ReadablePartial)obj;
        flag = flag1;
        if (size() != ((ReadablePartial) (obj)).size()) goto _L4; else goto _L5
_L5:
        int i;
        int j;
        j = size();
        i = 0;
_L8:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        flag = flag1;
        if (getValue(i) != ((ReadablePartial) (obj)).getValue(i)) goto _L4; else goto _L6
_L6:
        flag = flag1;
        if (getFieldType(i) != ((ReadablePartial) (obj)).getFieldType(i)) goto _L4; else goto _L7
_L7:
        i++;
          goto _L8
        return FieldUtils.equals(getChronology(), ((ReadablePartial) (obj)).getChronology());
    }

    public int get(DateTimeFieldType datetimefieldtype)
    {
        return getValue(indexOfSupported(datetimefieldtype));
    }

    public DateTimeField getField(int i)
    {
        return getField(i, getChronology());
    }

    protected abstract DateTimeField getField(int i, Chronology chronology);

    public DateTimeFieldType getFieldType(int i)
    {
        return getField(i, getChronology()).getType();
    }

    public DateTimeFieldType[] getFieldTypes()
    {
        DateTimeFieldType adatetimefieldtype[] = new DateTimeFieldType[size()];
        for (int i = 0; i < adatetimefieldtype.length; i++)
        {
            adatetimefieldtype[i] = getFieldType(i);
        }

        return adatetimefieldtype;
    }

    public DateTimeField[] getFields()
    {
        DateTimeField adatetimefield[] = new DateTimeField[size()];
        for (int i = 0; i < adatetimefield.length; i++)
        {
            adatetimefield[i] = getField(i);
        }

        return adatetimefield;
    }

    public int[] getValues()
    {
        int ai[] = new int[size()];
        for (int i = 0; i < ai.length; i++)
        {
            ai[i] = getValue(i);
        }

        return ai;
    }

    public int hashCode()
    {
        int j = 157;
        int i = 0;
        for (int k = size(); i < k; i++)
        {
            j = (j * 23 + getValue(i)) * 23 + getFieldType(i).hashCode();
        }

        return getChronology().hashCode() + j;
    }

    public int indexOf(DateTimeFieldType datetimefieldtype)
    {
        int i = 0;
        for (int j = size(); i < j; i++)
        {
            if (getFieldType(i) == datetimefieldtype)
            {
                return i;
            }
        }

        return -1;
    }

    protected int indexOf(DurationFieldType durationfieldtype)
    {
        int i = 0;
        for (int j = size(); i < j; i++)
        {
            if (getFieldType(i).getDurationType() == durationfieldtype)
            {
                return i;
            }
        }

        return -1;
    }

    protected int indexOfSupported(DateTimeFieldType datetimefieldtype)
    {
        int i = indexOf(datetimefieldtype);
        if (i == -1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Field '").append(datetimefieldtype).append("' is not supported").toString());
        } else
        {
            return i;
        }
    }

    protected int indexOfSupported(DurationFieldType durationfieldtype)
    {
        int i = indexOf(durationfieldtype);
        if (i == -1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Field '").append(durationfieldtype).append("' is not supported").toString());
        } else
        {
            return i;
        }
    }

    public boolean isAfter(ReadablePartial readablepartial)
    {
        if (readablepartial == null)
        {
            throw new IllegalArgumentException("Partial cannot be null");
        }
        return compareTo(readablepartial) > 0;
    }

    public boolean isBefore(ReadablePartial readablepartial)
    {
        if (readablepartial == null)
        {
            throw new IllegalArgumentException("Partial cannot be null");
        }
        return compareTo(readablepartial) < 0;
    }

    public boolean isEqual(ReadablePartial readablepartial)
    {
        if (readablepartial == null)
        {
            throw new IllegalArgumentException("Partial cannot be null");
        }
        return compareTo(readablepartial) == 0;
    }

    public boolean isSupported(DateTimeFieldType datetimefieldtype)
    {
        return indexOf(datetimefieldtype) != -1;
    }

    public DateTime toDateTime(ReadableInstant readableinstant)
    {
        Chronology chronology = DateTimeUtils.getInstantChronology(readableinstant);
        return new DateTime(chronology.set(this, DateTimeUtils.getInstantMillis(readableinstant)), chronology);
    }

    public String toString(DateTimeFormatter datetimeformatter)
    {
        if (datetimeformatter == null)
        {
            return toString();
        } else
        {
            return datetimeformatter.print(this);
        }
    }
}

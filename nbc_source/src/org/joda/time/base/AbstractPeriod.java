// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.base;

import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePeriod;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

public abstract class AbstractPeriod
    implements ReadablePeriod
{

    protected AbstractPeriod()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof ReadablePeriod))
            {
                return false;
            }
            obj = (ReadablePeriod)obj;
            if (size() != ((ReadablePeriod) (obj)).size())
            {
                return false;
            }
            int j = size();
            int i = 0;
            while (i < j) 
            {
                if (getValue(i) != ((ReadablePeriod) (obj)).getValue(i) || getFieldType(i) != ((ReadablePeriod) (obj)).getFieldType(i))
                {
                    return false;
                }
                i++;
            }
        }
        return true;
    }

    public int get(DurationFieldType durationfieldtype)
    {
        int i = indexOf(durationfieldtype);
        if (i == -1)
        {
            return 0;
        } else
        {
            return getValue(i);
        }
    }

    public DurationFieldType getFieldType(int i)
    {
        return getPeriodType().getFieldType(i);
    }

    public DurationFieldType[] getFieldTypes()
    {
        DurationFieldType adurationfieldtype[] = new DurationFieldType[size()];
        for (int i = 0; i < adurationfieldtype.length; i++)
        {
            adurationfieldtype[i] = getFieldType(i);
        }

        return adurationfieldtype;
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
        int j = 17;
        int i = 0;
        for (int k = size(); i < k; i++)
        {
            j = (j * 27 + getValue(i)) * 27 + getFieldType(i).hashCode();
        }

        return j;
    }

    public int indexOf(DurationFieldType durationfieldtype)
    {
        return getPeriodType().indexOf(durationfieldtype);
    }

    public boolean isSupported(DurationFieldType durationfieldtype)
    {
        return getPeriodType().isSupported(durationfieldtype);
    }

    public int size()
    {
        return getPeriodType().size();
    }

    public MutablePeriod toMutablePeriod()
    {
        return new MutablePeriod(this);
    }

    public Period toPeriod()
    {
        return new Period(this);
    }

    public String toString()
    {
        return ISOPeriodFormat.standard().print(this);
    }

    public String toString(PeriodFormatter periodformatter)
    {
        if (periodformatter == null)
        {
            return toString();
        } else
        {
            return periodformatter.print(this);
        }
    }
}

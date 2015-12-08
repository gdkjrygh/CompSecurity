// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.field;

import java.io.Serializable;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

public class DelegatedDurationField extends DurationField
    implements Serializable
{

    private static final long serialVersionUID = 0xb29c7e32f68706ebL;
    private final DurationField iField;
    private final DurationFieldType iType;

    protected DelegatedDurationField(DurationField durationfield)
    {
        this(durationfield, null);
    }

    protected DelegatedDurationField(DurationField durationfield, DurationFieldType durationfieldtype)
    {
        if (durationfield == null)
        {
            throw new IllegalArgumentException("The field must not be null");
        }
        iField = durationfield;
        DurationFieldType durationfieldtype1 = durationfieldtype;
        if (durationfieldtype == null)
        {
            durationfieldtype1 = durationfield.getType();
        }
        iType = durationfieldtype1;
    }

    public long add(long l, int i)
    {
        return iField.add(l, i);
    }

    public long add(long l, long l1)
    {
        return iField.add(l, l1);
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((DurationField)obj);
    }

    public int compareTo(DurationField durationfield)
    {
        return iField.compareTo(durationfield);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DelegatedDurationField)
        {
            return iField.equals(((DelegatedDurationField)obj).iField);
        } else
        {
            return false;
        }
    }

    public int getDifference(long l, long l1)
    {
        return iField.getDifference(l, l1);
    }

    public long getDifferenceAsLong(long l, long l1)
    {
        return iField.getDifferenceAsLong(l, l1);
    }

    public long getMillis(int i)
    {
        return iField.getMillis(i);
    }

    public long getMillis(int i, long l)
    {
        return iField.getMillis(i, l);
    }

    public long getMillis(long l)
    {
        return iField.getMillis(l);
    }

    public long getMillis(long l, long l1)
    {
        return iField.getMillis(l, l1);
    }

    public String getName()
    {
        return iType.getName();
    }

    public DurationFieldType getType()
    {
        return iType;
    }

    public long getUnitMillis()
    {
        return iField.getUnitMillis();
    }

    public int getValue(long l)
    {
        return iField.getValue(l);
    }

    public int getValue(long l, long l1)
    {
        return iField.getValue(l, l1);
    }

    public long getValueAsLong(long l)
    {
        return iField.getValueAsLong(l);
    }

    public long getValueAsLong(long l, long l1)
    {
        return iField.getValueAsLong(l, l1);
    }

    public final DurationField getWrappedField()
    {
        return iField;
    }

    public int hashCode()
    {
        return iField.hashCode() ^ iType.hashCode();
    }

    public boolean isPrecise()
    {
        return iField.isPrecise();
    }

    public boolean isSupported()
    {
        return iField.isSupported();
    }

    public String toString()
    {
        if (iType == null)
        {
            return iField.toString();
        } else
        {
            return (new StringBuilder()).append("DurationField[").append(iType).append(']').toString();
        }
    }
}

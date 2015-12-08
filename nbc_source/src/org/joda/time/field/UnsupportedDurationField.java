// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.field;

import java.io.Serializable;
import java.util.HashMap;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

public final class UnsupportedDurationField extends DurationField
    implements Serializable
{

    private static HashMap cCache;
    private static final long serialVersionUID = 0xa75116d2889f80d3L;
    private final DurationFieldType iType;

    private UnsupportedDurationField(DurationFieldType durationfieldtype)
    {
        iType = durationfieldtype;
    }

    public static UnsupportedDurationField getInstance(DurationFieldType durationfieldtype)
    {
        org/joda/time/field/UnsupportedDurationField;
        JVM INSTR monitorenter ;
        if (cCache != null) goto _L2; else goto _L1
_L1:
        cCache = new HashMap(7);
        UnsupportedDurationField unsupporteddurationfield = null;
_L4:
        UnsupportedDurationField unsupporteddurationfield1;
        unsupporteddurationfield1 = unsupporteddurationfield;
        if (unsupporteddurationfield != null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        unsupporteddurationfield1 = new UnsupportedDurationField(durationfieldtype);
        cCache.put(durationfieldtype, unsupporteddurationfield1);
        org/joda/time/field/UnsupportedDurationField;
        JVM INSTR monitorexit ;
        return unsupporteddurationfield1;
_L2:
        unsupporteddurationfield = (UnsupportedDurationField)cCache.get(durationfieldtype);
        if (true) goto _L4; else goto _L3
_L3:
        durationfieldtype;
        throw durationfieldtype;
    }

    private Object readResolve()
    {
        return getInstance(iType);
    }

    private UnsupportedOperationException unsupported()
    {
        return new UnsupportedOperationException((new StringBuilder()).append(iType).append(" field is unsupported").toString());
    }

    public long add(long l, int i)
    {
        throw unsupported();
    }

    public long add(long l, long l1)
    {
        throw unsupported();
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((DurationField)obj);
    }

    public int compareTo(DurationField durationfield)
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof UnsupportedDurationField)
            {
                obj = (UnsupportedDurationField)obj;
                if (((UnsupportedDurationField) (obj)).getName() == null)
                {
                    if (getName() != null)
                    {
                        return false;
                    }
                } else
                {
                    return ((UnsupportedDurationField) (obj)).getName().equals(getName());
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public int getDifference(long l, long l1)
    {
        throw unsupported();
    }

    public long getDifferenceAsLong(long l, long l1)
    {
        throw unsupported();
    }

    public long getMillis(int i)
    {
        throw unsupported();
    }

    public long getMillis(int i, long l)
    {
        throw unsupported();
    }

    public long getMillis(long l)
    {
        throw unsupported();
    }

    public long getMillis(long l, long l1)
    {
        throw unsupported();
    }

    public String getName()
    {
        return iType.getName();
    }

    public final DurationFieldType getType()
    {
        return iType;
    }

    public long getUnitMillis()
    {
        return 0L;
    }

    public int getValue(long l)
    {
        throw unsupported();
    }

    public int getValue(long l, long l1)
    {
        throw unsupported();
    }

    public long getValueAsLong(long l)
    {
        throw unsupported();
    }

    public long getValueAsLong(long l, long l1)
    {
        throw unsupported();
    }

    public int hashCode()
    {
        return getName().hashCode();
    }

    public boolean isPrecise()
    {
        return true;
    }

    public boolean isSupported()
    {
        return false;
    }

    public String toString()
    {
        return (new StringBuilder()).append("UnsupportedDurationField[").append(getName()).append(']').toString();
    }
}

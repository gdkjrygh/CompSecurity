// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.field;

import org.joda.time.DurationFieldType;

// Referenced classes of package org.joda.time.field:
//            BaseDurationField, FieldUtils

public class PreciseDurationField extends BaseDurationField
{

    private static final long serialVersionUID = 0x8c2c82ce195505fbL;
    private final long iUnitMillis;

    public PreciseDurationField(DurationFieldType durationfieldtype, long l)
    {
        super(durationfieldtype);
        iUnitMillis = l;
    }

    public long add(long l, int i)
    {
        return FieldUtils.safeAdd(l, (long)i * iUnitMillis);
    }

    public long add(long l, long l1)
    {
        return FieldUtils.safeAdd(l, FieldUtils.safeMultiply(l1, iUnitMillis));
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof PreciseDurationField)
            {
                if (getType() != ((PreciseDurationField) (obj = (PreciseDurationField)obj)).getType() || iUnitMillis != ((PreciseDurationField) (obj)).iUnitMillis)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public long getDifferenceAsLong(long l, long l1)
    {
        return FieldUtils.safeSubtract(l, l1) / iUnitMillis;
    }

    public long getMillis(int i, long l)
    {
        return (long)i * iUnitMillis;
    }

    public long getMillis(long l, long l1)
    {
        return FieldUtils.safeMultiply(l, iUnitMillis);
    }

    public final long getUnitMillis()
    {
        return iUnitMillis;
    }

    public long getValueAsLong(long l, long l1)
    {
        return l / iUnitMillis;
    }

    public int hashCode()
    {
        long l = iUnitMillis;
        return (int)(l ^ l >>> 32) + getType().hashCode();
    }

    public final boolean isPrecise()
    {
        return true;
    }
}

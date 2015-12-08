// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import org.joda.time.DurationField;
import org.joda.time.field.DecoratedDurationField;

// Referenced classes of package org.joda.time.chrono:
//            GJChronology

private static class iField extends DecoratedDurationField
{

    private static final long serialVersionUID = 0x38deeee7447e493cL;
    private final d iField;

    public long add(long l, int i)
    {
        return iField.add(l, i);
    }

    public long add(long l, long l1)
    {
        return iField.add(l, l1);
    }

    public int getDifference(long l, long l1)
    {
        return iField.getDifference(l, l1);
    }

    public long getDifferenceAsLong(long l, long l1)
    {
        return iField.getDifferenceAsLong(l, l1);
    }

    d(DurationField durationfield, d d)
    {
        super(durationfield, durationfield.getType());
        iField = d;
    }
}

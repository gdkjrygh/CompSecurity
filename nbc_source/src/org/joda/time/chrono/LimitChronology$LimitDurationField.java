// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import org.joda.time.DurationField;
import org.joda.time.field.DecoratedDurationField;

// Referenced classes of package org.joda.time.chrono:
//            LimitChronology

private class this._cls0 extends DecoratedDurationField
{

    private static final long serialVersionUID = 0x6fb4d99c50a123ccL;
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

    public long getMillis(int i, long l)
    {
        checkLimits(l, null);
        return getWrappedField().getMillis(i, l);
    }

    public long getMillis(long l, long l1)
    {
        checkLimits(l1, null);
        return getWrappedField().getMillis(l, l1);
    }

    public int getValue(long l, long l1)
    {
        checkLimits(l1, null);
        return getWrappedField().getValue(l, l1);
    }

    public long getValueAsLong(long l, long l1)
    {
        checkLimits(l1, null);
        return getWrappedField().getValueAsLong(l, l1);
    }

    (DurationField durationfield)
    {
        this$0 = LimitChronology.this;
        super(durationfield, durationfield.getType());
    }
}

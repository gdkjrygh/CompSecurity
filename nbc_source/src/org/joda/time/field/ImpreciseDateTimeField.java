// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.field;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

// Referenced classes of package org.joda.time.field:
//            BaseDateTimeField, FieldUtils, BaseDurationField

public abstract class ImpreciseDateTimeField extends BaseDateTimeField
{
    private final class LinkedDurationField extends BaseDurationField
    {

        private static final long serialVersionUID = 0xfd2be8b98605f64aL;
        final ImpreciseDateTimeField this$0;

        public long add(long l, int i)
        {
            return ImpreciseDateTimeField.this.add(l, i);
        }

        public long add(long l, long l1)
        {
            return ImpreciseDateTimeField.this.add(l, l1);
        }

        public int getDifference(long l, long l1)
        {
            return ImpreciseDateTimeField.this.getDifference(l, l1);
        }

        public long getDifferenceAsLong(long l, long l1)
        {
            return ImpreciseDateTimeField.this.getDifferenceAsLong(l, l1);
        }

        public long getMillis(int i, long l)
        {
            return ImpreciseDateTimeField.this.add(l, i) - l;
        }

        public long getMillis(long l, long l1)
        {
            return ImpreciseDateTimeField.this.add(l1, l) - l1;
        }

        public long getUnitMillis()
        {
            return iUnitMillis;
        }

        public int getValue(long l, long l1)
        {
            return ImpreciseDateTimeField.this.getDifference(l1 + l, l1);
        }

        public long getValueAsLong(long l, long l1)
        {
            return ImpreciseDateTimeField.this.getDifferenceAsLong(l1 + l, l1);
        }

        public boolean isPrecise()
        {
            return false;
        }

        LinkedDurationField(DurationFieldType durationfieldtype)
        {
            this$0 = ImpreciseDateTimeField.this;
            super(durationfieldtype);
        }
    }


    private static final long serialVersionUID = 0x63caa39367f81d54L;
    private final DurationField iDurationField;
    final long iUnitMillis;

    public ImpreciseDateTimeField(DateTimeFieldType datetimefieldtype, long l)
    {
        super(datetimefieldtype);
        iUnitMillis = l;
        iDurationField = new LinkedDurationField(datetimefieldtype.getDurationType());
    }

    public abstract long add(long l, int i);

    public abstract long add(long l, long l1);

    public abstract int get(long l);

    public int getDifference(long l, long l1)
    {
        return FieldUtils.safeToInt(getDifferenceAsLong(l, l1));
    }

    public long getDifferenceAsLong(long l, long l1)
    {
        long l3;
        if (l < l1)
        {
            l3 = -getDifferenceAsLong(l1, l);
        } else
        {
            long l2 = (l - l1) / iUnitMillis;
            if (add(l1, l2) < l)
            {
                do
                {
                    l3 = l2 + 1L;
                    l2 = l3;
                } while (add(l1, l3) <= l);
                return l3 - 1L;
            }
            l3 = l2;
            if (add(l1, l2) > l)
            {
                long l4;
                do
                {
                    l4 = l2 - 1L;
                    l2 = l4;
                } while (add(l1, l4) > l);
                return l4;
            }
        }
        return l3;
    }

    public final DurationField getDurationField()
    {
        return iDurationField;
    }

    protected final long getDurationUnitMillis()
    {
        return iUnitMillis;
    }

    public abstract DurationField getRangeDurationField();

    public abstract long roundFloor(long l);

    public abstract long set(long l, int i);
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.field;

import org.joda.time.DurationFieldType;

// Referenced classes of package org.joda.time.field:
//            BaseDurationField, ImpreciseDateTimeField

private final class this._cls0 extends BaseDurationField
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

    (DurationFieldType durationfieldtype)
    {
        this$0 = ImpreciseDateTimeField.this;
        super(durationfieldtype);
    }
}

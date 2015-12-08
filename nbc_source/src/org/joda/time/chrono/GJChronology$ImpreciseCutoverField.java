// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import org.joda.time.DateTimeField;
import org.joda.time.DurationField;

// Referenced classes of package org.joda.time.chrono:
//            GJChronology, GregorianChronology

private final class iRangeDurationField extends iRangeDurationField
{

    private static final long serialVersionUID = 0x2f53a32d270c62f9L;
    final GJChronology this$0;

    public long add(long l, int i)
    {
        if (l < iCutover) goto _L2; else goto _L1
_L1:
        long l1;
        l1 = iGregorianField.add(l, i);
        l = l1;
        if (l1 >= iCutover) goto _L4; else goto _L3
_L3:
        l = l1;
        if (GJChronology.access$000(GJChronology.this) + l1 >= iCutover) goto _L4; else goto _L5
_L5:
        if (!iConvertByWeekyear) goto _L7; else goto _L6
_L6:
        l = l1;
        if (GJChronology.access$100(GJChronology.this).weekyear().get(l1) <= 0)
        {
            l = GJChronology.access$100(GJChronology.this).weekyear().add(l1, -1);
        }
_L11:
        l = gregorianToJulian(l);
_L4:
        return l;
_L7:
        l = l1;
        if (GJChronology.access$100(GJChronology.this).year().get(l1) <= 0)
        {
            l = GJChronology.access$100(GJChronology.this).year().add(l1, -1);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        l1 = iJulianField.add(l, i);
        l = l1;
        if (l1 < iCutover) goto _L4; else goto _L8
_L8:
        l = l1;
        if (l1 - GJChronology.access$000(GJChronology.this) < iCutover) goto _L4; else goto _L9
_L9:
        return julianToGregorian(l1);
        if (true) goto _L11; else goto _L10
_L10:
    }

    public long add(long l, long l1)
    {
        if (l < iCutover) goto _L2; else goto _L1
_L1:
        l1 = iGregorianField.add(l, l1);
        l = l1;
        if (l1 >= iCutover) goto _L4; else goto _L3
_L3:
        l = l1;
        if (GJChronology.access$000(GJChronology.this) + l1 >= iCutover) goto _L4; else goto _L5
_L5:
        if (!iConvertByWeekyear) goto _L7; else goto _L6
_L6:
        l = l1;
        if (GJChronology.access$100(GJChronology.this).weekyear().get(l1) <= 0)
        {
            l = GJChronology.access$100(GJChronology.this).weekyear().add(l1, -1);
        }
_L11:
        l = gregorianToJulian(l);
_L4:
        return l;
_L7:
        l = l1;
        if (GJChronology.access$100(GJChronology.this).year().get(l1) <= 0)
        {
            l = GJChronology.access$100(GJChronology.this).year().add(l1, -1);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        l1 = iJulianField.add(l, l1);
        l = l1;
        if (l1 < iCutover) goto _L4; else goto _L8
_L8:
        l = l1;
        if (l1 - GJChronology.access$000(GJChronology.this) < iCutover) goto _L4; else goto _L9
_L9:
        return julianToGregorian(l1);
        if (true) goto _L11; else goto _L10
_L10:
    }

    public int getDifference(long l, long l1)
    {
        if (l >= iCutover)
        {
            if (l1 >= iCutover)
            {
                return iGregorianField.getDifference(l, l1);
            } else
            {
                l = gregorianToJulian(l);
                return iJulianField.getDifference(l, l1);
            }
        }
        if (l1 < iCutover)
        {
            return iJulianField.getDifference(l, l1);
        } else
        {
            l = julianToGregorian(l);
            return iGregorianField.getDifference(l, l1);
        }
    }

    public long getDifferenceAsLong(long l, long l1)
    {
        if (l >= iCutover)
        {
            if (l1 >= iCutover)
            {
                return iGregorianField.getDifferenceAsLong(l, l1);
            } else
            {
                l = gregorianToJulian(l);
                return iJulianField.getDifferenceAsLong(l, l1);
            }
        }
        if (l1 < iCutover)
        {
            return iJulianField.getDifferenceAsLong(l, l1);
        } else
        {
            l = julianToGregorian(l);
            return iGregorianField.getDifferenceAsLong(l, l1);
        }
    }

    public int getMaximumValue(long l)
    {
        if (l >= iCutover)
        {
            return iGregorianField.getMaximumValue(l);
        } else
        {
            return iJulianField.getMaximumValue(l);
        }
    }

    public int getMinimumValue(long l)
    {
        if (l >= iCutover)
        {
            return iGregorianField.getMinimumValue(l);
        } else
        {
            return iJulianField.getMinimumValue(l);
        }
    }

    (DateTimeField datetimefield, DateTimeField datetimefield1, long l)
    {
        this(datetimefield, datetimefield1, null, l, false);
    }

    <init>(DateTimeField datetimefield, DateTimeField datetimefield1, DurationField durationfield, long l)
    {
        this(datetimefield, datetimefield1, durationfield, l, false);
    }

    <init>(DateTimeField datetimefield, DateTimeField datetimefield1, DurationField durationfield, long l, boolean flag)
    {
        this$0 = GJChronology.this;
        super(GJChronology.this, datetimefield, datetimefield1, l, flag);
        gjchronology = durationfield;
        if (durationfield == null)
        {
            gjchronology = new nit>(iDurationField, this);
        }
        iDurationField = GJChronology.this;
    }

    iDurationField(DateTimeField datetimefield, DateTimeField datetimefield1, DurationField durationfield, DurationField durationfield1, long l)
    {
        this(datetimefield, datetimefield1, durationfield, l, false);
        iRangeDurationField = durationfield1;
    }
}

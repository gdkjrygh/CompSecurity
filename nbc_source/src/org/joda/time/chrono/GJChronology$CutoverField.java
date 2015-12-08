// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.ReadablePartial;
import org.joda.time.field.BaseDateTimeField;

// Referenced classes of package org.joda.time.chrono:
//            GJChronology

private class iRangeDurationField extends BaseDateTimeField
{

    private static final long serialVersionUID = 0x30f7c12a10b2ff62L;
    final boolean iConvertByWeekyear;
    final long iCutover;
    protected DurationField iDurationField;
    final DateTimeField iGregorianField;
    final DateTimeField iJulianField;
    protected DurationField iRangeDurationField;
    final GJChronology this$0;

    public long add(long l, int i)
    {
        return iGregorianField.add(l, i);
    }

    public long add(long l, long l1)
    {
        return iGregorianField.add(l, l1);
    }

    public int[] add(ReadablePartial readablepartial, int i, int ai[], int j)
    {
        if (j == 0)
        {
            return ai;
        }
        if (DateTimeUtils.isContiguous(readablepartial))
        {
            long l = 0L;
            i = 0;
            for (int k = readablepartial.size(); i < k; i++)
            {
                l = readablepartial.getFieldType(i).getField(GJChronology.this).set(l, ai[i]);
            }

            l = add(l, j);
            return GJChronology.this.get(readablepartial, l);
        } else
        {
            return super.add(readablepartial, i, ai, j);
        }
    }

    public int get(long l)
    {
        if (l >= iCutover)
        {
            return iGregorianField.get(l);
        } else
        {
            return iJulianField.get(l);
        }
    }

    public String getAsShortText(int i, Locale locale)
    {
        return iGregorianField.getAsShortText(i, locale);
    }

    public String getAsShortText(long l, Locale locale)
    {
        if (l >= iCutover)
        {
            return iGregorianField.getAsShortText(l, locale);
        } else
        {
            return iJulianField.getAsShortText(l, locale);
        }
    }

    public String getAsText(int i, Locale locale)
    {
        return iGregorianField.getAsText(i, locale);
    }

    public String getAsText(long l, Locale locale)
    {
        if (l >= iCutover)
        {
            return iGregorianField.getAsText(l, locale);
        } else
        {
            return iJulianField.getAsText(l, locale);
        }
    }

    public int getDifference(long l, long l1)
    {
        return iGregorianField.getDifference(l, l1);
    }

    public long getDifferenceAsLong(long l, long l1)
    {
        return iGregorianField.getDifferenceAsLong(l, l1);
    }

    public DurationField getDurationField()
    {
        return iDurationField;
    }

    public int getLeapAmount(long l)
    {
        if (l >= iCutover)
        {
            return iGregorianField.getLeapAmount(l);
        } else
        {
            return iJulianField.getLeapAmount(l);
        }
    }

    public DurationField getLeapDurationField()
    {
        return iGregorianField.getLeapDurationField();
    }

    public int getMaximumShortTextLength(Locale locale)
    {
        return Math.max(iJulianField.getMaximumShortTextLength(locale), iGregorianField.getMaximumShortTextLength(locale));
    }

    public int getMaximumTextLength(Locale locale)
    {
        return Math.max(iJulianField.getMaximumTextLength(locale), iGregorianField.getMaximumTextLength(locale));
    }

    public int getMaximumValue()
    {
        return iGregorianField.getMaximumValue();
    }

    public int getMaximumValue(long l)
    {
        int i;
        if (l >= iCutover)
        {
            i = iGregorianField.getMaximumValue(l);
        } else
        {
            int j = iJulianField.getMaximumValue(l);
            i = j;
            if (iJulianField.set(l, j) >= iCutover)
            {
                return iJulianField.get(iJulianField.add(iCutover, -1));
            }
        }
        return i;
    }

    public int getMaximumValue(ReadablePartial readablepartial)
    {
        return getMaximumValue(GJChronology.getInstanceUTC().set(readablepartial, 0L));
    }

    public int getMaximumValue(ReadablePartial readablepartial, int ai[])
    {
        GJChronology gjchronology = GJChronology.getInstanceUTC();
        int j = readablepartial.size();
        long l = 0L;
        for (int i = 0; i < j;)
        {
            DateTimeField datetimefield = readablepartial.getFieldType(i).getField(gjchronology);
            long l1 = l;
            if (ai[i] <= datetimefield.getMaximumValue(l))
            {
                l1 = datetimefield.set(l, ai[i]);
            }
            i++;
            l = l1;
        }

        return getMaximumValue(l);
    }

    public int getMinimumValue()
    {
        return iJulianField.getMinimumValue();
    }

    public int getMinimumValue(long l)
    {
        int i;
        if (l < iCutover)
        {
            i = iJulianField.getMinimumValue(l);
        } else
        {
            int j = iGregorianField.getMinimumValue(l);
            i = j;
            if (iGregorianField.set(l, j) < iCutover)
            {
                return iGregorianField.get(iCutover);
            }
        }
        return i;
    }

    public int getMinimumValue(ReadablePartial readablepartial)
    {
        return iJulianField.getMinimumValue(readablepartial);
    }

    public int getMinimumValue(ReadablePartial readablepartial, int ai[])
    {
        return iJulianField.getMinimumValue(readablepartial, ai);
    }

    public DurationField getRangeDurationField()
    {
        return iRangeDurationField;
    }

    protected long gregorianToJulian(long l)
    {
        if (iConvertByWeekyear)
        {
            return gregorianToJulianByWeekyear(l);
        } else
        {
            return gregorianToJulianByYear(l);
        }
    }

    public boolean isLeap(long l)
    {
        if (l >= iCutover)
        {
            return iGregorianField.isLeap(l);
        } else
        {
            return iJulianField.isLeap(l);
        }
    }

    public boolean isLenient()
    {
        return false;
    }

    protected long julianToGregorian(long l)
    {
        if (iConvertByWeekyear)
        {
            return julianToGregorianByWeekyear(l);
        } else
        {
            return julianToGregorianByYear(l);
        }
    }

    public long roundCeiling(long l)
    {
        if (l >= iCutover)
        {
            l = iGregorianField.roundCeiling(l);
        } else
        {
            long l1 = iJulianField.roundCeiling(l);
            l = l1;
            if (l1 >= iCutover)
            {
                l = l1;
                if (l1 - GJChronology.access$000(GJChronology.this) >= iCutover)
                {
                    return julianToGregorian(l1);
                }
            }
        }
        return l;
    }

    public long roundFloor(long l)
    {
        if (l >= iCutover)
        {
            long l1 = iGregorianField.roundFloor(l);
            l = l1;
            if (l1 < iCutover)
            {
                l = l1;
                if (GJChronology.access$000(GJChronology.this) + l1 < iCutover)
                {
                    l = gregorianToJulian(l1);
                }
            }
            return l;
        } else
        {
            return iJulianField.roundFloor(l);
        }
    }

    public long set(long l, int i)
    {
        if (l >= iCutover)
        {
            long l3 = iGregorianField.set(l, i);
            l = l3;
            if (l3 < iCutover)
            {
                long l1 = l3;
                if (GJChronology.access$000(GJChronology.this) + l3 < iCutover)
                {
                    l1 = gregorianToJulian(l3);
                }
                l = l1;
                if (get(l1) != i)
                {
                    throw new IllegalFieldValueException(iGregorianField.getType(), Integer.valueOf(i), null, null);
                }
            }
        } else
        {
            long l4 = iJulianField.set(l, i);
            l = l4;
            if (l4 >= iCutover)
            {
                long l2 = l4;
                if (l4 - GJChronology.access$000(GJChronology.this) >= iCutover)
                {
                    l2 = julianToGregorian(l4);
                }
                l = l2;
                if (get(l2) != i)
                {
                    throw new IllegalFieldValueException(iJulianField.getType(), Integer.valueOf(i), null, null);
                }
            }
        }
        return l;
    }

    public long set(long l, String s, Locale locale)
    {
        if (l >= iCutover)
        {
            long l1 = iGregorianField.set(l, s, locale);
            l = l1;
            if (l1 < iCutover)
            {
                l = l1;
                if (GJChronology.access$000(GJChronology.this) + l1 < iCutover)
                {
                    l = gregorianToJulian(l1);
                }
            }
        } else
        {
            long l2 = iJulianField.set(l, s, locale);
            l = l2;
            if (l2 >= iCutover)
            {
                l = l2;
                if (l2 - GJChronology.access$000(GJChronology.this) >= iCutover)
                {
                    return julianToGregorian(l2);
                }
            }
        }
        return l;
    }

    (DateTimeField datetimefield, DateTimeField datetimefield1, long l)
    {
        this(datetimefield, datetimefield1, l, false);
    }

    <init>(DateTimeField datetimefield, DateTimeField datetimefield1, long l, boolean flag)
    {
        this(datetimefield, datetimefield1, null, l, flag);
    }

    <init>(DateTimeField datetimefield, DateTimeField datetimefield1, DurationField durationfield, long l, boolean flag)
    {
        this$0 = GJChronology.this;
        super(datetimefield1.getType());
        iJulianField = datetimefield;
        iGregorianField = datetimefield1;
        iCutover = l;
        iConvertByWeekyear = flag;
        iDurationField = datetimefield1.getDurationField();
        gjchronology = durationfield;
        if (durationfield == null)
        {
            datetimefield1 = datetimefield1.getRangeDurationField();
            gjchronology = datetimefield1;
            if (datetimefield1 == null)
            {
                gjchronology = datetimefield.getRangeDurationField();
            }
        }
        iRangeDurationField = GJChronology.this;
    }
}

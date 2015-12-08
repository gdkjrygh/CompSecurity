// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.PeriodConverter;
import org.joda.time.field.FieldUtils;

// Referenced classes of package org.joda.time.base:
//            AbstractPeriod, BaseLocal

public abstract class BasePeriod extends AbstractPeriod
    implements Serializable, ReadablePeriod
{

    private static final ReadablePeriod DUMMY_PERIOD = new AbstractPeriod() {

        public PeriodType getPeriodType()
        {
            return PeriodType.time();
        }

        public int getValue(int i)
        {
            return 0;
        }

    };
    private static final long serialVersionUID = 0xe2b4632c2628cc87L;
    private final PeriodType iType;
    private final int iValues[];

    protected BasePeriod(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, PeriodType periodtype)
    {
        iType = checkPeriodType(periodtype);
        iValues = setPeriodInternal(i, j, k, l, i1, j1, k1, l1);
    }

    protected BasePeriod(long l)
    {
        iType = PeriodType.standard();
        int ai[] = ISOChronology.getInstanceUTC().get(DUMMY_PERIOD, l);
        iValues = new int[8];
        System.arraycopy(ai, 0, iValues, 4, 4);
    }

    protected BasePeriod(long l, long l1, PeriodType periodtype, Chronology chronology)
    {
        periodtype = checkPeriodType(periodtype);
        chronology = DateTimeUtils.getChronology(chronology);
        iType = periodtype;
        iValues = chronology.get(this, l, l1);
    }

    protected BasePeriod(long l, PeriodType periodtype, Chronology chronology)
    {
        periodtype = checkPeriodType(periodtype);
        chronology = DateTimeUtils.getChronology(chronology);
        iType = periodtype;
        iValues = chronology.get(this, l);
    }

    protected BasePeriod(Object obj, PeriodType periodtype, Chronology chronology)
    {
        PeriodConverter periodconverter = ConverterManager.getInstance().getPeriodConverter(obj);
        PeriodType periodtype1 = periodtype;
        if (periodtype == null)
        {
            periodtype1 = periodconverter.getPeriodType(obj);
        }
        periodtype = checkPeriodType(periodtype1);
        iType = periodtype;
        if (this instanceof ReadWritablePeriod)
        {
            iValues = new int[size()];
            periodtype = DateTimeUtils.getChronology(chronology);
            periodconverter.setInto((ReadWritablePeriod)this, obj, periodtype);
            return;
        } else
        {
            iValues = (new MutablePeriod(obj, periodtype, chronology)).getValues();
            return;
        }
    }

    protected BasePeriod(ReadableDuration readableduration, ReadableInstant readableinstant, PeriodType periodtype)
    {
        periodtype = checkPeriodType(periodtype);
        long l1 = DateTimeUtils.getDurationMillis(readableduration);
        long l = DateTimeUtils.getInstantMillis(readableinstant);
        l1 = FieldUtils.safeSubtract(l, l1);
        readableduration = DateTimeUtils.getInstantChronology(readableinstant);
        iType = periodtype;
        iValues = readableduration.get(this, l1, l);
    }

    protected BasePeriod(ReadableInstant readableinstant, ReadableDuration readableduration, PeriodType periodtype)
    {
        periodtype = checkPeriodType(periodtype);
        long l = DateTimeUtils.getInstantMillis(readableinstant);
        long l1 = FieldUtils.safeAdd(l, DateTimeUtils.getDurationMillis(readableduration));
        readableinstant = DateTimeUtils.getInstantChronology(readableinstant);
        iType = periodtype;
        iValues = readableinstant.get(this, l, l1);
    }

    protected BasePeriod(ReadableInstant readableinstant, ReadableInstant readableinstant1, PeriodType periodtype)
    {
        periodtype = checkPeriodType(periodtype);
        if (readableinstant == null && readableinstant1 == null)
        {
            iType = periodtype;
            iValues = new int[size()];
            return;
        } else
        {
            long l = DateTimeUtils.getInstantMillis(readableinstant);
            long l1 = DateTimeUtils.getInstantMillis(readableinstant1);
            readableinstant = DateTimeUtils.getIntervalChronology(readableinstant, readableinstant1);
            iType = periodtype;
            iValues = readableinstant.get(this, l, l1);
            return;
        }
    }

    protected BasePeriod(ReadablePartial readablepartial, ReadablePartial readablepartial1, PeriodType periodtype)
    {
        if (readablepartial == null || readablepartial1 == null)
        {
            throw new IllegalArgumentException("ReadablePartial objects must not be null");
        }
        if ((readablepartial instanceof BaseLocal) && (readablepartial1 instanceof BaseLocal) && readablepartial.getClass() == readablepartial1.getClass())
        {
            periodtype = checkPeriodType(periodtype);
            long l = ((BaseLocal)readablepartial).getLocalMillis();
            long l1 = ((BaseLocal)readablepartial1).getLocalMillis();
            readablepartial = DateTimeUtils.getChronology(readablepartial.getChronology());
            iType = periodtype;
            iValues = readablepartial.get(this, l, l1);
            return;
        }
        if (readablepartial.size() != readablepartial1.size())
        {
            throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
        }
        int i = 0;
        for (int j = readablepartial.size(); i < j; i++)
        {
            if (readablepartial.getFieldType(i) != readablepartial1.getFieldType(i))
            {
                throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
            }
        }

        if (!DateTimeUtils.isContiguous(readablepartial))
        {
            throw new IllegalArgumentException("ReadablePartial objects must be contiguous");
        } else
        {
            iType = checkPeriodType(periodtype);
            periodtype = DateTimeUtils.getChronology(readablepartial.getChronology()).withUTC();
            iValues = periodtype.get(this, periodtype.set(readablepartial, 0L), periodtype.set(readablepartial1, 0L));
            return;
        }
    }

    protected BasePeriod(int ai[], PeriodType periodtype)
    {
        iType = periodtype;
        iValues = ai;
    }

    private void checkAndUpdate(DurationFieldType durationfieldtype, int ai[], int i)
    {
        int j = indexOf(durationfieldtype);
        if (j == -1)
        {
            if (i != 0)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Period does not support field '").append(durationfieldtype.getName()).append("'").toString());
            }
        } else
        {
            ai[j] = i;
        }
    }

    private void setPeriodInternal(ReadablePeriod readableperiod)
    {
        int ai[] = new int[size()];
        int i = 0;
        for (int j = readableperiod.size(); i < j; i++)
        {
            checkAndUpdate(readableperiod.getFieldType(i), ai, readableperiod.getValue(i));
        }

        setValues(ai);
    }

    private int[] setPeriodInternal(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1)
    {
        int ai[] = new int[size()];
        checkAndUpdate(DurationFieldType.years(), ai, i);
        checkAndUpdate(DurationFieldType.months(), ai, j);
        checkAndUpdate(DurationFieldType.weeks(), ai, k);
        checkAndUpdate(DurationFieldType.days(), ai, l);
        checkAndUpdate(DurationFieldType.hours(), ai, i1);
        checkAndUpdate(DurationFieldType.minutes(), ai, j1);
        checkAndUpdate(DurationFieldType.seconds(), ai, k1);
        checkAndUpdate(DurationFieldType.millis(), ai, l1);
        return ai;
    }

    protected void addField(DurationFieldType durationfieldtype, int i)
    {
        addFieldInto(iValues, durationfieldtype, i);
    }

    protected void addFieldInto(int ai[], DurationFieldType durationfieldtype, int i)
    {
        int j = indexOf(durationfieldtype);
        if (j == -1)
        {
            if (i != 0 || durationfieldtype == null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Period does not support field '").append(durationfieldtype).append("'").toString());
            }
        } else
        {
            ai[j] = FieldUtils.safeAdd(ai[j], i);
        }
    }

    protected void addPeriod(ReadablePeriod readableperiod)
    {
        if (readableperiod != null)
        {
            setValues(addPeriodInto(getValues(), readableperiod));
        }
    }

    protected int[] addPeriodInto(int ai[], ReadablePeriod readableperiod)
    {
        int i = 0;
        for (int j = readableperiod.size(); i < j; i++)
        {
            DurationFieldType durationfieldtype = readableperiod.getFieldType(i);
            int k = readableperiod.getValue(i);
            if (k == 0)
            {
                continue;
            }
            int l = indexOf(durationfieldtype);
            if (l == -1)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Period does not support field '").append(durationfieldtype.getName()).append("'").toString());
            }
            ai[l] = FieldUtils.safeAdd(getValue(l), k);
        }

        return ai;
    }

    protected PeriodType checkPeriodType(PeriodType periodtype)
    {
        return DateTimeUtils.getPeriodType(periodtype);
    }

    public PeriodType getPeriodType()
    {
        return iType;
    }

    public int getValue(int i)
    {
        return iValues[i];
    }

    protected void mergePeriod(ReadablePeriod readableperiod)
    {
        if (readableperiod != null)
        {
            setValues(mergePeriodInto(getValues(), readableperiod));
        }
    }

    protected int[] mergePeriodInto(int ai[], ReadablePeriod readableperiod)
    {
        int i = 0;
        for (int j = readableperiod.size(); i < j; i++)
        {
            checkAndUpdate(readableperiod.getFieldType(i), ai, readableperiod.getValue(i));
        }

        return ai;
    }

    protected void setField(DurationFieldType durationfieldtype, int i)
    {
        setFieldInto(iValues, durationfieldtype, i);
    }

    protected void setFieldInto(int ai[], DurationFieldType durationfieldtype, int i)
    {
        int j = indexOf(durationfieldtype);
        if (j == -1)
        {
            if (i != 0 || durationfieldtype == null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Period does not support field '").append(durationfieldtype).append("'").toString());
            }
        } else
        {
            ai[j] = i;
        }
    }

    protected void setPeriod(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1)
    {
        setValues(setPeriodInternal(i, j, k, l, i1, j1, k1, l1));
    }

    protected void setPeriod(ReadablePeriod readableperiod)
    {
        if (readableperiod == null)
        {
            setValues(new int[size()]);
            return;
        } else
        {
            setPeriodInternal(readableperiod);
            return;
        }
    }

    protected void setValue(int i, int j)
    {
        iValues[i] = j;
    }

    protected void setValues(int ai[])
    {
        System.arraycopy(ai, 0, iValues, 0, iValues.length);
    }

    public Duration toDurationFrom(ReadableInstant readableinstant)
    {
        long l = DateTimeUtils.getInstantMillis(readableinstant);
        return new Duration(l, DateTimeUtils.getInstantChronology(readableinstant).add(this, l, 1));
    }

    public Duration toDurationTo(ReadableInstant readableinstant)
    {
        long l = DateTimeUtils.getInstantMillis(readableinstant);
        return new Duration(DateTimeUtils.getInstantChronology(readableinstant).add(this, l, -1), l);
    }

}

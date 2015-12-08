// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

// Referenced classes of package org.joda.time.chrono:
//            AssembledChronology, GJCacheKey, JulianChronology, GregorianChronology, 
//            ZonedChronology

public final class GJChronology extends AssembledChronology
{
    private class CutoverField extends BaseDateTimeField
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
                    if (l1 - iGapDuration >= iCutover)
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
                    if (iGapDuration + l1 < iCutover)
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
                    if (iGapDuration + l3 < iCutover)
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
                    if (l4 - iGapDuration >= iCutover)
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
                    if (iGapDuration + l1 < iCutover)
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
                    if (l2 - iGapDuration >= iCutover)
                    {
                        return julianToGregorian(l2);
                    }
                }
            }
            return l;
        }

        CutoverField(DateTimeField datetimefield, DateTimeField datetimefield1, long l)
        {
            this(datetimefield, datetimefield1, l, false);
        }

        CutoverField(DateTimeField datetimefield, DateTimeField datetimefield1, long l, boolean flag)
        {
            this(datetimefield, datetimefield1, null, l, flag);
        }

        CutoverField(DateTimeField datetimefield, DateTimeField datetimefield1, DurationField durationfield, long l, boolean flag)
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

    private final class ImpreciseCutoverField extends CutoverField
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
            if (iGapDuration + l1 >= iCutover) goto _L4; else goto _L5
_L5:
            if (!iConvertByWeekyear) goto _L7; else goto _L6
_L6:
            l = l1;
            if (iGregorianChronology.weekyear().get(l1) <= 0)
            {
                l = iGregorianChronology.weekyear().add(l1, -1);
            }
_L11:
            l = gregorianToJulian(l);
_L4:
            return l;
_L7:
            l = l1;
            if (iGregorianChronology.year().get(l1) <= 0)
            {
                l = iGregorianChronology.year().add(l1, -1);
            }
            continue; /* Loop/switch isn't completed */
_L2:
            l1 = iJulianField.add(l, i);
            l = l1;
            if (l1 < iCutover) goto _L4; else goto _L8
_L8:
            l = l1;
            if (l1 - iGapDuration < iCutover) goto _L4; else goto _L9
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
            if (iGapDuration + l1 >= iCutover) goto _L4; else goto _L5
_L5:
            if (!iConvertByWeekyear) goto _L7; else goto _L6
_L6:
            l = l1;
            if (iGregorianChronology.weekyear().get(l1) <= 0)
            {
                l = iGregorianChronology.weekyear().add(l1, -1);
            }
_L11:
            l = gregorianToJulian(l);
_L4:
            return l;
_L7:
            l = l1;
            if (iGregorianChronology.year().get(l1) <= 0)
            {
                l = iGregorianChronology.year().add(l1, -1);
            }
            continue; /* Loop/switch isn't completed */
_L2:
            l1 = iJulianField.add(l, l1);
            l = l1;
            if (l1 < iCutover) goto _L4; else goto _L8
_L8:
            l = l1;
            if (l1 - iGapDuration < iCutover) goto _L4; else goto _L9
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

        ImpreciseCutoverField(DateTimeField datetimefield, DateTimeField datetimefield1, long l)
        {
            this(datetimefield, datetimefield1, null, l, false);
        }

        ImpreciseCutoverField(DateTimeField datetimefield, DateTimeField datetimefield1, DurationField durationfield, long l)
        {
            this(datetimefield, datetimefield1, durationfield, l, false);
        }

        ImpreciseCutoverField(DateTimeField datetimefield, DateTimeField datetimefield1, DurationField durationfield, long l, boolean flag)
        {
            this$0 = GJChronology.this;
            super(datetimefield, datetimefield1, l, flag);
            gjchronology = durationfield;
            if (durationfield == null)
            {
                gjchronology = new LinkedDurationField(iDurationField, this);
            }
            iDurationField = GJChronology.this;
        }

        ImpreciseCutoverField(DateTimeField datetimefield, DateTimeField datetimefield1, DurationField durationfield, DurationField durationfield1, long l)
        {
            this(datetimefield, datetimefield1, durationfield, l, false);
            iRangeDurationField = durationfield1;
        }
    }

    private static class LinkedDurationField extends DecoratedDurationField
    {

        private static final long serialVersionUID = 0x38deeee7447e493cL;
        private final ImpreciseCutoverField iField;

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

        LinkedDurationField(DurationField durationfield, ImpreciseCutoverField imprecisecutoverfield)
        {
            super(durationfield, durationfield.getType());
            iField = imprecisecutoverfield;
        }
    }


    static final Instant DEFAULT_CUTOVER = new Instant(0xfffff4e2f964ac00L);
    private static final ConcurrentHashMap cCache = new ConcurrentHashMap();
    private static final long serialVersionUID = 0xdcac4d2e655a2629L;
    private Instant iCutoverInstant;
    private long iCutoverMillis;
    private long iGapDuration;
    private GregorianChronology iGregorianChronology;
    private JulianChronology iJulianChronology;

    private GJChronology(Chronology chronology, JulianChronology julianchronology, GregorianChronology gregorianchronology, Instant instant)
    {
        super(chronology, ((Object) (new Object[] {
            julianchronology, gregorianchronology, instant
        })));
    }

    private GJChronology(JulianChronology julianchronology, GregorianChronology gregorianchronology, Instant instant)
    {
        super(null, ((Object) (new Object[] {
            julianchronology, gregorianchronology, instant
        })));
    }

    private static long convertByWeekyear(long l, Chronology chronology, Chronology chronology1)
    {
        long l1 = chronology1.weekyear().set(0L, chronology.weekyear().get(l));
        l1 = chronology1.weekOfWeekyear().set(l1, chronology.weekOfWeekyear().get(l));
        l1 = chronology1.dayOfWeek().set(l1, chronology.dayOfWeek().get(l));
        return chronology1.millisOfDay().set(l1, chronology.millisOfDay().get(l));
    }

    private static long convertByYear(long l, Chronology chronology, Chronology chronology1)
    {
        return chronology1.getDateTimeMillis(chronology.year().get(l), chronology.monthOfYear().get(l), chronology.dayOfMonth().get(l), chronology.millisOfDay().get(l));
    }

    public static GJChronology getInstance()
    {
        return getInstance(DateTimeZone.getDefault(), ((ReadableInstant) (DEFAULT_CUTOVER)), 4);
    }

    public static GJChronology getInstance(DateTimeZone datetimezone)
    {
        return getInstance(datetimezone, ((ReadableInstant) (DEFAULT_CUTOVER)), 4);
    }

    public static GJChronology getInstance(DateTimeZone datetimezone, long l, int i)
    {
        Object obj;
        if (l == DEFAULT_CUTOVER.getMillis())
        {
            obj = null;
        } else
        {
            obj = new Instant(l);
        }
        return getInstance(datetimezone, ((ReadableInstant) (obj)), i);
    }

    public static GJChronology getInstance(DateTimeZone datetimezone, ReadableInstant readableinstant)
    {
        return getInstance(datetimezone, readableinstant, 4);
    }

    public static GJChronology getInstance(DateTimeZone datetimezone, ReadableInstant readableinstant, int i)
    {
label0:
        {
            DateTimeZone datetimezone1 = DateTimeUtils.getZone(datetimezone);
            GJChronology gjchronology;
            GJCacheKey gjcachekey;
            if (readableinstant == null)
            {
                datetimezone = DEFAULT_CUTOVER;
            } else
            {
                datetimezone = readableinstant.toInstant();
                if ((new LocalDate(datetimezone.getMillis(), GregorianChronology.getInstance(datetimezone1))).getYear() <= 0)
                {
                    throw new IllegalArgumentException("Cutover too early. Must be on or after 0001-01-01.");
                }
            }
            gjcachekey = new GJCacheKey(datetimezone1, datetimezone, i);
            gjchronology = (GJChronology)cCache.get(gjcachekey);
            readableinstant = gjchronology;
            if (gjchronology == null)
            {
                if (datetimezone1 == DateTimeZone.UTC)
                {
                    datetimezone = new GJChronology(JulianChronology.getInstance(datetimezone1, i), GregorianChronology.getInstance(datetimezone1, i), datetimezone);
                } else
                {
                    datetimezone = getInstance(DateTimeZone.UTC, ((ReadableInstant) (datetimezone)), i);
                    datetimezone = new GJChronology(ZonedChronology.getInstance(datetimezone, datetimezone1), ((GJChronology) (datetimezone)).iJulianChronology, ((GJChronology) (datetimezone)).iGregorianChronology, ((GJChronology) (datetimezone)).iCutoverInstant);
                }
                readableinstant = (GJChronology)cCache.putIfAbsent(gjcachekey, datetimezone);
                if (readableinstant == null)
                {
                    break label0;
                }
            }
            return readableinstant;
        }
        return datetimezone;
    }

    public static GJChronology getInstanceUTC()
    {
        return getInstance(DateTimeZone.UTC, DEFAULT_CUTOVER, 4);
    }

    private Object readResolve()
    {
        return getInstance(getZone(), iCutoverInstant, getMinimumDaysInFirstWeek());
    }

    protected void assemble(AssembledChronology.Fields fields)
    {
        Object aobj[] = (Object[])(Object[])getParam();
        Object obj = (JulianChronology)aobj[0];
        GregorianChronology gregorianchronology = (GregorianChronology)aobj[1];
        Instant instant = (Instant)aobj[2];
        iCutoverMillis = instant.getMillis();
        iJulianChronology = ((JulianChronology) (obj));
        iGregorianChronology = gregorianchronology;
        iCutoverInstant = instant;
        if (getBase() != null)
        {
            return;
        }
        if (((JulianChronology) (obj)).getMinimumDaysInFirstWeek() != gregorianchronology.getMinimumDaysInFirstWeek())
        {
            throw new IllegalArgumentException();
        }
        iGapDuration = iCutoverMillis - julianToGregorianByYear(iCutoverMillis);
        fields.copyFieldsFrom(gregorianchronology);
        if (gregorianchronology.millisOfDay().get(iCutoverMillis) == 0)
        {
            fields.millisOfSecond = new CutoverField(((JulianChronology) (obj)).millisOfSecond(), fields.millisOfSecond, iCutoverMillis);
            fields.millisOfDay = new CutoverField(((JulianChronology) (obj)).millisOfDay(), fields.millisOfDay, iCutoverMillis);
            fields.secondOfMinute = new CutoverField(((JulianChronology) (obj)).secondOfMinute(), fields.secondOfMinute, iCutoverMillis);
            fields.secondOfDay = new CutoverField(((JulianChronology) (obj)).secondOfDay(), fields.secondOfDay, iCutoverMillis);
            fields.minuteOfHour = new CutoverField(((JulianChronology) (obj)).minuteOfHour(), fields.minuteOfHour, iCutoverMillis);
            fields.minuteOfDay = new CutoverField(((JulianChronology) (obj)).minuteOfDay(), fields.minuteOfDay, iCutoverMillis);
            fields.hourOfDay = new CutoverField(((JulianChronology) (obj)).hourOfDay(), fields.hourOfDay, iCutoverMillis);
            fields.hourOfHalfday = new CutoverField(((JulianChronology) (obj)).hourOfHalfday(), fields.hourOfHalfday, iCutoverMillis);
            fields.clockhourOfDay = new CutoverField(((JulianChronology) (obj)).clockhourOfDay(), fields.clockhourOfDay, iCutoverMillis);
            fields.clockhourOfHalfday = new CutoverField(((JulianChronology) (obj)).clockhourOfHalfday(), fields.clockhourOfHalfday, iCutoverMillis);
            fields.halfdayOfDay = new CutoverField(((JulianChronology) (obj)).halfdayOfDay(), fields.halfdayOfDay, iCutoverMillis);
        }
        fields.era = new CutoverField(((JulianChronology) (obj)).era(), fields.era, iCutoverMillis);
        fields.year = new ImpreciseCutoverField(((JulianChronology) (obj)).year(), fields.year, iCutoverMillis);
        fields.years = fields.year.getDurationField();
        fields.yearOfEra = new ImpreciseCutoverField(((JulianChronology) (obj)).yearOfEra(), fields.yearOfEra, fields.years, iCutoverMillis);
        fields.centuryOfEra = new ImpreciseCutoverField(((JulianChronology) (obj)).centuryOfEra(), fields.centuryOfEra, iCutoverMillis);
        fields.centuries = fields.centuryOfEra.getDurationField();
        fields.yearOfCentury = new ImpreciseCutoverField(((JulianChronology) (obj)).yearOfCentury(), fields.yearOfCentury, fields.years, fields.centuries, iCutoverMillis);
        fields.monthOfYear = new ImpreciseCutoverField(((JulianChronology) (obj)).monthOfYear(), fields.monthOfYear, null, fields.years, iCutoverMillis);
        fields.months = fields.monthOfYear.getDurationField();
        fields.weekyear = new ImpreciseCutoverField(((JulianChronology) (obj)).weekyear(), fields.weekyear, null, iCutoverMillis, true);
        fields.weekyears = fields.weekyear.getDurationField();
        fields.weekyearOfCentury = new ImpreciseCutoverField(((JulianChronology) (obj)).weekyearOfCentury(), fields.weekyearOfCentury, fields.weekyears, fields.centuries, iCutoverMillis);
        long l = gregorianchronology.year().roundCeiling(iCutoverMillis);
        fields.dayOfYear = new CutoverField(((JulianChronology) (obj)).dayOfYear(), fields.dayOfYear, fields.years, l, false);
        l = gregorianchronology.weekyear().roundCeiling(iCutoverMillis);
        fields.weekOfWeekyear = new CutoverField(((JulianChronology) (obj)).weekOfWeekyear(), fields.weekOfWeekyear, fields.weekyears, l, true);
        obj = new CutoverField(((JulianChronology) (obj)).dayOfMonth(), fields.dayOfMonth, iCutoverMillis);
        obj.iRangeDurationField = fields.months;
        fields.dayOfMonth = ((DateTimeField) (obj));
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof GJChronology)
            {
                if (iCutoverMillis != ((GJChronology) (obj = (GJChronology)obj)).iCutoverMillis || getMinimumDaysInFirstWeek() != ((GJChronology) (obj)).getMinimumDaysInFirstWeek() || !getZone().equals(((GJChronology) (obj)).getZone()))
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

    public long getDateTimeMillis(int i, int j, int k, int l)
        throws IllegalArgumentException
    {
        Chronology chronology = getBase();
        long l1;
        if (chronology != null)
        {
            l1 = chronology.getDateTimeMillis(i, j, k, l);
        } else
        {
            long l2 = iGregorianChronology.getDateTimeMillis(i, j, k, l);
            l1 = l2;
            if (l2 < iCutoverMillis)
            {
                long l3 = iJulianChronology.getDateTimeMillis(i, j, k, l);
                l1 = l3;
                if (l3 >= iCutoverMillis)
                {
                    throw new IllegalArgumentException("Specified date does not exist");
                }
            }
        }
        return l1;
    }

    public long getDateTimeMillis(int i, int j, int k, int l, int i1, int j1, int k1)
        throws IllegalArgumentException
    {
        Chronology chronology = getBase();
        if (chronology == null) goto _L2; else goto _L1
_L1:
        long l1 = chronology.getDateTimeMillis(i, j, k, l, i1, j1, k1);
_L4:
        return l1;
_L2:
        long l3;
        try
        {
            l3 = iGregorianChronology.getDateTimeMillis(i, j, k, l, i1, j1, k1);
        }
        catch (IllegalFieldValueException illegalfieldvalueexception)
        {
            if (j != 2 || k != 29)
            {
                throw illegalfieldvalueexception;
            }
            long l2 = iGregorianChronology.getDateTimeMillis(i, j, 28, l, i1, j1, k1);
            l3 = l2;
            if (l2 >= iCutoverMillis)
            {
                throw illegalfieldvalueexception;
            }
        }
        l1 = l3;
        if (l3 < iCutoverMillis)
        {
            l3 = iJulianChronology.getDateTimeMillis(i, j, k, l, i1, j1, k1);
            l1 = l3;
            if (l3 >= iCutoverMillis)
            {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Instant getGregorianCutover()
    {
        return iCutoverInstant;
    }

    public int getMinimumDaysInFirstWeek()
    {
        return iGregorianChronology.getMinimumDaysInFirstWeek();
    }

    public DateTimeZone getZone()
    {
        Chronology chronology = getBase();
        if (chronology != null)
        {
            return chronology.getZone();
        } else
        {
            return DateTimeZone.UTC;
        }
    }

    long gregorianToJulianByWeekyear(long l)
    {
        return convertByWeekyear(l, iGregorianChronology, iJulianChronology);
    }

    long gregorianToJulianByYear(long l)
    {
        return convertByYear(l, iGregorianChronology, iJulianChronology);
    }

    public int hashCode()
    {
        return "GJ".hashCode() * 11 + getZone().hashCode() + getMinimumDaysInFirstWeek() + iCutoverInstant.hashCode();
    }

    long julianToGregorianByWeekyear(long l)
    {
        return convertByWeekyear(l, iJulianChronology, iGregorianChronology);
    }

    long julianToGregorianByYear(long l)
    {
        return convertByYear(l, iJulianChronology, iGregorianChronology);
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer(60);
        stringbuffer.append("GJChronology");
        stringbuffer.append('[');
        stringbuffer.append(getZone().getID());
        if (iCutoverMillis != DEFAULT_CUTOVER.getMillis())
        {
            stringbuffer.append(",cutover=");
            DateTimeFormatter datetimeformatter;
            if (withUTC().dayOfYear().remainder(iCutoverMillis) == 0L)
            {
                datetimeformatter = ISODateTimeFormat.date();
            } else
            {
                datetimeformatter = ISODateTimeFormat.dateTime();
            }
            datetimeformatter.withChronology(withUTC()).printTo(stringbuffer, iCutoverMillis);
        }
        if (getMinimumDaysInFirstWeek() != 4)
        {
            stringbuffer.append(",mdfw=");
            stringbuffer.append(getMinimumDaysInFirstWeek());
        }
        stringbuffer.append(']');
        return stringbuffer.toString();
    }

    public Chronology withUTC()
    {
        return withZone(DateTimeZone.UTC);
    }

    public Chronology withZone(DateTimeZone datetimezone)
    {
        DateTimeZone datetimezone1 = datetimezone;
        if (datetimezone == null)
        {
            datetimezone1 = DateTimeZone.getDefault();
        }
        if (datetimezone1 == getZone())
        {
            return this;
        } else
        {
            return getInstance(datetimezone1, iCutoverInstant, getMinimumDaysInFirstWeek());
        }
    }



}

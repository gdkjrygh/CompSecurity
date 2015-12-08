// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.joda.time.base.AbstractPartial;
import org.joda.time.field.AbstractPartialFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

// Referenced classes of package org.joda.time:
//            ReadablePartial, Chronology, DateTimeUtils, DateTimeFieldType, 
//            DurationFieldType, DurationField, DateTimeField, ReadablePeriod, 
//            ReadableInstant

public final class Partial extends AbstractPartial
    implements Serializable, ReadablePartial
{
    public static class Property extends AbstractPartialFieldProperty
        implements Serializable
    {

        private static final long serialVersionUID = 0x3074d5e4b020L;
        private final int iFieldIndex;
        private final Partial iPartial;

        public Partial addToCopy(int i)
        {
            int ai[] = iPartial.getValues();
            ai = getField().add(iPartial, iFieldIndex, ai, i);
            return new Partial(iPartial, ai);
        }

        public Partial addWrapFieldToCopy(int i)
        {
            int ai[] = iPartial.getValues();
            ai = getField().addWrapField(iPartial, iFieldIndex, ai, i);
            return new Partial(iPartial, ai);
        }

        public int get()
        {
            return iPartial.getValue(iFieldIndex);
        }

        public DateTimeField getField()
        {
            return iPartial.getField(iFieldIndex);
        }

        public Partial getPartial()
        {
            return iPartial;
        }

        protected ReadablePartial getReadablePartial()
        {
            return iPartial;
        }

        public Partial setCopy(int i)
        {
            int ai[] = iPartial.getValues();
            ai = getField().set(iPartial, iFieldIndex, ai, i);
            return new Partial(iPartial, ai);
        }

        public Partial setCopy(String s)
        {
            return setCopy(s, null);
        }

        public Partial setCopy(String s, Locale locale)
        {
            int ai[] = iPartial.getValues();
            s = getField().set(iPartial, iFieldIndex, ai, s, locale);
            return new Partial(iPartial, s);
        }

        public Partial withMaximumValue()
        {
            return setCopy(getMaximumValue());
        }

        public Partial withMinimumValue()
        {
            return setCopy(getMinimumValue());
        }

        Property(Partial partial, int i)
        {
            iPartial = partial;
            iFieldIndex = i;
        }
    }


    private static final long serialVersionUID = 0xb356edd9a8aL;
    private final Chronology iChronology;
    private transient DateTimeFormatter iFormatter[];
    private final DateTimeFieldType iTypes[];
    private final int iValues[];

    public Partial()
    {
        this((Chronology)null);
    }

    public Partial(Chronology chronology)
    {
        iChronology = DateTimeUtils.getChronology(chronology).withUTC();
        iTypes = new DateTimeFieldType[0];
        iValues = new int[0];
    }

    Partial(Chronology chronology, DateTimeFieldType adatetimefieldtype[], int ai[])
    {
        iChronology = chronology;
        iTypes = adatetimefieldtype;
        iValues = ai;
    }

    public Partial(DateTimeFieldType datetimefieldtype, int i)
    {
        this(datetimefieldtype, i, ((Chronology) (null)));
    }

    public Partial(DateTimeFieldType datetimefieldtype, int i, Chronology chronology)
    {
        chronology = DateTimeUtils.getChronology(chronology).withUTC();
        iChronology = chronology;
        if (datetimefieldtype == null)
        {
            throw new IllegalArgumentException("The field type must not be null");
        } else
        {
            iTypes = (new DateTimeFieldType[] {
                datetimefieldtype
            });
            iValues = (new int[] {
                i
            });
            chronology.validate(this, iValues);
            return;
        }
    }

    Partial(Partial partial, int ai[])
    {
        iChronology = partial.iChronology;
        iTypes = partial.iTypes;
        iValues = ai;
    }

    public Partial(ReadablePartial readablepartial)
    {
        if (readablepartial == null)
        {
            throw new IllegalArgumentException("The partial must not be null");
        }
        iChronology = DateTimeUtils.getChronology(readablepartial.getChronology()).withUTC();
        iTypes = new DateTimeFieldType[readablepartial.size()];
        iValues = new int[readablepartial.size()];
        for (int i = 0; i < readablepartial.size(); i++)
        {
            iTypes[i] = readablepartial.getFieldType(i);
            iValues[i] = readablepartial.getValue(i);
        }

    }

    public Partial(DateTimeFieldType adatetimefieldtype[], int ai[])
    {
        this(adatetimefieldtype, ai, ((Chronology) (null)));
    }

    public Partial(DateTimeFieldType adatetimefieldtype[], int ai[], Chronology chronology)
    {
        boolean flag = false;
        super();
        Chronology chronology1 = DateTimeUtils.getChronology(chronology).withUTC();
        iChronology = chronology1;
        if (adatetimefieldtype == null)
        {
            throw new IllegalArgumentException("Types array must not be null");
        }
        if (ai == null)
        {
            throw new IllegalArgumentException("Values array must not be null");
        }
        if (ai.length != adatetimefieldtype.length)
        {
            throw new IllegalArgumentException("Values array must be the same length as the types array");
        }
        if (adatetimefieldtype.length == 0)
        {
            iTypes = adatetimefieldtype;
            iValues = ai;
            return;
        }
        for (int i = 0; i < adatetimefieldtype.length; i++)
        {
            if (adatetimefieldtype[i] == null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Types array must not contain null: index ").append(i).toString());
            }
        }

        chronology = null;
        for (int j = ((flag) ? 1 : 0); j < adatetimefieldtype.length;)
        {
            DateTimeFieldType datetimefieldtype = adatetimefieldtype[j];
            DurationField durationfield = datetimefieldtype.getDurationType().getField(iChronology);
            if (j > 0)
            {
                if (!durationfield.isSupported())
                {
                    if (chronology.isSupported())
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append("Types array must be in order largest-smallest: ").append(adatetimefieldtype[j - 1].getName()).append(" < ").append(datetimefieldtype.getName()).toString());
                    } else
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append("Types array must not contain duplicate unsupported: ").append(adatetimefieldtype[j - 1].getName()).append(" and ").append(datetimefieldtype.getName()).toString());
                    }
                }
                int k = chronology.compareTo(durationfield);
                if (k < 0)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Types array must be in order largest-smallest: ").append(adatetimefieldtype[j - 1].getName()).append(" < ").append(datetimefieldtype.getName()).toString());
                }
                if (k == 0)
                {
                    if (chronology.equals(durationfield))
                    {
                        Object obj = adatetimefieldtype[j - 1].getRangeDurationType();
                        chronology = datetimefieldtype.getRangeDurationType();
                        if (obj == null)
                        {
                            if (chronology == null)
                            {
                                throw new IllegalArgumentException((new StringBuilder()).append("Types array must not contain duplicate: ").append(adatetimefieldtype[j - 1].getName()).append(" and ").append(datetimefieldtype.getName()).toString());
                            }
                        } else
                        {
                            if (chronology == null)
                            {
                                throw new IllegalArgumentException((new StringBuilder()).append("Types array must be in order largest-smallest: ").append(adatetimefieldtype[j - 1].getName()).append(" < ").append(datetimefieldtype.getName()).toString());
                            }
                            obj = ((DurationFieldType) (obj)).getField(iChronology);
                            chronology = chronology.getField(iChronology);
                            if (((DurationField) (obj)).compareTo(chronology) < 0)
                            {
                                throw new IllegalArgumentException((new StringBuilder()).append("Types array must be in order largest-smallest: ").append(adatetimefieldtype[j - 1].getName()).append(" < ").append(datetimefieldtype.getName()).toString());
                            }
                            if (((DurationField) (obj)).compareTo(chronology) == 0)
                            {
                                throw new IllegalArgumentException((new StringBuilder()).append("Types array must not contain duplicate: ").append(adatetimefieldtype[j - 1].getName()).append(" and ").append(datetimefieldtype.getName()).toString());
                            }
                        }
                    } else
                    if (chronology.isSupported() && chronology.getType() != DurationFieldType.YEARS_TYPE)
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append("Types array must be in order largest-smallest, for year-based fields, years is defined as being largest: ").append(adatetimefieldtype[j - 1].getName()).append(" < ").append(datetimefieldtype.getName()).toString());
                    }
                }
            }
            j++;
            chronology = durationfield;
        }

        iTypes = (DateTimeFieldType[])(DateTimeFieldType[])adatetimefieldtype.clone();
        chronology1.validate(this, ai);
        iValues = (int[])(int[])ai.clone();
    }

    public Chronology getChronology()
    {
        return iChronology;
    }

    protected DateTimeField getField(int i, Chronology chronology)
    {
        return iTypes[i].getField(chronology);
    }

    public DateTimeFieldType getFieldType(int i)
    {
        return iTypes[i];
    }

    public DateTimeFieldType[] getFieldTypes()
    {
        return (DateTimeFieldType[])(DateTimeFieldType[])iTypes.clone();
    }

    public DateTimeFormatter getFormatter()
    {
        DateTimeFormatter adatetimeformatter[];
        DateTimeFormatter adatetimeformatter1[];
        adatetimeformatter1 = iFormatter;
        adatetimeformatter = adatetimeformatter1;
        if (adatetimeformatter1 != null) goto _L2; else goto _L1
_L1:
        if (size() == 0)
        {
            return null;
        }
        adatetimeformatter = new DateTimeFormatter[2];
        ArrayList arraylist;
        arraylist = new ArrayList(Arrays.asList(iTypes));
        adatetimeformatter[0] = ISODateTimeFormat.forFields(arraylist, true, false);
        if (arraylist.size() == 0)
        {
            adatetimeformatter[1] = adatetimeformatter[0];
        }
_L4:
        iFormatter = adatetimeformatter;
_L2:
        return adatetimeformatter[0];
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int getValue(int i)
    {
        return iValues[i];
    }

    public int[] getValues()
    {
        return (int[])(int[])iValues.clone();
    }

    public boolean isMatch(ReadableInstant readableinstant)
    {
        long l = DateTimeUtils.getInstantMillis(readableinstant);
        readableinstant = DateTimeUtils.getInstantChronology(readableinstant);
        for (int i = 0; i < iTypes.length; i++)
        {
            if (iTypes[i].getField(readableinstant).get(l) != iValues[i])
            {
                return false;
            }
        }

        return true;
    }

    public boolean isMatch(ReadablePartial readablepartial)
    {
        if (readablepartial == null)
        {
            throw new IllegalArgumentException("The partial must not be null");
        }
        for (int i = 0; i < iTypes.length; i++)
        {
            if (readablepartial.get(iTypes[i]) != iValues[i])
            {
                return false;
            }
        }

        return true;
    }

    public Partial minus(ReadablePeriod readableperiod)
    {
        return withPeriodAdded(readableperiod, -1);
    }

    public Partial plus(ReadablePeriod readableperiod)
    {
        return withPeriodAdded(readableperiod, 1);
    }

    public Property property(DateTimeFieldType datetimefieldtype)
    {
        return new Property(this, indexOfSupported(datetimefieldtype));
    }

    public int size()
    {
        return iTypes.length;
    }

    public String toString()
    {
        DateTimeFormatter adatetimeformatter1[] = iFormatter;
        DateTimeFormatter adatetimeformatter[] = adatetimeformatter1;
        if (adatetimeformatter1 == null)
        {
            getFormatter();
            DateTimeFormatter adatetimeformatter2[] = iFormatter;
            adatetimeformatter = adatetimeformatter2;
            if (adatetimeformatter2 == null)
            {
                return toStringList();
            }
        }
        DateTimeFormatter datetimeformatter = adatetimeformatter[1];
        if (datetimeformatter == null)
        {
            return toStringList();
        } else
        {
            return datetimeformatter.print(this);
        }
    }

    public String toString(String s)
    {
        if (s == null)
        {
            return toString();
        } else
        {
            return DateTimeFormat.forPattern(s).print(this);
        }
    }

    public String toString(String s, Locale locale)
    {
        if (s == null)
        {
            return toString();
        } else
        {
            return DateTimeFormat.forPattern(s).withLocale(locale).print(this);
        }
    }

    public String toStringList()
    {
        int j = size();
        StringBuilder stringbuilder = new StringBuilder(j * 20);
        stringbuilder.append('[');
        for (int i = 0; i < j; i++)
        {
            if (i > 0)
            {
                stringbuilder.append(',').append(' ');
            }
            stringbuilder.append(iTypes[i].getName());
            stringbuilder.append('=');
            stringbuilder.append(iValues[i]);
        }

        stringbuilder.append(']');
        return stringbuilder.toString();
    }

    public Partial with(DateTimeFieldType datetimefieldtype, int i)
    {
        int j;
        if (datetimefieldtype == null)
        {
            throw new IllegalArgumentException("The field type must not be null");
        }
        j = indexOf(datetimefieldtype);
        if (j != -1) goto _L2; else goto _L1
_L1:
        int ai[];
        DateTimeFieldType adatetimefieldtype[];
        DurationField durationfield;
        adatetimefieldtype = new DateTimeFieldType[iTypes.length + 1];
        ai = new int[adatetimefieldtype.length];
        durationfield = datetimefieldtype.getDurationType().getField(iChronology);
        if (!durationfield.isSupported())
        {
            break MISSING_BLOCK_LABEL_347;
        }
        j = 0;
_L11:
        int k = j;
        if (j >= iTypes.length) goto _L4; else goto _L3
_L3:
        DateTimeFieldType datetimefieldtype1;
        DurationField durationfield1;
        datetimefieldtype1 = iTypes[j];
        durationfield1 = datetimefieldtype1.getDurationType().getField(iChronology);
        if (!durationfield1.isSupported()) goto _L6; else goto _L5
_L5:
        k = durationfield.compareTo(durationfield1);
        if (k <= 0) goto _L8; else goto _L7
_L7:
        k = j;
_L4:
        System.arraycopy(iTypes, 0, adatetimefieldtype, 0, k);
        System.arraycopy(iValues, 0, ai, 0, k);
        adatetimefieldtype[k] = datetimefieldtype;
        ai[k] = i;
        System.arraycopy(iTypes, k, adatetimefieldtype, k + 1, adatetimefieldtype.length - k - 1);
        System.arraycopy(iValues, k, ai, k + 1, ai.length - k - 1);
        datetimefieldtype = new Partial(adatetimefieldtype, ai, iChronology);
        iChronology.validate(datetimefieldtype, ai);
_L14:
        return datetimefieldtype;
_L8:
        if (k != 0) goto _L6; else goto _L9
_L9:
        k = j;
        if (datetimefieldtype.getRangeDurationType() == null) goto _L4; else goto _L10
_L6:
        j++;
          goto _L11
_L10:
        if (datetimefieldtype1.getRangeDurationType() == null || datetimefieldtype.getRangeDurationType().getField(iChronology).compareTo(datetimefieldtype1.getRangeDurationType().getField(iChronology)) <= 0) goto _L6; else goto _L12
_L12:
        k = j;
          goto _L4
_L2:
        datetimefieldtype = this;
        if (i == getValue(j)) goto _L14; else goto _L13
_L13:
        datetimefieldtype = getValues();
        return new Partial(this, getField(j).set(this, j, datetimefieldtype, i));
        k = 0;
          goto _L4
    }

    public Partial withChronologyRetainFields(Chronology chronology)
    {
        chronology = DateTimeUtils.getChronology(chronology).withUTC();
        if (chronology == getChronology())
        {
            return this;
        } else
        {
            Partial partial = new Partial(chronology, iTypes, iValues);
            chronology.validate(partial, iValues);
            return partial;
        }
    }

    public Partial withField(DateTimeFieldType datetimefieldtype, int i)
    {
        int j = indexOfSupported(datetimefieldtype);
        if (i == getValue(j))
        {
            return this;
        } else
        {
            datetimefieldtype = getValues();
            return new Partial(this, getField(j).set(this, j, datetimefieldtype, i));
        }
    }

    public Partial withFieldAddWrapped(DurationFieldType durationfieldtype, int i)
    {
        int j = indexOfSupported(durationfieldtype);
        if (i == 0)
        {
            return this;
        } else
        {
            durationfieldtype = getValues();
            return new Partial(this, getField(j).addWrapPartial(this, j, durationfieldtype, i));
        }
    }

    public Partial withFieldAdded(DurationFieldType durationfieldtype, int i)
    {
        int j = indexOfSupported(durationfieldtype);
        if (i == 0)
        {
            return this;
        } else
        {
            durationfieldtype = getValues();
            return new Partial(this, getField(j).add(this, j, durationfieldtype, i));
        }
    }

    public Partial withPeriodAdded(ReadablePeriod readableperiod, int i)
    {
        if (readableperiod == null || i == 0)
        {
            return this;
        }
        int ai[] = getValues();
        for (int j = 0; j < readableperiod.size();)
        {
            int k = indexOf(readableperiod.getFieldType(j));
            int ai1[] = ai;
            if (k >= 0)
            {
                ai1 = getField(k).add(this, k, ai, FieldUtils.safeMultiply(readableperiod.getValue(j), i));
            }
            j++;
            ai = ai1;
        }

        return new Partial(this, ai);
    }

    public Partial without(DateTimeFieldType datetimefieldtype)
    {
        int i = indexOf(datetimefieldtype);
        datetimefieldtype = this;
        if (i != -1)
        {
            datetimefieldtype = new DateTimeFieldType[size() - 1];
            int ai[] = new int[size() - 1];
            System.arraycopy(iTypes, 0, datetimefieldtype, 0, i);
            System.arraycopy(iTypes, i + 1, datetimefieldtype, i, datetimefieldtype.length - i);
            System.arraycopy(iValues, 0, ai, 0, i);
            System.arraycopy(iValues, i + 1, ai, i, ai.length - i);
            datetimefieldtype = new Partial(iChronology, datetimefieldtype, ai);
            iChronology.validate(datetimefieldtype, ai);
        }
        return datetimefieldtype;
    }
}

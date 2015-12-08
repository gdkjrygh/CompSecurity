// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.base;

import java.io.Serializable;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.ReadablePartial;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.PartialConverter;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

// Referenced classes of package org.joda.time.base:
//            AbstractPartial

public abstract class BasePartial extends AbstractPartial
    implements Serializable, ReadablePartial
{

    private static final long serialVersionUID = 0x85ca882d5755cL;
    private final Chronology iChronology;
    private final int iValues[];

    protected BasePartial()
    {
        this(DateTimeUtils.currentTimeMillis(), ((Chronology) (null)));
    }

    protected BasePartial(long l)
    {
        this(l, ((Chronology) (null)));
    }

    protected BasePartial(long l, Chronology chronology)
    {
        chronology = DateTimeUtils.getChronology(chronology);
        iChronology = chronology.withUTC();
        iValues = chronology.get(this, l);
    }

    protected BasePartial(Object obj, Chronology chronology)
    {
        PartialConverter partialconverter = ConverterManager.getInstance().getPartialConverter(obj);
        chronology = DateTimeUtils.getChronology(partialconverter.getChronology(obj, chronology));
        iChronology = chronology.withUTC();
        iValues = partialconverter.getPartialValues(this, obj, chronology);
    }

    protected BasePartial(Object obj, Chronology chronology, DateTimeFormatter datetimeformatter)
    {
        PartialConverter partialconverter = ConverterManager.getInstance().getPartialConverter(obj);
        chronology = DateTimeUtils.getChronology(partialconverter.getChronology(obj, chronology));
        iChronology = chronology.withUTC();
        iValues = partialconverter.getPartialValues(this, obj, chronology, datetimeformatter);
    }

    protected BasePartial(Chronology chronology)
    {
        this(DateTimeUtils.currentTimeMillis(), chronology);
    }

    protected BasePartial(BasePartial basepartial, Chronology chronology)
    {
        iChronology = chronology.withUTC();
        iValues = basepartial.iValues;
    }

    protected BasePartial(BasePartial basepartial, int ai[])
    {
        iChronology = basepartial.iChronology;
        iValues = ai;
    }

    protected BasePartial(int ai[], Chronology chronology)
    {
        chronology = DateTimeUtils.getChronology(chronology);
        iChronology = chronology.withUTC();
        chronology.validate(this, ai);
        iValues = ai;
    }

    public Chronology getChronology()
    {
        return iChronology;
    }

    public int getValue(int i)
    {
        return iValues[i];
    }

    public int[] getValues()
    {
        return (int[])(int[])iValues.clone();
    }

    protected void setValue(int i, int j)
    {
        System.arraycopy(getField(i).set(this, i, iValues, j), 0, iValues, 0, iValues.length);
    }

    protected void setValues(int ai[])
    {
        getChronology().validate(this, ai);
        System.arraycopy(ai, 0, iValues, 0, iValues.length);
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
        throws IllegalArgumentException
    {
        if (s == null)
        {
            return toString();
        } else
        {
            return DateTimeFormat.forPattern(s).withLocale(locale).print(this);
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadableDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.InstantConverter;

// Referenced classes of package org.joda.time.base:
//            AbstractDateTime

public abstract class BaseDateTime extends AbstractDateTime
    implements Serializable, ReadableDateTime
{

    private static final long serialVersionUID = 0xfffff9e14f5d2ea3L;
    private volatile Chronology iChronology;
    private volatile long iMillis;

    public BaseDateTime()
    {
        this(DateTimeUtils.currentTimeMillis(), ((Chronology) (ISOChronology.getInstance())));
    }

    public BaseDateTime(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        this(i, j, k, l, i1, j1, k1, ((Chronology) (ISOChronology.getInstance())));
    }

    public BaseDateTime(int i, int j, int k, int l, int i1, int j1, int k1, 
            Chronology chronology)
    {
        iChronology = checkChronology(chronology);
        iMillis = checkInstant(iChronology.getDateTimeMillis(i, j, k, l, i1, j1, k1), iChronology);
    }

    public BaseDateTime(int i, int j, int k, int l, int i1, int j1, int k1, 
            DateTimeZone datetimezone)
    {
        this(i, j, k, l, i1, j1, k1, ((Chronology) (ISOChronology.getInstance(datetimezone))));
    }

    public BaseDateTime(long l)
    {
        this(l, ((Chronology) (ISOChronology.getInstance())));
    }

    public BaseDateTime(long l, Chronology chronology)
    {
        iChronology = checkChronology(chronology);
        iMillis = checkInstant(l, iChronology);
        if (iChronology.year().isSupported())
        {
            iChronology.year().set(iMillis, iChronology.year().get(iMillis));
        }
    }

    public BaseDateTime(long l, DateTimeZone datetimezone)
    {
        this(l, ((Chronology) (ISOChronology.getInstance(datetimezone))));
    }

    public BaseDateTime(Object obj, Chronology chronology)
    {
        InstantConverter instantconverter = ConverterManager.getInstance().getInstantConverter(obj);
        iChronology = checkChronology(instantconverter.getChronology(obj, chronology));
        iMillis = checkInstant(instantconverter.getInstantMillis(obj, chronology), iChronology);
    }

    public BaseDateTime(Object obj, DateTimeZone datetimezone)
    {
        InstantConverter instantconverter = ConverterManager.getInstance().getInstantConverter(obj);
        datetimezone = checkChronology(instantconverter.getChronology(obj, datetimezone));
        iChronology = datetimezone;
        iMillis = checkInstant(instantconverter.getInstantMillis(obj, datetimezone), datetimezone);
    }

    public BaseDateTime(Chronology chronology)
    {
        this(DateTimeUtils.currentTimeMillis(), chronology);
    }

    public BaseDateTime(DateTimeZone datetimezone)
    {
        this(DateTimeUtils.currentTimeMillis(), ((Chronology) (ISOChronology.getInstance(datetimezone))));
    }

    protected Chronology checkChronology(Chronology chronology)
    {
        return DateTimeUtils.getChronology(chronology);
    }

    protected long checkInstant(long l, Chronology chronology)
    {
        return l;
    }

    public Chronology getChronology()
    {
        return iChronology;
    }

    public long getMillis()
    {
        return iMillis;
    }

    protected void setChronology(Chronology chronology)
    {
        iChronology = checkChronology(chronology);
    }

    protected void setMillis(long l)
    {
        iMillis = checkInstant(l, iChronology);
    }
}

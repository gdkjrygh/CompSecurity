// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormatter;

// Referenced classes of package org.joda.time.convert:
//            Converter

public abstract class AbstractConverter
    implements Converter
{

    protected AbstractConverter()
    {
    }

    public Chronology getChronology(Object obj, Chronology chronology)
    {
        return DateTimeUtils.getChronology(chronology);
    }

    public Chronology getChronology(Object obj, DateTimeZone datetimezone)
    {
        return ISOChronology.getInstance(datetimezone);
    }

    public long getInstantMillis(Object obj, Chronology chronology)
    {
        return DateTimeUtils.currentTimeMillis();
    }

    public int[] getPartialValues(ReadablePartial readablepartial, Object obj, Chronology chronology)
    {
        return chronology.get(readablepartial, getInstantMillis(obj, chronology));
    }

    public int[] getPartialValues(ReadablePartial readablepartial, Object obj, Chronology chronology, DateTimeFormatter datetimeformatter)
    {
        return getPartialValues(readablepartial, obj, chronology);
    }

    public PeriodType getPeriodType(Object obj)
    {
        return PeriodType.standard();
    }

    public boolean isReadableInterval(Object obj, Chronology chronology)
    {
        return false;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("Converter[");
        String s;
        if (getSupportedType() == null)
        {
            s = "null";
        } else
        {
            s = getSupportedType().getName();
        }
        return stringbuilder.append(s).append("]").toString();
    }
}

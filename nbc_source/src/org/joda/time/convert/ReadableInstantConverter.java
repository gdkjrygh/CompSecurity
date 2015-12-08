// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.ISOChronology;

// Referenced classes of package org.joda.time.convert:
//            AbstractConverter, InstantConverter, PartialConverter

class ReadableInstantConverter extends AbstractConverter
    implements InstantConverter, PartialConverter
{

    static final ReadableInstantConverter INSTANCE = new ReadableInstantConverter();

    protected ReadableInstantConverter()
    {
    }

    public Chronology getChronology(Object obj, Chronology chronology)
    {
        Chronology chronology1 = chronology;
        if (chronology == null)
        {
            chronology1 = DateTimeUtils.getChronology(((ReadableInstant)obj).getChronology());
        }
        return chronology1;
    }

    public Chronology getChronology(Object obj, DateTimeZone datetimezone)
    {
        Chronology chronology = ((ReadableInstant)obj).getChronology();
        if (chronology == null)
        {
            obj = ISOChronology.getInstance(datetimezone);
        } else
        {
            obj = chronology;
            if (chronology.getZone() != datetimezone)
            {
                chronology = chronology.withZone(datetimezone);
                obj = chronology;
                if (chronology == null)
                {
                    return ISOChronology.getInstance(datetimezone);
                }
            }
        }
        return ((Chronology) (obj));
    }

    public long getInstantMillis(Object obj, Chronology chronology)
    {
        return ((ReadableInstant)obj).getMillis();
    }

    public Class getSupportedType()
    {
        return org/joda/time/ReadableInstant;
    }

}

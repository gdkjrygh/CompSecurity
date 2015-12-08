// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadableDuration;

// Referenced classes of package org.joda.time.convert:
//            AbstractConverter, DurationConverter, PeriodConverter

class ReadableDurationConverter extends AbstractConverter
    implements DurationConverter, PeriodConverter
{

    static final ReadableDurationConverter INSTANCE = new ReadableDurationConverter();

    protected ReadableDurationConverter()
    {
    }

    public long getDurationMillis(Object obj)
    {
        return ((ReadableDuration)obj).getMillis();
    }

    public Class getSupportedType()
    {
        return org/joda/time/ReadableDuration;
    }

    public void setInto(ReadWritablePeriod readwritableperiod, Object obj, Chronology chronology)
    {
        obj = (ReadableDuration)obj;
        obj = DateTimeUtils.getChronology(chronology).get(readwritableperiod, ((ReadableDuration) (obj)).getMillis());
        for (int i = 0; i < obj.length; i++)
        {
            readwritableperiod.setValue(i, obj[i]);
        }

    }

}

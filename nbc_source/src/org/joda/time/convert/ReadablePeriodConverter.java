// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;

// Referenced classes of package org.joda.time.convert:
//            AbstractConverter, PeriodConverter

class ReadablePeriodConverter extends AbstractConverter
    implements PeriodConverter
{

    static final ReadablePeriodConverter INSTANCE = new ReadablePeriodConverter();

    protected ReadablePeriodConverter()
    {
    }

    public PeriodType getPeriodType(Object obj)
    {
        return ((ReadablePeriod)obj).getPeriodType();
    }

    public Class getSupportedType()
    {
        return org/joda/time/ReadablePeriod;
    }

    public void setInto(ReadWritablePeriod readwritableperiod, Object obj, Chronology chronology)
    {
        readwritableperiod.setPeriod((ReadablePeriod)obj);
    }

}

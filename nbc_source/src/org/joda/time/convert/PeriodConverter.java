// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;

// Referenced classes of package org.joda.time.convert:
//            Converter

public interface PeriodConverter
    extends Converter
{

    public abstract PeriodType getPeriodType(Object obj);

    public abstract void setInto(ReadWritablePeriod readwritableperiod, Object obj, Chronology chronology);
}

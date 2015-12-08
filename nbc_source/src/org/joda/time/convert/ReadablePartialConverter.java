// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;

// Referenced classes of package org.joda.time.convert:
//            AbstractConverter, PartialConverter

class ReadablePartialConverter extends AbstractConverter
    implements PartialConverter
{

    static final ReadablePartialConverter INSTANCE = new ReadablePartialConverter();

    protected ReadablePartialConverter()
    {
    }

    public Chronology getChronology(Object obj, Chronology chronology)
    {
        Chronology chronology1 = chronology;
        if (chronology == null)
        {
            chronology1 = DateTimeUtils.getChronology(((ReadablePartial)obj).getChronology());
        }
        return chronology1;
    }

    public Chronology getChronology(Object obj, DateTimeZone datetimezone)
    {
        return getChronology(obj, (Chronology)null).withZone(datetimezone);
    }

    public int[] getPartialValues(ReadablePartial readablepartial, Object obj, Chronology chronology)
    {
        obj = (ReadablePartial)obj;
        int j = readablepartial.size();
        int ai[] = new int[j];
        for (int i = 0; i < j; i++)
        {
            ai[i] = ((ReadablePartial) (obj)).get(readablepartial.getFieldType(i));
        }

        chronology.validate(readablepartial, ai);
        return ai;
    }

    public Class getSupportedType()
    {
        return org/joda/time/ReadablePartial;
    }

}

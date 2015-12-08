// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.text.DateFormat;
import java.util.Calendar;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            DateTimeSerializerBase

public class CalendarSerializer extends DateTimeSerializerBase
{

    public static final CalendarSerializer instance = new CalendarSerializer();

    public CalendarSerializer()
    {
        this(null, null);
    }

    public CalendarSerializer(Boolean boolean1, DateFormat dateformat)
    {
        super(java/util/Calendar, boolean1, dateformat);
    }

    protected volatile long _timestamp(Object obj)
    {
        return _timestamp((Calendar)obj);
    }

    protected long _timestamp(Calendar calendar)
    {
        if (calendar == null)
        {
            return 0L;
        } else
        {
            return calendar.getTimeInMillis();
        }
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        serialize((Calendar)obj, jsongenerator, serializerprovider);
    }

    public void serialize(Calendar calendar, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        if (_asTimestamp(serializerprovider))
        {
            jsongenerator.writeNumber(_timestamp(calendar));
            return;
        }
        if (_customFormat != null)
        {
            synchronized (_customFormat)
            {
                jsongenerator.writeString(_customFormat.format(calendar.getTime()));
            }
            return;
        } else
        {
            serializerprovider.defaultSerializeDateValue(calendar.getTime(), jsongenerator);
            return;
        }
        calendar;
        serializerprovider;
        JVM INSTR monitorexit ;
        throw calendar;
    }

    public CalendarSerializer withFormat(Boolean boolean1, DateFormat dateformat)
    {
        return new CalendarSerializer(boolean1, dateformat);
    }

    public volatile DateTimeSerializerBase withFormat(Boolean boolean1, DateFormat dateformat)
    {
        return withFormat(boolean1, dateformat);
    }

}

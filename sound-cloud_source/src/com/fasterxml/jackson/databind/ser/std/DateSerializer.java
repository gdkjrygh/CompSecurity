// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            DateTimeSerializerBase

public class DateSerializer extends DateTimeSerializerBase
{

    public static DateSerializer instance = new DateSerializer();

    public DateSerializer()
    {
        this(false, null);
    }

    public DateSerializer(boolean flag, DateFormat dateformat)
    {
        super(java/util/Date, flag, dateformat);
    }

    protected volatile long _timestamp(Object obj)
    {
        return _timestamp((Date)obj);
    }

    protected long _timestamp(Date date)
    {
        if (date == null)
        {
            return 0L;
        } else
        {
            return date.getTime();
        }
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serialize((Date)obj, jsongenerator, serializerprovider);
    }

    public void serialize(Date date, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        if (_useTimestamp)
        {
            jsongenerator.writeNumber(_timestamp(date));
            return;
        }
        if (_customFormat != null)
        {
            synchronized (_customFormat)
            {
                jsongenerator.writeString(_customFormat.format(date));
            }
            return;
        } else
        {
            serializerprovider.defaultSerializeDateValue(date, jsongenerator);
            return;
        }
        date;
        serializerprovider;
        JVM INSTR monitorexit ;
        throw date;
    }

    public DateSerializer withFormat(boolean flag, DateFormat dateformat)
    {
        if (flag)
        {
            return new DateSerializer(true, null);
        } else
        {
            return new DateSerializer(false, dateformat);
        }
    }

    public volatile DateTimeSerializerBase withFormat(boolean flag, DateFormat dateformat)
    {
        return withFormat(flag, dateformat);
    }

}

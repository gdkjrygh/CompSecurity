// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.sql.Date;
import java.text.DateFormat;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            DateTimeSerializerBase

public class SqlDateSerializer extends DateTimeSerializerBase
{

    public SqlDateSerializer()
    {
        this(Boolean.FALSE);
    }

    protected SqlDateSerializer(Boolean boolean1)
    {
        super(java/sql/Date, boolean1, null);
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
    {
        serialize((Date)obj, jsongenerator, serializerprovider);
    }

    public void serialize(Date date, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        if (_useTimestamp.booleanValue())
        {
            jsongenerator.writeNumber(_timestamp(date));
            return;
        } else
        {
            jsongenerator.writeString(date.toString());
            return;
        }
    }

    public volatile DateTimeSerializerBase withFormat(Boolean boolean1, DateFormat dateformat)
    {
        return withFormat(boolean1, dateformat);
    }

    public SqlDateSerializer withFormat(Boolean boolean1, DateFormat dateformat)
    {
        return new SqlDateSerializer(boolean1);
    }
}

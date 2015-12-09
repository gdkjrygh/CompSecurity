// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Calendar;
import java.util.Date;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdKeySerializer

public class StdKeySerializers
{

    protected static final JsonSerializer DEFAULT_KEY_SERIALIZER = new StdKeySerializer();
    protected static final JsonSerializer DEFAULT_STRING_SERIALIZER = new StringKeySerializer();

    public static JsonSerializer getStdKeySerializer(JavaType javatype)
    {
        if (javatype == null)
        {
            return DEFAULT_KEY_SERIALIZER;
        }
        javatype = javatype.getRawClass();
        if (javatype == java/lang/String)
        {
            return DEFAULT_STRING_SERIALIZER;
        }
        if (javatype == java/lang/Object || javatype.isPrimitive() || java/lang/Number.isAssignableFrom(javatype))
        {
            return DEFAULT_KEY_SERIALIZER;
        }
        if (java/util/Date.isAssignableFrom(javatype))
        {
            return DateKeySerializer.instance;
        }
        if (java/util/Calendar.isAssignableFrom(javatype))
        {
            return CalendarKeySerializer.instance;
        } else
        {
            return DEFAULT_KEY_SERIALIZER;
        }
    }


    private class DateKeySerializer extends StdSerializer
    {

        protected static final JsonSerializer instance = new DateKeySerializer();

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            serialize((Date)obj, jsongenerator, serializerprovider);
        }

        public void serialize(Date date, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            serializerprovider.defaultSerializeDateKey(date, jsongenerator);
        }


        public DateKeySerializer()
        {
            super(java/util/Date);
        }
    }


    private class CalendarKeySerializer extends StdSerializer
    {

        protected static final JsonSerializer instance = new CalendarKeySerializer();

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            serialize((Calendar)obj, jsongenerator, serializerprovider);
        }

        public void serialize(Calendar calendar, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            serializerprovider.defaultSerializeDateKey(calendar.getTimeInMillis(), jsongenerator);
        }


        public CalendarKeySerializer()
        {
            super(java/util/Calendar);
        }
    }


    private class StringKeySerializer extends StdSerializer
    {

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            serialize((String)obj, jsongenerator, serializerprovider);
        }

        public void serialize(String s, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            jsongenerator.writeFieldName(s);
        }

        public StringKeySerializer()
        {
            super(java/lang/String);
        }
    }

}

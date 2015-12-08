// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdKeySerializer, StdSerializer

public class StdKeySerializers
{
    public static class CalendarKeySerializer extends StdSerializer
    {

        protected static final JsonSerializer instance = new CalendarKeySerializer();

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((Calendar)obj, jsongenerator, serializerprovider);
        }

        public void serialize(Calendar calendar, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serializerprovider.defaultSerializeDateKey(calendar.getTimeInMillis(), jsongenerator);
        }


        public CalendarKeySerializer()
        {
            super(java/util/Calendar);
        }
    }

    public static class ClassKeySerializer extends StdSerializer
    {

        protected static final JsonSerializer instance = new ClassKeySerializer();

        public void serialize(Class class1, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            jsongenerator.writeFieldName(class1.getName());
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((Class)obj, jsongenerator, serializerprovider);
        }


        public ClassKeySerializer()
        {
            super(java/lang/Class, false);
        }
    }

    public static class DateKeySerializer extends StdSerializer
    {

        protected static final JsonSerializer instance = new DateKeySerializer();

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((Date)obj, jsongenerator, serializerprovider);
        }

        public void serialize(Date date, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serializerprovider.defaultSerializeDateKey(date, jsongenerator);
        }


        public DateKeySerializer()
        {
            super(java/util/Date);
        }
    }

    public static class StringKeySerializer extends StdSerializer
    {

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((String)obj, jsongenerator, serializerprovider);
        }

        public void serialize(String s, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            jsongenerator.writeFieldName(s);
        }

        public StringKeySerializer()
        {
            super(java/lang/String);
        }
    }


    protected static final JsonSerializer DEFAULT_KEY_SERIALIZER = new StdKeySerializer();
    protected static final JsonSerializer DEFAULT_STRING_SERIALIZER = new StringKeySerializer();

    public static JsonSerializer getDefault()
    {
        return DEFAULT_KEY_SERIALIZER;
    }

    public static JsonSerializer getStdKeySerializer(SerializationConfig serializationconfig, Class class1, boolean flag)
    {
        if (class1 != null)
        {
            if (class1 == java/lang/String)
            {
                return DEFAULT_STRING_SERIALIZER;
            }
            if (class1 == java/lang/Object || class1.isPrimitive() || java/lang/Number.isAssignableFrom(class1))
            {
                return DEFAULT_KEY_SERIALIZER;
            }
            if (class1 == java/lang/Class)
            {
                return ClassKeySerializer.instance;
            }
            if (java/util/Date.isAssignableFrom(class1))
            {
                return DateKeySerializer.instance;
            }
            if (java/util/Calendar.isAssignableFrom(class1))
            {
                return CalendarKeySerializer.instance;
            }
        }
        if (flag)
        {
            return DEFAULT_KEY_SERIALIZER;
        } else
        {
            return null;
        }
    }

}

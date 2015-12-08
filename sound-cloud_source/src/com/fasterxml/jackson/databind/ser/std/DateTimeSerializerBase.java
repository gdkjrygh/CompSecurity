// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdScalarSerializer

public abstract class DateTimeSerializerBase extends StdScalarSerializer
    implements ContextualSerializer
{

    protected final DateFormat _customFormat;
    protected final boolean _useTimestamp;

    protected DateTimeSerializerBase(Class class1, boolean flag, DateFormat dateformat)
    {
        super(class1);
        _useTimestamp = flag;
        _customFormat = dateformat;
    }

    protected abstract long _timestamp(Object obj);

    public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
        throws JsonMappingException
    {
        Object obj = this;
        if (beanproperty != null)
        {
            beanproperty = serializerprovider.getAnnotationIntrospector().findFormat(beanproperty.getMember());
            obj = this;
            if (beanproperty != null)
            {
                if (beanproperty.getShape().isNumeric())
                {
                    obj = withFormat(true, null);
                } else
                {
                    java.util.TimeZone timezone = beanproperty.getTimeZone();
                    String s = beanproperty.getPattern();
                    if (s.length() > 0)
                    {
                        obj = beanproperty.getLocale();
                        beanproperty = ((BeanProperty) (obj));
                        if (obj == null)
                        {
                            beanproperty = serializerprovider.getLocale();
                        }
                        beanproperty = new SimpleDateFormat(s, beanproperty);
                        if (timezone == null)
                        {
                            serializerprovider = serializerprovider.getTimeZone();
                        } else
                        {
                            serializerprovider = timezone;
                        }
                        beanproperty.setTimeZone(serializerprovider);
                        return withFormat(false, beanproperty);
                    }
                    obj = this;
                    if (timezone != null)
                    {
                        serializerprovider = serializerprovider.getConfig().getDateFormat();
                        if (serializerprovider.getClass() == com/fasterxml/jackson/databind/util/StdDateFormat)
                        {
                            serializerprovider = StdDateFormat.getISO8601Format(timezone);
                        } else
                        {
                            serializerprovider = (DateFormat)serializerprovider.clone();
                            serializerprovider.setTimeZone(timezone);
                        }
                        return withFormat(false, serializerprovider);
                    }
                }
            }
        }
        return ((JsonSerializer) (obj));
    }

    public boolean isEmpty(Object obj)
    {
        return obj == null || _timestamp(obj) == 0L;
    }

    public abstract DateTimeSerializerBase withFormat(boolean flag, DateFormat dateformat);
}

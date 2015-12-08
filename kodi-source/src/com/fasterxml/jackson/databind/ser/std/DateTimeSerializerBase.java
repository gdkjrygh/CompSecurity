// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
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
    protected final Boolean _useTimestamp;

    protected DateTimeSerializerBase(Class class1, Boolean boolean1, DateFormat dateformat)
    {
        super(class1);
        _useTimestamp = boolean1;
        _customFormat = dateformat;
    }

    protected boolean _asTimestamp(SerializerProvider serializerprovider)
    {
        if (_useTimestamp != null)
        {
            return _useTimestamp.booleanValue();
        }
        if (_customFormat == null)
        {
            if (serializerprovider != null)
            {
                return serializerprovider.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
            } else
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Null 'provider' passed for ").append(handledType().getName()).toString());
            }
        } else
        {
            return false;
        }
    }

    protected abstract long _timestamp(Object obj);

    public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
        throws JsonMappingException
    {
        java.util.TimeZone timezone = null;
        Object obj = this;
        if (beanproperty != null)
        {
            Object obj1 = serializerprovider.getAnnotationIntrospector().findFormat(beanproperty.getMember());
            obj = this;
            if (obj1 != null)
            {
                if (((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj1)).getShape().isNumeric())
                {
                    obj = withFormat(Boolean.TRUE, null);
                } else
                {
                    beanproperty = timezone;
                    if (((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj1)).getShape() == com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING)
                    {
                        beanproperty = Boolean.FALSE;
                    }
                    timezone = ((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj1)).getTimeZone();
                    if (((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj1)).hasPattern())
                    {
                        String s = ((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj1)).getPattern();
                        if (((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj1)).hasLocale())
                        {
                            obj = ((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj1)).getLocale();
                        } else
                        {
                            obj = serializerprovider.getLocale();
                        }
                        obj1 = new SimpleDateFormat(s, ((java.util.Locale) (obj)));
                        obj = timezone;
                        if (timezone == null)
                        {
                            obj = serializerprovider.getTimeZone();
                        }
                        ((SimpleDateFormat) (obj1)).setTimeZone(((java.util.TimeZone) (obj)));
                        return withFormat(beanproperty, ((DateFormat) (obj1)));
                    }
                    obj = this;
                    if (timezone != null)
                    {
                        DateFormat dateformat = serializerprovider.getConfig().getDateFormat();
                        if (dateformat.getClass() == com/fasterxml/jackson/databind/util/StdDateFormat)
                        {
                            if (((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj1)).hasLocale())
                            {
                                serializerprovider = ((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj1)).getLocale();
                            } else
                            {
                                serializerprovider = serializerprovider.getLocale();
                            }
                            serializerprovider = StdDateFormat.getISO8601Format(timezone, serializerprovider);
                        } else
                        {
                            serializerprovider = (DateFormat)dateformat.clone();
                            serializerprovider.setTimeZone(timezone);
                        }
                        return withFormat(beanproperty, serializerprovider);
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

    public abstract DateTimeSerializerBase withFormat(Boolean boolean1, DateFormat dateformat);
}

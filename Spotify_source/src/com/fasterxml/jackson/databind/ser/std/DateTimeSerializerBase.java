// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
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
                throw new IllegalArgumentException((new StringBuilder("Null 'provider' passed for ")).append(handledType().getName()).toString());
            }
        } else
        {
            return false;
        }
    }

    protected abstract long _timestamp(Object obj);

    public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
    {
        Object obj = this;
        if (beanproperty != null)
        {
            com.fasterxml.jackson.annotation.JsonFormat.Value value = serializerprovider.getAnnotationIntrospector().findFormat(beanproperty.getMember());
            obj = this;
            if (value != null)
            {
                if (value.getShape().isNumeric())
                {
                    obj = withFormat(Boolean.TRUE, null);
                } else
                {
                    java.util.TimeZone timezone;
                    if (value.getShape() == com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING)
                    {
                        beanproperty = Boolean.FALSE;
                    } else
                    {
                        beanproperty = null;
                    }
                    timezone = value.getTimeZone();
                    if (value.hasPattern())
                    {
                        String s = value.getPattern();
                        if (value.hasLocale())
                        {
                            obj = value.getLocale();
                        } else
                        {
                            obj = serializerprovider.getLocale();
                        }
                        obj = new SimpleDateFormat(s, ((java.util.Locale) (obj)));
                        if (timezone == null)
                        {
                            serializerprovider = serializerprovider.getTimeZone();
                        } else
                        {
                            serializerprovider = timezone;
                        }
                        ((SimpleDateFormat) (obj)).setTimeZone(serializerprovider);
                        return withFormat(beanproperty, ((DateFormat) (obj)));
                    }
                    obj = this;
                    if (timezone != null)
                    {
                        obj = serializerprovider.getConfig().getDateFormat();
                        if (obj.getClass() == com/fasterxml/jackson/databind/util/StdDateFormat)
                        {
                            if (value.hasLocale())
                            {
                                serializerprovider = value.getLocale();
                            } else
                            {
                                serializerprovider = serializerprovider.getLocale();
                            }
                            serializerprovider = StdDateFormat.getISO8601Format(timezone, serializerprovider);
                        } else
                        {
                            serializerprovider = (DateFormat)((DateFormat) (obj)).clone();
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

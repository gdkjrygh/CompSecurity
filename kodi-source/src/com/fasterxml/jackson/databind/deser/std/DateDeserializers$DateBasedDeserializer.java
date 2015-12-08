// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdScalarDeserializer, DateDeserializers

protected static abstract class _formatString extends StdScalarDeserializer
    implements ContextualDeserializer
{

    protected final DateFormat _customFormat;
    protected final String _formatString;

    protected Date _parseDate(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        Object obj;
        if (_customFormat == null)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        obj = jsonparser.getCurrentToken();
        if (obj != JsonToken.VALUE_STRING)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        deserializationcontext = jsonparser.getText().trim();
        if (deserializationcontext.length() == 0)
        {
            return (Date)getEmptyValue();
        }
        if (true) goto _L2; else goto _L1
_L1:
        jsonparser;
        JVM INSTR monitorenter ;
_L2:
        synchronized (_customFormat)
        {
            obj = _customFormat.parse(deserializationcontext);
        }
        return ((Date) (obj));
        deserializationcontext;
        jsonparser;
        JVM INSTR monitorexit ;
        throw deserializationcontext;
        obj;
        throw new IllegalArgumentException((new StringBuilder()).append("Failed to parse Date value '").append(deserializationcontext).append("' (format: \"").append(_formatString).append("\"): ").append(((ParseException) (obj)).getMessage()).toString());
        if (obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
        {
            jsonparser.nextToken();
            Date date = _parseDate(jsonparser, deserializationcontext);
            if (jsonparser.nextToken() != JsonToken.END_ARRAY)
            {
                throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'java.util.Date' value but there was more than a single value in the array");
            } else
            {
                return date;
            }
        }
        return super._parseDate(jsonparser, deserializationcontext);
    }

    public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
        throws JsonMappingException
    {
        Object obj = this;
        if (beanproperty != null)
        {
            Object obj1 = deserializationcontext.getAnnotationIntrospector().findFormat(beanproperty.getMember());
            obj = this;
            if (obj1 != null)
            {
                java.util.TimeZone timezone = ((com.fasterxml.jackson.annotation.pector) (obj1)).pector();
                if (((com.fasterxml.jackson.annotation.pector) (obj1)).pector())
                {
                    obj = ((com.fasterxml.jackson.annotation.pector) (obj1)).pector();
                    if (((com.fasterxml.jackson.annotation.pector) (obj1)).pector())
                    {
                        beanproperty = ((com.fasterxml.jackson.annotation.pector) (obj1)).pector();
                    } else
                    {
                        beanproperty = deserializationcontext.getLocale();
                    }
                    obj1 = new SimpleDateFormat(((String) (obj)), beanproperty);
                    beanproperty = timezone;
                    if (timezone == null)
                    {
                        beanproperty = deserializationcontext.getTimeZone();
                    }
                    ((SimpleDateFormat) (obj1)).setTimeZone(beanproperty);
                    obj = withDateFormat(((DateFormat) (obj1)), ((String) (obj)));
                } else
                {
                    obj = this;
                    if (timezone != null)
                    {
                        beanproperty = deserializationcontext.getConfig().getDateFormat();
                        if (beanproperty.getClass() == com/fasterxml/jackson/databind/util/StdDateFormat)
                        {
                            if (((com.fasterxml.jackson.annotation.ializer.withDateFormat) (obj1)).withDateFormat())
                            {
                                deserializationcontext = ((com.fasterxml.jackson.annotation.ializer.withDateFormat) (obj1)).withDateFormat();
                            } else
                            {
                                deserializationcontext = deserializationcontext.getLocale();
                            }
                            deserializationcontext = ((StdDateFormat)beanproperty).withTimeZone(timezone).withLocale(deserializationcontext);
                        } else
                        {
                            deserializationcontext = (DateFormat)beanproperty.clone();
                            deserializationcontext.setTimeZone(timezone);
                        }
                        return withDateFormat(deserializationcontext, _formatString);
                    }
                }
            }
        }
        return ((JsonDeserializer) (obj));
    }

    protected abstract _formatString withDateFormat(DateFormat dateformat, String s);

    protected ( , DateFormat dateformat, String s)
    {
        super(._valueClass);
        _customFormat = dateformat;
        _formatString = s;
    }

    protected _formatString(Class class1)
    {
        super(class1);
        _customFormat = null;
        _formatString = null;
    }
}

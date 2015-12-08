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
        if (_customFormat == null || jsonparser.getCurrentToken() != JsonToken.VALUE_STRING)
        {
            break MISSING_BLOCK_LABEL_114;
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
        Date date;
        synchronized (_customFormat)
        {
            date = _customFormat.parse(deserializationcontext);
        }
        return date;
        deserializationcontext;
        jsonparser;
        JVM INSTR monitorexit ;
        throw deserializationcontext;
        ParseException parseexception;
        parseexception;
        throw new IllegalArgumentException((new StringBuilder("Failed to parse Date value '")).append(deserializationcontext).append("' (format: \"").append(_formatString).append("\"): ").append(parseexception.getMessage()).toString());
        return super._parseDate(jsonparser, deserializationcontext);
    }

    public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
        throws JsonMappingException
    {
        Object obj = this;
        if (beanproperty != null)
        {
            beanproperty = deserializationcontext.getAnnotationIntrospector().findFormat(beanproperty.getMember());
            obj = this;
            if (beanproperty != null)
            {
                java.util.TimeZone timezone = beanproperty.pector();
                String s = beanproperty.pector();
                if (s.length() > 0)
                {
                    obj = beanproperty.pector();
                    beanproperty = ((BeanProperty) (obj));
                    if (obj == null)
                    {
                        beanproperty = deserializationcontext.getLocale();
                    }
                    beanproperty = new SimpleDateFormat(s, beanproperty);
                    if (timezone == null)
                    {
                        deserializationcontext = deserializationcontext.getTimeZone();
                    } else
                    {
                        deserializationcontext = timezone;
                    }
                    beanproperty.setTimeZone(deserializationcontext);
                    obj = withDateFormat(beanproperty, s);
                } else
                {
                    obj = this;
                    if (timezone != null)
                    {
                        deserializationcontext = deserializationcontext.getConfig().getDateFormat();
                        if (deserializationcontext.getClass() == com/fasterxml/jackson/databind/util/StdDateFormat)
                        {
                            deserializationcontext = ((StdDateFormat)deserializationcontext).withTimeZone(timezone);
                        } else
                        {
                            deserializationcontext = (DateFormat)deserializationcontext.clone();
                            deserializationcontext.setTimeZone(timezone);
                        }
                        return withDateFormat(deserializationcontext, s);
                    }
                }
            }
        }
        return ((JsonDeserializer) (obj));
    }

    protected abstract withDateFormat withDateFormat(DateFormat dateformat, String s);

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

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdScalarDeserializer

public abstract class _formatString extends StdScalarDeserializer
    implements ContextualDeserializer
{

    protected final DateFormat _customFormat;
    protected final String _formatString;

    protected Date _parseDate(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        Object obj;
        if (_customFormat == null)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        obj = jsonparser.getCurrentToken();
        if (obj != JsonToken.VALUE_STRING) goto _L2; else goto _L1
_L1:
        deserializationcontext = jsonparser.getText().trim();
        if (deserializationcontext.length() != 0) goto _L4; else goto _L3
_L3:
        obj = (Date)getEmptyValue();
_L6:
        return ((Date) (obj));
        JVM INSTR monitorenter ;
_L4:
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
        throw new IllegalArgumentException((new StringBuilder("Failed to parse Date value '")).append(deserializationcontext).append("' (format: \"").append(_formatString).append("\"): ").append(((ParseException) (obj)).getMessage()).toString());
_L2:
        if (obj != JsonToken.START_ARRAY || !deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
        {
            break MISSING_BLOCK_LABEL_168;
        }
        jsonparser.nextToken();
        obj = _parseDate(jsonparser, deserializationcontext);
        if (jsonparser.nextToken() == JsonToken.END_ARRAY) goto _L6; else goto _L5
_L5:
        throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'java.util.Date' value but there was more than a single value in the array");
        return super._parseDate(jsonparser, deserializationcontext);
    }

    public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
    {
        Object obj = this;
        if (beanproperty != null)
        {
            com.fasterxml.jackson.annotation.ializer ializer = deserializationcontext.getAnnotationIntrospector().findFormat(beanproperty.getMember());
            obj = this;
            if (ializer != null)
            {
                java.util.TimeZone timezone = ializer.pector();
                if (ializer.pector())
                {
                    obj = ializer.pector();
                    if (ializer.pector())
                    {
                        beanproperty = ializer.pector();
                    } else
                    {
                        beanproperty = deserializationcontext.getLocale();
                    }
                    beanproperty = new SimpleDateFormat(((String) (obj)), beanproperty);
                    if (timezone == null)
                    {
                        deserializationcontext = deserializationcontext.getTimeZone();
                    } else
                    {
                        deserializationcontext = timezone;
                    }
                    beanproperty.setTimeZone(deserializationcontext);
                    obj = withDateFormat(beanproperty, ((String) (obj)));
                } else
                {
                    obj = this;
                    if (timezone != null)
                    {
                        beanproperty = deserializationcontext.getConfig().getDateFormat();
                        if (beanproperty.getClass() == com/fasterxml/jackson/databind/util/StdDateFormat)
                        {
                            if (ializer.withDateFormat())
                            {
                                deserializationcontext = ializer.withDateFormat();
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

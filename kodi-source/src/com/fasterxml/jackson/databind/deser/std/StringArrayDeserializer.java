// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdDeserializer

public final class StringArrayDeserializer extends StdDeserializer
    implements ContextualDeserializer
{

    public static final StringArrayDeserializer instance = new StringArrayDeserializer();
    protected JsonDeserializer _elementDeserializer;

    public StringArrayDeserializer()
    {
        super([Ljava/lang/String;);
        _elementDeserializer = null;
    }

    protected StringArrayDeserializer(JsonDeserializer jsondeserializer)
    {
        super([Ljava/lang/String;);
        _elementDeserializer = jsondeserializer;
    }

    private final String[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        Object obj = null;
        if (!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
        {
            if (jsonparser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().length() == 0)
            {
                return null;
            } else
            {
                throw deserializationcontext.mappingException(_valueClass);
            }
        }
        if (jsonparser.getCurrentToken() == JsonToken.VALUE_NULL)
        {
            jsonparser = obj;
        } else
        {
            jsonparser = _parseString(jsonparser, deserializationcontext);
        }
        return (new String[] {
            jsonparser
        });
    }

    protected final String[] _deserializeCustom(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        Object aobj[];
        ObjectBuffer objectbuffer;
        JsonDeserializer jsondeserializer;
        int i;
        objectbuffer = deserializationcontext.leaseObjectBuffer();
        aobj = objectbuffer.resetAndStart();
        jsondeserializer = _elementDeserializer;
        i = 0;
_L5:
        Object obj;
        JsonToken jsontoken;
        if (jsonparser.nextTextValue() != null)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        obj = jsonparser.getCurrentToken();
        jsontoken = JsonToken.END_ARRAY;
        if (obj == jsontoken)
        {
            jsonparser = (String[])objectbuffer.completeAndClearBuffer(aobj, i, java/lang/String);
            deserializationcontext.returnObjectBuffer(objectbuffer);
            return jsonparser;
        }
        if (obj != JsonToken.VALUE_NULL) goto _L2; else goto _L1
_L1:
        obj = (String)jsondeserializer.getNullValue();
_L6:
        if (i < aobj.length) goto _L4; else goto _L3
_L3:
        aobj = objectbuffer.appendCompletedChunk(aobj);
        i = 0;
_L4:
        int j = i + 1;
        aobj[i] = obj;
        i = j;
          goto _L5
_L2:
        try
        {
            obj = (String)jsondeserializer.deserialize(jsonparser, deserializationcontext);
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            throw JsonMappingException.wrapWithPath(jsonparser, java/lang/String, i);
        }
          goto _L6
        obj = (String)jsondeserializer.deserialize(jsonparser, deserializationcontext);
          goto _L6
    }

    public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
        throws JsonMappingException
    {
        JsonDeserializer jsondeserializer = findConvertingContentDeserializer(deserializationcontext, beanproperty, _elementDeserializer);
        com.fasterxml.jackson.databind.JavaType javatype = deserializationcontext.constructType(java/lang/String);
        if (jsondeserializer == null)
        {
            deserializationcontext = deserializationcontext.findContextualValueDeserializer(javatype, beanproperty);
        } else
        {
            deserializationcontext = deserializationcontext.handleSecondaryContextualization(jsondeserializer, beanproperty, javatype);
        }
        beanproperty = deserializationcontext;
        if (deserializationcontext != null)
        {
            beanproperty = deserializationcontext;
            if (isDefaultDeserializer(deserializationcontext))
            {
                beanproperty = null;
            }
        }
        deserializationcontext = this;
        if (_elementDeserializer != beanproperty)
        {
            deserializationcontext = new StringArrayDeserializer(beanproperty);
        }
        return deserializationcontext;
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public String[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        Object aobj[];
        ObjectBuffer objectbuffer;
        int i;
        if (!jsonparser.isExpectedStartArrayToken())
        {
            return handleNonArray(jsonparser, deserializationcontext);
        }
        if (_elementDeserializer != null)
        {
            return _deserializeCustom(jsonparser, deserializationcontext);
        }
        objectbuffer = deserializationcontext.leaseObjectBuffer();
        aobj = objectbuffer.resetAndStart();
        i = 0;
_L1:
        Object obj;
        String s;
        Object aobj1[];
        JsonToken jsontoken;
        int j;
        try
        {
            s = jsonparser.nextTextValue();
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            throw JsonMappingException.wrapWithPath(jsonparser, ((Object) (aobj)), objectbuffer.bufferedSize() + i);
        }
        obj = s;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        jsontoken = jsonparser.getCurrentToken();
        obj = JsonToken.END_ARRAY;
        if (jsontoken == obj)
        {
            jsonparser = (String[])objectbuffer.completeAndClearBuffer(aobj, i, java/lang/String);
            deserializationcontext.returnObjectBuffer(objectbuffer);
            return jsonparser;
        }
        obj = s;
        if (jsontoken != JsonToken.VALUE_NULL)
        {
            obj = _parseString(jsonparser, deserializationcontext);
        }
        if (i < aobj.length)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        aobj1 = objectbuffer.appendCompletedChunk(aobj);
        i = 0;
        aobj = aobj1;
        j = i + 1;
        aobj[i] = obj;
        i = j;
          goto _L1
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException
    {
        return typedeserializer.deserializeTypedFromArray(jsonparser, deserializationcontext);
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ObjectBuffer;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdDeserializer

public final class StringArrayDeserializer extends StdDeserializer
    implements ContextualDeserializer
{

    public static final StringArrayDeserializer instance = new StringArrayDeserializer();
    private static final long serialVersionUID = 0x96aca308ea9cc20bL;
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
        obj = jsonparser.nextToken();
        if (obj == JsonToken.END_ARRAY)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        if (obj != JsonToken.VALUE_NULL)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        obj = (String)jsondeserializer.getNullValue();
_L3:
        if (i < aobj.length) goto _L2; else goto _L1
_L1:
        aobj = objectbuffer.appendCompletedChunk(aobj);
        i = 0;
_L2:
        int j = i + 1;
        aobj[i] = obj;
        i = j;
        continue; /* Loop/switch isn't completed */
        try
        {
            obj = (String)jsondeserializer.deserialize(jsonparser, deserializationcontext);
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            throw JsonMappingException.wrapWithPath(jsonparser, java/lang/String, i);
        }
          goto _L3
        jsonparser = (String[])objectbuffer.completeAndClearBuffer(aobj, i, java/lang/String);
        deserializationcontext.returnObjectBuffer(objectbuffer);
        return jsonparser;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
    {
        JsonDeserializer jsondeserializer = findConvertingContentDeserializer(deserializationcontext, beanproperty, _elementDeserializer);
        if (jsondeserializer == null)
        {
            deserializationcontext = deserializationcontext.findContextualValueDeserializer(deserializationcontext.constructType(java/lang/String), beanproperty);
        } else
        {
            deserializationcontext = deserializationcontext.handleSecondaryContextualization(jsondeserializer, beanproperty);
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

    public final volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public final String[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
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
_L5:
        Object obj;
        obj = jsonparser.nextToken();
        if (obj == JsonToken.END_ARRAY)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        if (obj != JsonToken.VALUE_STRING)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        obj = jsonparser.getText();
_L3:
        if (i < aobj.length) goto _L2; else goto _L1
_L1:
        Object aobj1[] = objectbuffer.appendCompletedChunk(aobj);
        i = 0;
        aobj = aobj1;
_L2:
        int j = i + 1;
        aobj[i] = obj;
        i = j;
        continue; /* Loop/switch isn't completed */
        if (obj == JsonToken.VALUE_NULL)
        {
            obj = null;
        } else
        {
            try
            {
                obj = _parseString(jsonparser, deserializationcontext);
            }
            // Misplaced declaration of an exception variable
            catch (JsonParser jsonparser)
            {
                throw JsonMappingException.wrapWithPath(jsonparser, ((Object) (aobj)), i);
            }
        }
          goto _L3
        jsonparser = (String[])objectbuffer.completeAndClearBuffer(aobj, i, java/lang/String);
        deserializationcontext.returnObjectBuffer(objectbuffer);
        return jsonparser;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
    {
        return typedeserializer.deserializeTypedFromArray(jsonparser, deserializationcontext);
    }

}

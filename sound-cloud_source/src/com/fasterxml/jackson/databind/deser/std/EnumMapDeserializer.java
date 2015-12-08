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
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import java.util.EnumMap;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdDeserializer

public class EnumMapDeserializer extends StdDeserializer
    implements ContextualDeserializer
{

    protected final Class _enumClass;
    protected JsonDeserializer _keyDeserializer;
    protected final JavaType _mapType;
    protected JsonDeserializer _valueDeserializer;

    public EnumMapDeserializer(JavaType javatype, JsonDeserializer jsondeserializer, JsonDeserializer jsondeserializer1)
    {
        super(java/util/EnumMap);
        _mapType = javatype;
        _enumClass = javatype.getKeyType().getRawClass();
        _keyDeserializer = jsondeserializer;
        _valueDeserializer = jsondeserializer1;
    }

    private EnumMap constructMap()
    {
        return new EnumMap(_enumClass);
    }

    public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
        throws JsonMappingException
    {
        JsonDeserializer jsondeserializer1;
        JsonDeserializer jsondeserializer2;
        jsondeserializer1 = _keyDeserializer;
        if (jsondeserializer1 == null)
        {
            jsondeserializer1 = deserializationcontext.findContextualValueDeserializer(_mapType.getKeyType(), beanproperty);
        }
        jsondeserializer2 = _valueDeserializer;
        if (jsondeserializer2 != null) goto _L2; else goto _L1
_L1:
        JsonDeserializer jsondeserializer = deserializationcontext.findContextualValueDeserializer(_mapType.getContentType(), beanproperty);
_L4:
        return withResolved(jsondeserializer1, jsondeserializer);
_L2:
        jsondeserializer = jsondeserializer2;
        if (jsondeserializer2 instanceof ContextualDeserializer)
        {
            jsondeserializer = ((ContextualDeserializer)jsondeserializer2).createContextual(deserializationcontext, beanproperty);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public EnumMap deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        EnumMap enummap;
        if (jsonparser.getCurrentToken() != JsonToken.START_OBJECT)
        {
            throw deserializationcontext.mappingException(java/util/EnumMap);
        }
        enummap = constructMap();
_L7:
        Enum enum;
        if (jsonparser.nextToken() == JsonToken.END_OBJECT)
        {
            break; /* Loop/switch isn't completed */
        }
        enum = (Enum)_keyDeserializer.deserialize(jsonparser, deserializationcontext);
        if (enum != null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        if (deserializationcontext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) goto _L2; else goto _L1
_L1:
        if (!jsonparser.hasCurrentToken()) goto _L4; else goto _L3
_L3:
        jsonparser = jsonparser.getText();
_L5:
        throw deserializationcontext.weirdStringException(jsonparser, _enumClass, "value not one of declared Enum instance names");
        jsonparser;
_L4:
        jsonparser = null;
        if (true) goto _L5; else goto _L2
_L2:
        jsonparser.nextToken();
        jsonparser.skipChildren();
        continue; /* Loop/switch isn't completed */
        Object obj;
        if (jsonparser.nextToken() == JsonToken.VALUE_NULL)
        {
            obj = null;
        } else
        {
            obj = _valueDeserializer.deserialize(jsonparser, deserializationcontext);
        }
        enummap.put(enum, obj);
        if (true) goto _L7; else goto _L6
_L6:
        return enummap;
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException, JsonProcessingException
    {
        return typedeserializer.deserializeTypedFromObject(jsonparser, deserializationcontext);
    }

    public boolean isCachable()
    {
        return true;
    }

    public EnumMapDeserializer withResolved(JsonDeserializer jsondeserializer, JsonDeserializer jsondeserializer1)
    {
        if (jsondeserializer == _keyDeserializer && jsondeserializer1 == _valueDeserializer)
        {
            return this;
        } else
        {
            return new EnumMapDeserializer(_mapType, jsondeserializer, jsondeserializer1);
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            ContainerDeserializerBase

public class MapEntryDeserializer extends ContainerDeserializerBase
    implements ContextualDeserializer
{

    protected final KeyDeserializer _keyDeserializer;
    protected final JavaType _type;
    protected final JsonDeserializer _valueDeserializer;
    protected final TypeDeserializer _valueTypeDeserializer;

    public MapEntryDeserializer(JavaType javatype, KeyDeserializer keydeserializer, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer)
    {
        super(javatype);
        if (javatype.containedTypeCount() != 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Missing generic type information for ").append(javatype).toString());
        } else
        {
            _type = javatype;
            _keyDeserializer = keydeserializer;
            _valueDeserializer = jsondeserializer;
            _valueTypeDeserializer = typedeserializer;
            return;
        }
    }

    protected MapEntryDeserializer(MapEntryDeserializer mapentrydeserializer, KeyDeserializer keydeserializer, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer)
    {
        super(mapentrydeserializer._type);
        _type = mapentrydeserializer._type;
        _keyDeserializer = keydeserializer;
        _valueDeserializer = jsondeserializer;
        _valueTypeDeserializer = typedeserializer;
    }

    public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
        throws JsonMappingException
    {
        Object obj1 = _keyDeserializer;
        Object obj;
        Object obj2;
        if (obj1 == null)
        {
            obj = deserializationcontext.findKeyDeserializer(_type.containedType(0), beanproperty);
        } else
        {
            obj = obj1;
            if (obj1 instanceof ContextualKeyDeserializer)
            {
                obj = ((ContextualKeyDeserializer)obj1).createContextual(deserializationcontext, beanproperty);
            }
        }
        obj1 = findConvertingContentDeserializer(deserializationcontext, beanproperty, _valueDeserializer);
        obj2 = _type.containedType(1);
        if (obj1 == null)
        {
            deserializationcontext = deserializationcontext.findContextualValueDeserializer(((JavaType) (obj2)), beanproperty);
        } else
        {
            deserializationcontext = deserializationcontext.handleSecondaryContextualization(((JsonDeserializer) (obj1)), beanproperty, ((JavaType) (obj2)));
        }
        obj2 = _valueTypeDeserializer;
        obj1 = obj2;
        if (obj2 != null)
        {
            obj1 = ((TypeDeserializer) (obj2)).forProperty(beanproperty);
        }
        return withResolved(((KeyDeserializer) (obj)), ((TypeDeserializer) (obj1)), deserializationcontext);
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext, (java.util.Map.Entry)obj);
    }

    public java.util.Map.Entry deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        Object obj;
        Object obj1;
        Object obj2;
        String s;
        TypeDeserializer typedeserializer;
        JsonToken jsontoken;
        obj1 = jsonparser.getCurrentToken();
        if (obj1 != JsonToken.START_OBJECT && obj1 != JsonToken.FIELD_NAME && obj1 != JsonToken.END_OBJECT)
        {
            return (java.util.Map.Entry)_deserializeFromEmpty(jsonparser, deserializationcontext);
        }
        obj = obj1;
        if (obj1 == JsonToken.START_OBJECT)
        {
            obj = jsonparser.nextToken();
        }
        if (obj != JsonToken.FIELD_NAME)
        {
            if (obj == JsonToken.END_OBJECT)
            {
                throw deserializationcontext.mappingException("Can not deserialize a Map.Entry out of empty JSON Object");
            } else
            {
                throw deserializationcontext.mappingException(handledType(), ((JsonToken) (obj)));
            }
        }
        obj = _keyDeserializer;
        obj1 = _valueDeserializer;
        typedeserializer = _valueTypeDeserializer;
        s = jsonparser.getCurrentName();
        obj2 = ((KeyDeserializer) (obj)).deserializeKey(s, deserializationcontext);
        obj = null;
        jsontoken = jsonparser.nextToken();
        if (jsontoken != JsonToken.VALUE_NULL) goto _L2; else goto _L1
_L1:
        obj1 = ((JsonDeserializer) (obj1)).getNullValue();
        obj = obj1;
_L3:
        obj1 = jsonparser.nextToken();
        if (obj1 != JsonToken.END_OBJECT)
        {
            if (obj1 == JsonToken.FIELD_NAME)
            {
                throw deserializationcontext.mappingException((new StringBuilder()).append("Problem binding JSON into Map.Entry: more than one entry in JSON (second field: '").append(jsonparser.getCurrentName()).append("')").toString());
            } else
            {
                throw deserializationcontext.mappingException((new StringBuilder()).append("Problem binding JSON into Map.Entry: unexpected content after JSON Object entry: ").append(obj1).toString());
            }
        } else
        {
            return new java.util.AbstractMap.SimpleEntry(obj2, obj);
        }
_L2:
        if (typedeserializer != null)
        {
            break MISSING_BLOCK_LABEL_219;
        }
        obj1 = ((JsonDeserializer) (obj1)).deserialize(jsonparser, deserializationcontext);
        obj = obj1;
          goto _L3
        obj1 = ((JsonDeserializer) (obj1)).deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
        obj = obj1;
          goto _L3
        obj1;
        wrapAndThrow(((Throwable) (obj1)), java/util/Map$Entry, s);
          goto _L3
    }

    public java.util.Map.Entry deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, java.util.Map.Entry entry)
        throws IOException
    {
        throw new IllegalStateException("Can not update Map.Entry values");
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException, JsonProcessingException
    {
        return typedeserializer.deserializeTypedFromObject(jsonparser, deserializationcontext);
    }

    public JsonDeserializer getContentDeserializer()
    {
        return _valueDeserializer;
    }

    protected MapEntryDeserializer withResolved(KeyDeserializer keydeserializer, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
    {
        if (_keyDeserializer == keydeserializer && _valueDeserializer == jsondeserializer && _valueTypeDeserializer == typedeserializer)
        {
            return this;
        } else
        {
            return new MapEntryDeserializer(this, keydeserializer, jsondeserializer, typedeserializer);
        }
    }
}

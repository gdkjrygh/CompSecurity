// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.MapType;

public abstract class GuavaMapDeserializer extends JsonDeserializer
    implements ContextualDeserializer
{

    protected KeyDeserializer _keyDeserializer;
    protected final MapType _mapType;
    protected final TypeDeserializer _typeDeserializerForValue;
    protected JsonDeserializer _valueDeserializer;

    protected GuavaMapDeserializer(MapType maptype, KeyDeserializer keydeserializer, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
    {
        _mapType = maptype;
        _keyDeserializer = keydeserializer;
        _typeDeserializerForValue = typedeserializer;
        _valueDeserializer = jsondeserializer;
    }

    protected abstract Object _deserializeEntries(JsonParser jsonparser, DeserializationContext deserializationcontext);

    public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
    {
        Object obj = _keyDeserializer;
        JsonDeserializer jsondeserializer = _valueDeserializer;
        TypeDeserializer typedeserializer = _typeDeserializerForValue;
        if (obj != null && jsondeserializer != null && typedeserializer == null)
        {
            return this;
        }
        KeyDeserializer keydeserializer = ((KeyDeserializer) (obj));
        if (obj == null)
        {
            keydeserializer = deserializationcontext.findKeyDeserializer(_mapType.getKeyType(), beanproperty);
        }
        obj = jsondeserializer;
        if (jsondeserializer == null)
        {
            obj = deserializationcontext.findContextualValueDeserializer(_mapType.getContentType(), beanproperty);
        }
        deserializationcontext = typedeserializer;
        if (typedeserializer != null)
        {
            deserializationcontext = typedeserializer.forProperty(beanproperty);
        }
        return withResolved(keydeserializer, deserializationcontext, ((JsonDeserializer) (obj)));
    }

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        JsonToken jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == JsonToken.START_OBJECT)
        {
            jsontoken = jsonparser.nextToken();
            if (jsontoken != JsonToken.FIELD_NAME && jsontoken != JsonToken.END_OBJECT)
            {
                throw deserializationcontext.mappingException(_mapType.getRawClass());
            }
        } else
        if (jsontoken != JsonToken.FIELD_NAME)
        {
            throw deserializationcontext.mappingException(_mapType.getRawClass());
        }
        return _deserializeEntries(jsonparser, deserializationcontext);
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
    {
        return typedeserializer.deserializeTypedFromArray(jsonparser, deserializationcontext);
    }

    public abstract GuavaMapDeserializer withResolved(KeyDeserializer keydeserializer, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer);
}

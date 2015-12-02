// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.CollectionType;

public abstract class GuavaCollectionDeserializer extends StdDeserializer
    implements ContextualDeserializer
{

    protected final CollectionType _containerType;
    protected final TypeDeserializer _typeDeserializerForValue;
    protected final JsonDeserializer _valueDeserializer;

    protected GuavaCollectionDeserializer(CollectionType collectiontype, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
    {
        super(collectiontype);
        _containerType = collectiontype;
        _typeDeserializerForValue = typedeserializer;
        _valueDeserializer = jsondeserializer;
    }

    protected abstract Object _deserializeContents(JsonParser jsonparser, DeserializationContext deserializationcontext);

    public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
    {
        JsonDeserializer jsondeserializer1 = _valueDeserializer;
        TypeDeserializer typedeserializer = _typeDeserializerForValue;
        JsonDeserializer jsondeserializer = jsondeserializer1;
        if (jsondeserializer1 == null)
        {
            jsondeserializer = deserializationcontext.findContextualValueDeserializer(_containerType.getContentType(), beanproperty);
        }
        deserializationcontext = typedeserializer;
        if (typedeserializer != null)
        {
            deserializationcontext = typedeserializer.forProperty(beanproperty);
        }
        if (jsondeserializer == _valueDeserializer && deserializationcontext == _typeDeserializerForValue)
        {
            return this;
        } else
        {
            return withResolved(deserializationcontext, jsondeserializer);
        }
    }

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        if (jsonparser.getCurrentToken() != JsonToken.START_ARRAY)
        {
            throw deserializationcontext.mappingException(_containerType.getRawClass());
        } else
        {
            return _deserializeContents(jsonparser, deserializationcontext);
        }
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
    {
        return typedeserializer.deserializeTypedFromArray(jsonparser, deserializationcontext);
    }

    public abstract GuavaCollectionDeserializer withResolved(TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer);
}

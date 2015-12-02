// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.Collection;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            ContainerDeserializerBase

public final class StringCollectionDeserializer extends ContainerDeserializerBase
    implements ContextualDeserializer
{

    protected final JavaType _collectionType;
    protected final JsonDeserializer _delegateDeserializer;
    protected final JsonDeserializer _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;

    public StringCollectionDeserializer(JavaType javatype, JsonDeserializer jsondeserializer, ValueInstantiator valueinstantiator)
    {
        this(javatype, valueinstantiator, null, jsondeserializer);
    }

    protected StringCollectionDeserializer(JavaType javatype, ValueInstantiator valueinstantiator, JsonDeserializer jsondeserializer, JsonDeserializer jsondeserializer1)
    {
        super(javatype.getRawClass());
        _collectionType = javatype;
        _valueDeserializer = jsondeserializer1;
        _valueInstantiator = valueinstantiator;
        _delegateDeserializer = jsondeserializer;
    }

    private Collection deserializeUsingCustom(JsonParser jsonparser, DeserializationContext deserializationcontext, Collection collection, JsonDeserializer jsondeserializer)
    {
        do
        {
            Object obj = jsonparser.nextToken();
            if (obj != JsonToken.END_ARRAY)
            {
                if (obj == JsonToken.VALUE_NULL)
                {
                    obj = null;
                } else
                {
                    obj = (String)jsondeserializer.deserialize(jsonparser, deserializationcontext);
                }
                collection.add(obj);
            } else
            {
                return collection;
            }
        } while (true);
    }

    private final Collection handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext, Collection collection)
    {
        if (!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
        {
            throw deserializationcontext.mappingException(_collectionType.getRawClass());
        }
        JsonDeserializer jsondeserializer = _valueDeserializer;
        if (jsonparser.getCurrentToken() == JsonToken.VALUE_NULL)
        {
            jsonparser = null;
        } else
        if (jsondeserializer == null)
        {
            jsonparser = jsonparser.getText();
        } else
        {
            jsonparser = (String)jsondeserializer.deserialize(jsonparser, deserializationcontext);
        }
        collection.add(jsonparser);
        return collection;
    }

    public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
    {
        Object obj = null;
        JsonDeserializer jsondeserializer;
        JsonDeserializer jsondeserializer1;
        JsonDeserializer jsondeserializer2;
        if (_valueInstantiator != null && _valueInstantiator.getDelegateCreator() != null)
        {
            jsondeserializer1 = findDeserializer(deserializationcontext, _valueInstantiator.getDelegateType(deserializationcontext.getConfig()), beanproperty);
        } else
        {
            jsondeserializer1 = null;
        }
        jsondeserializer2 = _valueDeserializer;
        if (jsondeserializer2 == null)
        {
            jsondeserializer = deserializationcontext.findContextualValueDeserializer(_collectionType.getContentType(), beanproperty);
        } else
        {
            jsondeserializer = jsondeserializer2;
            if (jsondeserializer2 instanceof ContextualDeserializer)
            {
                jsondeserializer = ((ContextualDeserializer)jsondeserializer2).createContextual(deserializationcontext, beanproperty);
            }
        }
        if (isDefaultDeserializer(jsondeserializer))
        {
            deserializationcontext = obj;
        } else
        {
            deserializationcontext = jsondeserializer;
        }
        return withResolved(jsondeserializer1, deserializationcontext);
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
    {
        return deserialize(jsonparser, deserializationcontext, (Collection)obj);
    }

    public Collection deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        if (_delegateDeserializer != null)
        {
            return (Collection)_valueInstantiator.createUsingDelegate(deserializationcontext, _delegateDeserializer.deserialize(jsonparser, deserializationcontext));
        } else
        {
            return deserialize(jsonparser, deserializationcontext, (Collection)_valueInstantiator.createUsingDefault(deserializationcontext));
        }
    }

    public Collection deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Collection collection)
    {
        if (jsonparser.isExpectedStartArrayToken()) goto _L2; else goto _L1
_L1:
        deserializationcontext = handleNonArray(jsonparser, deserializationcontext, collection);
_L4:
        return deserializationcontext;
_L2:
        if (_valueDeserializer != null)
        {
            return deserializeUsingCustom(jsonparser, deserializationcontext, collection, _valueDeserializer);
        }
        do
        {
            JsonToken jsontoken = jsonparser.nextToken();
            deserializationcontext = collection;
            if (jsontoken == JsonToken.END_ARRAY)
            {
                continue;
            }
            if (jsontoken == JsonToken.VALUE_NULL)
            {
                deserializationcontext = null;
            } else
            {
                deserializationcontext = jsonparser.getText();
            }
            collection.add(deserializationcontext);
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
    {
        return typedeserializer.deserializeTypedFromArray(jsonparser, deserializationcontext);
    }

    public JsonDeserializer getContentDeserializer()
    {
        return _valueDeserializer;
    }

    public JavaType getContentType()
    {
        return _collectionType.getContentType();
    }

    protected StringCollectionDeserializer withResolved(JsonDeserializer jsondeserializer, JsonDeserializer jsondeserializer1)
    {
        if (_valueDeserializer == jsondeserializer1 && _delegateDeserializer == jsondeserializer)
        {
            return this;
        } else
        {
            return new StringCollectionDeserializer(_collectionType, _valueInstantiator, jsondeserializer, jsondeserializer1);
        }
    }
}

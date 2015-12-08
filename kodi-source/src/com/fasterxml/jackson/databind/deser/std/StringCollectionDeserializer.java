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
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
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
        super(javatype);
        _collectionType = javatype;
        _valueDeserializer = jsondeserializer1;
        _valueInstantiator = valueinstantiator;
        _delegateDeserializer = jsondeserializer;
    }

    private Collection deserializeUsingCustom(JsonParser jsonparser, DeserializationContext deserializationcontext, Collection collection, JsonDeserializer jsondeserializer)
        throws IOException
    {
        do
        {
            Object obj;
            if (jsonparser.nextTextValue() == null)
            {
                obj = jsonparser.getCurrentToken();
                if (obj == JsonToken.END_ARRAY)
                {
                    return collection;
                }
                if (obj == JsonToken.VALUE_NULL)
                {
                    obj = (String)jsondeserializer.getNullValue();
                } else
                {
                    obj = (String)jsondeserializer.deserialize(jsonparser, deserializationcontext);
                }
            } else
            {
                obj = (String)jsondeserializer.deserialize(jsonparser, deserializationcontext);
            }
            collection.add(obj);
        } while (true);
    }

    private final Collection handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext, Collection collection)
        throws IOException
    {
        if (!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
        {
            throw deserializationcontext.mappingException(_collectionType.getRawClass());
        }
        JsonDeserializer jsondeserializer = _valueDeserializer;
        if (jsonparser.getCurrentToken() == JsonToken.VALUE_NULL)
        {
            if (jsondeserializer == null)
            {
                jsonparser = null;
            } else
            {
                jsonparser = (String)jsondeserializer.getNullValue();
            }
        } else
        if (jsondeserializer == null)
        {
            jsonparser = _parseString(jsonparser, deserializationcontext);
        } else
        {
            jsonparser = (String)jsondeserializer.deserialize(jsonparser, deserializationcontext);
        }
        collection.add(jsonparser);
        return collection;
    }

    public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
        throws JsonMappingException
    {
        JsonDeserializer jsondeserializer = null;
        JsonDeserializer jsondeserializer1 = jsondeserializer;
        if (_valueInstantiator != null)
        {
            jsondeserializer1 = jsondeserializer;
            if (_valueInstantiator.getDelegateCreator() != null)
            {
                jsondeserializer1 = findDeserializer(deserializationcontext, _valueInstantiator.getDelegateType(deserializationcontext.getConfig()), beanproperty);
            }
        }
        jsondeserializer = _valueDeserializer;
        JavaType javatype = _collectionType.getContentType();
        if (jsondeserializer == null)
        {
            JsonDeserializer jsondeserializer2 = findConvertingContentDeserializer(deserializationcontext, beanproperty, jsondeserializer);
            jsondeserializer = jsondeserializer2;
            if (jsondeserializer2 == null)
            {
                jsondeserializer = deserializationcontext.findContextualValueDeserializer(javatype, beanproperty);
            }
        } else
        {
            jsondeserializer = deserializationcontext.handleSecondaryContextualization(jsondeserializer, beanproperty, javatype);
        }
        deserializationcontext = jsondeserializer;
        if (isDefaultDeserializer(jsondeserializer))
        {
            deserializationcontext = null;
        }
        return withResolved(jsondeserializer1, deserializationcontext);
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext, (Collection)obj);
    }

    public Collection deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
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
        throws IOException
    {
        if (jsonparser.isExpectedStartArrayToken()) goto _L2; else goto _L1
_L1:
        Object obj = handleNonArray(jsonparser, deserializationcontext, collection);
_L5:
        return ((Collection) (obj));
_L2:
        if (_valueDeserializer != null)
        {
            return deserializeUsingCustom(jsonparser, deserializationcontext, collection, _valueDeserializer);
        }
_L3:
        String s;
        try
        {
            s = jsonparser.nextTextValue();
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            throw JsonMappingException.wrapWithPath(jsonparser, collection, collection.size());
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        collection.add(s);
          goto _L3
        JsonToken jsontoken = jsonparser.getCurrentToken();
        obj = collection;
        if (jsontoken == JsonToken.END_ARRAY) goto _L5; else goto _L4
_L4:
        obj = s;
        if (jsontoken != JsonToken.VALUE_NULL)
        {
            obj = _parseString(jsonparser, deserializationcontext);
        }
        collection.add(obj);
          goto _L3
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException
    {
        return typedeserializer.deserializeTypedFromArray(jsonparser, deserializationcontext);
    }

    public JsonDeserializer getContentDeserializer()
    {
        return _valueDeserializer;
    }

    public boolean isCachable()
    {
        return _valueDeserializer == null && _delegateDeserializer == null;
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

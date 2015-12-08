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
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.Collection;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            ContainerDeserializerBase

public final class StringCollectionDeserializer extends ContainerDeserializerBase
    implements ContextualDeserializer
{

    private static final long serialVersionUID = 1L;
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
    {
        do
        {
            Object obj = jsonparser.nextToken();
            if (obj != JsonToken.END_ARRAY)
            {
                if (obj == JsonToken.VALUE_NULL)
                {
                    obj = (String)jsondeserializer.getNullValue();
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

    public final JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
    {
        Object obj = null;
        JsonDeserializer jsondeserializer;
        JsonDeserializer jsondeserializer1;
        if (_valueInstantiator != null && _valueInstantiator.getDelegateCreator() != null)
        {
            jsondeserializer1 = findDeserializer(deserializationcontext, _valueInstantiator.getDelegateType(deserializationcontext.getConfig()), beanproperty);
        } else
        {
            jsondeserializer1 = null;
        }
        jsondeserializer = _valueDeserializer;
        if (jsondeserializer == null)
        {
            JsonDeserializer jsondeserializer2 = findConvertingContentDeserializer(deserializationcontext, beanproperty, jsondeserializer);
            jsondeserializer = jsondeserializer2;
            if (jsondeserializer2 == null)
            {
                jsondeserializer = deserializationcontext.findContextualValueDeserializer(_collectionType.getContentType(), beanproperty);
            }
        } else
        {
            jsondeserializer = deserializationcontext.handleSecondaryContextualization(jsondeserializer, beanproperty);
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

    public final volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public final volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
    {
        return deserialize(jsonparser, deserializationcontext, (Collection)obj);
    }

    public final Collection deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        if (_delegateDeserializer != null)
        {
            return (Collection)_valueInstantiator.createUsingDelegate(deserializationcontext, _delegateDeserializer.deserialize(jsonparser, deserializationcontext));
        } else
        {
            return deserialize(jsonparser, deserializationcontext, (Collection)_valueInstantiator.createUsingDefault(deserializationcontext));
        }
    }

    public final Collection deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Collection collection)
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
          goto _L3
_L7:
        JsonToken jsontoken;
        if (jsontoken == JsonToken.VALUE_NULL)
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
                throw JsonMappingException.wrapWithPath(jsonparser, collection, collection.size());
            }
        }
_L8:
        collection.add(obj);
_L3:
        jsontoken = jsonparser.nextToken();
        obj = collection;
        if (jsontoken == JsonToken.END_ARRAY) goto _L5; else goto _L4
_L4:
        if (jsontoken != JsonToken.VALUE_STRING) goto _L7; else goto _L6
_L6:
        obj = jsonparser.getText();
          goto _L8
    }

    public final Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
    {
        return typedeserializer.deserializeTypedFromArray(jsonparser, deserializationcontext);
    }

    public final JsonDeserializer getContentDeserializer()
    {
        return _valueDeserializer;
    }

    protected final StringCollectionDeserializer withResolved(JsonDeserializer jsondeserializer, JsonDeserializer jsondeserializer1)
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

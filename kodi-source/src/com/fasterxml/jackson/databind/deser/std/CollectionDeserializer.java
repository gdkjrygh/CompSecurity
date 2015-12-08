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
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            ContainerDeserializerBase

public class CollectionDeserializer extends ContainerDeserializerBase
    implements ContextualDeserializer
{
    private static final class CollectionReferring extends com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
    {

        private final CollectionReferringAccumulator _parent;
        public final List next = new ArrayList();

        public void handleResolvedForwardReference(Object obj, Object obj1)
            throws IOException
        {
            _parent.resolveForwardReference(obj, obj1);
        }

        CollectionReferring(CollectionReferringAccumulator collectionreferringaccumulator, UnresolvedForwardReference unresolvedforwardreference, Class class1)
        {
            super(unresolvedforwardreference, class1);
            _parent = collectionreferringaccumulator;
        }
    }

    public static final class CollectionReferringAccumulator
    {

        private List _accumulator;
        private final Class _elementType;
        private final Collection _result;

        public void add(Object obj)
        {
            if (_accumulator.isEmpty())
            {
                _result.add(obj);
                return;
            } else
            {
                ((CollectionReferring)_accumulator.get(_accumulator.size() - 1)).next.add(obj);
                return;
            }
        }

        public com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring handleUnresolvedReference(UnresolvedForwardReference unresolvedforwardreference)
        {
            unresolvedforwardreference = new CollectionReferring(this, unresolvedforwardreference, _elementType);
            _accumulator.add(unresolvedforwardreference);
            return unresolvedforwardreference;
        }

        public void resolveForwardReference(Object obj, Object obj1)
            throws IOException
        {
            Iterator iterator = _accumulator.iterator();
            CollectionReferring collectionreferring;
            for (Object obj2 = _result; iterator.hasNext(); obj2 = collectionreferring.next)
            {
                collectionreferring = (CollectionReferring)iterator.next();
                if (collectionreferring.hasId(obj))
                {
                    iterator.remove();
                    ((Collection) (obj2)).add(obj1);
                    ((Collection) (obj2)).addAll(collectionreferring.next);
                    return;
                }
            }

            throw new IllegalArgumentException((new StringBuilder()).append("Trying to resolve a forward reference with id [").append(obj).append("] that wasn't previously seen as unresolved.").toString());
        }

        public CollectionReferringAccumulator(Class class1, Collection collection)
        {
            _accumulator = new ArrayList();
            _elementType = class1;
            _result = collection;
        }
    }


    protected final JavaType _collectionType;
    protected final JsonDeserializer _delegateDeserializer;
    protected final JsonDeserializer _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;
    protected final TypeDeserializer _valueTypeDeserializer;

    public CollectionDeserializer(JavaType javatype, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer, ValueInstantiator valueinstantiator)
    {
        this(javatype, jsondeserializer, typedeserializer, valueinstantiator, null);
    }

    protected CollectionDeserializer(JavaType javatype, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer, ValueInstantiator valueinstantiator, JsonDeserializer jsondeserializer1)
    {
        super(javatype);
        _collectionType = javatype;
        _valueDeserializer = jsondeserializer;
        _valueTypeDeserializer = typedeserializer;
        _valueInstantiator = valueinstantiator;
        _delegateDeserializer = jsondeserializer1;
    }

    public volatile JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
        throws JsonMappingException
    {
        return createContextual(deserializationcontext, beanproperty);
    }

    public CollectionDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
        throws JsonMappingException
    {
        Object obj1 = null;
        Object obj = obj1;
        if (_valueInstantiator != null)
        {
            obj = obj1;
            if (_valueInstantiator.canCreateUsingDelegate())
            {
                obj = _valueInstantiator.getDelegateType(deserializationcontext.getConfig());
                if (obj == null)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Invalid delegate-creator definition for ").append(_collectionType).append(": value instantiator (").append(_valueInstantiator.getClass().getName()).append(") returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'").toString());
                }
                obj = findDeserializer(deserializationcontext, ((JavaType) (obj)), beanproperty);
            }
        }
        obj1 = findConvertingContentDeserializer(deserializationcontext, beanproperty, _valueDeserializer);
        Object obj2 = _collectionType.getContentType();
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
        return withResolved(((JsonDeserializer) (obj)), deserializationcontext, ((TypeDeserializer) (obj1)));
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
        }
        if (jsonparser.getCurrentToken() == JsonToken.VALUE_STRING)
        {
            String s = jsonparser.getText();
            if (s.length() == 0)
            {
                return (Collection)_valueInstantiator.createFromString(deserializationcontext, s);
            }
        }
        return deserialize(jsonparser, deserializationcontext, (Collection)_valueInstantiator.createUsingDefault(deserializationcontext));
    }

    public Collection deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Collection collection)
        throws IOException
    {
        if (jsonparser.isExpectedStartArrayToken()) goto _L2; else goto _L1
_L1:
        Object obj = handleNonArray(jsonparser, deserializationcontext, collection);
_L4:
        return ((Collection) (obj));
_L2:
        CollectionReferringAccumulator collectionreferringaccumulator;
        JsonDeserializer jsondeserializer;
        TypeDeserializer typedeserializer;
        jsonparser.setCurrentValue(collection);
        jsondeserializer = _valueDeserializer;
        typedeserializer = _valueTypeDeserializer;
        JsonToken jsontoken;
        if (jsondeserializer.getObjectIdReader() == null)
        {
            collectionreferringaccumulator = null;
        } else
        {
            collectionreferringaccumulator = new CollectionReferringAccumulator(_collectionType.getContentType().getRawClass(), collection);
        }
_L8:
        jsontoken = jsonparser.nextToken();
        obj = collection;
        if (jsontoken == JsonToken.END_ARRAY) goto _L4; else goto _L3
_L3:
        if (jsontoken != JsonToken.VALUE_NULL) goto _L6; else goto _L5
_L5:
        obj = jsondeserializer.getNullValue();
_L7:
        if (collectionreferringaccumulator == null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        try
        {
            collectionreferringaccumulator.add(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (collectionreferringaccumulator == null)
            {
                throw JsonMappingException.from(jsonparser, "Unresolved forward reference but no identity info", ((Throwable) (obj)));
            }
            break MISSING_BLOCK_LABEL_189;
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            throw JsonMappingException.wrapWithPath(jsonparser, collection, collection.size());
        }
        break MISSING_BLOCK_LABEL_47;
_L6:
        if (typedeserializer != null)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        obj = jsondeserializer.deserialize(jsonparser, deserializationcontext);
          goto _L7
        obj = jsondeserializer.deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
          goto _L7
        collection.add(obj);
          goto _L8
        com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring referring = collectionreferringaccumulator.handleUnresolvedReference(((UnresolvedForwardReference) (obj)));
        ((UnresolvedForwardReference) (obj)).getRoid().appendReferring(referring);
          goto _L8
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

    protected final Collection handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext, Collection collection)
        throws IOException
    {
        JsonDeserializer jsondeserializer;
        TypeDeserializer typedeserializer;
        JsonToken jsontoken;
        if (!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
        {
            throw deserializationcontext.mappingException(_collectionType.getRawClass());
        }
        jsondeserializer = _valueDeserializer;
        typedeserializer = _valueTypeDeserializer;
        jsontoken = jsonparser.getCurrentToken();
        if (jsontoken != JsonToken.VALUE_NULL) goto _L2; else goto _L1
_L1:
        jsonparser = ((JsonParser) (jsondeserializer.getNullValue()));
_L3:
        collection.add(jsonparser);
        return collection;
_L2:
label0:
        {
            if (typedeserializer != null)
            {
                break label0;
            }
            try
            {
                jsonparser = ((JsonParser) (jsondeserializer.deserialize(jsonparser, deserializationcontext)));
            }
            // Misplaced declaration of an exception variable
            catch (JsonParser jsonparser)
            {
                throw JsonMappingException.wrapWithPath(jsonparser, java/lang/Object, collection.size());
            }
        }
          goto _L3
        jsonparser = ((JsonParser) (jsondeserializer.deserializeWithType(jsonparser, deserializationcontext, typedeserializer)));
          goto _L3
    }

    public boolean isCachable()
    {
        return _valueDeserializer == null && _valueTypeDeserializer == null && _delegateDeserializer == null;
    }

    protected CollectionDeserializer withResolved(JsonDeserializer jsondeserializer, JsonDeserializer jsondeserializer1, TypeDeserializer typedeserializer)
    {
        if (jsondeserializer == _delegateDeserializer && jsondeserializer1 == _valueDeserializer && typedeserializer == _valueTypeDeserializer)
        {
            return this;
        } else
        {
            return new CollectionDeserializer(_collectionType, jsondeserializer1, typedeserializer, _valueInstantiator, jsondeserializer);
        }
    }
}

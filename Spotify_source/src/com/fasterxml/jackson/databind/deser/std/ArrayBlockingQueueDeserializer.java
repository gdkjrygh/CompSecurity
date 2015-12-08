// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            CollectionDeserializer

public class ArrayBlockingQueueDeserializer extends CollectionDeserializer
{

    private static final long serialVersionUID = 1L;

    public ArrayBlockingQueueDeserializer(JavaType javatype, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer, ValueInstantiator valueinstantiator, JsonDeserializer jsondeserializer1)
    {
        super(javatype, jsondeserializer, typedeserializer, valueinstantiator, jsondeserializer1);
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
        }
        if (jsonparser.getCurrentToken() == JsonToken.VALUE_STRING)
        {
            String s = jsonparser.getText();
            if (s.length() == 0)
            {
                return (Collection)_valueInstantiator.createFromString(deserializationcontext, s);
            }
        }
        return deserialize(jsonparser, deserializationcontext, ((Collection) (null)));
    }

    public Collection deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Collection collection)
    {
        ArrayList arraylist;
        JsonDeserializer jsondeserializer;
        TypeDeserializer typedeserializer;
        if (!jsonparser.isExpectedStartArrayToken())
        {
            return handleNonArray(jsonparser, deserializationcontext, new ArrayBlockingQueue(1));
        }
        arraylist = new ArrayList();
        jsondeserializer = _valueDeserializer;
        typedeserializer = _valueTypeDeserializer;
_L2:
        Object obj;
        obj = jsonparser.nextToken();
        if (obj == JsonToken.END_ARRAY)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        if (obj != JsonToken.VALUE_NULL)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = jsondeserializer.getNullValue();
_L3:
        arraylist.add(obj);
        if (true) goto _L2; else goto _L1
_L1:
label0:
        {
            if (typedeserializer != null)
            {
                break label0;
            }
            try
            {
                obj = jsondeserializer.deserialize(jsonparser, deserializationcontext);
            }
            // Misplaced declaration of an exception variable
            catch (JsonParser jsonparser)
            {
                throw JsonMappingException.wrapWithPath(jsonparser, arraylist, arraylist.size());
            }
        }
          goto _L3
        obj = jsondeserializer.deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
          goto _L3
        if (collection != null)
        {
            collection.addAll(arraylist);
            return collection;
        } else
        {
            return new ArrayBlockingQueue(arraylist.size(), false, arraylist);
        }
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
    {
        return typedeserializer.deserializeTypedFromArray(jsonparser, deserializationcontext);
    }

    protected ArrayBlockingQueueDeserializer withResolved(JsonDeserializer jsondeserializer, JsonDeserializer jsondeserializer1, TypeDeserializer typedeserializer)
    {
        if (jsondeserializer == _delegateDeserializer && jsondeserializer1 == _valueDeserializer && typedeserializer == _valueTypeDeserializer)
        {
            return this;
        } else
        {
            return new ArrayBlockingQueueDeserializer(_collectionType, jsondeserializer1, typedeserializer, _valueInstantiator, jsondeserializer);
        }
    }

    protected volatile CollectionDeserializer withResolved(JsonDeserializer jsondeserializer, JsonDeserializer jsondeserializer1, TypeDeserializer typedeserializer)
    {
        return withResolved(jsondeserializer, jsondeserializer1, typedeserializer);
    }
}

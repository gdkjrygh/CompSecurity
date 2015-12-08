// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            AsArraySerializerBase

public class CollectionSerializer extends AsArraySerializerBase
{

    public CollectionSerializer(JavaType javatype, boolean flag, TypeSerializer typeserializer, BeanProperty beanproperty, JsonSerializer jsonserializer)
    {
        super(java/util/Collection, javatype, flag, typeserializer, beanproperty, jsonserializer);
    }

    public CollectionSerializer(CollectionSerializer collectionserializer, BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        super(collectionserializer, beanproperty, typeserializer, jsonserializer);
    }

    public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
    {
        return new CollectionSerializer(_elementType, _staticTyping, typeserializer, _property, _elementSerializer);
    }

    public volatile boolean hasSingleElement(Object obj)
    {
        return hasSingleElement((Collection)obj);
    }

    public boolean hasSingleElement(Collection collection)
    {
        collection = collection.iterator();
        if (collection.hasNext())
        {
            collection.next();
            if (!collection.hasNext())
            {
                return true;
            }
        }
        return false;
    }

    public volatile boolean isEmpty(Object obj)
    {
        return isEmpty((Collection)obj);
    }

    public boolean isEmpty(Collection collection)
    {
        return collection == null || collection.isEmpty();
    }

    public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serializeContents((Collection)obj, jsongenerator, serializerprovider);
    }

    public void serializeContents(Collection collection, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        if (_elementSerializer == null) goto _L2; else goto _L1
_L1:
        serializeContentsUsing(collection, jsongenerator, serializerprovider, _elementSerializer);
_L4:
        return;
_L2:
        Iterator iterator = collection.iterator();
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        Object obj;
        TypeSerializer typeserializer;
        int i;
        obj = _dynamicSerializers;
        typeserializer = _valueTypeSerializer;
        i = 0;
_L8:
        Object obj1;
        Object obj2;
        Object obj3;
        Class class1;
        int j;
        j = i;
        JsonSerializer jsonserializer;
        try
        {
            obj3 = iterator.next();
        }
        // Misplaced declaration of an exception variable
        catch (JsonGenerator jsongenerator)
        {
            wrapAndThrow(serializerprovider, jsongenerator, collection, j);
            return;
        }
        if (obj3 != null) goto _L6; else goto _L5
_L5:
        j = i;
        serializerprovider.defaultSerializeNull(jsongenerator);
_L13:
        j = i + 1;
        i = j;
        if (iterator.hasNext()) goto _L8; else goto _L7
_L7:
        return;
_L6:
        j = i;
        class1 = obj3.getClass();
        j = i;
        jsonserializer = ((PropertySerializerMap) (obj)).serializerFor(class1);
        obj1 = obj;
        obj2 = jsonserializer;
        if (jsonserializer != null) goto _L10; else goto _L9
_L9:
        j = i;
        if (!_elementType.hasGenericTypes()) goto _L12; else goto _L11
_L11:
        j = i;
        obj = _findAndAddDynamic(((PropertySerializerMap) (obj)), serializerprovider.constructSpecializedType(_elementType, class1), serializerprovider);
_L14:
        j = i;
        obj1 = _dynamicSerializers;
        obj2 = obj;
_L10:
        if (typeserializer != null)
        {
            break MISSING_BLOCK_LABEL_242;
        }
        j = i;
        ((JsonSerializer) (obj2)).serialize(obj3, jsongenerator, serializerprovider);
        obj = obj1;
          goto _L13
_L12:
        j = i;
        obj = _findAndAddDynamic(((PropertySerializerMap) (obj)), class1, serializerprovider);
          goto _L14
        j = i;
        ((JsonSerializer) (obj2)).serializeWithType(obj3, jsongenerator, serializerprovider, typeserializer);
        obj = obj1;
          goto _L13
    }

    public void serializeContentsUsing(Collection collection, JsonGenerator jsongenerator, SerializerProvider serializerprovider, JsonSerializer jsonserializer)
        throws IOException, JsonGenerationException
    {
        Iterator iterator = collection.iterator();
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        TypeSerializer typeserializer;
        int i;
        typeserializer = _valueTypeSerializer;
        i = 0;
_L5:
        Object obj = iterator.next();
        if (obj != null) goto _L4; else goto _L3
_L3:
        serializerprovider.defaultSerializeNull(jsongenerator);
_L6:
        i++;
_L7:
        if (iterator.hasNext()) goto _L5; else goto _L2
_L2:
        return;
_L4:
        if (typeserializer != null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        jsonserializer.serialize(obj, jsongenerator, serializerprovider);
          goto _L6
        obj;
        wrapAndThrow(serializerprovider, ((Throwable) (obj)), collection, i);
          goto _L7
        jsonserializer.serializeWithType(obj, jsongenerator, serializerprovider, typeserializer);
          goto _L6
    }

    public volatile AsArraySerializerBase withResolved(BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        return withResolved(beanproperty, typeserializer, jsonserializer);
    }

    public CollectionSerializer withResolved(BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        return new CollectionSerializer(this, beanproperty, typeserializer, jsonserializer);
    }
}

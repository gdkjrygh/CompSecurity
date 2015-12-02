// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//            PropertySerializerMap

public final class IndexedListSerializer extends AsArraySerializerBase
{

    public IndexedListSerializer(JavaType javatype, boolean flag, TypeSerializer typeserializer, BeanProperty beanproperty, JsonSerializer jsonserializer)
    {
        super(java/util/List, javatype, flag, typeserializer, beanproperty, jsonserializer);
    }

    public IndexedListSerializer(IndexedListSerializer indexedlistserializer, BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        super(indexedlistserializer, beanproperty, typeserializer, jsonserializer);
    }

    public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
    {
        return new IndexedListSerializer(_elementType, _staticTyping, typeserializer, _property, _elementSerializer);
    }

    public volatile boolean hasSingleElement(Object obj)
    {
        return hasSingleElement((List)obj);
    }

    public boolean hasSingleElement(List list)
    {
        return list.size() == 1;
    }

    public volatile boolean isEmpty(Object obj)
    {
        return isEmpty((List)obj);
    }

    public boolean isEmpty(List list)
    {
        return list == null || list.isEmpty();
    }

    public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        serializeContents((List)obj, jsongenerator, serializerprovider);
    }

    public void serializeContents(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        if (_elementSerializer == null) goto _L2; else goto _L1
_L1:
        serializeContentsUsing(list, jsongenerator, serializerprovider, _elementSerializer);
_L14:
        return;
_L2:
        Object obj;
        Class class1;
        int i;
        int j;
        if (_valueTypeSerializer != null)
        {
            serializeTypedContents(list, jsongenerator, serializerprovider);
            return;
        }
        int k = list.size();
        if (k == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = 0;
        i = 0;
        Object obj1;
        Object obj2;
        JsonSerializer jsonserializer;
        Object obj3;
        try
        {
            obj = _dynamicSerializers;
        }
        // Misplaced declaration of an exception variable
        catch (JsonGenerator jsongenerator)
        {
            wrapAndThrow(serializerprovider, jsongenerator, list, j);
            return;
        }
_L12:
        if (i >= k)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = i;
        obj3 = list.get(i);
        if (obj3 != null) goto _L4; else goto _L3
_L3:
        j = i;
        serializerprovider.defaultSerializeNull(jsongenerator);
          goto _L5
_L4:
        j = i;
        class1 = obj3.getClass();
        j = i;
        jsonserializer = ((PropertySerializerMap) (obj)).serializerFor(class1);
        obj1 = obj;
        obj2 = jsonserializer;
        if (jsonserializer != null) goto _L7; else goto _L6
_L6:
        j = i;
        if (!_elementType.hasGenericTypes()) goto _L9; else goto _L8
_L8:
        j = i;
        obj = _findAndAddDynamic(((PropertySerializerMap) (obj)), serializerprovider.constructSpecializedType(_elementType, class1), serializerprovider);
_L10:
        j = i;
        obj1 = _dynamicSerializers;
        obj2 = obj;
_L7:
        j = i;
        ((JsonSerializer) (obj2)).serialize(obj3, jsongenerator, serializerprovider);
        obj = obj1;
        break; /* Loop/switch isn't completed */
_L9:
        j = i;
        obj = _findAndAddDynamic(((PropertySerializerMap) (obj)), class1, serializerprovider);
        if (true) goto _L10; else goto _L5
_L5:
        i++;
        if (true) goto _L12; else goto _L11
_L11:
        if (true) goto _L14; else goto _L13
_L13:
    }

    public void serializeContentsUsing(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider, JsonSerializer jsonserializer)
    {
        int j = list.size();
        if (j != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        TypeSerializer typeserializer;
        int i;
        typeserializer = _valueTypeSerializer;
        i = 0;
_L4:
        Object obj;
        if (i >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = list.get(i);
        if (obj == null)
        {
            try
            {
                serializerprovider.defaultSerializeNull(jsongenerator);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                wrapAndThrow(serializerprovider, ((Throwable) (obj)), list, i);
            }
            break MISSING_BLOCK_LABEL_96;
        }
        if (typeserializer != null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        jsonserializer.serialize(obj, jsongenerator, serializerprovider);
        break MISSING_BLOCK_LABEL_96;
        jsonserializer.serializeWithType(obj, jsongenerator, serializerprovider, typeserializer);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void serializeTypedContents(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        int k = list.size();
        if (k != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        Class class1;
        int i;
        int j;
        boolean flag = false;
        i = 0;
        j = ((flag) ? 1 : 0);
        Object obj1;
        Object obj2;
        JsonSerializer jsonserializer;
        TypeSerializer typeserializer;
        Object obj3;
        try
        {
            typeserializer = _valueTypeSerializer;
        }
        // Misplaced declaration of an exception variable
        catch (JsonGenerator jsongenerator)
        {
            wrapAndThrow(serializerprovider, jsongenerator, list, j);
            return;
        }
        j = ((flag) ? 1 : 0);
        obj = _dynamicSerializers;
_L12:
        if (i >= k)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = i;
        obj3 = list.get(i);
        if (obj3 != null) goto _L4; else goto _L3
_L3:
        j = i;
        serializerprovider.defaultSerializeNull(jsongenerator);
          goto _L5
_L4:
        j = i;
        class1 = obj3.getClass();
        j = i;
        jsonserializer = ((PropertySerializerMap) (obj)).serializerFor(class1);
        obj1 = obj;
        obj2 = jsonserializer;
        if (jsonserializer != null) goto _L7; else goto _L6
_L6:
        j = i;
        if (!_elementType.hasGenericTypes()) goto _L9; else goto _L8
_L8:
        j = i;
        obj = _findAndAddDynamic(((PropertySerializerMap) (obj)), serializerprovider.constructSpecializedType(_elementType, class1), serializerprovider);
_L10:
        j = i;
        obj1 = _dynamicSerializers;
        obj2 = obj;
_L7:
        j = i;
        ((JsonSerializer) (obj2)).serializeWithType(obj3, jsongenerator, serializerprovider, typeserializer);
        obj = obj1;
        break; /* Loop/switch isn't completed */
_L9:
        j = i;
        obj = _findAndAddDynamic(((PropertySerializerMap) (obj)), class1, serializerprovider);
        if (true) goto _L10; else goto _L5
_L5:
        i++;
        if (true) goto _L12; else goto _L11
_L11:
        if (true) goto _L1; else goto _L13
_L13:
    }

    public IndexedListSerializer withResolved(BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        return new IndexedListSerializer(this, beanproperty, typeserializer, jsonserializer);
    }

    public volatile AsArraySerializerBase withResolved(BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        return withResolved(beanproperty, typeserializer, jsonserializer);
    }
}

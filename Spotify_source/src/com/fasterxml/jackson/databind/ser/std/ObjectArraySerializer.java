// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            ArraySerializerBase

public class ObjectArraySerializer extends ArraySerializerBase
    implements ContextualSerializer
{

    protected PropertySerializerMap _dynamicSerializers;
    protected JsonSerializer _elementSerializer;
    protected final JavaType _elementType;
    protected final boolean _staticTyping;
    protected final TypeSerializer _valueTypeSerializer;

    public ObjectArraySerializer(JavaType javatype, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        super([Ljava/lang/Object;, null);
        _elementType = javatype;
        _staticTyping = flag;
        _valueTypeSerializer = typeserializer;
        _dynamicSerializers = PropertySerializerMap.emptyMap();
        _elementSerializer = jsonserializer;
    }

    public ObjectArraySerializer(ObjectArraySerializer objectarrayserializer, BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        super(objectarrayserializer, beanproperty);
        _elementType = objectarrayserializer._elementType;
        _valueTypeSerializer = typeserializer;
        _staticTyping = objectarrayserializer._staticTyping;
        _dynamicSerializers = objectarrayserializer._dynamicSerializers;
        _elementSerializer = jsonserializer;
    }

    protected final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, JavaType javatype, SerializerProvider serializerprovider)
    {
        javatype = propertyserializermap.findAndAddSecondarySerializer(javatype, serializerprovider, _property);
        if (propertyserializermap != ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).map)
        {
            _dynamicSerializers = ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).map;
        }
        return ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).serializer;
    }

    protected final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, Class class1, SerializerProvider serializerprovider)
    {
        class1 = propertyserializermap.findAndAddSecondarySerializer(class1, serializerprovider, _property);
        if (propertyserializermap != ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map)
        {
            _dynamicSerializers = ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map;
        }
        return ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).serializer;
    }

    public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
    {
        return new ObjectArraySerializer(_elementType, _staticTyping, typeserializer, _elementSerializer);
    }

    public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
    {
        TypeSerializer typeserializer;
        JsonSerializer jsonserializer2;
        typeserializer = _valueTypeSerializer;
        if (typeserializer != null)
        {
            typeserializer = typeserializer.forProperty(beanproperty);
        }
        jsonserializer2 = null;
        JsonSerializer jsonserializer = jsonserializer2;
        if (beanproperty != null)
        {
            com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedmember = beanproperty.getMember();
            jsonserializer = jsonserializer2;
            if (annotatedmember != null)
            {
                Object obj = serializerprovider.getAnnotationIntrospector().findContentSerializer(annotatedmember);
                jsonserializer = jsonserializer2;
                if (obj != null)
                {
                    jsonserializer = serializerprovider.serializerInstance(annotatedmember, obj);
                }
            }
        }
        jsonserializer2 = jsonserializer;
        if (jsonserializer == null)
        {
            jsonserializer2 = _elementSerializer;
        }
        jsonserializer2 = findConvertingContentSerializer(serializerprovider, beanproperty, jsonserializer2);
        if (jsonserializer2 != null) goto _L2; else goto _L1
_L1:
        JsonSerializer jsonserializer1;
label0:
        {
            jsonserializer1 = jsonserializer2;
            if (_elementType == null)
            {
                break label0;
            }
            if (!_staticTyping)
            {
                jsonserializer1 = jsonserializer2;
                if (!hasContentTypeAnnotation(serializerprovider, beanproperty))
                {
                    break label0;
                }
            }
            jsonserializer1 = serializerprovider.findValueSerializer(_elementType, beanproperty);
        }
_L4:
        return withResolved(beanproperty, typeserializer, jsonserializer1);
_L2:
        jsonserializer1 = serializerprovider.handleSecondaryContextualization(jsonserializer2, beanproperty);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public volatile boolean hasSingleElement(Object obj)
    {
        return hasSingleElement((Object[])obj);
    }

    public boolean hasSingleElement(Object aobj[])
    {
        return aobj.length == 1;
    }

    public volatile boolean isEmpty(Object obj)
    {
        return isEmpty((Object[])obj);
    }

    public boolean isEmpty(Object aobj[])
    {
        return aobj == null || aobj.length == 0;
    }

    public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        serializeContents((Object[])obj, jsongenerator, serializerprovider);
    }

    public void serializeContents(Object aobj[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        int k = aobj.length;
        if (k != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        int i;
        int j;
        if (_elementSerializer != null)
        {
            serializeContentsUsing(aobj, jsongenerator, serializerprovider, _elementSerializer);
            return;
        }
        if (_valueTypeSerializer != null)
        {
            serializeTypedContents(aobj, jsongenerator, serializerprovider);
            return;
        }
        j = 0;
        i = 0;
        obj = null;
        PropertySerializerMap propertyserializermap = _dynamicSerializers;
_L11:
        Object obj1;
        if (i >= k)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = aobj[i];
        if (obj1 != null) goto _L4; else goto _L3
_L3:
        obj = obj1;
        j = i;
        serializerprovider.defaultSerializeNull(jsongenerator);
          goto _L5
_L4:
        obj = obj1;
        j = i;
        Class class1 = obj1.getClass();
        obj = obj1;
        j = i;
        JsonSerializer jsonserializer1 = propertyserializermap.serializerFor(class1);
        JsonSerializer jsonserializer = jsonserializer1;
        if (jsonserializer1 != null) goto _L7; else goto _L6
_L6:
        obj = obj1;
        j = i;
        if (!_elementType.hasGenericTypes()) goto _L9; else goto _L8
_L8:
        obj = obj1;
        j = i;
        jsonserializer = _findAndAddDynamic(propertyserializermap, serializerprovider.constructSpecializedType(_elementType, class1), serializerprovider);
          goto _L7
_L9:
        obj = obj1;
        j = i;
        jsonserializer = _findAndAddDynamic(propertyserializermap, class1, serializerprovider);
        if (true) goto _L7; else goto _L5
_L7:
        obj = obj1;
        j = i;
        try
        {
            jsonserializer.serialize(obj1, jsongenerator, serializerprovider);
            break; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            throw aobj;
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[]) { }
        for (; (aobj instanceof InvocationTargetException) && ((Throwable) (aobj)).getCause() != null; aobj = ((Throwable) (aobj)).getCause()) { }
        if (aobj instanceof Error)
        {
            throw (Error)aobj;
        } else
        {
            throw JsonMappingException.wrapWithPath(((Throwable) (aobj)), obj, j);
        }
_L5:
        i++;
        if (true) goto _L11; else goto _L10
_L10:
        if (true) goto _L1; else goto _L12
_L12:
    }

    public void serializeContentsUsing(Object aobj[], JsonGenerator jsongenerator, SerializerProvider serializerprovider, JsonSerializer jsonserializer)
    {
        TypeSerializer typeserializer;
        int i;
        int j;
        j = aobj.length;
        typeserializer = _valueTypeSerializer;
        i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        Object obj = aobj[i];
        if (obj == null)
        {
            try
            {
                serializerprovider.defaultSerializeNull(jsongenerator);
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[])
            {
                throw aobj;
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[])
            {
                for (; (aobj instanceof InvocationTargetException) && ((Throwable) (aobj)).getCause() != null; aobj = ((Throwable) (aobj)).getCause()) { }
                if (aobj instanceof Error)
                {
                    throw (Error)aobj;
                } else
                {
                    throw JsonMappingException.wrapWithPath(((Throwable) (aobj)), obj, i);
                }
            }
            break MISSING_BLOCK_LABEL_118;
        }
        if (typeserializer != null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        jsonserializer.serialize(obj, jsongenerator, serializerprovider);
        break MISSING_BLOCK_LABEL_118;
        jsonserializer.serializeWithType(obj, jsongenerator, serializerprovider, typeserializer);
        break MISSING_BLOCK_LABEL_118;
        return;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void serializeTypedContents(Object aobj[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        int i;
        int k = aobj.length;
        TypeSerializer typeserializer = _valueTypeSerializer;
        int j = 0;
        i = 0;
        Object obj = null;
        JsonSerializer jsonserializer;
        Object obj1;
        JsonSerializer jsonserializer1;
        PropertySerializerMap propertyserializermap;
        Class class1;
        try
        {
            propertyserializermap = _dynamicSerializers;
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            throw aobj;
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            for (; (aobj instanceof InvocationTargetException) && ((Throwable) (aobj)).getCause() != null; aobj = ((Throwable) (aobj)).getCause()) { }
            if (aobj instanceof Error)
            {
                throw (Error)aobj;
            } else
            {
                throw JsonMappingException.wrapWithPath(((Throwable) (aobj)), obj, j);
            }
        }
_L2:
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        obj1 = aobj[i];
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        obj = obj1;
        j = i;
        serializerprovider.defaultSerializeNull(jsongenerator);
        break MISSING_BLOCK_LABEL_192;
        obj = obj1;
        j = i;
        class1 = obj1.getClass();
        obj = obj1;
        j = i;
        jsonserializer1 = propertyserializermap.serializerFor(class1);
        jsonserializer = jsonserializer1;
        if (jsonserializer1 != null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        obj = obj1;
        j = i;
        jsonserializer = _findAndAddDynamic(propertyserializermap, class1, serializerprovider);
        obj = obj1;
        j = i;
        jsonserializer.serializeWithType(obj1, jsongenerator, serializerprovider, typeserializer);
        break MISSING_BLOCK_LABEL_192;
        return;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public ObjectArraySerializer withResolved(BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        if (_property == beanproperty && jsonserializer == _elementSerializer && _valueTypeSerializer == typeserializer)
        {
            return this;
        } else
        {
            return new ObjectArraySerializer(this, beanproperty, typeserializer, jsonserializer);
        }
    }
}

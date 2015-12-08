// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.EnumValues;
import java.io.IOException;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdSerializer, EnumSerializer

public class EnumMapSerializer extends ContainerSerializer
    implements ContextualSerializer
{

    protected final EnumValues _keyEnums;
    protected final BeanProperty _property;
    protected final boolean _staticTyping;
    protected final JsonSerializer _valueSerializer;
    protected final JavaType _valueType;
    protected final TypeSerializer _valueTypeSerializer;

    public EnumMapSerializer(JavaType javatype, boolean flag, EnumValues enumvalues, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
label0:
        {
            boolean flag1 = false;
            super(java/util/EnumMap, false);
            _property = null;
            if (!flag)
            {
                flag = flag1;
                if (javatype == null)
                {
                    break label0;
                }
                flag = flag1;
                if (!javatype.isFinal())
                {
                    break label0;
                }
            }
            flag = true;
        }
        _staticTyping = flag;
        _valueType = javatype;
        _keyEnums = enumvalues;
        _valueTypeSerializer = typeserializer;
        _valueSerializer = jsonserializer;
    }

    public EnumMapSerializer(EnumMapSerializer enummapserializer, BeanProperty beanproperty, JsonSerializer jsonserializer)
    {
        super(enummapserializer);
        _property = beanproperty;
        _staticTyping = enummapserializer._staticTyping;
        _valueType = enummapserializer._valueType;
        _keyEnums = enummapserializer._keyEnums;
        _valueTypeSerializer = enummapserializer._valueTypeSerializer;
        _valueSerializer = jsonserializer;
    }

    public volatile ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
    {
        return _withValueTypeSerializer(typeserializer);
    }

    public EnumMapSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
    {
        return new EnumMapSerializer(_valueType, _staticTyping, _keyEnums, typeserializer, _valueSerializer);
    }

    public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
        throws JsonMappingException
    {
        JsonSerializer jsonserializer2;
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
            jsonserializer2 = _valueSerializer;
        }
        if (jsonserializer2 != null) goto _L2; else goto _L1
_L1:
        JsonSerializer jsonserializer1 = jsonserializer2;
        if (!_staticTyping) goto _L4; else goto _L3
_L3:
        serializerprovider = withValueSerializer(beanproperty, serializerprovider.findValueSerializer(_valueType, beanproperty));
_L6:
        return serializerprovider;
_L2:
        jsonserializer1 = jsonserializer2;
        if (_valueSerializer instanceof ContextualSerializer)
        {
            jsonserializer1 = ((ContextualSerializer)jsonserializer2).createContextual(serializerprovider, beanproperty);
        }
_L4:
        serializerprovider = this;
        if (jsonserializer1 != _valueSerializer)
        {
            return withValueSerializer(beanproperty, jsonserializer1);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public volatile boolean hasSingleElement(Object obj)
    {
        return hasSingleElement((EnumMap)obj);
    }

    public boolean hasSingleElement(EnumMap enummap)
    {
        return enummap.size() == 1;
    }

    public volatile boolean isEmpty(Object obj)
    {
        return isEmpty((EnumMap)obj);
    }

    public boolean isEmpty(EnumMap enummap)
    {
        return enummap == null || enummap.isEmpty();
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serialize((EnumMap)obj, jsongenerator, serializerprovider);
    }

    public void serialize(EnumMap enummap, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        jsongenerator.writeStartObject();
        if (!enummap.isEmpty())
        {
            serializeContents(enummap, jsongenerator, serializerprovider);
        }
        jsongenerator.writeEndObject();
    }

    protected void serializeContents(EnumMap enummap, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        if (_valueSerializer == null) goto _L2; else goto _L1
_L1:
        serializeContentsUsing(enummap, jsongenerator, serializerprovider, _valueSerializer);
_L6:
        return;
_L2:
        Object obj;
        Object obj1;
        Object obj2;
        Iterator iterator;
        obj2 = _keyEnums;
        iterator = enummap.entrySet().iterator();
        obj1 = null;
        obj = null;
_L4:
        EnumValues enumvalues;
        java.util.Map.Entry entry;
        if (!iterator.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        entry = (java.util.Map.Entry)iterator.next();
        Object obj3 = (Enum)entry.getKey();
        enumvalues = ((EnumValues) (obj2));
        if (obj2 == null)
        {
            enumvalues = ((EnumSerializer)(StdSerializer)serializerprovider.findValueSerializer(((Enum) (obj3)).getDeclaringClass(), _property)).getEnumValues();
        }
        jsongenerator.writeFieldName(enumvalues.serializedValueFor(((Enum) (obj3))));
        Object obj5 = entry.getValue();
        if (obj5 == null)
        {
            serializerprovider.defaultSerializeNull(jsongenerator);
            obj2 = enumvalues;
            break; /* Loop/switch isn't completed */
        }
        obj2 = obj5.getClass();
        if (obj2 == obj1)
        {
            obj2 = obj1;
            obj1 = obj;
            obj3 = obj;
            obj = obj2;
        } else
        {
            obj3 = serializerprovider.findValueSerializer(((Class) (obj2)), _property);
            obj1 = obj3;
            obj = obj2;
        }
        ((JsonSerializer) (obj3)).serialize(obj5, jsongenerator, serializerprovider);
        obj3 = obj1;
        obj2 = enumvalues;
        obj1 = obj;
        obj = obj3;
        break; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        wrapAndThrow(serializerprovider, exception, enummap, ((Enum)entry.getKey()).name());
        Object obj4 = obj1;
        exception = enumvalues;
        obj1 = obj;
        obj = obj4;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void serializeContentsUsing(EnumMap enummap, JsonGenerator jsongenerator, SerializerProvider serializerprovider, JsonSerializer jsonserializer)
        throws IOException, JsonGenerationException
    {
        Object obj;
        Iterator iterator;
        obj = _keyEnums;
        iterator = enummap.entrySet().iterator();
_L2:
        EnumValues enumvalues;
        java.util.Map.Entry entry;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        entry = (java.util.Map.Entry)iterator.next();
        Enum enum = (Enum)entry.getKey();
        enumvalues = ((EnumValues) (obj));
        if (obj == null)
        {
            enumvalues = ((EnumSerializer)(StdSerializer)serializerprovider.findValueSerializer(enum.getDeclaringClass(), _property)).getEnumValues();
        }
        jsongenerator.writeFieldName(enumvalues.serializedValueFor(enum));
        obj = entry.getValue();
        if (obj == null)
        {
            serializerprovider.defaultSerializeNull(jsongenerator);
            obj = enumvalues;
            continue; /* Loop/switch isn't completed */
        }
        jsonserializer.serialize(obj, jsongenerator, serializerprovider);
        obj = enumvalues;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        wrapAndThrow(serializerprovider, exception, enummap, ((Enum)entry.getKey()).name());
        exception = enumvalues;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonProcessingException
    {
        serializeWithType((EnumMap)obj, jsongenerator, serializerprovider, typeserializer);
    }

    public void serializeWithType(EnumMap enummap, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonGenerationException
    {
        typeserializer.writeTypePrefixForObject(enummap, jsongenerator);
        if (!enummap.isEmpty())
        {
            serializeContents(enummap, jsongenerator, serializerprovider);
        }
        typeserializer.writeTypeSuffixForObject(enummap, jsongenerator);
    }

    public EnumMapSerializer withValueSerializer(BeanProperty beanproperty, JsonSerializer jsonserializer)
    {
        if (_property == beanproperty && jsonserializer == _valueSerializer)
        {
            return this;
        } else
        {
            return new EnumMapSerializer(this, beanproperty, jsonserializer);
        }
    }
}

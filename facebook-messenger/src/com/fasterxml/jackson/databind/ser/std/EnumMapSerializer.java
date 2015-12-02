// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.EnumValues;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
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
    {
        EnumMapSerializer enummapserializer;
        if (_valueSerializer == null)
        {
            enummapserializer = this;
            if (_staticTyping)
            {
                enummapserializer = withValueSerializer(beanproperty, serializerprovider.findValueSerializer(_valueType, beanproperty));
            }
        } else
        {
            enummapserializer = this;
            if (_valueSerializer instanceof ContextualSerializer)
            {
                return withValueSerializer(beanproperty, ((ContextualSerializer)_valueSerializer).createContextual(serializerprovider, beanproperty));
            }
        }
        return enummapserializer;
    }

    public JsonSerializer getContentSerializer()
    {
        return _valueSerializer;
    }

    public JavaType getContentType()
    {
        return _valueType;
    }

    public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
    {
        ObjectNode objectnode = createSchemaNode("object", true);
        if (type instanceof ParameterizedType)
        {
            Type atype[] = ((ParameterizedType)type).getActualTypeArguments();
            if (atype.length == 2)
            {
                type = serializerprovider.constructType(atype[0]);
                JavaType javatype = serializerprovider.constructType(atype[1]);
                ObjectNode objectnode1 = JsonNodeFactory.instance.objectNode();
                Enum aenum[] = (Enum[])type.getRawClass().getEnumConstants();
                int j = aenum.length;
                int i = 0;
                while (i < j) 
                {
                    Enum enum = aenum[i];
                    type = serializerprovider.findValueSerializer(javatype.getRawClass(), _property);
                    if (type instanceof SchemaAware)
                    {
                        type = ((SchemaAware)type).getSchema(serializerprovider, null);
                    } else
                    {
                        type = JsonSchema.getDefaultSchemaNode();
                    }
                    objectnode1.put(serializerprovider.getConfig().getAnnotationIntrospector().findEnumValue(enum), type);
                    i++;
                }
                objectnode.put("properties", objectnode1);
            }
        }
        return objectnode;
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
    {
        serialize((EnumMap)obj, jsongenerator, serializerprovider);
    }

    public void serialize(EnumMap enummap, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        jsongenerator.writeStartObject();
        if (!enummap.isEmpty())
        {
            serializeContents(enummap, jsongenerator, serializerprovider);
        }
        jsongenerator.writeEndObject();
    }

    protected void serializeContents(EnumMap enummap, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        Object obj1 = null;
        if (_valueSerializer == null) goto _L2; else goto _L1
_L1:
        serializeContentsUsing(enummap, jsongenerator, serializerprovider, _valueSerializer);
_L4:
        return;
_L2:
        Object obj;
        EnumValues enumvalues;
        Iterator iterator;
        enumvalues = _keyEnums;
        iterator = enummap.entrySet().iterator();
        obj = null;
_L7:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        java.util.Map.Entry entry;
        Object obj7;
        entry = (java.util.Map.Entry)iterator.next();
        Enum enum = (Enum)entry.getKey();
        if (enumvalues == null)
        {
            enumvalues = ((EnumSerializer)(StdSerializer)serializerprovider.findValueSerializer(enum.getDeclaringClass(), _property)).getEnumValues();
        }
        jsongenerator.writeFieldName(enumvalues.serializedValueFor(enum));
        obj7 = entry.getValue();
        if (obj7 != null) goto _L6; else goto _L5
_L5:
        serializerprovider.defaultSerializeNull(jsongenerator);
        Object obj2 = obj1;
        obj1 = obj;
        obj = obj2;
_L8:
        Object obj3 = obj1;
        obj1 = obj;
        obj = obj3;
          goto _L7
_L6:
        Object obj6 = obj7.getClass();
        Object obj4;
        if (obj6 == obj1)
        {
            obj6 = obj;
            obj4 = obj;
            obj = obj6;
        } else
        {
            obj4 = serializerprovider.findValueSerializer(((Class) (obj6)), _property);
            obj = obj4;
            obj1 = obj6;
        }
        ((JsonSerializer) (obj4)).serialize(obj7, jsongenerator, serializerprovider);
        obj4 = obj;
        obj = obj1;
        obj1 = obj4;
          goto _L8
        Exception exception;
        exception;
        wrapAndThrow(serializerprovider, exception, enummap, ((Enum)entry.getKey()).name());
        Object obj5 = obj;
        obj = obj1;
        obj1 = obj5;
          goto _L8
    }

    protected void serializeContentsUsing(EnumMap enummap, JsonGenerator jsongenerator, SerializerProvider serializerprovider, JsonSerializer jsonserializer)
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
    {
        serializeWithType((EnumMap)obj, jsongenerator, serializerprovider, typeserializer);
    }

    public void serializeWithType(EnumMap enummap, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
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

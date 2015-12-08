// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.util.Annotations;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//            BeanPropertyWriter

public abstract class VirtualBeanPropertyWriter extends BeanPropertyWriter
{

    protected VirtualBeanPropertyWriter()
    {
    }

    protected VirtualBeanPropertyWriter(BeanPropertyDefinition beanpropertydefinition, Annotations annotations, JavaType javatype, JsonSerializer jsonserializer, TypeSerializer typeserializer, JavaType javatype1, com.fasterxml.jackson.annotation.JsonInclude.Include include)
    {
        super(beanpropertydefinition, beanpropertydefinition.getPrimaryMember(), annotations, javatype, jsonserializer, typeserializer, javatype1, _suppressNulls(include), _suppressableValue(include));
    }

    protected static boolean _suppressNulls(com.fasterxml.jackson.annotation.JsonInclude.Include include)
    {
        return include != com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS;
    }

    protected static Object _suppressableValue(com.fasterxml.jackson.annotation.JsonInclude.Include include)
    {
        if (include == com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY || include == com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
        {
            return MARKER_FOR_EMPTY;
        } else
        {
            return null;
        }
    }

    public Type getGenericPropertyType()
    {
        return getPropertyType();
    }

    public Class getPropertyType()
    {
        return _declaredType.getRawClass();
    }

    public void serializeAsElement(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws Exception
    {
        Object obj1 = value(obj, jsongenerator, serializerprovider);
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        if (_nullSerializer == null) goto _L4; else goto _L3
_L3:
        _nullSerializer.serialize(null, jsongenerator, serializerprovider);
_L6:
        return;
_L4:
        jsongenerator.writeNull();
        return;
_L2:
        JsonSerializer jsonserializer1 = _serializer;
        JsonSerializer jsonserializer = jsonserializer1;
        if (jsonserializer1 == null)
        {
            Class class1 = obj1.getClass();
            PropertySerializerMap propertyserializermap = _dynamicSerializers;
            JsonSerializer jsonserializer2 = propertyserializermap.serializerFor(class1);
            jsonserializer = jsonserializer2;
            if (jsonserializer2 == null)
            {
                jsonserializer = _findAndAddDynamic(propertyserializermap, class1, serializerprovider);
            }
        }
        if (_suppressableValue != null)
        {
            if (MARKER_FOR_EMPTY == _suppressableValue)
            {
                if (jsonserializer.isEmpty(serializerprovider, obj1))
                {
                    serializeAsPlaceholder(obj, jsongenerator, serializerprovider);
                    return;
                }
            } else
            if (_suppressableValue.equals(obj1))
            {
                serializeAsPlaceholder(obj, jsongenerator, serializerprovider);
                return;
            }
        }
        if (obj1 != obj || !_handleSelfReference(obj, jsongenerator, serializerprovider, jsonserializer))
        {
            if (_typeSerializer == null)
            {
                jsonserializer.serialize(obj1, jsongenerator, serializerprovider);
                return;
            } else
            {
                jsonserializer.serializeWithType(obj1, jsongenerator, serializerprovider, _typeSerializer);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws Exception
    {
        Object obj1 = value(obj, jsongenerator, serializerprovider);
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        if (_nullSerializer != null)
        {
            jsongenerator.writeFieldName(_name);
            _nullSerializer.serialize(null, jsongenerator, serializerprovider);
        }
_L4:
        return;
_L2:
        JsonSerializer jsonserializer;
        JsonSerializer jsonserializer1 = _serializer;
        jsonserializer = jsonserializer1;
        if (jsonserializer1 == null)
        {
            Class class1 = obj1.getClass();
            PropertySerializerMap propertyserializermap = _dynamicSerializers;
            JsonSerializer jsonserializer2 = propertyserializermap.serializerFor(class1);
            jsonserializer = jsonserializer2;
            if (jsonserializer2 == null)
            {
                jsonserializer = _findAndAddDynamic(propertyserializermap, class1, serializerprovider);
            }
        }
        if (_suppressableValue == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (MARKER_FOR_EMPTY != _suppressableValue)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        if (jsonserializer.isEmpty(serializerprovider, obj1)) goto _L4; else goto _L3
_L3:
        if (obj1 != obj || !_handleSelfReference(obj, jsongenerator, serializerprovider, jsonserializer))
        {
            jsongenerator.writeFieldName(_name);
            if (_typeSerializer == null)
            {
                jsonserializer.serialize(obj1, jsongenerator, serializerprovider);
                return;
            } else
            {
                jsonserializer.serializeWithType(obj1, jsongenerator, serializerprovider, _typeSerializer);
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (_suppressableValue.equals(obj1))
        {
            return;
        }
          goto _L3
        if (true) goto _L4; else goto _L5
_L5:
    }

    protected abstract Object value(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws Exception;

    public abstract VirtualBeanPropertyWriter withConfig(MapperConfig mapperconfig, AnnotatedClass annotatedclass, BeanPropertyDefinition beanpropertydefinition, JavaType javatype);
}

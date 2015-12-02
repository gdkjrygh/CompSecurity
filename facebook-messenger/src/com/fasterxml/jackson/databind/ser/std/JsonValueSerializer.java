// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdSerializer

public class JsonValueSerializer extends StdSerializer
    implements SchemaAware, ContextualSerializer
{

    protected final Method _accessorMethod;
    protected final boolean _forceTypeInformation;
    protected final BeanProperty _property;
    protected final JsonSerializer _valueSerializer;

    public JsonValueSerializer(JsonValueSerializer jsonvalueserializer, BeanProperty beanproperty, JsonSerializer jsonserializer, boolean flag)
    {
        super(java/lang/Object);
        _accessorMethod = jsonvalueserializer._accessorMethod;
        _valueSerializer = jsonserializer;
        _property = beanproperty;
        _forceTypeInformation = flag;
    }

    public JsonValueSerializer(Method method, JsonSerializer jsonserializer)
    {
        super(java/lang/Object);
        _accessorMethod = method;
        _valueSerializer = jsonserializer;
        _property = null;
        _forceTypeInformation = true;
    }

    public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
    {
        JsonSerializer jsonserializer = _valueSerializer;
        if (jsonserializer != null) goto _L2; else goto _L1
_L1:
        Object obj;
label0:
        {
            if (!serializerprovider.isEnabled(MapperFeature.USE_STATIC_TYPING))
            {
                obj = this;
                if (!Modifier.isFinal(_accessorMethod.getReturnType().getModifiers()))
                {
                    break label0;
                }
            }
            obj = serializerprovider.constructType(_accessorMethod.getGenericReturnType());
            serializerprovider = serializerprovider.findTypedValueSerializer(((JavaType) (obj)), false, _property);
            obj = withResolved(beanproperty, serializerprovider, isNaturalTypeWithStdHandling(((JavaType) (obj)).getRawClass(), serializerprovider));
        }
_L4:
        return ((JsonSerializer) (obj));
_L2:
        obj = this;
        if (jsonserializer instanceof ContextualSerializer)
        {
            return withResolved(beanproperty, ((ContextualSerializer)jsonserializer).createContextual(serializerprovider, beanproperty), _forceTypeInformation);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
    {
        if (_valueSerializer instanceof SchemaAware)
        {
            return ((SchemaAware)_valueSerializer).getSchema(serializerprovider, null);
        } else
        {
            return JsonSchema.getDefaultSchemaNode();
        }
    }

    protected boolean isNaturalTypeWithStdHandling(Class class1, JsonSerializer jsonserializer)
    {
        if (class1.isPrimitive() ? class1 != Integer.TYPE && class1 != Boolean.TYPE && class1 != Double.TYPE : class1 != java/lang/String && class1 != java/lang/Integer && class1 != java/lang/Boolean && class1 != java/lang/Double)
        {
            return false;
        } else
        {
            return isDefaultSerializer(jsonserializer);
        }
    }

    public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        Object obj1 = _accessorMethod.invoke(obj, new Object[0]);
        if (obj1 == null)
        {
            JsonSerializer jsonserializer;
            JsonSerializer jsonserializer1;
            try
            {
                serializerprovider.defaultSerializeNull(jsongenerator);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (JsonGenerator jsongenerator) { }
            break MISSING_BLOCK_LABEL_69;
        }
        jsonserializer1 = _valueSerializer;
        jsonserializer = jsonserializer1;
        if (jsonserializer1 != null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        jsonserializer = serializerprovider.findTypedValueSerializer(obj1.getClass(), true, _property);
        jsonserializer.serialize(obj1, jsongenerator, serializerprovider);
        return;
        for (; (jsongenerator instanceof InvocationTargetException) && jsongenerator.getCause() != null; jsongenerator = jsongenerator.getCause()) { }
        if (jsongenerator instanceof Error)
        {
            throw (Error)jsongenerator;
        } else
        {
            throw JsonMappingException.wrapWithPath(jsongenerator, obj, (new StringBuilder()).append(_accessorMethod.getName()).append("()").toString());
        }
    }

    public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        Object obj1 = _accessorMethod.invoke(obj, new Object[0]);
        if (obj1 == null)
        {
            JsonSerializer jsonserializer;
            try
            {
                serializerprovider.defaultSerializeNull(jsongenerator);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (JsonGenerator jsongenerator) { }
            break MISSING_BLOCK_LABEL_102;
        }
        jsonserializer = _valueSerializer;
        if (jsonserializer == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        if (_forceTypeInformation)
        {
            typeserializer.writeTypePrefixForScalar(obj, jsongenerator);
        }
        jsonserializer.serializeWithType(obj1, jsongenerator, serializerprovider, typeserializer);
        if (_forceTypeInformation)
        {
            typeserializer.writeTypeSuffixForScalar(obj, jsongenerator);
            return;
        }
        break MISSING_BLOCK_LABEL_167;
        serializerprovider.findTypedValueSerializer(obj1.getClass(), true, _property).serialize(obj1, jsongenerator, serializerprovider);
        return;
        for (; (jsongenerator instanceof InvocationTargetException) && jsongenerator.getCause() != null; jsongenerator = jsongenerator.getCause()) { }
        if (jsongenerator instanceof Error)
        {
            throw (Error)jsongenerator;
        } else
        {
            throw JsonMappingException.wrapWithPath(jsongenerator, obj, (new StringBuilder()).append(_accessorMethod.getName()).append("()").toString());
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("(@JsonValue serializer for method ").append(_accessorMethod.getDeclaringClass()).append("#").append(_accessorMethod.getName()).append(")").toString();
    }

    public JsonValueSerializer withResolved(BeanProperty beanproperty, JsonSerializer jsonserializer, boolean flag)
    {
        if (_property == beanproperty && _valueSerializer == jsonserializer && flag == _forceTypeInformation)
        {
            return this;
        } else
        {
            return new JsonValueSerializer(this, beanproperty, jsonserializer, flag);
        }
    }
}

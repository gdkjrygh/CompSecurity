// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdSerializer

public class JsonValueSerializer extends StdSerializer
    implements ContextualSerializer
{

    protected final Method _accessorMethod;
    protected final boolean _forceTypeInformation;
    protected final BeanProperty _property;
    protected final JsonSerializer _valueSerializer;

    public JsonValueSerializer(JsonValueSerializer jsonvalueserializer, BeanProperty beanproperty, JsonSerializer jsonserializer, boolean flag)
    {
        super(_notNullClass(jsonvalueserializer.handledType()));
        _accessorMethod = jsonvalueserializer._accessorMethod;
        _valueSerializer = jsonserializer;
        _property = beanproperty;
        _forceTypeInformation = flag;
    }

    public JsonValueSerializer(Method method, JsonSerializer jsonserializer)
    {
        super(method.getReturnType(), false);
        _accessorMethod = method;
        _valueSerializer = jsonserializer;
        _property = null;
        _forceTypeInformation = true;
    }

    private static final Class _notNullClass(Class class1)
    {
        Object obj = class1;
        if (class1 == null)
        {
            obj = java/lang/Object;
        }
        return ((Class) (obj));
    }

    public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
        throws JsonMappingException
    {
        Object obj;
label0:
        {
label1:
            {
                obj = _valueSerializer;
                if (obj != null)
                {
                    break label0;
                }
                if (!serializerprovider.isEnabled(MapperFeature.USE_STATIC_TYPING))
                {
                    obj = this;
                    if (!Modifier.isFinal(_accessorMethod.getReturnType().getModifiers()))
                    {
                        break label1;
                    }
                }
                obj = serializerprovider.constructType(_accessorMethod.getGenericReturnType());
                serializerprovider = serializerprovider.findPrimaryPropertySerializer(((JavaType) (obj)), beanproperty);
                obj = withResolved(beanproperty, serializerprovider, isNaturalTypeWithStdHandling(((JavaType) (obj)).getRawClass(), serializerprovider));
            }
            return ((JsonSerializer) (obj));
        }
        return withResolved(beanproperty, serializerprovider.handlePrimaryContextualization(((JsonSerializer) (obj)), beanproperty), _forceTypeInformation);
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
        throws IOException
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
            break MISSING_BLOCK_LABEL_70;
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
        throws IOException
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
            break MISSING_BLOCK_LABEL_102;
        }
        jsonserializer1 = _valueSerializer;
        if (jsonserializer1 != null) goto _L2; else goto _L1
_L1:
        jsonserializer = serializerprovider.findValueSerializer(obj1.getClass(), _property);
_L4:
        jsonserializer.serializeWithType(obj1, jsongenerator, serializerprovider, typeserializer);
        return;
_L2:
        jsonserializer = jsonserializer1;
        if (!_forceTypeInformation) goto _L4; else goto _L3
_L3:
        typeserializer.writeTypePrefixForScalar(obj, jsongenerator);
        jsonserializer1.serialize(obj1, jsongenerator, serializerprovider);
        typeserializer.writeTypeSuffixForScalar(obj, jsongenerator);
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

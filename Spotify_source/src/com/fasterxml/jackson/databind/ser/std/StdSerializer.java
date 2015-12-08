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
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdDelegatingSerializer

public abstract class StdSerializer extends JsonSerializer
{

    public final Class _handledType;

    protected StdSerializer(JavaType javatype)
    {
        _handledType = javatype.getRawClass();
    }

    public StdSerializer(Class class1)
    {
        _handledType = class1;
    }

    public StdSerializer(Class class1, boolean flag)
    {
        _handledType = class1;
    }

    public JsonSerializer findConvertingContentSerializer(SerializerProvider serializerprovider, BeanProperty beanproperty, JsonSerializer jsonserializer)
    {
        Object obj1 = serializerprovider.getAnnotationIntrospector();
        Object obj = jsonserializer;
        if (obj1 != null)
        {
            obj = jsonserializer;
            if (beanproperty != null)
            {
                obj1 = ((AnnotationIntrospector) (obj1)).findSerializationContentConverter(beanproperty.getMember());
                obj = jsonserializer;
                if (obj1 != null)
                {
                    obj1 = serializerprovider.converterInstance(beanproperty.getMember(), obj1);
                    JavaType javatype = ((Converter) (obj1)).getOutputType(serializerprovider.getTypeFactory());
                    obj = jsonserializer;
                    if (jsonserializer == null)
                    {
                        obj = serializerprovider.findValueSerializer(javatype, beanproperty);
                    }
                    obj = new StdDelegatingSerializer(((Converter) (obj1)), javatype, ((JsonSerializer) (obj)));
                }
            }
        }
        return ((JsonSerializer) (obj));
    }

    protected PropertyFilter findPropertyFilter(SerializerProvider serializerprovider, Object obj, Object obj1)
    {
        serializerprovider = serializerprovider.getFilterProvider();
        if (serializerprovider == null)
        {
            throw new JsonMappingException((new StringBuilder("Can not resolve PropertyFilter with id '")).append(obj).append("'; no FilterProvider configured").toString());
        } else
        {
            return serializerprovider.findPropertyFilter(obj, obj1);
        }
    }

    public Class handledType()
    {
        return _handledType;
    }

    public boolean isDefaultSerializer(JsonSerializer jsonserializer)
    {
        return ClassUtil.isJacksonStdImpl(jsonserializer);
    }

    public abstract void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider);

    public void wrapAndThrow(SerializerProvider serializerprovider, Throwable throwable, Object obj, int i)
    {
        for (; (throwable instanceof InvocationTargetException) && throwable.getCause() != null; throwable = throwable.getCause()) { }
        if (throwable instanceof Error)
        {
            throw (Error)throwable;
        }
        boolean flag;
        if (serializerprovider == null || serializerprovider.isEnabled(SerializationFeature.WRAP_EXCEPTIONS))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (throwable instanceof IOException)
        {
            if (!flag || !(throwable instanceof JsonMappingException))
            {
                throw (IOException)throwable;
            }
        } else
        if (!flag && (throwable instanceof RuntimeException))
        {
            throw (RuntimeException)throwable;
        }
        throw JsonMappingException.wrapWithPath(throwable, obj, i);
    }

    public void wrapAndThrow(SerializerProvider serializerprovider, Throwable throwable, Object obj, String s)
    {
        for (; (throwable instanceof InvocationTargetException) && throwable.getCause() != null; throwable = throwable.getCause()) { }
        if (throwable instanceof Error)
        {
            throw (Error)throwable;
        }
        boolean flag;
        if (serializerprovider == null || serializerprovider.isEnabled(SerializationFeature.WRAP_EXCEPTIONS))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (throwable instanceof IOException)
        {
            if (!flag || !(throwable instanceof JsonMappingException))
            {
                throw (IOException)throwable;
            }
        } else
        if (!flag && (throwable instanceof RuntimeException))
        {
            throw (RuntimeException)throwable;
        }
        throw JsonMappingException.wrapWithPath(throwable, obj, s);
    }
}

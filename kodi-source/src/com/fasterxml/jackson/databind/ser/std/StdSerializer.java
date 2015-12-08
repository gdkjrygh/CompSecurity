// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
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
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdDelegatingSerializer

public abstract class StdSerializer extends JsonSerializer
    implements Serializable
{

    protected final Class _handledType;

    protected StdSerializer(JavaType javatype)
    {
        _handledType = javatype.getRawClass();
    }

    protected StdSerializer(Class class1)
    {
        _handledType = class1;
    }

    protected StdSerializer(Class class1, boolean flag)
    {
        _handledType = class1;
    }

    protected JsonSerializer findConvertingContentSerializer(SerializerProvider serializerprovider, BeanProperty beanproperty, JsonSerializer jsonserializer)
        throws JsonMappingException
    {
        Object obj = serializerprovider.getAnnotationIntrospector();
        if (obj != null && beanproperty != null)
        {
            com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedmember = beanproperty.getMember();
            if (annotatedmember != null)
            {
                obj = ((AnnotationIntrospector) (obj)).findSerializationContentConverter(annotatedmember);
                if (obj != null)
                {
                    obj = serializerprovider.converterInstance(beanproperty.getMember(), obj);
                    JavaType javatype = ((Converter) (obj)).getOutputType(serializerprovider.getTypeFactory());
                    beanproperty = jsonserializer;
                    if (jsonserializer == null)
                    {
                        beanproperty = serializerprovider.findValueSerializer(javatype);
                    }
                    return new StdDelegatingSerializer(((Converter) (obj)), javatype, beanproperty);
                }
            }
        }
        return jsonserializer;
    }

    protected PropertyFilter findPropertyFilter(SerializerProvider serializerprovider, Object obj, Object obj1)
        throws JsonMappingException
    {
        serializerprovider = serializerprovider.getFilterProvider();
        if (serializerprovider == null)
        {
            throw new JsonMappingException((new StringBuilder()).append("Can not resolve PropertyFilter with id '").append(obj).append("'; no FilterProvider configured").toString());
        } else
        {
            return serializerprovider.findPropertyFilter(obj, obj1);
        }
    }

    public Class handledType()
    {
        return _handledType;
    }

    protected boolean isDefaultSerializer(JsonSerializer jsonserializer)
    {
        return ClassUtil.isJacksonStdImpl(jsonserializer);
    }

    public abstract void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException;

    public void wrapAndThrow(SerializerProvider serializerprovider, Throwable throwable, Object obj, int i)
        throws IOException
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
        throws IOException
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

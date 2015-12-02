// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;

public abstract class StdSerializer extends JsonSerializer
    implements SchemaAware
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

    protected ObjectNode createObjectNode()
    {
        return JsonNodeFactory.instance.objectNode();
    }

    protected ObjectNode createSchemaNode(String s)
    {
        ObjectNode objectnode = createObjectNode();
        objectnode.put("type", s);
        return objectnode;
    }

    protected ObjectNode createSchemaNode(String s, boolean flag)
    {
        s = createSchemaNode(s);
        if (!flag)
        {
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            s.put("required", flag);
        }
        return s;
    }

    public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
    {
        return createSchemaNode("string");
    }

    public final Class handledType()
    {
        return _handledType;
    }

    protected boolean isDefaultSerializer(JsonSerializer jsonserializer)
    {
        return jsonserializer != null && jsonserializer.getClass().getAnnotation(com/fasterxml/jackson/databind/annotation/JacksonStdImpl) != null;
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

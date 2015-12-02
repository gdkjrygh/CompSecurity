// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.io.IOException;
import java.lang.reflect.Method;

public final class SettableAnyProperty
{

    protected final BeanProperty _property;
    protected final Method _setter;
    protected final JavaType _type;
    protected JsonDeserializer _valueDeserializer;

    public SettableAnyProperty(BeanProperty beanproperty, AnnotatedMethod annotatedmethod, JavaType javatype, JsonDeserializer jsondeserializer)
    {
        this(beanproperty, annotatedmethod.getAnnotated(), javatype, jsondeserializer);
    }

    public SettableAnyProperty(BeanProperty beanproperty, Method method, JavaType javatype, JsonDeserializer jsondeserializer)
    {
        _property = beanproperty;
        _type = javatype;
        _setter = method;
        _valueDeserializer = jsondeserializer;
    }

    private String getClassName()
    {
        return _setter.getDeclaringClass().getName();
    }

    protected void _throwAsIOE(Exception exception, String s, Object obj)
    {
        if (exception instanceof IllegalArgumentException)
        {
            if (obj == null)
            {
                obj = "[NULL]";
            } else
            {
                obj = obj.getClass().getName();
            }
            s = (new StringBuilder("Problem deserializing \"any\" property '")).append(s);
            s.append((new StringBuilder()).append("' of class ").append(getClassName()).append(" (expected type: ").toString()).append(_type);
            s.append("; actual type: ").append(((String) (obj))).append(")");
            obj = exception.getMessage();
            if (obj != null)
            {
                s.append(", problem: ").append(((String) (obj)));
            } else
            {
                s.append(" (no error message provided)");
            }
            throw new JsonMappingException(s.toString(), null, exception);
        }
        if (exception instanceof IOException)
        {
            throw (IOException)exception;
        }
        s = exception;
        if (exception instanceof RuntimeException)
        {
            throw (RuntimeException)exception;
        }
        for (; s.getCause() != null; s = s.getCause()) { }
        throw new JsonMappingException(s.getMessage(), null, s);
    }

    public final Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        if (jsonparser.getCurrentToken() == JsonToken.VALUE_NULL)
        {
            return null;
        } else
        {
            return _valueDeserializer.deserialize(jsonparser, deserializationcontext);
        }
    }

    public final void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj, String s)
    {
        set(obj, s, deserialize(jsonparser, deserializationcontext));
    }

    public BeanProperty getProperty()
    {
        return _property;
    }

    public JavaType getType()
    {
        return _type;
    }

    public boolean hasValueDeserializer()
    {
        return _valueDeserializer != null;
    }

    public final void set(Object obj, String s, Object obj1)
    {
        try
        {
            _setter.invoke(obj, new Object[] {
                s, obj1
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            _throwAsIOE(((Exception) (obj)), s, obj1);
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("[any property on class ").append(getClassName()).append("]").toString();
    }

    public SettableAnyProperty withValueDeserializer(JsonDeserializer jsondeserializer)
    {
        return new SettableAnyProperty(_property, _setter, _type, jsondeserializer);
    }
}

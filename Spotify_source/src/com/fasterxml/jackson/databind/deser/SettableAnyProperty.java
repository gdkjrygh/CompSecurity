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
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Method;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//            UnresolvedForwardReference

public class SettableAnyProperty
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    protected final BeanProperty _property;
    protected final transient Method _setter;
    protected final JavaType _type;
    protected JsonDeserializer _valueDeserializer;
    protected final TypeDeserializer _valueTypeDeserializer;

    public SettableAnyProperty(BeanProperty beanproperty, AnnotatedMethod annotatedmethod, JavaType javatype, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer)
    {
        this(beanproperty, annotatedmethod.getAnnotated(), javatype, jsondeserializer, typedeserializer);
    }

    public SettableAnyProperty(BeanProperty beanproperty, Method method, JavaType javatype, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer)
    {
        _property = beanproperty;
        _type = javatype;
        _setter = method;
        _valueDeserializer = jsondeserializer;
        _valueTypeDeserializer = typedeserializer;
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
            s.append((new StringBuilder("' of class ")).append(getClassName()).append(" (expected type: ").toString()).append(_type);
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

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        if (jsonparser.getCurrentToken() == JsonToken.VALUE_NULL)
        {
            return null;
        }
        if (_valueTypeDeserializer != null)
        {
            return _valueDeserializer.deserializeWithType(jsonparser, deserializationcontext, _valueTypeDeserializer);
        } else
        {
            return _valueDeserializer.deserialize(jsonparser, deserializationcontext);
        }
    }

    public final void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj, String s)
    {
        try
        {
            set(obj, s, deserialize(jsonparser, deserializationcontext));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DeserializationContext deserializationcontext) { }
        if (_valueDeserializer.getObjectIdReader() == null)
        {
            throw JsonMappingException.from(jsonparser, "Unresolved forward reference but no identity info.", deserializationcontext);
        } else
        {
            jsonparser = new AnySetterReferring(deserializationcontext, _type.getRawClass(), obj, s);
            deserializationcontext.getRoid().appendReferring(jsonparser);
            return;
        }
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

    public void set(Object obj, String s, Object obj1)
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
        return (new StringBuilder("[any property on class ")).append(getClassName()).append("]").toString();
    }

    public SettableAnyProperty withValueDeserializer(JsonDeserializer jsondeserializer)
    {
        return new SettableAnyProperty(_property, _setter, _type, jsondeserializer, _valueTypeDeserializer);
    }

    private class AnySetterReferring extends com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
    {

        private final SettableAnyProperty _parent;
        private final Object _pojo;
        private final String _propName;

        public void handleResolvedForwardReference(Object obj, Object obj1)
        {
            if (!hasId(obj))
            {
                throw new IllegalArgumentException((new StringBuilder("Trying to resolve a forward reference with id [")).append(obj.toString()).append("] that wasn't previously registered.").toString());
            } else
            {
                _parent.set(_pojo, _propName, obj1);
                return;
            }
        }

        public AnySetterReferring(UnresolvedForwardReference unresolvedforwardreference, Class class1, Object obj, String s)
        {
            super(unresolvedforwardreference, class1);
            _parent = SettableAnyProperty.this;
            _pojo = obj;
            _propName = s;
        }
    }

}

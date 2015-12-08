// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.InternCache;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.NullProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ViewMatcher;
import java.io.IOException;
import java.io.Serializable;

public abstract class SettableBeanProperty
    implements BeanProperty, Serializable
{

    protected final transient Annotations _contextAnnotations;
    protected String _managedReferenceName;
    public NullProvider _nullProvider;
    protected final String _propName;
    protected int _propertyIndex;
    protected final JavaType _type;
    public JsonDeserializer _valueDeserializer;
    public TypeDeserializer _valueTypeDeserializer;
    protected ViewMatcher _viewMatcher;

    public SettableBeanProperty(SettableBeanProperty settablebeanproperty)
    {
        _propertyIndex = -1;
        _propName = settablebeanproperty._propName;
        _type = settablebeanproperty._type;
        _contextAnnotations = settablebeanproperty._contextAnnotations;
        _valueDeserializer = settablebeanproperty._valueDeserializer;
        _valueTypeDeserializer = settablebeanproperty._valueTypeDeserializer;
        _nullProvider = settablebeanproperty._nullProvider;
        _managedReferenceName = settablebeanproperty._managedReferenceName;
        _propertyIndex = settablebeanproperty._propertyIndex;
        _viewMatcher = settablebeanproperty._viewMatcher;
    }

    public SettableBeanProperty(SettableBeanProperty settablebeanproperty, JsonDeserializer jsondeserializer)
    {
        Object obj = null;
        super();
        _propertyIndex = -1;
        _propName = settablebeanproperty._propName;
        _type = settablebeanproperty._type;
        _contextAnnotations = settablebeanproperty._contextAnnotations;
        _valueTypeDeserializer = settablebeanproperty._valueTypeDeserializer;
        _managedReferenceName = settablebeanproperty._managedReferenceName;
        _propertyIndex = settablebeanproperty._propertyIndex;
        _valueDeserializer = jsondeserializer;
        if (jsondeserializer == null)
        {
            jsondeserializer = obj;
        } else
        {
            jsondeserializer = ((JsonDeserializer) (jsondeserializer.getNullValue()));
            if (jsondeserializer == null)
            {
                jsondeserializer = obj;
            } else
            {
                jsondeserializer = new NullProvider(_type, jsondeserializer);
            }
        }
        _nullProvider = jsondeserializer;
        _viewMatcher = settablebeanproperty._viewMatcher;
    }

    public SettableBeanProperty(SettableBeanProperty settablebeanproperty, String s)
    {
        _propertyIndex = -1;
        _propName = s;
        _type = settablebeanproperty._type;
        _contextAnnotations = settablebeanproperty._contextAnnotations;
        _valueDeserializer = settablebeanproperty._valueDeserializer;
        _valueTypeDeserializer = settablebeanproperty._valueTypeDeserializer;
        _nullProvider = settablebeanproperty._nullProvider;
        _managedReferenceName = settablebeanproperty._managedReferenceName;
        _propertyIndex = settablebeanproperty._propertyIndex;
        _viewMatcher = settablebeanproperty._viewMatcher;
    }

    public SettableBeanProperty(BeanPropertyDefinition beanpropertydefinition, JavaType javatype, TypeDeserializer typedeserializer, Annotations annotations)
    {
        this(beanpropertydefinition.getName(), javatype, typedeserializer, annotations);
    }

    public SettableBeanProperty(String s, JavaType javatype, TypeDeserializer typedeserializer, Annotations annotations)
    {
        _propertyIndex = -1;
        if (s == null || s.length() == 0)
        {
            _propName = "";
        } else
        {
            _propName = InternCache.instance.intern(s);
        }
        _type = javatype;
        _contextAnnotations = annotations;
        _viewMatcher = null;
        s = typedeserializer;
        if (typedeserializer != null)
        {
            s = typedeserializer.forProperty(this);
        }
        _valueTypeDeserializer = s;
    }

    public IOException _throwAsIOE(Exception exception)
        throws IOException
    {
        if (exception instanceof IOException)
        {
            throw (IOException)exception;
        }
        Object obj = exception;
        if (exception instanceof RuntimeException)
        {
            throw (RuntimeException)exception;
        }
        for (; ((Throwable) (obj)).getCause() != null; obj = ((Throwable) (obj)).getCause()) { }
        throw new JsonMappingException(((Throwable) (obj)).getMessage(), null, ((Throwable) (obj)));
    }

    public void _throwAsIOE(Exception exception, Object obj)
        throws IOException
    {
        if (exception instanceof IllegalArgumentException)
        {
            StringBuilder stringbuilder;
            if (obj == null)
            {
                obj = "[NULL]";
            } else
            {
                obj = obj.getClass().getName();
            }
            stringbuilder = (new StringBuilder("Problem deserializing property '")).append(getName());
            stringbuilder.append("' (expected type: ").append(getType());
            stringbuilder.append("; actual type: ").append(((String) (obj))).append(")");
            obj = exception.getMessage();
            if (obj != null)
            {
                stringbuilder.append(", problem: ").append(((String) (obj)));
            } else
            {
                stringbuilder.append(" (no error message provided)");
            }
            throw new JsonMappingException(stringbuilder.toString(), null, exception);
        } else
        {
            _throwAsIOE(exception);
            return;
        }
    }

    public void assignIndex(int i)
    {
        if (_propertyIndex != -1)
        {
            throw new IllegalStateException((new StringBuilder("Property '")).append(getName()).append("' already had index (").append(_propertyIndex).append("), trying to assign ").append(i).toString());
        } else
        {
            _propertyIndex = i;
            return;
        }
    }

    public final Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (jsonparser.getCurrentToken() == JsonToken.VALUE_NULL)
        {
            if (_nullProvider == null)
            {
                return null;
            } else
            {
                return _nullProvider.nullValue(deserializationcontext);
            }
        }
        if (_valueTypeDeserializer != null)
        {
            return _valueDeserializer.deserializeWithType(jsonparser, deserializationcontext, _valueTypeDeserializer);
        } else
        {
            return _valueDeserializer.deserialize(jsonparser, deserializationcontext);
        }
    }

    public abstract void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
        throws IOException, JsonProcessingException;

    public abstract Object deserializeSetAndReturn(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
        throws IOException, JsonProcessingException;

    public int getCreatorIndex()
    {
        return -1;
    }

    public Object getInjectableValueId()
    {
        return null;
    }

    public String getManagedReferenceName()
    {
        return _managedReferenceName;
    }

    public abstract AnnotatedMember getMember();

    public final String getName()
    {
        return _propName;
    }

    public JavaType getType()
    {
        return _type;
    }

    public JsonDeserializer getValueDeserializer()
    {
        return _valueDeserializer;
    }

    public TypeDeserializer getValueTypeDeserializer()
    {
        return _valueTypeDeserializer;
    }

    public boolean hasValueDeserializer()
    {
        return _valueDeserializer != null;
    }

    public boolean hasValueTypeDeserializer()
    {
        return _valueTypeDeserializer != null;
    }

    public boolean hasViews()
    {
        return _viewMatcher != null;
    }

    public abstract void set(Object obj, Object obj1)
        throws IOException;

    public abstract Object setAndReturn(Object obj, Object obj1)
        throws IOException;

    public void setManagedReferenceName(String s)
    {
        _managedReferenceName = s;
    }

    public void setViews(Class aclass[])
    {
        if (aclass == null)
        {
            _viewMatcher = null;
            return;
        } else
        {
            _viewMatcher = ViewMatcher.construct(aclass);
            return;
        }
    }

    public String toString()
    {
        return (new StringBuilder("[property '")).append(getName()).append("']").toString();
    }

    public boolean visibleInView(Class class1)
    {
        return _viewMatcher == null || _viewMatcher.isVisibleForView(class1);
    }

    public abstract SettableBeanProperty withName(String s);

    public abstract SettableBeanProperty withValueDeserializer(JsonDeserializer jsondeserializer);
}

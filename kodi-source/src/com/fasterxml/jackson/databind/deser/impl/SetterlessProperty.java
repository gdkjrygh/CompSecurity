// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import java.io.IOException;
import java.lang.reflect.Method;

public final class SetterlessProperty extends SettableBeanProperty
{

    protected final AnnotatedMethod _annotated;
    protected final Method _getter;

    protected SetterlessProperty(SetterlessProperty setterlessproperty, JsonDeserializer jsondeserializer)
    {
        super(setterlessproperty, jsondeserializer);
        _annotated = setterlessproperty._annotated;
        _getter = setterlessproperty._getter;
    }

    protected SetterlessProperty(SetterlessProperty setterlessproperty, PropertyName propertyname)
    {
        super(setterlessproperty, propertyname);
        _annotated = setterlessproperty._annotated;
        _getter = setterlessproperty._getter;
    }

    public SetterlessProperty(BeanPropertyDefinition beanpropertydefinition, JavaType javatype, TypeDeserializer typedeserializer, Annotations annotations, AnnotatedMethod annotatedmethod)
    {
        super(beanpropertydefinition, javatype, typedeserializer, annotations);
        _annotated = annotatedmethod;
        _getter = annotatedmethod.getAnnotated();
    }

    public final void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
        throws IOException, JsonProcessingException
    {
        if (jsonparser.getCurrentToken() == JsonToken.VALUE_NULL)
        {
            return;
        }
        if (_valueTypeDeserializer != null)
        {
            throw new JsonMappingException((new StringBuilder()).append("Problem deserializing 'setterless' property (\"").append(getName()).append("\"): no way to handle typed deser with setterless yet").toString());
        }
        try
        {
            obj = _getter.invoke(obj, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            _throwAsIOE(jsonparser);
            return;
        }
        if (obj == null)
        {
            throw new JsonMappingException((new StringBuilder()).append("Problem deserializing 'setterless' property '").append(getName()).append("': get method returned null").toString());
        } else
        {
            _valueDeserializer.deserialize(jsonparser, deserializationcontext, obj);
            return;
        }
    }

    public Object deserializeSetAndReturn(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
        throws IOException, JsonProcessingException
    {
        deserializeAndSet(jsonparser, deserializationcontext, obj);
        return obj;
    }

    public AnnotatedMember getMember()
    {
        return _annotated;
    }

    public final void set(Object obj, Object obj1)
        throws IOException
    {
        throw new UnsupportedOperationException("Should never call 'set' on setterless property");
    }

    public Object setAndReturn(Object obj, Object obj1)
        throws IOException
    {
        set(obj, obj1);
        return null;
    }

    public volatile SettableBeanProperty withName(PropertyName propertyname)
    {
        return withName(propertyname);
    }

    public SetterlessProperty withName(PropertyName propertyname)
    {
        return new SetterlessProperty(this, propertyname);
    }

    public volatile SettableBeanProperty withValueDeserializer(JsonDeserializer jsondeserializer)
    {
        return withValueDeserializer(jsondeserializer);
    }

    public SetterlessProperty withValueDeserializer(JsonDeserializer jsondeserializer)
    {
        return new SetterlessProperty(this, jsondeserializer);
    }
}

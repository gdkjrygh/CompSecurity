// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.Serializable;

public class ObjectIdReader
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    protected final JsonDeserializer _deserializer;
    protected final JavaType _idType;
    public final ObjectIdGenerator generator;
    public final SettableBeanProperty idProperty;
    public final PropertyName propertyName;
    public final ObjectIdResolver resolver;

    protected ObjectIdReader(JavaType javatype, PropertyName propertyname, ObjectIdGenerator objectidgenerator, JsonDeserializer jsondeserializer, SettableBeanProperty settablebeanproperty, ObjectIdResolver objectidresolver)
    {
        _idType = javatype;
        propertyName = propertyname;
        generator = objectidgenerator;
        resolver = objectidresolver;
        _deserializer = jsondeserializer;
        idProperty = settablebeanproperty;
    }

    public static ObjectIdReader construct(JavaType javatype, PropertyName propertyname, ObjectIdGenerator objectidgenerator, JsonDeserializer jsondeserializer, SettableBeanProperty settablebeanproperty, ObjectIdResolver objectidresolver)
    {
        return new ObjectIdReader(javatype, propertyname, objectidgenerator, jsondeserializer, settablebeanproperty, objectidresolver);
    }

    public JsonDeserializer getDeserializer()
    {
        return _deserializer;
    }

    public JavaType getIdType()
    {
        return _idType;
    }

    public Object readObjectReference(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return _deserializer.deserialize(jsonparser, deserializationcontext);
    }
}

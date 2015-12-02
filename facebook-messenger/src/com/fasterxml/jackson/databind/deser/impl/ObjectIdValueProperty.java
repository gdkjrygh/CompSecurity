// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.lang.annotation.Annotation;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//            ObjectIdReader, ReadableObjectId

public final class ObjectIdValueProperty extends SettableBeanProperty
{

    protected final ObjectIdReader _objectIdReader;

    public ObjectIdValueProperty(ObjectIdReader objectidreader)
    {
        super(objectidreader.propertyName, objectidreader.idType, null, null);
        _objectIdReader = objectidreader;
        _valueDeserializer = objectidreader.deserializer;
    }

    protected ObjectIdValueProperty(ObjectIdValueProperty objectidvalueproperty, JsonDeserializer jsondeserializer)
    {
        super(objectidvalueproperty, jsondeserializer);
        _objectIdReader = objectidvalueproperty._objectIdReader;
    }

    protected ObjectIdValueProperty(ObjectIdValueProperty objectidvalueproperty, String s)
    {
        super(objectidvalueproperty, s);
        _objectIdReader = objectidvalueproperty._objectIdReader;
    }

    public void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
    {
        deserializeSetAndReturn(jsonparser, deserializationcontext, obj);
    }

    public Object deserializeSetAndReturn(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
    {
        Object obj1 = _valueDeserializer.deserialize(jsonparser, deserializationcontext);
        deserializationcontext.findObjectId(obj1, _objectIdReader.generator).bindItem(obj);
        deserializationcontext = _objectIdReader.idProperty;
        jsonparser = ((JsonParser) (obj));
        if (deserializationcontext != null)
        {
            jsonparser = ((JsonParser) (deserializationcontext.setAndReturn(obj, obj1)));
        }
        return jsonparser;
    }

    public Annotation getAnnotation(Class class1)
    {
        return null;
    }

    public AnnotatedMember getMember()
    {
        return null;
    }

    public void set(Object obj, Object obj1)
    {
        setAndReturn(obj, obj1);
    }

    public Object setAndReturn(Object obj, Object obj1)
    {
        SettableBeanProperty settablebeanproperty = _objectIdReader.idProperty;
        if (settablebeanproperty == null)
        {
            throw new UnsupportedOperationException("Should not call set() on ObjectIdProperty that has no SettableBeanProperty");
        } else
        {
            return settablebeanproperty.setAndReturn(obj, obj1);
        }
    }

    public volatile SettableBeanProperty withName(String s)
    {
        return withName(s);
    }

    public ObjectIdValueProperty withName(String s)
    {
        return new ObjectIdValueProperty(this, s);
    }

    public volatile SettableBeanProperty withValueDeserializer(JsonDeserializer jsondeserializer)
    {
        return withValueDeserializer(jsondeserializer);
    }

    public ObjectIdValueProperty withValueDeserializer(JsonDeserializer jsondeserializer)
    {
        return new ObjectIdValueProperty(this, jsondeserializer);
    }
}

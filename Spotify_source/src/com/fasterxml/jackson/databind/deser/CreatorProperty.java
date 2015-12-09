// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//            SettableBeanProperty

public class CreatorProperty extends SettableBeanProperty
{

    private static final long serialVersionUID = 1L;
    protected final AnnotatedParameter _annotated;
    protected final int _creatorIndex;
    protected final SettableBeanProperty _fallbackSetter;
    protected final Object _injectableValueId;

    public CreatorProperty(PropertyName propertyname, JavaType javatype, PropertyName propertyname1, TypeDeserializer typedeserializer, Annotations annotations, AnnotatedParameter annotatedparameter, int i, 
            Object obj, PropertyMetadata propertymetadata)
    {
        super(propertyname, javatype, propertyname1, typedeserializer, annotations, propertymetadata);
        _annotated = annotatedparameter;
        _creatorIndex = i;
        _injectableValueId = obj;
        _fallbackSetter = null;
    }

    protected CreatorProperty(CreatorProperty creatorproperty, JsonDeserializer jsondeserializer)
    {
        super(creatorproperty, jsondeserializer);
        _annotated = creatorproperty._annotated;
        _creatorIndex = creatorproperty._creatorIndex;
        _injectableValueId = creatorproperty._injectableValueId;
        _fallbackSetter = creatorproperty._fallbackSetter;
    }

    protected CreatorProperty(CreatorProperty creatorproperty, PropertyName propertyname)
    {
        super(creatorproperty, propertyname);
        _annotated = creatorproperty._annotated;
        _creatorIndex = creatorproperty._creatorIndex;
        _injectableValueId = creatorproperty._injectableValueId;
        _fallbackSetter = creatorproperty._fallbackSetter;
    }

    protected CreatorProperty(CreatorProperty creatorproperty, SettableBeanProperty settablebeanproperty)
    {
        super(creatorproperty);
        _annotated = creatorproperty._annotated;
        _creatorIndex = creatorproperty._creatorIndex;
        _injectableValueId = creatorproperty._injectableValueId;
        _fallbackSetter = settablebeanproperty;
    }

    public void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
    {
        set(obj, deserialize(jsonparser, deserializationcontext));
    }

    public Object deserializeSetAndReturn(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
    {
        return setAndReturn(obj, deserialize(jsonparser, deserializationcontext));
    }

    public int getCreatorIndex()
    {
        return _creatorIndex;
    }

    public Object getInjectableValueId()
    {
        return _injectableValueId;
    }

    public AnnotatedMember getMember()
    {
        return _annotated;
    }

    public void set(Object obj, Object obj1)
    {
        if (_fallbackSetter == null)
        {
            throw new IllegalStateException((new StringBuilder("No fallback setter/field defined: can not use creator property for ")).append(getClass().getName()).toString());
        } else
        {
            _fallbackSetter.set(obj, obj1);
            return;
        }
    }

    public Object setAndReturn(Object obj, Object obj1)
    {
        if (_fallbackSetter == null)
        {
            throw new IllegalStateException((new StringBuilder("No fallback setter/field defined: can not use creator property for ")).append(getClass().getName()).toString());
        } else
        {
            return _fallbackSetter.setAndReturn(obj, obj1);
        }
    }

    public String toString()
    {
        return (new StringBuilder("[creator property, name '")).append(getName()).append("'; inject id '").append(_injectableValueId).append("']").toString();
    }

    public CreatorProperty withFallbackSetter(SettableBeanProperty settablebeanproperty)
    {
        return new CreatorProperty(this, settablebeanproperty);
    }

    public CreatorProperty withName(PropertyName propertyname)
    {
        return new CreatorProperty(this, propertyname);
    }

    public volatile SettableBeanProperty withName(PropertyName propertyname)
    {
        return withName(propertyname);
    }

    public CreatorProperty withValueDeserializer(JsonDeserializer jsondeserializer)
    {
        return new CreatorProperty(this, jsondeserializer);
    }

    public volatile SettableBeanProperty withValueDeserializer(JsonDeserializer jsondeserializer)
    {
        return withValueDeserializer(jsondeserializer);
    }
}

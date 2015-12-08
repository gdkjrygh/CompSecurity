// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//            SettableBeanProperty

public class CreatorProperty extends SettableBeanProperty
{

    protected final AnnotatedParameter _annotated;
    protected final int _creatorIndex;
    protected final Object _injectableValueId;

    protected CreatorProperty(CreatorProperty creatorproperty, JsonDeserializer jsondeserializer)
    {
        super(creatorproperty, jsondeserializer);
        _annotated = creatorproperty._annotated;
        _creatorIndex = creatorproperty._creatorIndex;
        _injectableValueId = creatorproperty._injectableValueId;
    }

    protected CreatorProperty(CreatorProperty creatorproperty, String s)
    {
        super(creatorproperty, s);
        _annotated = creatorproperty._annotated;
        _creatorIndex = creatorproperty._creatorIndex;
        _injectableValueId = creatorproperty._injectableValueId;
    }

    public CreatorProperty(String s, JavaType javatype, TypeDeserializer typedeserializer, Annotations annotations, AnnotatedParameter annotatedparameter, int i, Object obj)
    {
        super(s, javatype, typedeserializer, annotations);
        _annotated = annotatedparameter;
        _creatorIndex = i;
        _injectableValueId = obj;
    }

    public void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
        throws IOException, JsonProcessingException
    {
        set(obj, deserialize(jsonparser, deserializationcontext));
    }

    public Object deserializeSetAndReturn(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
        throws IOException, JsonProcessingException
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
        throws IOException
    {
        throw new IllegalStateException((new StringBuilder("Method should never be called on a ")).append(getClass().getName()).toString());
    }

    public Object setAndReturn(Object obj, Object obj1)
        throws IOException
    {
        return obj;
    }

    public String toString()
    {
        return (new StringBuilder("[creator property, name '")).append(getName()).append("'; inject id '").append(_injectableValueId).append("']").toString();
    }

    public CreatorProperty withName(String s)
    {
        return new CreatorProperty(this, s);
    }

    public volatile SettableBeanProperty withName(String s)
    {
        return withName(s);
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

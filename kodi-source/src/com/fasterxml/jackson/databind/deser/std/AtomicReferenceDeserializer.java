// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdDeserializer

public class AtomicReferenceDeserializer extends StdDeserializer
    implements ContextualDeserializer
{

    protected final JavaType _referencedType;
    protected final JsonDeserializer _valueDeserializer;
    protected final TypeDeserializer _valueTypeDeserializer;

    public AtomicReferenceDeserializer(JavaType javatype, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
    {
        super(java/util/concurrent/atomic/AtomicReference);
        _referencedType = javatype;
        _valueDeserializer = jsondeserializer;
        _valueTypeDeserializer = typedeserializer;
    }

    public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
        throws JsonMappingException
    {
        JsonDeserializer jsondeserializer1 = _valueDeserializer;
        TypeDeserializer typedeserializer = _valueTypeDeserializer;
        JsonDeserializer jsondeserializer = jsondeserializer1;
        if (jsondeserializer1 == null)
        {
            jsondeserializer = deserializationcontext.findContextualValueDeserializer(_referencedType, beanproperty);
        }
        deserializationcontext = typedeserializer;
        if (typedeserializer != null)
        {
            deserializationcontext = typedeserializer.forProperty(beanproperty);
        }
        if (jsondeserializer == _valueDeserializer && deserializationcontext == _valueTypeDeserializer)
        {
            return this;
        } else
        {
            return withResolved(deserializationcontext, jsondeserializer);
        }
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public AtomicReference deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        if (_valueTypeDeserializer != null)
        {
            return new AtomicReference(_valueDeserializer.deserializeWithType(jsonparser, deserializationcontext, _valueTypeDeserializer));
        } else
        {
            return new AtomicReference(_valueDeserializer.deserialize(jsonparser, deserializationcontext));
        }
    }

    public volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException
    {
        return ((Object) (deserializeWithType(jsonparser, deserializationcontext, typedeserializer)));
    }

    public Object[] deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException
    {
        return (Object[])(Object[])typedeserializer.deserializeTypedFromAny(jsonparser, deserializationcontext);
    }

    public volatile Object getNullValue()
    {
        return getNullValue();
    }

    public AtomicReference getNullValue()
    {
        return new AtomicReference();
    }

    public AtomicReferenceDeserializer withResolved(TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
    {
        return new AtomicReferenceDeserializer(_referencedType, typedeserializer, jsondeserializer);
    }
}

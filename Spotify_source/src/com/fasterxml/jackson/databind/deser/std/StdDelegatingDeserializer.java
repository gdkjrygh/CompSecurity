// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Converter;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdDeserializer

public class StdDelegatingDeserializer extends StdDeserializer
    implements ContextualDeserializer, ResolvableDeserializer
{

    private static final long serialVersionUID = 1L;
    protected final Converter _converter;
    protected final JsonDeserializer _delegateDeserializer;
    protected final JavaType _delegateType;

    public StdDelegatingDeserializer(Converter converter, JavaType javatype, JsonDeserializer jsondeserializer)
    {
        super(javatype);
        _converter = converter;
        _delegateType = javatype;
        _delegateDeserializer = jsondeserializer;
    }

    protected Object convertValue(Object obj)
    {
        return _converter.convert(obj);
    }

    public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
    {
        if (_delegateDeserializer != null)
        {
            beanproperty = deserializationcontext.handleSecondaryContextualization(_delegateDeserializer, beanproperty);
            deserializationcontext = this;
            if (beanproperty != _delegateDeserializer)
            {
                deserializationcontext = withDelegate(_converter, _delegateType, beanproperty);
            }
            return deserializationcontext;
        } else
        {
            JavaType javatype = _converter.getInputType(deserializationcontext.getTypeFactory());
            return withDelegate(_converter, javatype, deserializationcontext.findContextualValueDeserializer(javatype, beanproperty));
        }
    }

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        jsonparser = ((JsonParser) (_delegateDeserializer.deserialize(jsonparser, deserializationcontext)));
        if (jsonparser == null)
        {
            return null;
        } else
        {
            return convertValue(jsonparser);
        }
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
    {
        jsonparser = ((JsonParser) (_delegateDeserializer.deserializeWithType(jsonparser, deserializationcontext, typedeserializer)));
        if (jsonparser == null)
        {
            return null;
        } else
        {
            return convertValue(jsonparser);
        }
    }

    public Class handledType()
    {
        return _delegateDeserializer.handledType();
    }

    public void resolve(DeserializationContext deserializationcontext)
    {
        if (_delegateDeserializer != null && (_delegateDeserializer instanceof ResolvableDeserializer))
        {
            ((ResolvableDeserializer)_delegateDeserializer).resolve(deserializationcontext);
        }
    }

    protected StdDelegatingDeserializer withDelegate(Converter converter, JavaType javatype, JsonDeserializer jsondeserializer)
    {
        if (getClass() != com/fasterxml/jackson/databind/deser/std/StdDelegatingDeserializer)
        {
            throw new IllegalStateException((new StringBuilder("Sub-class ")).append(getClass().getName()).append(" must override 'withDelegate'").toString());
        } else
        {
            return new StdDelegatingDeserializer(converter, javatype, jsondeserializer);
        }
    }
}

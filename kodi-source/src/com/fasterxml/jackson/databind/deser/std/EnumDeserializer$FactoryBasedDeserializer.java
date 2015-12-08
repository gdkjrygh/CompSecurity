// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.lang.reflect.Method;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdDeserializer, EnumDeserializer

protected static class _deser extends StdDeserializer
    implements ContextualDeserializer
{

    protected final JsonDeserializer _deser;
    protected final Method _factory;
    protected final Class _inputType;

    public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
        throws JsonMappingException
    {
        _deser _ldeser = this;
        if (_deser == null)
        {
            _ldeser = this;
            if (_inputType != java/lang/String)
            {
                _ldeser = new <init>(this, deserializationcontext.findContextualValueDeserializer(deserializationcontext.constructType(_inputType), beanproperty));
            }
        }
        return _ldeser;
    }

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        if (_deser != null)
        {
            jsonparser = ((JsonParser) (_deser.deserialize(jsonparser, deserializationcontext)));
        } else
        {
            jsonparser = jsonparser.getValueAsString();
        }
        try
        {
            jsonparser = ((JsonParser) (_factory.invoke(_valueClass, new Object[] {
                jsonparser
            })));
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            jsonparser = ClassUtil.getRootCause(jsonparser);
            if (jsonparser instanceof IOException)
            {
                throw (IOException)jsonparser;
            } else
            {
                throw deserializationcontext.instantiationException(_valueClass, jsonparser);
            }
        }
        return jsonparser;
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException
    {
        if (_deser == null)
        {
            return deserialize(jsonparser, deserializationcontext);
        } else
        {
            return typedeserializer.deserializeTypedFromAny(jsonparser, deserializationcontext);
        }
    }

    protected ( , JsonDeserializer jsondeserializer)
    {
        super(._valueClass);
        _inputType = ._inputType;
        _factory = ._factory;
        _deser = jsondeserializer;
    }

    public _deser(Class class1, AnnotatedMethod annotatedmethod, Class class2)
    {
        super(class1);
        _factory = annotatedmethod.getAnnotated();
        _inputType = class2;
        _deser = null;
    }
}

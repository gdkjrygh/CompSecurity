// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import java.util.EnumSet;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdDeserializer

public class EnumSetDeserializer extends StdDeserializer
    implements ContextualDeserializer
{

    protected final Class _enumClass;
    protected JsonDeserializer _enumDeserializer;
    protected final JavaType _enumType;

    public EnumSetDeserializer(JavaType javatype, JsonDeserializer jsondeserializer)
    {
        super(java/util/EnumSet);
        _enumType = javatype;
        _enumClass = javatype.getRawClass();
        _enumDeserializer = jsondeserializer;
    }

    private EnumSet constructSet()
    {
        return EnumSet.noneOf(_enumClass);
    }

    public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
        throws JsonMappingException
    {
        JsonDeserializer jsondeserializer1 = _enumDeserializer;
        if (jsondeserializer1 != null) goto _L2; else goto _L1
_L1:
        JsonDeserializer jsondeserializer = deserializationcontext.findContextualValueDeserializer(_enumType, beanproperty);
_L4:
        return withDeserializer(jsondeserializer);
_L2:
        jsondeserializer = jsondeserializer1;
        if (jsondeserializer1 instanceof ContextualDeserializer)
        {
            jsondeserializer = ((ContextualDeserializer)jsondeserializer1).createContextual(deserializationcontext, beanproperty);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public EnumSet deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (!jsonparser.isExpectedStartArrayToken())
        {
            throw deserializationcontext.mappingException(java/util/EnumSet);
        }
        EnumSet enumset = constructSet();
        do
        {
            Object obj = jsonparser.nextToken();
            if (obj == JsonToken.END_ARRAY)
            {
                break;
            }
            if (obj == JsonToken.VALUE_NULL)
            {
                throw deserializationcontext.mappingException(_enumClass);
            }
            obj = (Enum)_enumDeserializer.deserialize(jsonparser, deserializationcontext);
            if (obj != null)
            {
                enumset.add(obj);
            }
        } while (true);
        return enumset;
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException, JsonProcessingException
    {
        return typedeserializer.deserializeTypedFromArray(jsonparser, deserializationcontext);
    }

    public boolean isCachable()
    {
        return true;
    }

    public EnumSetDeserializer withDeserializer(JsonDeserializer jsondeserializer)
    {
        if (_enumDeserializer == jsondeserializer)
        {
            return this;
        } else
        {
            return new EnumSetDeserializer(_enumType, jsondeserializer);
        }
    }
}

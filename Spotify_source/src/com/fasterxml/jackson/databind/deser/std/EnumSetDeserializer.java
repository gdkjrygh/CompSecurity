// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.EnumSet;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdDeserializer

public class EnumSetDeserializer extends StdDeserializer
    implements ContextualDeserializer
{

    private static final long serialVersionUID = 0x304981f4d0f126c9L;
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
    {
        JsonDeserializer jsondeserializer = _enumDeserializer;
        if (jsondeserializer == null)
        {
            deserializationcontext = deserializationcontext.findContextualValueDeserializer(_enumType, beanproperty);
        } else
        {
            deserializationcontext = deserializationcontext.handleSecondaryContextualization(jsondeserializer, beanproperty);
        }
        return withDeserializer(deserializationcontext);
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public EnumSet deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        EnumSet enumset;
        if (!jsonparser.isExpectedStartArrayToken())
        {
            throw deserializationcontext.mappingException(java/util/EnumSet);
        }
        enumset = constructSet();
_L2:
        JsonToken jsontoken = jsonparser.nextToken();
        if (jsontoken == JsonToken.END_ARRAY)
        {
            break; /* Loop/switch isn't completed */
        }
        if (jsontoken == JsonToken.VALUE_NULL)
        {
            throw deserializationcontext.mappingException(_enumClass);
        }
        Enum enum;
        try
        {
            enum = (Enum)_enumDeserializer.deserialize(jsonparser, deserializationcontext);
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            throw JsonMappingException.wrapWithPath(jsonparser, enumset, enumset.size());
        }
        if (enum == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        enumset.add(enum);
        if (true) goto _L2; else goto _L1
_L1:
        return enumset;
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
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

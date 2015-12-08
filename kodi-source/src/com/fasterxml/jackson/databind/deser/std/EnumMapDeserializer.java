// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import java.util.EnumMap;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            ContainerDeserializerBase

public class EnumMapDeserializer extends ContainerDeserializerBase
    implements ContextualDeserializer
{

    protected final Class _enumClass;
    protected KeyDeserializer _keyDeserializer;
    protected final JavaType _mapType;
    protected JsonDeserializer _valueDeserializer;
    protected final TypeDeserializer _valueTypeDeserializer;

    public EnumMapDeserializer(JavaType javatype, KeyDeserializer keydeserializer, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer)
    {
        super(javatype);
        _mapType = javatype;
        _enumClass = javatype.getKeyType().getRawClass();
        _keyDeserializer = keydeserializer;
        _valueDeserializer = jsondeserializer;
        _valueTypeDeserializer = typedeserializer;
    }

    protected EnumMap constructMap()
    {
        return new EnumMap(_enumClass);
    }

    public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
        throws JsonMappingException
    {
        Object obj = _keyDeserializer;
        KeyDeserializer keydeserializer = ((KeyDeserializer) (obj));
        if (obj == null)
        {
            keydeserializer = deserializationcontext.findKeyDeserializer(_mapType.getKeyType(), beanproperty);
        }
        obj = _valueDeserializer;
        Object obj1 = _mapType.getContentType();
        if (obj == null)
        {
            deserializationcontext = deserializationcontext.findContextualValueDeserializer(((JavaType) (obj1)), beanproperty);
        } else
        {
            deserializationcontext = deserializationcontext.handleSecondaryContextualization(((JsonDeserializer) (obj)), beanproperty, ((JavaType) (obj1)));
        }
        obj1 = _valueTypeDeserializer;
        obj = obj1;
        if (obj1 != null)
        {
            obj = ((TypeDeserializer) (obj1)).forProperty(beanproperty);
        }
        return withResolved(keydeserializer, deserializationcontext, ((TypeDeserializer) (obj)));
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public EnumMap deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        EnumMap enummap;
        JsonDeserializer jsondeserializer;
        TypeDeserializer typedeserializer;
        if (jsonparser.getCurrentToken() != JsonToken.START_OBJECT)
        {
            return (EnumMap)_deserializeFromEmpty(jsonparser, deserializationcontext);
        }
        enummap = constructMap();
        jsondeserializer = _valueDeserializer;
        typedeserializer = _valueTypeDeserializer;
_L2:
        Object obj;
        Enum enum;
        String s;
        if (jsonparser.nextToken() != JsonToken.FIELD_NAME)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        s = jsonparser.getCurrentName();
        enum = (Enum)_keyDeserializer.deserializeKey(s, deserializationcontext);
        if (enum == null)
        {
            if (!deserializationcontext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL))
            {
                throw deserializationcontext.weirdStringException(s, _enumClass, (new StringBuilder()).append("value not one of declared Enum instance names for ").append(_mapType.getKeyType()).toString());
            }
            jsonparser.nextToken();
            jsonparser.skipChildren();
            continue; /* Loop/switch isn't completed */
        }
        obj = jsonparser.nextToken();
        if (obj != JsonToken.VALUE_NULL)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = jsondeserializer.getNullValue();
_L3:
        enummap.put(enum, obj);
        if (true) goto _L2; else goto _L1
_L1:
label0:
        {
            if (typedeserializer != null)
            {
                break label0;
            }
            try
            {
                obj = jsondeserializer.deserialize(jsonparser, deserializationcontext);
            }
            // Misplaced declaration of an exception variable
            catch (JsonParser jsonparser)
            {
                wrapAndThrow(jsonparser, enummap, s);
                return null;
            }
        }
          goto _L3
        obj = jsondeserializer.deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
          goto _L3
        return enummap;
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException, JsonProcessingException
    {
        return typedeserializer.deserializeTypedFromObject(jsonparser, deserializationcontext);
    }

    public JsonDeserializer getContentDeserializer()
    {
        return _valueDeserializer;
    }

    public boolean isCachable()
    {
        return _valueDeserializer == null && _keyDeserializer == null && _valueTypeDeserializer == null;
    }

    public EnumMapDeserializer withResolved(KeyDeserializer keydeserializer, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer)
    {
        if (keydeserializer == _keyDeserializer && jsondeserializer == _valueDeserializer && typedeserializer == _valueTypeDeserializer)
        {
            return this;
        } else
        {
            return new EnumMapDeserializer(_mapType, keydeserializer, jsondeserializer, _valueTypeDeserializer);
        }
    }
}

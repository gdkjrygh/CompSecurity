// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.databind.jsontype.impl:
//            TypeDeserializerBase

public class AsArrayTypeDeserializer extends TypeDeserializerBase
    implements Serializable
{

    private static final long serialVersionUID = 0x4a2f47f9ad71b962L;

    public AsArrayTypeDeserializer(JavaType javatype, TypeIdResolver typeidresolver, String s, boolean flag, Class class1)
    {
        super(javatype, typeidresolver, s, flag, class1);
    }

    public AsArrayTypeDeserializer(AsArrayTypeDeserializer asarraytypedeserializer, BeanProperty beanproperty)
    {
        super(asarraytypedeserializer, beanproperty);
    }

    private final Object _deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        if (!jsonparser.canReadTypeId()) goto _L2; else goto _L1
_L1:
        Object obj = jsonparser.getTypeId();
        if (obj == null) goto _L2; else goto _L3
_L3:
        jsonparser = ((JsonParser) (_deserializeWithNativeTypeId(jsonparser, deserializationcontext, obj)));
_L5:
        return jsonparser;
_L2:
        boolean flag = jsonparser.isExpectedStartArrayToken();
        String s = _locateTypeId(jsonparser, deserializationcontext);
        Object obj2 = _findDeserializer(deserializationcontext, s);
        Object obj1 = jsonparser;
        if (_typeIdVisible)
        {
            obj1 = jsonparser;
            if (jsonparser.getCurrentToken() == JsonToken.START_OBJECT)
            {
                obj1 = new TokenBuffer(null, false);
                ((TokenBuffer) (obj1)).writeStartObject();
                ((TokenBuffer) (obj1)).writeFieldName(_typePropertyName);
                ((TokenBuffer) (obj1)).writeString(s);
                obj1 = JsonParserSequence.createFlattened(((TokenBuffer) (obj1)).asParser(jsonparser), jsonparser);
                ((JsonParser) (obj1)).nextToken();
            }
        }
        obj2 = ((JsonDeserializer) (obj2)).deserialize(((JsonParser) (obj1)), deserializationcontext);
        jsonparser = ((JsonParser) (obj2));
        if (flag)
        {
            jsonparser = ((JsonParser) (obj2));
            if (((JsonParser) (obj1)).nextToken() != JsonToken.END_ARRAY)
            {
                throw deserializationcontext.wrongTokenException(((JsonParser) (obj1)), JsonToken.END_ARRAY, "expected closing END_ARRAY after type information and deserialized value");
            }
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected final String _locateTypeId(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        if (!jsonparser.isExpectedStartArrayToken())
        {
            if (_defaultImpl != null)
            {
                return _idResolver.idFromBaseType();
            } else
            {
                throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.START_ARRAY, (new StringBuilder("need JSON Array to contain As.WRAPPER_ARRAY type information for class ")).append(baseTypeName()).toString());
            }
        }
        if (jsonparser.nextToken() == JsonToken.VALUE_STRING)
        {
            deserializationcontext = jsonparser.getText();
            jsonparser.nextToken();
            return deserializationcontext;
        }
        if (_defaultImpl != null)
        {
            return _idResolver.idFromBaseType();
        } else
        {
            throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.VALUE_STRING, (new StringBuilder("need JSON String that contains type id (for subtype of ")).append(baseTypeName()).append(")").toString());
        }
    }

    public Object deserializeTypedFromAny(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return _deserialize(jsonparser, deserializationcontext);
    }

    public Object deserializeTypedFromArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return _deserialize(jsonparser, deserializationcontext);
    }

    public Object deserializeTypedFromObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return _deserialize(jsonparser, deserializationcontext);
    }

    public Object deserializeTypedFromScalar(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return _deserialize(jsonparser, deserializationcontext);
    }

    public TypeDeserializer forProperty(BeanProperty beanproperty)
    {
        if (beanproperty == _property)
        {
            return this;
        } else
        {
            return new AsArrayTypeDeserializer(this, beanproperty);
        }
    }

    public com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion()
    {
        return com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY;
    }
}

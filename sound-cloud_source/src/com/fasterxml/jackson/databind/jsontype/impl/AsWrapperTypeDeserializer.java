// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.databind.jsontype.impl:
//            TypeDeserializerBase

public class AsWrapperTypeDeserializer extends TypeDeserializerBase
    implements Serializable
{

    public AsWrapperTypeDeserializer(JavaType javatype, TypeIdResolver typeidresolver, String s, boolean flag, Class class1)
    {
        super(javatype, typeidresolver, s, flag, null);
    }

    protected AsWrapperTypeDeserializer(AsWrapperTypeDeserializer aswrappertypedeserializer, BeanProperty beanproperty)
    {
        super(aswrappertypedeserializer, beanproperty);
    }

    private final Object _deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (jsonparser.getCurrentToken() != JsonToken.START_OBJECT)
        {
            throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.START_OBJECT, (new StringBuilder("need JSON Object to contain As.WRAPPER_OBJECT type information for class ")).append(baseTypeName()).toString());
        }
        if (jsonparser.nextToken() != JsonToken.FIELD_NAME)
        {
            throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.FIELD_NAME, (new StringBuilder("need JSON String that contains type id (for subtype of ")).append(baseTypeName()).append(")").toString());
        }
        String s = jsonparser.getText();
        JsonDeserializer jsondeserializer = _findDeserializer(deserializationcontext, s);
        jsonparser.nextToken();
        Object obj = jsonparser;
        if (_typeIdVisible)
        {
            obj = jsonparser;
            if (jsonparser.getCurrentToken() == JsonToken.START_OBJECT)
            {
                obj = new TokenBuffer(null);
                ((TokenBuffer) (obj)).writeStartObject();
                ((TokenBuffer) (obj)).writeFieldName(_typePropertyName);
                ((TokenBuffer) (obj)).writeString(s);
                obj = JsonParserSequence.createFlattened(((TokenBuffer) (obj)).asParser(jsonparser), jsonparser);
                ((JsonParser) (obj)).nextToken();
            }
        }
        jsonparser = ((JsonParser) (jsondeserializer.deserialize(((JsonParser) (obj)), deserializationcontext)));
        if (((JsonParser) (obj)).nextToken() != JsonToken.END_OBJECT)
        {
            throw deserializationcontext.wrongTokenException(((JsonParser) (obj)), JsonToken.END_OBJECT, "expected closing END_OBJECT after type information and deserialized value");
        } else
        {
            return jsonparser;
        }
    }

    public Object deserializeTypedFromAny(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return _deserialize(jsonparser, deserializationcontext);
    }

    public Object deserializeTypedFromArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return _deserialize(jsonparser, deserializationcontext);
    }

    public Object deserializeTypedFromObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return _deserialize(jsonparser, deserializationcontext);
    }

    public Object deserializeTypedFromScalar(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
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
            return new AsWrapperTypeDeserializer(this, beanproperty);
        }
    }

    public com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion()
    {
        return com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT;
    }
}

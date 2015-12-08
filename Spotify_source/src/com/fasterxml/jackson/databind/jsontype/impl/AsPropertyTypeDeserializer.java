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

// Referenced classes of package com.fasterxml.jackson.databind.jsontype.impl:
//            AsArrayTypeDeserializer

public class AsPropertyTypeDeserializer extends AsArrayTypeDeserializer
{

    private static final long serialVersionUID = 1L;

    public AsPropertyTypeDeserializer(JavaType javatype, TypeIdResolver typeidresolver, String s, boolean flag, Class class1)
    {
        super(javatype, typeidresolver, s, flag, class1);
    }

    public AsPropertyTypeDeserializer(AsPropertyTypeDeserializer aspropertytypedeserializer, BeanProperty beanproperty)
    {
        super(aspropertytypedeserializer, beanproperty);
    }

    protected final Object _deserializeTypedForId(JsonParser jsonparser, DeserializationContext deserializationcontext, TokenBuffer tokenbuffer)
    {
        String s = jsonparser.getText();
        JsonDeserializer jsondeserializer = _findDeserializer(deserializationcontext, s);
        TokenBuffer tokenbuffer1 = tokenbuffer;
        if (_typeIdVisible)
        {
            tokenbuffer1 = tokenbuffer;
            if (tokenbuffer == null)
            {
                tokenbuffer1 = new TokenBuffer(null, false);
            }
            tokenbuffer1.writeFieldName(jsonparser.getCurrentName());
            tokenbuffer1.writeString(s);
        }
        tokenbuffer = jsonparser;
        if (tokenbuffer1 != null)
        {
            tokenbuffer = JsonParserSequence.createFlattened(tokenbuffer1.asParser(jsonparser), jsonparser);
        }
        tokenbuffer.nextToken();
        return jsondeserializer.deserialize(tokenbuffer, deserializationcontext);
    }

    protected Object _deserializeTypedUsingDefaultImpl(JsonParser jsonparser, DeserializationContext deserializationcontext, TokenBuffer tokenbuffer)
    {
        JsonDeserializer jsondeserializer = _findDefaultImplDeserializer(deserializationcontext);
        if (jsondeserializer != null)
        {
            JsonParser jsonparser1 = jsonparser;
            if (tokenbuffer != null)
            {
                tokenbuffer.writeEndObject();
                jsonparser1 = tokenbuffer.asParser(jsonparser);
                jsonparser1.nextToken();
            }
            tokenbuffer = ((TokenBuffer) (jsondeserializer.deserialize(jsonparser1, deserializationcontext)));
        } else
        {
            Object obj = TypeDeserializer.deserializeIfNatural(jsonparser, deserializationcontext, _baseType);
            tokenbuffer = ((TokenBuffer) (obj));
            if (obj == null)
            {
                if (jsonparser.getCurrentToken() == JsonToken.START_ARRAY)
                {
                    return super.deserializeTypedFromAny(jsonparser, deserializationcontext);
                } else
                {
                    throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.FIELD_NAME, (new StringBuilder("missing property '")).append(_typePropertyName).append("' that is to contain type id  (for class ").append(baseTypeName()).append(")").toString());
                }
            }
        }
        return tokenbuffer;
    }

    public Object deserializeTypedFromAny(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        if (jsonparser.getCurrentToken() == JsonToken.START_ARRAY)
        {
            return super.deserializeTypedFromArray(jsonparser, deserializationcontext);
        } else
        {
            return deserializeTypedFromObject(jsonparser, deserializationcontext);
        }
    }

    public Object deserializeTypedFromObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        if (jsonparser.canReadTypeId())
        {
            Object obj = jsonparser.getTypeId();
            if (obj != null)
            {
                return _deserializeWithNativeTypeId(jsonparser, deserializationcontext, obj);
            }
        }
        Object obj2 = jsonparser.getCurrentToken();
        Object obj1;
        Object obj3;
        if (obj2 == JsonToken.START_OBJECT)
        {
            obj1 = jsonparser.nextToken();
        } else
        {
            if (obj2 == JsonToken.START_ARRAY)
            {
                return _deserializeTypedUsingDefaultImpl(jsonparser, deserializationcontext, null);
            }
            obj1 = obj2;
            if (obj2 != JsonToken.FIELD_NAME)
            {
                return _deserializeTypedUsingDefaultImpl(jsonparser, deserializationcontext, null);
            }
        }
        obj3 = null;
        obj2 = obj1;
        obj1 = obj3;
        Object obj4;
        for (; obj2 == JsonToken.FIELD_NAME; obj2 = obj4)
        {
            obj4 = jsonparser.getCurrentName();
            jsonparser.nextToken();
            if (_typePropertyName.equals(obj4))
            {
                return _deserializeTypedForId(jsonparser, deserializationcontext, ((TokenBuffer) (obj1)));
            }
            obj2 = obj1;
            if (obj1 == null)
            {
                obj2 = new TokenBuffer(null, false);
            }
            ((TokenBuffer) (obj2)).writeFieldName(((String) (obj4)));
            ((TokenBuffer) (obj2)).copyCurrentStructure(jsonparser);
            obj4 = jsonparser.nextToken();
            obj1 = obj2;
        }

        return _deserializeTypedUsingDefaultImpl(jsonparser, deserializationcontext, ((TokenBuffer) (obj1)));
    }

    public TypeDeserializer forProperty(BeanProperty beanproperty)
    {
        if (beanproperty == _property)
        {
            return this;
        } else
        {
            return new AsPropertyTypeDeserializer(this, beanproperty);
        }
    }

    public com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion()
    {
        return com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
    }
}

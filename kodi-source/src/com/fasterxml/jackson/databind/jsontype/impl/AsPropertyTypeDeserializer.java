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
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.jsontype.impl:
//            AsArrayTypeDeserializer

public class AsPropertyTypeDeserializer extends AsArrayTypeDeserializer
{

    protected final com.fasterxml.jackson.annotation.JsonTypeInfo.As _inclusion;

    public AsPropertyTypeDeserializer(JavaType javatype, TypeIdResolver typeidresolver, String s, boolean flag, Class class1, com.fasterxml.jackson.annotation.JsonTypeInfo.As as)
    {
        super(javatype, typeidresolver, s, flag, class1);
        _inclusion = as;
    }

    public AsPropertyTypeDeserializer(AsPropertyTypeDeserializer aspropertytypedeserializer, BeanProperty beanproperty)
    {
        super(aspropertytypedeserializer, beanproperty);
        _inclusion = aspropertytypedeserializer._inclusion;
    }

    protected final Object _deserializeTypedForId(JsonParser jsonparser, DeserializationContext deserializationcontext, TokenBuffer tokenbuffer)
        throws IOException
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
        throws IOException
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
                    throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.FIELD_NAME, (new StringBuilder()).append("missing property '").append(_typePropertyName).append("' that is to contain type id  (for class ").append(baseTypeName()).append(")").toString());
                }
            }
        }
        return tokenbuffer;
    }

    public Object deserializeTypedFromAny(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
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
        throws IOException
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
        obj2 = null;
        for (Object obj3 = obj1; obj3 == JsonToken.FIELD_NAME;)
        {
            obj3 = jsonparser.getCurrentName();
            jsonparser.nextToken();
            if (_typePropertyName.equals(obj3))
            {
                return _deserializeTypedForId(jsonparser, deserializationcontext, ((TokenBuffer) (obj2)));
            }
            obj1 = obj2;
            if (obj2 == null)
            {
                obj1 = new TokenBuffer(null, false);
            }
            ((TokenBuffer) (obj1)).writeFieldName(((String) (obj3)));
            ((TokenBuffer) (obj1)).copyCurrentStructure(jsonparser);
            obj3 = jsonparser.nextToken();
            obj2 = obj1;
        }

        return _deserializeTypedUsingDefaultImpl(jsonparser, deserializationcontext, ((TokenBuffer) (obj2)));
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
        return _inclusion;
    }
}

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

    public AsPropertyTypeDeserializer(JavaType javatype, TypeIdResolver typeidresolver, String s, boolean flag, Class class1)
    {
        super(javatype, typeidresolver, s, flag, class1);
    }

    public AsPropertyTypeDeserializer(AsPropertyTypeDeserializer aspropertytypedeserializer, BeanProperty beanproperty)
    {
        super(aspropertytypedeserializer, beanproperty);
    }

    protected Object _deserializeIfNatural(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        _cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[jsonparser.getCurrentToken().ordinal()];
        JVM INSTR tableswitch 1 5: default 44
    //                   1 46
    //                   2 66
    //                   3 89
    //                   4 112
    //                   5 131;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return null;
_L2:
        if (_baseType.getRawClass().isAssignableFrom(java/lang/String))
        {
            return jsonparser.getText();
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (_baseType.getRawClass().isAssignableFrom(java/lang/Integer))
        {
            return Integer.valueOf(jsonparser.getIntValue());
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (_baseType.getRawClass().isAssignableFrom(java/lang/Double))
        {
            return Double.valueOf(jsonparser.getDoubleValue());
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (_baseType.getRawClass().isAssignableFrom(java/lang/Boolean))
        {
            return Boolean.TRUE;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (_baseType.getRawClass().isAssignableFrom(java/lang/Boolean))
        {
            return Boolean.FALSE;
        }
        if (true) goto _L1; else goto _L7
_L7:
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
                tokenbuffer1 = new TokenBuffer(null);
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
        if (_defaultImpl != null)
        {
            JsonDeserializer jsondeserializer = _findDefaultImplDeserializer(deserializationcontext);
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
            Object obj = _deserializeIfNatural(jsonparser, deserializationcontext);
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
        Object obj1 = jsonparser.getCurrentToken();
        Object obj;
        Object obj2;
        if (obj1 == JsonToken.START_OBJECT)
        {
            obj = jsonparser.nextToken();
        } else
        {
            if (obj1 == JsonToken.START_ARRAY)
            {
                return _deserializeTypedUsingDefaultImpl(jsonparser, deserializationcontext, null);
            }
            obj = obj1;
            if (obj1 != JsonToken.FIELD_NAME)
            {
                return _deserializeTypedUsingDefaultImpl(jsonparser, deserializationcontext, null);
            }
        }
        obj2 = null;
        obj1 = obj;
        obj = obj2;
        Object obj3;
        for (; obj1 == JsonToken.FIELD_NAME; obj1 = obj3)
        {
            obj3 = jsonparser.getCurrentName();
            jsonparser.nextToken();
            if (_typePropertyName.equals(obj3))
            {
                return _deserializeTypedForId(jsonparser, deserializationcontext, ((TokenBuffer) (obj)));
            }
            obj1 = obj;
            if (obj == null)
            {
                obj1 = new TokenBuffer(null);
            }
            ((TokenBuffer) (obj1)).writeFieldName(((String) (obj3)));
            ((TokenBuffer) (obj1)).copyCurrentStructure(jsonparser);
            obj3 = jsonparser.nextToken();
            obj = obj1;
        }

        return _deserializeTypedUsingDefaultImpl(jsonparser, deserializationcontext, ((TokenBuffer) (obj)));
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

    private class _cls1
    {

        static final int $SwitchMap$com$fasterxml$jackson$core$JsonToken[];

        static 
        {
            $SwitchMap$com$fasterxml$jackson$core$JsonToken = new int[JsonToken.values().length];
            try
            {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}

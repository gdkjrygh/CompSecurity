// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.lang.reflect.Array;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            ContainerDeserializerBase

public class ObjectArrayDeserializer extends ContainerDeserializerBase
    implements ContextualDeserializer
{

    protected final ArrayType _arrayType;
    protected final Class _elementClass;
    protected JsonDeserializer _elementDeserializer;
    protected final TypeDeserializer _elementTypeDeserializer;
    protected final boolean _untyped;

    public ObjectArrayDeserializer(ArrayType arraytype, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer)
    {
        super([Ljava/lang/Object;);
        _arrayType = arraytype;
        _elementClass = arraytype.getContentType().getRawClass();
        boolean flag;
        if (_elementClass == java/lang/Object)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _untyped = flag;
        _elementDeserializer = jsondeserializer;
        _elementTypeDeserializer = typedeserializer;
    }

    private final Object[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        if (jsonparser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().length() == 0)
        {
            return null;
        }
        if (!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
        {
            if (jsonparser.getCurrentToken() == JsonToken.VALUE_STRING && _elementClass == java/lang/Byte)
            {
                return deserializeFromBase64(jsonparser, deserializationcontext);
            } else
            {
                throw deserializationcontext.mappingException(_arrayType.getRawClass());
            }
        }
        if (jsonparser.getCurrentToken() == JsonToken.VALUE_NULL)
        {
            jsonparser = null;
        } else
        if (_elementTypeDeserializer == null)
        {
            jsonparser = ((JsonParser) (_elementDeserializer.deserialize(jsonparser, deserializationcontext)));
        } else
        {
            jsonparser = ((JsonParser) (_elementDeserializer.deserializeWithType(jsonparser, deserializationcontext, _elementTypeDeserializer)));
        }
        if (_untyped)
        {
            deserializationcontext = ((DeserializationContext) (new Object[1]));
        } else
        {
            deserializationcontext = ((DeserializationContext) ((Object[])(Object[])Array.newInstance(_elementClass, 1)));
        }
        deserializationcontext[0] = jsonparser;
        return deserializationcontext;
    }

    public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
    {
        Object obj1 = _elementDeserializer;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        Object obj = deserializationcontext.findContextualValueDeserializer(_arrayType.getContentType(), beanproperty);
_L4:
        obj1 = _elementTypeDeserializer;
        deserializationcontext = ((DeserializationContext) (obj1));
        if (obj1 != null)
        {
            deserializationcontext = ((TypeDeserializer) (obj1)).forProperty(beanproperty);
        }
        return withDeserializer(deserializationcontext, ((JsonDeserializer) (obj)));
_L2:
        obj = obj1;
        if (obj1 instanceof ContextualDeserializer)
        {
            obj = ((ContextualDeserializer)obj1).createContextual(deserializationcontext, beanproperty);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return ((Object) (deserialize(jsonparser, deserializationcontext)));
    }

    public Object[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        if (!jsonparser.isExpectedStartArrayToken())
        {
            return handleNonArray(jsonparser, deserializationcontext);
        }
        ObjectBuffer objectbuffer = deserializationcontext.leaseObjectBuffer();
        Object aobj[] = objectbuffer.resetAndStart();
        TypeDeserializer typedeserializer = _elementTypeDeserializer;
        int i = 0;
        do
        {
            Object obj = jsonparser.nextToken();
            if (obj == JsonToken.END_ARRAY)
            {
                break;
            }
            int j;
            if (obj == JsonToken.VALUE_NULL)
            {
                obj = null;
            } else
            if (typedeserializer == null)
            {
                obj = _elementDeserializer.deserialize(jsonparser, deserializationcontext);
            } else
            {
                obj = _elementDeserializer.deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
            }
            if (i >= aobj.length)
            {
                aobj = objectbuffer.appendCompletedChunk(aobj);
                i = 0;
            }
            j = i + 1;
            aobj[i] = obj;
            i = j;
        } while (true);
        if (_untyped)
        {
            jsonparser = ((JsonParser) (objectbuffer.completeAndClearBuffer(aobj, i)));
        } else
        {
            jsonparser = ((JsonParser) (objectbuffer.completeAndClearBuffer(aobj, i, _elementClass)));
        }
        deserializationcontext.returnObjectBuffer(objectbuffer);
        return jsonparser;
    }

    protected Byte[] deserializeFromBase64(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        jsonparser = jsonparser.getBinaryValue(deserializationcontext.getBase64Variant());
        deserializationcontext = new Byte[jsonparser.length];
        int i = 0;
        for (int j = jsonparser.length; i < j; i++)
        {
            deserializationcontext[i] = Byte.valueOf(jsonparser[i]);
        }

        return deserializationcontext;
    }

    public volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
    {
        return ((Object) (deserializeWithType(jsonparser, deserializationcontext, typedeserializer)));
    }

    public Object[] deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
    {
        return (Object[])(Object[])typedeserializer.deserializeTypedFromArray(jsonparser, deserializationcontext);
    }

    public JsonDeserializer getContentDeserializer()
    {
        return _elementDeserializer;
    }

    public JavaType getContentType()
    {
        return _arrayType.getContentType();
    }

    public ObjectArrayDeserializer withDeserializer(TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
    {
        if (jsondeserializer == _elementDeserializer && typedeserializer == _elementTypeDeserializer)
        {
            return this;
        } else
        {
            return new ObjectArrayDeserializer(_arrayType, jsondeserializer, typedeserializer);
        }
    }
}

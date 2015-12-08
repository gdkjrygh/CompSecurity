// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//            BeanDeserializerBuilder, SettableBeanProperty

public class AbstractDeserializer extends JsonDeserializer
    implements Serializable
{

    protected final boolean _acceptBoolean;
    protected final boolean _acceptDouble;
    protected final boolean _acceptInt;
    protected final boolean _acceptString;
    protected final Map _backRefProperties;
    protected final JavaType _baseType;
    protected final ObjectIdReader _objectIdReader;

    public AbstractDeserializer(BeanDeserializerBuilder beandeserializerbuilder, BeanDescription beandescription, Map map)
    {
label0:
        {
            boolean flag1 = false;
            super();
            _baseType = beandescription.getType();
            _objectIdReader = beandeserializerbuilder.getObjectIdReader();
            _backRefProperties = map;
            beandeserializerbuilder = _baseType.getRawClass();
            _acceptString = beandeserializerbuilder.isAssignableFrom(java/lang/String);
            boolean flag;
            if (beandeserializerbuilder == Boolean.TYPE || beandeserializerbuilder.isAssignableFrom(java/lang/Boolean))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            _acceptBoolean = flag;
            if (beandeserializerbuilder == Integer.TYPE || beandeserializerbuilder.isAssignableFrom(java/lang/Integer))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            _acceptInt = flag;
            if (beandeserializerbuilder != Double.TYPE)
            {
                flag = flag1;
                if (!beandeserializerbuilder.isAssignableFrom(java/lang/Double))
                {
                    break label0;
                }
            }
            flag = true;
        }
        _acceptDouble = flag;
    }

    protected Object _deserializeFromObjectId(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        jsonparser = ((JsonParser) (_objectIdReader.deserializer.deserialize(jsonparser, deserializationcontext)));
        deserializationcontext = ((DeserializationContext) (deserializationcontext.findObjectId(jsonparser, _objectIdReader.generator).item));
        if (deserializationcontext == null)
        {
            throw new IllegalStateException((new StringBuilder("Could not resolve Object Id [")).append(jsonparser).append("] -- unresolved forward-reference?").toString());
        } else
        {
            return deserializationcontext;
        }
    }

    protected Object _deserializeIfNatural(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        static class _cls1
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

        _cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[jsonparser.getCurrentToken().ordinal()];
        JVM INSTR tableswitch 1 5: default 44
    //                   1 46
    //                   2 58
    //                   3 73
    //                   4 88
    //                   5 99;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return null;
_L2:
        if (_acceptString)
        {
            return jsonparser.getText();
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (_acceptInt)
        {
            return Integer.valueOf(jsonparser.getIntValue());
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (_acceptDouble)
        {
            return Double.valueOf(jsonparser.getDoubleValue());
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (_acceptBoolean)
        {
            return Boolean.TRUE;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (_acceptBoolean)
        {
            return Boolean.FALSE;
        }
        if (true) goto _L1; else goto _L7
_L7:
    }

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        throw deserializationcontext.instantiationException(_baseType.getRawClass(), "abstract types either need to be mapped to concrete types, have custom deserializer, or be instantiated with additional type information");
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException, JsonProcessingException
    {
        if (_objectIdReader == null) goto _L2; else goto _L1
_L1:
        Object obj = jsonparser.getCurrentToken();
        if (obj == null || !((JsonToken) (obj)).isScalarValue()) goto _L2; else goto _L3
_L3:
        obj = _deserializeFromObjectId(jsonparser, deserializationcontext);
_L5:
        return obj;
_L2:
        Object obj1 = _deserializeIfNatural(jsonparser, deserializationcontext);
        obj = obj1;
        if (obj1 == null)
        {
            return typedeserializer.deserializeTypedFromObject(jsonparser, deserializationcontext);
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public SettableBeanProperty findBackReference(String s)
    {
        if (_backRefProperties == null)
        {
            return null;
        } else
        {
            return (SettableBeanProperty)_backRefProperties.get(s);
        }
    }

    public boolean isCachable()
    {
        return true;
    }
}

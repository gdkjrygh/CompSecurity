// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;

// Referenced classes of package com.fasterxml.jackson.databind.jsontype:
//            TypeIdResolver

public abstract class TypeDeserializer
{

    public TypeDeserializer()
    {
    }

    public static Object deserializeIfNatural(JsonParser jsonparser, DeserializationContext deserializationcontext, JavaType javatype)
    {
        return deserializeIfNatural(jsonparser, deserializationcontext, javatype.getRawClass());
    }

    public static Object deserializeIfNatural(JsonParser jsonparser, DeserializationContext deserializationcontext, Class class1)
    {
        deserializationcontext = jsonparser.getCurrentToken();
        if (deserializationcontext != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        class _cls1
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

        _cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[deserializationcontext.ordinal()];
        JVM INSTR tableswitch 1 5: default 52
    //                   1 54
    //                   2 68
    //                   3 85
    //                   4 102
    //                   5 115;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        continue; /* Loop/switch isn't completed */
_L3:
        return null;
_L4:
        if (!class1.isAssignableFrom(java/lang/String)) goto _L1; else goto _L9
_L9:
        return jsonparser.getText();
_L5:
        if (!class1.isAssignableFrom(java/lang/Integer)) goto _L1; else goto _L10
_L10:
        return Integer.valueOf(jsonparser.getIntValue());
_L6:
        if (!class1.isAssignableFrom(java/lang/Double)) goto _L1; else goto _L11
_L11:
        return Double.valueOf(jsonparser.getDoubleValue());
_L7:
        if (!class1.isAssignableFrom(java/lang/Boolean)) goto _L1; else goto _L12
_L12:
        return Boolean.TRUE;
        if (!class1.isAssignableFrom(java/lang/Boolean)) goto _L1; else goto _L13
_L13:
        return Boolean.FALSE;
    }

    public abstract Object deserializeTypedFromAny(JsonParser jsonparser, DeserializationContext deserializationcontext);

    public abstract Object deserializeTypedFromArray(JsonParser jsonparser, DeserializationContext deserializationcontext);

    public abstract Object deserializeTypedFromObject(JsonParser jsonparser, DeserializationContext deserializationcontext);

    public abstract Object deserializeTypedFromScalar(JsonParser jsonparser, DeserializationContext deserializationcontext);

    public abstract TypeDeserializer forProperty(BeanProperty beanproperty);

    public abstract Class getDefaultImpl();

    public abstract String getPropertyName();

    public abstract TypeIdResolver getTypeIdResolver();

    public abstract com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion();
}

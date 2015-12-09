// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdScalarDeserializer

public class EnumDeserializer extends StdScalarDeserializer
{

    private static final long serialVersionUID = 0xae36ebf01ba084e2L;
    protected final EnumResolver _resolver;

    public EnumDeserializer(EnumResolver enumresolver)
    {
        super(java/lang/Enum);
        _resolver = enumresolver;
    }

    private final Enum _deserializeAltString(JsonParser jsonparser, DeserializationContext deserializationcontext, String s)
    {
        jsonparser = s.trim();
        if (jsonparser.length() != 0) goto _L2; else goto _L1
_L1:
        if (!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) goto _L4; else goto _L3
_L3:
        return null;
_L2:
        char c = jsonparser.charAt(0);
        if (c < '0' || c > '9')
        {
            continue; /* Loop/switch isn't completed */
        }
        int i = Integer.parseInt(jsonparser);
        s = _resolver.getEnum(i);
        if (s != null)
        {
            return s;
        }
        continue; /* Loop/switch isn't completed */
        s;
_L4:
        if (deserializationcontext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) goto _L3; else goto _L5
_L5:
        throw deserializationcontext.weirdStringException(jsonparser, _resolver.getEnumClass(), (new StringBuilder("value not one of declared Enum instance names: ")).append(_resolver.getEnums()).toString());
    }

    private final Enum _deserializeOther(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        if (jsonparser.getCurrentToken() == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
        {
            jsonparser.nextToken();
            Enum enum = deserialize(jsonparser, deserializationcontext);
            if (jsonparser.nextToken() != JsonToken.END_ARRAY)
            {
                throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, (new StringBuilder("Attempted to unwrap single value array for single '")).append(_resolver.getEnumClass().getName()).append("' value but there was more than a single value in the array").toString());
            } else
            {
                return enum;
            }
        } else
        {
            throw deserializationcontext.mappingException(_resolver.getEnumClass());
        }
    }

    public static JsonDeserializer deserializerForCreator(DeserializationConfig deserializationconfig, Class class1, AnnotatedMethod annotatedmethod)
    {
        Object obj = annotatedmethod.getRawParameterType(0);
        if (obj == java/lang/String)
        {
            obj = null;
        } else
        if (obj == Integer.TYPE || obj == java/lang/Integer)
        {
            obj = java/lang/Integer;
        } else
        if (obj == Long.TYPE || obj == java/lang/Long)
        {
            obj = java/lang/Long;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Parameter #0 type for factory method (")).append(annotatedmethod).append(") not suitable, must be java.lang.String or int/Integer/long/Long").toString());
        }
        if (deserializationconfig.canOverrideAccessModifiers())
        {
            ClassUtil.checkAndFixAccess(annotatedmethod.getMember());
        }
        return new FactoryBasedDeserializer(class1, annotatedmethod, ((Class) (obj)));
    }

    public Enum deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        Object obj = jsonparser.getCurrentToken();
        if (obj == JsonToken.VALUE_STRING || obj == JsonToken.FIELD_NAME)
        {
            String s = jsonparser.getText();
            Enum enum = _resolver.findEnum(s);
            obj = enum;
            if (enum == null)
            {
                obj = _deserializeAltString(jsonparser, deserializationcontext, s);
            }
        } else
        if (obj == JsonToken.VALUE_NUMBER_INT)
        {
            if (deserializationcontext.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS))
            {
                throw deserializationcontext.mappingException("Not allowed to deserialize Enum value out of JSON number (disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow)");
            }
            int i = jsonparser.getIntValue();
            jsonparser = _resolver.getEnum(i);
            obj = jsonparser;
            if (jsonparser == null)
            {
                obj = jsonparser;
                if (!deserializationcontext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL))
                {
                    throw deserializationcontext.weirdNumberException(Integer.valueOf(i), _resolver.getEnumClass(), (new StringBuilder("index value outside legal index range [0..")).append(_resolver.lastValidIndex()).append("]").toString());
                }
            }
        } else
        {
            return _deserializeOther(jsonparser, deserializationcontext);
        }
        return ((Enum) (obj));
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public boolean isCachable()
    {
        return true;
    }

    private class FactoryBasedDeserializer extends StdScalarDeserializer
    {

        private static final long serialVersionUID = 0x941930f8f421ec66L;
        protected final Class _enumClass;
        protected final Method _factory;
        protected final Class _inputType;

        public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            if (_inputType == null)
            {
                jsonparser = jsonparser.getText();
            } else
            if (_inputType == java/lang/Integer)
            {
                jsonparser = Integer.valueOf(jsonparser.getValueAsInt());
            } else
            if (_inputType == java/lang/Long)
            {
                jsonparser = Long.valueOf(jsonparser.getValueAsLong());
            } else
            {
                throw deserializationcontext.mappingException(_enumClass);
            }
            try
            {
                jsonparser = ((JsonParser) (_factory.invoke(_enumClass, new Object[] {
                    jsonparser
                })));
            }
            // Misplaced declaration of an exception variable
            catch (JsonParser jsonparser)
            {
                jsonparser = ClassUtil.getRootCause(jsonparser);
                if (jsonparser instanceof IOException)
                {
                    throw (IOException)jsonparser;
                } else
                {
                    throw deserializationcontext.instantiationException(_enumClass, jsonparser);
                }
            }
            return jsonparser;
        }

        public FactoryBasedDeserializer(Class class1, AnnotatedMethod annotatedmethod, Class class2)
        {
            super(java/lang/Enum);
            _enumClass = class1;
            _factory = annotatedmethod.getAnnotated();
            _inputType = class2;
        }
    }

}

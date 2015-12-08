// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.io.IOException;
import java.lang.reflect.Method;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdScalarDeserializer, StdDeserializer

public class EnumDeserializer extends StdScalarDeserializer
{
    protected static class FactoryBasedDeserializer extends StdDeserializer
        implements ContextualDeserializer
    {

        protected final JsonDeserializer _deser;
        protected final Method _factory;
        protected final Class _inputType;

        public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
            throws JsonMappingException
        {
            FactoryBasedDeserializer factorybaseddeserializer = this;
            if (_deser == null)
            {
                factorybaseddeserializer = this;
                if (_inputType != java/lang/String)
                {
                    factorybaseddeserializer = new FactoryBasedDeserializer(this, deserializationcontext.findContextualValueDeserializer(deserializationcontext.constructType(_inputType), beanproperty));
                }
            }
            return factorybaseddeserializer;
        }

        public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException
        {
            if (_deser != null)
            {
                jsonparser = ((JsonParser) (_deser.deserialize(jsonparser, deserializationcontext)));
            } else
            {
                jsonparser = jsonparser.getValueAsString();
            }
            try
            {
                jsonparser = ((JsonParser) (_factory.invoke(_valueClass, new Object[] {
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
                    throw deserializationcontext.instantiationException(_valueClass, jsonparser);
                }
            }
            return jsonparser;
        }

        public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
            throws IOException
        {
            if (_deser == null)
            {
                return deserialize(jsonparser, deserializationcontext);
            } else
            {
                return typedeserializer.deserializeTypedFromAny(jsonparser, deserializationcontext);
            }
        }

        protected FactoryBasedDeserializer(FactoryBasedDeserializer factorybaseddeserializer, JsonDeserializer jsondeserializer)
        {
            super(factorybaseddeserializer._valueClass);
            _inputType = factorybaseddeserializer._inputType;
            _factory = factorybaseddeserializer._factory;
            _deser = jsondeserializer;
        }

        public FactoryBasedDeserializer(Class class1, AnnotatedMethod annotatedmethod, Class class2)
        {
            super(class1);
            _factory = annotatedmethod.getAnnotated();
            _inputType = class2;
            _deser = null;
        }
    }


    protected final EnumResolver _resolver;

    public EnumDeserializer(EnumResolver enumresolver)
    {
        super(java/lang/Enum);
        _resolver = enumresolver;
    }

    private final Enum _deserializeAltString(JsonParser jsonparser, DeserializationContext deserializationcontext, String s)
        throws IOException
    {
        String s1 = s.trim();
        if (s1.length() != 0) goto _L2; else goto _L1
_L1:
        if (!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) goto _L4; else goto _L3
_L3:
        jsonparser = null;
_L5:
        return jsonparser;
_L2:
        char c = s1.charAt(0);
        if (c < '0' || c > '9')
        {
            break; /* Loop/switch isn't completed */
        }
        int i = Integer.parseInt(s1);
        _checkFailOnNumber(deserializationcontext);
        s = _resolver.getEnum(i);
        jsonparser = s;
        if (s != null) goto _L5; else goto _L4
_L4:
        if (!deserializationcontext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL))
        {
            throw deserializationcontext.weirdStringException(s1, _resolver.getEnumClass(), (new StringBuilder()).append("value not one of declared Enum instance names: ").append(_resolver.getEnums()).toString());
        } else
        {
            return null;
        }
        jsonparser;
        if (true) goto _L4; else goto _L6
_L6:
    }

    public static JsonDeserializer deserializerForCreator(DeserializationConfig deserializationconfig, Class class1, AnnotatedMethod annotatedmethod)
    {
        Class class2 = annotatedmethod.getRawParameterType(0);
        if (deserializationconfig.canOverrideAccessModifiers())
        {
            ClassUtil.checkAndFixAccess(annotatedmethod.getMember());
        }
        return new FactoryBasedDeserializer(class1, annotatedmethod, class2);
    }

    protected void _checkFailOnNumber(DeserializationContext deserializationcontext)
        throws IOException
    {
        if (deserializationcontext.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS))
        {
            throw deserializationcontext.mappingException("Not allowed to deserialize Enum value out of JSON number (disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow)");
        } else
        {
            return;
        }
    }

    protected Enum _deserializeOther(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        if (jsonparser.getCurrentToken() == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
        {
            jsonparser.nextToken();
            Enum enum = deserialize(jsonparser, deserializationcontext);
            if (jsonparser.nextToken() != JsonToken.END_ARRAY)
            {
                throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, (new StringBuilder()).append("Attempted to unwrap single value array for single '").append(_resolver.getEnumClass().getName()).append("' value but there was more than a single value in the array").toString());
            } else
            {
                return enum;
            }
        } else
        {
            throw deserializationcontext.mappingException(_resolver.getEnumClass());
        }
    }

    public Enum deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
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
            _checkFailOnNumber(deserializationcontext);
            int i = jsonparser.getIntValue();
            jsonparser = _resolver.getEnum(i);
            obj = jsonparser;
            if (jsonparser == null)
            {
                obj = jsonparser;
                if (!deserializationcontext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL))
                {
                    throw deserializationcontext.weirdNumberException(Integer.valueOf(i), _resolver.getEnumClass(), (new StringBuilder()).append("index value outside legal index range [0..").append(_resolver.lastValidIndex()).append("]").toString());
                }
            }
        } else
        {
            return _deserializeOther(jsonparser, deserializationcontext);
        }
        return ((Enum) (obj));
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public boolean isCachable()
    {
        return true;
    }
}

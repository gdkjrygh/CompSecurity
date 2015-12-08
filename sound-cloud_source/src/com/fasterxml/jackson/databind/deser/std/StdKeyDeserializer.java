// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

public abstract class StdKeyDeserializer extends KeyDeserializer
    implements Serializable
{
    static final class BoolKD extends StdKeyDeserializer
    {

        public final Boolean _parse(String s, DeserializationContext deserializationcontext)
            throws JsonMappingException
        {
            if ("true".equals(s))
            {
                return Boolean.TRUE;
            }
            if ("false".equals(s))
            {
                return Boolean.FALSE;
            } else
            {
                throw deserializationcontext.weirdKeyException(_keyClass, s, "value not 'true' or 'false'");
            }
        }

        public final volatile Object _parse(String s, DeserializationContext deserializationcontext)
            throws Exception
        {
            return _parse(s, deserializationcontext);
        }

        BoolKD()
        {
            super(java/lang/Boolean);
        }
    }

    static final class ByteKD extends StdKeyDeserializer
    {

        public final Byte _parse(String s, DeserializationContext deserializationcontext)
            throws JsonMappingException
        {
            int i = _parseInt(s);
            if (i < -128 || i > 255)
            {
                throw deserializationcontext.weirdKeyException(_keyClass, s, "overflow, value can not be represented as 8-bit value");
            } else
            {
                return Byte.valueOf((byte)i);
            }
        }

        public final volatile Object _parse(String s, DeserializationContext deserializationcontext)
            throws Exception
        {
            return _parse(s, deserializationcontext);
        }

        ByteKD()
        {
            super(java/lang/Byte);
        }
    }

    static final class CalendarKD extends StdKeyDeserializer
    {

        public final Object _parse(String s, DeserializationContext deserializationcontext)
            throws IllegalArgumentException, JsonMappingException
        {
            s = deserializationcontext.parseDate(s);
            if (s == null)
            {
                return null;
            } else
            {
                return deserializationcontext.constructCalendar(s);
            }
        }

        protected CalendarKD()
        {
            super(java/util/Calendar);
        }
    }

    static final class CharKD extends StdKeyDeserializer
    {

        public final Character _parse(String s, DeserializationContext deserializationcontext)
            throws JsonMappingException
        {
            if (s.length() == 1)
            {
                return Character.valueOf(s.charAt(0));
            } else
            {
                throw deserializationcontext.weirdKeyException(_keyClass, s, "can only convert 1-character Strings");
            }
        }

        public final volatile Object _parse(String s, DeserializationContext deserializationcontext)
            throws Exception
        {
            return _parse(s, deserializationcontext);
        }

        CharKD()
        {
            super(java/lang/Character);
        }
    }

    static final class DateKD extends StdKeyDeserializer
    {

        public final Object _parse(String s, DeserializationContext deserializationcontext)
            throws IllegalArgumentException, JsonMappingException
        {
            return deserializationcontext.parseDate(s);
        }

        protected DateKD()
        {
            super(java/util/Date);
        }
    }

    static final class DelegatingKD extends KeyDeserializer
        implements Serializable
    {

        protected final JsonDeserializer _delegate;
        protected final Class _keyClass;

        public final Object deserializeKey(String s, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            Object obj;
            if (s == null)
            {
                obj = null;
            } else
            {
                Object obj1;
                try
                {
                    obj1 = _delegate.deserialize(deserializationcontext.getParser(), deserializationcontext);
                }
                catch (Exception exception)
                {
                    throw deserializationcontext.weirdKeyException(_keyClass, s, (new StringBuilder("not a valid representation: ")).append(exception.getMessage()).toString());
                }
                obj = obj1;
                if (obj1 == null)
                {
                    throw deserializationcontext.weirdKeyException(_keyClass, s, "not a valid representation");
                }
            }
            return obj;
        }

        protected DelegatingKD(Class class1, JsonDeserializer jsondeserializer)
        {
            _keyClass = class1;
            _delegate = jsondeserializer;
        }
    }

    static final class DoubleKD extends StdKeyDeserializer
    {

        public final Double _parse(String s, DeserializationContext deserializationcontext)
            throws JsonMappingException
        {
            return Double.valueOf(_parseDouble(s));
        }

        public final volatile Object _parse(String s, DeserializationContext deserializationcontext)
            throws Exception
        {
            return _parse(s, deserializationcontext);
        }

        DoubleKD()
        {
            super(java/lang/Double);
        }
    }

    static final class EnumKD extends StdKeyDeserializer
    {

        protected final AnnotatedMethod _factory;
        protected final EnumResolver _resolver;

        public final Object _parse(String s, DeserializationContext deserializationcontext)
            throws JsonMappingException
        {
            if (_factory == null) goto _L2; else goto _L1
_L1:
            Object obj = _factory.call1(s);
_L4:
            return obj;
            obj;
            ClassUtil.unwrapAndThrowAsIAE(((Throwable) (obj)));
_L2:
            Enum enum = _resolver.findEnum(s);
            obj = enum;
            if (enum == null)
            {
                obj = enum;
                if (!deserializationcontext.getConfig().isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL))
                {
                    throw deserializationcontext.weirdKeyException(_keyClass, s, "not one of values for Enum class");
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        protected EnumKD(EnumResolver enumresolver, AnnotatedMethod annotatedmethod)
        {
            super(enumresolver.getEnumClass());
            _resolver = enumresolver;
            _factory = annotatedmethod;
        }
    }

    static final class FloatKD extends StdKeyDeserializer
    {

        public final Float _parse(String s, DeserializationContext deserializationcontext)
            throws JsonMappingException
        {
            return Float.valueOf((float)_parseDouble(s));
        }

        public final volatile Object _parse(String s, DeserializationContext deserializationcontext)
            throws Exception
        {
            return _parse(s, deserializationcontext);
        }

        FloatKD()
        {
            super(java/lang/Float);
        }
    }

    static final class IntKD extends StdKeyDeserializer
    {

        public final Integer _parse(String s, DeserializationContext deserializationcontext)
            throws JsonMappingException
        {
            return Integer.valueOf(_parseInt(s));
        }

        public final volatile Object _parse(String s, DeserializationContext deserializationcontext)
            throws Exception
        {
            return _parse(s, deserializationcontext);
        }

        IntKD()
        {
            super(java/lang/Integer);
        }
    }

    static final class LocaleKD extends StdKeyDeserializer
    {

        protected JdkDeserializers.LocaleDeserializer _localeDeserializer;

        protected final volatile Object _parse(String s, DeserializationContext deserializationcontext)
            throws Exception
        {
            return _parse(s, deserializationcontext);
        }

        protected final Locale _parse(String s, DeserializationContext deserializationcontext)
            throws JsonMappingException
        {
            Locale locale;
            try
            {
                locale = _localeDeserializer._deserialize(s, deserializationcontext);
            }
            catch (IOException ioexception)
            {
                throw deserializationcontext.weirdKeyException(_keyClass, s, "unable to parse key as locale");
            }
            return locale;
        }

        LocaleKD()
        {
            super(java/util/Locale);
            _localeDeserializer = new JdkDeserializers.LocaleDeserializer();
        }
    }

    static final class LongKD extends StdKeyDeserializer
    {

        public final Long _parse(String s, DeserializationContext deserializationcontext)
            throws JsonMappingException
        {
            return Long.valueOf(_parseLong(s));
        }

        public final volatile Object _parse(String s, DeserializationContext deserializationcontext)
            throws Exception
        {
            return _parse(s, deserializationcontext);
        }

        LongKD()
        {
            super(java/lang/Long);
        }
    }

    static final class ShortKD extends StdKeyDeserializer
    {

        public final volatile Object _parse(String s, DeserializationContext deserializationcontext)
            throws Exception
        {
            return _parse(s, deserializationcontext);
        }

        public final Short _parse(String s, DeserializationContext deserializationcontext)
            throws JsonMappingException
        {
            int i = _parseInt(s);
            if (i < -32768 || i > 32767)
            {
                throw deserializationcontext.weirdKeyException(_keyClass, s, "overflow, value can not be represented as 16-bit value");
            } else
            {
                return Short.valueOf((short)i);
            }
        }

        ShortKD()
        {
            super(java/lang/Integer);
        }
    }

    static final class StringCtorKeyDeserializer extends StdKeyDeserializer
    {

        protected final Constructor _ctor;

        public final Object _parse(String s, DeserializationContext deserializationcontext)
            throws Exception
        {
            return _ctor.newInstance(new Object[] {
                s
            });
        }

        public StringCtorKeyDeserializer(Constructor constructor)
        {
            super(constructor.getDeclaringClass());
            _ctor = constructor;
        }
    }

    static final class StringFactoryKeyDeserializer extends StdKeyDeserializer
    {

        final Method _factoryMethod;

        public final Object _parse(String s, DeserializationContext deserializationcontext)
            throws Exception
        {
            return _factoryMethod.invoke(null, new Object[] {
                s
            });
        }

        public StringFactoryKeyDeserializer(Method method)
        {
            super(method.getDeclaringClass());
            _factoryMethod = method;
        }
    }

    static final class StringKD extends StdKeyDeserializer
    {

        private static final StringKD sObject = new StringKD(java/lang/Object);
        private static final StringKD sString = new StringKD(java/lang/String);

        public static StringKD forType(Class class1)
        {
            if (class1 == java/lang/String)
            {
                return sString;
            }
            if (class1 == java/lang/Object)
            {
                return sObject;
            } else
            {
                return new StringKD(class1);
            }
        }

        public final volatile Object _parse(String s, DeserializationContext deserializationcontext)
            throws Exception
        {
            return _parse(s, deserializationcontext);
        }

        public final String _parse(String s, DeserializationContext deserializationcontext)
            throws JsonMappingException
        {
            return s;
        }


        private StringKD(Class class1)
        {
            super(class1);
        }
    }

    static final class UuidKD extends StdKeyDeserializer
    {

        public final Object _parse(String s, DeserializationContext deserializationcontext)
            throws IllegalArgumentException, JsonMappingException
        {
            return UUID.fromString(s);
        }

        protected UuidKD()
        {
            super(java/util/UUID);
        }
    }


    protected final Class _keyClass;

    protected StdKeyDeserializer(Class class1)
    {
        _keyClass = class1;
    }

    protected abstract Object _parse(String s, DeserializationContext deserializationcontext)
        throws Exception;

    protected double _parseDouble(String s)
        throws IllegalArgumentException
    {
        return NumberInput.parseDouble(s);
    }

    protected int _parseInt(String s)
        throws IllegalArgumentException
    {
        return Integer.parseInt(s);
    }

    protected long _parseLong(String s)
        throws IllegalArgumentException
    {
        return Long.parseLong(s);
    }

    public final Object deserializeKey(String s, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (s != null)
        {
            Object obj;
            try
            {
                obj = _parse(s, deserializationcontext);
            }
            catch (Exception exception)
            {
                throw deserializationcontext.weirdKeyException(_keyClass, s, (new StringBuilder("not a valid representation: ")).append(exception.getMessage()).toString());
            }
            if (obj != null)
            {
                return obj;
            }
            if (!_keyClass.isEnum() || !deserializationcontext.getConfig().isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL))
            {
                throw deserializationcontext.weirdKeyException(_keyClass, s, "not a valid representation");
            }
        }
        return null;
    }

    public Class getKeyClass()
    {
        return _keyClass;
    }
}

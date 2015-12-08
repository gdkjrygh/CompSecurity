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
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            FromStringDeserializer

public class StdKeyDeserializer extends KeyDeserializer
    implements Serializable
{
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
                    throw deserializationcontext.weirdKeyException(_keyClass, s, (new StringBuilder()).append("not a valid representation: ").append(exception.getMessage()).toString());
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

    static final class EnumKD extends StdKeyDeserializer
    {

        protected final AnnotatedMethod _factory;
        protected final EnumResolver _resolver;

        public Object _parse(String s, DeserializationContext deserializationcontext)
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
            super(-1, enumresolver.getEnumClass());
            _resolver = enumresolver;
            _factory = annotatedmethod;
        }
    }

    static final class StringCtorKeyDeserializer extends StdKeyDeserializer
    {

        protected final Constructor _ctor;

        public Object _parse(String s, DeserializationContext deserializationcontext)
            throws Exception
        {
            return _ctor.newInstance(new Object[] {
                s
            });
        }

        public StringCtorKeyDeserializer(Constructor constructor)
        {
            super(-1, constructor.getDeclaringClass());
            _ctor = constructor;
        }
    }

    static final class StringFactoryKeyDeserializer extends StdKeyDeserializer
    {

        final Method _factoryMethod;

        public Object _parse(String s, DeserializationContext deserializationcontext)
            throws Exception
        {
            return _factoryMethod.invoke(null, new Object[] {
                s
            });
        }

        public StringFactoryKeyDeserializer(Method method)
        {
            super(-1, method.getDeclaringClass());
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

        public Object deserializeKey(String s, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return s;
        }


        private StringKD(Class class1)
        {
            super(-1, class1);
        }
    }


    protected final FromStringDeserializer _deser;
    protected final Class _keyClass;
    protected final int _kind;

    protected StdKeyDeserializer(int i, Class class1)
    {
        this(i, class1, null);
    }

    protected StdKeyDeserializer(int i, Class class1, FromStringDeserializer fromstringdeserializer)
    {
        _kind = i;
        _keyClass = class1;
        _deser = fromstringdeserializer;
    }

    public static StdKeyDeserializer forType(Class class1)
    {
        if (class1 == java/lang/String || class1 == java/lang/Object)
        {
            return StringKD.forType(class1);
        }
        if (class1 != java/util/UUID) goto _L2; else goto _L1
_L1:
        byte byte0 = 12;
_L4:
        return new StdKeyDeserializer(byte0, class1);
_L2:
        if (class1 == java/lang/Integer)
        {
            byte0 = 5;
            continue; /* Loop/switch isn't completed */
        }
        if (class1 == java/lang/Long)
        {
            byte0 = 6;
            continue; /* Loop/switch isn't completed */
        }
        if (class1 == java/util/Date)
        {
            byte0 = 10;
            continue; /* Loop/switch isn't completed */
        }
        if (class1 == java/util/Calendar)
        {
            byte0 = 11;
            continue; /* Loop/switch isn't completed */
        }
        if (class1 == java/lang/Boolean)
        {
            byte0 = 1;
            continue; /* Loop/switch isn't completed */
        }
        if (class1 == java/lang/Byte)
        {
            byte0 = 2;
            continue; /* Loop/switch isn't completed */
        }
        if (class1 == java/lang/Character)
        {
            byte0 = 4;
            continue; /* Loop/switch isn't completed */
        }
        if (class1 == java/lang/Short)
        {
            byte0 = 3;
            continue; /* Loop/switch isn't completed */
        }
        if (class1 == java/lang/Float)
        {
            byte0 = 7;
            continue; /* Loop/switch isn't completed */
        }
        if (class1 == java/lang/Double)
        {
            byte0 = 8;
            continue; /* Loop/switch isn't completed */
        }
        if (class1 == java/net/URI)
        {
            byte0 = 13;
            continue; /* Loop/switch isn't completed */
        }
        if (class1 == java/net/URL)
        {
            byte0 = 14;
            continue; /* Loop/switch isn't completed */
        }
        if (class1 != java/lang/Class)
        {
            break; /* Loop/switch isn't completed */
        }
        byte0 = 15;
        if (true) goto _L4; else goto _L3
_L3:
        if (class1 == java/util/Locale)
        {
            return new StdKeyDeserializer(9, class1, FromStringDeserializer.findDeserializer(java/util/Locale));
        }
        if (class1 == java/util/Currency)
        {
            return new StdKeyDeserializer(16, class1, FromStringDeserializer.findDeserializer(java/util/Currency));
        } else
        {
            return null;
        }
    }

    protected Object _parse(String s, DeserializationContext deserializationcontext)
        throws Exception
    {
        _kind;
        JVM INSTR tableswitch 1 16: default 84
    //                   1 86
    //                   2 124
    //                   3 165
    //                   4 207
    //                   5 236
    //                   6 245
    //                   7 254
    //                   8 264
    //                   9 273
    //                   10 323
    //                   11 329
    //                   12 345
    //                   13 350
    //                   14 355
    //                   15 364
    //                   16 298;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17
_L1:
        return null;
_L2:
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
_L3:
        int i = _parseInt(s);
        if (i < -128 || i > 255)
        {
            throw deserializationcontext.weirdKeyException(_keyClass, s, "overflow, value can not be represented as 8-bit value");
        } else
        {
            return Byte.valueOf((byte)i);
        }
_L4:
        int j = _parseInt(s);
        if (j < -32768 || j > 32767)
        {
            throw deserializationcontext.weirdKeyException(_keyClass, s, "overflow, value can not be represented as 16-bit value");
        } else
        {
            return Short.valueOf((short)j);
        }
_L5:
        if (s.length() == 1)
        {
            return Character.valueOf(s.charAt(0));
        } else
        {
            throw deserializationcontext.weirdKeyException(_keyClass, s, "can only convert 1-character Strings");
        }
_L6:
        return Integer.valueOf(_parseInt(s));
_L7:
        return Long.valueOf(_parseLong(s));
_L8:
        return Float.valueOf((float)_parseDouble(s));
_L9:
        return Double.valueOf(_parseDouble(s));
_L10:
        Object obj;
        try
        {
            obj = _deser._deserialize(s, deserializationcontext);
        }
        catch (IOException ioexception)
        {
            throw deserializationcontext.weirdKeyException(_keyClass, s, "unable to parse key as locale");
        }
        return obj;
_L17:
        Object obj1;
        try
        {
            obj1 = _deser._deserialize(s, deserializationcontext);
        }
        catch (IOException ioexception1)
        {
            throw deserializationcontext.weirdKeyException(_keyClass, s, "unable to parse key as currency");
        }
        return obj1;
_L11:
        return deserializationcontext.parseDate(s);
_L12:
        s = deserializationcontext.parseDate(s);
        if (s != null)
        {
            return deserializationcontext.constructCalendar(s);
        }
          goto _L1
_L13:
        return UUID.fromString(s);
_L14:
        return URI.create(s);
_L15:
        return new URL(s);
_L16:
        Class class1;
        try
        {
            class1 = deserializationcontext.findClass(s);
        }
        catch (Exception exception)
        {
            throw deserializationcontext.weirdKeyException(_keyClass, s, "unable to parse key as Class");
        }
        return class1;
    }

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

    public Object deserializeKey(String s, DeserializationContext deserializationcontext)
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
                obj1 = _parse(s, deserializationcontext);
            }
            catch (Exception exception)
            {
                throw deserializationcontext.weirdKeyException(_keyClass, s, (new StringBuilder()).append("not a valid representation: ").append(exception.getMessage()).toString());
            }
            obj = obj1;
            if (obj1 == null)
            {
                if (_keyClass.isEnum() && deserializationcontext.getConfig().isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL))
                {
                    return null;
                } else
                {
                    throw deserializationcontext.weirdKeyException(_keyClass, s, "not a valid representation");
                }
            }
        }
        return obj;
    }
}

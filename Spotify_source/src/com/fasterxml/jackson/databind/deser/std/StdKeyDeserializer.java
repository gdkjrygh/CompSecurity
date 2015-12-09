// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.KeyDeserializer;
import java.io.IOException;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            FromStringDeserializer

public class StdKeyDeserializer extends KeyDeserializer
    implements Serializable
{

    private static final long serialVersionUID = 1L;
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
        if (class1 != java/lang/Double)
        {
            break; /* Loop/switch isn't completed */
        }
        byte0 = 8;
        if (true) goto _L4; else goto _L3
_L3:
        if (class1 == java/util/Locale)
        {
            return new StdKeyDeserializer(9, class1, FromStringDeserializer.findDeserializer(java/util/Locale));
        } else
        {
            return null;
        }
    }

    protected Object _parse(String s, DeserializationContext deserializationcontext)
    {
        _kind;
        JVM INSTR tableswitch 1 12: default 68
    //                   1 70
    //                   2 108
    //                   3 149
    //                   4 191
    //                   5 220
    //                   6 229
    //                   7 238
    //                   8 248
    //                   9 257
    //                   10 282
    //                   11 288
    //                   12 304;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
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
    }

    protected double _parseDouble(String s)
    {
        return NumberInput.parseDouble(s);
    }

    protected int _parseInt(String s)
    {
        return Integer.parseInt(s);
    }

    protected long _parseLong(String s)
    {
        return Long.parseLong(s);
    }

    public Object deserializeKey(String s, DeserializationContext deserializationcontext)
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

    private class StringKD extends StdKeyDeserializer
    {

        private static final StringKD sObject = new StringKD(java/lang/Object);
        private static final StringKD sString = new StringKD(java/lang/String);
        private static final long serialVersionUID = 1L;

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

        public final Object deserializeKey(String s, DeserializationContext deserializationcontext)
        {
            return s;
        }


        private StringKD(Class class1)
        {
            super(-1, class1);
        }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.File;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdScalarDeserializer

public abstract class FromStringDeserializer extends StdScalarDeserializer
{

    public FromStringDeserializer(Class class1)
    {
        super(class1);
    }

    public static Std findDeserializer(Class class1)
    {
        int i;
        if (class1 == java/io/File)
        {
            i = 1;
        } else
        if (class1 == java/net/URL)
        {
            i = 2;
        } else
        if (class1 == java/net/URI)
        {
            i = 3;
        } else
        if (class1 == java/lang/Class)
        {
            i = 4;
        } else
        if (class1 == com/fasterxml/jackson/databind/JavaType)
        {
            i = 5;
        } else
        if (class1 == java/util/Currency)
        {
            i = 6;
        } else
        if (class1 == java/util/regex/Pattern)
        {
            i = 7;
        } else
        if (class1 == java/util/Locale)
        {
            i = 8;
        } else
        if (class1 == java/nio/charset/Charset)
        {
            i = 9;
        } else
        if (class1 == java/util/TimeZone)
        {
            i = 10;
        } else
        if (class1 == java/net/InetAddress)
        {
            i = 11;
        } else
        if (class1 == java/net/InetSocketAddress)
        {
            i = 12;
        } else
        {
            return null;
        }
        return new Std(class1, i);
    }

    public static Class[] types()
    {
        return (new Class[] {
            java/io/File, java/net/URL, java/net/URI, java/lang/Class, com/fasterxml/jackson/databind/JavaType, java/util/Currency, java/util/regex/Pattern, java/util/Locale, java/nio/charset/Charset, java/util/TimeZone, 
            java/net/InetAddress, java/net/InetSocketAddress
        });
    }

    public abstract Object _deserialize(String s, DeserializationContext deserializationcontext);

    protected Object _deserializeEmbedded(Object obj, DeserializationContext deserializationcontext)
    {
        throw deserializationcontext.mappingException((new StringBuilder("Don't know how to convert embedded Object of type ")).append(obj.getClass().getName()).append(" into ").append(_valueClass.getName()).toString());
    }

    protected Object _deserializeFromEmptyString()
    {
        return null;
    }

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        if (jsonparser.getCurrentToken() != JsonToken.START_ARRAY || !deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) goto _L2; else goto _L1
_L1:
        jsonparser.nextToken();
        obj = deserialize(jsonparser, deserializationcontext);
        if (jsonparser.nextToken() != JsonToken.END_ARRAY)
        {
            throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, (new StringBuilder("Attempted to unwrap single value array for single '")).append(_valueClass.getName()).append("' value but there was more than a single value in the array").toString());
        }
          goto _L3
_L2:
        String s = jsonparser.getValueAsString();
        if (s == null) goto _L5; else goto _L4
_L4:
        if (s.length() == 0) goto _L7; else goto _L6
_L6:
        s = s.trim();
        if (s.length() != 0) goto _L8; else goto _L7
_L7:
        obj = _deserializeFromEmptyString();
_L3:
        return obj;
_L8:
        try
        {
            obj1 = _deserialize(s, deserializationcontext);
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            obj1 = "not a valid textual representation";
            obj = obj1;
            if (jsonparser != null)
            {
                String s1 = jsonparser.getMessage();
                obj = obj1;
                if (s1 != null)
                {
                    obj = (new StringBuilder()).append("not a valid textual representation").append(", problem: ").append(s1).toString();
                }
            }
            deserializationcontext = deserializationcontext.weirdStringException(s, _valueClass, ((String) (obj)));
            if (jsonparser != null)
            {
                deserializationcontext.initCause(jsonparser);
            }
            throw deserializationcontext;
        }
label0:
        {
            jsonparser = ((JsonParser) (obj));
            if (obj1 != null)
            {
                return obj1;
            }
            break label0;
        }
_L5:
        if (jsonparser.getCurrentToken() == JsonToken.VALUE_EMBEDDED_OBJECT)
        {
            jsonparser = ((JsonParser) (jsonparser.getEmbeddedObject()));
            obj = obj1;
            if (jsonparser != null)
            {
                if (_valueClass.isAssignableFrom(jsonparser.getClass()))
                {
                    return jsonparser;
                } else
                {
                    return _deserializeEmbedded(jsonparser, deserializationcontext);
                }
            }
        } else
        {
            throw deserializationcontext.mappingException(_valueClass);
        }
        if (true) goto _L3; else goto _L9
_L9:
    }

    private class Std extends FromStringDeserializer
    {

        private static final long serialVersionUID = 1L;
        protected final int _kind;

        protected Object _deserialize(String s, DeserializationContext deserializationcontext)
        {
            switch (_kind)
            {
            default:
                throw new IllegalArgumentException();

            case 1: // '\001'
                return new File(s);

            case 2: // '\002'
                return new URL(s);

            case 3: // '\003'
                return URI.create(s);

            case 4: // '\004'
                try
                {
                    s = deserializationcontext.findClass(s);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw deserializationcontext.instantiationException(_valueClass, ClassUtil.getRootCause(s));
                }
                return s;

            case 5: // '\005'
                return deserializationcontext.getTypeFactory().constructFromCanonical(s);

            case 6: // '\006'
                return Currency.getInstance(s);

            case 7: // '\007'
                return Pattern.compile(s);

            case 8: // '\b'
                int i = s.indexOf('_');
                if (i < 0)
                {
                    return new Locale(s);
                }
                deserializationcontext = s.substring(0, i);
                s = s.substring(i + 1);
                i = s.indexOf('_');
                if (i < 0)
                {
                    return new Locale(deserializationcontext, s);
                } else
                {
                    return new Locale(deserializationcontext, s.substring(0, i), s.substring(i + 1));
                }

            case 9: // '\t'
                return Charset.forName(s);

            case 10: // '\n'
                return TimeZone.getTimeZone(s);

            case 11: // '\013'
                return InetAddress.getByName(s);

            case 12: // '\f'
                break;
            }
            if (s.startsWith("["))
            {
                int l = s.lastIndexOf(']');
                if (l == -1)
                {
                    throw new InvalidFormatException("Bracketed IPv6 address must contain closing bracket", s, java/net/InetSocketAddress);
                }
                int j = s.indexOf(':', l);
                if (j >= 0)
                {
                    j = Integer.parseInt(s.substring(j + 1));
                } else
                {
                    j = 0;
                }
                return new InetSocketAddress(s.substring(0, l + 1), j);
            }
            int k = s.indexOf(':');
            if (k >= 0 && s.indexOf(':', k + 1) < 0)
            {
                int i1 = Integer.parseInt(s.substring(k + 1));
                return new InetSocketAddress(s.substring(0, k), i1);
            } else
            {
                return new InetSocketAddress(s, 0);
            }
        }

        protected Object _deserializeFromEmptyString()
        {
            if (_kind == 3)
            {
                return URI.create("");
            } else
            {
                return _deserializeFromEmptyString();
            }
        }

        protected Std(Class class1, int i)
        {
            super(class1);
            _kind = i;
        }
    }

}

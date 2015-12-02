// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.Date;

public abstract class StdDeserializer extends JsonDeserializer
{

    protected final Class _valueClass;

    protected StdDeserializer(JavaType javatype)
    {
        if (javatype == null)
        {
            javatype = null;
        } else
        {
            javatype = javatype.getRawClass();
        }
        _valueClass = javatype;
    }

    protected StdDeserializer(Class class1)
    {
        _valueClass = class1;
    }

    protected static final double parseDouble(String s)
    {
        if ("2.2250738585072012e-308".equals(s))
        {
            return 4.9406564584124654E-324D;
        } else
        {
            return Double.parseDouble(s);
        }
    }

    protected final Boolean _parseBoolean(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        JsonToken jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == JsonToken.VALUE_TRUE)
        {
            return Boolean.TRUE;
        }
        if (jsontoken == JsonToken.VALUE_FALSE)
        {
            return Boolean.FALSE;
        }
        if (jsontoken == JsonToken.VALUE_NUMBER_INT)
        {
            if (jsonparser.getNumberType() == com.fasterxml.jackson.core.JsonParser.NumberType.INT)
            {
                if (jsonparser.getIntValue() == 0)
                {
                    return Boolean.FALSE;
                } else
                {
                    return Boolean.TRUE;
                }
            } else
            {
                return Boolean.valueOf(_parseBooleanFromNumber(jsonparser, deserializationcontext));
            }
        }
        if (jsontoken == JsonToken.VALUE_NULL)
        {
            return (Boolean)getNullValue();
        }
        if (jsontoken == JsonToken.VALUE_STRING)
        {
            jsonparser = jsonparser.getText().trim();
            if ("true".equals(jsonparser))
            {
                return Boolean.TRUE;
            }
            if ("false".equals(jsonparser))
            {
                return Boolean.FALSE;
            }
            if (jsonparser.length() == 0)
            {
                return (Boolean)getEmptyValue();
            } else
            {
                throw deserializationcontext.weirdStringException(_valueClass, "only \"true\" or \"false\" recognized");
            }
        } else
        {
            throw deserializationcontext.mappingException(_valueClass, jsontoken);
        }
    }

    protected final boolean _parseBooleanFromNumber(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        if (jsonparser.getNumberType() == com.fasterxml.jackson.core.JsonParser.NumberType.LONG)
        {
            if (jsonparser.getLongValue() == 0L)
            {
                jsonparser = Boolean.FALSE;
            } else
            {
                jsonparser = Boolean.TRUE;
            }
            return jsonparser.booleanValue();
        }
        jsonparser = jsonparser.getText();
        if ("0.0".equals(jsonparser) || "0".equals(jsonparser))
        {
            return Boolean.FALSE.booleanValue();
        } else
        {
            return Boolean.TRUE.booleanValue();
        }
    }

    protected final boolean _parseBooleanPrimitive(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        JsonToken jsontoken = jsonparser.getCurrentToken();
        if (jsontoken != JsonToken.VALUE_TRUE) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (jsontoken == JsonToken.VALUE_FALSE)
        {
            return false;
        }
        if (jsontoken == JsonToken.VALUE_NULL)
        {
            return false;
        }
        if (jsontoken != JsonToken.VALUE_NUMBER_INT)
        {
            break; /* Loop/switch isn't completed */
        }
        if (jsonparser.getNumberType() == com.fasterxml.jackson.core.JsonParser.NumberType.INT)
        {
            if (jsonparser.getIntValue() == 0)
            {
                return false;
            }
        } else
        {
            return _parseBooleanFromNumber(jsonparser, deserializationcontext);
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (jsontoken == JsonToken.VALUE_STRING)
        {
            jsonparser = jsonparser.getText().trim();
            if (!"true".equals(jsonparser))
            {
                if ("false".equals(jsonparser) || jsonparser.length() == 0)
                {
                    return Boolean.FALSE.booleanValue();
                } else
                {
                    throw deserializationcontext.weirdStringException(_valueClass, "only \"true\" or \"false\" recognized");
                }
            }
        } else
        {
            throw deserializationcontext.mappingException(_valueClass, jsontoken);
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    protected Byte _parseByte(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        JsonToken jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == JsonToken.VALUE_NUMBER_INT || jsontoken == JsonToken.VALUE_NUMBER_FLOAT)
        {
            return Byte.valueOf(jsonparser.getByteValue());
        }
        if (jsontoken == JsonToken.VALUE_STRING)
        {
            jsonparser = jsonparser.getText().trim();
            int i;
            try
            {
                if (jsonparser.length() == 0)
                {
                    return (Byte)getEmptyValue();
                }
                i = NumberInput.parseInt(jsonparser);
            }
            // Misplaced declaration of an exception variable
            catch (JsonParser jsonparser)
            {
                throw deserializationcontext.weirdStringException(_valueClass, "not a valid Byte value");
            }
            if (i < -128 || i > 255)
            {
                throw deserializationcontext.weirdStringException(_valueClass, "overflow, value can not be represented as 8-bit value");
            } else
            {
                return Byte.valueOf((byte)i);
            }
        }
        if (jsontoken == JsonToken.VALUE_NULL)
        {
            return (Byte)getNullValue();
        } else
        {
            throw deserializationcontext.mappingException(_valueClass, jsontoken);
        }
    }

    protected Date _parseDate(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        JsonToken jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == JsonToken.VALUE_NUMBER_INT)
        {
            return new Date(jsonparser.getLongValue());
        }
        if (jsontoken == JsonToken.VALUE_NULL)
        {
            return (Date)getNullValue();
        }
        if (jsontoken == JsonToken.VALUE_STRING)
        {
            try
            {
                jsonparser = jsonparser.getText().trim();
                if (jsonparser.length() == 0)
                {
                    return (Date)getEmptyValue();
                }
                jsonparser = deserializationcontext.parseDate(jsonparser);
            }
            // Misplaced declaration of an exception variable
            catch (JsonParser jsonparser)
            {
                throw deserializationcontext.weirdStringException(_valueClass, (new StringBuilder()).append("not a valid representation (error: ").append(jsonparser.getMessage()).append(")").toString());
            }
            return jsonparser;
        } else
        {
            throw deserializationcontext.mappingException(_valueClass, jsontoken);
        }
    }

    protected final Double _parseDouble(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        JsonToken jsontoken;
        jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == JsonToken.VALUE_NUMBER_INT || jsontoken == JsonToken.VALUE_NUMBER_FLOAT)
        {
            return Double.valueOf(jsonparser.getDoubleValue());
        }
        if (jsontoken != JsonToken.VALUE_STRING) goto _L2; else goto _L1
_L1:
        jsonparser = jsonparser.getText().trim();
        if (jsonparser.length() == 0)
        {
            return (Double)getEmptyValue();
        }
        jsonparser.charAt(0);
        JVM INSTR lookupswitch 3: default 100
    //                   45: 151
    //                   73: 110
    //                   78: 135;
           goto _L3 _L4 _L5 _L6
_L3:
        double d;
        try
        {
            d = parseDouble(jsonparser);
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            throw deserializationcontext.weirdStringException(_valueClass, "not a valid Double value");
        }
        return Double.valueOf(d);
_L5:
        if (!"Infinity".equals(jsonparser) && !"INF".equals(jsonparser)) goto _L3; else goto _L7
_L7:
        return Double.valueOf((1.0D / 0.0D));
_L6:
        if (!"NaN".equals(jsonparser)) goto _L3; else goto _L8
_L8:
        return Double.valueOf((0.0D / 0.0D));
_L4:
        if (!"-Infinity".equals(jsonparser) && !"-INF".equals(jsonparser)) goto _L3; else goto _L9
_L9:
        return Double.valueOf((-1.0D / 0.0D));
_L2:
        if (jsontoken == JsonToken.VALUE_NULL)
        {
            return (Double)getNullValue();
        } else
        {
            throw deserializationcontext.mappingException(_valueClass, jsontoken);
        }
    }

    protected final double _parseDoublePrimitive(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        double d;
        JsonToken jsontoken;
        d = 0.0D;
        jsontoken = jsonparser.getCurrentToken();
        if (jsontoken != JsonToken.VALUE_NUMBER_INT && jsontoken != JsonToken.VALUE_NUMBER_FLOAT) goto _L2; else goto _L1
_L1:
        d = jsonparser.getDoubleValue();
_L4:
        return d;
_L2:
        if (jsontoken != JsonToken.VALUE_STRING)
        {
            continue; /* Loop/switch isn't completed */
        }
        jsonparser = jsonparser.getText().trim();
        if (jsonparser.length() == 0) goto _L4; else goto _L3
_L3:
        jsonparser.charAt(0);
        JVM INSTR lookupswitch 3: default 92
    //                   45: 134
    //                   73: 99
    //                   78: 121;
           goto _L5 _L6 _L7 _L8
_L5:
        double d1;
        try
        {
            d1 = parseDouble(jsonparser);
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            throw deserializationcontext.weirdStringException(_valueClass, "not a valid double value");
        }
        return d1;
_L7:
        if (!"Infinity".equals(jsonparser) && !"INF".equals(jsonparser)) goto _L5; else goto _L9
_L9:
        return (1.0D / 0.0D);
_L8:
        if (!"NaN".equals(jsonparser)) goto _L5; else goto _L10
_L10:
        return (0.0D / 0.0D);
_L6:
        if (!"-Infinity".equals(jsonparser) && !"-INF".equals(jsonparser)) goto _L5; else goto _L11
_L11:
        return (-1.0D / 0.0D);
        if (jsontoken == JsonToken.VALUE_NULL) goto _L4; else goto _L12
_L12:
        throw deserializationcontext.mappingException(_valueClass, jsontoken);
    }

    protected final Float _parseFloat(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        JsonToken jsontoken;
        jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == JsonToken.VALUE_NUMBER_INT || jsontoken == JsonToken.VALUE_NUMBER_FLOAT)
        {
            return Float.valueOf(jsonparser.getFloatValue());
        }
        if (jsontoken != JsonToken.VALUE_STRING) goto _L2; else goto _L1
_L1:
        jsonparser = jsonparser.getText().trim();
        if (jsonparser.length() == 0)
        {
            return (Float)getEmptyValue();
        }
        jsonparser.charAt(0);
        JVM INSTR lookupswitch 3: default 100
    //                   45: 149
    //                   73: 110
    //                   78: 134;
           goto _L3 _L4 _L5 _L6
_L3:
        float f;
        try
        {
            f = Float.parseFloat(jsonparser);
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            throw deserializationcontext.weirdStringException(_valueClass, "not a valid Float value");
        }
        return Float.valueOf(f);
_L5:
        if (!"Infinity".equals(jsonparser) && !"INF".equals(jsonparser)) goto _L3; else goto _L7
_L7:
        return Float.valueOf((1.0F / 0.0F));
_L6:
        if (!"NaN".equals(jsonparser)) goto _L3; else goto _L8
_L8:
        return Float.valueOf((0.0F / 0.0F));
_L4:
        if (!"-Infinity".equals(jsonparser) && !"-INF".equals(jsonparser)) goto _L3; else goto _L9
_L9:
        return Float.valueOf((-1.0F / 0.0F));
_L2:
        if (jsontoken == JsonToken.VALUE_NULL)
        {
            return (Float)getNullValue();
        } else
        {
            throw deserializationcontext.mappingException(_valueClass, jsontoken);
        }
    }

    protected final float _parseFloatPrimitive(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        float f;
        JsonToken jsontoken;
        f = 0.0F;
        jsontoken = jsonparser.getCurrentToken();
        if (jsontoken != JsonToken.VALUE_NUMBER_INT && jsontoken != JsonToken.VALUE_NUMBER_FLOAT) goto _L2; else goto _L1
_L1:
        f = jsonparser.getFloatValue();
_L4:
        return f;
_L2:
        if (jsontoken != JsonToken.VALUE_STRING)
        {
            continue; /* Loop/switch isn't completed */
        }
        jsonparser = jsonparser.getText().trim();
        if (jsonparser.length() == 0) goto _L4; else goto _L3
_L3:
        jsonparser.charAt(0);
        JVM INSTR lookupswitch 3: default 92
    //                   45: 132
    //                   73: 99
    //                   78: 120;
           goto _L5 _L6 _L7 _L8
_L5:
        float f1;
        try
        {
            f1 = Float.parseFloat(jsonparser);
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            throw deserializationcontext.weirdStringException(_valueClass, "not a valid float value");
        }
        return f1;
_L7:
        if (!"Infinity".equals(jsonparser) && !"INF".equals(jsonparser)) goto _L5; else goto _L9
_L9:
        return (1.0F / 0.0F);
_L8:
        if (!"NaN".equals(jsonparser)) goto _L5; else goto _L10
_L10:
        return (0.0F / 0.0F);
_L6:
        if (!"-Infinity".equals(jsonparser) && !"-INF".equals(jsonparser)) goto _L5; else goto _L11
_L11:
        return (-1.0F / 0.0F);
        if (jsontoken == JsonToken.VALUE_NULL) goto _L4; else goto _L12
_L12:
        throw deserializationcontext.mappingException(_valueClass, jsontoken);
    }

    protected final int _parseIntPrimitive(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        JsonToken jsontoken;
        int i;
        i = 0;
        jsontoken = jsonparser.getCurrentToken();
        if (jsontoken != JsonToken.VALUE_NUMBER_INT && jsontoken != JsonToken.VALUE_NUMBER_FLOAT) goto _L2; else goto _L1
_L1:
        i = jsonparser.getIntValue();
_L4:
        return i;
_L2:
        int j;
        long l;
        if (jsontoken != JsonToken.VALUE_STRING)
        {
            continue; /* Loop/switch isn't completed */
        }
        jsonparser = jsonparser.getText().trim();
        try
        {
            j = jsonparser.length();
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            throw deserializationcontext.weirdStringException(_valueClass, "not a valid int value");
        }
        if (j <= 9)
        {
            continue; /* Loop/switch isn't completed */
        }
        l = Long.parseLong(jsonparser);
        if (l >= 0xffffffff80000000L && l <= 0x7fffffffL)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        throw deserializationcontext.weirdStringException(_valueClass, (new StringBuilder()).append("Overflow: numeric value (").append(jsonparser).append(") out of range of int (").append(0x80000000).append(" - ").append(0x7fffffff).append(")").toString());
        return (int)l;
        if (j == 0) goto _L4; else goto _L3
_L3:
        i = NumberInput.parseInt(jsonparser);
        return i;
        if (jsontoken == JsonToken.VALUE_NULL) goto _L4; else goto _L5
_L5:
        throw deserializationcontext.mappingException(_valueClass, jsontoken);
    }

    protected final Integer _parseInteger(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        JsonToken jsontoken;
        int i;
        long l;
        jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == JsonToken.VALUE_NUMBER_INT || jsontoken == JsonToken.VALUE_NUMBER_FLOAT)
        {
            return Integer.valueOf(jsonparser.getIntValue());
        }
        if (jsontoken != JsonToken.VALUE_STRING)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        jsonparser = jsonparser.getText().trim();
        try
        {
            i = jsonparser.length();
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            throw deserializationcontext.weirdStringException(_valueClass, "not a valid Integer value");
        }
        if (i <= 9)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        l = Long.parseLong(jsonparser);
        if (l >= 0xffffffff80000000L && l <= 0x7fffffffL)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        throw deserializationcontext.weirdStringException(_valueClass, (new StringBuilder()).append("Overflow: numeric value (").append(jsonparser).append(") out of range of Integer (").append(0x80000000).append(" - ").append(0x7fffffff).append(")").toString());
        i = (int)l;
        return Integer.valueOf(i);
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        return (Integer)getEmptyValue();
        i = NumberInput.parseInt(jsonparser);
        return Integer.valueOf(i);
        if (jsontoken == JsonToken.VALUE_NULL)
        {
            return (Integer)getNullValue();
        } else
        {
            throw deserializationcontext.mappingException(_valueClass, jsontoken);
        }
    }

    protected final Long _parseLong(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        JsonToken jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == JsonToken.VALUE_NUMBER_INT || jsontoken == JsonToken.VALUE_NUMBER_FLOAT)
        {
            return Long.valueOf(jsonparser.getLongValue());
        }
        if (jsontoken == JsonToken.VALUE_STRING)
        {
            jsonparser = jsonparser.getText().trim();
            if (jsonparser.length() == 0)
            {
                return (Long)getEmptyValue();
            }
            long l;
            try
            {
                l = NumberInput.parseLong(jsonparser);
            }
            // Misplaced declaration of an exception variable
            catch (JsonParser jsonparser)
            {
                throw deserializationcontext.weirdStringException(_valueClass, "not a valid Long value");
            }
            return Long.valueOf(l);
        }
        if (jsontoken == JsonToken.VALUE_NULL)
        {
            return (Long)getNullValue();
        } else
        {
            throw deserializationcontext.mappingException(_valueClass, jsontoken);
        }
    }

    protected final long _parseLongPrimitive(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        JsonToken jsontoken;
        long l;
        l = 0L;
        jsontoken = jsonparser.getCurrentToken();
        if (jsontoken != JsonToken.VALUE_NUMBER_INT && jsontoken != JsonToken.VALUE_NUMBER_FLOAT) goto _L2; else goto _L1
_L1:
        l = jsonparser.getLongValue();
_L4:
        return l;
_L2:
        if (jsontoken != JsonToken.VALUE_STRING)
        {
            continue; /* Loop/switch isn't completed */
        }
        jsonparser = jsonparser.getText().trim();
        if (jsonparser.length() == 0) goto _L4; else goto _L3
_L3:
        long l1;
        try
        {
            l1 = NumberInput.parseLong(jsonparser);
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            throw deserializationcontext.weirdStringException(_valueClass, "not a valid long value");
        }
        return l1;
        if (jsontoken == JsonToken.VALUE_NULL) goto _L4; else goto _L5
_L5:
        throw deserializationcontext.mappingException(_valueClass, jsontoken);
    }

    protected Short _parseShort(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        JsonToken jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == JsonToken.VALUE_NUMBER_INT || jsontoken == JsonToken.VALUE_NUMBER_FLOAT)
        {
            return Short.valueOf(jsonparser.getShortValue());
        }
        if (jsontoken == JsonToken.VALUE_STRING)
        {
            jsonparser = jsonparser.getText().trim();
            int i;
            try
            {
                if (jsonparser.length() == 0)
                {
                    return (Short)getEmptyValue();
                }
                i = NumberInput.parseInt(jsonparser);
            }
            // Misplaced declaration of an exception variable
            catch (JsonParser jsonparser)
            {
                throw deserializationcontext.weirdStringException(_valueClass, "not a valid Short value");
            }
            if (i < -32768 || i > 32767)
            {
                throw deserializationcontext.weirdStringException(_valueClass, "overflow, value can not be represented as 16-bit value");
            } else
            {
                return Short.valueOf((short)i);
            }
        }
        if (jsontoken == JsonToken.VALUE_NULL)
        {
            return (Short)getNullValue();
        } else
        {
            throw deserializationcontext.mappingException(_valueClass, jsontoken);
        }
    }

    protected final short _parseShortPrimitive(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        int i = _parseIntPrimitive(jsonparser, deserializationcontext);
        if (i < -32768 || i > 32767)
        {
            throw deserializationcontext.weirdStringException(_valueClass, "overflow, value can not be represented as 16-bit value");
        } else
        {
            return (short)i;
        }
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
    {
        return typedeserializer.deserializeTypedFromAny(jsonparser, deserializationcontext);
    }

    protected JsonDeserializer findDeserializer(DeserializationContext deserializationcontext, JavaType javatype, BeanProperty beanproperty)
    {
        return deserializationcontext.findContextualValueDeserializer(javatype, beanproperty);
    }

    public Class getValueClass()
    {
        return _valueClass;
    }

    public JavaType getValueType()
    {
        return null;
    }

    protected void handleUnknownProperty(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj, String s)
    {
        Object obj1 = obj;
        if (obj == null)
        {
            obj1 = getValueClass();
        }
        if (deserializationcontext.handleUnknownProperty(jsonparser, this, obj1, s))
        {
            return;
        } else
        {
            deserializationcontext.reportUnknownProperty(obj1, s, this);
            jsonparser.skipChildren();
            return;
        }
    }

    protected boolean isDefaultDeserializer(JsonDeserializer jsondeserializer)
    {
        return jsondeserializer != null && jsondeserializer.getClass().getAnnotation(com/fasterxml/jackson/databind/annotation/JacksonStdImpl) != null;
    }

    protected boolean isDefaultKeyDeserializer(KeyDeserializer keydeserializer)
    {
        return keydeserializer != null && keydeserializer.getClass().getAnnotation(com/fasterxml/jackson/databind/annotation/JacksonStdImpl) != null;
    }
}

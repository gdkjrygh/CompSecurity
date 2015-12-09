// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.Serializable;
import java.util.Date;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdDelegatingDeserializer

public abstract class StdDeserializer extends JsonDeserializer
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public final Class _valueClass;

    public StdDeserializer(JavaType javatype)
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

    public StdDeserializer(Class class1)
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

    protected boolean _hasTextualNull(String s)
    {
        return "null".equals(s);
    }

    protected final boolean _isNaN(String s)
    {
        return "NaN".equals(s);
    }

    protected final boolean _isNegInf(String s)
    {
        return "-Infinity".equals(s) || "-INF".equals(s);
    }

    protected final boolean _isPosInf(String s)
    {
        return "Infinity".equals(s) || "INF".equals(s);
    }

    protected final Boolean _parseBoolean(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        Object obj = jsonparser.getCurrentToken();
        if (obj == JsonToken.VALUE_TRUE)
        {
            obj = Boolean.TRUE;
        } else
        {
            if (obj == JsonToken.VALUE_FALSE)
            {
                return Boolean.FALSE;
            }
            if (obj == JsonToken.VALUE_NUMBER_INT)
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
            if (obj == JsonToken.VALUE_NULL)
            {
                return (Boolean)getNullValue();
            }
            if (obj == JsonToken.VALUE_STRING)
            {
                jsonparser = jsonparser.getText().trim();
                if ("true".equals(jsonparser) || "True".equals(jsonparser))
                {
                    return Boolean.TRUE;
                }
                if ("false".equals(jsonparser) || "False".equals(jsonparser))
                {
                    return Boolean.FALSE;
                }
                if (jsonparser.length() == 0)
                {
                    return (Boolean)getEmptyValue();
                }
                if (_hasTextualNull(jsonparser))
                {
                    return (Boolean)getNullValue();
                } else
                {
                    throw deserializationcontext.weirdStringException(jsonparser, _valueClass, "only \"true\" or \"false\" recognized");
                }
            }
            if (obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
            {
                jsonparser.nextToken();
                obj = _parseBoolean(jsonparser, deserializationcontext);
                if (jsonparser.nextToken() != JsonToken.END_ARRAY)
                {
                    throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'Boolean' value but there was more than a single value in the array");
                }
            } else
            {
                throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
            }
        }
        return ((Boolean) (obj));
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
        JsonToken jsontoken;
        boolean flag1;
        flag1 = true;
        jsontoken = jsonparser.getCurrentToken();
        if (jsontoken != JsonToken.VALUE_TRUE) goto _L2; else goto _L1
_L1:
        boolean flag = flag1;
_L4:
        return flag;
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
            flag = flag1;
            if (jsonparser.getIntValue() == 0)
            {
                return false;
            }
        } else
        {
            return _parseBooleanFromNumber(jsonparser, deserializationcontext);
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (jsontoken != JsonToken.VALUE_STRING)
        {
            break; /* Loop/switch isn't completed */
        }
        jsonparser = jsonparser.getText().trim();
        flag = flag1;
        if (!"true".equals(jsonparser))
        {
            flag = flag1;
            if (!"True".equals(jsonparser))
            {
                if ("false".equals(jsonparser) || "False".equals(jsonparser) || jsonparser.length() == 0)
                {
                    return false;
                }
                if (_hasTextualNull(jsonparser))
                {
                    return false;
                } else
                {
                    throw deserializationcontext.weirdStringException(jsonparser, _valueClass, "only \"true\" or \"false\" recognized");
                }
            }
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (jsontoken == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
        {
            jsonparser.nextToken();
            flag = _parseBooleanPrimitive(jsonparser, deserializationcontext);
            if (jsonparser.nextToken() != JsonToken.END_ARRAY)
            {
                throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'boolean' value but there was more than a single value in the array");
            }
        } else
        {
            throw deserializationcontext.mappingException(_valueClass, jsontoken);
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    protected Byte _parseByte(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        Object obj = jsonparser.getCurrentToken();
        if (obj == JsonToken.VALUE_NUMBER_INT || obj == JsonToken.VALUE_NUMBER_FLOAT)
        {
            obj = Byte.valueOf(jsonparser.getByteValue());
        } else
        {
            if (obj == JsonToken.VALUE_STRING)
            {
                jsonparser = jsonparser.getText().trim();
                if (_hasTextualNull(jsonparser))
                {
                    return (Byte)getNullValue();
                }
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
                catch (Object obj)
                {
                    throw deserializationcontext.weirdStringException(jsonparser, _valueClass, "not a valid Byte value");
                }
                if (i < -128 || i > 255)
                {
                    throw deserializationcontext.weirdStringException(jsonparser, _valueClass, "overflow, value can not be represented as 8-bit value");
                } else
                {
                    return Byte.valueOf((byte)i);
                }
            }
            if (obj == JsonToken.VALUE_NULL)
            {
                return (Byte)getNullValue();
            }
            if (obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
            {
                jsonparser.nextToken();
                obj = _parseByte(jsonparser, deserializationcontext);
                if (jsonparser.nextToken() != JsonToken.END_ARRAY)
                {
                    throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'Byte' value but there was more than a single value in the array");
                }
            } else
            {
                throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
            }
        }
        return ((Byte) (obj));
    }

    public Date _parseDate(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        Object obj = jsonparser.getCurrentToken();
        if (obj != JsonToken.VALUE_NUMBER_INT) goto _L2; else goto _L1
_L1:
        obj = new Date(jsonparser.getLongValue());
_L4:
        return ((Date) (obj));
_L2:
        if (obj == JsonToken.VALUE_NULL)
        {
            return (Date)getNullValue();
        }
        if (obj != JsonToken.VALUE_STRING)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        obj = null;
        try
        {
            jsonparser = jsonparser.getText().trim();
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            throw deserializationcontext.weirdStringException(((String) (obj)), _valueClass, (new StringBuilder("not a valid representation (error: ")).append(jsonparser.getMessage()).append(")").toString());
        }
        obj = jsonparser;
        if (jsonparser.length() != 0)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        obj = jsonparser;
        return (Date)getEmptyValue();
        obj = jsonparser;
        if (!_hasTextualNull(jsonparser))
        {
            break MISSING_BLOCK_LABEL_97;
        }
        obj = jsonparser;
        return (Date)getNullValue();
        obj = jsonparser;
        jsonparser = deserializationcontext.parseDate(jsonparser);
        return jsonparser;
        if (obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
        {
            jsonparser.nextToken();
            obj = _parseDate(jsonparser, deserializationcontext);
            if (jsonparser.nextToken() != JsonToken.END_ARRAY)
            {
                throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'java.util.Date' value but there was more than a single value in the array");
            }
        } else
        {
            throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final Double _parseDouble(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        Object obj = jsonparser.getCurrentToken();
        if (obj != JsonToken.VALUE_NUMBER_INT && obj != JsonToken.VALUE_NUMBER_FLOAT) goto _L2; else goto _L1
_L1:
        obj = Double.valueOf(jsonparser.getDoubleValue());
_L13:
        return ((Double) (obj));
_L2:
        if (obj != JsonToken.VALUE_STRING) goto _L4; else goto _L3
_L3:
        jsonparser = jsonparser.getText().trim();
        if (jsonparser.length() == 0)
        {
            return (Double)getEmptyValue();
        }
        if (_hasTextualNull(jsonparser))
        {
            return (Double)getNullValue();
        }
        jsonparser.charAt(0);
        JVM INSTR lookupswitch 3: default 120
    //                   45: 160
    //                   73: 130
    //                   78: 145;
           goto _L5 _L6 _L7 _L8
_L5:
        double d;
        try
        {
            d = parseDouble(jsonparser);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw deserializationcontext.weirdStringException(jsonparser, _valueClass, "not a valid Double value");
        }
        return Double.valueOf(d);
_L7:
        if (!_isPosInf(jsonparser)) goto _L5; else goto _L9
_L9:
        return Double.valueOf((1.0D / 0.0D));
_L8:
        if (!_isNaN(jsonparser)) goto _L5; else goto _L10
_L10:
        return Double.valueOf((0.0D / 0.0D));
_L6:
        if (!_isNegInf(jsonparser)) goto _L5; else goto _L11
_L11:
        return Double.valueOf((-1.0D / 0.0D));
_L4:
        if (obj == JsonToken.VALUE_NULL)
        {
            return (Double)getNullValue();
        }
        if (obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
        {
            jsonparser.nextToken();
            obj = _parseDouble(jsonparser, deserializationcontext);
            if (jsonparser.nextToken() != JsonToken.END_ARRAY)
            {
                throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'Double' value but there was more than a single value in the array");
            }
        } else
        {
            throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
        }
        if (true) goto _L13; else goto _L12
_L12:
    }

    protected final double _parseDoublePrimitive(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        double d1;
        Object obj;
        d1 = 0.0D;
        obj = jsonparser.getCurrentToken();
        if (obj != JsonToken.VALUE_NUMBER_INT && obj != JsonToken.VALUE_NUMBER_FLOAT) goto _L2; else goto _L1
_L1:
        double d = jsonparser.getDoubleValue();
_L13:
        return d;
_L2:
        if (obj != JsonToken.VALUE_STRING) goto _L4; else goto _L3
_L3:
        jsonparser = jsonparser.getText().trim();
        d = d1;
        if (jsonparser.length() == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        d = d1;
        if (_hasTextualNull(jsonparser))
        {
            continue; /* Loop/switch isn't completed */
        }
        jsonparser.charAt(0);
        JVM INSTR lookupswitch 3: default 108
    //                   45: 139
    //                   73: 115
    //                   78: 127;
           goto _L5 _L6 _L7 _L8
_L5:
        try
        {
            d = parseDouble(jsonparser);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw deserializationcontext.weirdStringException(jsonparser, _valueClass, "not a valid double value");
        }
        return d;
_L7:
        if (!_isPosInf(jsonparser)) goto _L5; else goto _L9
_L9:
        return (1.0D / 0.0D);
_L8:
        if (!_isNaN(jsonparser)) goto _L5; else goto _L10
_L10:
        return (0.0D / 0.0D);
_L6:
        if (!_isNegInf(jsonparser)) goto _L5; else goto _L11
_L11:
        return (-1.0D / 0.0D);
_L4:
        d = d1;
        if (obj != JsonToken.VALUE_NULL)
        {
            if (obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
            {
                jsonparser.nextToken();
                d = _parseDoublePrimitive(jsonparser, deserializationcontext);
                if (jsonparser.nextToken() != JsonToken.END_ARRAY)
                {
                    throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'Byte' value but there was more than a single value in the array");
                }
            } else
            {
                throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
            }
        }
        if (true) goto _L13; else goto _L12
_L12:
    }

    protected final Float _parseFloat(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        Object obj = jsonparser.getCurrentToken();
        if (obj != JsonToken.VALUE_NUMBER_INT && obj != JsonToken.VALUE_NUMBER_FLOAT) goto _L2; else goto _L1
_L1:
        obj = Float.valueOf(jsonparser.getFloatValue());
_L13:
        return ((Float) (obj));
_L2:
        if (obj != JsonToken.VALUE_STRING) goto _L4; else goto _L3
_L3:
        jsonparser = jsonparser.getText().trim();
        if (jsonparser.length() == 0)
        {
            return (Float)getEmptyValue();
        }
        if (_hasTextualNull(jsonparser))
        {
            return (Float)getNullValue();
        }
        jsonparser.charAt(0);
        JVM INSTR lookupswitch 3: default 120
    //                   45: 160
    //                   73: 130
    //                   78: 145;
           goto _L5 _L6 _L7 _L8
_L5:
        float f;
        try
        {
            f = Float.parseFloat(jsonparser);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw deserializationcontext.weirdStringException(jsonparser, _valueClass, "not a valid Float value");
        }
        return Float.valueOf(f);
_L7:
        if (!_isPosInf(jsonparser)) goto _L5; else goto _L9
_L9:
        return Float.valueOf((1.0F / 0.0F));
_L8:
        if (!_isNaN(jsonparser)) goto _L5; else goto _L10
_L10:
        return Float.valueOf((0.0F / 0.0F));
_L6:
        if (!_isNegInf(jsonparser)) goto _L5; else goto _L11
_L11:
        return Float.valueOf((-1.0F / 0.0F));
_L4:
        if (obj == JsonToken.VALUE_NULL)
        {
            return (Float)getNullValue();
        }
        if (obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
        {
            jsonparser.nextToken();
            obj = _parseFloat(jsonparser, deserializationcontext);
            if (jsonparser.nextToken() != JsonToken.END_ARRAY)
            {
                throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'Byte' value but there was more than a single value in the array");
            }
        } else
        {
            throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
        }
        if (true) goto _L13; else goto _L12
_L12:
    }

    protected final float _parseFloatPrimitive(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        float f1;
        Object obj;
        f1 = 0.0F;
        obj = jsonparser.getCurrentToken();
        if (obj != JsonToken.VALUE_NUMBER_INT && obj != JsonToken.VALUE_NUMBER_FLOAT) goto _L2; else goto _L1
_L1:
        float f = jsonparser.getFloatValue();
_L13:
        return f;
_L2:
        if (obj != JsonToken.VALUE_STRING) goto _L4; else goto _L3
_L3:
        jsonparser = jsonparser.getText().trim();
        f = f1;
        if (jsonparser.length() == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        f = f1;
        if (_hasTextualNull(jsonparser))
        {
            continue; /* Loop/switch isn't completed */
        }
        jsonparser.charAt(0);
        JVM INSTR lookupswitch 3: default 108
    //                   45: 139
    //                   73: 115
    //                   78: 127;
           goto _L5 _L6 _L7 _L8
_L5:
        try
        {
            f = Float.parseFloat(jsonparser);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw deserializationcontext.weirdStringException(jsonparser, _valueClass, "not a valid float value");
        }
        return f;
_L7:
        if (!_isPosInf(jsonparser)) goto _L5; else goto _L9
_L9:
        return (1.0F / 0.0F);
_L8:
        if (!_isNaN(jsonparser)) goto _L5; else goto _L10
_L10:
        return (0.0F / 0.0F);
_L6:
        if (!_isNegInf(jsonparser)) goto _L5; else goto _L11
_L11:
        return (-1.0F / 0.0F);
_L4:
        f = f1;
        if (obj != JsonToken.VALUE_NULL)
        {
            if (obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
            {
                jsonparser.nextToken();
                f = _parseFloatPrimitive(jsonparser, deserializationcontext);
                if (jsonparser.nextToken() != JsonToken.END_ARRAY)
                {
                    throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'float' value but there was more than a single value in the array");
                }
            } else
            {
                throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
            }
        }
        if (true) goto _L13; else goto _L12
_L12:
    }

    protected final int _parseIntPrimitive(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        Object obj;
        boolean flag;
        flag = false;
        obj = jsonparser.getCurrentToken();
        if (obj != JsonToken.VALUE_NUMBER_INT && obj != JsonToken.VALUE_NUMBER_FLOAT) goto _L2; else goto _L1
_L1:
        int i = jsonparser.getIntValue();
_L4:
        return i;
_L2:
        int j;
        long l;
        if (obj != JsonToken.VALUE_STRING)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        jsonparser = jsonparser.getText().trim();
        i = ((flag) ? 1 : 0);
        if (_hasTextualNull(jsonparser))
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            j = jsonparser.length();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw deserializationcontext.weirdStringException(jsonparser, _valueClass, "not a valid int value");
        }
        if (j <= 9)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        l = Long.parseLong(jsonparser);
        if (l >= 0xffffffff80000000L && l <= 0x7fffffffL)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        throw deserializationcontext.weirdStringException(jsonparser, _valueClass, (new StringBuilder("Overflow: numeric value (")).append(jsonparser).append(") out of range of int (-2147483648 - 2147483647)").toString());
        return (int)l;
        i = ((flag) ? 1 : 0);
        if (j == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = NumberInput.parseInt(jsonparser);
        return i;
        i = ((flag) ? 1 : 0);
        if (obj != JsonToken.VALUE_NULL)
        {
            if (obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
            {
                jsonparser.nextToken();
                i = _parseIntPrimitive(jsonparser, deserializationcontext);
                if (jsonparser.nextToken() != JsonToken.END_ARRAY)
                {
                    throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'int' value but there was more than a single value in the array");
                }
            } else
            {
                throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final Integer _parseInteger(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        Object obj = jsonparser.getCurrentToken();
        if (obj != JsonToken.VALUE_NUMBER_INT && obj != JsonToken.VALUE_NUMBER_FLOAT) goto _L2; else goto _L1
_L1:
        obj = Integer.valueOf(jsonparser.getIntValue());
_L4:
        return ((Integer) (obj));
_L2:
        int i;
        long l;
        if (obj != JsonToken.VALUE_STRING)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        jsonparser = jsonparser.getText().trim();
        try
        {
            i = jsonparser.length();
            if (_hasTextualNull(jsonparser))
            {
                return (Integer)getNullValue();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw deserializationcontext.weirdStringException(jsonparser, _valueClass, "not a valid Integer value");
        }
        if (i <= 9)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        l = Long.parseLong(jsonparser);
        if (l >= 0xffffffff80000000L && l <= 0x7fffffffL)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        throw deserializationcontext.weirdStringException(jsonparser, _valueClass, (new StringBuilder("Overflow: numeric value (")).append(jsonparser).append(") out of range of Integer (-2147483648 - 2147483647)").toString());
        i = (int)l;
        return Integer.valueOf(i);
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        return (Integer)getEmptyValue();
        i = NumberInput.parseInt(jsonparser);
        return Integer.valueOf(i);
        if (obj == JsonToken.VALUE_NULL)
        {
            return (Integer)getNullValue();
        }
        if (obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
        {
            jsonparser.nextToken();
            obj = _parseInteger(jsonparser, deserializationcontext);
            if (jsonparser.nextToken() != JsonToken.END_ARRAY)
            {
                throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'Integer' value but there was more than a single value in the array");
            }
        } else
        {
            throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final Long _parseLong(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        Object obj = jsonparser.getCurrentToken();
        if (obj == JsonToken.VALUE_NUMBER_INT || obj == JsonToken.VALUE_NUMBER_FLOAT)
        {
            obj = Long.valueOf(jsonparser.getLongValue());
        } else
        {
            if (obj == JsonToken.VALUE_STRING)
            {
                jsonparser = jsonparser.getText().trim();
                if (jsonparser.length() == 0)
                {
                    return (Long)getEmptyValue();
                }
                if (_hasTextualNull(jsonparser))
                {
                    return (Long)getNullValue();
                }
                long l;
                try
                {
                    l = NumberInput.parseLong(jsonparser);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw deserializationcontext.weirdStringException(jsonparser, _valueClass, "not a valid Long value");
                }
                return Long.valueOf(l);
            }
            if (obj == JsonToken.VALUE_NULL)
            {
                return (Long)getNullValue();
            }
            if (obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
            {
                jsonparser.nextToken();
                obj = _parseLong(jsonparser, deserializationcontext);
                if (jsonparser.nextToken() != JsonToken.END_ARRAY)
                {
                    throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'Long' value but there was more than a single value in the array");
                }
            } else
            {
                throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
            }
        }
        return ((Long) (obj));
    }

    protected final long _parseLongPrimitive(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        Object obj;
        long l1;
        l1 = 0L;
        obj = jsonparser.getCurrentToken();
        if (obj != JsonToken.VALUE_NUMBER_INT && obj != JsonToken.VALUE_NUMBER_FLOAT) goto _L2; else goto _L1
_L1:
        long l = jsonparser.getLongValue();
_L4:
        return l;
_L2:
        if (obj != JsonToken.VALUE_STRING)
        {
            break; /* Loop/switch isn't completed */
        }
        jsonparser = jsonparser.getText().trim();
        l = l1;
        if (jsonparser.length() != 0)
        {
            l = l1;
            if (!_hasTextualNull(jsonparser))
            {
                try
                {
                    l = NumberInput.parseLong(jsonparser);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw deserializationcontext.weirdStringException(jsonparser, _valueClass, "not a valid long value");
                }
                return l;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        l = l1;
        if (obj != JsonToken.VALUE_NULL)
        {
            if (obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
            {
                jsonparser.nextToken();
                l = _parseLongPrimitive(jsonparser, deserializationcontext);
                if (jsonparser.nextToken() != JsonToken.END_ARRAY)
                {
                    throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'long' value but there was more than a single value in the array");
                }
            } else
            {
                throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
            }
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    protected Short _parseShort(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        Object obj = jsonparser.getCurrentToken();
        if (obj == JsonToken.VALUE_NUMBER_INT || obj == JsonToken.VALUE_NUMBER_FLOAT)
        {
            obj = Short.valueOf(jsonparser.getShortValue());
        } else
        {
            if (obj == JsonToken.VALUE_STRING)
            {
                jsonparser = jsonparser.getText().trim();
                int i;
                try
                {
                    if (jsonparser.length() == 0)
                    {
                        return (Short)getEmptyValue();
                    }
                    if (_hasTextualNull(jsonparser))
                    {
                        return (Short)getNullValue();
                    }
                    i = NumberInput.parseInt(jsonparser);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw deserializationcontext.weirdStringException(jsonparser, _valueClass, "not a valid Short value");
                }
                if (i < -32768 || i > 32767)
                {
                    throw deserializationcontext.weirdStringException(jsonparser, _valueClass, "overflow, value can not be represented as 16-bit value");
                } else
                {
                    return Short.valueOf((short)i);
                }
            }
            if (obj == JsonToken.VALUE_NULL)
            {
                return (Short)getNullValue();
            }
            if (obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
            {
                jsonparser.nextToken();
                obj = _parseShort(jsonparser, deserializationcontext);
                if (jsonparser.nextToken() != JsonToken.END_ARRAY)
                {
                    throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'Short' value but there was more than a single value in the array");
                }
            } else
            {
                throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
            }
        }
        return ((Short) (obj));
    }

    protected final short _parseShortPrimitive(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        int i = _parseIntPrimitive(jsonparser, deserializationcontext);
        if (i < -32768 || i > 32767)
        {
            throw deserializationcontext.weirdStringException(String.valueOf(i), _valueClass, "overflow, value can not be represented as 16-bit value");
        } else
        {
            return (short)i;
        }
    }

    protected final String _parseString(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        Object obj = jsonparser.getCurrentToken();
        if (obj != JsonToken.VALUE_STRING) goto _L2; else goto _L1
_L1:
        obj = jsonparser.getText();
_L4:
        return ((String) (obj));
_L2:
        if (obj != JsonToken.START_ARRAY || !deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
        {
            break; /* Loop/switch isn't completed */
        }
        jsonparser.nextToken();
        obj = _parseString(jsonparser, deserializationcontext);
        if (jsonparser.nextToken() != JsonToken.END_ARRAY)
        {
            throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'String' value but there was more than a single value in the array");
        }
        if (true) goto _L4; else goto _L3
_L3:
        String s = jsonparser.getValueAsString();
        obj = s;
        if (s == null)
        {
            throw deserializationcontext.mappingException(java/lang/String, jsonparser.getCurrentToken());
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
    {
        return typedeserializer.deserializeTypedFromAny(jsonparser, deserializationcontext);
    }

    protected JsonDeserializer findConvertingContentDeserializer(DeserializationContext deserializationcontext, BeanProperty beanproperty, JsonDeserializer jsondeserializer)
    {
        Object obj1 = deserializationcontext.getAnnotationIntrospector();
        Object obj = jsondeserializer;
        if (obj1 != null)
        {
            obj = jsondeserializer;
            if (beanproperty != null)
            {
                obj1 = ((AnnotationIntrospector) (obj1)).findDeserializationContentConverter(beanproperty.getMember());
                obj = jsondeserializer;
                if (obj1 != null)
                {
                    obj1 = deserializationcontext.converterInstance(beanproperty.getMember(), obj1);
                    JavaType javatype = ((Converter) (obj1)).getInputType(deserializationcontext.getTypeFactory());
                    obj = jsondeserializer;
                    if (jsondeserializer == null)
                    {
                        obj = deserializationcontext.findContextualValueDeserializer(javatype, beanproperty);
                    }
                    obj = new StdDelegatingDeserializer(((Converter) (obj1)), javatype, ((JsonDeserializer) (obj)));
                }
            }
        }
        return ((JsonDeserializer) (obj));
    }

    public JsonDeserializer findDeserializer(DeserializationContext deserializationcontext, JavaType javatype, BeanProperty beanproperty)
    {
        return deserializationcontext.findContextualValueDeserializer(javatype, beanproperty);
    }

    public void handleUnknownProperty(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj, String s)
    {
        Object obj1 = obj;
        if (obj == null)
        {
            obj1 = handledType();
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

    public Class handledType()
    {
        return _valueClass;
    }

    protected boolean isDefaultDeserializer(JsonDeserializer jsondeserializer)
    {
        return ClassUtil.isJacksonStdImpl(jsondeserializer);
    }

    protected boolean isDefaultKeyDeserializer(KeyDeserializer keydeserializer)
    {
        return ClassUtil.isJacksonStdImpl(keydeserializer);
    }
}

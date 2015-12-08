// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.io.IOException;
import java.util.HashMap;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdDeserializer

public class PrimitiveArrayDeserializers
{
    static abstract class Base extends StdDeserializer
    {

        public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
            throws IOException, JsonProcessingException
        {
            return typedeserializer.deserializeTypedFromArray(jsonparser, deserializationcontext);
        }

        protected Base(Class class1)
        {
            super(class1);
        }
    }

    static final class BooleanDeser extends Base
    {

        private final boolean[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            if (jsonparser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().length() == 0)
            {
                return null;
            }
            if (!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
            {
                throw deserializationcontext.mappingException(_valueClass);
            } else
            {
                return (new boolean[] {
                    _parseBooleanPrimitive(jsonparser, deserializationcontext)
                });
            }
        }

        public final volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public final boolean[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            if (!jsonparser.isExpectedStartArrayToken())
            {
                return handleNonArray(jsonparser, deserializationcontext);
            }
            com.fasterxml.jackson.databind.util.ArrayBuilders.BooleanBuilder booleanbuilder = deserializationcontext.getArrayBuilders().getBooleanBuilder();
            boolean aflag[] = (boolean[])booleanbuilder.resetAndStart();
            int i;
            int j;
            for (i = 0; jsonparser.nextToken() != JsonToken.END_ARRAY; i = j)
            {
                boolean flag = _parseBooleanPrimitive(jsonparser, deserializationcontext);
                if (i >= aflag.length)
                {
                    aflag = (boolean[])booleanbuilder.appendCompletedChunk(aflag, i);
                    i = 0;
                }
                j = i + 1;
                aflag[i] = flag;
            }

            return (boolean[])booleanbuilder.completeAndClearBuffer(aflag, i);
        }

        public BooleanDeser()
        {
            super([Z);
        }
    }

    static final class ByteDeser extends Base
    {

        private final byte[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            if (jsonparser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().length() == 0)
            {
                return null;
            }
            if (!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
            {
                throw deserializationcontext.mappingException(_valueClass);
            }
            JsonToken jsontoken = jsonparser.getCurrentToken();
            byte byte0;
            if (jsontoken == JsonToken.VALUE_NUMBER_INT || jsontoken == JsonToken.VALUE_NUMBER_FLOAT)
            {
                byte0 = jsonparser.getByteValue();
            } else
            {
                if (jsontoken != JsonToken.VALUE_NULL)
                {
                    throw deserializationcontext.mappingException(_valueClass.getComponentType());
                }
                byte0 = 0;
            }
            return (new byte[] {
                byte0
            });
        }

        public final volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public final byte[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            JsonToken jsontoken = jsonparser.getCurrentToken();
            if (jsontoken == JsonToken.VALUE_STRING)
            {
                return jsonparser.getBinaryValue(deserializationcontext.getBase64Variant());
            }
            if (jsontoken == JsonToken.VALUE_EMBEDDED_OBJECT)
            {
                Object obj = jsonparser.getEmbeddedObject();
                if (obj == null)
                {
                    return null;
                }
                if (obj instanceof byte[])
                {
                    return (byte[])(byte[])obj;
                }
            }
            if (!jsonparser.isExpectedStartArrayToken())
            {
                return handleNonArray(jsonparser, deserializationcontext);
            }
            com.fasterxml.jackson.databind.util.ArrayBuilders.ByteBuilder bytebuilder = deserializationcontext.getArrayBuilders().getByteBuilder();
            byte abyte0[] = (byte[])bytebuilder.resetAndStart();
            int i = 0;
            do
            {
                JsonToken jsontoken1 = jsonparser.nextToken();
                if (jsontoken1 != JsonToken.END_ARRAY)
                {
                    byte byte0;
                    if (jsontoken1 == JsonToken.VALUE_NUMBER_INT || jsontoken1 == JsonToken.VALUE_NUMBER_FLOAT)
                    {
                        byte0 = jsonparser.getByteValue();
                    } else
                    {
                        if (jsontoken1 != JsonToken.VALUE_NULL)
                        {
                            throw deserializationcontext.mappingException(_valueClass.getComponentType());
                        }
                        byte0 = 0;
                    }
                    if (i >= abyte0.length)
                    {
                        abyte0 = (byte[])bytebuilder.appendCompletedChunk(abyte0, i);
                        i = 0;
                    }
                    abyte0[i] = byte0;
                    i++;
                } else
                {
                    return (byte[])bytebuilder.completeAndClearBuffer(abyte0, i);
                }
            } while (true);
        }

        public ByteDeser()
        {
            super([B);
        }
    }

    static final class CharDeser extends Base
    {

        public final volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public final char[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            Object obj = jsonparser.getCurrentToken();
            if (obj == JsonToken.VALUE_STRING)
            {
                deserializationcontext = jsonparser.getTextCharacters();
                int i = jsonparser.getTextOffset();
                int j = jsonparser.getTextLength();
                jsonparser = new char[j];
                System.arraycopy(deserializationcontext, i, jsonparser, 0, j);
                return jsonparser;
            }
            if (jsonparser.isExpectedStartArrayToken())
            {
                obj = new StringBuilder(64);
                do
                {
                    Object obj1 = jsonparser.nextToken();
                    if (obj1 != JsonToken.END_ARRAY)
                    {
                        if (obj1 != JsonToken.VALUE_STRING)
                        {
                            throw deserializationcontext.mappingException(Character.TYPE);
                        }
                        obj1 = jsonparser.getText();
                        if (((String) (obj1)).length() != 1)
                        {
                            throw JsonMappingException.from(jsonparser, (new StringBuilder("Can not convert a JSON String of length ")).append(((String) (obj1)).length()).append(" into a char element of char array").toString());
                        }
                        ((StringBuilder) (obj)).append(((String) (obj1)).charAt(0));
                    } else
                    {
                        return ((StringBuilder) (obj)).toString().toCharArray();
                    }
                } while (true);
            }
            if (obj == JsonToken.VALUE_EMBEDDED_OBJECT)
            {
                jsonparser = ((JsonParser) (jsonparser.getEmbeddedObject()));
                if (jsonparser == null)
                {
                    return null;
                }
                if (jsonparser instanceof char[])
                {
                    return (char[])(char[])jsonparser;
                }
                if (jsonparser instanceof String)
                {
                    return ((String)jsonparser).toCharArray();
                }
                if (jsonparser instanceof byte[])
                {
                    return Base64Variants.getDefaultVariant().encode((byte[])(byte[])jsonparser, false).toCharArray();
                }
            }
            throw deserializationcontext.mappingException(_valueClass);
        }

        public CharDeser()
        {
            super([C);
        }
    }

    static final class DoubleDeser extends Base
    {

        private final double[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            if (jsonparser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().length() == 0)
            {
                return null;
            }
            if (!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
            {
                throw deserializationcontext.mappingException(_valueClass);
            } else
            {
                return (new double[] {
                    _parseDoublePrimitive(jsonparser, deserializationcontext)
                });
            }
        }

        public final volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public final double[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            if (!jsonparser.isExpectedStartArrayToken())
            {
                return handleNonArray(jsonparser, deserializationcontext);
            }
            com.fasterxml.jackson.databind.util.ArrayBuilders.DoubleBuilder doublebuilder = deserializationcontext.getArrayBuilders().getDoubleBuilder();
            double ad[] = (double[])doublebuilder.resetAndStart();
            int i;
            int j;
            for (i = 0; jsonparser.nextToken() != JsonToken.END_ARRAY; i = j)
            {
                double d = _parseDoublePrimitive(jsonparser, deserializationcontext);
                if (i >= ad.length)
                {
                    ad = (double[])doublebuilder.appendCompletedChunk(ad, i);
                    i = 0;
                }
                j = i + 1;
                ad[i] = d;
            }

            return (double[])doublebuilder.completeAndClearBuffer(ad, i);
        }

        public DoubleDeser()
        {
            super([D);
        }
    }

    static final class FloatDeser extends Base
    {

        private final float[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            if (jsonparser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().length() == 0)
            {
                return null;
            }
            if (!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
            {
                throw deserializationcontext.mappingException(_valueClass);
            } else
            {
                return (new float[] {
                    _parseFloatPrimitive(jsonparser, deserializationcontext)
                });
            }
        }

        public final volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public final float[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            if (!jsonparser.isExpectedStartArrayToken())
            {
                return handleNonArray(jsonparser, deserializationcontext);
            }
            com.fasterxml.jackson.databind.util.ArrayBuilders.FloatBuilder floatbuilder = deserializationcontext.getArrayBuilders().getFloatBuilder();
            float af[] = (float[])floatbuilder.resetAndStart();
            int i;
            int j;
            for (i = 0; jsonparser.nextToken() != JsonToken.END_ARRAY; i = j)
            {
                float f = _parseFloatPrimitive(jsonparser, deserializationcontext);
                if (i >= af.length)
                {
                    af = (float[])floatbuilder.appendCompletedChunk(af, i);
                    i = 0;
                }
                j = i + 1;
                af[i] = f;
            }

            return (float[])floatbuilder.completeAndClearBuffer(af, i);
        }

        public FloatDeser()
        {
            super([F);
        }
    }

    static final class IntDeser extends Base
    {

        private final int[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            if (jsonparser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().length() == 0)
            {
                return null;
            }
            if (!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
            {
                throw deserializationcontext.mappingException(_valueClass);
            } else
            {
                return (new int[] {
                    _parseIntPrimitive(jsonparser, deserializationcontext)
                });
            }
        }

        public final volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public final int[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            if (!jsonparser.isExpectedStartArrayToken())
            {
                return handleNonArray(jsonparser, deserializationcontext);
            }
            com.fasterxml.jackson.databind.util.ArrayBuilders.IntBuilder intbuilder = deserializationcontext.getArrayBuilders().getIntBuilder();
            int ai[] = (int[])intbuilder.resetAndStart();
            int i;
            int j;
            for (i = 0; jsonparser.nextToken() != JsonToken.END_ARRAY; i = j)
            {
                int k = _parseIntPrimitive(jsonparser, deserializationcontext);
                if (i >= ai.length)
                {
                    ai = (int[])intbuilder.appendCompletedChunk(ai, i);
                    i = 0;
                }
                j = i + 1;
                ai[i] = k;
            }

            return (int[])intbuilder.completeAndClearBuffer(ai, i);
        }

        public IntDeser()
        {
            super([I);
        }
    }

    static final class LongDeser extends Base
    {

        private final long[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            if (jsonparser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().length() == 0)
            {
                return null;
            }
            if (!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
            {
                throw deserializationcontext.mappingException(_valueClass);
            } else
            {
                return (new long[] {
                    _parseLongPrimitive(jsonparser, deserializationcontext)
                });
            }
        }

        public final volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public final long[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            if (!jsonparser.isExpectedStartArrayToken())
            {
                return handleNonArray(jsonparser, deserializationcontext);
            }
            com.fasterxml.jackson.databind.util.ArrayBuilders.LongBuilder longbuilder = deserializationcontext.getArrayBuilders().getLongBuilder();
            long al[] = (long[])longbuilder.resetAndStart();
            int i;
            int j;
            for (i = 0; jsonparser.nextToken() != JsonToken.END_ARRAY; i = j)
            {
                long l = _parseLongPrimitive(jsonparser, deserializationcontext);
                if (i >= al.length)
                {
                    al = (long[])longbuilder.appendCompletedChunk(al, i);
                    i = 0;
                }
                j = i + 1;
                al[i] = l;
            }

            return (long[])longbuilder.completeAndClearBuffer(al, i);
        }

        public LongDeser()
        {
            super([J);
        }
    }

    static final class ShortDeser extends Base
    {

        private final short[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            if (jsonparser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().length() == 0)
            {
                return null;
            }
            if (!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
            {
                throw deserializationcontext.mappingException(_valueClass);
            } else
            {
                return (new short[] {
                    _parseShortPrimitive(jsonparser, deserializationcontext)
                });
            }
        }

        public final volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public final short[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            if (!jsonparser.isExpectedStartArrayToken())
            {
                return handleNonArray(jsonparser, deserializationcontext);
            }
            com.fasterxml.jackson.databind.util.ArrayBuilders.ShortBuilder shortbuilder = deserializationcontext.getArrayBuilders().getShortBuilder();
            short aword0[] = (short[])shortbuilder.resetAndStart();
            int i;
            int j;
            for (i = 0; jsonparser.nextToken() != JsonToken.END_ARRAY; i = j)
            {
                short word0 = _parseShortPrimitive(jsonparser, deserializationcontext);
                if (i >= aword0.length)
                {
                    aword0 = (short[])shortbuilder.appendCompletedChunk(aword0, i);
                    i = 0;
                }
                j = i + 1;
                aword0[i] = word0;
            }

            return (short[])shortbuilder.completeAndClearBuffer(aword0, i);
        }

        public ShortDeser()
        {
            super([S);
        }
    }

    static final class StringDeser extends Base
    {

        private final String[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            Object obj = null;
            if (!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
            {
                if (jsonparser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().length() == 0)
                {
                    return null;
                } else
                {
                    throw deserializationcontext.mappingException(_valueClass);
                }
            }
            if (jsonparser.getCurrentToken() == JsonToken.VALUE_NULL)
            {
                jsonparser = obj;
            } else
            {
                jsonparser = _parseString(jsonparser, deserializationcontext);
            }
            return (new String[] {
                jsonparser
            });
        }

        public final volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public final String[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            if (!jsonparser.isExpectedStartArrayToken())
            {
                return handleNonArray(jsonparser, deserializationcontext);
            }
            ObjectBuffer objectbuffer = deserializationcontext.leaseObjectBuffer();
            Object aobj[] = objectbuffer.resetAndStart();
            int i = 0;
            do
            {
                Object obj = jsonparser.nextToken();
                if (obj != JsonToken.END_ARRAY)
                {
                    int j;
                    if (obj == JsonToken.VALUE_NULL)
                    {
                        obj = null;
                    } else
                    {
                        obj = _parseString(jsonparser, deserializationcontext);
                    }
                    if (i >= aobj.length)
                    {
                        aobj = objectbuffer.appendCompletedChunk(aobj);
                        i = 0;
                    }
                    j = i + 1;
                    aobj[i] = obj;
                    i = j;
                } else
                {
                    jsonparser = (String[])objectbuffer.completeAndClearBuffer(aobj, i, java/lang/String);
                    deserializationcontext.returnObjectBuffer(objectbuffer);
                    return jsonparser;
                }
            } while (true);
        }

        public StringDeser()
        {
            super([Ljava/lang/String;);
        }
    }


    static final PrimitiveArrayDeserializers instance = new PrimitiveArrayDeserializers();
    HashMap _allDeserializers;

    protected PrimitiveArrayDeserializers()
    {
        _allDeserializers = new HashMap();
        add(Boolean.TYPE, new BooleanDeser());
        add(Byte.TYPE, new ByteDeser());
        add(Short.TYPE, new ShortDeser());
        add(Integer.TYPE, new IntDeser());
        add(Long.TYPE, new LongDeser());
        add(Float.TYPE, new FloatDeser());
        add(Double.TYPE, new DoubleDeser());
        add(java/lang/String, new StringDeser());
        add(Character.TYPE, new CharDeser());
    }

    private void add(Class class1, JsonDeserializer jsondeserializer)
    {
        _allDeserializers.put(TypeFactory.defaultInstance().constructType(class1), jsondeserializer);
    }

    public static HashMap getAll()
    {
        return instance._allDeserializers;
    }

}

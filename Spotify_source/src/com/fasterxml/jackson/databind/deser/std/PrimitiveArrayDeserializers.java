// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdDeserializer

public abstract class PrimitiveArrayDeserializers extends StdDeserializer
{

    protected PrimitiveArrayDeserializers(Class class1)
    {
        super(class1);
    }

    public static JsonDeserializer forType(Class class1)
    {
        if (class1 == Integer.TYPE)
        {
            return IntDeser.instance;
        }
        if (class1 == Long.TYPE)
        {
            return LongDeser.instance;
        }
        if (class1 == Byte.TYPE)
        {
            return new ByteDeser();
        }
        if (class1 == Short.TYPE)
        {
            return new ShortDeser();
        }
        if (class1 == Float.TYPE)
        {
            return new FloatDeser();
        }
        if (class1 == Double.TYPE)
        {
            return new DoubleDeser();
        }
        if (class1 == Boolean.TYPE)
        {
            return new BooleanDeser();
        }
        if (class1 == Character.TYPE)
        {
            return new CharDeser();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
    {
        return typedeserializer.deserializeTypedFromArray(jsonparser, deserializationcontext);
    }

    private class IntDeser extends PrimitiveArrayDeserializers
    {

        public static final IntDeser instance = new IntDeser();
        private static final long serialVersionUID = 1L;

        private final int[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
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
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public final int[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            if (!jsonparser.isExpectedStartArrayToken())
            {
                return handleNonArray(jsonparser, deserializationcontext);
            }
            com.fasterxml.jackson.databind.util.ArrayBuilders.IntBuilder intbuilder = deserializationcontext.getArrayBuilders().getIntBuilder();
            int ai[] = (int[])intbuilder.resetAndStart();
            int i = 0;
label0:
            do
            {
label1:
                {
                    int ai1[];
                    int j;
                    int k;
                    try
                    {
                        if (jsonparser.nextToken() == JsonToken.END_ARRAY)
                        {
                            break label0;
                        }
                        k = _parseIntPrimitive(jsonparser, deserializationcontext);
                        if (i < ai.length)
                        {
                            break label1;
                        }
                        ai1 = (int[])intbuilder.appendCompletedChunk(ai, i);
                    }
                    // Misplaced declaration of an exception variable
                    catch (JsonParser jsonparser)
                    {
                        throw JsonMappingException.wrapWithPath(jsonparser, ai, i);
                    }
                    i = 0;
                    ai = ai1;
                }
                j = i + 1;
                ai[i] = k;
                i = j;
            } while (true);
            return (int[])intbuilder.completeAndClearBuffer(ai, i);
        }


        public IntDeser()
        {
            super([I);
        }
    }


    private class LongDeser extends PrimitiveArrayDeserializers
    {

        public static final LongDeser instance = new LongDeser();
        private static final long serialVersionUID = 1L;

        private final long[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
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
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public final long[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            if (!jsonparser.isExpectedStartArrayToken())
            {
                return handleNonArray(jsonparser, deserializationcontext);
            }
            com.fasterxml.jackson.databind.util.ArrayBuilders.LongBuilder longbuilder = deserializationcontext.getArrayBuilders().getLongBuilder();
            long al[] = (long[])longbuilder.resetAndStart();
            int i = 0;
label0:
            do
            {
label1:
                {
                    long al1[];
                    int j;
                    long l;
                    try
                    {
                        if (jsonparser.nextToken() == JsonToken.END_ARRAY)
                        {
                            break label0;
                        }
                        l = _parseLongPrimitive(jsonparser, deserializationcontext);
                        if (i < al.length)
                        {
                            break label1;
                        }
                        al1 = (long[])longbuilder.appendCompletedChunk(al, i);
                    }
                    // Misplaced declaration of an exception variable
                    catch (JsonParser jsonparser)
                    {
                        throw JsonMappingException.wrapWithPath(jsonparser, al, i);
                    }
                    i = 0;
                    al = al1;
                }
                j = i + 1;
                al[i] = l;
                i = j;
            } while (true);
            return (long[])longbuilder.completeAndClearBuffer(al, i);
        }


        public LongDeser()
        {
            super([J);
        }
    }


    private class ByteDeser extends PrimitiveArrayDeserializers
    {

        private static final long serialVersionUID = 1L;

        private final byte[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
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
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public final byte[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            byte abyte0[];
            com.fasterxml.jackson.databind.util.ArrayBuilders.ByteBuilder bytebuilder;
            int i;
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
                    return (byte[])obj;
                }
            }
            if (!jsonparser.isExpectedStartArrayToken())
            {
                return handleNonArray(jsonparser, deserializationcontext);
            }
            bytebuilder = deserializationcontext.getArrayBuilders().getByteBuilder();
            abyte0 = (byte[])bytebuilder.resetAndStart();
            i = 0;
_L5:
            byte byte0;
            Object obj1;
            obj1 = jsonparser.nextToken();
            if (obj1 == JsonToken.END_ARRAY)
            {
                break MISSING_BLOCK_LABEL_212;
            }
            if (obj1 != JsonToken.VALUE_NUMBER_INT && obj1 != JsonToken.VALUE_NUMBER_FLOAT)
            {
                break MISSING_BLOCK_LABEL_187;
            }
            byte0 = jsonparser.getByteValue();
_L3:
            if (i < abyte0.length) goto _L2; else goto _L1
_L1:
            obj1 = (byte[])bytebuilder.appendCompletedChunk(abyte0, i);
            i = 0;
            abyte0 = ((byte []) (obj1));
_L2:
            int j = i + 1;
            abyte0[i] = byte0;
            i = j;
            continue; /* Loop/switch isn't completed */
            try
            {
                if (obj1 != JsonToken.VALUE_NULL)
                {
                    throw deserializationcontext.mappingException(_valueClass.getComponentType());
                }
            }
            // Misplaced declaration of an exception variable
            catch (JsonParser jsonparser)
            {
                throw JsonMappingException.wrapWithPath(jsonparser, abyte0, i);
            }
            byte0 = 0;
              goto _L3
            return (byte[])bytebuilder.completeAndClearBuffer(abyte0, i);
            if (true) goto _L5; else goto _L4
_L4:
        }

        public ByteDeser()
        {
            super([B);
        }
    }


    private class ShortDeser extends PrimitiveArrayDeserializers
    {

        private static final long serialVersionUID = 1L;

        private final short[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
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
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public final short[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            if (!jsonparser.isExpectedStartArrayToken())
            {
                return handleNonArray(jsonparser, deserializationcontext);
            }
            com.fasterxml.jackson.databind.util.ArrayBuilders.ShortBuilder shortbuilder = deserializationcontext.getArrayBuilders().getShortBuilder();
            short aword0[] = (short[])shortbuilder.resetAndStart();
            int i = 0;
label0:
            do
            {
label1:
                {
                    short word0;
                    short aword1[];
                    int j;
                    try
                    {
                        if (jsonparser.nextToken() == JsonToken.END_ARRAY)
                        {
                            break label0;
                        }
                        word0 = _parseShortPrimitive(jsonparser, deserializationcontext);
                        if (i < aword0.length)
                        {
                            break label1;
                        }
                        aword1 = (short[])shortbuilder.appendCompletedChunk(aword0, i);
                    }
                    // Misplaced declaration of an exception variable
                    catch (JsonParser jsonparser)
                    {
                        throw JsonMappingException.wrapWithPath(jsonparser, aword0, i);
                    }
                    i = 0;
                    aword0 = aword1;
                }
                j = i + 1;
                aword0[i] = word0;
                i = j;
            } while (true);
            return (short[])shortbuilder.completeAndClearBuffer(aword0, i);
        }

        public ShortDeser()
        {
            super([S);
        }
    }


    private class FloatDeser extends PrimitiveArrayDeserializers
    {

        private static final long serialVersionUID = 1L;

        private final float[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
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
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public final float[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            if (!jsonparser.isExpectedStartArrayToken())
            {
                return handleNonArray(jsonparser, deserializationcontext);
            }
            com.fasterxml.jackson.databind.util.ArrayBuilders.FloatBuilder floatbuilder = deserializationcontext.getArrayBuilders().getFloatBuilder();
            float af[] = (float[])floatbuilder.resetAndStart();
            int i = 0;
label0:
            do
            {
label1:
                {
                    float f;
                    float af1[];
                    int j;
                    try
                    {
                        if (jsonparser.nextToken() == JsonToken.END_ARRAY)
                        {
                            break label0;
                        }
                        f = _parseFloatPrimitive(jsonparser, deserializationcontext);
                        if (i < af.length)
                        {
                            break label1;
                        }
                        af1 = (float[])floatbuilder.appendCompletedChunk(af, i);
                    }
                    // Misplaced declaration of an exception variable
                    catch (JsonParser jsonparser)
                    {
                        throw JsonMappingException.wrapWithPath(jsonparser, af, i);
                    }
                    i = 0;
                    af = af1;
                }
                j = i + 1;
                af[i] = f;
                i = j;
            } while (true);
            return (float[])floatbuilder.completeAndClearBuffer(af, i);
        }

        public FloatDeser()
        {
            super([F);
        }
    }


    private class DoubleDeser extends PrimitiveArrayDeserializers
    {

        private static final long serialVersionUID = 1L;

        private final double[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
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
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public final double[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            if (!jsonparser.isExpectedStartArrayToken())
            {
                return handleNonArray(jsonparser, deserializationcontext);
            }
            com.fasterxml.jackson.databind.util.ArrayBuilders.DoubleBuilder doublebuilder = deserializationcontext.getArrayBuilders().getDoubleBuilder();
            double ad[] = (double[])doublebuilder.resetAndStart();
            int i = 0;
label0:
            do
            {
label1:
                {
                    double d;
                    double ad1[];
                    int j;
                    try
                    {
                        if (jsonparser.nextToken() == JsonToken.END_ARRAY)
                        {
                            break label0;
                        }
                        d = _parseDoublePrimitive(jsonparser, deserializationcontext);
                        if (i < ad.length)
                        {
                            break label1;
                        }
                        ad1 = (double[])doublebuilder.appendCompletedChunk(ad, i);
                    }
                    // Misplaced declaration of an exception variable
                    catch (JsonParser jsonparser)
                    {
                        throw JsonMappingException.wrapWithPath(jsonparser, ad, i);
                    }
                    i = 0;
                    ad = ad1;
                }
                j = i + 1;
                ad[i] = d;
                i = j;
            } while (true);
            return (double[])doublebuilder.completeAndClearBuffer(ad, i);
        }

        public DoubleDeser()
        {
            super([D);
        }
    }


    private class BooleanDeser extends PrimitiveArrayDeserializers
    {

        private static final long serialVersionUID = 1L;

        private final boolean[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
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
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public final boolean[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            if (!jsonparser.isExpectedStartArrayToken())
            {
                return handleNonArray(jsonparser, deserializationcontext);
            }
            com.fasterxml.jackson.databind.util.ArrayBuilders.BooleanBuilder booleanbuilder = deserializationcontext.getArrayBuilders().getBooleanBuilder();
            boolean aflag[] = (boolean[])booleanbuilder.resetAndStart();
            int i = 0;
label0:
            do
            {
label1:
                {
                    boolean aflag1[];
                    int j;
                    boolean flag;
                    try
                    {
                        if (jsonparser.nextToken() == JsonToken.END_ARRAY)
                        {
                            break label0;
                        }
                        flag = _parseBooleanPrimitive(jsonparser, deserializationcontext);
                        if (i < aflag.length)
                        {
                            break label1;
                        }
                        aflag1 = (boolean[])booleanbuilder.appendCompletedChunk(aflag, i);
                    }
                    // Misplaced declaration of an exception variable
                    catch (JsonParser jsonparser)
                    {
                        throw JsonMappingException.wrapWithPath(jsonparser, aflag, i);
                    }
                    i = 0;
                    aflag = aflag1;
                }
                j = i + 1;
                aflag[i] = flag;
                i = j;
            } while (true);
            return (boolean[])booleanbuilder.completeAndClearBuffer(aflag, i);
        }

        public BooleanDeser()
        {
            super([Z);
        }
    }


    private class CharDeser extends PrimitiveArrayDeserializers
    {

        private static final long serialVersionUID = 1L;

        public final volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public final char[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
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
                    return (char[])jsonparser;
                }
                if (jsonparser instanceof String)
                {
                    return ((String)jsonparser).toCharArray();
                }
                if (jsonparser instanceof byte[])
                {
                    return Base64Variants.getDefaultVariant().encode((byte[])jsonparser, false).toCharArray();
                }
            }
            throw deserializationcontext.mappingException(_valueClass);
        }

        public CharDeser()
        {
            super([C);
        }
    }

}

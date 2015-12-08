// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.UUID;

public final class TypeAdapters
{
    static final class a extends TypeAdapter
    {

        private final Map a;
        private final Map b;

        public final Object read(JsonReader jsonreader)
        {
            if (jsonreader.peek() == JsonToken.NULL)
            {
                jsonreader.nextNull();
                return null;
            } else
            {
                return (Enum)a.get(jsonreader.nextString());
            }
        }

        public final void write(JsonWriter jsonwriter, Object obj)
        {
            obj = (Enum)obj;
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = (String)b.get(obj);
            }
            jsonwriter.value(((String) (obj)));
        }

        public a(Class class1)
        {
            a = new HashMap();
            b = new HashMap();
            String s;
            String s1;
            Enum aenum[];
            Enum enum;
            SerializedName serializedname;
            String as[];
            int i;
            int j;
            int k;
            int l;
            try
            {
                aenum = (Enum[])class1.getEnumConstants();
                k = aenum.length;
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                throw new AssertionError();
            }
            i = 0;
            if (i >= k)
            {
                break; /* Loop/switch isn't completed */
            }
            enum = aenum[i];
            s = enum.name();
            serializedname = (SerializedName)class1.getField(s).getAnnotation(com/google/gson/annotations/SerializedName);
            if (serializedname == null) goto _L2; else goto _L1
_L1:
            s1 = serializedname.value();
            as = serializedname.alternate();
            l = as.length;
            j = 0;
_L3:
            s = s1;
            if (j >= l)
            {
                break; /* Loop/switch isn't completed */
            }
            s = as[j];
            a.put(s, enum);
            j++;
            if (true) goto _L3; else goto _L2
_L2:
            a.put(s, enum);
            b.put(enum, s);
            i++;
            if (true) goto _L5; else goto _L4
_L5:
            break MISSING_BLOCK_LABEL_43;
_L4:
        }
    }


    public static final TypeAdapter BIG_DECIMAL = new TypeAdapter() {

        private static BigDecimal a(JsonReader jsonreader)
        {
            if (jsonreader.peek() == JsonToken.NULL)
            {
                jsonreader.nextNull();
                return null;
            }
            try
            {
                jsonreader = new BigDecimal(jsonreader.nextString());
            }
            // Misplaced declaration of an exception variable
            catch (JsonReader jsonreader)
            {
                throw new JsonSyntaxException(jsonreader);
            }
            return jsonreader;
        }

        public final Object read(JsonReader jsonreader)
        {
            return a(jsonreader);
        }

        public final void write(JsonWriter jsonwriter, Object obj)
        {
            jsonwriter.value((BigDecimal)obj);
        }

    };
    public static final TypeAdapter BIG_INTEGER = new TypeAdapter() {

        private static BigInteger a(JsonReader jsonreader)
        {
            if (jsonreader.peek() == JsonToken.NULL)
            {
                jsonreader.nextNull();
                return null;
            }
            try
            {
                jsonreader = new BigInteger(jsonreader.nextString());
            }
            // Misplaced declaration of an exception variable
            catch (JsonReader jsonreader)
            {
                throw new JsonSyntaxException(jsonreader);
            }
            return jsonreader;
        }

        public final Object read(JsonReader jsonreader)
        {
            return a(jsonreader);
        }

        public final void write(JsonWriter jsonwriter, Object obj)
        {
            jsonwriter.value((BigInteger)obj);
        }

    };
    public static final TypeAdapter BIT_SET;
    public static final TypeAdapterFactory BIT_SET_FACTORY;
    public static final TypeAdapter BOOLEAN;
    public static final TypeAdapter BOOLEAN_AS_STRING = new TypeAdapter() {

        public final Object read(JsonReader jsonreader)
        {
            if (jsonreader.peek() == JsonToken.NULL)
            {
                jsonreader.nextNull();
                return null;
            } else
            {
                return Boolean.valueOf(jsonreader.nextString());
            }
        }

        public final void write(JsonWriter jsonwriter, Object obj)
        {
            obj = (Boolean)obj;
            if (obj == null)
            {
                obj = "null";
            } else
            {
                obj = ((Boolean) (obj)).toString();
            }
            jsonwriter.value(((String) (obj)));
        }

    };
    public static final TypeAdapterFactory BOOLEAN_FACTORY;
    public static final TypeAdapter BYTE;
    public static final TypeAdapterFactory BYTE_FACTORY;
    public static final TypeAdapter CALENDAR;
    public static final TypeAdapterFactory CALENDAR_FACTORY;
    public static final TypeAdapter CHARACTER;
    public static final TypeAdapterFactory CHARACTER_FACTORY;
    public static final TypeAdapter CLASS;
    public static final TypeAdapterFactory CLASS_FACTORY;
    public static final TypeAdapter DOUBLE = new TypeAdapter() {

        public final Object read(JsonReader jsonreader)
        {
            if (jsonreader.peek() == JsonToken.NULL)
            {
                jsonreader.nextNull();
                return null;
            } else
            {
                return Double.valueOf(jsonreader.nextDouble());
            }
        }

        public final void write(JsonWriter jsonwriter, Object obj)
        {
            jsonwriter.value((Number)obj);
        }

    };
    public static final TypeAdapterFactory ENUM_FACTORY = new TypeAdapterFactory() {

        public final TypeAdapter create(Gson gson, TypeToken typetoken)
        {
            typetoken = typetoken.getRawType();
            if (!java/lang/Enum.isAssignableFrom(typetoken) || typetoken == java/lang/Enum)
            {
                return null;
            }
            gson = typetoken;
            if (!typetoken.isEnum())
            {
                gson = typetoken.getSuperclass();
            }
            return new a(gson);
        }

    };
    public static final TypeAdapter FLOAT = new TypeAdapter() {

        public final Object read(JsonReader jsonreader)
        {
            if (jsonreader.peek() == JsonToken.NULL)
            {
                jsonreader.nextNull();
                return null;
            } else
            {
                return Float.valueOf((float)jsonreader.nextDouble());
            }
        }

        public final void write(JsonWriter jsonwriter, Object obj)
        {
            jsonwriter.value((Number)obj);
        }

    };
    public static final TypeAdapter INET_ADDRESS;
    public static final TypeAdapterFactory INET_ADDRESS_FACTORY;
    public static final TypeAdapter INTEGER;
    public static final TypeAdapterFactory INTEGER_FACTORY;
    public static final TypeAdapter JSON_ELEMENT;
    public static final TypeAdapterFactory JSON_ELEMENT_FACTORY;
    public static final TypeAdapter LOCALE;
    public static final TypeAdapterFactory LOCALE_FACTORY;
    public static final TypeAdapter LONG = new TypeAdapter() {

        private static Number a(JsonReader jsonreader)
        {
            if (jsonreader.peek() == JsonToken.NULL)
            {
                jsonreader.nextNull();
                return null;
            }
            long l;
            try
            {
                l = jsonreader.nextLong();
            }
            // Misplaced declaration of an exception variable
            catch (JsonReader jsonreader)
            {
                throw new JsonSyntaxException(jsonreader);
            }
            return Long.valueOf(l);
        }

        public final Object read(JsonReader jsonreader)
        {
            return a(jsonreader);
        }

        public final void write(JsonWriter jsonwriter, Object obj)
        {
            jsonwriter.value((Number)obj);
        }

    };
    public static final TypeAdapter NUMBER;
    public static final TypeAdapterFactory NUMBER_FACTORY;
    public static final TypeAdapter SHORT;
    public static final TypeAdapterFactory SHORT_FACTORY;
    public static final TypeAdapter STRING;
    public static final TypeAdapter STRING_BUFFER;
    public static final TypeAdapterFactory STRING_BUFFER_FACTORY;
    public static final TypeAdapter STRING_BUILDER;
    public static final TypeAdapterFactory STRING_BUILDER_FACTORY;
    public static final TypeAdapterFactory STRING_FACTORY;
    public static final TypeAdapterFactory TIMESTAMP_FACTORY = new TypeAdapterFactory() {

        public final TypeAdapter create(Gson gson, TypeToken typetoken)
        {
            if (typetoken.getRawType() != java/sql/Timestamp)
            {
                return null;
            } else
            {
                return new TypeAdapter(gson.getAdapter(java/util/Date)) {

                    private TypeAdapter a;

                    public final Object read(JsonReader jsonreader)
                    {
                        jsonreader = (Date)a.read(jsonreader);
                        if (jsonreader != null)
                        {
                            return new Timestamp(jsonreader.getTime());
                        } else
                        {
                            return null;
                        }
                    }

                    public final volatile void write(JsonWriter jsonwriter, Object obj)
                    {
                        obj = (Timestamp)obj;
                        a.write(jsonwriter, obj);
                    }

            
            {
                a = typeadapter;
                super();
            }
                };
            }
        }

    };
    public static final TypeAdapter URI;
    public static final TypeAdapterFactory URI_FACTORY;
    public static final TypeAdapter URL;
    public static final TypeAdapterFactory URL_FACTORY;
    public static final TypeAdapter UUID;
    public static final TypeAdapterFactory UUID_FACTORY;

    public static TypeAdapterFactory newFactory(TypeToken typetoken, TypeAdapter typeadapter)
    {
        return new TypeAdapterFactory(typetoken, typeadapter) {

            private TypeToken a;
            private TypeAdapter b;

            public final TypeAdapter create(Gson gson, TypeToken typetoken1)
            {
                if (typetoken1.equals(a))
                {
                    return b;
                } else
                {
                    return null;
                }
            }

            
            {
                a = typetoken;
                b = typeadapter;
                super();
            }
        };
    }

    public static TypeAdapterFactory newFactory(Class class1, TypeAdapter typeadapter)
    {
        return new TypeAdapterFactory(class1, typeadapter) {

            private Class a;
            private TypeAdapter b;

            public final TypeAdapter create(Gson gson, TypeToken typetoken)
            {
                if (typetoken.getRawType() == a)
                {
                    return b;
                } else
                {
                    return null;
                }
            }

            public final String toString()
            {
                return (new StringBuilder("Factory[type=")).append(a.getName()).append(",adapter=").append(b).append("]").toString();
            }

            
            {
                a = class1;
                b = typeadapter;
                super();
            }
        };
    }

    public static TypeAdapterFactory newFactory(Class class1, Class class2, TypeAdapter typeadapter)
    {
        return new TypeAdapterFactory(class1, class2, typeadapter) {

            private Class a;
            private Class b;
            private TypeAdapter c;

            public final TypeAdapter create(Gson gson, TypeToken typetoken)
            {
                gson = typetoken.getRawType();
                if (gson == a || gson == b)
                {
                    return c;
                } else
                {
                    return null;
                }
            }

            public final String toString()
            {
                return (new StringBuilder("Factory[type=")).append(b.getName()).append("+").append(a.getName()).append(",adapter=").append(c).append("]").toString();
            }

            
            {
                a = class1;
                b = class2;
                c = typeadapter;
                super();
            }
        };
    }

    public static TypeAdapterFactory newFactoryForMultipleTypes(Class class1, Class class2, TypeAdapter typeadapter)
    {
        return new TypeAdapterFactory(class1, class2, typeadapter) {

            private Class a;
            private Class b;
            private TypeAdapter c;

            public final TypeAdapter create(Gson gson, TypeToken typetoken)
            {
                gson = typetoken.getRawType();
                if (gson == a || gson == b)
                {
                    return c;
                } else
                {
                    return null;
                }
            }

            public final String toString()
            {
                return (new StringBuilder("Factory[type=")).append(a.getName()).append("+").append(b.getName()).append(",adapter=").append(c).append("]").toString();
            }

            
            {
                a = class1;
                b = class2;
                c = typeadapter;
                super();
            }
        };
    }

    public static TypeAdapterFactory newTypeHierarchyFactory(Class class1, TypeAdapter typeadapter)
    {
        return new TypeAdapterFactory(class1, typeadapter) {

            private Class a;
            private TypeAdapter b;

            public final TypeAdapter create(Gson gson, TypeToken typetoken)
            {
                if (a.isAssignableFrom(typetoken.getRawType()))
                {
                    return b;
                } else
                {
                    return null;
                }
            }

            public final String toString()
            {
                return (new StringBuilder("Factory[typeHierarchy=")).append(a.getName()).append(",adapter=").append(b).append("]").toString();
            }

            
            {
                a = class1;
                b = typeadapter;
                super();
            }
        };
    }

    static 
    {
        CLASS = new TypeAdapter() {

            public final Object read(JsonReader jsonreader)
            {
                if (jsonreader.peek() == JsonToken.NULL)
                {
                    jsonreader.nextNull();
                    return null;
                } else
                {
                    throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
                }
            }

            public final void write(JsonWriter jsonwriter, Object obj)
            {
                obj = (Class)obj;
                if (obj == null)
                {
                    jsonwriter.nullValue();
                    return;
                } else
                {
                    throw new UnsupportedOperationException((new StringBuilder("Attempted to serialize java.lang.Class: ")).append(((Class) (obj)).getName()).append(". Forgot to register a type adapter?").toString());
                }
            }

        };
        CLASS_FACTORY = newFactory(java/lang/Class, CLASS);
        BIT_SET = new TypeAdapter() {

            private static BitSet a(JsonReader jsonreader)
            {
                JsonToken jsontoken;
                BitSet bitset;
                int i;
                if (jsonreader.peek() == JsonToken.NULL)
                {
                    jsonreader.nextNull();
                    return null;
                }
                bitset = new BitSet();
                jsonreader.beginArray();
                jsontoken = jsonreader.peek();
                i = 0;
_L2:
                boolean flag;
                if (jsontoken == JsonToken.END_ARRAY)
                {
                    break MISSING_BLOCK_LABEL_200;
                }
                static final class _cls26
                {

                    static final int a[];

                    static 
                    {
                        a = new int[JsonToken.values().length];
                        try
                        {
                            a[JsonToken.NUMBER.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror9) { }
                        try
                        {
                            a[JsonToken.BOOLEAN.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror8) { }
                        try
                        {
                            a[JsonToken.STRING.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror7) { }
                        try
                        {
                            a[JsonToken.NULL.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror6) { }
                        try
                        {
                            a[JsonToken.BEGIN_ARRAY.ordinal()] = 5;
                        }
                        catch (NoSuchFieldError nosuchfielderror5) { }
                        try
                        {
                            a[JsonToken.BEGIN_OBJECT.ordinal()] = 6;
                        }
                        catch (NoSuchFieldError nosuchfielderror4) { }
                        try
                        {
                            a[JsonToken.END_DOCUMENT.ordinal()] = 7;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            a[JsonToken.NAME.ordinal()] = 8;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            a[JsonToken.END_OBJECT.ordinal()] = 9;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[JsonToken.END_ARRAY.ordinal()] = 10;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (_cls26.a[jsontoken.ordinal()])
                {
                default:
                    throw new JsonSyntaxException((new StringBuilder("Invalid bitset value type: ")).append(jsontoken).toString());

                case 2: // '\002'
                    break; /* Loop/switch isn't completed */

                case 3: // '\003'
                    break MISSING_BLOCK_LABEL_147;

                case 1: // '\001'
                    if (jsonreader.nextInt() != 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    break;
                }
_L3:
                if (flag)
                {
                    bitset.set(i);
                }
                i++;
                jsontoken = jsonreader.peek();
                if (true) goto _L2; else goto _L1
_L1:
                flag = jsonreader.nextBoolean();
                  goto _L3
                String s = jsonreader.nextString();
                int j;
                try
                {
                    j = Integer.parseInt(s);
                }
                // Misplaced declaration of an exception variable
                catch (JsonReader jsonreader)
                {
                    throw new JsonSyntaxException((new StringBuilder("Error: Expecting: bitset number value (1, 0), Found: ")).append(s).toString());
                }
                if (j != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                  goto _L3
                jsonreader.endArray();
                return bitset;
            }

            public final Object read(JsonReader jsonreader)
            {
                return a(jsonreader);
            }

            public final void write(JsonWriter jsonwriter, Object obj)
            {
                obj = (BitSet)obj;
                if (obj == null)
                {
                    jsonwriter.nullValue();
                    return;
                }
                jsonwriter.beginArray();
                int i = 0;
                while (i < ((BitSet) (obj)).length()) 
                {
                    int j;
                    if (((BitSet) (obj)).get(i))
                    {
                        j = 1;
                    } else
                    {
                        j = 0;
                    }
                    jsonwriter.value(j);
                    i++;
                }
                jsonwriter.endArray();
            }

        };
        BIT_SET_FACTORY = newFactory(java/util/BitSet, BIT_SET);
        BOOLEAN = new TypeAdapter() {

            public final Object read(JsonReader jsonreader)
            {
                if (jsonreader.peek() == JsonToken.NULL)
                {
                    jsonreader.nextNull();
                    return null;
                }
                if (jsonreader.peek() == JsonToken.STRING)
                {
                    return Boolean.valueOf(Boolean.parseBoolean(jsonreader.nextString()));
                } else
                {
                    return Boolean.valueOf(jsonreader.nextBoolean());
                }
            }

            public final void write(JsonWriter jsonwriter, Object obj)
            {
                obj = (Boolean)obj;
                if (obj == null)
                {
                    jsonwriter.nullValue();
                    return;
                } else
                {
                    jsonwriter.value(((Boolean) (obj)).booleanValue());
                    return;
                }
            }

        };
        BOOLEAN_FACTORY = newFactory(Boolean.TYPE, java/lang/Boolean, BOOLEAN);
        BYTE = new TypeAdapter() {

            private static Number a(JsonReader jsonreader)
            {
                if (jsonreader.peek() == JsonToken.NULL)
                {
                    jsonreader.nextNull();
                    return null;
                }
                byte byte0;
                try
                {
                    byte0 = (byte)jsonreader.nextInt();
                }
                // Misplaced declaration of an exception variable
                catch (JsonReader jsonreader)
                {
                    throw new JsonSyntaxException(jsonreader);
                }
                return Byte.valueOf(byte0);
            }

            public final Object read(JsonReader jsonreader)
            {
                return a(jsonreader);
            }

            public final void write(JsonWriter jsonwriter, Object obj)
            {
                jsonwriter.value((Number)obj);
            }

        };
        BYTE_FACTORY = newFactory(Byte.TYPE, java/lang/Byte, BYTE);
        SHORT = new TypeAdapter() {

            private static Number a(JsonReader jsonreader)
            {
                if (jsonreader.peek() == JsonToken.NULL)
                {
                    jsonreader.nextNull();
                    return null;
                }
                short word0;
                try
                {
                    word0 = (short)jsonreader.nextInt();
                }
                // Misplaced declaration of an exception variable
                catch (JsonReader jsonreader)
                {
                    throw new JsonSyntaxException(jsonreader);
                }
                return Short.valueOf(word0);
            }

            public final Object read(JsonReader jsonreader)
            {
                return a(jsonreader);
            }

            public final void write(JsonWriter jsonwriter, Object obj)
            {
                jsonwriter.value((Number)obj);
            }

        };
        SHORT_FACTORY = newFactory(Short.TYPE, java/lang/Short, SHORT);
        INTEGER = new TypeAdapter() {

            private static Number a(JsonReader jsonreader)
            {
                if (jsonreader.peek() == JsonToken.NULL)
                {
                    jsonreader.nextNull();
                    return null;
                }
                int i;
                try
                {
                    i = jsonreader.nextInt();
                }
                // Misplaced declaration of an exception variable
                catch (JsonReader jsonreader)
                {
                    throw new JsonSyntaxException(jsonreader);
                }
                return Integer.valueOf(i);
            }

            public final Object read(JsonReader jsonreader)
            {
                return a(jsonreader);
            }

            public final void write(JsonWriter jsonwriter, Object obj)
            {
                jsonwriter.value((Number)obj);
            }

        };
        INTEGER_FACTORY = newFactory(Integer.TYPE, java/lang/Integer, INTEGER);
        NUMBER = new TypeAdapter() {

            public final Object read(JsonReader jsonreader)
            {
                JsonToken jsontoken = jsonreader.peek();
                switch (_cls26.a[jsontoken.ordinal()])
                {
                case 2: // '\002'
                case 3: // '\003'
                default:
                    throw new JsonSyntaxException((new StringBuilder("Expecting number, got: ")).append(jsontoken).toString());

                case 4: // '\004'
                    jsonreader.nextNull();
                    return null;

                case 1: // '\001'
                    return new LazilyParsedNumber(jsonreader.nextString());
                }
            }

            public final void write(JsonWriter jsonwriter, Object obj)
            {
                jsonwriter.value((Number)obj);
            }

        };
        NUMBER_FACTORY = newFactory(java/lang/Number, NUMBER);
        CHARACTER = new TypeAdapter() {

            public final Object read(JsonReader jsonreader)
            {
                if (jsonreader.peek() == JsonToken.NULL)
                {
                    jsonreader.nextNull();
                    return null;
                }
                jsonreader = jsonreader.nextString();
                if (jsonreader.length() != 1)
                {
                    throw new JsonSyntaxException((new StringBuilder("Expecting character, got: ")).append(jsonreader).toString());
                } else
                {
                    return Character.valueOf(jsonreader.charAt(0));
                }
            }

            public final void write(JsonWriter jsonwriter, Object obj)
            {
                obj = (Character)obj;
                if (obj == null)
                {
                    obj = null;
                } else
                {
                    obj = String.valueOf(obj);
                }
                jsonwriter.value(((String) (obj)));
            }

        };
        CHARACTER_FACTORY = newFactory(Character.TYPE, java/lang/Character, CHARACTER);
        STRING = new TypeAdapter() {

            public final Object read(JsonReader jsonreader)
            {
                JsonToken jsontoken = jsonreader.peek();
                if (jsontoken == JsonToken.NULL)
                {
                    jsonreader.nextNull();
                    return null;
                }
                if (jsontoken == JsonToken.BOOLEAN)
                {
                    return Boolean.toString(jsonreader.nextBoolean());
                } else
                {
                    return jsonreader.nextString();
                }
            }

            public final void write(JsonWriter jsonwriter, Object obj)
            {
                jsonwriter.value((String)obj);
            }

        };
        STRING_FACTORY = newFactory(java/lang/String, STRING);
        STRING_BUILDER = new TypeAdapter() {

            public final Object read(JsonReader jsonreader)
            {
                if (jsonreader.peek() == JsonToken.NULL)
                {
                    jsonreader.nextNull();
                    return null;
                } else
                {
                    return new StringBuilder(jsonreader.nextString());
                }
            }

            public final void write(JsonWriter jsonwriter, Object obj)
            {
                obj = (StringBuilder)obj;
                if (obj == null)
                {
                    obj = null;
                } else
                {
                    obj = ((StringBuilder) (obj)).toString();
                }
                jsonwriter.value(((String) (obj)));
            }

        };
        STRING_BUILDER_FACTORY = newFactory(java/lang/StringBuilder, STRING_BUILDER);
        STRING_BUFFER = new TypeAdapter() {

            public final Object read(JsonReader jsonreader)
            {
                if (jsonreader.peek() == JsonToken.NULL)
                {
                    jsonreader.nextNull();
                    return null;
                } else
                {
                    return new StringBuffer(jsonreader.nextString());
                }
            }

            public final void write(JsonWriter jsonwriter, Object obj)
            {
                obj = (StringBuffer)obj;
                if (obj == null)
                {
                    obj = null;
                } else
                {
                    obj = ((StringBuffer) (obj)).toString();
                }
                jsonwriter.value(((String) (obj)));
            }

        };
        STRING_BUFFER_FACTORY = newFactory(java/lang/StringBuffer, STRING_BUFFER);
        URL = new TypeAdapter() {

            public final Object read(JsonReader jsonreader)
            {
                if (jsonreader.peek() == JsonToken.NULL)
                {
                    jsonreader.nextNull();
                } else
                {
                    jsonreader = jsonreader.nextString();
                    if (!"null".equals(jsonreader))
                    {
                        return new URL(jsonreader);
                    }
                }
                return null;
            }

            public final void write(JsonWriter jsonwriter, Object obj)
            {
                obj = (URL)obj;
                if (obj == null)
                {
                    obj = null;
                } else
                {
                    obj = ((URL) (obj)).toExternalForm();
                }
                jsonwriter.value(((String) (obj)));
            }

        };
        URL_FACTORY = newFactory(java/net/URL, URL);
        URI = new TypeAdapter() {

            private static URI a(JsonReader jsonreader)
            {
                if (jsonreader.peek() != JsonToken.NULL) goto _L2; else goto _L1
_L1:
                jsonreader.nextNull();
_L4:
                return null;
_L2:
                jsonreader = jsonreader.nextString();
                if ("null".equals(jsonreader)) goto _L4; else goto _L3
_L3:
                jsonreader = new URI(jsonreader);
                return jsonreader;
                jsonreader;
                throw new JsonIOException(jsonreader);
            }

            public final Object read(JsonReader jsonreader)
            {
                return a(jsonreader);
            }

            public final void write(JsonWriter jsonwriter, Object obj)
            {
                obj = (URI)obj;
                if (obj == null)
                {
                    obj = null;
                } else
                {
                    obj = ((URI) (obj)).toASCIIString();
                }
                jsonwriter.value(((String) (obj)));
            }

        };
        URI_FACTORY = newFactory(java/net/URI, URI);
        INET_ADDRESS = new TypeAdapter() {

            public final Object read(JsonReader jsonreader)
            {
                if (jsonreader.peek() == JsonToken.NULL)
                {
                    jsonreader.nextNull();
                    return null;
                } else
                {
                    return InetAddress.getByName(jsonreader.nextString());
                }
            }

            public final void write(JsonWriter jsonwriter, Object obj)
            {
                obj = (InetAddress)obj;
                if (obj == null)
                {
                    obj = null;
                } else
                {
                    obj = ((InetAddress) (obj)).getHostAddress();
                }
                jsonwriter.value(((String) (obj)));
            }

        };
        INET_ADDRESS_FACTORY = newTypeHierarchyFactory(java/net/InetAddress, INET_ADDRESS);
        UUID = new TypeAdapter() {

            public final Object read(JsonReader jsonreader)
            {
                if (jsonreader.peek() == JsonToken.NULL)
                {
                    jsonreader.nextNull();
                    return null;
                } else
                {
                    return java.util.UUID.fromString(jsonreader.nextString());
                }
            }

            public final void write(JsonWriter jsonwriter, Object obj)
            {
                obj = (UUID)obj;
                if (obj == null)
                {
                    obj = null;
                } else
                {
                    obj = ((UUID) (obj)).toString();
                }
                jsonwriter.value(((String) (obj)));
            }

        };
        UUID_FACTORY = newFactory(java/util/UUID, UUID);
        CALENDAR = new TypeAdapter() {

            public final Object read(JsonReader jsonreader)
            {
                int j = 0;
                if (jsonreader.peek() == JsonToken.NULL)
                {
                    jsonreader.nextNull();
                    return null;
                }
                jsonreader.beginObject();
                int k = 0;
                int l = 0;
                int i1 = 0;
                int j1 = 0;
                int k1 = 0;
                do
                {
                    if (jsonreader.peek() == JsonToken.END_OBJECT)
                    {
                        break;
                    }
                    String s = jsonreader.nextName();
                    int i = jsonreader.nextInt();
                    if ("year".equals(s))
                    {
                        k1 = i;
                    } else
                    if ("month".equals(s))
                    {
                        j1 = i;
                    } else
                    if ("dayOfMonth".equals(s))
                    {
                        i1 = i;
                    } else
                    if ("hourOfDay".equals(s))
                    {
                        l = i;
                    } else
                    if ("minute".equals(s))
                    {
                        k = i;
                    } else
                    if ("second".equals(s))
                    {
                        j = i;
                    }
                } while (true);
                jsonreader.endObject();
                return new GregorianCalendar(k1, j1, i1, l, k, j);
            }

            public final void write(JsonWriter jsonwriter, Object obj)
            {
                obj = (Calendar)obj;
                if (obj == null)
                {
                    jsonwriter.nullValue();
                    return;
                } else
                {
                    jsonwriter.beginObject();
                    jsonwriter.name("year");
                    jsonwriter.value(((Calendar) (obj)).get(1));
                    jsonwriter.name("month");
                    jsonwriter.value(((Calendar) (obj)).get(2));
                    jsonwriter.name("dayOfMonth");
                    jsonwriter.value(((Calendar) (obj)).get(5));
                    jsonwriter.name("hourOfDay");
                    jsonwriter.value(((Calendar) (obj)).get(11));
                    jsonwriter.name("minute");
                    jsonwriter.value(((Calendar) (obj)).get(12));
                    jsonwriter.name("second");
                    jsonwriter.value(((Calendar) (obj)).get(13));
                    jsonwriter.endObject();
                    return;
                }
            }

        };
        CALENDAR_FACTORY = newFactoryForMultipleTypes(java/util/Calendar, java/util/GregorianCalendar, CALENDAR);
        LOCALE = new TypeAdapter() {

            public final Object read(JsonReader jsonreader)
            {
                if (jsonreader.peek() == JsonToken.NULL)
                {
                    jsonreader.nextNull();
                    return null;
                }
                Object obj = new StringTokenizer(jsonreader.nextString(), "_");
                String s;
                if (((StringTokenizer) (obj)).hasMoreElements())
                {
                    jsonreader = ((StringTokenizer) (obj)).nextToken();
                } else
                {
                    jsonreader = null;
                }
                if (((StringTokenizer) (obj)).hasMoreElements())
                {
                    s = ((StringTokenizer) (obj)).nextToken();
                } else
                {
                    s = null;
                }
                if (((StringTokenizer) (obj)).hasMoreElements())
                {
                    obj = ((StringTokenizer) (obj)).nextToken();
                } else
                {
                    obj = null;
                }
                if (s == null && obj == null)
                {
                    return new Locale(jsonreader);
                }
                if (obj == null)
                {
                    return new Locale(jsonreader, s);
                } else
                {
                    return new Locale(jsonreader, s, ((String) (obj)));
                }
            }

            public final void write(JsonWriter jsonwriter, Object obj)
            {
                obj = (Locale)obj;
                if (obj == null)
                {
                    obj = null;
                } else
                {
                    obj = ((Locale) (obj)).toString();
                }
                jsonwriter.value(((String) (obj)));
            }

        };
        LOCALE_FACTORY = newFactory(java/util/Locale, LOCALE);
        JSON_ELEMENT = new TypeAdapter() {

            private JsonElement a(JsonReader jsonreader)
            {
                JsonObject jsonobject;
                switch (_cls26.a[jsonreader.peek().ordinal()])
                {
                default:
                    throw new IllegalArgumentException();

                case 3: // '\003'
                    return new JsonPrimitive(jsonreader.nextString());

                case 1: // '\001'
                    return new JsonPrimitive(new LazilyParsedNumber(jsonreader.nextString()));

                case 2: // '\002'
                    return new JsonPrimitive(Boolean.valueOf(jsonreader.nextBoolean()));

                case 4: // '\004'
                    jsonreader.nextNull();
                    return JsonNull.INSTANCE;

                case 5: // '\005'
                    JsonArray jsonarray = new JsonArray();
                    jsonreader.beginArray();
                    for (; jsonreader.hasNext(); jsonarray.add(a(jsonreader))) { }
                    jsonreader.endArray();
                    return jsonarray;

                case 6: // '\006'
                    jsonobject = new JsonObject();
                    jsonreader.beginObject();
                    break;
                }
                for (; jsonreader.hasNext(); jsonobject.add(jsonreader.nextName(), a(jsonreader))) { }
                jsonreader.endObject();
                return jsonobject;
            }

            private void a(JsonWriter jsonwriter, JsonElement jsonelement)
            {
                if (jsonelement == null || jsonelement.isJsonNull())
                {
                    jsonwriter.nullValue();
                    return;
                }
                if (jsonelement.isJsonPrimitive())
                {
                    jsonelement = jsonelement.getAsJsonPrimitive();
                    if (jsonelement.isNumber())
                    {
                        jsonwriter.value(jsonelement.getAsNumber());
                        return;
                    }
                    if (jsonelement.isBoolean())
                    {
                        jsonwriter.value(jsonelement.getAsBoolean());
                        return;
                    } else
                    {
                        jsonwriter.value(jsonelement.getAsString());
                        return;
                    }
                }
                if (jsonelement.isJsonArray())
                {
                    jsonwriter.beginArray();
                    for (jsonelement = jsonelement.getAsJsonArray().iterator(); jsonelement.hasNext(); a(jsonwriter, (JsonElement)jsonelement.next())) { }
                    jsonwriter.endArray();
                    return;
                }
                if (jsonelement.isJsonObject())
                {
                    jsonwriter.beginObject();
                    java.util.Map.Entry entry;
                    for (jsonelement = jsonelement.getAsJsonObject().entrySet().iterator(); jsonelement.hasNext(); a(jsonwriter, (JsonElement)entry.getValue()))
                    {
                        entry = (java.util.Map.Entry)jsonelement.next();
                        jsonwriter.name((String)entry.getKey());
                    }

                    jsonwriter.endObject();
                    return;
                } else
                {
                    throw new IllegalArgumentException((new StringBuilder("Couldn't write ")).append(jsonelement.getClass()).toString());
                }
            }

            public final Object read(JsonReader jsonreader)
            {
                return a(jsonreader);
            }

            public final void write(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (JsonElement)obj);
            }

        };
        JSON_ELEMENT_FACTORY = newTypeHierarchyFactory(com/google/gson/JsonElement, JSON_ELEMENT);
    }
}

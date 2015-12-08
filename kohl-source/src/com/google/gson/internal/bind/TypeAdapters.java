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
import java.io.IOException;
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
    private static final class EnumTypeAdapter extends TypeAdapter
    {

        private final Map constantToName;
        private final Map nameToConstant;

        public Enum read(JsonReader jsonreader)
            throws IOException
        {
            if (jsonreader.peek() == JsonToken.NULL)
            {
                jsonreader.nextNull();
                return null;
            } else
            {
                return (Enum)nameToConstant.get(jsonreader.nextString());
            }
        }

        public volatile Object read(JsonReader jsonreader)
            throws IOException
        {
            return read(jsonreader);
        }

        public void write(JsonWriter jsonwriter, Enum enum)
            throws IOException
        {
            if (enum == null)
            {
                enum = null;
            } else
            {
                enum = (String)constantToName.get(enum);
            }
            jsonwriter.value(enum);
        }

        public volatile void write(JsonWriter jsonwriter, Object obj)
            throws IOException
        {
            write(jsonwriter, (Enum)obj);
        }

        public EnumTypeAdapter(Class class1)
        {
            nameToConstant = new HashMap();
            constantToName = new HashMap();
            String s;
            Enum aenum[];
            Enum enum;
            SerializedName serializedname;
            int i;
            int j;
            try
            {
                aenum = (Enum[])class1.getEnumConstants();
                j = aenum.length;
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                throw new AssertionError();
            }
            i = 0;
            if (i >= j)
            {
                break; /* Loop/switch isn't completed */
            }
            enum = aenum[i];
            s = enum.name();
            serializedname = (SerializedName)class1.getField(s).getAnnotation(com/google/gson/annotations/SerializedName);
            if (serializedname == null)
            {
                break MISSING_BLOCK_LABEL_88;
            }
            s = serializedname.value();
            nameToConstant.put(s, enum);
            constantToName.put(enum, s);
            i++;
            if (true) goto _L2; else goto _L1
_L2:
            break MISSING_BLOCK_LABEL_41;
_L1:
        }
    }


    public static final TypeAdapter BIG_DECIMAL = new TypeAdapter() {

        public volatile Object read(JsonReader jsonreader)
            throws IOException
        {
            return read(jsonreader);
        }

        public BigDecimal read(JsonReader jsonreader)
            throws IOException
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

        public volatile void write(JsonWriter jsonwriter, Object obj)
            throws IOException
        {
            write(jsonwriter, (BigDecimal)obj);
        }

        public void write(JsonWriter jsonwriter, BigDecimal bigdecimal)
            throws IOException
        {
            jsonwriter.value(bigdecimal);
        }

    };
    public static final TypeAdapter BIG_INTEGER = new TypeAdapter() {

        public volatile Object read(JsonReader jsonreader)
            throws IOException
        {
            return read(jsonreader);
        }

        public BigInteger read(JsonReader jsonreader)
            throws IOException
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

        public volatile void write(JsonWriter jsonwriter, Object obj)
            throws IOException
        {
            write(jsonwriter, (BigInteger)obj);
        }

        public void write(JsonWriter jsonwriter, BigInteger biginteger)
            throws IOException
        {
            jsonwriter.value(biginteger);
        }

    };
    public static final TypeAdapter BIT_SET;
    public static final TypeAdapterFactory BIT_SET_FACTORY;
    public static final TypeAdapter BOOLEAN;
    public static final TypeAdapter BOOLEAN_AS_STRING = new TypeAdapter() {

        public Boolean read(JsonReader jsonreader)
            throws IOException
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

        public volatile Object read(JsonReader jsonreader)
            throws IOException
        {
            return read(jsonreader);
        }

        public void write(JsonWriter jsonwriter, Boolean boolean1)
            throws IOException
        {
            if (boolean1 == null)
            {
                boolean1 = "null";
            } else
            {
                boolean1 = boolean1.toString();
            }
            jsonwriter.value(boolean1);
        }

        public volatile void write(JsonWriter jsonwriter, Object obj)
            throws IOException
        {
            write(jsonwriter, (Boolean)obj);
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

        public Number read(JsonReader jsonreader)
            throws IOException
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

        public volatile Object read(JsonReader jsonreader)
            throws IOException
        {
            return read(jsonreader);
        }

        public void write(JsonWriter jsonwriter, Number number)
            throws IOException
        {
            jsonwriter.value(number);
        }

        public volatile void write(JsonWriter jsonwriter, Object obj)
            throws IOException
        {
            write(jsonwriter, (Number)obj);
        }

    };
    public static final TypeAdapterFactory ENUM_FACTORY = newEnumTypeHierarchyFactory();
    public static final TypeAdapter FLOAT = new TypeAdapter() {

        public Number read(JsonReader jsonreader)
            throws IOException
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

        public volatile Object read(JsonReader jsonreader)
            throws IOException
        {
            return read(jsonreader);
        }

        public void write(JsonWriter jsonwriter, Number number)
            throws IOException
        {
            jsonwriter.value(number);
        }

        public volatile void write(JsonWriter jsonwriter, Object obj)
            throws IOException
        {
            write(jsonwriter, (Number)obj);
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

        public Number read(JsonReader jsonreader)
            throws IOException
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

        public volatile Object read(JsonReader jsonreader)
            throws IOException
        {
            return read(jsonreader);
        }

        public void write(JsonWriter jsonwriter, Number number)
            throws IOException
        {
            jsonwriter.value(number);
        }

        public volatile void write(JsonWriter jsonwriter, Object obj)
            throws IOException
        {
            write(jsonwriter, (Number)obj);
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

        public TypeAdapter create(Gson gson, TypeToken typetoken)
        {
            if (typetoken.getRawType() != java/sql/Timestamp)
            {
                return null;
            } else
            {
                return gson.getAdapter(java/util/Date). new TypeAdapter() {

                    final _cls22 this$0;
                    final TypeAdapter val$dateTypeAdapter;

                    public volatile Object read(JsonReader jsonreader)
                        throws IOException
                    {
                        return read(jsonreader);
                    }

                    public Timestamp read(JsonReader jsonreader)
                        throws IOException
                    {
                        jsonreader = (Date)dateTypeAdapter.read(jsonreader);
                        if (jsonreader != null)
                        {
                            return new Timestamp(jsonreader.getTime());
                        } else
                        {
                            return null;
                        }
                    }

                    public volatile void write(JsonWriter jsonwriter, Object obj)
                        throws IOException
                    {
                        write(jsonwriter, (Timestamp)obj);
                    }

                    public void write(JsonWriter jsonwriter, Timestamp timestamp)
                        throws IOException
                    {
                        dateTypeAdapter.write(jsonwriter, timestamp);
                    }

            
            {
                this$0 = final__pcls22;
                dateTypeAdapter = TypeAdapter.this;
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

    private TypeAdapters()
    {
    }

    public static TypeAdapterFactory newEnumTypeHierarchyFactory()
    {
        return new TypeAdapterFactory() {

            public TypeAdapter create(Gson gson, TypeToken typetoken)
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
                return new EnumTypeAdapter(gson);
            }

        };
    }

    public static TypeAdapterFactory newFactory(TypeToken typetoken, TypeAdapter typeadapter)
    {
        return new TypeAdapterFactory(typetoken, typeadapter) {

            final TypeToken val$type;
            final TypeAdapter val$typeAdapter;

            public TypeAdapter create(Gson gson, TypeToken typetoken1)
            {
                if (typetoken1.equals(type))
                {
                    return typeAdapter;
                } else
                {
                    return null;
                }
            }

            
            {
                type = typetoken;
                typeAdapter = typeadapter;
                super();
            }
        };
    }

    public static TypeAdapterFactory newFactory(Class class1, TypeAdapter typeadapter)
    {
        return new TypeAdapterFactory(class1, typeadapter) {

            final Class val$type;
            final TypeAdapter val$typeAdapter;

            public TypeAdapter create(Gson gson, TypeToken typetoken)
            {
                if (typetoken.getRawType() == type)
                {
                    return typeAdapter;
                } else
                {
                    return null;
                }
            }

            public String toString()
            {
                return (new StringBuilder()).append("Factory[type=").append(type.getName()).append(",adapter=").append(typeAdapter).append("]").toString();
            }

            
            {
                type = class1;
                typeAdapter = typeadapter;
                super();
            }
        };
    }

    public static TypeAdapterFactory newFactory(Class class1, Class class2, TypeAdapter typeadapter)
    {
        return new TypeAdapterFactory(class1, class2, typeadapter) {

            final Class val$boxed;
            final TypeAdapter val$typeAdapter;
            final Class val$unboxed;

            public TypeAdapter create(Gson gson, TypeToken typetoken)
            {
                gson = typetoken.getRawType();
                if (gson == unboxed || gson == boxed)
                {
                    return typeAdapter;
                } else
                {
                    return null;
                }
            }

            public String toString()
            {
                return (new StringBuilder()).append("Factory[type=").append(boxed.getName()).append("+").append(unboxed.getName()).append(",adapter=").append(typeAdapter).append("]").toString();
            }

            
            {
                unboxed = class1;
                boxed = class2;
                typeAdapter = typeadapter;
                super();
            }
        };
    }

    public static TypeAdapterFactory newFactoryForMultipleTypes(Class class1, Class class2, TypeAdapter typeadapter)
    {
        return new TypeAdapterFactory(class1, class2, typeadapter) {

            final Class val$base;
            final Class val$sub;
            final TypeAdapter val$typeAdapter;

            public TypeAdapter create(Gson gson, TypeToken typetoken)
            {
                gson = typetoken.getRawType();
                if (gson == base || gson == sub)
                {
                    return typeAdapter;
                } else
                {
                    return null;
                }
            }

            public String toString()
            {
                return (new StringBuilder()).append("Factory[type=").append(base.getName()).append("+").append(sub.getName()).append(",adapter=").append(typeAdapter).append("]").toString();
            }

            
            {
                base = class1;
                sub = class2;
                typeAdapter = typeadapter;
                super();
            }
        };
    }

    public static TypeAdapterFactory newTypeHierarchyFactory(Class class1, TypeAdapter typeadapter)
    {
        return new TypeAdapterFactory(class1, typeadapter) {

            final Class val$clazz;
            final TypeAdapter val$typeAdapter;

            public TypeAdapter create(Gson gson, TypeToken typetoken)
            {
                if (clazz.isAssignableFrom(typetoken.getRawType()))
                {
                    return typeAdapter;
                } else
                {
                    return null;
                }
            }

            public String toString()
            {
                return (new StringBuilder()).append("Factory[typeHierarchy=").append(clazz.getName()).append(",adapter=").append(typeAdapter).append("]").toString();
            }

            
            {
                clazz = class1;
                typeAdapter = typeadapter;
                super();
            }
        };
    }

    static 
    {
        CLASS = new TypeAdapter() {

            public Class read(JsonReader jsonreader)
                throws IOException
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

            public volatile Object read(JsonReader jsonreader)
                throws IOException
            {
                return read(jsonreader);
            }

            public void write(JsonWriter jsonwriter, Class class1)
                throws IOException
            {
                if (class1 == null)
                {
                    jsonwriter.nullValue();
                    return;
                } else
                {
                    throw new UnsupportedOperationException((new StringBuilder()).append("Attempted to serialize java.lang.Class: ").append(class1.getName()).append(". Forgot to register a type adapter?").toString());
                }
            }

            public volatile void write(JsonWriter jsonwriter, Object obj)
                throws IOException
            {
                write(jsonwriter, (Class)obj);
            }

        };
        CLASS_FACTORY = newFactory(java/lang/Class, CLASS);
        BIT_SET = new TypeAdapter() {

            public volatile Object read(JsonReader jsonreader)
                throws IOException
            {
                return read(jsonreader);
            }

            public BitSet read(JsonReader jsonreader)
                throws IOException
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
                i = 0;
                jsontoken = jsonreader.peek();
_L2:
                boolean flag;
                if (jsontoken == JsonToken.END_ARRAY)
                {
                    break MISSING_BLOCK_LABEL_209;
                }
                static class _cls32
                {

                    static final int $SwitchMap$com$google$gson$stream$JsonToken[];

                    static 
                    {
                        $SwitchMap$com$google$gson$stream$JsonToken = new int[JsonToken.values().length];
                        try
                        {
                            $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror9) { }
                        try
                        {
                            $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror8) { }
                        try
                        {
                            $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror7) { }
                        try
                        {
                            $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror6) { }
                        try
                        {
                            $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_ARRAY.ordinal()] = 5;
                        }
                        catch (NoSuchFieldError nosuchfielderror5) { }
                        try
                        {
                            $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 6;
                        }
                        catch (NoSuchFieldError nosuchfielderror4) { }
                        try
                        {
                            $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_DOCUMENT.ordinal()] = 7;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NAME.ordinal()] = 8;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_OBJECT.ordinal()] = 9;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_ARRAY.ordinal()] = 10;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (_cls32..SwitchMap.com.google.gson.stream.JsonToken[jsontoken.ordinal()])
                {
                default:
                    throw new JsonSyntaxException((new StringBuilder()).append("Invalid bitset value type: ").append(jsontoken).toString());

                case 2: // '\002'
                    break; /* Loop/switch isn't completed */

                case 3: // '\003'
                    break MISSING_BLOCK_LABEL_153;

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
                    throw new JsonSyntaxException((new StringBuilder()).append("Error: Expecting: bitset number value (1, 0), Found: ").append(s).toString());
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

            public volatile void write(JsonWriter jsonwriter, Object obj)
                throws IOException
            {
                write(jsonwriter, (BitSet)obj);
            }

            public void write(JsonWriter jsonwriter, BitSet bitset)
                throws IOException
            {
                if (bitset == null)
                {
                    jsonwriter.nullValue();
                    return;
                }
                jsonwriter.beginArray();
                int i = 0;
                while (i < bitset.length()) 
                {
                    int j;
                    if (bitset.get(i))
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

            public Boolean read(JsonReader jsonreader)
                throws IOException
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

            public volatile Object read(JsonReader jsonreader)
                throws IOException
            {
                return read(jsonreader);
            }

            public void write(JsonWriter jsonwriter, Boolean boolean1)
                throws IOException
            {
                if (boolean1 == null)
                {
                    jsonwriter.nullValue();
                    return;
                } else
                {
                    jsonwriter.value(boolean1.booleanValue());
                    return;
                }
            }

            public volatile void write(JsonWriter jsonwriter, Object obj)
                throws IOException
            {
                write(jsonwriter, (Boolean)obj);
            }

        };
        BOOLEAN_FACTORY = newFactory(Boolean.TYPE, java/lang/Boolean, BOOLEAN);
        BYTE = new TypeAdapter() {

            public Number read(JsonReader jsonreader)
                throws IOException
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

            public volatile Object read(JsonReader jsonreader)
                throws IOException
            {
                return read(jsonreader);
            }

            public void write(JsonWriter jsonwriter, Number number)
                throws IOException
            {
                jsonwriter.value(number);
            }

            public volatile void write(JsonWriter jsonwriter, Object obj)
                throws IOException
            {
                write(jsonwriter, (Number)obj);
            }

        };
        BYTE_FACTORY = newFactory(Byte.TYPE, java/lang/Byte, BYTE);
        SHORT = new TypeAdapter() {

            public Number read(JsonReader jsonreader)
                throws IOException
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

            public volatile Object read(JsonReader jsonreader)
                throws IOException
            {
                return read(jsonreader);
            }

            public void write(JsonWriter jsonwriter, Number number)
                throws IOException
            {
                jsonwriter.value(number);
            }

            public volatile void write(JsonWriter jsonwriter, Object obj)
                throws IOException
            {
                write(jsonwriter, (Number)obj);
            }

        };
        SHORT_FACTORY = newFactory(Short.TYPE, java/lang/Short, SHORT);
        INTEGER = new TypeAdapter() {

            public Number read(JsonReader jsonreader)
                throws IOException
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

            public volatile Object read(JsonReader jsonreader)
                throws IOException
            {
                return read(jsonreader);
            }

            public void write(JsonWriter jsonwriter, Number number)
                throws IOException
            {
                jsonwriter.value(number);
            }

            public volatile void write(JsonWriter jsonwriter, Object obj)
                throws IOException
            {
                write(jsonwriter, (Number)obj);
            }

        };
        INTEGER_FACTORY = newFactory(Integer.TYPE, java/lang/Integer, INTEGER);
        NUMBER = new TypeAdapter() {

            public Number read(JsonReader jsonreader)
                throws IOException
            {
                JsonToken jsontoken = jsonreader.peek();
                switch (_cls32..SwitchMap.com.google.gson.stream.JsonToken[jsontoken.ordinal()])
                {
                case 2: // '\002'
                case 3: // '\003'
                default:
                    throw new JsonSyntaxException((new StringBuilder()).append("Expecting number, got: ").append(jsontoken).toString());

                case 4: // '\004'
                    jsonreader.nextNull();
                    return null;

                case 1: // '\001'
                    return new LazilyParsedNumber(jsonreader.nextString());
                }
            }

            public volatile Object read(JsonReader jsonreader)
                throws IOException
            {
                return read(jsonreader);
            }

            public void write(JsonWriter jsonwriter, Number number)
                throws IOException
            {
                jsonwriter.value(number);
            }

            public volatile void write(JsonWriter jsonwriter, Object obj)
                throws IOException
            {
                write(jsonwriter, (Number)obj);
            }

        };
        NUMBER_FACTORY = newFactory(java/lang/Number, NUMBER);
        CHARACTER = new TypeAdapter() {

            public Character read(JsonReader jsonreader)
                throws IOException
            {
                if (jsonreader.peek() == JsonToken.NULL)
                {
                    jsonreader.nextNull();
                    return null;
                }
                jsonreader = jsonreader.nextString();
                if (jsonreader.length() != 1)
                {
                    throw new JsonSyntaxException((new StringBuilder()).append("Expecting character, got: ").append(jsonreader).toString());
                } else
                {
                    return Character.valueOf(jsonreader.charAt(0));
                }
            }

            public volatile Object read(JsonReader jsonreader)
                throws IOException
            {
                return read(jsonreader);
            }

            public void write(JsonWriter jsonwriter, Character character)
                throws IOException
            {
                if (character == null)
                {
                    character = null;
                } else
                {
                    character = String.valueOf(character);
                }
                jsonwriter.value(character);
            }

            public volatile void write(JsonWriter jsonwriter, Object obj)
                throws IOException
            {
                write(jsonwriter, (Character)obj);
            }

        };
        CHARACTER_FACTORY = newFactory(Character.TYPE, java/lang/Character, CHARACTER);
        STRING = new TypeAdapter() {

            public volatile Object read(JsonReader jsonreader)
                throws IOException
            {
                return read(jsonreader);
            }

            public String read(JsonReader jsonreader)
                throws IOException
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

            public volatile void write(JsonWriter jsonwriter, Object obj)
                throws IOException
            {
                write(jsonwriter, (String)obj);
            }

            public void write(JsonWriter jsonwriter, String s)
                throws IOException
            {
                jsonwriter.value(s);
            }

        };
        STRING_FACTORY = newFactory(java/lang/String, STRING);
        STRING_BUILDER = new TypeAdapter() {

            public volatile Object read(JsonReader jsonreader)
                throws IOException
            {
                return read(jsonreader);
            }

            public StringBuilder read(JsonReader jsonreader)
                throws IOException
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

            public volatile void write(JsonWriter jsonwriter, Object obj)
                throws IOException
            {
                write(jsonwriter, (StringBuilder)obj);
            }

            public void write(JsonWriter jsonwriter, StringBuilder stringbuilder)
                throws IOException
            {
                if (stringbuilder == null)
                {
                    stringbuilder = null;
                } else
                {
                    stringbuilder = stringbuilder.toString();
                }
                jsonwriter.value(stringbuilder);
            }

        };
        STRING_BUILDER_FACTORY = newFactory(java/lang/StringBuilder, STRING_BUILDER);
        STRING_BUFFER = new TypeAdapter() {

            public volatile Object read(JsonReader jsonreader)
                throws IOException
            {
                return read(jsonreader);
            }

            public StringBuffer read(JsonReader jsonreader)
                throws IOException
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

            public volatile void write(JsonWriter jsonwriter, Object obj)
                throws IOException
            {
                write(jsonwriter, (StringBuffer)obj);
            }

            public void write(JsonWriter jsonwriter, StringBuffer stringbuffer)
                throws IOException
            {
                if (stringbuffer == null)
                {
                    stringbuffer = null;
                } else
                {
                    stringbuffer = stringbuffer.toString();
                }
                jsonwriter.value(stringbuffer);
            }

        };
        STRING_BUFFER_FACTORY = newFactory(java/lang/StringBuffer, STRING_BUFFER);
        URL = new TypeAdapter() {

            public volatile Object read(JsonReader jsonreader)
                throws IOException
            {
                return read(jsonreader);
            }

            public URL read(JsonReader jsonreader)
                throws IOException
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

            public volatile void write(JsonWriter jsonwriter, Object obj)
                throws IOException
            {
                write(jsonwriter, (URL)obj);
            }

            public void write(JsonWriter jsonwriter, URL url)
                throws IOException
            {
                if (url == null)
                {
                    url = null;
                } else
                {
                    url = url.toExternalForm();
                }
                jsonwriter.value(url);
            }

        };
        URL_FACTORY = newFactory(java/net/URL, URL);
        URI = new TypeAdapter() {

            public volatile Object read(JsonReader jsonreader)
                throws IOException
            {
                return read(jsonreader);
            }

            public URI read(JsonReader jsonreader)
                throws IOException
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

            public volatile void write(JsonWriter jsonwriter, Object obj)
                throws IOException
            {
                write(jsonwriter, (URI)obj);
            }

            public void write(JsonWriter jsonwriter, URI uri)
                throws IOException
            {
                if (uri == null)
                {
                    uri = null;
                } else
                {
                    uri = uri.toASCIIString();
                }
                jsonwriter.value(uri);
            }

        };
        URI_FACTORY = newFactory(java/net/URI, URI);
        INET_ADDRESS = new TypeAdapter() {

            public volatile Object read(JsonReader jsonreader)
                throws IOException
            {
                return read(jsonreader);
            }

            public InetAddress read(JsonReader jsonreader)
                throws IOException
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

            public volatile void write(JsonWriter jsonwriter, Object obj)
                throws IOException
            {
                write(jsonwriter, (InetAddress)obj);
            }

            public void write(JsonWriter jsonwriter, InetAddress inetaddress)
                throws IOException
            {
                if (inetaddress == null)
                {
                    inetaddress = null;
                } else
                {
                    inetaddress = inetaddress.getHostAddress();
                }
                jsonwriter.value(inetaddress);
            }

        };
        INET_ADDRESS_FACTORY = newTypeHierarchyFactory(java/net/InetAddress, INET_ADDRESS);
        UUID = new TypeAdapter() {

            public volatile Object read(JsonReader jsonreader)
                throws IOException
            {
                return read(jsonreader);
            }

            public UUID read(JsonReader jsonreader)
                throws IOException
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

            public volatile void write(JsonWriter jsonwriter, Object obj)
                throws IOException
            {
                write(jsonwriter, (UUID)obj);
            }

            public void write(JsonWriter jsonwriter, UUID uuid)
                throws IOException
            {
                if (uuid == null)
                {
                    uuid = null;
                } else
                {
                    uuid = uuid.toString();
                }
                jsonwriter.value(uuid);
            }

        };
        UUID_FACTORY = newFactory(java/util/UUID, UUID);
        CALENDAR = new TypeAdapter() {

            private static final String DAY_OF_MONTH = "dayOfMonth";
            private static final String HOUR_OF_DAY = "hourOfDay";
            private static final String MINUTE = "minute";
            private static final String MONTH = "month";
            private static final String SECOND = "second";
            private static final String YEAR = "year";

            public volatile Object read(JsonReader jsonreader)
                throws IOException
            {
                return read(jsonreader);
            }

            public Calendar read(JsonReader jsonreader)
                throws IOException
            {
                if (jsonreader.peek() == JsonToken.NULL)
                {
                    jsonreader.nextNull();
                    return null;
                }
                jsonreader.beginObject();
                int k1 = 0;
                int j1 = 0;
                int i1 = 0;
                int l = 0;
                int k = 0;
                int j = 0;
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

            public volatile void write(JsonWriter jsonwriter, Object obj)
                throws IOException
            {
                write(jsonwriter, (Calendar)obj);
            }

            public void write(JsonWriter jsonwriter, Calendar calendar)
                throws IOException
            {
                if (calendar == null)
                {
                    jsonwriter.nullValue();
                    return;
                } else
                {
                    jsonwriter.beginObject();
                    jsonwriter.name("year");
                    jsonwriter.value(calendar.get(1));
                    jsonwriter.name("month");
                    jsonwriter.value(calendar.get(2));
                    jsonwriter.name("dayOfMonth");
                    jsonwriter.value(calendar.get(5));
                    jsonwriter.name("hourOfDay");
                    jsonwriter.value(calendar.get(11));
                    jsonwriter.name("minute");
                    jsonwriter.value(calendar.get(12));
                    jsonwriter.name("second");
                    jsonwriter.value(calendar.get(13));
                    jsonwriter.endObject();
                    return;
                }
            }

        };
        CALENDAR_FACTORY = newFactoryForMultipleTypes(java/util/Calendar, java/util/GregorianCalendar, CALENDAR);
        LOCALE = new TypeAdapter() {

            public volatile Object read(JsonReader jsonreader)
                throws IOException
            {
                return read(jsonreader);
            }

            public Locale read(JsonReader jsonreader)
                throws IOException
            {
                if (jsonreader.peek() == JsonToken.NULL)
                {
                    jsonreader.nextNull();
                    return null;
                }
                StringTokenizer stringtokenizer = new StringTokenizer(jsonreader.nextString(), "_");
                jsonreader = null;
                String s = null;
                String s1 = null;
                if (stringtokenizer.hasMoreElements())
                {
                    jsonreader = stringtokenizer.nextToken();
                }
                if (stringtokenizer.hasMoreElements())
                {
                    s = stringtokenizer.nextToken();
                }
                if (stringtokenizer.hasMoreElements())
                {
                    s1 = stringtokenizer.nextToken();
                }
                if (s == null && s1 == null)
                {
                    return new Locale(jsonreader);
                }
                if (s1 == null)
                {
                    return new Locale(jsonreader, s);
                } else
                {
                    return new Locale(jsonreader, s, s1);
                }
            }

            public volatile void write(JsonWriter jsonwriter, Object obj)
                throws IOException
            {
                write(jsonwriter, (Locale)obj);
            }

            public void write(JsonWriter jsonwriter, Locale locale)
                throws IOException
            {
                if (locale == null)
                {
                    locale = null;
                } else
                {
                    locale = locale.toString();
                }
                jsonwriter.value(locale);
            }

        };
        LOCALE_FACTORY = newFactory(java/util/Locale, LOCALE);
        JSON_ELEMENT = new TypeAdapter() {

            public JsonElement read(JsonReader jsonreader)
                throws IOException
            {
                JsonObject jsonobject;
                switch (_cls32..SwitchMap.com.google.gson.stream.JsonToken[jsonreader.peek().ordinal()])
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
                    for (; jsonreader.hasNext(); jsonarray.add(read(jsonreader))) { }
                    jsonreader.endArray();
                    return jsonarray;

                case 6: // '\006'
                    jsonobject = new JsonObject();
                    jsonreader.beginObject();
                    break;
                }
                for (; jsonreader.hasNext(); jsonobject.add(jsonreader.nextName(), read(jsonreader))) { }
                jsonreader.endObject();
                return jsonobject;
            }

            public volatile Object read(JsonReader jsonreader)
                throws IOException
            {
                return read(jsonreader);
            }

            public void write(JsonWriter jsonwriter, JsonElement jsonelement)
                throws IOException
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
                    for (jsonelement = jsonelement.getAsJsonArray().iterator(); jsonelement.hasNext(); write(jsonwriter, (JsonElement)jsonelement.next())) { }
                    jsonwriter.endArray();
                    return;
                }
                if (jsonelement.isJsonObject())
                {
                    jsonwriter.beginObject();
                    java.util.Map.Entry entry;
                    for (jsonelement = jsonelement.getAsJsonObject().entrySet().iterator(); jsonelement.hasNext(); write(jsonwriter, (JsonElement)entry.getValue()))
                    {
                        entry = (java.util.Map.Entry)jsonelement.next();
                        jsonwriter.name((String)entry.getKey());
                    }

                    jsonwriter.endObject();
                    return;
                } else
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Couldn't write ").append(jsonelement.getClass()).toString());
                }
            }

            public volatile void write(JsonWriter jsonwriter, Object obj)
                throws IOException
            {
                write(jsonwriter, (JsonElement)obj);
            }

        };
        JSON_ELEMENT_FACTORY = newTypeHierarchyFactory(com/google/gson/JsonElement, JSON_ELEMENT);
    }
}

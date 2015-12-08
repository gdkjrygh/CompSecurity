// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class TypeAdapters
{

    public static final TypeAdapter ATOMIC_BOOLEAN;
    public static final TypeAdapterFactory ATOMIC_BOOLEAN_FACTORY;
    public static final TypeAdapter ATOMIC_INTEGER;
    public static final TypeAdapter ATOMIC_INTEGER_ARRAY;
    public static final TypeAdapterFactory ATOMIC_INTEGER_ARRAY_FACTORY;
    public static final TypeAdapterFactory ATOMIC_INTEGER_FACTORY;
    public static final TypeAdapter BIG_DECIMAL = new _cls17();
    public static final TypeAdapter BIG_INTEGER = new _cls18();
    public static final TypeAdapter BIT_SET;
    public static final TypeAdapterFactory BIT_SET_FACTORY;
    public static final TypeAdapter BOOLEAN;
    public static final TypeAdapter BOOLEAN_AS_STRING = new _cls4();
    public static final TypeAdapterFactory BOOLEAN_FACTORY;
    public static final TypeAdapter BYTE;
    public static final TypeAdapterFactory BYTE_FACTORY;
    public static final TypeAdapter CALENDAR;
    public static final TypeAdapterFactory CALENDAR_FACTORY;
    public static final TypeAdapter CHARACTER;
    public static final TypeAdapterFactory CHARACTER_FACTORY;
    public static final TypeAdapter CLASS;
    public static final TypeAdapterFactory CLASS_FACTORY;
    public static final TypeAdapter CURRENCY;
    public static final TypeAdapterFactory CURRENCY_FACTORY;
    public static final TypeAdapter DOUBLE = new _cls13();
    public static final TypeAdapterFactory ENUM_FACTORY = new _cls30();
    public static final TypeAdapter FLOAT = new _cls12();
    public static final TypeAdapter INET_ADDRESS;
    public static final TypeAdapterFactory INET_ADDRESS_FACTORY;
    public static final TypeAdapter INTEGER;
    public static final TypeAdapterFactory INTEGER_FACTORY;
    public static final TypeAdapter JSON_ELEMENT;
    public static final TypeAdapterFactory JSON_ELEMENT_FACTORY;
    public static final TypeAdapter LOCALE;
    public static final TypeAdapterFactory LOCALE_FACTORY;
    public static final TypeAdapter LONG = new _cls11();
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
    public static final TypeAdapterFactory TIMESTAMP_FACTORY = new _cls26();
    public static final TypeAdapter URI;
    public static final TypeAdapterFactory URI_FACTORY;
    public static final TypeAdapter URL;
    public static final TypeAdapterFactory URL_FACTORY;
    public static final TypeAdapter UUID;
    public static final TypeAdapterFactory UUID_FACTORY;

    private TypeAdapters()
    {
        throw new UnsupportedOperationException();
    }

    public static TypeAdapterFactory newFactory(final TypeToken type, final TypeAdapter typeAdapter)
    {
        return new _cls31();
    }

    public static TypeAdapterFactory newFactory(final Class type, final TypeAdapter typeAdapter)
    {
        return new _cls32();
    }

    public static TypeAdapterFactory newFactory(final Class unboxed, final Class boxed, final TypeAdapter typeAdapter)
    {
        return new _cls33();
    }

    public static TypeAdapterFactory newFactoryForMultipleTypes(final Class base, final Class sub, final TypeAdapter typeAdapter)
    {
        return new _cls34();
    }

    public static TypeAdapterFactory newTypeHierarchyFactory(final Class clazz, final TypeAdapter typeAdapter)
    {
        return new _cls35();
    }

    static 
    {
        CLASS = new _cls1();
        CLASS_FACTORY = newFactory(java/lang/Class, CLASS);
        BIT_SET = new _cls2();
        BIT_SET_FACTORY = newFactory(java/util/BitSet, BIT_SET);
        BOOLEAN = new _cls3();
        BOOLEAN_FACTORY = newFactory(Boolean.TYPE, java/lang/Boolean, BOOLEAN);
        BYTE = new _cls5();
        BYTE_FACTORY = newFactory(Byte.TYPE, java/lang/Byte, BYTE);
        SHORT = new _cls6();
        SHORT_FACTORY = newFactory(Short.TYPE, java/lang/Short, SHORT);
        INTEGER = new _cls7();
        INTEGER_FACTORY = newFactory(Integer.TYPE, java/lang/Integer, INTEGER);
        ATOMIC_INTEGER = (new _cls8()).nullSafe();
        ATOMIC_INTEGER_FACTORY = newFactory(java/util/concurrent/atomic/AtomicInteger, ATOMIC_INTEGER);
        ATOMIC_BOOLEAN = (new _cls9()).nullSafe();
        ATOMIC_BOOLEAN_FACTORY = newFactory(java/util/concurrent/atomic/AtomicBoolean, ATOMIC_BOOLEAN);
        ATOMIC_INTEGER_ARRAY = (new _cls10()).nullSafe();
        ATOMIC_INTEGER_ARRAY_FACTORY = newFactory(java/util/concurrent/atomic/AtomicIntegerArray, ATOMIC_INTEGER_ARRAY);
        NUMBER = new _cls14();
        NUMBER_FACTORY = newFactory(java/lang/Number, NUMBER);
        CHARACTER = new _cls15();
        CHARACTER_FACTORY = newFactory(Character.TYPE, java/lang/Character, CHARACTER);
        STRING = new _cls16();
        STRING_FACTORY = newFactory(java/lang/String, STRING);
        STRING_BUILDER = new _cls19();
        STRING_BUILDER_FACTORY = newFactory(java/lang/StringBuilder, STRING_BUILDER);
        STRING_BUFFER = new _cls20();
        STRING_BUFFER_FACTORY = newFactory(java/lang/StringBuffer, STRING_BUFFER);
        URL = new _cls21();
        URL_FACTORY = newFactory(java/net/URL, URL);
        URI = new _cls22();
        URI_FACTORY = newFactory(java/net/URI, URI);
        INET_ADDRESS = new _cls23();
        INET_ADDRESS_FACTORY = newTypeHierarchyFactory(java/net/InetAddress, INET_ADDRESS);
        UUID = new _cls24();
        UUID_FACTORY = newFactory(java/util/UUID, UUID);
        CURRENCY = (new _cls25()).nullSafe();
        CURRENCY_FACTORY = newFactory(java/util/Currency, CURRENCY);
        CALENDAR = new _cls27();
        CALENDAR_FACTORY = newFactoryForMultipleTypes(java/util/Calendar, java/util/GregorianCalendar, CALENDAR);
        LOCALE = new _cls28();
        LOCALE_FACTORY = newFactory(java/util/Locale, LOCALE);
        JSON_ELEMENT = new _cls29();
        JSON_ELEMENT_FACTORY = newTypeHierarchyFactory(com/google/gson/JsonElement, JSON_ELEMENT);
    }

    private class _cls31
        implements TypeAdapterFactory
    {

        final TypeToken val$type;
        final TypeAdapter val$typeAdapter;

        public final TypeAdapter create(Gson gson, TypeToken typetoken)
        {
            if (typetoken.equals(type))
            {
                return typeAdapter;
            } else
            {
                return null;
            }
        }

        _cls31()
        {
            type = typetoken;
            typeAdapter = typeadapter;
            super();
        }
    }


    private class _cls32
        implements TypeAdapterFactory
    {

        final Class val$type;
        final TypeAdapter val$typeAdapter;

        public final TypeAdapter create(Gson gson, TypeToken typetoken)
        {
            if (typetoken.getRawType() == type)
            {
                return typeAdapter;
            } else
            {
                return null;
            }
        }

        public final String toString()
        {
            return (new StringBuilder("Factory[type=")).append(type.getName()).append(",adapter=").append(typeAdapter).append("]").toString();
        }

        _cls32()
        {
            type = class1;
            typeAdapter = typeadapter;
            super();
        }
    }


    private class _cls33
        implements TypeAdapterFactory
    {

        final Class val$boxed;
        final TypeAdapter val$typeAdapter;
        final Class val$unboxed;

        public final TypeAdapter create(Gson gson, TypeToken typetoken)
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

        public final String toString()
        {
            return (new StringBuilder("Factory[type=")).append(boxed.getName()).append("+").append(unboxed.getName()).append(",adapter=").append(typeAdapter).append("]").toString();
        }

        _cls33()
        {
            unboxed = class1;
            boxed = class2;
            typeAdapter = typeadapter;
            super();
        }
    }


    private class _cls34
        implements TypeAdapterFactory
    {

        final Class val$base;
        final Class val$sub;
        final TypeAdapter val$typeAdapter;

        public final TypeAdapter create(Gson gson, TypeToken typetoken)
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

        public final String toString()
        {
            return (new StringBuilder("Factory[type=")).append(base.getName()).append("+").append(sub.getName()).append(",adapter=").append(typeAdapter).append("]").toString();
        }

        _cls34()
        {
            base = class1;
            sub = class2;
            typeAdapter = typeadapter;
            super();
        }
    }


    private class _cls35
        implements TypeAdapterFactory
    {

        final Class val$clazz;
        final TypeAdapter val$typeAdapter;

        public final TypeAdapter create(final Gson requestedType, TypeToken typetoken)
        {
            requestedType = typetoken.getRawType();
            class _cls1 extends TypeAdapter
            {

                final _cls35 this$0;
                final Class val$requestedType;

                public Object read(JsonReader jsonreader)
                {
                    jsonreader = ((JsonReader) (typeAdapter.read(jsonreader)));
                    if (jsonreader != null && !requestedType.isInstance(jsonreader))
                    {
                        throw new JsonSyntaxException((new StringBuilder("Expected a ")).append(requestedType.getName()).append(" but was ").append(jsonreader.getClass().getName()).toString());
                    } else
                    {
                        return jsonreader;
                    }
                }

                public void write(JsonWriter jsonwriter, Object obj)
                {
                    typeAdapter.write(jsonwriter, obj);
                }

                _cls1()
                {
                    this$0 = _cls35.this;
                    requestedType = class1;
                    super();
                }
            }

            if (!clazz.isAssignableFrom(requestedType))
            {
                return null;
            } else
            {
                return new _cls1();
            }
        }

        public final String toString()
        {
            return (new StringBuilder("Factory[typeHierarchy=")).append(clazz.getName()).append(",adapter=").append(typeAdapter).append("]").toString();
        }

        _cls35()
        {
            clazz = class1;
            typeAdapter = typeadapter;
            super();
        }
    }


    private class _cls1 extends TypeAdapter
    {

        public final Class read(JsonReader jsonreader)
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

        public final volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public final void write(JsonWriter jsonwriter, Class class1)
        {
            if (class1 == null)
            {
                jsonwriter.nullValue();
                return;
            } else
            {
                throw new UnsupportedOperationException((new StringBuilder("Attempted to serialize java.lang.Class: ")).append(class1.getName()).append(". Forgot to register a type adapter?").toString());
            }
        }

        public final volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (Class)obj);
        }

        _cls1()
        {
        }
    }


    private class _cls2 extends TypeAdapter
    {

        public final volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public final BitSet read(JsonReader jsonreader)
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
                break MISSING_BLOCK_LABEL_203;
            }
            switch (_cls36..SwitchMap.com.google.gson.stream.JsonToken[jsontoken.ordinal()])
            {
            default:
                throw new JsonSyntaxException((new StringBuilder("Invalid bitset value type: ")).append(jsontoken).toString());

            case 2: // '\002'
                break; /* Loop/switch isn't completed */

            case 3: // '\003'
                break MISSING_BLOCK_LABEL_150;

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

        public final volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (BitSet)obj);
        }

        public final void write(JsonWriter jsonwriter, BitSet bitset)
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

        _cls2()
        {
        }

        private class _cls36
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

    }


    private class _cls3 extends TypeAdapter
    {

        public final Boolean read(JsonReader jsonreader)
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

        public final volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public final void write(JsonWriter jsonwriter, Boolean boolean1)
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

        public final volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (Boolean)obj);
        }

        _cls3()
        {
        }
    }


    private class _cls4 extends TypeAdapter
    {

        public final Boolean read(JsonReader jsonreader)
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

        public final volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public final void write(JsonWriter jsonwriter, Boolean boolean1)
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

        public final volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (Boolean)obj);
        }

        _cls4()
        {
        }
    }


    private class _cls5 extends TypeAdapter
    {

        public final Number read(JsonReader jsonreader)
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

        public final volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public final void write(JsonWriter jsonwriter, Number number)
        {
            jsonwriter.value(number);
        }

        public final volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (Number)obj);
        }

        _cls5()
        {
        }
    }


    private class _cls6 extends TypeAdapter
    {

        public final Number read(JsonReader jsonreader)
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

        public final volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public final void write(JsonWriter jsonwriter, Number number)
        {
            jsonwriter.value(number);
        }

        public final volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (Number)obj);
        }

        _cls6()
        {
        }
    }


    private class _cls7 extends TypeAdapter
    {

        public final Number read(JsonReader jsonreader)
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

        public final volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public final void write(JsonWriter jsonwriter, Number number)
        {
            jsonwriter.value(number);
        }

        public final volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (Number)obj);
        }

        _cls7()
        {
        }
    }


    private class _cls8 extends TypeAdapter
    {

        public final volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public final AtomicInteger read(JsonReader jsonreader)
        {
            try
            {
                jsonreader = new AtomicInteger(jsonreader.nextInt());
            }
            // Misplaced declaration of an exception variable
            catch (JsonReader jsonreader)
            {
                throw new JsonSyntaxException(jsonreader);
            }
            return jsonreader;
        }

        public final volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (AtomicInteger)obj);
        }

        public final void write(JsonWriter jsonwriter, AtomicInteger atomicinteger)
        {
            jsonwriter.value(atomicinteger.get());
        }

        _cls8()
        {
        }
    }


    private class _cls9 extends TypeAdapter
    {

        public final volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public final AtomicBoolean read(JsonReader jsonreader)
        {
            return new AtomicBoolean(jsonreader.nextBoolean());
        }

        public final volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (AtomicBoolean)obj);
        }

        public final void write(JsonWriter jsonwriter, AtomicBoolean atomicboolean)
        {
            jsonwriter.value(atomicboolean.get());
        }

        _cls9()
        {
        }
    }


    private class _cls10 extends TypeAdapter
    {

        public final volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public final AtomicIntegerArray read(JsonReader jsonreader)
        {
            ArrayList arraylist = new ArrayList();
            jsonreader.beginArray();
            while (jsonreader.hasNext()) 
            {
                try
                {
                    arraylist.add(Integer.valueOf(jsonreader.nextInt()));
                }
                // Misplaced declaration of an exception variable
                catch (JsonReader jsonreader)
                {
                    throw new JsonSyntaxException(jsonreader);
                }
            }
            jsonreader.endArray();
            int j = arraylist.size();
            jsonreader = new AtomicIntegerArray(j);
            for (int i = 0; i < j; i++)
            {
                jsonreader.set(i, ((Integer)arraylist.get(i)).intValue());
            }

            return jsonreader;
        }

        public final volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (AtomicIntegerArray)obj);
        }

        public final void write(JsonWriter jsonwriter, AtomicIntegerArray atomicintegerarray)
        {
            jsonwriter.beginArray();
            int i = 0;
            for (int j = atomicintegerarray.length(); i < j; i++)
            {
                jsonwriter.value(atomicintegerarray.get(i));
            }

            jsonwriter.endArray();
        }

        _cls10()
        {
        }
    }


    private class _cls11 extends TypeAdapter
    {

        public final Number read(JsonReader jsonreader)
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

        public final volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public final void write(JsonWriter jsonwriter, Number number)
        {
            jsonwriter.value(number);
        }

        public final volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (Number)obj);
        }

        _cls11()
        {
        }
    }


    private class _cls12 extends TypeAdapter
    {

        public final Number read(JsonReader jsonreader)
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

        public final volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public final void write(JsonWriter jsonwriter, Number number)
        {
            jsonwriter.value(number);
        }

        public final volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (Number)obj);
        }

        _cls12()
        {
        }
    }


    private class _cls13 extends TypeAdapter
    {

        public final Number read(JsonReader jsonreader)
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

        public final volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public final void write(JsonWriter jsonwriter, Number number)
        {
            jsonwriter.value(number);
        }

        public final volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (Number)obj);
        }

        _cls13()
        {
        }
    }


    private class _cls14 extends TypeAdapter
    {

        public final Number read(JsonReader jsonreader)
        {
            JsonToken jsontoken = jsonreader.peek();
            switch (_cls36..SwitchMap.com.google.gson.stream.JsonToken[jsontoken.ordinal()])
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

        public final volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public final void write(JsonWriter jsonwriter, Number number)
        {
            jsonwriter.value(number);
        }

        public final volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (Number)obj);
        }

        _cls14()
        {
        }
    }


    private class _cls15 extends TypeAdapter
    {

        public final Character read(JsonReader jsonreader)
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

        public final volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public final void write(JsonWriter jsonwriter, Character character)
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

        public final volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (Character)obj);
        }

        _cls15()
        {
        }
    }


    private class _cls16 extends TypeAdapter
    {

        public final volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public final String read(JsonReader jsonreader)
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

        public final volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (String)obj);
        }

        public final void write(JsonWriter jsonwriter, String s)
        {
            jsonwriter.value(s);
        }

        _cls16()
        {
        }
    }


    private class _cls17 extends TypeAdapter
    {

        public final volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public final BigDecimal read(JsonReader jsonreader)
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

        public final volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (BigDecimal)obj);
        }

        public final void write(JsonWriter jsonwriter, BigDecimal bigdecimal)
        {
            jsonwriter.value(bigdecimal);
        }

        _cls17()
        {
        }
    }


    private class _cls18 extends TypeAdapter
    {

        public final volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public final BigInteger read(JsonReader jsonreader)
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

        public final volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (BigInteger)obj);
        }

        public final void write(JsonWriter jsonwriter, BigInteger biginteger)
        {
            jsonwriter.value(biginteger);
        }

        _cls18()
        {
        }
    }


    private class _cls19 extends TypeAdapter
    {

        public final volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public final StringBuilder read(JsonReader jsonreader)
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

        public final volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (StringBuilder)obj);
        }

        public final void write(JsonWriter jsonwriter, StringBuilder stringbuilder)
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

        _cls19()
        {
        }
    }


    private class _cls20 extends TypeAdapter
    {

        public final volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public final StringBuffer read(JsonReader jsonreader)
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

        public final volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (StringBuffer)obj);
        }

        public final void write(JsonWriter jsonwriter, StringBuffer stringbuffer)
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

        _cls20()
        {
        }
    }


    private class _cls21 extends TypeAdapter
    {

        public final volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public final URL read(JsonReader jsonreader)
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

        public final volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (URL)obj);
        }

        public final void write(JsonWriter jsonwriter, URL url)
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

        _cls21()
        {
        }
    }


    private class _cls22 extends TypeAdapter
    {

        public final volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public final URI read(JsonReader jsonreader)
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

        public final volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (URI)obj);
        }

        public final void write(JsonWriter jsonwriter, URI uri)
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

        _cls22()
        {
        }
    }


    private class _cls23 extends TypeAdapter
    {

        public final volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public final InetAddress read(JsonReader jsonreader)
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

        public final volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (InetAddress)obj);
        }

        public final void write(JsonWriter jsonwriter, InetAddress inetaddress)
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

        _cls23()
        {
        }
    }


    private class _cls24 extends TypeAdapter
    {

        public final volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public final UUID read(JsonReader jsonreader)
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

        public final volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (UUID)obj);
        }

        public final void write(JsonWriter jsonwriter, UUID uuid)
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

        _cls24()
        {
        }
    }


    private class _cls25 extends TypeAdapter
    {

        public final volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public final Currency read(JsonReader jsonreader)
        {
            return Currency.getInstance(jsonreader.nextString());
        }

        public final volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (Currency)obj);
        }

        public final void write(JsonWriter jsonwriter, Currency currency)
        {
            jsonwriter.value(currency.getCurrencyCode());
        }

        _cls25()
        {
        }
    }


    private class _cls26
        implements TypeAdapterFactory
    {

        public final TypeAdapter create(Gson gson, TypeToken typetoken)
        {
            class _cls1 extends TypeAdapter
            {

                final _cls26 this$0;
                final TypeAdapter val$dateTypeAdapter;

                public volatile Object read(JsonReader jsonreader)
                {
                    return read(jsonreader);
                }

                public Timestamp read(JsonReader jsonreader)
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
                {
                    write(jsonwriter, (Timestamp)obj);
                }

                public void write(JsonWriter jsonwriter, Timestamp timestamp)
                {
                    dateTypeAdapter.write(jsonwriter, timestamp);
                }

                _cls1()
                {
                    this$0 = _cls26.this;
                    dateTypeAdapter = typeadapter;
                    super();
                }
            }

            if (typetoken.getRawType() != java/sql/Timestamp)
            {
                return null;
            } else
            {
                return new _cls1();
            }
        }

        _cls26()
        {
        }
    }


    private class _cls27 extends TypeAdapter
    {

        private static final String DAY_OF_MONTH = "dayOfMonth";
        private static final String HOUR_OF_DAY = "hourOfDay";
        private static final String MINUTE = "minute";
        private static final String MONTH = "month";
        private static final String SECOND = "second";
        private static final String YEAR = "year";

        public final volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public final Calendar read(JsonReader jsonreader)
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

        public final volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (Calendar)obj);
        }

        public final void write(JsonWriter jsonwriter, Calendar calendar)
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

        _cls27()
        {
        }
    }


    private class _cls28 extends TypeAdapter
    {

        public final volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public final Locale read(JsonReader jsonreader)
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

        public final volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (Locale)obj);
        }

        public final void write(JsonWriter jsonwriter, Locale locale)
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

        _cls28()
        {
        }
    }


    private class _cls29 extends TypeAdapter
    {

        public final JsonElement read(JsonReader jsonreader)
        {
            JsonObject jsonobject;
            switch (_cls36..SwitchMap.com.google.gson.stream.JsonToken[jsonreader.peek().ordinal()])
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

        public final volatile Object read(JsonReader jsonreader)
        {
            return read(jsonreader);
        }

        public final void write(JsonWriter jsonwriter, JsonElement jsonelement)
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
                throw new IllegalArgumentException((new StringBuilder("Couldn't write ")).append(jsonelement.getClass()).toString());
            }
        }

        public final volatile void write(JsonWriter jsonwriter, Object obj)
        {
            write(jsonwriter, (JsonElement)obj);
        }

        _cls29()
        {
        }
    }


    private class _cls30
        implements TypeAdapterFactory
    {

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
            return new EnumTypeAdapter(gson);
        }

        _cls30()
        {
        }

        private class EnumTypeAdapter extends TypeAdapter
        {

            private final Map constantToName;
            private final Map nameToConstant;

            public final Enum read(JsonReader jsonreader)
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

            public final volatile Object read(JsonReader jsonreader)
            {
                return read(jsonreader);
            }

            public final void write(JsonWriter jsonwriter, Enum enum)
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

            public final volatile void write(JsonWriter jsonwriter, Object obj)
            {
                write(jsonwriter, (Enum)obj);
            }

            public EnumTypeAdapter(Class class1)
            {
                nameToConstant = new HashMap();
                constantToName = new HashMap();
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
                catch (NoSuchFieldException nosuchfieldexception)
                {
                    throw new AssertionError((new StringBuilder("Missing field in ")).append(class1.getName()).toString(), nosuchfieldexception);
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
                nameToConstant.put(s, enum);
                j++;
                if (true) goto _L3; else goto _L2
_L2:
                nameToConstant.put(s, enum);
                constantToName.put(enum, s);
                i++;
                if (true) goto _L5; else goto _L4
_L5:
                break MISSING_BLOCK_LABEL_43;
_L4:
            }
        }

    }

}

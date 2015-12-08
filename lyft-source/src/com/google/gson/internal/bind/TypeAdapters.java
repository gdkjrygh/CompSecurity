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
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
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
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.UUID;

public final class TypeAdapters
{

    public static final TypeAdapter A;
    public static final TypeAdapterFactory B;
    public static final TypeAdapter C;
    public static final TypeAdapterFactory D;
    public static final TypeAdapter E;
    public static final TypeAdapterFactory F;
    public static final TypeAdapter G;
    public static final TypeAdapterFactory H;
    public static final TypeAdapter I;
    public static final TypeAdapterFactory J;
    public static final TypeAdapterFactory K = new TypeAdapterFactory() {

        public TypeAdapter create(Gson gson, TypeToken typetoken)
        {
            if (typetoken.getRawType() != java/sql/Timestamp)
            {
                return null;
            } else
            {
                return new TypeAdapter(this, gson.a(java/util/Date)) {

                    final TypeAdapter a;
                    final _cls22 b;

                    public Timestamp a(JsonReader jsonreader)
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

                    public void a(JsonWriter jsonwriter, Timestamp timestamp)
                    {
                        a.write(jsonwriter, timestamp);
                    }

                    public Object read(JsonReader jsonreader)
                    {
                        return a(jsonreader);
                    }

                    public void write(JsonWriter jsonwriter, Object obj)
                    {
                        a(jsonwriter, (Timestamp)obj);
                    }

            
            {
                b = _pcls22;
                a = typeadapter;
                super();
            }
                };
            }
        }

    };
    public static final TypeAdapter L;
    public static final TypeAdapterFactory M;
    public static final TypeAdapter N;
    public static final TypeAdapterFactory O;
    public static final TypeAdapter P;
    public static final TypeAdapterFactory Q;
    public static final TypeAdapterFactory R = new TypeAdapterFactory() {

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


        private class EnumTypeAdapter extends TypeAdapter
        {

            private final Map a;
            private final Map b;

            public Enum a(JsonReader jsonreader)
            {
                if (jsonreader.f() == JsonToken.i)
                {
                    jsonreader.j();
                    return null;
                } else
                {
                    return (Enum)a.get(jsonreader.h());
                }
            }

            public void a(JsonWriter jsonwriter, Enum enum)
            {
                if (enum == null)
                {
                    enum = null;
                } else
                {
                    enum = (String)b.get(enum);
                }
                jsonwriter.b(enum);
            }

            public Object read(JsonReader jsonreader)
            {
                return a(jsonreader);
            }

            public void write(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (Enum)obj);
            }

            public EnumTypeAdapter(Class class1)
            {
                a = new HashMap();
                b = new HashMap();
                String s1;
                Enum aenum[];
                Enum enum;
                SerializedName serializedname;
                int i1;
                int j1;
                try
                {
                    aenum = (Enum[])class1.getEnumConstants();
                    j1 = aenum.length;
                }
                // Misplaced declaration of an exception variable
                catch (Class class1)
                {
                    throw new AssertionError();
                }
                i1 = 0;
                if (i1 >= j1)
                {
                    break; /* Loop/switch isn't completed */
                }
                enum = aenum[i1];
                s1 = enum.name();
                serializedname = (SerializedName)class1.getField(s1).getAnnotation(com/google/gson/annotations/SerializedName);
                if (serializedname == null)
                {
                    break MISSING_BLOCK_LABEL_88;
                }
                s1 = serializedname.a();
                a.put(s1, enum);
                b.put(enum, s1);
                i1++;
                if (true) goto _L2; else goto _L1
_L2:
                break MISSING_BLOCK_LABEL_41;
_L1:
            }
        }

    };
    public static final TypeAdapter a;
    public static final TypeAdapterFactory b;
    public static final TypeAdapter c;
    public static final TypeAdapterFactory d;
    public static final TypeAdapter e;
    public static final TypeAdapter f = new TypeAdapter() {

        public Boolean a(JsonReader jsonreader)
        {
            if (jsonreader.f() == JsonToken.i)
            {
                jsonreader.j();
                return null;
            } else
            {
                return Boolean.valueOf(jsonreader.h());
            }
        }

        public void a(JsonWriter jsonwriter, Boolean boolean1)
        {
            if (boolean1 == null)
            {
                boolean1 = "null";
            } else
            {
                boolean1 = boolean1.toString();
            }
            jsonwriter.b(boolean1);
        }

        public Object read(JsonReader jsonreader)
        {
            return a(jsonreader);
        }

        public void write(JsonWriter jsonwriter, Object obj)
        {
            a(jsonwriter, (Boolean)obj);
        }

    };
    public static final TypeAdapterFactory g;
    public static final TypeAdapter h;
    public static final TypeAdapterFactory i;
    public static final TypeAdapter j;
    public static final TypeAdapterFactory k;
    public static final TypeAdapter l;
    public static final TypeAdapterFactory m;
    public static final TypeAdapter n = new TypeAdapter() {

        public Number a(JsonReader jsonreader)
        {
            if (jsonreader.f() == JsonToken.i)
            {
                jsonreader.j();
                return null;
            }
            long l1;
            try
            {
                l1 = jsonreader.l();
            }
            // Misplaced declaration of an exception variable
            catch (JsonReader jsonreader)
            {
                throw new JsonSyntaxException(jsonreader);
            }
            return Long.valueOf(l1);
        }

        public void a(JsonWriter jsonwriter, Number number)
        {
            jsonwriter.a(number);
        }

        public Object read(JsonReader jsonreader)
        {
            return a(jsonreader);
        }

        public void write(JsonWriter jsonwriter, Object obj)
        {
            a(jsonwriter, (Number)obj);
        }

    };
    public static final TypeAdapter o = new TypeAdapter() {

        public Number a(JsonReader jsonreader)
        {
            if (jsonreader.f() == JsonToken.i)
            {
                jsonreader.j();
                return null;
            } else
            {
                return Float.valueOf((float)jsonreader.k());
            }
        }

        public void a(JsonWriter jsonwriter, Number number)
        {
            jsonwriter.a(number);
        }

        public Object read(JsonReader jsonreader)
        {
            return a(jsonreader);
        }

        public void write(JsonWriter jsonwriter, Object obj)
        {
            a(jsonwriter, (Number)obj);
        }

    };
    public static final TypeAdapter p = new TypeAdapter() {

        public Number a(JsonReader jsonreader)
        {
            if (jsonreader.f() == JsonToken.i)
            {
                jsonreader.j();
                return null;
            } else
            {
                return Double.valueOf(jsonreader.k());
            }
        }

        public void a(JsonWriter jsonwriter, Number number)
        {
            jsonwriter.a(number);
        }

        public Object read(JsonReader jsonreader)
        {
            return a(jsonreader);
        }

        public void write(JsonWriter jsonwriter, Object obj)
        {
            a(jsonwriter, (Number)obj);
        }

    };
    public static final TypeAdapter q;
    public static final TypeAdapterFactory r;
    public static final TypeAdapter s;
    public static final TypeAdapterFactory t;
    public static final TypeAdapter u;
    public static final TypeAdapter v = new TypeAdapter() {

        public BigDecimal a(JsonReader jsonreader)
        {
            if (jsonreader.f() == JsonToken.i)
            {
                jsonreader.j();
                return null;
            }
            try
            {
                jsonreader = new BigDecimal(jsonreader.h());
            }
            // Misplaced declaration of an exception variable
            catch (JsonReader jsonreader)
            {
                throw new JsonSyntaxException(jsonreader);
            }
            return jsonreader;
        }

        public void a(JsonWriter jsonwriter, BigDecimal bigdecimal)
        {
            jsonwriter.a(bigdecimal);
        }

        public Object read(JsonReader jsonreader)
        {
            return a(jsonreader);
        }

        public void write(JsonWriter jsonwriter, Object obj)
        {
            a(jsonwriter, (BigDecimal)obj);
        }

    };
    public static final TypeAdapter w = new TypeAdapter() {

        public BigInteger a(JsonReader jsonreader)
        {
            if (jsonreader.f() == JsonToken.i)
            {
                jsonreader.j();
                return null;
            }
            try
            {
                jsonreader = new BigInteger(jsonreader.h());
            }
            // Misplaced declaration of an exception variable
            catch (JsonReader jsonreader)
            {
                throw new JsonSyntaxException(jsonreader);
            }
            return jsonreader;
        }

        public void a(JsonWriter jsonwriter, BigInteger biginteger)
        {
            jsonwriter.a(biginteger);
        }

        public Object read(JsonReader jsonreader)
        {
            return a(jsonreader);
        }

        public void write(JsonWriter jsonwriter, Object obj)
        {
            a(jsonwriter, (BigInteger)obj);
        }

    };
    public static final TypeAdapterFactory x;
    public static final TypeAdapter y;
    public static final TypeAdapterFactory z;

    public static TypeAdapterFactory a(TypeToken typetoken, TypeAdapter typeadapter)
    {
        return new TypeAdapterFactory(typetoken, typeadapter) {

            final TypeToken a;
            final TypeAdapter b;

            public TypeAdapter create(Gson gson, TypeToken typetoken1)
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

    public static TypeAdapterFactory a(Class class1, TypeAdapter typeadapter)
    {
        return new TypeAdapterFactory(class1, typeadapter) {

            final Class a;
            final TypeAdapter b;

            public TypeAdapter create(Gson gson, TypeToken typetoken)
            {
                if (typetoken.getRawType() == a)
                {
                    return b;
                } else
                {
                    return null;
                }
            }

            public String toString()
            {
                return (new StringBuilder()).append("Factory[type=").append(a.getName()).append(",adapter=").append(b).append("]").toString();
            }

            
            {
                a = class1;
                b = typeadapter;
                super();
            }
        };
    }

    public static TypeAdapterFactory a(Class class1, Class class2, TypeAdapter typeadapter)
    {
        return new TypeAdapterFactory(class1, class2, typeadapter) {

            final Class a;
            final Class b;
            final TypeAdapter c;

            public TypeAdapter create(Gson gson, TypeToken typetoken)
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

            public String toString()
            {
                return (new StringBuilder()).append("Factory[type=").append(b.getName()).append("+").append(a.getName()).append(",adapter=").append(c).append("]").toString();
            }

            
            {
                a = class1;
                b = class2;
                c = typeadapter;
                super();
            }
        };
    }

    public static TypeAdapterFactory b(Class class1, TypeAdapter typeadapter)
    {
        return new TypeAdapterFactory(class1, typeadapter) {

            final Class a;
            final TypeAdapter b;

            public TypeAdapter create(Gson gson, TypeToken typetoken)
            {
                if (a.isAssignableFrom(typetoken.getRawType()))
                {
                    return b;
                } else
                {
                    return null;
                }
            }

            public String toString()
            {
                return (new StringBuilder()).append("Factory[typeHierarchy=").append(a.getName()).append(",adapter=").append(b).append("]").toString();
            }

            
            {
                a = class1;
                b = typeadapter;
                super();
            }
        };
    }

    public static TypeAdapterFactory b(Class class1, Class class2, TypeAdapter typeadapter)
    {
        return new TypeAdapterFactory(class1, class2, typeadapter) {

            final Class a;
            final Class b;
            final TypeAdapter c;

            public TypeAdapter create(Gson gson, TypeToken typetoken)
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

            public String toString()
            {
                return (new StringBuilder()).append("Factory[type=").append(a.getName()).append("+").append(b.getName()).append(",adapter=").append(c).append("]").toString();
            }

            
            {
                a = class1;
                b = class2;
                c = typeadapter;
                super();
            }
        };
    }

    static 
    {
        a = new TypeAdapter() {

            public Class a(JsonReader jsonreader)
            {
                if (jsonreader.f() == JsonToken.i)
                {
                    jsonreader.j();
                    return null;
                } else
                {
                    throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
                }
            }

            public void a(JsonWriter jsonwriter, Class class1)
            {
                if (class1 == null)
                {
                    jsonwriter.f();
                    return;
                } else
                {
                    throw new UnsupportedOperationException((new StringBuilder()).append("Attempted to serialize java.lang.Class: ").append(class1.getName()).append(". Forgot to register a type adapter?").toString());
                }
            }

            public Object read(JsonReader jsonreader)
            {
                return a(jsonreader);
            }

            public void write(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (Class)obj);
            }

        };
        b = a(java/lang/Class, a);
        c = new TypeAdapter() {

            public BitSet a(JsonReader jsonreader)
            {
                JsonToken jsontoken;
                BitSet bitset;
                int i1;
                if (jsonreader.f() == JsonToken.i)
                {
                    jsonreader.j();
                    return null;
                }
                bitset = new BitSet();
                jsonreader.a();
                jsontoken = jsonreader.f();
                i1 = 0;
_L2:
                boolean flag;
                if (jsontoken == JsonToken.b)
                {
                    break MISSING_BLOCK_LABEL_209;
                }
                class _cls32
                {

                    static final int a[];

                    static 
                    {
                        a = new int[JsonToken.values().length];
                        try
                        {
                            a[JsonToken.g.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror9) { }
                        try
                        {
                            a[JsonToken.h.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror8) { }
                        try
                        {
                            a[JsonToken.f.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror7) { }
                        try
                        {
                            a[JsonToken.i.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror6) { }
                        try
                        {
                            a[JsonToken.a.ordinal()] = 5;
                        }
                        catch (NoSuchFieldError nosuchfielderror5) { }
                        try
                        {
                            a[JsonToken.c.ordinal()] = 6;
                        }
                        catch (NoSuchFieldError nosuchfielderror4) { }
                        try
                        {
                            a[JsonToken.j.ordinal()] = 7;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            a[JsonToken.e.ordinal()] = 8;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            a[JsonToken.d.ordinal()] = 9;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[JsonToken.b.ordinal()] = 10;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (_cls32.a[jsontoken.ordinal()])
                {
                default:
                    throw new JsonSyntaxException((new StringBuilder()).append("Invalid bitset value type: ").append(jsontoken).toString());

                case 2: // '\002'
                    break; /* Loop/switch isn't completed */

                case 3: // '\003'
                    break MISSING_BLOCK_LABEL_153;

                case 1: // '\001'
                    if (jsonreader.m() != 0)
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
                    bitset.set(i1);
                }
                i1++;
                jsontoken = jsonreader.f();
                if (true) goto _L2; else goto _L1
_L1:
                flag = jsonreader.i();
                  goto _L3
                String s1 = jsonreader.h();
                int j1;
                try
                {
                    j1 = Integer.parseInt(s1);
                }
                // Misplaced declaration of an exception variable
                catch (JsonReader jsonreader)
                {
                    throw new JsonSyntaxException((new StringBuilder()).append("Error: Expecting: bitset number value (1, 0), Found: ").append(s1).toString());
                }
                if (j1 != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                  goto _L3
                jsonreader.b();
                return bitset;
            }

            public void a(JsonWriter jsonwriter, BitSet bitset)
            {
                if (bitset == null)
                {
                    jsonwriter.f();
                    return;
                }
                jsonwriter.b();
                int i1 = 0;
                while (i1 < bitset.length()) 
                {
                    int j1;
                    if (bitset.get(i1))
                    {
                        j1 = 1;
                    } else
                    {
                        j1 = 0;
                    }
                    jsonwriter.a(j1);
                    i1++;
                }
                jsonwriter.c();
            }

            public Object read(JsonReader jsonreader)
            {
                return a(jsonreader);
            }

            public void write(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (BitSet)obj);
            }

        };
        d = a(java/util/BitSet, c);
        e = new TypeAdapter() {

            public Boolean a(JsonReader jsonreader)
            {
                if (jsonreader.f() == JsonToken.i)
                {
                    jsonreader.j();
                    return null;
                }
                if (jsonreader.f() == JsonToken.f)
                {
                    return Boolean.valueOf(Boolean.parseBoolean(jsonreader.h()));
                } else
                {
                    return Boolean.valueOf(jsonreader.i());
                }
            }

            public void a(JsonWriter jsonwriter, Boolean boolean1)
            {
                if (boolean1 == null)
                {
                    jsonwriter.f();
                    return;
                } else
                {
                    jsonwriter.a(boolean1.booleanValue());
                    return;
                }
            }

            public Object read(JsonReader jsonreader)
            {
                return a(jsonreader);
            }

            public void write(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (Boolean)obj);
            }

        };
        g = a(Boolean.TYPE, java/lang/Boolean, e);
        h = new TypeAdapter() {

            public Number a(JsonReader jsonreader)
            {
                if (jsonreader.f() == JsonToken.i)
                {
                    jsonreader.j();
                    return null;
                }
                byte byte0;
                try
                {
                    byte0 = (byte)jsonreader.m();
                }
                // Misplaced declaration of an exception variable
                catch (JsonReader jsonreader)
                {
                    throw new JsonSyntaxException(jsonreader);
                }
                return Byte.valueOf(byte0);
            }

            public void a(JsonWriter jsonwriter, Number number)
            {
                jsonwriter.a(number);
            }

            public Object read(JsonReader jsonreader)
            {
                return a(jsonreader);
            }

            public void write(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (Number)obj);
            }

        };
        i = a(Byte.TYPE, java/lang/Byte, h);
        j = new TypeAdapter() {

            public Number a(JsonReader jsonreader)
            {
                if (jsonreader.f() == JsonToken.i)
                {
                    jsonreader.j();
                    return null;
                }
                short word0;
                try
                {
                    word0 = (short)jsonreader.m();
                }
                // Misplaced declaration of an exception variable
                catch (JsonReader jsonreader)
                {
                    throw new JsonSyntaxException(jsonreader);
                }
                return Short.valueOf(word0);
            }

            public void a(JsonWriter jsonwriter, Number number)
            {
                jsonwriter.a(number);
            }

            public Object read(JsonReader jsonreader)
            {
                return a(jsonreader);
            }

            public void write(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (Number)obj);
            }

        };
        k = a(Short.TYPE, java/lang/Short, j);
        l = new TypeAdapter() {

            public Number a(JsonReader jsonreader)
            {
                if (jsonreader.f() == JsonToken.i)
                {
                    jsonreader.j();
                    return null;
                }
                int i1;
                try
                {
                    i1 = jsonreader.m();
                }
                // Misplaced declaration of an exception variable
                catch (JsonReader jsonreader)
                {
                    throw new JsonSyntaxException(jsonreader);
                }
                return Integer.valueOf(i1);
            }

            public void a(JsonWriter jsonwriter, Number number)
            {
                jsonwriter.a(number);
            }

            public Object read(JsonReader jsonreader)
            {
                return a(jsonreader);
            }

            public void write(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (Number)obj);
            }

        };
        m = a(Integer.TYPE, java/lang/Integer, l);
        q = new TypeAdapter() {

            public Number a(JsonReader jsonreader)
            {
                JsonToken jsontoken = jsonreader.f();
                switch (_cls32.a[jsontoken.ordinal()])
                {
                case 2: // '\002'
                case 3: // '\003'
                default:
                    throw new JsonSyntaxException((new StringBuilder()).append("Expecting number, got: ").append(jsontoken).toString());

                case 4: // '\004'
                    jsonreader.j();
                    return null;

                case 1: // '\001'
                    return new LazilyParsedNumber(jsonreader.h());
                }
            }

            public void a(JsonWriter jsonwriter, Number number)
            {
                jsonwriter.a(number);
            }

            public Object read(JsonReader jsonreader)
            {
                return a(jsonreader);
            }

            public void write(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (Number)obj);
            }

        };
        r = a(java/lang/Number, q);
        s = new TypeAdapter() {

            public Character a(JsonReader jsonreader)
            {
                if (jsonreader.f() == JsonToken.i)
                {
                    jsonreader.j();
                    return null;
                }
                jsonreader = jsonreader.h();
                if (jsonreader.length() != 1)
                {
                    throw new JsonSyntaxException((new StringBuilder()).append("Expecting character, got: ").append(jsonreader).toString());
                } else
                {
                    return Character.valueOf(jsonreader.charAt(0));
                }
            }

            public void a(JsonWriter jsonwriter, Character character)
            {
                if (character == null)
                {
                    character = null;
                } else
                {
                    character = String.valueOf(character);
                }
                jsonwriter.b(character);
            }

            public Object read(JsonReader jsonreader)
            {
                return a(jsonreader);
            }

            public void write(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (Character)obj);
            }

        };
        t = a(Character.TYPE, java/lang/Character, s);
        u = new TypeAdapter() {

            public String a(JsonReader jsonreader)
            {
                JsonToken jsontoken = jsonreader.f();
                if (jsontoken == JsonToken.i)
                {
                    jsonreader.j();
                    return null;
                }
                if (jsontoken == JsonToken.h)
                {
                    return Boolean.toString(jsonreader.i());
                } else
                {
                    return jsonreader.h();
                }
            }

            public void a(JsonWriter jsonwriter, String s1)
            {
                jsonwriter.b(s1);
            }

            public Object read(JsonReader jsonreader)
            {
                return a(jsonreader);
            }

            public void write(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (String)obj);
            }

        };
        x = a(java/lang/String, u);
        y = new TypeAdapter() {

            public StringBuilder a(JsonReader jsonreader)
            {
                if (jsonreader.f() == JsonToken.i)
                {
                    jsonreader.j();
                    return null;
                } else
                {
                    return new StringBuilder(jsonreader.h());
                }
            }

            public void a(JsonWriter jsonwriter, StringBuilder stringbuilder)
            {
                if (stringbuilder == null)
                {
                    stringbuilder = null;
                } else
                {
                    stringbuilder = stringbuilder.toString();
                }
                jsonwriter.b(stringbuilder);
            }

            public Object read(JsonReader jsonreader)
            {
                return a(jsonreader);
            }

            public void write(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (StringBuilder)obj);
            }

        };
        z = a(java/lang/StringBuilder, y);
        A = new TypeAdapter() {

            public StringBuffer a(JsonReader jsonreader)
            {
                if (jsonreader.f() == JsonToken.i)
                {
                    jsonreader.j();
                    return null;
                } else
                {
                    return new StringBuffer(jsonreader.h());
                }
            }

            public void a(JsonWriter jsonwriter, StringBuffer stringbuffer)
            {
                if (stringbuffer == null)
                {
                    stringbuffer = null;
                } else
                {
                    stringbuffer = stringbuffer.toString();
                }
                jsonwriter.b(stringbuffer);
            }

            public Object read(JsonReader jsonreader)
            {
                return a(jsonreader);
            }

            public void write(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (StringBuffer)obj);
            }

        };
        B = a(java/lang/StringBuffer, A);
        C = new TypeAdapter() {

            public URL a(JsonReader jsonreader)
            {
                if (jsonreader.f() == JsonToken.i)
                {
                    jsonreader.j();
                } else
                {
                    jsonreader = jsonreader.h();
                    if (!"null".equals(jsonreader))
                    {
                        return new URL(jsonreader);
                    }
                }
                return null;
            }

            public void a(JsonWriter jsonwriter, URL url)
            {
                if (url == null)
                {
                    url = null;
                } else
                {
                    url = url.toExternalForm();
                }
                jsonwriter.b(url);
            }

            public Object read(JsonReader jsonreader)
            {
                return a(jsonreader);
            }

            public void write(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (URL)obj);
            }

        };
        D = a(java/net/URL, C);
        E = new TypeAdapter() {

            public URI a(JsonReader jsonreader)
            {
                if (jsonreader.f() != JsonToken.i) goto _L2; else goto _L1
_L1:
                jsonreader.j();
_L4:
                return null;
_L2:
                jsonreader = jsonreader.h();
                if ("null".equals(jsonreader)) goto _L4; else goto _L3
_L3:
                jsonreader = new URI(jsonreader);
                return jsonreader;
                jsonreader;
                throw new JsonIOException(jsonreader);
            }

            public void a(JsonWriter jsonwriter, URI uri)
            {
                if (uri == null)
                {
                    uri = null;
                } else
                {
                    uri = uri.toASCIIString();
                }
                jsonwriter.b(uri);
            }

            public Object read(JsonReader jsonreader)
            {
                return a(jsonreader);
            }

            public void write(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (URI)obj);
            }

        };
        F = a(java/net/URI, E);
        G = new TypeAdapter() {

            public InetAddress a(JsonReader jsonreader)
            {
                if (jsonreader.f() == JsonToken.i)
                {
                    jsonreader.j();
                    return null;
                } else
                {
                    return InetAddress.getByName(jsonreader.h());
                }
            }

            public void a(JsonWriter jsonwriter, InetAddress inetaddress)
            {
                if (inetaddress == null)
                {
                    inetaddress = null;
                } else
                {
                    inetaddress = inetaddress.getHostAddress();
                }
                jsonwriter.b(inetaddress);
            }

            public Object read(JsonReader jsonreader)
            {
                return a(jsonreader);
            }

            public void write(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (InetAddress)obj);
            }

        };
        H = b(java/net/InetAddress, G);
        I = new TypeAdapter() {

            public UUID a(JsonReader jsonreader)
            {
                if (jsonreader.f() == JsonToken.i)
                {
                    jsonreader.j();
                    return null;
                } else
                {
                    return UUID.fromString(jsonreader.h());
                }
            }

            public void a(JsonWriter jsonwriter, UUID uuid)
            {
                if (uuid == null)
                {
                    uuid = null;
                } else
                {
                    uuid = uuid.toString();
                }
                jsonwriter.b(uuid);
            }

            public Object read(JsonReader jsonreader)
            {
                return a(jsonreader);
            }

            public void write(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (UUID)obj);
            }

        };
        J = a(java/util/UUID, I);
        L = new TypeAdapter() {

            public Calendar a(JsonReader jsonreader)
            {
                int j1 = 0;
                if (jsonreader.f() == JsonToken.i)
                {
                    jsonreader.j();
                    return null;
                }
                jsonreader.c();
                int k1 = 0;
                int l1 = 0;
                int i2 = 0;
                int j2 = 0;
                int k2 = 0;
                do
                {
                    if (jsonreader.f() == JsonToken.d)
                    {
                        break;
                    }
                    String s1 = jsonreader.g();
                    int i1 = jsonreader.m();
                    if ("year".equals(s1))
                    {
                        k2 = i1;
                    } else
                    if ("month".equals(s1))
                    {
                        j2 = i1;
                    } else
                    if ("dayOfMonth".equals(s1))
                    {
                        i2 = i1;
                    } else
                    if ("hourOfDay".equals(s1))
                    {
                        l1 = i1;
                    } else
                    if ("minute".equals(s1))
                    {
                        k1 = i1;
                    } else
                    if ("second".equals(s1))
                    {
                        j1 = i1;
                    }
                } while (true);
                jsonreader.d();
                return new GregorianCalendar(k2, j2, i2, l1, k1, j1);
            }

            public void a(JsonWriter jsonwriter, Calendar calendar)
            {
                if (calendar == null)
                {
                    jsonwriter.f();
                    return;
                } else
                {
                    jsonwriter.d();
                    jsonwriter.a("year");
                    jsonwriter.a(calendar.get(1));
                    jsonwriter.a("month");
                    jsonwriter.a(calendar.get(2));
                    jsonwriter.a("dayOfMonth");
                    jsonwriter.a(calendar.get(5));
                    jsonwriter.a("hourOfDay");
                    jsonwriter.a(calendar.get(11));
                    jsonwriter.a("minute");
                    jsonwriter.a(calendar.get(12));
                    jsonwriter.a("second");
                    jsonwriter.a(calendar.get(13));
                    jsonwriter.e();
                    return;
                }
            }

            public Object read(JsonReader jsonreader)
            {
                return a(jsonreader);
            }

            public void write(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (Calendar)obj);
            }

        };
        M = b(java/util/Calendar, java/util/GregorianCalendar, L);
        N = new TypeAdapter() {

            public Locale a(JsonReader jsonreader)
            {
                if (jsonreader.f() == JsonToken.i)
                {
                    jsonreader.j();
                    return null;
                }
                Object obj = new StringTokenizer(jsonreader.h(), "_");
                String s1;
                if (((StringTokenizer) (obj)).hasMoreElements())
                {
                    jsonreader = ((StringTokenizer) (obj)).nextToken();
                } else
                {
                    jsonreader = null;
                }
                if (((StringTokenizer) (obj)).hasMoreElements())
                {
                    s1 = ((StringTokenizer) (obj)).nextToken();
                } else
                {
                    s1 = null;
                }
                if (((StringTokenizer) (obj)).hasMoreElements())
                {
                    obj = ((StringTokenizer) (obj)).nextToken();
                } else
                {
                    obj = null;
                }
                if (s1 == null && obj == null)
                {
                    return new Locale(jsonreader);
                }
                if (obj == null)
                {
                    return new Locale(jsonreader, s1);
                } else
                {
                    return new Locale(jsonreader, s1, ((String) (obj)));
                }
            }

            public void a(JsonWriter jsonwriter, Locale locale)
            {
                if (locale == null)
                {
                    locale = null;
                } else
                {
                    locale = locale.toString();
                }
                jsonwriter.b(locale);
            }

            public Object read(JsonReader jsonreader)
            {
                return a(jsonreader);
            }

            public void write(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (Locale)obj);
            }

        };
        O = a(java/util/Locale, N);
        P = new TypeAdapter() {

            public JsonElement a(JsonReader jsonreader)
            {
                JsonObject jsonobject;
                switch (_cls32.a[jsonreader.f().ordinal()])
                {
                default:
                    throw new IllegalArgumentException();

                case 3: // '\003'
                    return new JsonPrimitive(jsonreader.h());

                case 1: // '\001'
                    return new JsonPrimitive(new LazilyParsedNumber(jsonreader.h()));

                case 2: // '\002'
                    return new JsonPrimitive(Boolean.valueOf(jsonreader.i()));

                case 4: // '\004'
                    jsonreader.j();
                    return JsonNull.a;

                case 5: // '\005'
                    JsonArray jsonarray = new JsonArray();
                    jsonreader.a();
                    for (; jsonreader.e(); jsonarray.a(a(jsonreader))) { }
                    jsonreader.b();
                    return jsonarray;

                case 6: // '\006'
                    jsonobject = new JsonObject();
                    jsonreader.c();
                    break;
                }
                for (; jsonreader.e(); jsonobject.a(jsonreader.g(), a(jsonreader))) { }
                jsonreader.d();
                return jsonobject;
            }

            public void a(JsonWriter jsonwriter, JsonElement jsonelement)
            {
                if (jsonelement == null || jsonelement.k())
                {
                    jsonwriter.f();
                    return;
                }
                if (jsonelement.j())
                {
                    jsonelement = jsonelement.n();
                    if (jsonelement.p())
                    {
                        jsonwriter.a(jsonelement.b());
                        return;
                    }
                    if (jsonelement.a())
                    {
                        jsonwriter.a(jsonelement.g());
                        return;
                    } else
                    {
                        jsonwriter.b(jsonelement.c());
                        return;
                    }
                }
                if (jsonelement.h())
                {
                    jsonwriter.b();
                    for (jsonelement = jsonelement.m().iterator(); jsonelement.hasNext(); a(jsonwriter, (JsonElement)jsonelement.next())) { }
                    jsonwriter.c();
                    return;
                }
                if (jsonelement.i())
                {
                    jsonwriter.d();
                    java.util.Map.Entry entry;
                    for (jsonelement = jsonelement.l().a().iterator(); jsonelement.hasNext(); a(jsonwriter, (JsonElement)entry.getValue()))
                    {
                        entry = (java.util.Map.Entry)jsonelement.next();
                        jsonwriter.a((String)entry.getKey());
                    }

                    jsonwriter.e();
                    return;
                } else
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Couldn't write ").append(jsonelement.getClass()).toString());
                }
            }

            public Object read(JsonReader jsonreader)
            {
                return a(jsonreader);
            }

            public void write(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (JsonElement)obj);
            }

        };
        Q = b(com/google/gson/JsonElement, P);
    }
}

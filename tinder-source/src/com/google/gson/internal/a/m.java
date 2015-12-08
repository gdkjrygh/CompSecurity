// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.a;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.a.c;
import com.google.gson.e;
import com.google.gson.h;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.r;
import com.google.gson.s;
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

public final class m
{
    private static final class a extends r
    {

        private final Map a;
        private final Map b;

        public final Object a(JsonReader jsonreader)
            throws IOException
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

        public final void a(JsonWriter jsonwriter, Object obj)
            throws IOException
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
            String s1;
            Enum aenum[];
            Enum enum;
            c c1;
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
            c1 = (c)class1.getField(s1).getAnnotation(com/google/gson/a/c);
            if (c1 == null)
            {
                break MISSING_BLOCK_LABEL_88;
            }
            s1 = c1.a();
            a.put(s1, enum);
            b.put(enum, s1);
            i1++;
            if (true) goto _L2; else goto _L1
_L2:
            break MISSING_BLOCK_LABEL_41;
_L1:
        }
    }


    public static final r A;
    public static final s B;
    public static final r C;
    public static final s D;
    public static final r E;
    public static final s F;
    public static final r G;
    public static final s H;
    public static final r I;
    public static final s J;
    public static final s K = new s() {

        public final r a(e e1, com.google.gson.b.a a1)
        {
            if (a1.a != java/sql/Timestamp)
            {
                return null;
            } else
            {
                return new r(this, e1.a(java/util/Date)) {

                    final r a;
                    final _cls15 b;

                    public final Object a(JsonReader jsonreader)
                        throws IOException
                    {
                        jsonreader = (Date)a.a(jsonreader);
                        if (jsonreader != null)
                        {
                            return new Timestamp(jsonreader.getTime());
                        } else
                        {
                            return null;
                        }
                    }

                    public final volatile void a(JsonWriter jsonwriter, Object obj)
                        throws IOException
                    {
                        obj = (Timestamp)obj;
                        a.a(jsonwriter, obj);
                    }

            
            {
                b = _pcls15;
                a = r1;
                super();
            }
                };
            }
        }

    };
    public static final r L;
    public static final s M;
    public static final r N;
    public static final s O;
    public static final r P;
    public static final s Q;
    public static final s R = new s() {

        public final r a(e e1, com.google.gson.b.a a1)
        {
            a1 = a1.a;
            if (!java/lang/Enum.isAssignableFrom(a1) || a1 == java/lang/Enum)
            {
                return null;
            }
            e1 = a1;
            if (!a1.isEnum())
            {
                e1 = a1.getSuperclass();
            }
            return new a(e1);
        }

    };
    public static final r a;
    public static final s b;
    public static final r c;
    public static final s d;
    public static final r e;
    public static final r f = new r() {

        public final Object a(JsonReader jsonreader)
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

        public final void a(JsonWriter jsonwriter, Object obj)
            throws IOException
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
    public static final s g;
    public static final r h;
    public static final s i;
    public static final r j;
    public static final s k;
    public static final r l;
    public static final s m;
    public static final r n = new r() {

        private static Number b(JsonReader jsonreader)
            throws IOException
        {
            if (jsonreader.peek() == JsonToken.NULL)
            {
                jsonreader.nextNull();
                return null;
            }
            long l1;
            try
            {
                l1 = jsonreader.nextLong();
            }
            // Misplaced declaration of an exception variable
            catch (JsonReader jsonreader)
            {
                throw new JsonSyntaxException(jsonreader);
            }
            return Long.valueOf(l1);
        }

        public final Object a(JsonReader jsonreader)
            throws IOException
        {
            return b(jsonreader);
        }

        public final void a(JsonWriter jsonwriter, Object obj)
            throws IOException
        {
            jsonwriter.value((Number)obj);
        }

    };
    public static final r o = new r() {

        public final Object a(JsonReader jsonreader)
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

        public final void a(JsonWriter jsonwriter, Object obj)
            throws IOException
        {
            jsonwriter.value((Number)obj);
        }

    };
    public static final r p = new r() {

        public final Object a(JsonReader jsonreader)
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

        public final void a(JsonWriter jsonwriter, Object obj)
            throws IOException
        {
            jsonwriter.value((Number)obj);
        }

    };
    public static final r q;
    public static final s r;
    public static final r s;
    public static final s t;
    public static final r u;
    public static final r v = new r() {

        private static BigDecimal b(JsonReader jsonreader)
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

        public final Object a(JsonReader jsonreader)
            throws IOException
        {
            return b(jsonreader);
        }

        public final void a(JsonWriter jsonwriter, Object obj)
            throws IOException
        {
            jsonwriter.value((BigDecimal)obj);
        }

    };
    public static final r w = new r() {

        private static BigInteger b(JsonReader jsonreader)
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

        public final Object a(JsonReader jsonreader)
            throws IOException
        {
            return b(jsonreader);
        }

        public final void a(JsonWriter jsonwriter, Object obj)
            throws IOException
        {
            jsonwriter.value((BigInteger)obj);
        }

    };
    public static final s x;
    public static final r y;
    public static final s z;

    public static s a(Class class1, r r1)
    {
        return new s(class1, r1) {

            final Class a;
            final r b;

            public final r a(e e1, com.google.gson.b.a a1)
            {
                if (a1.a == a)
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
                b = r1;
                super();
            }
        };
    }

    public static s a(Class class1, Class class2, r r1)
    {
        return new s(class1, class2, r1) {

            final Class a;
            final Class b;
            final r c;

            public final r a(e e1, com.google.gson.b.a a1)
            {
                e1 = a1.a;
                if (e1 == a || e1 == b)
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
                c = r1;
                super();
            }
        };
    }

    private static s b(Class class1, r r1)
    {
        return new s(class1, r1) {

            final Class a;
            final r b;

            public final r a(e e1, com.google.gson.b.a a1)
            {
                if (a.isAssignableFrom(a1.a))
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
                b = r1;
                super();
            }
        };
    }

    static 
    {
        a = new r() {

            public final Object a(JsonReader jsonreader)
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

            public final void a(JsonWriter jsonwriter, Object obj)
                throws IOException
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
        b = a(java/lang/Class, a);
        c = new r() {

            private static BitSet b(JsonReader jsonreader)
                throws IOException
            {
                JsonToken jsontoken;
                BitSet bitset;
                int i1;
                if (jsonreader.peek() == JsonToken.NULL)
                {
                    jsonreader.nextNull();
                    return null;
                }
                bitset = new BitSet();
                jsonreader.beginArray();
                jsontoken = jsonreader.peek();
                i1 = 0;
_L2:
                boolean flag;
                if (jsontoken == JsonToken.END_ARRAY)
                {
                    break MISSING_BLOCK_LABEL_200;
                }
                static final class _cls25
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

                switch (_cls25.a[jsontoken.ordinal()])
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
                    bitset.set(i1);
                }
                i1++;
                jsontoken = jsonreader.peek();
                if (true) goto _L2; else goto _L1
_L1:
                flag = jsonreader.nextBoolean();
                  goto _L3
                String s1 = jsonreader.nextString();
                int j1;
                try
                {
                    j1 = Integer.parseInt(s1);
                }
                // Misplaced declaration of an exception variable
                catch (JsonReader jsonreader)
                {
                    throw new JsonSyntaxException((new StringBuilder("Error: Expecting: bitset number value (1, 0), Found: ")).append(s1).toString());
                }
                if (j1 != 0)
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

            public final Object a(JsonReader jsonreader)
                throws IOException
            {
                return b(jsonreader);
            }

            public final void a(JsonWriter jsonwriter, Object obj)
                throws IOException
            {
                obj = (BitSet)obj;
                if (obj == null)
                {
                    jsonwriter.nullValue();
                    return;
                }
                jsonwriter.beginArray();
                int i1 = 0;
                while (i1 < ((BitSet) (obj)).length()) 
                {
                    int j1;
                    if (((BitSet) (obj)).get(i1))
                    {
                        j1 = 1;
                    } else
                    {
                        j1 = 0;
                    }
                    jsonwriter.value(j1);
                    i1++;
                }
                jsonwriter.endArray();
            }

        };
        d = a(java/util/BitSet, c);
        e = new r() {

            public final Object a(JsonReader jsonreader)
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

            public final void a(JsonWriter jsonwriter, Object obj)
                throws IOException
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
        g = a(Boolean.TYPE, java/lang/Boolean, e);
        h = new r() {

            private static Number b(JsonReader jsonreader)
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

            public final Object a(JsonReader jsonreader)
                throws IOException
            {
                return b(jsonreader);
            }

            public final void a(JsonWriter jsonwriter, Object obj)
                throws IOException
            {
                jsonwriter.value((Number)obj);
            }

        };
        i = a(Byte.TYPE, java/lang/Byte, h);
        j = new r() {

            private static Number b(JsonReader jsonreader)
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

            public final Object a(JsonReader jsonreader)
                throws IOException
            {
                return b(jsonreader);
            }

            public final void a(JsonWriter jsonwriter, Object obj)
                throws IOException
            {
                jsonwriter.value((Number)obj);
            }

        };
        k = a(Short.TYPE, java/lang/Short, j);
        l = new r() {

            private static Number b(JsonReader jsonreader)
                throws IOException
            {
                if (jsonreader.peek() == JsonToken.NULL)
                {
                    jsonreader.nextNull();
                    return null;
                }
                int i1;
                try
                {
                    i1 = jsonreader.nextInt();
                }
                // Misplaced declaration of an exception variable
                catch (JsonReader jsonreader)
                {
                    throw new JsonSyntaxException(jsonreader);
                }
                return Integer.valueOf(i1);
            }

            public final Object a(JsonReader jsonreader)
                throws IOException
            {
                return b(jsonreader);
            }

            public final void a(JsonWriter jsonwriter, Object obj)
                throws IOException
            {
                jsonwriter.value((Number)obj);
            }

        };
        m = a(Integer.TYPE, java/lang/Integer, l);
        q = new r() {

            public final Object a(JsonReader jsonreader)
                throws IOException
            {
                JsonToken jsontoken = jsonreader.peek();
                switch (_cls25.a[jsontoken.ordinal()])
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

            public final void a(JsonWriter jsonwriter, Object obj)
                throws IOException
            {
                jsonwriter.value((Number)obj);
            }

        };
        r = a(java/lang/Number, q);
        s = new r() {

            public final Object a(JsonReader jsonreader)
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
                    throw new JsonSyntaxException((new StringBuilder("Expecting character, got: ")).append(jsonreader).toString());
                } else
                {
                    return Character.valueOf(jsonreader.charAt(0));
                }
            }

            public final void a(JsonWriter jsonwriter, Object obj)
                throws IOException
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
        t = a(Character.TYPE, java/lang/Character, s);
        u = new r() {

            public final Object a(JsonReader jsonreader)
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

            public final void a(JsonWriter jsonwriter, Object obj)
                throws IOException
            {
                jsonwriter.value((String)obj);
            }

        };
        x = a(java/lang/String, u);
        y = new r() {

            public final Object a(JsonReader jsonreader)
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

            public final void a(JsonWriter jsonwriter, Object obj)
                throws IOException
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
        z = a(java/lang/StringBuilder, y);
        A = new r() {

            public final Object a(JsonReader jsonreader)
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

            public final void a(JsonWriter jsonwriter, Object obj)
                throws IOException
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
        B = a(java/lang/StringBuffer, A);
        C = new r() {

            public final Object a(JsonReader jsonreader)
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

            public final void a(JsonWriter jsonwriter, Object obj)
                throws IOException
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
        D = a(java/net/URL, C);
        E = new r() {

            private static URI b(JsonReader jsonreader)
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

            public final Object a(JsonReader jsonreader)
                throws IOException
            {
                return b(jsonreader);
            }

            public final void a(JsonWriter jsonwriter, Object obj)
                throws IOException
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
        F = a(java/net/URI, E);
        G = new r() {

            public final Object a(JsonReader jsonreader)
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

            public final void a(JsonWriter jsonwriter, Object obj)
                throws IOException
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
        H = b(java/net/InetAddress, G);
        I = new r() {

            public final Object a(JsonReader jsonreader)
                throws IOException
            {
                if (jsonreader.peek() == JsonToken.NULL)
                {
                    jsonreader.nextNull();
                    return null;
                } else
                {
                    return UUID.fromString(jsonreader.nextString());
                }
            }

            public final void a(JsonWriter jsonwriter, Object obj)
                throws IOException
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
        J = a(java/util/UUID, I);
        L = new r() {

            public final Object a(JsonReader jsonreader)
                throws IOException
            {
                int j1 = 0;
                if (jsonreader.peek() == JsonToken.NULL)
                {
                    jsonreader.nextNull();
                    return null;
                }
                jsonreader.beginObject();
                int k1 = 0;
                int l1 = 0;
                int i2 = 0;
                int j2 = 0;
                int k2 = 0;
                do
                {
                    if (jsonreader.peek() == JsonToken.END_OBJECT)
                    {
                        break;
                    }
                    String s1 = jsonreader.nextName();
                    int i1 = jsonreader.nextInt();
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
                jsonreader.endObject();
                return new GregorianCalendar(k2, j2, i2, l1, k1, j1);
            }

            public final void a(JsonWriter jsonwriter, Object obj)
                throws IOException
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
        M = new s(java/util/Calendar, java/util/GregorianCalendar, L) {

            final Class a;
            final Class b;
            final r c;

            public final r a(e e1, com.google.gson.b.a a1)
            {
                e1 = a1.a;
                if (e1 == a || e1 == b)
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
                c = r1;
                super();
            }
        };
        N = new r() {

            public final Object a(JsonReader jsonreader)
                throws IOException
            {
                if (jsonreader.peek() == JsonToken.NULL)
                {
                    jsonreader.nextNull();
                    return null;
                }
                Object obj = new StringTokenizer(jsonreader.nextString(), "_");
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

            public final void a(JsonWriter jsonwriter, Object obj)
                throws IOException
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
        O = a(java/util/Locale, N);
        P = new r() {

            private void a(JsonWriter jsonwriter, k k1)
                throws IOException
            {
                if (k1 == null || (k1 instanceof l))
                {
                    jsonwriter.nullValue();
                    return;
                }
                if (k1 instanceof n)
                {
                    k1 = k1.g();
                    if (((n) (k1)).a instanceof Number)
                    {
                        jsonwriter.value(k1.a());
                        return;
                    }
                    if (((n) (k1)).a instanceof Boolean)
                    {
                        jsonwriter.value(k1.f());
                        return;
                    } else
                    {
                        jsonwriter.value(k1.b());
                        return;
                    }
                }
                if (k1 instanceof h)
                {
                    jsonwriter.beginArray();
                    if (k1 instanceof h)
                    {
                        for (k1 = ((h)k1).iterator(); k1.hasNext(); a(jsonwriter, (k)k1.next())) { }
                    } else
                    {
                        throw new IllegalStateException("This is not a JSON Array.");
                    }
                    jsonwriter.endArray();
                    return;
                }
                if (k1 instanceof com.google.gson.m)
                {
                    jsonwriter.beginObject();
                    if (k1 instanceof com.google.gson.m)
                    {
                        java.util.Map.Entry entry;
                        for (k1 = ((com.google.gson.m)k1).a.entrySet().iterator(); k1.hasNext(); a(jsonwriter, (k)entry.getValue()))
                        {
                            entry = (java.util.Map.Entry)k1.next();
                            jsonwriter.name((String)entry.getKey());
                        }

                    } else
                    {
                        throw new IllegalStateException((new StringBuilder("Not a JSON Object: ")).append(k1).toString());
                    }
                    jsonwriter.endObject();
                    return;
                } else
                {
                    throw new IllegalArgumentException((new StringBuilder("Couldn't write ")).append(k1.getClass()).toString());
                }
            }

            private k b(JsonReader jsonreader)
                throws IOException
            {
                com.google.gson.m m1;
                switch (_cls25.a[jsonreader.peek().ordinal()])
                {
                default:
                    throw new IllegalArgumentException();

                case 3: // '\003'
                    return new n(jsonreader.nextString());

                case 1: // '\001'
                    return new n(new LazilyParsedNumber(jsonreader.nextString()));

                case 2: // '\002'
                    return new n(Boolean.valueOf(jsonreader.nextBoolean()));

                case 4: // '\004'
                    jsonreader.nextNull();
                    return l.a;

                case 5: // '\005'
                    h h1 = new h();
                    jsonreader.beginArray();
                    for (; jsonreader.hasNext(); h1.a(b(jsonreader))) { }
                    jsonreader.endArray();
                    return h1;

                case 6: // '\006'
                    m1 = new com.google.gson.m();
                    jsonreader.beginObject();
                    break;
                }
                for (; jsonreader.hasNext(); m1.a(jsonreader.nextName(), b(jsonreader))) { }
                jsonreader.endObject();
                return m1;
            }

            public final Object a(JsonReader jsonreader)
                throws IOException
            {
                return b(jsonreader);
            }

            public final volatile void a(JsonWriter jsonwriter, Object obj)
                throws IOException
            {
                a(jsonwriter, (k)obj);
            }

        };
        Q = b(com/google/gson/k, P);
    }
}

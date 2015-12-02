// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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

public final class bmh
{

    public static final bkq A;
    public static final bkr B;
    public static final bkq C;
    public static final bkr D;
    public static final bkq E;
    public static final bkr F;
    public static final bkq G;
    public static final bkr H;
    public static final bkq I;
    public static final bkr J;
    public static final bkr K = new bkr() {

        public final bkq create(bjw bjw1, bmj bmj1)
        {
            if (bmj1.getRawType() != java/sql/Timestamp)
            {
                return null;
            } else
            {
                return new bkq(this, bjw1.a(java/util/Date)) {

                    final bkq a;
                    final _cls15 b;

                    private void a(JsonWriter jsonwriter, Timestamp timestamp)
                    {
                        a.a(jsonwriter, timestamp);
                    }

                    private Timestamp b(JsonReader jsonreader)
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

                    public final Object a(JsonReader jsonreader)
                    {
                        return b(jsonreader);
                    }

                    public final volatile void a(JsonWriter jsonwriter, Object obj)
                    {
                        a(jsonwriter, (Timestamp)obj);
                    }

            
            {
                b = _pcls15;
                a = bkq1;
                super();
            }
                };
            }
        }

    };
    public static final bkq L;
    public static final bkr M;
    public static final bkq N;
    public static final bkr O;
    public static final bkq P;
    public static final bkr Q;
    public static final bkr R = new bkr() {

        public final bkq create(bjw bjw, bmj bmj1)
        {
            bmj1 = bmj1.getRawType();
            if (!java/lang/Enum.isAssignableFrom(bmj1) || bmj1 == java/lang/Enum)
            {
                return null;
            }
            bjw = bmj1;
            if (!bmj1.isEnum())
            {
                bjw = bmj1.getSuperclass();
            }
            return new bmi(bjw);
        }

    };
    public static final bkq a;
    public static final bkr b;
    public static final bkq c;
    public static final bkr d;
    public static final bkq e;
    public static final bkq f = new bkq() {

        private static void a(JsonWriter jsonwriter, Boolean boolean1)
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

        private static Boolean b(JsonReader jsonreader)
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

        public final Object a(JsonReader jsonreader)
        {
            return b(jsonreader);
        }

        public final volatile void a(JsonWriter jsonwriter, Object obj)
        {
            a(jsonwriter, (Boolean)obj);
        }

    };
    public static final bkr g;
    public static final bkq h;
    public static final bkr i;
    public static final bkq j;
    public static final bkr k;
    public static final bkq l;
    public static final bkr m;
    public static final bkq n = new bkq() {

        private static void a(JsonWriter jsonwriter, Number number)
        {
            jsonwriter.value(number);
        }

        private static Number b(JsonReader jsonreader)
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
                throw new bkm(jsonreader);
            }
            return Long.valueOf(l1);
        }

        public final Object a(JsonReader jsonreader)
        {
            return b(jsonreader);
        }

        public final volatile void a(JsonWriter jsonwriter, Object obj)
        {
            a(jsonwriter, (Number)obj);
        }

    };
    public static final bkq o = new bkq() {

        private static void a(JsonWriter jsonwriter, Number number)
        {
            jsonwriter.value(number);
        }

        private static Number b(JsonReader jsonreader)
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

        public final Object a(JsonReader jsonreader)
        {
            return b(jsonreader);
        }

        public final volatile void a(JsonWriter jsonwriter, Object obj)
        {
            a(jsonwriter, (Number)obj);
        }

    };
    public static final bkq p = new bkq() {

        private static void a(JsonWriter jsonwriter, Number number)
        {
            jsonwriter.value(number);
        }

        private static Number b(JsonReader jsonreader)
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

        public final Object a(JsonReader jsonreader)
        {
            return b(jsonreader);
        }

        public final volatile void a(JsonWriter jsonwriter, Object obj)
        {
            a(jsonwriter, (Number)obj);
        }

    };
    public static final bkq q;
    public static final bkr r;
    public static final bkq s;
    public static final bkr t;
    public static final bkq u;
    public static final bkq v = new bkq() {

        private static void a(JsonWriter jsonwriter, BigDecimal bigdecimal)
        {
            jsonwriter.value(bigdecimal);
        }

        private static BigDecimal b(JsonReader jsonreader)
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
                throw new bkm(jsonreader);
            }
            return jsonreader;
        }

        public final Object a(JsonReader jsonreader)
        {
            return b(jsonreader);
        }

        public final volatile void a(JsonWriter jsonwriter, Object obj)
        {
            a(jsonwriter, (BigDecimal)obj);
        }

    };
    public static final bkq w = new bkq() {

        private static void a(JsonWriter jsonwriter, BigInteger biginteger)
        {
            jsonwriter.value(biginteger);
        }

        private static BigInteger b(JsonReader jsonreader)
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
                throw new bkm(jsonreader);
            }
            return jsonreader;
        }

        public final Object a(JsonReader jsonreader)
        {
            return b(jsonreader);
        }

        public final volatile void a(JsonWriter jsonwriter, Object obj)
        {
            a(jsonwriter, (BigInteger)obj);
        }

    };
    public static final bkr x;
    public static final bkq y;
    public static final bkr z;

    public static bkr a(bmj bmj, bkq bkq)
    {
        return new bkr(bmj, bkq) {

            final bmj a;
            final bkq b;

            public final bkq create(bjw bjw, bmj bmj1)
            {
                if (bmj1.equals(a))
                {
                    return b;
                } else
                {
                    return null;
                }
            }

            
            {
                a = bmj1;
                b = bkq;
                super();
            }
        };
    }

    public static bkr a(Class class1, bkq bkq)
    {
        return new bkr(class1, bkq) {

            final Class a;
            final bkq b;

            public final bkq create(bjw bjw, bmj bmj1)
            {
                if (bmj1.getRawType() == a)
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
                b = bkq;
                super();
            }
        };
    }

    public static bkr a(Class class1, Class class2, bkq bkq)
    {
        return new bkr(class1, class2, bkq) {

            final Class a;
            final Class b;
            final bkq c;

            public final bkq create(bjw bjw, bmj bmj1)
            {
                bjw = bmj1.getRawType();
                if (bjw == a || bjw == b)
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
                c = bkq;
                super();
            }
        };
    }

    private static bkr b(Class class1, bkq bkq)
    {
        return new bkr(class1, bkq) {

            final Class a;
            final bkq b;

            public final bkq create(bjw bjw, bmj bmj1)
            {
                if (a.isAssignableFrom(bmj1.getRawType()))
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
                b = bkq;
                super();
            }
        };
    }

    private static bkr b(Class class1, Class class2, bkq bkq)
    {
        return new bkr(class1, class2, bkq) {

            final Class a;
            final Class b;
            final bkq c;

            public final bkq create(bjw bjw, bmj bmj1)
            {
                bjw = bmj1.getRawType();
                if (bjw == a || bjw == b)
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
                c = bkq;
                super();
            }
        };
    }

    static 
    {
        a = new bkq() {

            private static void a(JsonWriter jsonwriter, Class class1)
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

            private static Class b(JsonReader jsonreader)
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

            public final Object a(JsonReader jsonreader)
            {
                return b(jsonreader);
            }

            public final volatile void a(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (Class)obj);
            }

        };
        b = a(java/lang/Class, a);
        c = new bkq() {

            private static void a(JsonWriter jsonwriter, BitSet bitset)
            {
                if (bitset == null)
                {
                    jsonwriter.nullValue();
                    return;
                }
                jsonwriter.beginArray();
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
                    jsonwriter.value(j1);
                    i1++;
                }
                jsonwriter.endArray();
            }

            private static BitSet b(JsonReader jsonreader)
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
                final class _cls26
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
                    throw new bkm((new StringBuilder("Invalid bitset value type: ")).append(jsontoken).toString());

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
                    throw new bkm((new StringBuilder("Error: Expecting: bitset number value (1, 0), Found: ")).append(s1).toString());
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
            {
                return b(jsonreader);
            }

            public final volatile void a(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (BitSet)obj);
            }

        };
        d = a(java/util/BitSet, c);
        e = new bkq() {

            private static void a(JsonWriter jsonwriter, Boolean boolean1)
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

            private static Boolean b(JsonReader jsonreader)
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

            public final Object a(JsonReader jsonreader)
            {
                return b(jsonreader);
            }

            public final volatile void a(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (Boolean)obj);
            }

        };
        g = a(Boolean.TYPE, java/lang/Boolean, e);
        h = new bkq() {

            private static void a(JsonWriter jsonwriter, Number number)
            {
                jsonwriter.value(number);
            }

            private static Number b(JsonReader jsonreader)
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
                    throw new bkm(jsonreader);
                }
                return Byte.valueOf(byte0);
            }

            public final Object a(JsonReader jsonreader)
            {
                return b(jsonreader);
            }

            public final volatile void a(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (Number)obj);
            }

        };
        i = a(Byte.TYPE, java/lang/Byte, h);
        j = new bkq() {

            private static void a(JsonWriter jsonwriter, Number number)
            {
                jsonwriter.value(number);
            }

            private static Number b(JsonReader jsonreader)
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
                    throw new bkm(jsonreader);
                }
                return Short.valueOf(word0);
            }

            public final Object a(JsonReader jsonreader)
            {
                return b(jsonreader);
            }

            public final volatile void a(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (Number)obj);
            }

        };
        k = a(Short.TYPE, java/lang/Short, j);
        l = new bkq() {

            private static void a(JsonWriter jsonwriter, Number number)
            {
                jsonwriter.value(number);
            }

            private static Number b(JsonReader jsonreader)
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
                    throw new bkm(jsonreader);
                }
                return Integer.valueOf(i1);
            }

            public final Object a(JsonReader jsonreader)
            {
                return b(jsonreader);
            }

            public final volatile void a(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (Number)obj);
            }

        };
        m = a(Integer.TYPE, java/lang/Integer, l);
        q = new bkq() {

            private static void a(JsonWriter jsonwriter, Number number)
            {
                jsonwriter.value(number);
            }

            private static Number b(JsonReader jsonreader)
            {
                JsonToken jsontoken = jsonreader.peek();
                switch (_cls26.a[jsontoken.ordinal()])
                {
                case 2: // '\002'
                case 3: // '\003'
                default:
                    throw new bkm((new StringBuilder("Expecting number, got: ")).append(jsontoken).toString());

                case 4: // '\004'
                    jsonreader.nextNull();
                    return null;

                case 1: // '\001'
                    return new blf(jsonreader.nextString());
                }
            }

            public final Object a(JsonReader jsonreader)
            {
                return b(jsonreader);
            }

            public final volatile void a(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (Number)obj);
            }

        };
        r = a(java/lang/Number, q);
        s = new bkq() {

            private static void a(JsonWriter jsonwriter, Character character)
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

            private static Character b(JsonReader jsonreader)
            {
                if (jsonreader.peek() == JsonToken.NULL)
                {
                    jsonreader.nextNull();
                    return null;
                }
                jsonreader = jsonreader.nextString();
                if (jsonreader.length() != 1)
                {
                    throw new bkm((new StringBuilder("Expecting character, got: ")).append(jsonreader).toString());
                } else
                {
                    return Character.valueOf(jsonreader.charAt(0));
                }
            }

            public final Object a(JsonReader jsonreader)
            {
                return b(jsonreader);
            }

            public final volatile void a(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (Character)obj);
            }

        };
        t = a(Character.TYPE, java/lang/Character, s);
        u = new bkq() {

            private static void a(JsonWriter jsonwriter, String s1)
            {
                jsonwriter.value(s1);
            }

            private static String b(JsonReader jsonreader)
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

            public final Object a(JsonReader jsonreader)
            {
                return b(jsonreader);
            }

            public final volatile void a(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (String)obj);
            }

        };
        x = a(java/lang/String, u);
        y = new bkq() {

            private static void a(JsonWriter jsonwriter, StringBuilder stringbuilder)
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

            private static StringBuilder b(JsonReader jsonreader)
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

            public final Object a(JsonReader jsonreader)
            {
                return b(jsonreader);
            }

            public final volatile void a(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (StringBuilder)obj);
            }

        };
        z = a(java/lang/StringBuilder, y);
        A = new bkq() {

            private static void a(JsonWriter jsonwriter, StringBuffer stringbuffer)
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

            private static StringBuffer b(JsonReader jsonreader)
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

            public final Object a(JsonReader jsonreader)
            {
                return b(jsonreader);
            }

            public final volatile void a(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (StringBuffer)obj);
            }

        };
        B = a(java/lang/StringBuffer, A);
        C = new bkq() {

            private static void a(JsonWriter jsonwriter, URL url)
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

            private static URL b(JsonReader jsonreader)
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

            public final Object a(JsonReader jsonreader)
            {
                return b(jsonreader);
            }

            public final volatile void a(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (URL)obj);
            }

        };
        D = a(java/net/URL, C);
        E = new bkq() {

            private static void a(JsonWriter jsonwriter, URI uri)
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

            private static URI b(JsonReader jsonreader)
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
                throw new bke(jsonreader);
            }

            public final Object a(JsonReader jsonreader)
            {
                return b(jsonreader);
            }

            public final volatile void a(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (URI)obj);
            }

        };
        F = a(java/net/URI, E);
        G = new bkq() {

            private static void a(JsonWriter jsonwriter, InetAddress inetaddress)
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

            private static InetAddress b(JsonReader jsonreader)
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

            public final Object a(JsonReader jsonreader)
            {
                return b(jsonreader);
            }

            public final volatile void a(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (InetAddress)obj);
            }

        };
        H = b(java/net/InetAddress, G);
        I = new bkq() {

            private static void a(JsonWriter jsonwriter, UUID uuid)
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

            private static UUID b(JsonReader jsonreader)
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

            public final Object a(JsonReader jsonreader)
            {
                return b(jsonreader);
            }

            public final volatile void a(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (UUID)obj);
            }

        };
        J = a(java/util/UUID, I);
        L = new bkq() {

            private static void a(JsonWriter jsonwriter, Calendar calendar)
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

            private static Calendar b(JsonReader jsonreader)
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

            public final Object a(JsonReader jsonreader)
            {
                return b(jsonreader);
            }

            public final volatile void a(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (Calendar)obj);
            }

        };
        M = b(java/util/Calendar, java/util/GregorianCalendar, L);
        N = new bkq() {

            private static void a(JsonWriter jsonwriter, Locale locale)
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

            private static Locale b(JsonReader jsonreader)
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

            public final Object a(JsonReader jsonreader)
            {
                return b(jsonreader);
            }

            public final volatile void a(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (Locale)obj);
            }

        };
        O = a(java/util/Locale, N);
        P = new bkq() {

            private void a(JsonWriter jsonwriter, bkd bkd1)
            {
                if (bkd1 == null || bkd1.j())
                {
                    jsonwriter.nullValue();
                    return;
                }
                if (bkd1.i())
                {
                    bkd1 = bkd1.m();
                    if (bkd1.p())
                    {
                        jsonwriter.value(bkd1.a());
                        return;
                    }
                    if (bkd1.o())
                    {
                        jsonwriter.value(bkd1.f());
                        return;
                    } else
                    {
                        jsonwriter.value(bkd1.b());
                        return;
                    }
                }
                if (bkd1.g())
                {
                    jsonwriter.beginArray();
                    for (bkd1 = bkd1.l().iterator(); bkd1.hasNext(); a(jsonwriter, (bkd)bkd1.next())) { }
                    jsonwriter.endArray();
                    return;
                }
                if (bkd1.h())
                {
                    jsonwriter.beginObject();
                    java.util.Map.Entry entry;
                    for (bkd1 = bkd1.k().o().iterator(); bkd1.hasNext(); a(jsonwriter, (bkd)entry.getValue()))
                    {
                        entry = (java.util.Map.Entry)bkd1.next();
                        jsonwriter.name((String)entry.getKey());
                    }

                    jsonwriter.endObject();
                    return;
                } else
                {
                    throw new IllegalArgumentException((new StringBuilder("Couldn't write ")).append(bkd1.getClass()).toString());
                }
            }

            private bkd b(JsonReader jsonreader)
            {
                bkg bkg1;
                switch (_cls26.a[jsonreader.peek().ordinal()])
                {
                default:
                    throw new IllegalArgumentException();

                case 3: // '\003'
                    return new bkj(jsonreader.nextString());

                case 1: // '\001'
                    return new bkj(new blf(jsonreader.nextString()));

                case 2: // '\002'
                    return new bkj(Boolean.valueOf(jsonreader.nextBoolean()));

                case 4: // '\004'
                    jsonreader.nextNull();
                    return bkf.a;

                case 5: // '\005'
                    bka bka1 = new bka();
                    jsonreader.beginArray();
                    for (; jsonreader.hasNext(); bka1.a(b(jsonreader))) { }
                    jsonreader.endArray();
                    return bka1;

                case 6: // '\006'
                    bkg1 = new bkg();
                    jsonreader.beginObject();
                    break;
                }
                for (; jsonreader.hasNext(); bkg1.a(jsonreader.nextName(), b(jsonreader))) { }
                jsonreader.endObject();
                return bkg1;
            }

            public final Object a(JsonReader jsonreader)
            {
                return b(jsonreader);
            }

            public final volatile void a(JsonWriter jsonwriter, Object obj)
            {
                a(jsonwriter, (bkd)obj);
            }

        };
        Q = b(bkd, P);
    }
}

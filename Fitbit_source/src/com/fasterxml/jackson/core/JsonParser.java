// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.d.b;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;

// Referenced classes of package com.fasterxml.jackson.core:
//            h, JsonParseException, JsonToken, a, 
//            JsonProcessingException, d, b, f, 
//            g, Base64Variant, Version, c, 
//            JsonLocation

public abstract class JsonParser
    implements h, Closeable
{
    public static final class Feature extends Enum
    {

        public static final Feature a;
        public static final Feature b;
        public static final Feature c;
        public static final Feature d;
        public static final Feature e;
        public static final Feature f;
        public static final Feature g;
        public static final Feature h;
        private static final Feature i[];
        private final boolean _defaultState;

        public static int a()
        {
            int j1 = 0;
            Feature afeature[] = values();
            int l1 = afeature.length;
            for (int i1 = 0; i1 < l1;)
            {
                Feature feature = afeature[i1];
                int k1 = j1;
                if (feature.b())
                {
                    k1 = j1 | feature.c();
                }
                i1++;
                j1 = k1;
            }

            return j1;
        }

        public static Feature valueOf(String s1)
        {
            return (Feature)Enum.valueOf(com/fasterxml/jackson/core/JsonParser$Feature, s1);
        }

        public static Feature[] values()
        {
            return (Feature[])i.clone();
        }

        public boolean b()
        {
            return _defaultState;
        }

        public int c()
        {
            return 1 << ordinal();
        }

        static 
        {
            a = new Feature("AUTO_CLOSE_SOURCE", 0, true);
            b = new Feature("ALLOW_COMMENTS", 1, false);
            c = new Feature("ALLOW_UNQUOTED_FIELD_NAMES", 2, false);
            d = new Feature("ALLOW_SINGLE_QUOTES", 3, false);
            e = new Feature("ALLOW_UNQUOTED_CONTROL_CHARS", 4, false);
            f = new Feature("ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER", 5, false);
            g = new Feature("ALLOW_NUMERIC_LEADING_ZEROS", 6, false);
            h = new Feature("ALLOW_NON_NUMERIC_NUMBERS", 7, false);
            i = (new Feature[] {
                a, b, c, d, e, f, g, h
            });
        }

        private Feature(String s1, int i1, boolean flag)
        {
            super(s1, i1);
            _defaultState = flag;
        }
    }

    public static final class NumberType extends Enum
    {

        public static final NumberType a;
        public static final NumberType b;
        public static final NumberType c;
        public static final NumberType d;
        public static final NumberType e;
        public static final NumberType f;
        private static final NumberType g[];

        public static NumberType valueOf(String s1)
        {
            return (NumberType)Enum.valueOf(com/fasterxml/jackson/core/JsonParser$NumberType, s1);
        }

        public static NumberType[] values()
        {
            return (NumberType[])g.clone();
        }

        static 
        {
            a = new NumberType("INT", 0);
            b = new NumberType("LONG", 1);
            c = new NumberType("BIG_INTEGER", 2);
            d = new NumberType("FLOAT", 3);
            e = new NumberType("DOUBLE", 4);
            f = new NumberType("BIG_DECIMAL", 5);
            g = (new NumberType[] {
                a, b, c, d, e, f
            });
        }

        private NumberType(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private static final int b = -128;
    private static final int c = 255;
    private static final int d = -32768;
    private static final int e = 32767;
    protected int a;

    protected JsonParser()
    {
    }

    protected JsonParser(int i1)
    {
        a = i1;
    }

    public abstract NumberType A()
        throws IOException, JsonParseException;

    public byte B()
        throws IOException, JsonParseException
    {
        int i1 = D();
        if (i1 < -128 || i1 > 255)
        {
            throw c((new StringBuilder()).append("Numeric value (").append(u()).append(") out of range of Java byte").toString());
        } else
        {
            return (byte)i1;
        }
    }

    public short C()
        throws IOException, JsonParseException
    {
        int i1 = D();
        if (i1 < -32768 || i1 > 32767)
        {
            throw c((new StringBuilder()).append("Numeric value (").append(u()).append(") out of range of Java short").toString());
        } else
        {
            return (short)i1;
        }
    }

    public abstract int D()
        throws IOException, JsonParseException;

    public abstract long E()
        throws IOException, JsonParseException;

    public abstract BigInteger F()
        throws IOException, JsonParseException;

    public abstract float G()
        throws IOException, JsonParseException;

    public abstract double H()
        throws IOException, JsonParseException;

    public abstract BigDecimal I()
        throws IOException, JsonParseException;

    public boolean J()
        throws IOException, JsonParseException
    {
        JsonToken jsontoken = l();
        if (jsontoken == JsonToken.k)
        {
            return true;
        }
        if (jsontoken == JsonToken.l)
        {
            return false;
        } else
        {
            throw new JsonParseException((new StringBuilder()).append("Current token (").append(jsontoken).append(") not of boolean type").toString(), q());
        }
    }

    public abstract Object K()
        throws IOException, JsonParseException;

    public byte[] L()
        throws IOException, JsonParseException
    {
        return a(com.fasterxml.jackson.core.a.a());
    }

    public int M()
        throws IOException, JsonParseException
    {
        return b(0);
    }

    public long N()
        throws IOException, JsonParseException
    {
        return b(0L);
    }

    public double O()
        throws IOException, JsonParseException
    {
        return a(0.0D);
    }

    public boolean P()
        throws IOException, JsonParseException
    {
        return a(false);
    }

    public String Q()
        throws IOException, JsonParseException
    {
        return b(((String) (null)));
    }

    public g R()
        throws IOException, JsonProcessingException
    {
        d d1 = a();
        if (d1 == null)
        {
            throw new IllegalStateException("No ObjectCodec defined for the parser, can not deserialize JSON into JsonNode tree");
        } else
        {
            return d1.a(this);
        }
    }

    protected void S()
    {
        throw new UnsupportedOperationException((new StringBuilder()).append("Operation not supported by parser of type ").append(getClass().getName()).toString());
    }

    public double a(double d1)
        throws IOException, JsonParseException
    {
        return d1;
    }

    public int a(int i1)
        throws IOException, JsonParseException
    {
        if (f() == JsonToken.i)
        {
            i1 = D();
        }
        return i1;
    }

    public int a(Base64Variant base64variant, OutputStream outputstream)
        throws IOException, JsonParseException
    {
        S();
        return 0;
    }

    public int a(OutputStream outputstream)
        throws IOException
    {
        return -1;
    }

    public int a(Writer writer)
        throws IOException
    {
        return -1;
    }

    public long a(long l1)
        throws IOException, JsonParseException
    {
        if (f() == JsonToken.i)
        {
            l1 = E();
        }
        return l1;
    }

    public JsonParser a(Feature feature)
    {
        a = a | feature.c();
        return this;
    }

    public JsonParser a(Feature feature, boolean flag)
    {
        if (flag)
        {
            a(feature);
            return this;
        } else
        {
            b(feature);
            return this;
        }
    }

    public abstract d a();

    public Object a(b b1)
        throws IOException, JsonProcessingException
    {
        d d1 = a();
        if (d1 == null)
        {
            throw new IllegalStateException("No ObjectCodec defined for the parser, can not deserialize JSON into Java objects");
        } else
        {
            return d1.a(this, b1);
        }
    }

    public Object a(Class class1)
        throws IOException, JsonProcessingException
    {
        d d1 = a();
        if (d1 == null)
        {
            throw new IllegalStateException("No ObjectCodec defined for the parser, can not deserialize JSON into Java objects");
        } else
        {
            return d1.a(this, class1);
        }
    }

    public void a(com.fasterxml.jackson.core.b b1)
    {
        throw new UnsupportedOperationException((new StringBuilder()).append("Parser of type ").append(getClass().getName()).append(" does not support schema of type '").append(b1.a()).append("'").toString());
    }

    public abstract void a(d d1);

    public abstract void a(String s1);

    public boolean a(f f1)
        throws IOException, JsonParseException
    {
        return f() == JsonToken.f && f1.a().equals(n());
    }

    public boolean a(boolean flag)
        throws IOException, JsonParseException
    {
        return flag;
    }

    public abstract byte[] a(Base64Variant base64variant)
        throws IOException, JsonParseException;

    public int b(int i1)
        throws IOException, JsonParseException
    {
        return i1;
    }

    public int b(OutputStream outputstream)
        throws IOException, JsonParseException
    {
        return a(com.fasterxml.jackson.core.a.a(), outputstream);
    }

    public long b(long l1)
        throws IOException, JsonParseException
    {
        return l1;
    }

    public JsonParser b(Feature feature)
    {
        a = a & ~feature.c();
        return this;
    }

    public Object b()
    {
        return null;
    }

    public abstract String b(String s1)
        throws IOException, JsonParseException;

    public Iterator b(b b1)
        throws IOException, JsonProcessingException
    {
        d d1 = a();
        if (d1 == null)
        {
            throw new IllegalStateException("No ObjectCodec defined for the parser, can not deserialize JSON into Java objects");
        } else
        {
            return d1.(this, b1);
        }
    }

    public Iterator b(Class class1)
        throws IOException, JsonProcessingException
    {
        d d1 = a();
        if (d1 == null)
        {
            throw new IllegalStateException("No ObjectCodec defined for the parser, can not deserialize JSON into Java objects");
        } else
        {
            return d1.(this, class1);
        }
    }

    public boolean b(com.fasterxml.jackson.core.b b1)
    {
        return false;
    }

    protected JsonParseException c(String s1)
    {
        return new JsonParseException(s1, q());
    }

    public com.fasterxml.jackson.core.b c()
    {
        return null;
    }

    public boolean c(Feature feature)
    {
        return (a & feature.c()) != 0;
    }

    public abstract void close()
        throws IOException;

    public abstract Version d();

    public boolean e()
    {
        return false;
    }

    public abstract JsonToken f()
        throws IOException, JsonParseException;

    public abstract JsonToken g()
        throws IOException, JsonParseException;

    public String h()
        throws IOException, JsonParseException
    {
        if (f() == JsonToken.h)
        {
            return u();
        } else
        {
            return null;
        }
    }

    public Boolean i()
        throws IOException, JsonParseException
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[JsonToken.values().length];
                try
                {
                    a[JsonToken.k.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[JsonToken.l.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[f().ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return Boolean.TRUE;

        case 2: // '\002'
            return Boolean.FALSE;
        }
    }

    public abstract JsonParser j()
        throws IOException, JsonParseException;

    public abstract boolean k();

    public abstract JsonToken l();

    public abstract boolean m();

    public abstract String n()
        throws IOException, JsonParseException;

    public abstract c o();

    public abstract JsonLocation p();

    public abstract JsonLocation q();

    public boolean r()
    {
        return l() == JsonToken.d;
    }

    public abstract void s();

    public abstract JsonToken t();

    public abstract String u()
        throws IOException, JsonParseException;

    public abstract char[] v()
        throws IOException, JsonParseException;

    public abstract int w()
        throws IOException, JsonParseException;

    public abstract int x()
        throws IOException, JsonParseException;

    public abstract boolean y();

    public abstract Number z()
        throws IOException, JsonParseException;
}

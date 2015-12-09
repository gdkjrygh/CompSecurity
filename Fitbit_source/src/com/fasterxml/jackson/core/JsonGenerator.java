// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.CharacterEscapes;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.core:
//            h, JsonGenerationException, a, JsonProcessingException, 
//            b, f, e, Base64Variant, 
//            d, JsonParser, g, Version, 
//            c

public abstract class JsonGenerator
    implements h, Closeable, Flushable
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
        private static final Feature h[];
        private final boolean _defaultState;
        private final int _mask = 1 << ordinal();

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

        public static Feature valueOf(String s)
        {
            return (Feature)Enum.valueOf(com/fasterxml/jackson/core/JsonGenerator$Feature, s);
        }

        public static Feature[] values()
        {
            return (Feature[])h.clone();
        }

        public boolean b()
        {
            return _defaultState;
        }

        public int c()
        {
            return _mask;
        }

        static 
        {
            a = new Feature("AUTO_CLOSE_TARGET", 0, true);
            b = new Feature("AUTO_CLOSE_JSON_CONTENT", 1, true);
            c = new Feature("QUOTE_FIELD_NAMES", 2, true);
            d = new Feature("QUOTE_NON_NUMERIC_NUMBERS", 3, true);
            e = new Feature("WRITE_NUMBERS_AS_STRINGS", 4, false);
            f = new Feature("FLUSH_PASSED_TO_STREAM", 5, true);
            g = new Feature("ESCAPE_NON_ASCII", 6, false);
            h = (new Feature[] {
                a, b, c, d, e, f, g
            });
        }

        private Feature(String s, int i1, boolean flag)
        {
            super(s, i1);
            _defaultState = flag;
        }
    }


    protected e a;

    protected JsonGenerator()
    {
    }

    public abstract int a(Base64Variant base64variant, InputStream inputstream, int i1)
        throws IOException, JsonGenerationException;

    public int a(InputStream inputstream, int i1)
        throws IOException, JsonGenerationException
    {
        return a(com.fasterxml.jackson.core.a.a(), inputstream, i1);
    }

    public JsonGenerator a(int i1)
    {
        return this;
    }

    public abstract JsonGenerator a(Feature feature);

    public final JsonGenerator a(Feature feature, boolean flag)
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

    public abstract JsonGenerator a(d d1);

    public JsonGenerator a(e e1)
    {
        a = e1;
        return this;
    }

    public JsonGenerator a(f f1)
    {
        throw new UnsupportedOperationException();
    }

    public JsonGenerator a(CharacterEscapes characterescapes)
    {
        return this;
    }

    public abstract d a();

    public abstract void a(char c1)
        throws IOException, JsonGenerationException;

    public abstract void a(double d1)
        throws IOException, JsonGenerationException;

    public abstract void a(float f1)
        throws IOException, JsonGenerationException;

    public abstract void a(long l1)
        throws IOException, JsonGenerationException;

    public abstract void a(Base64Variant base64variant, byte abyte0[], int i1, int j1)
        throws IOException, JsonGenerationException;

    public abstract void a(JsonParser jsonparser)
        throws IOException, JsonProcessingException;

    public void a(b b1)
    {
        throw new UnsupportedOperationException((new StringBuilder()).append("Generator of type ").append(getClass().getName()).append(" does not support schema of type '").append(b1.a()).append("'").toString());
    }

    public abstract void a(g g1)
        throws IOException, JsonProcessingException;

    public abstract void a(Object obj)
        throws IOException, JsonProcessingException;

    public abstract void a(String s)
        throws IOException, JsonGenerationException;

    public final void a(String s, double d1)
        throws IOException, JsonGenerationException
    {
        a(s);
        a(d1);
    }

    public final void a(String s, float f1)
        throws IOException, JsonGenerationException
    {
        a(s);
        a(f1);
    }

    public final void a(String s, int i1)
        throws IOException, JsonGenerationException
    {
        a(s);
        b(i1);
    }

    public abstract void a(String s, int i1, int j1)
        throws IOException, JsonGenerationException;

    public final void a(String s, long l1)
        throws IOException, JsonGenerationException
    {
        a(s);
        a(l1);
    }

    public final void a(String s, Object obj)
        throws IOException, JsonProcessingException
    {
        a(s);
        a(obj);
    }

    public void a(String s, String s1)
        throws IOException, JsonGenerationException
    {
        a(s);
        b(s1);
    }

    public final void a(String s, BigDecimal bigdecimal)
        throws IOException, JsonGenerationException
    {
        a(s);
        a(bigdecimal);
    }

    public final void a(String s, boolean flag)
        throws IOException, JsonGenerationException
    {
        a(s);
        a(flag);
    }

    public final void a(String s, byte abyte0[])
        throws IOException, JsonGenerationException
    {
        a(s);
        a(abyte0);
    }

    public abstract void a(BigDecimal bigdecimal)
        throws IOException, JsonGenerationException;

    public abstract void a(BigInteger biginteger)
        throws IOException, JsonGenerationException;

    public void a(short word0)
        throws IOException, JsonGenerationException
    {
        b(word0);
    }

    public abstract void a(boolean flag)
        throws IOException, JsonGenerationException;

    public void a(byte abyte0[])
        throws IOException, JsonGenerationException
    {
        a(com.fasterxml.jackson.core.a.a(), abyte0, 0, abyte0.length);
    }

    public abstract void a(byte abyte0[], int i1, int j1)
        throws IOException, JsonGenerationException;

    public abstract void a(char ac[], int i1, int j1)
        throws IOException, JsonGenerationException;

    public abstract JsonGenerator b(Feature feature);

    public b b()
    {
        return null;
    }

    public abstract void b(int i1)
        throws IOException, JsonGenerationException;

    public abstract void b(JsonParser jsonparser)
        throws IOException, JsonProcessingException;

    public abstract void b(f f1)
        throws IOException, JsonGenerationException;

    public abstract void b(String s)
        throws IOException, JsonGenerationException;

    public abstract void b(String s, int i1, int j1)
        throws IOException, JsonGenerationException;

    public abstract void b(byte abyte0[], int i1, int j1)
        throws IOException, JsonGenerationException;

    public abstract void b(char ac[], int i1, int j1)
        throws IOException, JsonGenerationException;

    public boolean b(b b1)
    {
        return false;
    }

    public Object c()
    {
        return null;
    }

    public abstract void c(f f1)
        throws IOException, JsonGenerationException;

    public abstract void c(String s)
        throws IOException, JsonGenerationException;

    public void c(byte abyte0[], int i1, int j1)
        throws IOException, JsonGenerationException
    {
        a(com.fasterxml.jackson.core.a.a(), abyte0, i1, j1);
    }

    public abstract void c(char ac[], int i1, int j1)
        throws IOException, JsonGenerationException;

    public abstract boolean c(Feature feature);

    public abstract void close()
        throws IOException;

    public abstract Version d();

    public void d(f f1)
        throws IOException, JsonGenerationException
    {
        c(f1.a());
    }

    public abstract void d(String s)
        throws IOException, JsonGenerationException;

    public e e()
    {
        return a;
    }

    public abstract void e(String s)
        throws IOException, JsonGenerationException, UnsupportedOperationException;

    public abstract JsonGenerator f();

    public final void f(String s)
        throws IOException, JsonGenerationException
    {
        a(s);
        m();
    }

    public abstract void flush()
        throws IOException;

    public int g()
    {
        return 0;
    }

    public final void g(String s)
        throws IOException, JsonGenerationException
    {
        a(s);
        i();
    }

    public CharacterEscapes h()
    {
        return null;
    }

    public final void h(String s)
        throws IOException, JsonGenerationException
    {
        a(s);
        k();
    }

    public abstract void i()
        throws IOException, JsonGenerationException;

    public abstract void j()
        throws IOException, JsonGenerationException;

    public abstract void k()
        throws IOException, JsonGenerationException;

    public abstract void l()
        throws IOException, JsonGenerationException;

    public abstract void m()
        throws IOException, JsonGenerationException;

    public abstract c n();

    public abstract boolean o();
}

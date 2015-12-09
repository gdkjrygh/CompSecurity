// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.a;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.b.d;
import com.fasterxml.jackson.core.c;
import com.fasterxml.jackson.core.f;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.g;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public abstract class a extends JsonGenerator
{

    protected com.fasterxml.jackson.core.d b;
    protected int c;
    protected boolean d;
    protected d e;
    protected boolean f;

    protected a(int k, com.fasterxml.jackson.core.d d1)
    {
        c = k;
        e = com.fasterxml.jackson.core.b.d.i();
        b = d1;
        d = c(com.fasterxml.jackson.core.JsonGenerator.Feature.e);
    }

    public int a(Base64Variant base64variant, InputStream inputstream, int k)
        throws IOException, JsonGenerationException
    {
        s();
        return 0;
    }

    public JsonGenerator a(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
    {
        c = c | feature.c();
        if (feature == com.fasterxml.jackson.core.JsonGenerator.Feature.e)
        {
            d = true;
        } else
        if (feature == com.fasterxml.jackson.core.JsonGenerator.Feature.g)
        {
            a(127);
            return this;
        }
        return this;
    }

    public JsonGenerator a(com.fasterxml.jackson.core.d d1)
    {
        b = d1;
        return this;
    }

    public final com.fasterxml.jackson.core.d a()
    {
        return b;
    }

    public final void a(JsonParser jsonparser)
        throws IOException, JsonProcessingException
    {
        JsonToken jsontoken = jsonparser.l();
        if (jsontoken == null)
        {
            j("No current event to copy");
        }
    /* anonymous class not found */
    class _anm1 {}

        switch (_cls1.b[jsontoken.ordinal()])
        {
        default:
            r();
            return;

        case 1: // '\001'
            k();
            return;

        case 2: // '\002'
            l();
            return;

        case 3: // '\003'
            i();
            return;

        case 4: // '\004'
            j();
            return;

        case 5: // '\005'
            a(jsonparser.n());
            return;

        case 6: // '\006'
            if (jsonparser.y())
            {
                a(jsonparser.v(), jsonparser.x(), jsonparser.w());
                return;
            } else
            {
                b(jsonparser.u());
                return;
            }

        case 7: // '\007'
            switch (_cls1.a[jsonparser.A().ordinal()])
            {
            default:
                a(jsonparser.E());
                return;

            case 1: // '\001'
                b(jsonparser.D());
                return;

            case 2: // '\002'
                a(jsonparser.F());
                break;
            }
            return;

        case 8: // '\b'
            switch (_cls1.a[jsonparser.A().ordinal()])
            {
            default:
                a(jsonparser.H());
                return;

            case 3: // '\003'
                a(jsonparser.I());
                return;

            case 4: // '\004'
                a(jsonparser.G());
                break;
            }
            return;

        case 9: // '\t'
            a(true);
            return;

        case 10: // '\n'
            a(false);
            return;

        case 11: // '\013'
            m();
            return;

        case 12: // '\f'
            a(jsonparser.K());
            return;
        }
    }

    public void a(com.fasterxml.jackson.core.g g1)
        throws IOException, JsonProcessingException
    {
        if (g1 == null)
        {
            m();
            return;
        }
        if (b == null)
        {
            throw new IllegalStateException("No ObjectCodec defined");
        } else
        {
            b.a(this, g1);
            return;
        }
    }

    public void a(Object obj)
        throws IOException, JsonProcessingException
    {
        if (obj == null)
        {
            m();
            return;
        }
        if (b != null)
        {
            b.a(this, obj);
            return;
        } else
        {
            b(obj);
            return;
        }
    }

    public JsonGenerator b(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
    {
        c = c & ~feature.c();
        if (feature == com.fasterxml.jackson.core.JsonGenerator.Feature.e)
        {
            d = false;
        } else
        if (feature == com.fasterxml.jackson.core.JsonGenerator.Feature.g)
        {
            a(0);
            return this;
        }
        return this;
    }

    public final void b(JsonParser jsonparser)
        throws IOException, JsonProcessingException
    {
        JsonToken jsontoken1 = jsonparser.l();
        JsonToken jsontoken = jsontoken1;
        if (jsontoken1 == JsonToken.f)
        {
            a(jsonparser.n());
            jsontoken = jsonparser.f();
        }
        switch (_cls1.b[jsontoken.ordinal()])
        {
        case 2: // '\002'
        default:
            a(jsonparser);
            return;

        case 3: // '\003'
            i();
            for (; jsonparser.f() != JsonToken.e; b(jsonparser)) { }
            j();
            return;

        case 1: // '\001'
            k();
            break;
        }
        for (; jsonparser.f() != JsonToken.c; b(jsonparser)) { }
        l();
    }

    public void b(f f1)
        throws IOException, JsonGenerationException
    {
        a(f1.a());
    }

    protected void b(Object obj)
        throws IOException, JsonGenerationException
    {
        if (obj == null)
        {
            m();
            return;
        }
        if (obj instanceof String)
        {
            b((String)obj);
            return;
        }
        if (obj instanceof Number)
        {
            Number number = (Number)obj;
            if (number instanceof Integer)
            {
                b(number.intValue());
                return;
            }
            if (number instanceof Long)
            {
                a(number.longValue());
                return;
            }
            if (number instanceof Double)
            {
                a(number.doubleValue());
                return;
            }
            if (number instanceof Float)
            {
                a(number.floatValue());
                return;
            }
            if (number instanceof Short)
            {
                a(number.shortValue());
                return;
            }
            if (number instanceof Byte)
            {
                a(number.byteValue());
                return;
            }
            if (number instanceof BigInteger)
            {
                a((BigInteger)number);
                return;
            }
            if (number instanceof BigDecimal)
            {
                a((BigDecimal)number);
                return;
            }
            if (number instanceof AtomicInteger)
            {
                b(((AtomicInteger)number).get());
                return;
            }
            if (number instanceof AtomicLong)
            {
                a(((AtomicLong)number).get());
                return;
            }
        } else
        {
            if (obj instanceof byte[])
            {
                a((byte[])(byte[])obj);
                return;
            }
            if (obj instanceof Boolean)
            {
                a(((Boolean)obj).booleanValue());
                return;
            }
            if (obj instanceof AtomicBoolean)
            {
                a(((AtomicBoolean)obj).get());
                return;
            }
        }
        throw new IllegalStateException((new StringBuilder()).append("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed ").append(obj.getClass().getName()).append(")").toString());
    }

    public void b(String s1, int k, int l)
        throws IOException, JsonGenerationException
    {
        i("write raw value");
        a(s1, k, l);
    }

    public void c(f f1)
        throws IOException, JsonGenerationException
    {
        b(f1.a());
    }

    public void c(char ac[], int k, int l)
        throws IOException, JsonGenerationException
    {
        i("write raw value");
        b(ac, k, l);
    }

    public final boolean c(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
    {
        return (c & feature.c()) != 0;
    }

    public void close()
        throws IOException
    {
        f = true;
    }

    public Version d()
    {
        return g.a(getClass());
    }

    public void d(String s1)
        throws IOException, JsonGenerationException
    {
        i("write raw value");
        c(s1);
    }

    public JsonGenerator f()
    {
        if (e() != null)
        {
            return this;
        } else
        {
            return a(new DefaultPrettyPrinter());
        }
    }

    public abstract void flush()
        throws IOException;

    protected abstract void i(String s1)
        throws IOException, JsonGenerationException;

    protected void j(String s1)
        throws JsonGenerationException
    {
        throw new JsonGenerationException(s1);
    }

    public c n()
    {
        return p();
    }

    public boolean o()
    {
        return f;
    }

    public final d p()
    {
        return e;
    }

    protected abstract void q();

    protected final void r()
    {
        g.b();
    }

    protected void s()
    {
        throw new UnsupportedOperationException((new StringBuilder()).append("Operation not supported by generator of type ").append(getClass().getName()).toString());
    }
}

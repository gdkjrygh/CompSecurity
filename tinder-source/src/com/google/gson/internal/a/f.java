// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.a;

import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class f extends JsonWriter
{

    private static final Writer c = new Writer() {

        public final void close()
            throws IOException
        {
            throw new AssertionError();
        }

        public final void flush()
            throws IOException
        {
            throw new AssertionError();
        }

        public final void write(char ac[], int i, int j)
        {
            throw new AssertionError();
        }

    };
    private static final n d = new n("closed");
    public final List a = new ArrayList();
    public k b;
    private String e;

    public f()
    {
        super(c);
        b = l.a;
    }

    private k a()
    {
        return (k)a.get(a.size() - 1);
    }

    private void a(k k1)
    {
        if (e != null)
        {
            if (!(k1 instanceof l) || getSerializeNulls())
            {
                ((m)a()).a(e, k1);
            }
            e = null;
            return;
        }
        if (a.isEmpty())
        {
            b = k1;
            return;
        }
        k k2 = a();
        if (k2 instanceof h)
        {
            ((h)k2).a(k1);
            return;
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final JsonWriter beginArray()
        throws IOException
    {
        h h1 = new h();
        a(h1);
        a.add(h1);
        return this;
    }

    public final JsonWriter beginObject()
        throws IOException
    {
        m m1 = new m();
        a(m1);
        a.add(m1);
        return this;
    }

    public final void close()
        throws IOException
    {
        if (!a.isEmpty())
        {
            throw new IOException("Incomplete document");
        } else
        {
            a.add(d);
            return;
        }
    }

    public final JsonWriter endArray()
        throws IOException
    {
        if (a.isEmpty() || e != null)
        {
            throw new IllegalStateException();
        }
        if (a() instanceof h)
        {
            a.remove(a.size() - 1);
            return this;
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final JsonWriter endObject()
        throws IOException
    {
        if (a.isEmpty() || e != null)
        {
            throw new IllegalStateException();
        }
        if (a() instanceof m)
        {
            a.remove(a.size() - 1);
            return this;
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final void flush()
        throws IOException
    {
    }

    public final JsonWriter name(String s)
        throws IOException
    {
        if (a.isEmpty() || e != null)
        {
            throw new IllegalStateException();
        }
        if (a() instanceof m)
        {
            e = s;
            return this;
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final JsonWriter nullValue()
        throws IOException
    {
        a(l.a);
        return this;
    }

    public final JsonWriter value(double d1)
        throws IOException
    {
        if (!isLenient() && (Double.isNaN(d1) || Double.isInfinite(d1)))
        {
            throw new IllegalArgumentException((new StringBuilder("JSON forbids NaN and infinities: ")).append(d1).toString());
        } else
        {
            a(new n(Double.valueOf(d1)));
            return this;
        }
    }

    public final JsonWriter value(long l1)
        throws IOException
    {
        a(new n(Long.valueOf(l1)));
        return this;
    }

    public final JsonWriter value(Number number)
        throws IOException
    {
        if (number == null)
        {
            return nullValue();
        }
        if (!isLenient())
        {
            double d1 = number.doubleValue();
            if (Double.isNaN(d1) || Double.isInfinite(d1))
            {
                throw new IllegalArgumentException((new StringBuilder("JSON forbids NaN and infinities: ")).append(number).toString());
            }
        }
        a(new n(number));
        return this;
    }

    public final JsonWriter value(String s)
        throws IOException
    {
        if (s == null)
        {
            return nullValue();
        } else
        {
            a(new n(s));
            return this;
        }
    }

    public final JsonWriter value(boolean flag)
        throws IOException
    {
        a(new n(Boolean.valueOf(flag)));
        return this;
    }

}

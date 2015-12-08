// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.a;

import com.google.gson.h;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class e extends JsonReader
{

    private static final Reader b = new Reader() {

        public final void close()
            throws IOException
        {
            throw new AssertionError();
        }

        public final int read(char ac[], int i, int j)
            throws IOException
        {
            throw new AssertionError();
        }

    };
    private static final Object c = new Object();
    public final List a;

    private Object b()
    {
        return a.remove(a.size() - 1);
    }

    public final Object a()
    {
        return a.get(a.size() - 1);
    }

    public final void a(JsonToken jsontoken)
        throws IOException
    {
        if (peek() != jsontoken)
        {
            throw new IllegalStateException((new StringBuilder("Expected ")).append(jsontoken).append(" but was ").append(peek()).toString());
        } else
        {
            return;
        }
    }

    public final void beginArray()
        throws IOException
    {
        a(JsonToken.BEGIN_ARRAY);
        h h1 = (h)a();
        a.add(h1.iterator());
    }

    public final void beginObject()
        throws IOException
    {
        a(JsonToken.BEGIN_OBJECT);
        m m1 = (m)a();
        a.add(m1.a.entrySet().iterator());
    }

    public final void close()
        throws IOException
    {
        a.clear();
        a.add(c);
    }

    public final void endArray()
        throws IOException
    {
        a(JsonToken.END_ARRAY);
        b();
        b();
    }

    public final void endObject()
        throws IOException
    {
        a(JsonToken.END_OBJECT);
        b();
        b();
    }

    public final boolean hasNext()
        throws IOException
    {
        JsonToken jsontoken = peek();
        return jsontoken != JsonToken.END_OBJECT && jsontoken != JsonToken.END_ARRAY;
    }

    public final boolean nextBoolean()
        throws IOException
    {
        a(JsonToken.BOOLEAN);
        return ((n)b()).f();
    }

    public final double nextDouble()
        throws IOException
    {
        JsonToken jsontoken = peek();
        if (jsontoken != JsonToken.NUMBER && jsontoken != JsonToken.STRING)
        {
            throw new IllegalStateException((new StringBuilder("Expected ")).append(JsonToken.NUMBER).append(" but was ").append(jsontoken).toString());
        }
        double d = ((n)a()).c();
        if (!isLenient() && (Double.isNaN(d) || Double.isInfinite(d)))
        {
            throw new NumberFormatException((new StringBuilder("JSON forbids NaN and infinities: ")).append(d).toString());
        } else
        {
            b();
            return d;
        }
    }

    public final int nextInt()
        throws IOException
    {
        JsonToken jsontoken = peek();
        if (jsontoken != JsonToken.NUMBER && jsontoken != JsonToken.STRING)
        {
            throw new IllegalStateException((new StringBuilder("Expected ")).append(JsonToken.NUMBER).append(" but was ").append(jsontoken).toString());
        } else
        {
            int i = ((n)a()).e();
            b();
            return i;
        }
    }

    public final long nextLong()
        throws IOException
    {
        JsonToken jsontoken = peek();
        if (jsontoken != JsonToken.NUMBER && jsontoken != JsonToken.STRING)
        {
            throw new IllegalStateException((new StringBuilder("Expected ")).append(JsonToken.NUMBER).append(" but was ").append(jsontoken).toString());
        } else
        {
            long l1 = ((n)a()).d();
            b();
            return l1;
        }
    }

    public final String nextName()
        throws IOException
    {
        a(JsonToken.NAME);
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator)a()).next();
        a.add(entry.getValue());
        return (String)entry.getKey();
    }

    public final void nextNull()
        throws IOException
    {
        a(JsonToken.NULL);
        b();
    }

    public final String nextString()
        throws IOException
    {
        JsonToken jsontoken = peek();
        if (jsontoken != JsonToken.STRING && jsontoken != JsonToken.NUMBER)
        {
            throw new IllegalStateException((new StringBuilder("Expected ")).append(JsonToken.STRING).append(" but was ").append(jsontoken).toString());
        } else
        {
            return ((n)b()).b();
        }
    }

    public final JsonToken peek()
        throws IOException
    {
        Object obj;
        do
        {
            if (a.isEmpty())
            {
                return JsonToken.END_DOCUMENT;
            }
            obj = a();
            if (!(obj instanceof Iterator))
            {
                break;
            }
            boolean flag = a.get(a.size() - 2) instanceof m;
            obj = (Iterator)obj;
            if (((Iterator) (obj)).hasNext())
            {
                if (flag)
                {
                    return JsonToken.NAME;
                }
                a.add(((Iterator) (obj)).next());
            } else
            if (flag)
            {
                return JsonToken.END_OBJECT;
            } else
            {
                return JsonToken.END_ARRAY;
            }
        } while (true);
        if (obj instanceof m)
        {
            return JsonToken.BEGIN_OBJECT;
        }
        if (obj instanceof h)
        {
            return JsonToken.BEGIN_ARRAY;
        }
        if (obj instanceof n)
        {
            obj = (n)obj;
            if (((n) (obj)).a instanceof String)
            {
                return JsonToken.STRING;
            }
            if (((n) (obj)).a instanceof Boolean)
            {
                return JsonToken.BOOLEAN;
            }
            if (((n) (obj)).a instanceof Number)
            {
                return JsonToken.NUMBER;
            } else
            {
                throw new AssertionError();
            }
        }
        if (obj instanceof l)
        {
            return JsonToken.NULL;
        }
        if (obj == c)
        {
            throw new IllegalStateException("JsonReader is closed");
        } else
        {
            throw new AssertionError();
        }
    }

    public final void skipValue()
        throws IOException
    {
        if (peek() == JsonToken.NAME)
        {
            nextName();
            return;
        } else
        {
            b();
            return;
        }
    }

    public final String toString()
    {
        return getClass().getSimpleName();
    }

}

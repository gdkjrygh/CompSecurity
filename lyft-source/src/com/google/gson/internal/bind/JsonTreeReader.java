// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class JsonTreeReader extends JsonReader
{

    private static final Reader a = new Reader() {

        public void close()
        {
            throw new AssertionError();
        }

        public int read(char ac[], int i1, int j1)
        {
            throw new AssertionError();
        }

    };
    private static final Object b = new Object();
    private final List c = new ArrayList();

    public JsonTreeReader(JsonElement jsonelement)
    {
        super(a);
        c.add(jsonelement);
    }

    private void a(JsonToken jsontoken)
    {
        if (f() != jsontoken)
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected ").append(jsontoken).append(" but was ").append(f()).toString());
        } else
        {
            return;
        }
    }

    private Object r()
    {
        return c.get(c.size() - 1);
    }

    private Object s()
    {
        return c.remove(c.size() - 1);
    }

    public void a()
    {
        a(JsonToken.a);
        JsonArray jsonarray = (JsonArray)r();
        c.add(jsonarray.iterator());
    }

    public void b()
    {
        a(JsonToken.b);
        s();
        s();
    }

    public void c()
    {
        a(JsonToken.c);
        JsonObject jsonobject = (JsonObject)r();
        c.add(jsonobject.a().iterator());
    }

    public void close()
    {
        c.clear();
        c.add(b);
    }

    public void d()
    {
        a(JsonToken.d);
        s();
        s();
    }

    public boolean e()
    {
        JsonToken jsontoken = f();
        return jsontoken != JsonToken.d && jsontoken != JsonToken.b;
    }

    public JsonToken f()
    {
        if (c.isEmpty())
        {
            return JsonToken.j;
        }
        Object obj = r();
        if (obj instanceof Iterator)
        {
            boolean flag = c.get(c.size() - 2) instanceof JsonObject;
            obj = (Iterator)obj;
            if (((Iterator) (obj)).hasNext())
            {
                if (flag)
                {
                    return JsonToken.e;
                } else
                {
                    c.add(((Iterator) (obj)).next());
                    return f();
                }
            }
            if (flag)
            {
                return JsonToken.d;
            } else
            {
                return JsonToken.b;
            }
        }
        if (obj instanceof JsonObject)
        {
            return JsonToken.c;
        }
        if (obj instanceof JsonArray)
        {
            return JsonToken.a;
        }
        if (obj instanceof JsonPrimitive)
        {
            obj = (JsonPrimitive)obj;
            if (((JsonPrimitive) (obj)).q())
            {
                return JsonToken.f;
            }
            if (((JsonPrimitive) (obj)).a())
            {
                return JsonToken.h;
            }
            if (((JsonPrimitive) (obj)).p())
            {
                return JsonToken.g;
            } else
            {
                throw new AssertionError();
            }
        }
        if (obj instanceof JsonNull)
        {
            return JsonToken.i;
        }
        if (obj == b)
        {
            throw new IllegalStateException("JsonReader is closed");
        } else
        {
            throw new AssertionError();
        }
    }

    public String g()
    {
        a(JsonToken.e);
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator)r()).next();
        c.add(entry.getValue());
        return (String)entry.getKey();
    }

    public String h()
    {
        JsonToken jsontoken = f();
        if (jsontoken != JsonToken.f && jsontoken != JsonToken.g)
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected ").append(JsonToken.f).append(" but was ").append(jsontoken).toString());
        } else
        {
            return ((JsonPrimitive)s()).c();
        }
    }

    public boolean i()
    {
        a(JsonToken.h);
        return ((JsonPrimitive)s()).g();
    }

    public void j()
    {
        a(JsonToken.i);
        s();
    }

    public double k()
    {
        JsonToken jsontoken = f();
        if (jsontoken != JsonToken.g && jsontoken != JsonToken.f)
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected ").append(JsonToken.g).append(" but was ").append(jsontoken).toString());
        }
        double d1 = ((JsonPrimitive)r()).d();
        if (!p() && (Double.isNaN(d1) || Double.isInfinite(d1)))
        {
            throw new NumberFormatException((new StringBuilder()).append("JSON forbids NaN and infinities: ").append(d1).toString());
        } else
        {
            s();
            return d1;
        }
    }

    public long l()
    {
        JsonToken jsontoken = f();
        if (jsontoken != JsonToken.g && jsontoken != JsonToken.f)
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected ").append(JsonToken.g).append(" but was ").append(jsontoken).toString());
        } else
        {
            long l1 = ((JsonPrimitive)r()).e();
            s();
            return l1;
        }
    }

    public int m()
    {
        JsonToken jsontoken = f();
        if (jsontoken != JsonToken.g && jsontoken != JsonToken.f)
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected ").append(JsonToken.g).append(" but was ").append(jsontoken).toString());
        } else
        {
            int i1 = ((JsonPrimitive)r()).f();
            s();
            return i1;
        }
    }

    public void n()
    {
        if (f() == JsonToken.e)
        {
            g();
            return;
        } else
        {
            s();
            return;
        }
    }

    public void o()
    {
        a(JsonToken.e);
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator)r()).next();
        c.add(entry.getValue());
        c.add(new JsonPrimitive((String)entry.getKey()));
    }

    public String toString()
    {
        return getClass().getSimpleName();
    }

}

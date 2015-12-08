// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class JsonTreeWriter extends JsonWriter
{

    private static final Writer a = new Writer() {

        public void close()
        {
            throw new AssertionError();
        }

        public void flush()
        {
            throw new AssertionError();
        }

        public void write(char ac[], int i, int k)
        {
            throw new AssertionError();
        }

    };
    private static final JsonPrimitive b = new JsonPrimitive("closed");
    private final List c = new ArrayList();
    private String d;
    private JsonElement e;

    public JsonTreeWriter()
    {
        super(a);
        e = JsonNull.a;
    }

    private void a(JsonElement jsonelement)
    {
        if (d != null)
        {
            if (!jsonelement.k() || i())
            {
                ((JsonObject)j()).a(d, jsonelement);
            }
            d = null;
            return;
        }
        if (c.isEmpty())
        {
            e = jsonelement;
            return;
        }
        JsonElement jsonelement1 = j();
        if (jsonelement1 instanceof JsonArray)
        {
            ((JsonArray)jsonelement1).a(jsonelement);
            return;
        } else
        {
            throw new IllegalStateException();
        }
    }

    private JsonElement j()
    {
        return (JsonElement)c.get(c.size() - 1);
    }

    public JsonElement a()
    {
        if (!c.isEmpty())
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected one JSON element but was ").append(c).toString());
        } else
        {
            return e;
        }
    }

    public JsonWriter a(long l)
    {
        a(((JsonElement) (new JsonPrimitive(Long.valueOf(l)))));
        return this;
    }

    public JsonWriter a(Number number)
    {
        if (number == null)
        {
            return f();
        }
        if (!g())
        {
            double d1 = number.doubleValue();
            if (Double.isNaN(d1) || Double.isInfinite(d1))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("JSON forbids NaN and infinities: ").append(number).toString());
            }
        }
        a(((JsonElement) (new JsonPrimitive(number))));
        return this;
    }

    public JsonWriter a(String s)
    {
        if (c.isEmpty() || d != null)
        {
            throw new IllegalStateException();
        }
        if (j() instanceof JsonObject)
        {
            d = s;
            return this;
        } else
        {
            throw new IllegalStateException();
        }
    }

    public JsonWriter a(boolean flag)
    {
        a(((JsonElement) (new JsonPrimitive(Boolean.valueOf(flag)))));
        return this;
    }

    public JsonWriter b()
    {
        JsonArray jsonarray = new JsonArray();
        a(jsonarray);
        c.add(jsonarray);
        return this;
    }

    public JsonWriter b(String s)
    {
        if (s == null)
        {
            return f();
        } else
        {
            a(new JsonPrimitive(s));
            return this;
        }
    }

    public JsonWriter c()
    {
        if (c.isEmpty() || d != null)
        {
            throw new IllegalStateException();
        }
        if (j() instanceof JsonArray)
        {
            c.remove(c.size() - 1);
            return this;
        } else
        {
            throw new IllegalStateException();
        }
    }

    public void close()
    {
        if (!c.isEmpty())
        {
            throw new IOException("Incomplete document");
        } else
        {
            c.add(b);
            return;
        }
    }

    public JsonWriter d()
    {
        JsonObject jsonobject = new JsonObject();
        a(jsonobject);
        c.add(jsonobject);
        return this;
    }

    public JsonWriter e()
    {
        if (c.isEmpty() || d != null)
        {
            throw new IllegalStateException();
        }
        if (j() instanceof JsonObject)
        {
            c.remove(c.size() - 1);
            return this;
        } else
        {
            throw new IllegalStateException();
        }
    }

    public JsonWriter f()
    {
        a(JsonNull.a);
        return this;
    }

    public void flush()
    {
    }

}

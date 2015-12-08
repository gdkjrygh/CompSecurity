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

        public final void close()
        {
            throw new AssertionError();
        }

        public final void flush()
        {
            throw new AssertionError();
        }

        public final void write(char ac[], int i, int j)
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
        e = JsonNull.INSTANCE;
    }

    private JsonElement a()
    {
        return (JsonElement)c.get(c.size() - 1);
    }

    private void a(JsonElement jsonelement)
    {
        if (d != null)
        {
            if (!jsonelement.isJsonNull() || getSerializeNulls())
            {
                ((JsonObject)a()).add(d, jsonelement);
            }
            d = null;
            return;
        }
        if (c.isEmpty())
        {
            e = jsonelement;
            return;
        }
        JsonElement jsonelement1 = a();
        if (jsonelement1 instanceof JsonArray)
        {
            ((JsonArray)jsonelement1).add(jsonelement);
            return;
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final JsonWriter beginArray()
    {
        JsonArray jsonarray = new JsonArray();
        a(jsonarray);
        c.add(jsonarray);
        return this;
    }

    public final JsonWriter beginObject()
    {
        JsonObject jsonobject = new JsonObject();
        a(jsonobject);
        c.add(jsonobject);
        return this;
    }

    public final void close()
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

    public final JsonWriter endArray()
    {
        if (c.isEmpty() || d != null)
        {
            throw new IllegalStateException();
        }
        if (a() instanceof JsonArray)
        {
            c.remove(c.size() - 1);
            return this;
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final JsonWriter endObject()
    {
        if (c.isEmpty() || d != null)
        {
            throw new IllegalStateException();
        }
        if (a() instanceof JsonObject)
        {
            c.remove(c.size() - 1);
            return this;
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final void flush()
    {
    }

    public final JsonElement get()
    {
        if (!c.isEmpty())
        {
            throw new IllegalStateException((new StringBuilder("Expected one JSON element but was ")).append(c).toString());
        } else
        {
            return e;
        }
    }

    public final JsonWriter name(String s)
    {
        if (c.isEmpty() || d != null)
        {
            throw new IllegalStateException();
        }
        if (a() instanceof JsonObject)
        {
            d = s;
            return this;
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final JsonWriter nullValue()
    {
        a(JsonNull.INSTANCE);
        return this;
    }

    public final JsonWriter value(long l)
    {
        a(new JsonPrimitive(Long.valueOf(l)));
        return this;
    }

    public final JsonWriter value(Number number)
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
        a(new JsonPrimitive(number));
        return this;
    }

    public final JsonWriter value(String s)
    {
        if (s == null)
        {
            return nullValue();
        } else
        {
            a(new JsonPrimitive(s));
            return this;
        }
    }

    public final JsonWriter value(boolean flag)
    {
        a(new JsonPrimitive(Boolean.valueOf(flag)));
        return this;
    }

}

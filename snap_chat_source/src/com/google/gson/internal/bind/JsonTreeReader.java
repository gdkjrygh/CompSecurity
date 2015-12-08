// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class JsonTreeReader extends JsonReader
{

    private static final Object a = new Object();
    private final List b;

    private Object a()
    {
        return b.get(b.size() - 1);
    }

    private void a(JsonToken jsontoken)
    {
        if (peek() != jsontoken)
        {
            throw new IllegalStateException((new StringBuilder("Expected ")).append(jsontoken).append(" but was ").append(peek()).toString());
        } else
        {
            return;
        }
    }

    private Object b()
    {
        return b.remove(b.size() - 1);
    }

    public final void beginArray()
    {
        a(JsonToken.BEGIN_ARRAY);
        JsonArray jsonarray = (JsonArray)a();
        b.add(jsonarray.iterator());
    }

    public final void beginObject()
    {
        a(JsonToken.BEGIN_OBJECT);
        JsonObject jsonobject = (JsonObject)a();
        b.add(jsonobject.entrySet().iterator());
    }

    public final void close()
    {
        b.clear();
        b.add(a);
    }

    public final void endArray()
    {
        a(JsonToken.END_ARRAY);
        b();
        b();
    }

    public final void endObject()
    {
        a(JsonToken.END_OBJECT);
        b();
        b();
    }

    public final boolean hasNext()
    {
        JsonToken jsontoken = peek();
        return jsontoken != JsonToken.END_OBJECT && jsontoken != JsonToken.END_ARRAY;
    }

    public final boolean nextBoolean()
    {
        a(JsonToken.BOOLEAN);
        return ((JsonPrimitive)b()).getAsBoolean();
    }

    public final double nextDouble()
    {
        JsonToken jsontoken = peek();
        if (jsontoken != JsonToken.NUMBER && jsontoken != JsonToken.STRING)
        {
            throw new IllegalStateException((new StringBuilder("Expected ")).append(JsonToken.NUMBER).append(" but was ").append(jsontoken).toString());
        }
        double d = ((JsonPrimitive)a()).getAsDouble();
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
    {
        JsonToken jsontoken = peek();
        if (jsontoken != JsonToken.NUMBER && jsontoken != JsonToken.STRING)
        {
            throw new IllegalStateException((new StringBuilder("Expected ")).append(JsonToken.NUMBER).append(" but was ").append(jsontoken).toString());
        } else
        {
            int i = ((JsonPrimitive)a()).getAsInt();
            b();
            return i;
        }
    }

    public final long nextLong()
    {
        JsonToken jsontoken = peek();
        if (jsontoken != JsonToken.NUMBER && jsontoken != JsonToken.STRING)
        {
            throw new IllegalStateException((new StringBuilder("Expected ")).append(JsonToken.NUMBER).append(" but was ").append(jsontoken).toString());
        } else
        {
            long l = ((JsonPrimitive)a()).getAsLong();
            b();
            return l;
        }
    }

    public final String nextName()
    {
        a(JsonToken.NAME);
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator)a()).next();
        b.add(entry.getValue());
        return (String)entry.getKey();
    }

    public final void nextNull()
    {
        a(JsonToken.NULL);
        b();
    }

    public final String nextString()
    {
        JsonToken jsontoken = peek();
        if (jsontoken != JsonToken.STRING && jsontoken != JsonToken.NUMBER)
        {
            throw new IllegalStateException((new StringBuilder("Expected ")).append(JsonToken.STRING).append(" but was ").append(jsontoken).toString());
        } else
        {
            return ((JsonPrimitive)b()).getAsString();
        }
    }

    public final JsonToken peek()
    {
        Object obj;
        do
        {
            if (b.isEmpty())
            {
                return JsonToken.END_DOCUMENT;
            }
            obj = a();
            if (!(obj instanceof Iterator))
            {
                break;
            }
            boolean flag = b.get(b.size() - 2) instanceof JsonObject;
            obj = (Iterator)obj;
            if (((Iterator) (obj)).hasNext())
            {
                if (flag)
                {
                    return JsonToken.NAME;
                }
                b.add(((Iterator) (obj)).next());
            } else
            if (flag)
            {
                return JsonToken.END_OBJECT;
            } else
            {
                return JsonToken.END_ARRAY;
            }
        } while (true);
        if (obj instanceof JsonObject)
        {
            return JsonToken.BEGIN_OBJECT;
        }
        if (obj instanceof JsonArray)
        {
            return JsonToken.BEGIN_ARRAY;
        }
        if (obj instanceof JsonPrimitive)
        {
            obj = (JsonPrimitive)obj;
            if (((JsonPrimitive) (obj)).isString())
            {
                return JsonToken.STRING;
            }
            if (((JsonPrimitive) (obj)).isBoolean())
            {
                return JsonToken.BOOLEAN;
            }
            if (((JsonPrimitive) (obj)).isNumber())
            {
                return JsonToken.NUMBER;
            } else
            {
                throw new AssertionError();
            }
        }
        if (obj instanceof JsonNull)
        {
            return JsonToken.NULL;
        }
        if (obj == a)
        {
            throw new IllegalStateException("JsonReader is closed");
        } else
        {
            throw new AssertionError();
        }
    }

    public final void promoteNameToValue()
    {
        a(JsonToken.NAME);
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator)a()).next();
        b.add(entry.getValue());
        b.add(new JsonPrimitive((String)entry.getKey()));
    }

    public final void skipValue()
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

    static 
    {
        new Reader() {

            public final void close()
            {
                throw new AssertionError();
            }

            public final int read(char ac[], int i, int j)
            {
                throw new AssertionError();
            }

        };
    }
}

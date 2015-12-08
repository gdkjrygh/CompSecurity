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

    private static final Object SENTINEL_CLOSED = new Object();
    private static final Reader UNREADABLE_READER = new _cls1();
    private final List stack = new ArrayList();

    public JsonTreeReader(JsonElement jsonelement)
    {
        super(UNREADABLE_READER);
        stack.add(jsonelement);
    }

    private void expect(JsonToken jsontoken)
    {
        if (peek() != jsontoken)
        {
            throw new IllegalStateException((new StringBuilder("Expected ")).append(jsontoken).append(" but was ").append(peek()).toString());
        } else
        {
            return;
        }
    }

    private Object peekStack()
    {
        return stack.get(stack.size() - 1);
    }

    private Object popStack()
    {
        return stack.remove(stack.size() - 1);
    }

    public final void beginArray()
    {
        expect(JsonToken.BEGIN_ARRAY);
        JsonArray jsonarray = (JsonArray)peekStack();
        stack.add(jsonarray.iterator());
    }

    public final void beginObject()
    {
        expect(JsonToken.BEGIN_OBJECT);
        JsonObject jsonobject = (JsonObject)peekStack();
        stack.add(jsonobject.entrySet().iterator());
    }

    public final void close()
    {
        stack.clear();
        stack.add(SENTINEL_CLOSED);
    }

    public final void endArray()
    {
        expect(JsonToken.END_ARRAY);
        popStack();
        popStack();
    }

    public final void endObject()
    {
        expect(JsonToken.END_OBJECT);
        popStack();
        popStack();
    }

    public final boolean hasNext()
    {
        JsonToken jsontoken = peek();
        return jsontoken != JsonToken.END_OBJECT && jsontoken != JsonToken.END_ARRAY;
    }

    public final boolean nextBoolean()
    {
        expect(JsonToken.BOOLEAN);
        return ((JsonPrimitive)popStack()).getAsBoolean();
    }

    public final double nextDouble()
    {
        JsonToken jsontoken = peek();
        if (jsontoken != JsonToken.NUMBER && jsontoken != JsonToken.STRING)
        {
            throw new IllegalStateException((new StringBuilder("Expected ")).append(JsonToken.NUMBER).append(" but was ").append(jsontoken).toString());
        }
        double d = ((JsonPrimitive)peekStack()).getAsDouble();
        if (!isLenient() && (Double.isNaN(d) || Double.isInfinite(d)))
        {
            throw new NumberFormatException((new StringBuilder("JSON forbids NaN and infinities: ")).append(d).toString());
        } else
        {
            popStack();
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
            int i = ((JsonPrimitive)peekStack()).getAsInt();
            popStack();
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
            long l = ((JsonPrimitive)peekStack()).getAsLong();
            popStack();
            return l;
        }
    }

    public final String nextName()
    {
        expect(JsonToken.NAME);
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator)peekStack()).next();
        stack.add(entry.getValue());
        return (String)entry.getKey();
    }

    public final void nextNull()
    {
        expect(JsonToken.NULL);
        popStack();
    }

    public final String nextString()
    {
        JsonToken jsontoken = peek();
        if (jsontoken != JsonToken.STRING && jsontoken != JsonToken.NUMBER)
        {
            throw new IllegalStateException((new StringBuilder("Expected ")).append(JsonToken.STRING).append(" but was ").append(jsontoken).toString());
        } else
        {
            return ((JsonPrimitive)popStack()).getAsString();
        }
    }

    public final JsonToken peek()
    {
        Object obj;
        do
        {
            if (stack.isEmpty())
            {
                return JsonToken.END_DOCUMENT;
            }
            obj = peekStack();
            if (!(obj instanceof Iterator))
            {
                break;
            }
            boolean flag = stack.get(stack.size() - 2) instanceof JsonObject;
            obj = (Iterator)obj;
            if (((Iterator) (obj)).hasNext())
            {
                if (flag)
                {
                    return JsonToken.NAME;
                }
                stack.add(((Iterator) (obj)).next());
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
        if (obj == SENTINEL_CLOSED)
        {
            throw new IllegalStateException("JsonReader is closed");
        } else
        {
            throw new AssertionError();
        }
    }

    public final void promoteNameToValue()
    {
        expect(JsonToken.NAME);
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator)peekStack()).next();
        stack.add(entry.getValue());
        stack.add(new JsonPrimitive((String)entry.getKey()));
    }

    public final void skipValue()
    {
        if (peek() == JsonToken.NAME)
        {
            nextName();
            return;
        } else
        {
            popStack();
            return;
        }
    }

    public final String toString()
    {
        return getClass().getSimpleName();
    }


    private class _cls1 extends Reader
    {

        public final void close()
        {
            throw new AssertionError();
        }

        public final int read(char ac[], int i, int j)
        {
            throw new AssertionError();
        }

        _cls1()
        {
        }
    }

}

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
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class JsonTreeReader extends JsonReader
{

    private static final Object SENTINEL_CLOSED = new Object();
    private static final Reader UNREADABLE_READER = new Reader() {

        public void close()
            throws IOException
        {
            throw new AssertionError();
        }

        public int read(char ac[], int i, int j)
            throws IOException
        {
            throw new AssertionError();
        }

    };
    private final List stack = new ArrayList();

    public JsonTreeReader(JsonElement jsonelement)
    {
        super(UNREADABLE_READER);
        stack.add(jsonelement);
    }

    private void expect(JsonToken jsontoken)
        throws IOException
    {
        if (peek() != jsontoken)
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected ").append(jsontoken).append(" but was ").append(peek()).toString());
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

    public void beginArray()
        throws IOException
    {
        expect(JsonToken.BEGIN_ARRAY);
        JsonArray jsonarray = (JsonArray)peekStack();
        stack.add(jsonarray.iterator());
    }

    public void beginObject()
        throws IOException
    {
        expect(JsonToken.BEGIN_OBJECT);
        JsonObject jsonobject = (JsonObject)peekStack();
        stack.add(jsonobject.entrySet().iterator());
    }

    public void close()
        throws IOException
    {
        stack.clear();
        stack.add(SENTINEL_CLOSED);
    }

    public void endArray()
        throws IOException
    {
        expect(JsonToken.END_ARRAY);
        popStack();
        popStack();
    }

    public void endObject()
        throws IOException
    {
        expect(JsonToken.END_OBJECT);
        popStack();
        popStack();
    }

    public boolean hasNext()
        throws IOException
    {
        JsonToken jsontoken = peek();
        return jsontoken != JsonToken.END_OBJECT && jsontoken != JsonToken.END_ARRAY;
    }

    public boolean nextBoolean()
        throws IOException
    {
        expect(JsonToken.BOOLEAN);
        return ((JsonPrimitive)popStack()).getAsBoolean();
    }

    public double nextDouble()
        throws IOException
    {
        JsonToken jsontoken = peek();
        if (jsontoken != JsonToken.NUMBER && jsontoken != JsonToken.STRING)
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected ").append(JsonToken.NUMBER).append(" but was ").append(jsontoken).toString());
        }
        double d = ((JsonPrimitive)peekStack()).getAsDouble();
        if (!isLenient() && (Double.isNaN(d) || Double.isInfinite(d)))
        {
            throw new NumberFormatException((new StringBuilder()).append("JSON forbids NaN and infinities: ").append(d).toString());
        } else
        {
            popStack();
            return d;
        }
    }

    public int nextInt()
        throws IOException
    {
        JsonToken jsontoken = peek();
        if (jsontoken != JsonToken.NUMBER && jsontoken != JsonToken.STRING)
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected ").append(JsonToken.NUMBER).append(" but was ").append(jsontoken).toString());
        } else
        {
            int i = ((JsonPrimitive)peekStack()).getAsInt();
            popStack();
            return i;
        }
    }

    public long nextLong()
        throws IOException
    {
        JsonToken jsontoken = peek();
        if (jsontoken != JsonToken.NUMBER && jsontoken != JsonToken.STRING)
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected ").append(JsonToken.NUMBER).append(" but was ").append(jsontoken).toString());
        } else
        {
            long l = ((JsonPrimitive)peekStack()).getAsLong();
            popStack();
            return l;
        }
    }

    public String nextName()
        throws IOException
    {
        expect(JsonToken.NAME);
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator)peekStack()).next();
        stack.add(entry.getValue());
        return (String)entry.getKey();
    }

    public void nextNull()
        throws IOException
    {
        expect(JsonToken.NULL);
        popStack();
    }

    public String nextString()
        throws IOException
    {
        JsonToken jsontoken = peek();
        if (jsontoken != JsonToken.STRING && jsontoken != JsonToken.NUMBER)
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected ").append(JsonToken.STRING).append(" but was ").append(jsontoken).toString());
        } else
        {
            return ((JsonPrimitive)popStack()).getAsString();
        }
    }

    public JsonToken peek()
        throws IOException
    {
        if (stack.isEmpty())
        {
            return JsonToken.END_DOCUMENT;
        }
        Object obj = peekStack();
        if (obj instanceof Iterator)
        {
            boolean flag = stack.get(stack.size() - 2) instanceof JsonObject;
            obj = (Iterator)obj;
            if (((Iterator) (obj)).hasNext())
            {
                if (flag)
                {
                    return JsonToken.NAME;
                } else
                {
                    stack.add(((Iterator) (obj)).next());
                    return peek();
                }
            }
            if (flag)
            {
                return JsonToken.END_OBJECT;
            } else
            {
                return JsonToken.END_ARRAY;
            }
        }
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

    public void promoteNameToValue()
        throws IOException
    {
        expect(JsonToken.NAME);
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator)peekStack()).next();
        stack.add(entry.getValue());
        stack.add(new JsonPrimitive((String)entry.getKey()));
    }

    public void skipValue()
        throws IOException
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

    public String toString()
    {
        return getClass().getSimpleName();
    }

}

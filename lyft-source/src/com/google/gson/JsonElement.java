// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;

// Referenced classes of package com.google.gson:
//            JsonArray, JsonObject, JsonPrimitive, JsonNull

public abstract class JsonElement
{

    public JsonElement()
    {
    }

    public Number b()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String c()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double d()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public long e()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int f()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean g()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean h()
    {
        return this instanceof JsonArray;
    }

    public boolean i()
    {
        return this instanceof JsonObject;
    }

    public boolean j()
    {
        return this instanceof JsonPrimitive;
    }

    public boolean k()
    {
        return this instanceof JsonNull;
    }

    public JsonObject l()
    {
        if (i())
        {
            return (JsonObject)this;
        } else
        {
            throw new IllegalStateException((new StringBuilder()).append("Not a JSON Object: ").append(this).toString());
        }
    }

    public JsonArray m()
    {
        if (h())
        {
            return (JsonArray)this;
        } else
        {
            throw new IllegalStateException("This is not a JSON Array.");
        }
    }

    public JsonPrimitive n()
    {
        if (j())
        {
            return (JsonPrimitive)this;
        } else
        {
            throw new IllegalStateException("This is not a JSON Primitive.");
        }
    }

    Boolean o()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString()
    {
        Object obj;
        try
        {
            obj = new StringWriter();
            JsonWriter jsonwriter = new JsonWriter(((java.io.Writer) (obj)));
            jsonwriter.b(true);
            Streams.a(this, jsonwriter);
            obj = ((StringWriter) (obj)).toString();
        }
        catch (IOException ioexception)
        {
            throw new AssertionError(ioexception);
        }
        return ((String) (obj));
    }
}

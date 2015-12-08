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

    public boolean getAsBoolean()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    Boolean getAsBooleanWrapper()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double getAsDouble()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int getAsInt()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public JsonArray getAsJsonArray()
    {
        if (isJsonArray())
        {
            return (JsonArray)this;
        } else
        {
            throw new IllegalStateException("This is not a JSON Array.");
        }
    }

    public JsonObject getAsJsonObject()
    {
        if (isJsonObject())
        {
            return (JsonObject)this;
        } else
        {
            throw new IllegalStateException((new StringBuilder()).append("Not a JSON Object: ").append(this).toString());
        }
    }

    public JsonPrimitive getAsJsonPrimitive()
    {
        if (isJsonPrimitive())
        {
            return (JsonPrimitive)this;
        } else
        {
            throw new IllegalStateException("This is not a JSON Primitive.");
        }
    }

    public long getAsLong()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public Number getAsNumber()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String getAsString()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean isJsonArray()
    {
        return this instanceof JsonArray;
    }

    public boolean isJsonNull()
    {
        return this instanceof JsonNull;
    }

    public boolean isJsonObject()
    {
        return this instanceof JsonObject;
    }

    public boolean isJsonPrimitive()
    {
        return this instanceof JsonPrimitive;
    }

    public String toString()
    {
        Object obj;
        try
        {
            obj = new StringWriter();
            JsonWriter jsonwriter = new JsonWriter(((java.io.Writer) (obj)));
            jsonwriter.setLenient(true);
            Streams.write(this, jsonwriter);
            obj = ((StringWriter) (obj)).toString();
        }
        catch (IOException ioexception)
        {
            throw new AssertionError(ioexception);
        }
        return ((String) (obj));
    }
}

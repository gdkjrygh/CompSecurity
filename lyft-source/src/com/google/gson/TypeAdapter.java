// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

// Referenced classes of package com.google.gson:
//            JsonIOException, JsonElement

public abstract class TypeAdapter
{

    public TypeAdapter()
    {
    }

    public final Object fromJson(Reader reader)
    {
        return read(new JsonReader(reader));
    }

    public final Object fromJson(String s)
    {
        return fromJson(((Reader) (new StringReader(s))));
    }

    public final Object fromJsonTree(JsonElement jsonelement)
    {
        try
        {
            jsonelement = ((JsonElement) (read(new JsonTreeReader(jsonelement))));
        }
        // Misplaced declaration of an exception variable
        catch (JsonElement jsonelement)
        {
            throw new JsonIOException(jsonelement);
        }
        return jsonelement;
    }

    public final TypeAdapter nullSafe()
    {
        return new TypeAdapter() {

            final TypeAdapter a;

            public Object read(JsonReader jsonreader)
            {
                if (jsonreader.f() == JsonToken.i)
                {
                    jsonreader.j();
                    return null;
                } else
                {
                    return a.read(jsonreader);
                }
            }

            public void write(JsonWriter jsonwriter, Object obj)
            {
                if (obj == null)
                {
                    jsonwriter.f();
                    return;
                } else
                {
                    a.write(jsonwriter, obj);
                    return;
                }
            }

            
            {
                a = TypeAdapter.this;
                super();
            }
        };
    }

    public abstract Object read(JsonReader jsonreader);

    public final String toJson(Object obj)
    {
        StringWriter stringwriter = new StringWriter();
        toJson(((Writer) (stringwriter)), obj);
        return stringwriter.toString();
    }

    public final void toJson(Writer writer, Object obj)
    {
        write(new JsonWriter(writer), obj);
    }

    public final JsonElement toJsonTree(Object obj)
    {
        try
        {
            JsonTreeWriter jsontreewriter = new JsonTreeWriter();
            write(jsontreewriter, obj);
            obj = jsontreewriter.a();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new JsonIOException(((Throwable) (obj)));
        }
        return ((JsonElement) (obj));
    }

    public abstract void write(JsonWriter jsonwriter, Object obj);
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.gson.internal.bind:
//            ReflectiveTypeAdapterFactory

public static final class <init> extends TypeAdapter
{

    private final ObjectConstructor a;
    private final Map b;

    public final Object read(JsonReader jsonreader)
    {
        Object obj;
        if (jsonreader.peek() == JsonToken.NULL)
        {
            jsonreader.nextNull();
            return null;
        }
        obj = a.construct();
        jsonreader.beginObject();
_L1:
        Object obj1;
        if (!jsonreader.hasNext())
        {
            break MISSING_BLOCK_LABEL_103;
        }
        obj1 = jsonreader.nextName();
        obj1 = (a)b.get(obj1);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        if (((b) (obj1)).b)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        jsonreader.skipValue();
          goto _L1
        try
        {
            ((b) (obj1)).b(jsonreader, obj);
        }
        // Misplaced declaration of an exception variable
        catch (JsonReader jsonreader)
        {
            throw new JsonSyntaxException(jsonreader);
        }
        // Misplaced declaration of an exception variable
        catch (JsonReader jsonreader)
        {
            throw new AssertionError(jsonreader);
        }
          goto _L1
        jsonreader.endObject();
        return obj;
    }

    public final void write(JsonWriter jsonwriter, Object obj)
    {
        if (obj == null)
        {
            jsonwriter.nullValue();
            return;
        }
        jsonwriter.beginObject();
        try
        {
            Iterator iterator = b.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                b b1 = (b)iterator.next();
                if (b1.b(obj))
                {
                    jsonwriter.name(b1.b);
                    b1.b(jsonwriter, obj);
                }
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (JsonWriter jsonwriter)
        {
            throw new AssertionError();
        }
        jsonwriter.endObject();
    }

    private (ObjectConstructor objectconstructor, Map map)
    {
        a = objectconstructor;
        b = map;
    }

    b(ObjectConstructor objectconstructor, Map map, byte byte0)
    {
        this(objectconstructor, map);
    }
}

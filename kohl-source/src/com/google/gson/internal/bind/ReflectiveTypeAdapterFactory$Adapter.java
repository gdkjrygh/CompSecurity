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
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.gson.internal.bind:
//            ReflectiveTypeAdapterFactory

public static final class <init> extends TypeAdapter
{

    private final Map boundFields;
    private final ObjectConstructor constructor;

    public Object read(JsonReader jsonreader)
        throws IOException
    {
        Object obj;
        if (jsonreader.peek() == JsonToken.NULL)
        {
            jsonreader.nextNull();
            return null;
        }
        obj = constructor.construct();
        jsonreader.beginObject();
_L1:
        Object obj1;
        if (!jsonreader.hasNext())
        {
            break MISSING_BLOCK_LABEL_103;
        }
        obj1 = jsonreader.nextName();
        obj1 = (ld)boundFields.get(obj1);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        if (((ld) (obj1)).deserialized)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        jsonreader.skipValue();
          goto _L1
        try
        {
            ((ld) (obj1)).read(jsonreader, obj);
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

    public void write(JsonWriter jsonwriter, Object obj)
        throws IOException
    {
        if (obj == null)
        {
            jsonwriter.nullValue();
            return;
        }
        jsonwriter.beginObject();
        try
        {
            Iterator iterator = boundFields.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ld ld = (ld)iterator.next();
                if (ld.serialized)
                {
                    jsonwriter.name(ld.name);
                    ld.write(jsonwriter, obj);
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

    private ld(ObjectConstructor objectconstructor, Map map)
    {
        constructor = objectconstructor;
        boundFields = map;
    }

    boundFields(ObjectConstructor objectconstructor, Map map, boundFields boundfields)
    {
        this(objectconstructor, map);
    }
}

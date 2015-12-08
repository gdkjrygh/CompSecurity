// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.gson.internal.bind:
//            TypeAdapterRuntimeTypeWrapper

final class constructor extends TypeAdapter
{

    private final ObjectConstructor constructor;
    private final TypeAdapter elementTypeAdapter;

    public final volatile Object read(JsonReader jsonreader)
    {
        return read(jsonreader);
    }

    public final Collection read(JsonReader jsonreader)
    {
        if (jsonreader.peek() == JsonToken.NULL)
        {
            jsonreader.nextNull();
            return null;
        }
        Collection collection = (Collection)constructor.construct();
        jsonreader.beginArray();
        for (; jsonreader.hasNext(); collection.add(elementTypeAdapter.read(jsonreader))) { }
        jsonreader.endArray();
        return collection;
    }

    public final volatile void write(JsonWriter jsonwriter, Object obj)
    {
        write(jsonwriter, (Collection)obj);
    }

    public final void write(JsonWriter jsonwriter, Collection collection)
    {
        if (collection == null)
        {
            jsonwriter.nullValue();
            return;
        }
        jsonwriter.beginArray();
        Object obj;
        for (collection = collection.iterator(); collection.hasNext(); elementTypeAdapter.write(jsonwriter, obj))
        {
            obj = collection.next();
        }

        jsonwriter.endArray();
    }

    public (Gson gson, Type type, TypeAdapter typeadapter, ObjectConstructor objectconstructor)
    {
        elementTypeAdapter = new TypeAdapterRuntimeTypeWrapper(gson, typeadapter, type);
        constructor = objectconstructor;
    }
}

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

final class b extends TypeAdapter
{

    private final TypeAdapter a;
    private final ObjectConstructor b;

    public Collection a(JsonReader jsonreader)
    {
        if (jsonreader.f() == JsonToken.i)
        {
            jsonreader.j();
            return null;
        }
        Collection collection = (Collection)b.a();
        jsonreader.a();
        for (; jsonreader.e(); collection.add(a.read(jsonreader))) { }
        jsonreader.b();
        return collection;
    }

    public void a(JsonWriter jsonwriter, Collection collection)
    {
        if (collection == null)
        {
            jsonwriter.f();
            return;
        }
        jsonwriter.b();
        Object obj;
        for (collection = collection.iterator(); collection.hasNext(); a.write(jsonwriter, obj))
        {
            obj = collection.next();
        }

        jsonwriter.c();
    }

    public Object read(JsonReader jsonreader)
    {
        return a(jsonreader);
    }

    public void write(JsonWriter jsonwriter, Object obj)
    {
        a(jsonwriter, (Collection)obj);
    }

    public (Gson gson, Type type, TypeAdapter typeadapter, ObjectConstructor objectconstructor)
    {
        a = new TypeAdapterRuntimeTypeWrapper(gson, typeadapter, type);
        b = objectconstructor;
    }
}

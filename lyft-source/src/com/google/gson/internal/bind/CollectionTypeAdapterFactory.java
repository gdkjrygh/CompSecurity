// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.reflect.TypeToken;
import java.util.Collection;

public final class CollectionTypeAdapterFactory
    implements TypeAdapterFactory
{

    private final ConstructorConstructor a;

    public CollectionTypeAdapterFactory(ConstructorConstructor constructorconstructor)
    {
        a = constructorconstructor;
    }

    public TypeAdapter create(Gson gson, TypeToken typetoken)
    {
        Type type = typetoken.getType();
        Class class1 = typetoken.getRawType();
        if (!java/util/Collection.isAssignableFrom(class1))
        {
            return null;
        } else
        {
            type = com.google.gson.internal..Gson.Types.a(type, class1);
            return new Adapter(gson, type, gson.a(TypeToken.get(type)), a.a(typetoken));
        }
    }

    private class Adapter extends TypeAdapter
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

        public Adapter(Gson gson, Type type, TypeAdapter typeadapter, ObjectConstructor objectconstructor)
        {
            a = new TypeAdapterRuntimeTypeWrapper(gson, typeadapter, type);
            b = objectconstructor;
        }
    }

}

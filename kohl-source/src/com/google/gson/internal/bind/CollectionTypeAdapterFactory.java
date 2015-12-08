// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.gson.internal.bind:
//            TypeAdapterRuntimeTypeWrapper

public final class CollectionTypeAdapterFactory
    implements TypeAdapterFactory
{
    private static final class Adapter extends TypeAdapter
    {

        private final ObjectConstructor constructor;
        private final TypeAdapter elementTypeAdapter;

        public volatile Object read(JsonReader jsonreader)
            throws IOException
        {
            return read(jsonreader);
        }

        public Collection read(JsonReader jsonreader)
            throws IOException
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

        public volatile void write(JsonWriter jsonwriter, Object obj)
            throws IOException
        {
            write(jsonwriter, (Collection)obj);
        }

        public void write(JsonWriter jsonwriter, Collection collection)
            throws IOException
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

        public Adapter(Gson gson, Type type, TypeAdapter typeadapter, ObjectConstructor objectconstructor)
        {
            elementTypeAdapter = new TypeAdapterRuntimeTypeWrapper(gson, typeadapter, type);
            constructor = objectconstructor;
        }
    }


    private final ConstructorConstructor constructorConstructor;

    public CollectionTypeAdapterFactory(ConstructorConstructor constructorconstructor)
    {
        constructorConstructor = constructorconstructor;
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
            type = com.google.gson.internal..Gson.Types.getCollectionElementType(type, class1);
            return new Adapter(gson, type, gson.getAdapter(TypeToken.get(type)), constructorConstructor.get(typetoken));
        }
    }
}

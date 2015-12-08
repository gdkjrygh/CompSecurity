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
import fa;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

public final class CollectionTypeAdapterFactory
    implements TypeAdapterFactory
{
    static final class a extends TypeAdapter
    {

        private final TypeAdapter a;
        private final ObjectConstructor b;

        public final Object read(JsonReader jsonreader)
        {
            if (jsonreader.peek() == JsonToken.NULL)
            {
                jsonreader.nextNull();
                return null;
            }
            Collection collection = (Collection)b.construct();
            jsonreader.beginArray();
            for (; jsonreader.hasNext(); collection.add(a.read(jsonreader))) { }
            jsonreader.endArray();
            return collection;
        }

        public final void write(JsonWriter jsonwriter, Object obj)
        {
            obj = (Collection)obj;
            if (obj == null)
            {
                jsonwriter.nullValue();
                return;
            }
            jsonwriter.beginArray();
            Object obj1;
            for (obj = ((Collection) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a.write(jsonwriter, obj1))
            {
                obj1 = ((Iterator) (obj)).next();
            }

            jsonwriter.endArray();
        }

        public a(Gson gson, Type type, TypeAdapter typeadapter, ObjectConstructor objectconstructor)
        {
            a = new fa(gson, typeadapter, type);
            b = objectconstructor;
        }
    }


    private final ConstructorConstructor a;

    public CollectionTypeAdapterFactory(ConstructorConstructor constructorconstructor)
    {
        a = constructorconstructor;
    }

    public final TypeAdapter create(Gson gson, TypeToken typetoken)
    {
        Type type = typetoken.getType();
        Class class1 = typetoken.getRawType();
        if (!java/util/Collection.isAssignableFrom(class1))
        {
            return null;
        } else
        {
            type = com.google.gson.internal..Gson.Types.getCollectionElementType(type, class1);
            return new a(gson, type, gson.getAdapter(TypeToken.get(type)), a.get(typetoken));
        }
    }
}

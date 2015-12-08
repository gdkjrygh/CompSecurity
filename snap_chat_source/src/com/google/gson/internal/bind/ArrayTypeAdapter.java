// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import fa;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.List;

public final class ArrayTypeAdapter extends TypeAdapter
{

    public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() {

        public final TypeAdapter create(Gson gson, TypeToken typetoken)
        {
            typetoken = typetoken.getType();
            if (!(typetoken instanceof GenericArrayType) && (!(typetoken instanceof Class) || !((Class)typetoken).isArray()))
            {
                return null;
            } else
            {
                typetoken = com.google.gson.internal..Gson.Types.getArrayComponentType(typetoken);
                return new ArrayTypeAdapter(gson, gson.getAdapter(TypeToken.get(typetoken)), com.google.gson.internal..Gson.Types.getRawType(typetoken));
            }
        }

    };
    private final Class a;
    private final TypeAdapter b;

    public ArrayTypeAdapter(Gson gson, TypeAdapter typeadapter, Class class1)
    {
        b = new fa(gson, typeadapter, class1);
        a = class1;
    }

    public final Object read(JsonReader jsonreader)
    {
        if (jsonreader.peek() == JsonToken.NULL)
        {
            jsonreader.nextNull();
            return null;
        }
        ArrayList arraylist = new ArrayList();
        jsonreader.beginArray();
        for (; jsonreader.hasNext(); arraylist.add(b.read(jsonreader))) { }
        jsonreader.endArray();
        jsonreader = ((JsonReader) (Array.newInstance(a, arraylist.size())));
        for (int i = 0; i < arraylist.size(); i++)
        {
            Array.set(jsonreader, i, arraylist.get(i));
        }

        return jsonreader;
    }

    public final void write(JsonWriter jsonwriter, Object obj)
    {
        if (obj == null)
        {
            jsonwriter.nullValue();
            return;
        }
        jsonwriter.beginArray();
        int i = 0;
        for (int j = Array.getLength(obj); i < j; i++)
        {
            Object obj1 = Array.get(obj, i);
            b.write(jsonwriter, obj1);
        }

        jsonwriter.endArray();
    }

}

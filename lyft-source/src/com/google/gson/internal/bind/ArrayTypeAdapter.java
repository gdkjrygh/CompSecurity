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
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.gson.internal.bind:
//            TypeAdapterRuntimeTypeWrapper

public final class ArrayTypeAdapter extends TypeAdapter
{

    public static final TypeAdapterFactory a = new TypeAdapterFactory() {

        public TypeAdapter create(Gson gson, TypeToken typetoken)
        {
            typetoken = typetoken.getType();
            if (!(typetoken instanceof GenericArrayType) && (!(typetoken instanceof Class) || !((Class)typetoken).isArray()))
            {
                return null;
            } else
            {
                typetoken = com.google.gson.internal..Gson.Types.g(typetoken);
                return new ArrayTypeAdapter(gson, gson.a(TypeToken.get(typetoken)), com.google.gson.internal..Gson.Types.e(typetoken));
            }
        }

    };
    private final Class b;
    private final TypeAdapter c;

    public ArrayTypeAdapter(Gson gson, TypeAdapter typeadapter, Class class1)
    {
        c = new TypeAdapterRuntimeTypeWrapper(gson, typeadapter, class1);
        b = class1;
    }

    public Object read(JsonReader jsonreader)
    {
        if (jsonreader.f() == JsonToken.i)
        {
            jsonreader.j();
            return null;
        }
        ArrayList arraylist = new ArrayList();
        jsonreader.a();
        for (; jsonreader.e(); arraylist.add(c.read(jsonreader))) { }
        jsonreader.b();
        jsonreader = ((JsonReader) (Array.newInstance(b, arraylist.size())));
        for (int i = 0; i < arraylist.size(); i++)
        {
            Array.set(jsonreader, i, arraylist.get(i));
        }

        return jsonreader;
    }

    public void write(JsonWriter jsonwriter, Object obj)
    {
        if (obj == null)
        {
            jsonwriter.f();
            return;
        }
        jsonwriter.b();
        int i = 0;
        for (int j = Array.getLength(obj); i < j; i++)
        {
            Object obj1 = Array.get(obj, i);
            c.write(jsonwriter, obj1);
        }

        jsonwriter.c();
    }

}

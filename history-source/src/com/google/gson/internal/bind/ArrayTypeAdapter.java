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
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.gson.internal.bind:
//            TypeAdapterRuntimeTypeWrapper

public final class ArrayTypeAdapter extends TypeAdapter
{

    public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() {

        public TypeAdapter create(Gson gson, TypeToken typetoken)
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
    private final Class componentType;
    private final TypeAdapter componentTypeAdapter;

    public ArrayTypeAdapter(Gson gson, TypeAdapter typeadapter, Class class1)
    {
        componentTypeAdapter = new TypeAdapterRuntimeTypeWrapper(gson, typeadapter, class1);
        componentType = class1;
    }

    public Object read(JsonReader jsonreader)
        throws IOException
    {
        if (jsonreader.peek() != JsonToken.NULL) goto _L2; else goto _L1
_L1:
        jsonreader.nextNull();
        jsonreader = null;
_L4:
        return jsonreader;
_L2:
        ArrayList arraylist = new ArrayList();
        jsonreader.beginArray();
        for (; jsonreader.hasNext(); arraylist.add(componentTypeAdapter.read(jsonreader))) { }
        jsonreader.endArray();
        Object obj = Array.newInstance(componentType, arraylist.size());
        int i = 0;
        do
        {
            jsonreader = ((JsonReader) (obj));
            if (i >= arraylist.size())
            {
                continue;
            }
            Array.set(obj, i, arraylist.get(i));
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void write(JsonWriter jsonwriter, Object obj)
        throws IOException
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
            componentTypeAdapter.write(jsonwriter, obj1);
        }

        jsonwriter.endArray();
    }

}

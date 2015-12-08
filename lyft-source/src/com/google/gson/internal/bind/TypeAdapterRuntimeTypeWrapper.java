// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class TypeAdapterRuntimeTypeWrapper extends TypeAdapter
{

    private final Gson a;
    private final TypeAdapter b;
    private final Type c;

    TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter typeadapter, Type type)
    {
        a = gson;
        b = typeadapter;
        c = type;
    }

    private Type a(Type type, Object obj)
    {
        Object obj1;
label0:
        {
            obj1 = type;
            if (obj == null)
            {
                break label0;
            }
            if (type != java/lang/Object && !(type instanceof TypeVariable))
            {
                obj1 = type;
                if (!(type instanceof Class))
                {
                    break label0;
                }
            }
            obj1 = obj.getClass();
        }
        return ((Type) (obj1));
    }

    public Object read(JsonReader jsonreader)
    {
        return b.read(jsonreader);
    }

    public void write(JsonWriter jsonwriter, Object obj)
    {
        TypeAdapter typeadapter;
        typeadapter = b;
        Type type = a(c, obj);
        if (type != c)
        {
            typeadapter = a.a(TypeToken.get(type));
            break MISSING_BLOCK_LABEL_38;
        }
_L1:
        typeadapter.write(jsonwriter, obj);
        return;
        if ((typeadapter instanceof ReflectiveTypeAdapterFactory.Adapter) && !(b instanceof ReflectiveTypeAdapterFactory.Adapter))
        {
            typeadapter = b;
        }
          goto _L1
    }
}

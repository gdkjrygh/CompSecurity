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

    private final Gson context;
    private final TypeAdapter _flddelegate;
    private final Type type;

    TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter typeadapter, Type type1)
    {
        context = gson;
        _flddelegate = typeadapter;
        type = type1;
    }

    private Type getRuntimeTypeIfMoreSpecific(Type type1, Object obj)
    {
        Object obj1;
label0:
        {
            obj1 = type1;
            if (obj == null)
            {
                break label0;
            }
            if (type1 != java/lang/Object && !(type1 instanceof TypeVariable))
            {
                obj1 = type1;
                if (!(type1 instanceof Class))
                {
                    break label0;
                }
            }
            obj1 = obj.getClass();
        }
        return ((Type) (obj1));
    }

    public final Object read(JsonReader jsonreader)
    {
        return _flddelegate.read(jsonreader);
    }

    public final void write(JsonWriter jsonwriter, Object obj)
    {
        TypeAdapter typeadapter = _flddelegate;
        Object obj1 = getRuntimeTypeIfMoreSpecific(type, obj);
        if (obj1 != type)
        {
            obj1 = context.getAdapter(TypeToken.get(((Type) (obj1))));
            typeadapter = ((TypeAdapter) (obj1));
            if (obj1 instanceof ReflectiveTypeAdapterFactory.Adapter)
            {
                typeadapter = ((TypeAdapter) (obj1));
                if (!(_flddelegate instanceof ReflectiveTypeAdapterFactory.Adapter))
                {
                    typeadapter = _flddelegate;
                }
            }
        }
        typeadapter.write(jsonwriter, obj);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;

// Referenced classes of package com.google.gson.internal.bind:
//            ReflectiveTypeAdapterFactory, TypeAdapterRuntimeTypeWrapper

class d extends undField
{

    final TypeAdapter a;
    final Gson b;
    final Field c;
    final TypeToken d;
    final boolean e;
    final ReflectiveTypeAdapterFactory f;

    void a(JsonReader jsonreader, Object obj)
    {
        jsonreader = ((JsonReader) (a.read(jsonreader)));
        if (jsonreader != null || !e)
        {
            c.set(obj, jsonreader);
        }
    }

    void a(JsonWriter jsonwriter, Object obj)
    {
        obj = c.get(obj);
        (new TypeAdapterRuntimeTypeWrapper(b, a, d.getType())).write(jsonwriter, obj);
    }

    public boolean a(Object obj)
    {
        while (!h || c.get(obj) == obj) 
        {
            return false;
        }
        return true;
    }

    undField(ReflectiveTypeAdapterFactory reflectivetypeadapterfactory, String s, boolean flag, boolean flag1, Gson gson, Field field, TypeToken typetoken, 
            boolean flag2)
    {
        f = reflectivetypeadapterfactory;
        b = gson;
        c = field;
        d = typetoken;
        e = flag2;
        super(s, flag, flag1);
        a = ReflectiveTypeAdapterFactory.a(f, b, c, d);
    }
}

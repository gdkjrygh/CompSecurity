// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import fa;
import java.lang.reflect.Field;

// Referenced classes of package com.google.gson.internal.bind:
//            ReflectiveTypeAdapterFactory

final class g extends g
{

    private TypeAdapter d;
    private Gson e;
    private Field f;
    private TypeToken g;
    private boolean h;
    private ReflectiveTypeAdapterFactory i;

    final void a(JsonReader jsonreader, Object obj)
    {
        jsonreader = ((JsonReader) (d.read(jsonreader)));
        if (jsonreader != null || !h)
        {
            f.set(obj, jsonreader);
        }
    }

    final void a(JsonWriter jsonwriter, Object obj)
    {
        obj = f.get(obj);
        (new fa(e, d, g.getType())).write(jsonwriter, obj);
    }

    public final boolean a(Object obj)
    {
        while (!b || f.get(obj) == obj) 
        {
            return false;
        }
        return true;
    }

    (ReflectiveTypeAdapterFactory reflectivetypeadapterfactory, String s, boolean flag, boolean flag1, Gson gson, Field field, TypeToken typetoken, 
            boolean flag2)
    {
        i = reflectivetypeadapterfactory;
        e = gson;
        f = field;
        g = typetoken;
        h = flag2;
        super(s, flag, flag1);
        d = ReflectiveTypeAdapterFactory.a(i, e, f, g);
    }
}

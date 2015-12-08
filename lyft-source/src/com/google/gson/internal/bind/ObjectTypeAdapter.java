// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class ObjectTypeAdapter extends TypeAdapter
{

    public static final TypeAdapterFactory a = new TypeAdapterFactory() {

        public TypeAdapter create(Gson gson, TypeToken typetoken)
        {
            if (typetoken.getRawType() == java/lang/Object)
            {
                return new ObjectTypeAdapter(gson);
            } else
            {
                return null;
            }
        }

    };
    private final Gson b;

    private ObjectTypeAdapter(Gson gson)
    {
        b = gson;
    }


    public Object read(JsonReader jsonreader)
    {
        JsonToken jsontoken = jsonreader.f();
        class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[JsonToken.values().length];
                try
                {
                    a[JsonToken.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[JsonToken.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[JsonToken.f.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[JsonToken.g.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[JsonToken.h.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[JsonToken.i.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2.a[jsontoken.ordinal()])
        {
        default:
            throw new IllegalStateException();

        case 1: // '\001'
            ArrayList arraylist = new ArrayList();
            jsonreader.a();
            for (; jsonreader.e(); arraylist.add(read(jsonreader))) { }
            jsonreader.b();
            return arraylist;

        case 2: // '\002'
            LinkedTreeMap linkedtreemap = new LinkedTreeMap();
            jsonreader.c();
            for (; jsonreader.e(); linkedtreemap.put(jsonreader.g(), read(jsonreader))) { }
            jsonreader.d();
            return linkedtreemap;

        case 3: // '\003'
            return jsonreader.h();

        case 4: // '\004'
            return Double.valueOf(jsonreader.k());

        case 5: // '\005'
            return Boolean.valueOf(jsonreader.i());

        case 6: // '\006'
            jsonreader.j();
            return null;
        }
    }

    public void write(JsonWriter jsonwriter, Object obj)
    {
        if (obj == null)
        {
            jsonwriter.f();
            return;
        }
        TypeAdapter typeadapter = b.a(obj.getClass());
        if (typeadapter instanceof ObjectTypeAdapter)
        {
            jsonwriter.d();
            jsonwriter.e();
            return;
        } else
        {
            typeadapter.write(jsonwriter, obj);
            return;
        }
    }

}

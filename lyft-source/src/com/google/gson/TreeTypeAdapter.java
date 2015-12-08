// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

// Referenced classes of package com.google.gson:
//            TypeAdapter, Gson, JsonElement, JsonDeserializer, 
//            JsonSerializer, TypeAdapterFactory

final class TreeTypeAdapter extends TypeAdapter
{

    private final JsonSerializer a;
    private final JsonDeserializer b;
    private final Gson c;
    private final TypeToken d;
    private final TypeAdapterFactory e;
    private TypeAdapter f;

    private TreeTypeAdapter(JsonSerializer jsonserializer, JsonDeserializer jsondeserializer, Gson gson, TypeToken typetoken, TypeAdapterFactory typeadapterfactory)
    {
        a = jsonserializer;
        b = jsondeserializer;
        c = gson;
        d = typetoken;
        e = typeadapterfactory;
    }


    private TypeAdapter a()
    {
        TypeAdapter typeadapter = f;
        if (typeadapter != null)
        {
            return typeadapter;
        } else
        {
            TypeAdapter typeadapter1 = c.a(e, d);
            f = typeadapter1;
            return typeadapter1;
        }
    }

    public static TypeAdapterFactory a(TypeToken typetoken, Object obj)
    {
        return new SingleTypeFactory(obj, typetoken, false, null);
    }

    public static TypeAdapterFactory b(TypeToken typetoken, Object obj)
    {
        boolean flag;
        if (typetoken.getType() == typetoken.getRawType())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new SingleTypeFactory(obj, typetoken, flag, null);
    }

    public Object read(JsonReader jsonreader)
    {
        if (b == null)
        {
            return a().read(jsonreader);
        }
        jsonreader = Streams.a(jsonreader);
        if (jsonreader.k())
        {
            return null;
        } else
        {
            return b.deserialize(jsonreader, d.getType(), c.a);
        }
    }

    public void write(JsonWriter jsonwriter, Object obj)
    {
        if (a == null)
        {
            a().write(jsonwriter, obj);
            return;
        }
        if (obj == null)
        {
            jsonwriter.f();
            return;
        } else
        {
            Streams.a(a.a(obj, d.getType(), c.b), jsonwriter);
            return;
        }
    }

    private class SingleTypeFactory
        implements TypeAdapterFactory
    {

        private final TypeToken a;
        private final boolean b;
        private final Class c;
        private final JsonSerializer d;
        private final JsonDeserializer e;

        public TypeAdapter create(Gson gson, TypeToken typetoken)
        {
            boolean flag;
            if (a != null)
            {
                if (a.equals(typetoken) || b && a.getType() == typetoken.getRawType())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                flag = c.isAssignableFrom(typetoken.getRawType());
            }
            if (flag)
            {
                return new TreeTypeAdapter(d, e, gson, typetoken, this);
            } else
            {
                return null;
            }
        }

        private SingleTypeFactory(Object obj, TypeToken typetoken, boolean flag, Class class1)
        {
            JsonSerializer jsonserializer;
            boolean flag1;
            if (obj instanceof JsonSerializer)
            {
                jsonserializer = (JsonSerializer)obj;
            } else
            {
                jsonserializer = null;
            }
            d = jsonserializer;
            if (obj instanceof JsonDeserializer)
            {
                obj = (JsonDeserializer)obj;
            } else
            {
                obj = null;
            }
            e = ((JsonDeserializer) (obj));
            if (d != null || e != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            com.google.gson.internal..Gson.Preconditions.a(flag1);
            a = typetoken;
            b = flag;
            c = class1;
        }

    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.sql.Timestamp;
import java.util.Date;

// Referenced classes of package com.google.gson.internal.bind:
//            TypeAdapters

class a extends TypeAdapter
{

    final TypeAdapter a;
    final a b;

    public Timestamp a(JsonReader jsonreader)
    {
        jsonreader = (Date)a.read(jsonreader);
        if (jsonreader != null)
        {
            return new Timestamp(jsonreader.getTime());
        } else
        {
            return null;
        }
    }

    public void a(JsonWriter jsonwriter, Timestamp timestamp)
    {
        a.write(jsonwriter, timestamp);
    }

    public Object read(JsonReader jsonreader)
    {
        return a(jsonreader);
    }

    public void write(JsonWriter jsonwriter, Object obj)
    {
        a(jsonwriter, (Timestamp)obj);
    }

    ( , TypeAdapter typeadapter)
    {
        b = ;
        a = typeadapter;
        super();
    }

    // Unreferenced inner class com/google/gson/internal/bind/TypeAdapters$22

/* anonymous class */
    final class TypeAdapters._cls22
        implements TypeAdapterFactory
    {

        public TypeAdapter create(Gson gson, TypeToken typetoken)
        {
            if (typetoken.getRawType() != java/sql/Timestamp)
            {
                return null;
            } else
            {
                return new TypeAdapters._cls22._cls1(this, gson.a(java/util/Date));
            }
        }

    }

}

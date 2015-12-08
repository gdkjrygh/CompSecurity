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

final class a extends TypeAdapter
{

    private TypeAdapter a;

    public final Object read(JsonReader jsonreader)
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

    public final volatile void write(JsonWriter jsonwriter, Object obj)
    {
        obj = (Timestamp)obj;
        a.write(jsonwriter, obj);
    }

    (TypeAdapter typeadapter)
    {
        a = typeadapter;
        super();
    }

    // Unreferenced inner class com/google/gson/internal/bind/TypeAdapters$15

/* anonymous class */
    static final class TypeAdapters._cls15
        implements TypeAdapterFactory
    {

        public final TypeAdapter create(Gson gson, TypeToken typetoken)
        {
            if (typetoken.getRawType() != java/sql/Timestamp)
            {
                return null;
            } else
            {
                return new TypeAdapters._cls15._cls1(gson.getAdapter(java/util/Date));
            }
        }

    }

}

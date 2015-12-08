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
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

// Referenced classes of package com.google.gson.internal.bind:
//            TypeAdapters

final class val.dateTypeAdapter extends TypeAdapter
{

    final write this$0;
    final TypeAdapter val$dateTypeAdapter;

    private Timestamp read(JsonReader jsonreader)
        throws IOException
    {
        jsonreader = (Date)val$dateTypeAdapter.read(jsonreader);
        if (jsonreader != null)
        {
            return new Timestamp(jsonreader.getTime());
        } else
        {
            return null;
        }
    }

    private void write(JsonWriter jsonwriter, Timestamp timestamp)
        throws IOException
    {
        val$dateTypeAdapter.write(jsonwriter, timestamp);
    }

    public final volatile Object read(JsonReader jsonreader)
        throws IOException
    {
        return read(jsonreader);
    }

    public final volatile void write(JsonWriter jsonwriter, Object obj)
        throws IOException
    {
        write(jsonwriter, (Timestamp)obj);
    }

    ()
    {
        this$0 = final_;
        val$dateTypeAdapter = TypeAdapter.this;
        super();
    }

    // Unreferenced inner class com/google/gson/internal/bind/TypeAdapters$22

/* anonymous class */
    static final class TypeAdapters._cls22
        implements TypeAdapterFactory
    {

        public final TypeAdapter create(Gson gson, TypeToken typetoken)
        {
            if (typetoken.getRawType() != java/sql/Timestamp)
            {
                return null;
            } else
            {
                return gson.getAdapter(java/util/Date). new TypeAdapters._cls22._cls1();
            }
        }

    }

}

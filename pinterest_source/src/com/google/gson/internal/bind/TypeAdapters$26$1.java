// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.sql.Timestamp;
import java.util.Date;

class val.dateTypeAdapter extends TypeAdapter
{

    final val.dateTypeAdapter this$0;
    final TypeAdapter val$dateTypeAdapter;

    public volatile Object read(JsonReader jsonreader)
    {
        return read(jsonreader);
    }

    public Timestamp read(JsonReader jsonreader)
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

    public volatile void write(JsonWriter jsonwriter, Object obj)
    {
        write(jsonwriter, (Timestamp)obj);
    }

    public void write(JsonWriter jsonwriter, Timestamp timestamp)
    {
        val$dateTypeAdapter.write(jsonwriter, timestamp);
    }

    ()
    {
        this$0 = final_;
        val$dateTypeAdapter = TypeAdapter.this;
        super();
    }
}

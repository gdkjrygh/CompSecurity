// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class TimeTypeAdapter extends TypeAdapter
{

    public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() {

        public final TypeAdapter create(Gson gson, TypeToken typetoken)
        {
            if (typetoken.getRawType() == java/sql/Time)
            {
                return new TimeTypeAdapter();
            } else
            {
                return null;
            }
        }

    };
    private final DateFormat a = new SimpleDateFormat("hh:mm:ss a");

    public TimeTypeAdapter()
    {
    }

    public final volatile Object read(JsonReader jsonreader)
    {
        return read(jsonreader);
    }

    public final Time read(JsonReader jsonreader)
    {
        this;
        JVM INSTR monitorenter ;
        if (jsonreader.peek() != JsonToken.NULL) goto _L2; else goto _L1
_L1:
        jsonreader.nextNull();
        jsonreader = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return jsonreader;
_L2:
        jsonreader = new Time(a.parse(jsonreader.nextString()).getTime());
        if (true) goto _L4; else goto _L3
_L3:
        jsonreader;
        throw new JsonSyntaxException(jsonreader);
        jsonreader;
        this;
        JVM INSTR monitorexit ;
        throw jsonreader;
    }

    public final volatile void write(JsonWriter jsonwriter, Object obj)
    {
        write(jsonwriter, (Time)obj);
    }

    public final void write(JsonWriter jsonwriter, Time time)
    {
        this;
        JVM INSTR monitorenter ;
        if (time != null) goto _L2; else goto _L1
_L1:
        time = null;
_L4:
        jsonwriter.value(time);
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        time = a.format(time);
        if (true) goto _L4; else goto _L3
_L3:
        jsonwriter;
        throw jsonwriter;
    }

}

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

    public static final TypeAdapterFactory a = new TypeAdapterFactory() {

        public TypeAdapter create(Gson gson, TypeToken typetoken)
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
    private final DateFormat b = new SimpleDateFormat("hh:mm:ss a");

    public TimeTypeAdapter()
    {
    }

    public Time a(JsonReader jsonreader)
    {
        this;
        JVM INSTR monitorenter ;
        if (jsonreader.f() != JsonToken.i) goto _L2; else goto _L1
_L1:
        jsonreader.j();
        jsonreader = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return jsonreader;
_L2:
        jsonreader = new Time(b.parse(jsonreader.h()).getTime());
        if (true) goto _L4; else goto _L3
_L3:
        jsonreader;
        throw new JsonSyntaxException(jsonreader);
        jsonreader;
        this;
        JVM INSTR monitorexit ;
        throw jsonreader;
    }

    public void a(JsonWriter jsonwriter, Time time)
    {
        this;
        JVM INSTR monitorenter ;
        if (time != null) goto _L2; else goto _L1
_L1:
        time = null;
_L4:
        jsonwriter.b(time);
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        time = b.format(time);
        if (true) goto _L4; else goto _L3
_L3:
        jsonwriter;
        throw jsonwriter;
    }

    public Object read(JsonReader jsonreader)
    {
        return a(jsonreader);
    }

    public void write(JsonWriter jsonwriter, Object obj)
    {
        a(jsonwriter, (Time)obj);
    }

}

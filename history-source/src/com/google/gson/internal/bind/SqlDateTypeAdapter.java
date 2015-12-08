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
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class SqlDateTypeAdapter extends TypeAdapter
{

    public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() {

        public TypeAdapter create(Gson gson, TypeToken typetoken)
        {
            if (typetoken.getRawType() == java/sql/Date)
            {
                return new SqlDateTypeAdapter();
            } else
            {
                return null;
            }
        }

    };
    private final DateFormat format = new SimpleDateFormat("MMM d, yyyy");

    public SqlDateTypeAdapter()
    {
    }

    public volatile Object read(JsonReader jsonreader)
        throws IOException
    {
        return read(jsonreader);
    }

    public Date read(JsonReader jsonreader)
        throws IOException
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
        jsonreader = new Date(format.parse(jsonreader.nextString()).getTime());
        if (true) goto _L4; else goto _L3
_L3:
        jsonreader;
        throw new JsonSyntaxException(jsonreader);
        jsonreader;
        this;
        JVM INSTR monitorexit ;
        throw jsonreader;
    }

    public volatile void write(JsonWriter jsonwriter, Object obj)
        throws IOException
    {
        write(jsonwriter, (Date)obj);
    }

    public void write(JsonWriter jsonwriter, Date date)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (date != null) goto _L2; else goto _L1
_L1:
        date = null;
_L4:
        jsonwriter.value(date);
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        date = format.format(date);
        if (true) goto _L4; else goto _L3
_L3:
        jsonwriter;
        throw jsonwriter;
    }

}

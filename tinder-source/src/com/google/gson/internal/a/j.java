// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.a;

import com.google.gson.JsonSyntaxException;
import com.google.gson.b.a;
import com.google.gson.e;
import com.google.gson.r;
import com.google.gson.s;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class j extends r
{

    public static final s a = new s() {

        public final r a(e e, a a1)
        {
            if (a1.a == java/sql/Date)
            {
                return new j();
            } else
            {
                return null;
            }
        }

    };
    private final DateFormat b = new SimpleDateFormat("MMM d, yyyy");

    public j()
    {
    }

    private void a(JsonWriter jsonwriter, Date date)
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
        date = b.format(date);
        if (true) goto _L4; else goto _L3
_L3:
        jsonwriter;
        throw jsonwriter;
    }

    private Date b(JsonReader jsonreader)
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
        jsonreader = new Date(b.parse(jsonreader.nextString()).getTime());
        if (true) goto _L4; else goto _L3
_L3:
        jsonreader;
        throw new JsonSyntaxException(jsonreader);
        jsonreader;
        this;
        JVM INSTR monitorexit ;
        throw jsonreader;
    }

    public final Object a(JsonReader jsonreader)
        throws IOException
    {
        return b(jsonreader);
    }

    public final volatile void a(JsonWriter jsonwriter, Object obj)
        throws IOException
    {
        a(jsonwriter, (Date)obj);
    }

}

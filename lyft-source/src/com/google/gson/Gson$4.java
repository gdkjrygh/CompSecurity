// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

// Referenced classes of package com.google.gson:
//            TypeAdapter, Gson

class pter extends TypeAdapter
{

    final Gson a;

    public Float a(JsonReader jsonreader)
    {
        if (jsonreader.f() == JsonToken.i)
        {
            jsonreader.j();
            return null;
        } else
        {
            return Float.valueOf((float)jsonreader.k());
        }
    }

    public void a(JsonWriter jsonwriter, Number number)
    {
        if (number == null)
        {
            jsonwriter.f();
            return;
        } else
        {
            float f = number.floatValue();
            Gson.a(a, f);
            jsonwriter.a(number);
            return;
        }
    }

    public Object read(JsonReader jsonreader)
    {
        return a(jsonreader);
    }

    public void write(JsonWriter jsonwriter, Object obj)
    {
        a(jsonwriter, (Number)obj);
    }

    JsonWriter(Gson gson)
    {
        a = gson;
        super();
    }
}

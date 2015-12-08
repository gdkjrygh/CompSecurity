// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

// Referenced classes of package com.google.gson:
//            TypeAdapter, Gson

class pter extends TypeAdapter
{

    final Gson this$0;

    public Double read(JsonReader jsonreader)
        throws IOException
    {
        if (jsonreader.peek() == JsonToken.NULL)
        {
            jsonreader.nextNull();
            return null;
        } else
        {
            return Double.valueOf(jsonreader.nextDouble());
        }
    }

    public volatile Object read(JsonReader jsonreader)
        throws IOException
    {
        return read(jsonreader);
    }

    public void write(JsonWriter jsonwriter, Number number)
        throws IOException
    {
        if (number == null)
        {
            jsonwriter.nullValue();
            return;
        } else
        {
            double d = number.doubleValue();
            Gson.access$000(Gson.this, d);
            jsonwriter.value(number);
            return;
        }
    }

    public volatile void write(JsonWriter jsonwriter, Object obj)
        throws IOException
    {
        write(jsonwriter, (Number)obj);
    }

    JsonWriter()
    {
        this$0 = Gson.this;
        super();
    }
}

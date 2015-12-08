// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

// Referenced classes of package com.google.gson:
//            TypeAdapter

class nit> extends TypeAdapter
{

    final TypeAdapter this$0;

    public Object read(JsonReader jsonreader)
        throws IOException
    {
        if (jsonreader.peek() == JsonToken.NULL)
        {
            jsonreader.nextNull();
            return null;
        } else
        {
            return TypeAdapter.this.read(jsonreader);
        }
    }

    public void write(JsonWriter jsonwriter, Object obj)
        throws IOException
    {
        if (obj == null)
        {
            jsonwriter.nullValue();
            return;
        } else
        {
            TypeAdapter.this.write(jsonwriter, obj);
            return;
        }
    }

    ter()
    {
        this$0 = TypeAdapter.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

// Referenced classes of package com.google.gson:
//            TypeAdapter

class nit> extends TypeAdapter
{

    final TypeAdapter a;

    public Object read(JsonReader jsonreader)
    {
        if (jsonreader.f() == JsonToken.i)
        {
            jsonreader.j();
            return null;
        } else
        {
            return a.read(jsonreader);
        }
    }

    public void write(JsonWriter jsonwriter, Object obj)
    {
        if (obj == null)
        {
            jsonwriter.f();
            return;
        } else
        {
            a.write(jsonwriter, obj);
            return;
        }
    }

    ter(TypeAdapter typeadapter)
    {
        a = typeadapter;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

// Referenced classes of package com.google.gson:
//            TypeAdapter, Gson

static final class JsonWriter extends TypeAdapter
{

    TypeAdapter a;

    public final Object read(JsonReader jsonreader)
    {
        if (a == null)
        {
            throw new IllegalStateException();
        } else
        {
            return a.read(jsonreader);
        }
    }

    public final void write(JsonWriter jsonwriter, Object obj)
    {
        if (a == null)
        {
            throw new IllegalStateException();
        } else
        {
            a.write(jsonwriter, obj);
            return;
        }
    }

    JsonWriter()
    {
    }
}

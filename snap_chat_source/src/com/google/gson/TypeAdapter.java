// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

// Referenced classes of package com.google.gson:
//            JsonIOException, JsonElement

public abstract class TypeAdapter
{

    public TypeAdapter()
    {
    }

    public abstract Object read(JsonReader jsonreader);

    public final JsonElement toJsonTree(Object obj)
    {
        try
        {
            JsonTreeWriter jsontreewriter = new JsonTreeWriter();
            write(jsontreewriter, obj);
            obj = jsontreewriter.get();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new JsonIOException(((Throwable) (obj)));
        }
        return ((JsonElement) (obj));
    }

    public abstract void write(JsonWriter jsonwriter, Object obj);
}

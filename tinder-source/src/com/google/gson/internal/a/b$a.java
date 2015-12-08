// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.a;

import com.google.gson.internal.e;
import com.google.gson.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.gson.internal.a:
//            b, l

private static final class b extends r
{

    private final r a;
    private final e b;

    public final Object a(JsonReader jsonreader)
        throws IOException
    {
        if (jsonreader.peek() == JsonToken.NULL)
        {
            jsonreader.nextNull();
            return null;
        }
        Collection collection = (Collection)b.a();
        jsonreader.beginArray();
        for (; jsonreader.hasNext(); collection.add(a.a(jsonreader))) { }
        jsonreader.endArray();
        return collection;
    }

    public final void a(JsonWriter jsonwriter, Object obj)
        throws IOException
    {
        obj = (Collection)obj;
        if (obj == null)
        {
            jsonwriter.nullValue();
            return;
        }
        jsonwriter.beginArray();
        Object obj1;
        for (obj = ((Collection) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a.a(jsonwriter, obj1))
        {
            obj1 = ((Iterator) (obj)).next();
        }

        jsonwriter.endArray();
    }

    public er(com.google.gson.e e1, Type type, r r1, e e2)
    {
        a = new l(e1, r1, type);
        b = e2;
    }
}

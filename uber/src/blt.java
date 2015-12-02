// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

final class blt extends bkq
{

    private final bkq a;
    private final bll b;

    public blt(bjw bjw, Type type, bkq bkq1, bll bll1)
    {
        a = new bmg(bjw, bkq1, type);
        b = bll1;
    }

    private void a(JsonWriter jsonwriter, Collection collection)
    {
        if (collection == null)
        {
            jsonwriter.nullValue();
            return;
        }
        jsonwriter.beginArray();
        Object obj;
        for (collection = collection.iterator(); collection.hasNext(); a.a(jsonwriter, obj))
        {
            obj = collection.next();
        }

        jsonwriter.endArray();
    }

    private Collection b(JsonReader jsonreader)
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

    public final Object a(JsonReader jsonreader)
    {
        return b(jsonreader);
    }

    public final volatile void a(JsonWriter jsonwriter, Object obj)
    {
        a(jsonwriter, (Collection)obj);
    }
}

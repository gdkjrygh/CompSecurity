// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.List;

public final class blr extends bkq
{

    public static final bkr a = new bkr() {

        public final bkq create(bjw bjw1, bmj bmj1)
        {
            bmj1 = bmj1.getType();
            if (!(bmj1 instanceof GenericArrayType) && (!(bmj1 instanceof Class) || !((Class)bmj1).isArray()))
            {
                return null;
            } else
            {
                bmj1 = bky.d(bmj1);
                return new blr(bjw1, bjw1.a(bmj.get(bmj1)), bky.b(bmj1));
            }
        }

    };
    private final Class b;
    private final bkq c;

    public blr(bjw bjw, bkq bkq1, Class class1)
    {
        c = new bmg(bjw, bkq1, class1);
        b = class1;
    }

    public final Object a(JsonReader jsonreader)
    {
        if (jsonreader.peek() == JsonToken.NULL)
        {
            jsonreader.nextNull();
            return null;
        }
        ArrayList arraylist = new ArrayList();
        jsonreader.beginArray();
        for (; jsonreader.hasNext(); arraylist.add(c.a(jsonreader))) { }
        jsonreader.endArray();
        jsonreader = ((JsonReader) (Array.newInstance(b, arraylist.size())));
        for (int i = 0; i < arraylist.size(); i++)
        {
            Array.set(jsonreader, i, arraylist.get(i));
        }

        return jsonreader;
    }

    public final void a(JsonWriter jsonwriter, Object obj)
    {
        if (obj == null)
        {
            jsonwriter.nullValue();
            return;
        }
        jsonwriter.beginArray();
        int i = 0;
        for (int j = Array.getLength(obj); i < j; i++)
        {
            Object obj1 = Array.get(obj, i);
            c.a(jsonwriter, obj1);
        }

        jsonwriter.endArray();
    }

}

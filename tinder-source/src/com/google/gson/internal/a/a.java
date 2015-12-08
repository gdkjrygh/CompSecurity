// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.a;

import com.google.gson.e;
import com.google.gson.r;
import com.google.gson.s;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.gson.internal.a:
//            l

public final class a extends r
{

    public static final s a = new s() {

        public final r a(e e1, com.google.gson.b.a a1)
        {
            a1 = a1.b;
            if (!(a1 instanceof GenericArrayType) && (!(a1 instanceof Class) || !((Class)a1).isArray()))
            {
                return null;
            } else
            {
                a1 = com.google.gson.internal..Gson.Types.d(a1);
                return new a(e1, e1.a(com.google.gson.b.a.a(a1)), com.google.gson.internal..Gson.Types.b(a1));
            }
        }

    };
    private final Class b;
    private final r c;

    public a(e e, r r1, Class class1)
    {
        c = new l(e, r1, class1);
        b = class1;
    }

    public final Object a(JsonReader jsonreader)
        throws IOException
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
        throws IOException
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

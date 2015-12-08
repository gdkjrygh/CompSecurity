// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.a;

import com.google.gson.JsonSyntaxException;
import com.google.gson.h;
import com.google.gson.internal.d;
import com.google.gson.internal.e;
import com.google.gson.internal.g;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.gson.internal.a:
//            g, l

private final class d extends r
{

    final com.google.gson.internal.a.g a;
    private final r b;
    private final r c;
    private final e d;

    public final Object a(JsonReader jsonreader)
        throws IOException
    {
        JsonToken jsontoken = jsonreader.peek();
        if (jsontoken == JsonToken.NULL)
        {
            jsonreader.nextNull();
            return null;
        }
        Map map = (Map)d.a();
        if (jsontoken == JsonToken.BEGIN_ARRAY)
        {
            jsonreader.beginArray();
            for (; jsonreader.hasNext(); jsonreader.endArray())
            {
                jsonreader.beginArray();
                Object obj = b.a(jsonreader);
                if (map.put(obj, c.a(jsonreader)) != null)
                {
                    throw new JsonSyntaxException((new StringBuilder("duplicate key: ")).append(obj).toString());
                }
            }

            jsonreader.endArray();
            return map;
        }
        jsonreader.beginObject();
        while (jsonreader.hasNext()) 
        {
            d.INSTANCE.promoteNameToValue(jsonreader);
            Object obj1 = b.a(jsonreader);
            if (map.put(obj1, c.a(jsonreader)) != null)
            {
                throw new JsonSyntaxException((new StringBuilder("duplicate key: ")).append(obj1).toString());
            }
        }
        jsonreader.endObject();
        return map;
    }

    public final void a(JsonWriter jsonwriter, Object obj)
        throws IOException
    {
        boolean flag3 = false;
        boolean flag2 = false;
        obj = (Map)obj;
        if (obj == null)
        {
            jsonwriter.nullValue();
            return;
        }
        if (!g.a(a))
        {
            jsonwriter.beginObject();
            java.util.Entry entry;
            for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); c.a(jsonwriter, entry.getValue()))
            {
                entry = (java.util.Entry)((Iterator) (obj)).next();
                jsonwriter.name(String.valueOf(entry.getKey()));
            }

            jsonwriter.endObject();
            return;
        }
        ArrayList arraylist = new ArrayList(((Map) (obj)).size());
        ArrayList arraylist1 = new ArrayList(((Map) (obj)).size());
        obj = ((Map) (obj)).entrySet().iterator();
        boolean flag = false;
        while (((Iterator) (obj)).hasNext()) 
        {
            java.util.Entry entry1 = (java.util.Entry)((Iterator) (obj)).next();
            k k1 = b.a(entry1.getKey());
            arraylist.add(k1);
            arraylist1.add(entry1.getValue());
            boolean flag1;
            if ((k1 instanceof h) || (k1 instanceof m))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag = flag1 | flag;
        }
        if (flag)
        {
            jsonwriter.beginArray();
            for (int i = ((flag2) ? 1 : 0); i < arraylist.size(); i++)
            {
                jsonwriter.beginArray();
                g.a((k)arraylist.get(i), jsonwriter);
                c.a(jsonwriter, arraylist1.get(i));
                jsonwriter.endArray();
            }

            jsonwriter.endArray();
            return;
        }
        jsonwriter.beginObject();
        int j = ((flag3) ? 1 : 0);
        while (j < arraylist.size()) 
        {
            obj = (k)arraylist.get(j);
            if (obj instanceof n)
            {
                obj = ((k) (obj)).g();
                if (((n) (obj)).a instanceof Number)
                {
                    obj = String.valueOf(((n) (obj)).a());
                } else
                if (((n) (obj)).a instanceof Boolean)
                {
                    obj = Boolean.toString(((n) (obj)).f());
                } else
                if (((n) (obj)).a instanceof String)
                {
                    obj = ((n) (obj)).b();
                } else
                {
                    throw new AssertionError();
                }
            } else
            if (obj instanceof l)
            {
                obj = "null";
            } else
            {
                throw new AssertionError();
            }
            jsonwriter.name(((String) (obj)));
            c.a(jsonwriter, arraylist1.get(j));
            j++;
        }
        jsonwriter.endObject();
    }

    public er(com.google.gson.internal.a.g g1, com.google.gson.e e1, Type type, r r1, Type type1, r r2, e e2)
    {
        a = g1;
        super();
        b = new com.google.gson.internal.a.l(e1, r1, type);
        c = new com.google.gson.internal.a.l(e1, r2, type1);
        d = e2;
    }
}

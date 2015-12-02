// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class blz extends bkq
{

    final bly a;
    private final bkq b;
    private final bkq c;
    private final bll d;

    public blz(bly bly1, bjw bjw, Type type, bkq bkq1, Type type1, bkq bkq2, bll bll1)
    {
        a = bly1;
        super();
        b = new bmg(bjw, bkq1, type);
        c = new bmg(bjw, bkq2, type1);
        d = bll1;
    }

    private static String a(bkd bkd1)
    {
        if (bkd1.i())
        {
            bkd1 = bkd1.m();
            if (bkd1.p())
            {
                return String.valueOf(bkd1.a());
            }
            if (bkd1.o())
            {
                return Boolean.toString(bkd1.f());
            }
            if (bkd1.q())
            {
                return bkd1.b();
            } else
            {
                throw new AssertionError();
            }
        }
        if (bkd1.j())
        {
            return "null";
        } else
        {
            throw new AssertionError();
        }
    }

    private void a(JsonWriter jsonwriter, Map map)
    {
        boolean flag3 = false;
        boolean flag2 = false;
        if (map == null)
        {
            jsonwriter.nullValue();
            return;
        }
        if (!bly.a(a))
        {
            jsonwriter.beginObject();
            java.util.Map.Entry entry;
            for (map = map.entrySet().iterator(); map.hasNext(); c.a(jsonwriter, entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
                jsonwriter.name(String.valueOf(entry.getKey()));
            }

            jsonwriter.endObject();
            return;
        }
        ArrayList arraylist = new ArrayList(map.size());
        ArrayList arraylist1 = new ArrayList(map.size());
        map = map.entrySet().iterator();
        boolean flag = false;
        while (map.hasNext()) 
        {
            java.util.Map.Entry entry1 = (java.util.Map.Entry)map.next();
            bkd bkd1 = b.a(entry1.getKey());
            arraylist.add(bkd1);
            arraylist1.add(entry1.getValue());
            boolean flag1;
            if (bkd1.g() || bkd1.h())
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
                bln.a((bkd)arraylist.get(i), jsonwriter);
                c.a(jsonwriter, arraylist1.get(i));
                jsonwriter.endArray();
            }

            jsonwriter.endArray();
            return;
        }
        jsonwriter.beginObject();
        for (int j = ((flag3) ? 1 : 0); j < arraylist.size(); j++)
        {
            jsonwriter.name(a((bkd)arraylist.get(j)));
            c.a(jsonwriter, arraylist1.get(j));
        }

        jsonwriter.endObject();
    }

    private Map b(JsonReader jsonreader)
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
                    throw new bkm((new StringBuilder("duplicate key: ")).append(obj).toString());
                }
            }

            jsonreader.endArray();
            return map;
        }
        jsonreader.beginObject();
        while (jsonreader.hasNext()) 
        {
            ble.INSTANCE.promoteNameToValue(jsonreader);
            Object obj1 = b.a(jsonreader);
            if (map.put(obj1, c.a(jsonreader)) != null)
            {
                throw new bkm((new StringBuilder("duplicate key: ")).append(obj1).toString());
            }
        }
        jsonreader.endObject();
        return map;
    }

    public final Object a(JsonReader jsonreader)
    {
        return b(jsonreader);
    }

    public final volatile void a(JsonWriter jsonwriter, Object obj)
    {
        a(jsonwriter, (Map)obj);
    }
}

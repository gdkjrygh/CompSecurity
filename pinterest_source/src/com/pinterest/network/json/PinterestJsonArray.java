// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.network.json;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.pinterest.network.json:
//            PinterestJsonObject

public class PinterestJsonArray
{

    public JsonArray a;

    public PinterestJsonArray()
    {
        a = new JsonArray();
    }

    public PinterestJsonArray(JsonArray jsonarray)
    {
        a = jsonarray;
    }

    public PinterestJsonArray(String s)
    {
        a = (new JsonParser()).parse(s).getAsJsonArray();
    }

    public PinterestJsonArray(List list)
    {
        a = new JsonArray();
        String s;
        for (list = list.iterator(); list.hasNext(); a.add(new JsonPrimitive(s)))
        {
            s = (String)list.next();
        }

    }

    public final int a()
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.size();
        }
    }

    public final String a(int i)
    {
        return a.get(i).getAsString();
    }

    public final String a(String s)
    {
        if (a != null && a.size() > 0)
        {
            StringBuilder stringbuilder = new StringBuilder();
            int i = 0;
            for (int j = a.size(); i < j; i++)
            {
                stringbuilder.append(a.get(i));
                if (i < j - 1)
                {
                    stringbuilder.append(s);
                }
            }

            return stringbuilder.toString();
        } else
        {
            return null;
        }
    }

    public final void a(PinterestJsonObject pinterestjsonobject)
    {
        a.add(pinterestjsonobject.a);
    }

    public final int b(int i)
    {
        return a.get(i).getAsInt();
    }

    public final PinterestJsonObject c(int i)
    {
        if (a == null || a.size() <= i || a.get(i) == null || !a.get(i).isJsonObject())
        {
            return null;
        } else
        {
            return new PinterestJsonObject((JsonObject)a.get(i));
        }
    }

    public final PinterestJsonObject d(int i)
    {
        if (a == null || a.size() <= i || a.get(i) == null || !a.get(i).isJsonObject())
        {
            return new PinterestJsonObject();
        } else
        {
            return new PinterestJsonObject((JsonObject)a.get(i));
        }
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof PinterestJsonArray) && ((PinterestJsonArray)obj).a.equals(a);
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public String toString()
    {
        return a.toString();
    }
}

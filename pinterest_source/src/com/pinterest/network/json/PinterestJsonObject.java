// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.network.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.pinterest.common.utils.Function;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.pinterest.network.json:
//            PinterestExclusionStrategy, PinterestDateTypeAdapter, PinterestStringTypeAdapter, PinterestJsonArray

public class PinterestJsonObject
{

    private static PinterestExclusionStrategy b;
    private static Gson c;
    public JsonObject a;

    public PinterestJsonObject()
    {
        a = new JsonObject();
    }

    public PinterestJsonObject(JsonObject jsonobject)
    {
        a = jsonobject;
    }

    public PinterestJsonObject(String s)
    {
        a = (new JsonParser()).parse(s).getAsJsonObject();
    }

    public PinterestJsonObject(Map map)
    {
        a = (JsonObject)c.toJsonTree(map);
    }

    public static Object a(Object obj)
    {
        if (!(obj instanceof JsonElement))
        {
            return null;
        }
        JsonElement jsonelement = (JsonElement)obj;
        if (jsonelement.isJsonArray())
        {
            obj = new PinterestJsonArray(jsonelement.getAsJsonArray());
        } else
        if (jsonelement.isJsonObject())
        {
            obj = new PinterestJsonObject(jsonelement.getAsJsonObject());
        } else
        if (obj instanceof JsonPrimitive)
        {
            obj = jsonelement.getAsString();
        } else
        {
            obj = null;
        }
        return obj;
    }

    public final double a(String s, double d1)
    {
        if (a == null || a.get(s) == null || !a.get(s).isJsonPrimitive())
        {
            return d1;
        }
        double d2;
        try
        {
            d2 = a.get(s).getAsDouble();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return d1;
        }
        return d2;
    }

    public final int a(String s, int i)
    {
        if (a == null || a.get(s) == null || !a.get(s).isJsonPrimitive())
        {
            return i;
        }
        int j;
        try
        {
            j = a.get(s).getAsInt();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return i;
        }
        return j;
    }

    public final long a(String s, long l)
    {
        if (a == null || a.get(s) == null || !a.get(s).isJsonPrimitive())
        {
            return l;
        }
        long l1;
        try
        {
            l1 = a.get(s).getAsLong();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return l;
        }
        return l1;
    }

    public final Boolean a(String s)
    {
        return a(s, Boolean.valueOf(false));
    }

    public final Boolean a(String s, Boolean boolean1)
    {
        if (a == null || a.get(s) == null || !a.get(s).isJsonPrimitive())
        {
            return boolean1;
        }
        boolean flag;
        try
        {
            flag = a.get(s).getAsBoolean();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return boolean1;
        }
        return Boolean.valueOf(flag);
    }

    public final Object a(Class class1)
    {
        return c.fromJson(a, class1);
    }

    public final String a(String s, String s1)
    {
        if (a == null || a.get(s) == null)
        {
            return s1;
        }
        try
        {
            s = a.get(s).getAsString();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return s1;
        }
        return s;
    }

    public final HashMap a()
    {
        return a(((Function) (new _cls1())));
    }

    public final HashMap a(Function function)
    {
        Object obj = a.entrySet();
        HashMap hashmap = new HashMap(((Set) (obj)).size());
        java.util.Map.Entry entry;
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); hashmap.put(entry.getKey(), function.apply(entry.getValue())))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        }

        return hashmap;
    }

    public final void a(String s, PinterestJsonArray pinterestjsonarray)
    {
        a.add(s, pinterestjsonarray.a);
    }

    public final void a(String s, PinterestJsonObject pinterestjsonobject)
    {
        a.add(s, pinterestjsonobject.a);
    }

    public final void a(String s, Number number)
    {
        a.addProperty(s, number);
    }

    public final double b(String s)
    {
        return a(s, (0.0D / 0.0D));
    }

    public final HashMap b()
    {
        return a(new _cls2());
    }

    public final void b(String s, Boolean boolean1)
    {
        a.addProperty(s, boolean1);
    }

    public final void b(String s, String s1)
    {
        a.addProperty(s, s1);
    }

    public final int c()
    {
        return a.entrySet().size();
    }

    public final PinterestJsonObject c(String s)
    {
        if (a != null)
        {
            s = a.get(s);
            if (s != null && s.isJsonObject())
            {
                return new PinterestJsonObject((JsonObject)s);
            }
        }
        return null;
    }

    public final PinterestJsonArray d(String s)
    {
        if (a == null || a.get(s) == null || !a.get(s).isJsonArray())
        {
            return null;
        } else
        {
            return new PinterestJsonArray(a.getAsJsonArray(s));
        }
    }

    public final Set d()
    {
        HashSet hashset = new HashSet();
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); hashset.add(((java.util.Map.Entry)iterator.next()).getKey())) { }
        return hashset;
    }

    public final PinterestJsonArray e(String s)
    {
        if (a == null || a.get(s) == null || !a.get(s).isJsonArray())
        {
            return new PinterestJsonArray();
        } else
        {
            return new PinterestJsonArray(a.getAsJsonArray(s));
        }
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof PinterestJsonObject) && ((PinterestJsonObject)obj).a.equals(a);
    }

    public final boolean f(String s)
    {
        return a.has(s);
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public String toString()
    {
        return a.toString();
    }

    static 
    {
        b = new PinterestExclusionStrategy();
        c = (new GsonBuilder()).addDeserializationExclusionStrategy(b).addSerializationExclusionStrategy(b).registerTypeAdapter(java/util/Date, new PinterestDateTypeAdapter()).registerTypeAdapter(java/lang/String, new PinterestStringTypeAdapter()).create();
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}

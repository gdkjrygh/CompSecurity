// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.gson:
//            JsonElement, JsonNull

public final class JsonArray extends JsonElement
    implements Iterable
{

    private final List a = new ArrayList();

    public JsonArray()
    {
    }

    public int a()
    {
        return a.size();
    }

    public void a(JsonElement jsonelement)
    {
        Object obj = jsonelement;
        if (jsonelement == null)
        {
            obj = JsonNull.a;
        }
        a.add(obj);
    }

    public Number b()
    {
        if (a.size() == 1)
        {
            return ((JsonElement)a.get(0)).b();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public String c()
    {
        if (a.size() == 1)
        {
            return ((JsonElement)a.get(0)).c();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public double d()
    {
        if (a.size() == 1)
        {
            return ((JsonElement)a.get(0)).d();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public long e()
    {
        if (a.size() == 1)
        {
            return ((JsonElement)a.get(0)).e();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof JsonArray) && ((JsonArray)obj).a.equals(a);
    }

    public int f()
    {
        if (a.size() == 1)
        {
            return ((JsonElement)a.get(0)).f();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public boolean g()
    {
        if (a.size() == 1)
        {
            return ((JsonElement)a.get(0)).g();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public Iterator iterator()
    {
        return a.iterator();
    }
}

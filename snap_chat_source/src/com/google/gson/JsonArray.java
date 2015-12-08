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

    public final void add(JsonElement jsonelement)
    {
        Object obj = jsonelement;
        if (jsonelement == null)
        {
            obj = JsonNull.INSTANCE;
        }
        a.add(obj);
    }

    public final boolean equals(Object obj)
    {
        return obj == this || (obj instanceof JsonArray) && ((JsonArray)obj).a.equals(a);
    }

    public final boolean getAsBoolean()
    {
        if (a.size() == 1)
        {
            return ((JsonElement)a.get(0)).getAsBoolean();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final double getAsDouble()
    {
        if (a.size() == 1)
        {
            return ((JsonElement)a.get(0)).getAsDouble();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final int getAsInt()
    {
        if (a.size() == 1)
        {
            return ((JsonElement)a.get(0)).getAsInt();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final long getAsLong()
    {
        if (a.size() == 1)
        {
            return ((JsonElement)a.get(0)).getAsLong();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final Number getAsNumber()
    {
        if (a.size() == 1)
        {
            return ((JsonElement)a.get(0)).getAsNumber();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final String getAsString()
    {
        if (a.size() == 1)
        {
            return ((JsonElement)a.get(0)).getAsString();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final Iterator iterator()
    {
        return a.iterator();
    }

    public final int size()
    {
        return a.size();
    }
}

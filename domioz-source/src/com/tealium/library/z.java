// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;

final class z extends JSONArray
{

    public z()
    {
    }

    public z(Object obj)
    {
        if (obj == null || !obj.getClass().isArray())
        {
            throw new IllegalArgumentException("array must be a non-null primative array.");
        }
        for (int i = 0; i < Array.getLength(obj); i++)
        {
            a(Array.get(obj, i));
        }

    }

    public z(Collection collection)
    {
        if (collection == null)
        {
            throw new IllegalArgumentException("copyFrom may not be null.");
        }
        for (collection = collection.iterator(); collection.hasNext(); a(collection.next())) { }
    }

    public z(JSONArray jsonarray)
    {
        if (jsonarray == null)
        {
            throw new IllegalArgumentException("array may not be null.");
        }
        int i = 0;
        do
        {
            try
            {
                if (i >= jsonarray.length())
                {
                    break;
                }
                a(jsonarray.get(i));
            }
            // Misplaced declaration of an exception variable
            catch (JSONArray jsonarray)
            {
                throw new RuntimeException(jsonarray);
            }
            i++;
        } while (true);
    }

    private z a(int i, Object obj)
    {
        try
        {
            super.put(i, c.a.a(obj));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        return this;
    }

    private z a(Object obj)
    {
        super.put(c.a.a(obj));
        return this;
    }

    public final z a()
    {
        int i = 0;
        do
        {
            try
            {
                if (i >= length())
                {
                    break;
                }
                Object obj = get(i);
                if (!(obj instanceof String))
                {
                    super.put(i, obj.toString());
                }
            }
            catch (JSONException jsonexception)
            {
                throw new RuntimeException(jsonexception);
            }
            i++;
        } while (true);
        return this;
    }

    public final Object get(int i)
    {
        Object obj;
        try
        {
            obj = super.get(i);
        }
        catch (JSONException jsonexception)
        {
            return null;
        }
        return obj;
    }

    public final JSONArray put(int i, Object obj)
    {
        return a(i, obj);
    }

    public final JSONArray put(Object obj)
    {
        return a(obj);
    }
}

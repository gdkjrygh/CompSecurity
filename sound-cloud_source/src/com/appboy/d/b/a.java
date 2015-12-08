// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.d.b;

import bo.app.eq;
import com.appboy.d;
import com.appboy.d.e;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
    implements e
{

    private static final String b;
    public JSONObject a;

    public a()
    {
        a = new JSONObject();
    }

    public a(JSONObject jsonobject)
    {
        Iterator iterator;
        a = new JSONObject();
        a = jsonobject;
        iterator = jsonobject.keys();
_L2:
        String s;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_120;
        }
        s = (String)iterator.next();
        if (!a(s))
        {
            a.remove(s);
            continue; /* Loop/switch isn't completed */
        }
        if (jsonobject.get(s) instanceof String)
        {
            if (!b(jsonobject.getString(s)))
            {
                a.remove(s);
            }
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            if (jsonobject.get(s) == JSONObject.NULL)
            {
                a.remove(s);
            }
        }
        catch (JSONException jsonexception) { }
        continue; /* Loop/switch isn't completed */
        return;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static boolean a(String s)
    {
        while (eq.c(s) || s.startsWith("$")) 
        {
            return false;
        }
        return true;
    }

    private static boolean b(String s)
    {
        return !eq.c(s);
    }

    public final a a(String s, String s1)
    {
        if (!a(s) || !b(s1))
        {
            return this;
        }
        try
        {
            a.put(com.appboy.f.e.e(s), com.appboy.f.e.e(s1));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return this;
        }
        return this;
    }

    public final volatile Object forJsonPut()
    {
        return a;
    }

    static 
    {
        b = String.format("%s.%s", new Object[] {
            d.a, com/appboy/d/b/a.getName()
        });
    }
}

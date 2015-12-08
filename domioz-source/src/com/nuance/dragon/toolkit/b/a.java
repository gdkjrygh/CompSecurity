// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.b;

import com.nuance.dragon.toolkit.d.e;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class a
    implements com.nuance.dragon.toolkit.d.a, Serializable
{

    private short a;

    a(short word0)
    {
        a = word0;
    }

    static short a(a a1)
    {
        return a1.a;
    }

    protected abstract String a(String s);

    public final short a()
    {
        return a;
    }

    protected abstract void a(JSONObject jsonobject);

    public final JSONObject c()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            a(jsonobject);
            jsonobject.put("type", a);
        }
        catch (JSONException jsonexception)
        {
            e.a(this, "Error adding to JSON", jsonexception);
            return jsonobject;
        }
        return jsonobject;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (a)obj;
            if (a != ((a) (obj)).a)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return a + 31;
    }

    public final String toString()
    {
        return a("");
    }
}

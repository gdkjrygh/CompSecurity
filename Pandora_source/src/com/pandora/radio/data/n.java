// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class n
{

    private final String a;
    private final p.cx.x.a b;
    private final p.cx.x.b c;
    private final long d;

    public n(String s, p.cx.x.a a1, p.cx.x.b b1, long l)
    {
        a = s;
        b = a1;
        c = b1;
        d = l;
    }

    public n(JSONObject jsonobject)
        throws JSONException, IllegalArgumentException
    {
        a = jsonobject.getString("notificationId");
        b = p.cx.x.a.valueOf(jsonobject.getString("action"));
        String s = jsonobject.optString("from");
        if (!TextUtils.isEmpty(s))
        {
            c = p.cx.x.b.valueOf(s);
        } else
        {
            c = p.cx.x.b.a;
        }
        d = jsonobject.getLong("timestamp");
    }

    public String a()
    {
        return a;
    }

    public p.cx.x.a b()
    {
        return b;
    }

    public p.cx.x.b c()
    {
        return c;
    }

    public JSONObject d()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("notificationId", a);
            jsonobject.put("action", b.name());
            jsonobject.put("from", c.name());
            jsonobject.put("timestamp", d);
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
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
            obj = (n)obj;
            if (b != ((n) (obj)).b)
            {
                return false;
            }
            if (c != ((n) (obj)).c)
            {
                return false;
            }
            if (a == null)
            {
                if (((n) (obj)).a != null)
                {
                    return false;
                }
            } else
            if (!a.equals(((n) (obj)).a))
            {
                return false;
            }
            if (d != ((n) (obj)).d)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.hashCode();
        }
        if (c == null)
        {
            j = 0;
        } else
        {
            j = c.hashCode();
        }
        if (a != null)
        {
            k = a.hashCode();
        }
        return ((j + (i + 31) * 31) * 31 + k) * 31 + (int)(d ^ d >>> 32);
    }
}

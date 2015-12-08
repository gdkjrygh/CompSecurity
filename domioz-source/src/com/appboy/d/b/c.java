// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.d.b;

import a.a.bv;
import a.a.dm;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appboy.d.b:
//            b

public final class c
    implements com.appboy.d.c
{

    private final String a;
    private final String b;
    private final boolean c;
    private final b d;
    private final bv e;

    public c(String s, String s1, boolean flag, b b1, bv bv1)
    {
        if (dm.c(s))
        {
            throw new IllegalArgumentException("Message cannot be null or blank");
        } else
        {
            a = s;
            b = s1;
            c = flag;
            d = b1;
            e = bv1;
            return;
        }
    }

    public final Object a()
    {
        return b();
    }

    public final JSONObject b()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("message", dm.a(a));
            jsonobject.put("reply_to", b);
            jsonobject.put("is_bug", c);
            if (e != null)
            {
                jsonobject.put("device", e.b());
            }
            if (d != null)
            {
                jsonobject.put("environment", d.a());
            }
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            return jsonobject;
        }
        return jsonobject;
    }
}

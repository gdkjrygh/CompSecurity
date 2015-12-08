// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.d.b;

import bo.app.cu;
import bo.app.eq;
import com.appboy.d;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appboy.d.b:
//            c

public final class e
    implements com.appboy.d.e
{

    private static final String a;
    private final String b;
    private final String c;
    private final boolean d;
    private final c e;
    private final cu f;

    public e(String s, String s1, boolean flag, c c1, cu cu1)
    {
        if (eq.c(s))
        {
            throw new IllegalArgumentException("Message cannot be null or blank");
        } else
        {
            b = s;
            c = s1;
            d = flag;
            e = c1;
            f = cu1;
            return;
        }
    }

    public final JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("message", eq.a(b));
            jsonobject.put("reply_to", c);
            jsonobject.put("is_bug", d);
            if (f != null)
            {
                jsonobject.put("device", f.a());
            }
            if (e != null)
            {
                jsonobject.put("environment", e.a());
            }
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        return jsonobject;
    }

    public final Object forJsonPut()
    {
        return a();
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            d.a, com/appboy/d/b/e.getName()
        });
    }
}

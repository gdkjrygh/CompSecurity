// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.b;

import com.roidapp.baselib.c.n;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.cloudlib.sns.b:
//            v, x

public class p
    implements v
{

    public String a;
    public x b;
    public long c;

    public p()
    {
    }

    public final void a(JSONObject jsonobject, boolean flag)
    {
        jsonobject = jsonobject.optJSONObject("data");
        if (jsonobject != null)
        {
            a = jsonobject.optString("token");
            c = n.a(jsonobject, "ttl");
            b = x.a(jsonobject.optJSONObject("info"), null, flag);
        }
    }
}

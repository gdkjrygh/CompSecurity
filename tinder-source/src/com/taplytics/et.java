// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            ci, hq, cp, es

final class et
    implements Runnable
{

    final JSONObject a;
    final JSONObject b;
    final es c;

    et(es es, JSONObject jsonobject, JSONObject jsonobject1)
    {
        c = es;
        a = jsonobject;
        b = jsonobject1;
        super();
    }

    public final void run()
    {
        ci ci1 = ci.b();
        Object obj = a.optString("experiment_id");
        String s = b.optString("name");
        HashMap hashmap = new HashMap();
        hashmap.put("exp", obj);
        obj = new hq();
        ((hq) (obj)).a(new cp(ci1, s));
        ci.b().a(hashmap, ((hq) (obj)));
    }
}

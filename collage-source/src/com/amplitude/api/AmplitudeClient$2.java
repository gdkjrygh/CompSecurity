// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amplitude.api;

import org.json.JSONObject;

// Referenced classes of package com.amplitude.api:
//            c

class e
    implements Runnable
{

    final String a;
    final JSONObject b;
    final JSONObject c;
    final long d;
    final boolean e;
    final c f;

    public void run()
    {
        f.b(a, b, c, d, e);
    }

    (c c1, String s, JSONObject jsonobject, JSONObject jsonobject1, long l, boolean flag)
    {
        f = c1;
        a = s;
        b = jsonobject;
        c = jsonobject1;
        d = l;
        e = flag;
        super();
    }
}

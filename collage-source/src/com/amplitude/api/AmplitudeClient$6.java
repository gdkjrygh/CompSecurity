// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amplitude.api;

import com.squareup.okhttp.OkHttpClient;
import org.json.JSONArray;

// Referenced classes of package com.amplitude.api:
//            c

class b
    implements Runnable
{

    final JSONArray a;
    final long b;
    final c c;

    public void run()
    {
        c.a(new OkHttpClient(), a.toString(), b);
    }

    (c c1, JSONArray jsonarray, long l)
    {
        c = c1;
        a = jsonarray;
        b = l;
        super();
    }
}

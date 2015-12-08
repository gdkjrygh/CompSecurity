// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            gt, ry

final class gu
    implements Runnable
{

    final String a;
    final String b;
    final int c;
    final int d;
    final boolean e = false;
    final gt f;

    gu(gt gt1, String s, String s1, int i, int j)
    {
        f = gt1;
        a = s;
        b = s1;
        c = i;
        d = j;
        super();
    }

    public final void run()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event", "precacheProgress");
        hashmap.put("src", a);
        hashmap.put("cachedSrc", b);
        hashmap.put("bytesLoaded", Integer.toString(c));
        hashmap.put("totalBytes", Integer.toString(d));
        String s;
        if (e)
        {
            s = "1";
        } else
        {
            s = "0";
        }
        hashmap.put("cacheReady", s);
        f.a.a("onPrecacheEvent", hashmap);
    }
}

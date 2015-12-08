// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            gt, ry

final class gv
    implements Runnable
{

    final String a;
    final String b;
    final int c;
    final gt d;

    gv(gt gt1, String s, String s1, int i)
    {
        d = gt1;
        a = s;
        b = s1;
        c = i;
        super();
    }

    public final void run()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event", "precacheComplete");
        hashmap.put("src", a);
        hashmap.put("cachedSrc", b);
        hashmap.put("totalBytes", Integer.toString(c));
        d.a.a("onPrecacheEvent", hashmap);
    }
}

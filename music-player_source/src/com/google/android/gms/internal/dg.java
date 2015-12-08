// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            ab, cd, em, dj, 
//            eo, w, ek

final class dg
    implements Runnable
{

    final Context a;
    final cd b;
    final dj c;
    final String d;

    dg(Context context, cd cd1, dj dj1, String s)
    {
        a = context;
        b = cd1;
        c = dj1;
        d = s;
        super();
    }

    public final void run()
    {
        em em1 = em.a(a, new ab(), false, false, null, b.l);
        em1.setWillNotDraw(true);
        c.a(em1);
        eo eo1 = em1.e();
        eo1.a("/invalidRequest", c.a);
        eo1.a("/loadAdURL", c.b);
        eo1.a("/log", w.f);
        ek.a("Getting the ad request URL.");
        em1.loadDataWithBaseURL("http://googleads.g.doubleclick.net", (new StringBuilder("<!DOCTYPE html><html><head><script src=\"http://googleads.g.doubleclick.net/mads/static/sdk/native/sdk-core-v40.js\"></script><script>AFMA_buildAdURL(")).append(d).append(");</script></head><body></body></html>").toString(), "text/html", "UTF-8", null);
    }
}

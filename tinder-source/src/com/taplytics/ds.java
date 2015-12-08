// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import com.android.volley.VolleyError;

// Referenced classes of package com.taplytics:
//            gs, el, dp

final class ds
    implements com.android.volley.i.a
{

    final String a;
    final el b;
    final dp c;

    ds(dp dp, String s, el el1)
    {
        c = dp;
        a = s;
        b = el1;
        super();
    }

    public final void a(VolleyError volleyerror)
    {
        gs.a(a, "Posting GCM Token", volleyerror);
        b.a(volleyerror);
    }
}

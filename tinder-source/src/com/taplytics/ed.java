// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import com.android.volley.VolleyError;

// Referenced classes of package com.taplytics:
//            gs, el, eb

final class ed
    implements com.android.volley.i.a
{

    final String a;
    final el b;
    final eb c;

    ed(eb eb, String s, el el1)
    {
        c = eb;
        a = s;
        b = el1;
        super();
    }

    public final void a(VolleyError volleyerror)
    {
        gs.a(a, "Posting App Icon", volleyerror);
        if (b != null)
        {
            b.a(volleyerror);
        }
    }
}

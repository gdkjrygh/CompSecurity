// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import com.android.volley.VolleyError;

// Referenced classes of package com.taplytics:
//            gs, ek, ee

final class eg
    implements com.android.volley.i.a
{

    final String a;
    final ek b;
    final ee c;

    eg(ee ee, String s, ek ek1)
    {
        c = ee;
        a = s;
        b = ek1;
        super();
    }

    public final void a(VolleyError volleyerror)
    {
        gs.a(a, "Getting Properties From Server", volleyerror);
        if (b != null)
        {
            b.a(volleyerror);
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import com.android.volley.VolleyError;

// Referenced classes of package com.taplytics:
//            el, eh

final class ej
    implements com.android.volley.i.a
{

    final el a;
    final eh b;

    ej(eh eh, el el1)
    {
        b = eh;
        a = el1;
        super();
    }

    public final void a(VolleyError volleyerror)
    {
        if (a != null)
        {
            a.a(volleyerror);
        }
    }
}

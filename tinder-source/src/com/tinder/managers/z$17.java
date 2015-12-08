// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.android.volley.VolleyError;
import com.tinder.e.g;
import com.tinder.utils.v;

// Referenced classes of package com.tinder.managers:
//            z

final class a
    implements com.android.volley.
{

    final g a;
    final z b;

    public final void a(VolleyError volleyerror)
    {
        a.c(0);
        v.a("Failed to load common connections", volleyerror);
    }

    Error(z z1, g g1)
    {
        b = z1;
        a = g1;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.android.volley.VolleyError;
import com.tinder.e.ar;
import com.tinder.utils.v;

// Referenced classes of package com.tinder.managers:
//            d

public final class a
    implements com.android.volley.
{

    final ar a;
    final d b;

    public final void a(VolleyError volleyerror)
    {
        v.b((new StringBuilder()).append(volleyerror.getMessage()).append(", ").append(volleyerror).toString());
        a.b();
    }

    public Error(d d1, ar ar1)
    {
        b = d1;
        a = ar1;
        super();
    }
}

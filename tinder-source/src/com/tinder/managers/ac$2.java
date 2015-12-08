// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.android.volley.VolleyError;
import com.tinder.e.af;
import com.tinder.utils.v;

// Referenced classes of package com.tinder.managers:
//            ac

public final class a
    implements com.android.volley.
{

    final af a;
    final ac b;

    public final void a(VolleyError volleyerror)
    {
        v.b(String.valueOf(volleyerror));
        a.f();
    }

    public Error(ac ac1, af af1)
    {
        b = ac1;
        a = af1;
        super();
    }
}

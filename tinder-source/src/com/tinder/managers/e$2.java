// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.android.volley.VolleyError;
import com.tinder.e.ab;

// Referenced classes of package com.tinder.managers:
//            e

public final class a
    implements com.android.volley.
{

    final ab a;
    final e b;

    public final void a(VolleyError volleyerror)
    {
        e.f = false;
        e.a(b);
        a.onProfileLoadFailed();
    }

    public yError(e e1, ab ab1)
    {
        b = e1;
        a = ab1;
        super();
    }
}

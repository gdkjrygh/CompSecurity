// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.a.a.a.a.g;
import com.android.volley.VolleyError;
import com.tinder.e.am;

// Referenced classes of package com.tinder.managers:
//            aa

final class b
    implements com.android.volley.
{

    final am a;
    final g b;
    final aa c;

    public final void a(VolleyError volleyerror)
    {
        a.a(b.a, volleyerror.getMessage());
    }

    Error(aa aa1, am am1, g g1)
    {
        c = aa1;
        a = am1;
        b = g1;
        super();
    }
}

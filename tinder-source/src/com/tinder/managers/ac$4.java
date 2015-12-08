// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.android.volley.VolleyError;
import com.tinder.e.c;
import com.tinder.model.Match;
import com.tinder.utils.v;

// Referenced classes of package com.tinder.managers:
//            ac

public final class b
    implements com.android.volley.
{

    final c a;
    final Match b;
    final ac c;

    public final void a(VolleyError volleyerror)
    {
        v.b(String.valueOf(volleyerror));
        a.c();
    }

    public Error(ac ac1, c c1, Match match)
    {
        c = ac1;
        a = c1;
        b = match;
        super();
    }
}

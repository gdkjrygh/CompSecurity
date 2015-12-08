// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.android.volley.VolleyError;
import com.tinder.e.c;
import com.tinder.model.Match;

// Referenced classes of package com.tinder.managers:
//            i

public final class c
    implements com.android.volley.
{

    final String a;
    final c b;
    final Match c;
    final i d;

    public final void a(VolleyError volleyerror)
    {
        b.b();
    }

    public yError(i j, String s, c c1, Match match)
    {
        d = j;
        a = s;
        b = c1;
        c = match;
        super();
    }
}

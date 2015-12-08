// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import android.content.SharedPreferences;
import b.a.a.a.a.f.c;
import b.a.a.a.a.f.d;
import b.a.a.a.a.g.m;
import b.a.a.a.a.g.t;

// Referenced classes of package com.a.a.c:
//            g

final class l
    implements b.a.a.a.a.g.q.b
{

    final g a;

    l(g g)
    {
        a = g;
        super();
    }

    public final Object a(t t1)
    {
        boolean flag = false;
        if (t1.d.a)
        {
            if (!(new d(a)).a().getBoolean("always_send_reports_opt_in", false))
            {
                flag = true;
            }
            return Boolean.valueOf(flag);
        } else
        {
            return Boolean.valueOf(false);
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import a.a.a.a.a.f.c;
import a.a.a.a.a.f.d;
import a.a.a.a.a.g.s;
import a.a.a.a.a.g.v;
import android.content.SharedPreferences;

// Referenced classes of package com.b.a.c:
//            h

final class m
    implements s
{

    final h a;

    m(h h)
    {
        a = h;
        super();
    }

    public final Object a(v v1)
    {
        boolean flag = false;
        if (v1.d.a)
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

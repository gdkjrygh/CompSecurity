// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.content.SharedPreferences;
import b.a.a.a.a.f.b;
import b.a.a.a.a.f.c;
import b.a.a.a.a.g.s;
import b.a.a.a.a.g.v;

// Referenced classes of package com.a.a:
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
            if (!(new c(a)).a().getBoolean("always_send_reports_opt_in", false))
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

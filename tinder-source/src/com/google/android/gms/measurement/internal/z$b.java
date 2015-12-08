// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.internal.ef;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            z

public final class <init>
{

    final String a;
    final String b;
    final String c;
    final long d;
    final z e;

    final void a()
    {
        e.e();
        long l = e.h().a();
        android.content.edPreferences.Editor editor = z.a(e).edit();
        editor.remove(b);
        editor.remove(c);
        editor.putLong(a, l);
        editor.apply();
    }

    final long b()
    {
        return z.b(e).getLong(a, 0L);
    }

    private (z z1, String s, long l)
    {
        e = z1;
        super();
        u.a(s);
        boolean flag;
        if (l > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u.b(flag);
        a = (new StringBuilder()).append(s).append(":start").toString();
        b = (new StringBuilder()).append(s).append(":count").toString();
        c = (new StringBuilder()).append(s).append(":value").toString();
        d = l;
    }

    d(z z1, String s, long l, byte byte0)
    {
        this(z1, s, l);
    }
}

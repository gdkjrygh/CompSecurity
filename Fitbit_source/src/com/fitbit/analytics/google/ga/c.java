// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.analytics.google.ga;

import android.text.TextUtils;
import com.google.android.gms.analytics.e;
import com.google.android.gms.analytics.g;

// Referenced classes of package com.fitbit.analytics.google.ga:
//            d, b

public final class c
    implements d
{

    private final g a;
    private final com.google.android.gms.analytics.c b;
    private String c;

    public c(b b1, int i)
    {
        if (TextUtils.isEmpty(b1.d()))
        {
            c = "";
        } else
        {
            c = b1.d();
        }
        b = com.google.android.gms.analytics.c.a(b1.a());
        a = b.a(i);
        a(b1);
        a.e(true);
        b.d().a(1);
    }

    public void a()
    {
        b.e();
    }

    public void a(b b1)
    {
        a.a("&uid", b1.b());
    }

    public void a(String s)
    {
        s = (new StringBuilder()).append(c).append(s).toString();
        a.b(s);
        a.a((new com.google.android.gms.analytics.d.a()).a());
    }

    public void a(String s, String s1, long l)
    {
        s1 = (new StringBuilder()).append(c).append(s1).toString();
        a.a((new com.google.android.gms.analytics.d.h(s, s1, l)).a());
    }

    public void a(String s, String s1, String s2, int i)
    {
        s = (new StringBuilder()).append(c).append(s).toString();
        a.a((new com.google.android.gms.analytics.d.b()).a(s).b(s1).c(s2).a(i).a());
    }

    public void b(String s)
    {
        a(s, null, null, 0);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.internal.js;
import com.google.android.gms.internal.zzof;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            r, o, t

public class y extends r
{

    private final js a = new js();

    y(t t)
    {
        super(t);
    }

    protected void a()
    {
        r().a().a(a);
        b();
    }

    public void b()
    {
        Object obj = v();
        String s = ((o) (obj)).c();
        if (s != null)
        {
            a.a(s);
        }
        obj = ((o) (obj)).b();
        if (obj != null)
        {
            a.b(((String) (obj)));
        }
    }

    public js c()
    {
        D();
        return a;
    }
}

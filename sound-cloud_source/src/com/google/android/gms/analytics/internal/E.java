// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.b.aj;
import com.google.android.gms.b.an;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            t, s, v, m

public final class E extends t
{

    private final an a = new an();

    E(v v1)
    {
        super(v1);
    }

    protected final void a()
    {
        super.i.b().a().a(a);
        Object obj = super.i.e();
        String s1 = ((m) (obj)).c();
        if (s1 != null)
        {
            a.a = s1;
        }
        obj = ((m) (obj)).b();
        if (obj != null)
        {
            a.b = ((String) (obj));
        }
    }

    public final an b()
    {
        o();
        return a;
    }
}

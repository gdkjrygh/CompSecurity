// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.internal.je;
import com.google.android.gms.internal.jh;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            q, n, s

public final class x extends q
{

    private final jh a = new jh();

    x(s s)
    {
        super(s);
    }

    protected final void a()
    {
        p().a().a(a);
        Object obj = t();
        String s = ((n) (obj)).c();
        if (s != null)
        {
            a.a(s);
        }
        obj = ((n) (obj)).b();
        if (obj != null)
        {
            a.b(((String) (obj)));
        }
    }

    public final jh b()
    {
        B();
        return a;
    }
}

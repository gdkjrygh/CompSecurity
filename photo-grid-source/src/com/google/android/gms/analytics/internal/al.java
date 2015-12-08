// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.c.f;
import com.google.android.gms.internal.wu;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            y, r, aa

public final class al extends y
{

    private final wu a = new wu();

    al(aa aa)
    {
        super(aa);
    }

    protected final void a()
    {
        p().a().a(a);
        Object obj = t();
        String s = ((r) (obj)).c();
        if (s != null)
        {
            a.a(s);
        }
        obj = ((r) (obj)).b();
        if (obj != null)
        {
            a.b(((String) (obj)));
        }
    }

    public final wu b()
    {
        B();
        return a;
    }
}
